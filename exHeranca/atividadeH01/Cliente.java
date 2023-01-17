package atividadeH01;

public class Cliente {

    private int id;
    private String nome;

    public Cliente(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void visualizar() {

        System.out.println("\n\n************************************************************");
        System.out.println("                       Listagem de Clientes                      ");
        System.out.println("****************************************************************");


    }
}
