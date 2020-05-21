package packageclass;

public class Participantes {
    private Seminarios seminarios;
    private String nome;
    private short idade;

    public Participantes () {}
    public Participantes (String nome , short idade , Seminarios seminario) {
        this.nome = nome;
        this.idade = idade;
        this.seminarios = seminario;
    }
    
    public Seminarios getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminarios seminarios) {
        this.seminarios = seminarios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public short getIdade() {
        return idade;
    }

    public void setIdade(short idade) {
        this.idade = idade;
    }
}
