import greenfoot.*;  // Importa as classes principais do Greenfoot

/**
 * Classe Bac representa as bactérias inimigas que perseguem o jogador.
 * Elas causam perda de vida ao encostar no jogador.
 */
public class Bac extends Actor
{
    /**
     * Método chamado continuamente durante o jogo.
     * Define o comportamento da bactéria a cada frame.
     */
    public void act()
    {
        seguirJogador(); // Move a bactéria em direção ao jogador
        Colisao();       // Verifica se colidiu com o jogador
    }

    /**
     * Faz a bactéria perseguir o jogador.
     */
    public void seguirJogador()
    {
        // Obtém o objeto jogador (classe Kid) presente no mundo
        Kid jogador = (Kid)getWorld().getObjects(Kid.class).get(0);
        
        // Faz a bactéria virar na direção do jogador
        turnTowards(jogador.getX(), jogador.getY());
        
        //Seta velocidade na Bacteria
        move(2);
    }

    /**
     * 
     * 
     */
    public void Colisao()
    {
        if (isTouching(Kid.class)) {
            // Informa ao mundo que o jogador perdeu uma vida
            ((MyWorld)getWorld()).perderVida();
            
            // Teleporta a bactéria para uma nova posição aleatória
            setLocation(Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));
        }
    }
}
