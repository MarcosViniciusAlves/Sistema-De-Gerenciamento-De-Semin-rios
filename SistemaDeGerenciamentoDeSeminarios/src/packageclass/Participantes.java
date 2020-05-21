package packageclass;

public class Participantes {
    private Seminarios seminarios;
    private String nome;
    private int idade;

    public Participantes () {}

    public Participantes (String nome , int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void imprime () {
        System.out.println("Nome: "+this.nome);
        System.out.println("Idade: "+this.idade);
        System.out.println("Esta participando do Seminario: "+this.seminarios.getTitulo());
    }

    public Seminarios getSeminarios() {
        return this.seminarios;
    }

    public void setSeminarios(Seminarios seminarios) {
        this.seminarios = seminarios;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(short idade) {
        this.idade = idade;
    }
}
