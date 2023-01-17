package atividadeH04;

public class Farmacia {

    protected int id;
    protected String nome;
    protected int quant;
    protected double valor;

    public Farmacia(int id, String nome, int quant, double valor) {
        this.id = id;
        this.nome = nome;
        this.quant = quant;
        this.valor = valor;
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

    public int getQuant() {
        return quant;
    }

    public void setQuant(int quant) {
        this.quant = quant;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void visualizar() {

        System.out.println("\n**************************************************************");
        System.out.println("                       Farmacia vai com deus                    ");
        System.out.println("****************************************************************");


    }




}
