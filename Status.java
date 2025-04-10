public class Status {
    private int fome;
    private int felicidade;
    private int energia;
    private int idade;
    private boolean saude;
    private int higiene;
    private boolean socializacao;

    // Construtor
    public Status() {
        this.fome = 50;
        this.felicidade = 50;
        this.energia = 50;
        this.idade = 0;
        this.saude = true;
        this.higiene = 50;
        this.socializacao = true;
    }

    // Métodos para acessar e modificar o status
    public int getFome() {
        return fome;
    }

    public void setFome(int fome) {
        this.fome = fome;
    }

    public int getFelicidade() {
        return felicidade;
    }

    public void setFelicidade(int felicidade) {
        this.felicidade = felicidade;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public boolean isSaude() {
        return saude;
    }

    public void setSaude(boolean saude) {
        this.saude = saude;
    }

    public int getHigiene() {
        return higiene;
    }

    public void setHigiene(int higiene) {
        this.higiene = higiene;
    }

    public boolean isSocializacao() {
        return socializacao;
    }

    public void setSocializacao(boolean socializacao) {
        this.socializacao = socializacao;
    }

    // Método para exibir o status
    public void mostrarStatus() {
        System.out.println("Fome: " + fome);
        System.out.println("Felicidade: " + felicidade);
        System.out.println("Energia: " + energia);
        System.out.println("Idade: " + idade);
        System.out.println("Saúde: " + (saude ? "Boa" : "Ruim"));
        System.out.println("Higiene: " + higiene);
        System.out.println("Socialização: " + (socializacao ? "Boa" : "Ruim"));
    }
}