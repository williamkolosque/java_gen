package atividade4;

public class Farmacia {

    private int id;
    private String nome;
    private String laboratorio;
    private int validade;
    private double valor;

    public Farmacia(int id, String nome, String laboratorio, int validade, double valor) {
        this.id = id;
        this.nome = nome;
        this.laboratorio = laboratorio;
        this.validade = validade;
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

    public String getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(String laboratorio) {
        this.laboratorio = laboratorio;
    }

    public int getValidade() {
        return validade;
    }

    public void setValidade(int validade) {
        this.validade = validade;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void visualizar(){

        System.out.println(id);
        System.out.println(nome);
        System.out.println(laboratorio);
        System.out.println(validade);
        System.out.println("R$"+valor);

    }
}
