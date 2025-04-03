import java.util.Random;

public class Tamagotchi {
    private Status status;

    // Construtor
    public Tamagotchi() {
        this.status = new Status();
    }

    // Métodos de interação com o Tamagotchi
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
        status.setIdade(status.getIdade() + 1);
        if (status.getIdade() == 2) {
            System.out.println("O Tamagotchi se tornou um adolescente!");
        } else if (status.getIdade() == 4) {
            System.out.println("O Tamagotchi se tornou um adulto!");
        }

        if (status.getIdade() > 5 && status.isSaude()) {
            status.setSaude(false);
            System.out.println("O Tamagotchi adoeceu!");
        }
    }

    public void cuidarHigiene() {
        status.setHigiene(100);
        System.out.println("Higiene do Tamagotchi restaurada.");
    }

    // Método para eventos aleatórios
    public void eventoAleatorio() {
        Random rand = new Random();
        int evento = rand.nextInt(3);

        switch (evento) {
            case 0:
                System.out.println("O Tamagotchi foi pego por uma chuva e perdeu energia.");
                status.setEnergia(status.getEnergia() - 10);
                break;
            case 1:
                System.out.println("O Tamagotchi encontrou algo divertido e ficou mais feliz.");
                status.setFelicidade(status.getFelicidade() + 10);
                break;
            case 2:
                System.out.println("O Tamagotchi não está socializando e está ficando triste.");
                status.setFelicidade(status.getFelicidade() - 5);
                break;
        }
    }

    // Método para mini-jogo simples
    public void miniJogo() {
        Random rand = new Random();
        int sorteio = rand.nextInt(2); // 0 ou 1

        if (sorteio == 0) {
            System.out.println("Você venceu o mini-jogo! A felicidade do Tamagotchi aumentou.");
            status.setFelicidade(status.getFelicidade() + 10);
        } else {
            System.out.println("Você perdeu o mini-jogo. A felicidade do Tamagotchi diminuiu.");
            status.setFelicidade(status.getFelicidade() - 5);
        }
    }

    // Método para verificar o status
    public void verificarStatus() {
        status.mostrarStatus();
    }
}
