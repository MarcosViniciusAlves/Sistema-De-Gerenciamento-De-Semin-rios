package packageclass;

public class Coordenador {
    private Seminarios[] seminarios;
    private String nome;
    private String especializacao;

    public Coordenador () {}
    public Coordenador (String nome,String especializacao,Seminarios... seminarios) {
        this.especializacao = especializacao;
        this.nome = nome;
        this.especializacao = especializacao;
    }

    public void imprime() {
    }

    public Seminarios[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminarios... seminarios) {
        this.seminarios = seminarios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecializacao() {
        return especializacao;
    }

    public void setEspecializacao(String especializacao) {
        this.especializacao = especializacao;
    }
}
