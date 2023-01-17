package atividadeH03;

public class Produto {
    protected int id;
    protected String nome;
    protected int ano;

    public Produto(int id, String nome, int ano) {
        this.id = id;
        this.nome = nome;
        this.ano = ano;
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

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void visualizar() {

        System.out.println("\n**************************************************************");
        System.out.println("                       Listagem de Produtos                     ");
        System.out.println("****************************************************************");


    }
}
