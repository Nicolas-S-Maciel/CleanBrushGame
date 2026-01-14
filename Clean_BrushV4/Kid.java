import greenfoot.*;  

/**
 * Classe Kid representa o personagem controlado pelo jogador.
 * 
 */
public class Kid extends Actor
{
    /**
     * Método principal chamado continuamente durante o jogo.
     * Define o comportamento do personagem a cada frame.
     */
    public void act()
    {
        mover();           // Controla o movimento com as teclas WASD
        coletarEscova();   // Verifica e coleta escovas ao encostar nelas
    }

    /**
     * Permite que o jogador mova o personagem usando as teclas WASD.
     */
    public void mover()
    {
        //Configuração de movimentação do player
        if(Greenfoot.isKeyDown("a")) setLocation(getX() - 4, getY());

    
        if(Greenfoot.isKeyDown("d")) setLocation(getX() + 4, getY());

      
        if(Greenfoot.isKeyDown("w")) setLocation(getX(), getY() - 4);

     
        if(Greenfoot.isKeyDown("s")) setLocation(getX(), getY() + 4);
    }

    /**
     * 
     * 
     */
    public void coletarEscova()
    {
        // Se estiver tocando uma escova...
        if(isTouching(Escova.class)) {
            // Remove a escova tocada
            removeTouching(Escova.class);

            // Aumenta os pontos no mundo
            ((MyWorld)getWorld()).aumentarPontos();
        }
    }
}
