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

            int escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    tamagotchi.alimentar();
                    break;
                case 2:
                    tamagotchi.brincar();
                    break;
                case 3:
                    tamagotchi.dormir();
                    break;
                case 4:
                    tamagotchi.verificarStatus();
                    break;
                case 5:
                    tamagotchi.envelhecer();
                    break;
                case 6:
                    tamagotchi.cuidarHigiene();
                    break;
                case 7:
                    rodando = false;
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Escolha inválida.");
            }

            tamagotchi.eventoAleatorio();  // Gerar evento aleatório
        }

        scanner.close();
    }
}