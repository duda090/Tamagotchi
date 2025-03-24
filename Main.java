public class Main {
    public static void main(String[] args) {
        Tamagotchi tamagotchi = new Tamagotchi();

        tamagotchi.verificarStatus();
        tamagotchi.alimentar();
        tamagotchi.brincar();
        tamagotchi.dormir();
        tamagotchi.envelhecer();
        tamagotchi.verificarStatus();
    }
}
