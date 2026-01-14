## <img src="https://iorcpr.com.br/wp-content/uploads/2020/09/Tooth.png" alt="logo" height="50"> Clean Brush Game
<div id="topo"></div>
### *Jogo didático em Java para conscientização de higiene bucal infantil*

---
## Navegação:
1. [Sobre](#sobre)
2. [Contextualização](#contextualização)
3. [Aplicação](#aplicação)
4. [Funcionalidades](#funcionalidades)
5. [Tecnologias e Dependências](#tecnologias-e-dependências-utilizadas)
6. [Ferramentas utilizadas](#ferramentas-utilizadas)
7. [Inicialização do projeto](#inicialização-do-projeto)
8. [Autores](#autores)
9. [Licenças e utilização](#licenças-e-utilização)
---

## Sobre:
O **"Clean Brush Game"** é uma aplicação interativa desenvolvida com o foco de promover a educação em saúde bucal para crianças. Através de um ambiente gamificado, os usuários aprendem a importância de combater as bactérias para manter dentes saudáveis. Utilizando a lógica de programação em Java, o jogo proporciona uma experiência de aprendizado lúdica e eficaz.

## Contextualização:
Este projeto foi desenvolvido como conclusão do módulo de fundamentos de programação da turma **JAVA122**. O desafio proposto foi aplicar os conhecimentos de **Programação Orientada a Objetos (POO)** para criar uma ferramenta que resolvesse um problema real. O desenvolvimento focou em competências como manipulação de vetores, lógica de colisão e gerenciamento de estados de jogo em um ambiente de produção acadêmica.

O grupo responsável pelo desenvolvimento, composto por: [devmatheuscode](https://github.com/devmatheuscode) e [Nicolas-S-Maciel](https://github.com/Nicolas-S-Maciel), buscou criar um game que fosse ao mesmo tempo educativo e performático dentro das limitações do framework.

### Surgimento da Ideia e o problema identificado
A iniciativa surgiu da necessidade de métodos alternativos para o ensino de higiene:
- Dificuldade de manter o foco das crianças em métodos tradicionais de ensino;
- Necessidade de visualizar o impacto das bactérias de forma clara;
- Escassez de softwares didáticos gratuitos e leves para escolas;
- Importância de introduzir conceitos de saúde desde a infância.

### Objetivo:
O projeto busca atender às necessidades de professores e pais, servindo como material de apoio didático. O jogo encarrega-se de simular o ataque de agentes nocivos (bactérias) ao jogador, desafiando o jogador a ser o "protetor" da saúde bucal coletando todas as escovas de dentes restantes.

---

## Aplicação

> Projeto desenvolvido no Framework Greenfoot

### Descrição:
Este repositório contém o código-fonte desenvolvido em **Java**. A aplicação representa a camada de interface e lógica de jogo (Game Logic), onde os atores interagem em tempo real. Responsável pelo gerenciamento de pontuação, detecção de colisões entre "escovas/proteção" e "bactérias", e persistência de recordes durante a sessão.

### Funcionalidades:

#### Mecânicas de Jogo:
- **Spawn de Inimigos:** Geração aleatória de bactérias com diferentes velocidades;
- **Sistema de Colisão:** Detecção precisa de toque entre objetos;
- **Controle de Vidas:** O jogador perde vidas ao ser atingido pela bactéria;
- **Reset de Fase:** Possibilidade de reiniciar a partida instantaneamente (clicando em "reset").

#### Gerenciamento de Atores:
- **Player:** Controle intuitivo via teclado;
- **Inimigos:** Comportamento automatizado de ataque;
  
#### Interface (UI):
- Contador de escovas coletadas;
- Barra de vidas restantes do Player;
- Tela de "Game Over" didática com dicas de escovação.

### Estrutura de Pastas
```text
tooth-guard-project
├── images                # Assets visuais (Bactérias, Dentes, Fundo)
├── sounds                # Efeitos sonoros e trilha sonora
├── README.md             # Documentação do projeto
├── project.greenfoot     # Arquivo principal de configuração do Greenfoot
├── Tooth.java            # Classe principal do objetivo
├── Bacteria.java         # Classe dos inimigos (IA simples)
├── Player.java           # Lógica de controle do usuário
└── MyWorld.java          # Cenário e controle de fluxo do jogo
```

### Tecnologias e Dependências utilizadas:
- Java (JDK 11 ou superior);

- Greenfoot Framework (v3.x);

- Java AWT/Swing (para processamento de cores e eventos);

### Ferramentas utilizadas:
- Greenfoot IDE;

- Git e GitHub;

- VS Code (Edição auxiliar de código);

### Inicialização do Projeto:
1. Abra o software Greenfoot;
2. Clique em Scenario -> Open...;
3. Selecione a pasta onde você clonou o projeto;
4. Clique em Run no menu inferior para iniciar a simulação;

### Autores:
Projeto realizado para a disciplina de Java:
- [Nícolas Silva Maciel](https://github.com/Nicolas-S-Maciel)
- [Matheus Sousa Avelino](https://github.com/devmatheuscode)

### Licenças e utilização:
Este projeto está licenciado sob a licença MIT. Sinta-se à vontade para utilizar para fins educativos.

---

[⬆ Voltar para o início](#topo)

