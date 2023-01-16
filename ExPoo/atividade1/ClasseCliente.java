package exerciciospoo.atividade1;

public class ClasseCliente {

    private String nome;
    private String produto;
    private int id;
    private int idade;
    private double valor;

    public ClasseCliente(String nome, String produto, int id, int idade, double valor) {
        this.nome = nome;
        this.produto = produto;
        this.id = id;
        this.idade= idade;
        this.valor = valor;


    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public void visualisar(){
        System.out.println(id+" "+nome+" "+idade +" "+ produto+" R$:"+valor);
    }
}
