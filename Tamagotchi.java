import java.util.Random;

public class Tamagotchi {
    private Status status;
    private Random random;

    public Tamagotchi() {
        this.status = new Status();
        this.random = new Random();
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

    // Método para verificar o status
    public void verificarStatus() {
        status.mostrarStatus();
    }

    public void eventoAleatorio() {
        int evento = random.nextInt(10);
        if (evento < 2) {
            status.setEnergia(status.getEnergia() - 5);  // Diminui energia em caso de evento negativo
            System.out.println("Um evento negativo aconteceu! O Tamagotchi perdeu energia.");
        } else if (evento < 5) {
            status.setFome(status.getFome() + 5);  // Aumenta a fome aleatoriamente
            System.out.println("O Tamagotchi ficou mais faminto.");
        }
    }
}
