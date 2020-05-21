package packageclass;

public class Local {
    private Seminarios[] seminarios;
    private String rua;
    private String bairro;

    public Local() {}
    public Local(String rua , String bairro , Seminarios[] seminarios) {
        this.bairro = bairro;
        this.rua = rua;
        this.seminarios = seminarios;
    }

    public void immprime() {
        if(this.seminarios != null) {
            System.out.println("Seminarios do Lugar: "+this.seminarios);
        }
        else {
            System.out.println("O lugar nao possui seminarios");
        }
        System.out.println("Bairro: "+this.bairro);
        System.out.println("Rua: "+this.rua);
    }

    public Seminarios[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminarios... seminarios) {
        this.seminarios = seminarios;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
}
