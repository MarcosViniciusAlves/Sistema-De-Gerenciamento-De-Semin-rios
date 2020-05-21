package packageclass;

import com.sun.xml.internal.ws.wsdl.writer.document.Part;

public class Seminarios {
    private Participantes[] participantes;
    private Coordenador coordenador;
    private Local local;
    private String titulo;

    public Seminarios () {}
    public Seminarios (Participantes[] participantes , Coordenador coordenador , Local local , String titulo) {
        this.participantes = participantes;
        this.coordenador = coordenador;
        this.local = local;
        this.titulo = titulo;
    }

    public void imprimir() {

        if (this.participantes != null) {
            System.out.print("Os Participantes do seminario sao:");
            for (Participantes participante : this.participantes) {
                System.out.print(" " + participante + ", ");
            }
        }

        else {
            System.out.println("Nao se tem participantes no seminario");
        }

        if (this.coordenador != null) {
            System.out.println("Coordenador: " + this.coordenador);
        }

        else {
            System.out.println("Nao tem um Coordenador do seminario");
        }

        if(this.local != null){
            System.out.println("Local do Seminario: "+this.local);
        }

        else {
            System.out.println("O seminario nao possui local definido");
        }

    }

    public Participantes[] getParticipantes() {
        return participantes;
    }

    public void setParticipantes(Participantes... participantes) {
        this.participantes = participantes;
    }

    public Coordenador getCoordenador() {
        return coordenador;
    }

    public void setCoordenador(Coordenador coordenador) {
        this.coordenador = coordenador;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
