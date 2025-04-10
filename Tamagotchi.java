import java.util.Random;

public class Tamagotchi {
    private int fome;
    private int felicidade;
    private int energia;
    private int idade;
    private boolean saude;
    private int higiene;
    private boolean socializacao;

    // Construtor
    public Tamagotchi() {
        this.fome = 50;
        this.felicidade = 50;
        this.energia = 50;
        this.idade = 0;  // Começando com idade 0
        this.saude = true;
        this.higiene = 50;
        this.socializacao = true;
    }

    // Métodos de interação com o Tamagotchi
    public void alimentar() {
        if (fome > 0) {
            fome -= 10;
            energia += 5;
            System.out.println("Tamagotchi alimentado!");
        }
    }

    public void brincar() {
        if (energia > 0) {
            felicidade += 10;
            energia -= 5;
            socializacao = true;
            System.out.println("Tamagotchi brincando!");
        }
    }

    public void dormir() {
        energia = 50;
        System.out.println("Tamagotchi dormindo.");
    }

    public void envelhecer() {
        idade++;
        if (idade == 2) {
            System.out.println("O Tamagotchi se tornou um adolescente!");
        } else if (idade == 4) {
            System.out.println("O Tamagotchi se tornou um adulto!");
        }

        if (idade > 5 && saude) {
            saude = false;
            System.out.println("O Tamagotchi adoeceu!");
        }
    }

    public void cuidarHigiene() {
        higiene = 100;
        System.out.println("Higiene do Tamagotchi restaurada.");
    }

    // Método para verificar o status
    public String verificarStatus() {
        // Verificando e mostrando a idade corretamente
        return "Fome: " + fome + "\n" +
                "Felicidade: " + felicidade + "\n" +
                "Energia: " + energia + "\n" +
                "Idade: " + idade + "\n" +  // A idade aqui deve aparecer corretamente
                "Saúde: " + (saude ? "Boa" : "Ruim") + "\n" +
                "Higiene: " + higiene + "\n" +
                "Socialização: " + (socializacao ? "Boa" : "Ruim");
    }

    // Método para evento aleatório (exemplo: dia chuvoso)
    public void eventoAleatorio() {
        Random rand = new Random();
        int evento = rand.nextInt(10);

        // Se o evento for 0, um "dia chuvoso" acontece e diminui a energia
        if (evento == 0) {
            energia -= 10;
            System.out.println("Dia chuvoso! A energia do Tamagotchi diminuiu.");
        }
    }

    // Método para aumentar a idade periodicamente
    public void aumentarIdadePeriodicamente() {
        // Isso pode ser chamado em intervalos regulares para simular o envelhecimento
        envelhecer();
    }
}
