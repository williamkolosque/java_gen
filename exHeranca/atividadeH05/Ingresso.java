package atividadeH05;

public class Ingresso {

    protected int id;
    protected String evento;
    protected String data;

    public Ingresso(int id, String evento, String data) {
        this.id = id;
        this.evento = evento;
        this.data = data;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEvento() {
        return evento;
    }

    public void setEvento(String evento) {
        this.evento = evento;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void visualizar(){

        System.out.println("Listagem de eventos");


    }
}
