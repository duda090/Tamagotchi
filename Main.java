import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Tamagotchi tamagotchi = new Tamagotchi();
        Scanner scanner = new Scanner(System.in);
        boolean rodando = true;

        while (rodando) {
            System.out.println("\nEscolha uma ação:");
            System.out.println("1 - Alimentar");
            System.out.println("2 - Brincar");
            System.out.println("3 - Dormir");
            System.out.println("4 - Verificar Status");
            System.out.println("5 - Envelhecer");
            System.out.println("6 - Cuidar da Higiene");
            System.out.println("7 - Sair");
            System.out.println("8 - Jogar Mini-Jogo");

            int escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    tamagotchi.alimentar();
                    break;
                case 2:
                    tamagotchi.brincar();
                    tamagotchi.eventoAleatorio();  // aqui sim pode acontecer algo aleatório
                    break;
                case 3:
                    tamagotchi.dormir();
                    tamagotchi.eventoAleatorio();
                    break;
                case 4:
                    tamagotchi.verificarStatus();
                    break;
                case 5:
                    tamagotchi.envelhecer();
                    tamagotchi.eventoAleatorio();
                    break;
                case 6:
                    tamagotchi.cuidarHigiene();
                    break;
                case 7:
                    rodando = false;
                    System.out.println("Saindo...");
                    break;
                case 8:
                    tamagotchi.jogarMiniJogo();
                    tamagotchi.eventoAleatorio();
                    break;
                default:
                    System.out.println("Escolha inválida.");
            }
        }

        scanner.close();
    }
}