import greenfoot.*;  // Importa as classes base do Greenfoot (World, Actor, GreenfootImage, etc.)

/**
 * Classe principal do mundo do jogo.
 * Aqui são definidos o tamanho da tela, HUD, posicionamento de objetos e regras principais.
 */
public class MyWorld extends World
{

    private int pontos = 0;
    private int vidas = 3;

    /**
     * Construtor do mundo principal.
     * Inicializa o mundo, exibe HUD, adiciona o jogador, inimigos e escovas (itens).
     */
    public MyWorld()
    {    
        // Cria um novo mundo com 1600x900 pixels (cada célula tem tamanho 1x1)
        super(1600, 900, 1); 

        // Exibe o HUD inicial com pontos e vidas
        showText("Pontos: 0", 100, 30);
        showText("Vidas: " + vidas, 800, 30);

        // Adiciona o jogador (classe Kid) na posição inicial
        addObject(new Kid(), 100, 450);

        // Adiciona múltiplos inimigos (classe Bac) em posições específicas
        addObject(new Bac(), 1400, 200);
        addObject(new Bac(), 800, 700);
        addObject(new Bac(), 1400, 600);
        addObject(new Bac(), 1400, 500);
        addObject(new Bac(), 900, 800);

        // Adiciona 20 objetos do tipo Escova em posições aleatórias
        for (int i = 0; i < 20; i++) {
            int x = Greenfoot.getRandomNumber(getWidth() - 100) + 50;
            int y = Greenfoot.getRandomNumber(getHeight() - 100) + 50;
            addObject(new Escova(), x, y);
        }
        prepare();
    }

    /**
     *
     * 
     */
    public void act()
    {
    }

    /**
     * 
     * 
     */
    public void aumentarPontos()
    {
        //Aumenta os pontos
        pontos++; 
        showText("Pontos: " + pontos, 100, 30);

        // Se o jogador atingir 20 pontos, vence o jogo
        if (pontos >= 20) {
            showText("Você escovou, muito bem!", getWidth()/2, getHeight()/2);
            Greenfoot.stop(); // Para o jogo
        }
    }

    /**
     * Método chamado quando o jogador colide com um inimigo (perde vida).
     * Atualiza o contador de vidas e verifica se perdeu o jogo.
     */
    public void perderVida()
    {
        vidas--;
        showText("Vidas: " + vidas, 800, 30);

        // Se não tiver mais vidas, o jogador perde
        if (vidas <= 0) {
            showText("Você pegou carie, Tente novamente!", getWidth()/2, getHeight()/2);
            Greenfoot.stop(); 
        }
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
    }
}
