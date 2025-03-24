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
        this.idade = 0;
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
    public void verificarStatus() {
        System.out.println("Fome: " + fome);
        System.out.println("Felicidade: " + felicidade);
        System.out.println("Energia: " + energia);
        System.out.println("Idade: " + idade);
        System.out.println("Saúde: " + (saude ? "Boa" : "Ruim"));
        System.out.println("Higiene: " + higiene);
        System.out.println("Socialização: " + (socializacao ? "Boa" : "Ruim"));
    }
}
