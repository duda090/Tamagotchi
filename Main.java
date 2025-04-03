public class Main {
    public static void main(String[] args) {
        Tamagotchi tamagotchi = new Tamagotchi();

        // Exibe o status inicial
        System.out.println("Status inicial do Tamagotchi:");
        tamagotchi.verificarStatus();

        // Interação com o Tamagotchi
        tamagotchi.alimentar();
        tamagotchi.brincar();
        tamagotchi.dormir();
        tamagotchi.envelhecer();

        // Evento aleatório (simulando eventos no jogo)
        tamagotchi.eventoAleatorio();

        // Mini-jogo
        tamagotchi.miniJogo();

        // Verificando o status do Tamagotchi após interações
        System.out.println("\nStatus final do Tamagotchi após as interações:");
        tamagotchi.verificarStatus();
    }
}
