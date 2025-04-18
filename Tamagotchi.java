import java.util.Random;
import java.util.Scanner;

public class Tamagotchi {
    private Status status;
    private Random random;
    private Scanner scanner;

    public Tamagotchi() {
        this.status = new Status();
        this.random = new Random();
        this.scanner = new Scanner(System.in);
    }

    public void alimentar() {
        if (status.getFome() > 0) {
            status.setFome(status.getFome() - 10);
            status.setEnergia(status.getEnergia() + 5);
            System.out.println("Tamagotchi alimentado!");
        }
    }

    public void brincar() {
        if (status.getEnergia() > 0) {
            status.setFelicidade(status.getFelicidade() + 10);
            status.setEnergia(status.getEnergia() - 5);
            status.setSocializacao(true);
            System.out.println("Tamagotchi brincando!");
        }
    }

    public void dormir() {
        status.setEnergia(50);
        System.out.println("Tamagotchi dormindo.");
    }

    public void envelhecer() {
        int anosParaEnvelhecer = 1; // ou você pode passar esse valor como parâmetro futuramente

        for (int i = 1; i <= anosParaEnvelhecer; i++) {
            status.setIdade(status.getIdade() + 1);

            // Mostra a idade atual
            System.out.println("O Tamagotchi agora tem " + status.getIdade() + " ano" + (status.getIdade() > 1 ? "s" : ""));

            // Mudanças de fase
            if (status.getIdade() == 2) {
                System.out.println("O Tamagotchi se tornou um adolescente!");
            } else if (status.getIdade() == 4) {
                System.out.println("O Tamagotchi se tornou um adulto!");
            }

            // Condição de saúde
            if (status.getIdade() > 5 && status.isSaude()) {
                status.setSaude(false);
                System.out.println("O Tamagotchi adoeceu!");
            }
        }
    }



    public void cuidarHigiene() {
        status.setHigiene(100);
        System.out.println("Higiene do Tamagotchi restaurada.");
    }

    public void verificarStatus() {
        status.mostrarStatus();
    }

    public void eventoAleatorio() {
        int evento = random.nextInt(4); // Gera de 0 a 3

        switch (evento) {
            case 0:
                status.setEnergia(status.getEnergia() - 5);
                System.out.println("Um evento negativo aconteceu! O Tamagotchi perdeu energia.");
                break;
            case 1:
                status.setFome(status.getFome() + 5);
                System.out.println("O Tamagotchi ficou mais faminto.");
                break;
            case 2:
                status.setFelicidade(status.getFelicidade() - 5);
                System.out.println("O Tamagotchi ficou um pouco triste.");
                break;
            case 3:
                status.setHigiene(status.getHigiene() - 10);
                System.out.println("A higiene do Tamagotchi piorou!");
                break;
        }
    }



    // Novo método para jogar mini-jogo com melhorias
    public void jogarMiniJogo() {
        // Definindo o nível de dificuldade
        System.out.println("Escolha a dificuldade do jogo:");
        System.out.println("1 - Fácil");
        System.out.println("2 - Médio");
        System.out.println("3 - Difícil");
        int dificuldade = scanner.nextInt();

        int limiteTentativas;
        int intervalo;
        int numeroCorreto;

        // Ajustando a dificuldade
        if (dificuldade == 1) {
            limiteTentativas = 5;
            intervalo = 10;  // Números entre 1 e 10
        } else if (dificuldade == 2) {
            limiteTentativas = 3;
            intervalo = 50;  // Números entre 1 e 50
        } else {
            limiteTentativas = 2;
            intervalo = 100;  // Números entre 1 e 100
        }

        numeroCorreto = random.nextInt(intervalo) + 1;  // Número entre 1 e intervalo
        int tentativas = 0;
        boolean acertou = false;

        System.out.println("Você tem " + limiteTentativas + " tentativas para acertar o número entre 1 e " + intervalo);

        // Loop para o número de tentativas
        while (tentativas < limiteTentativas && !acertou) {
            System.out.print("Tentativa " + (tentativas + 1) + ": Qual número você acha que o Tamagotchi deve adivinhar? ");
            int tentativa = scanner.nextInt();
            tentativas++;

            // Verificando a tentativa
            if (tentativa == numeroCorreto) {
                acertou = true;
                System.out.println("Parabéns! O Tamagotchi acertou o número! Felicidade aumentada.");
                status.setFelicidade(status.getFelicidade() + (10 * (limiteTentativas - tentativas + 1)));  // Pontos aumentados com base nas tentativas restantes
            } else if (tentativa < numeroCorreto) {
                System.out.println("O número correto é maior. Tente novamente!");
            } else {
                System.out.println("O número correto é menor. Tente novamente!");
            }
        }

        // Caso o jogador tenha falhado
        if (!acertou) {
            System.out.println("Que pena! O Tamagotchi errou o número. O número correto era " + numeroCorreto);
            status.setFelicidade(status.getFelicidade() - 10);  // Diminui felicidade se não acertar
        }
    }
}