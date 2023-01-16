package atividade5;

public class Ingresso {

    private int id;
    private String show;
    private String local;
    private int quantidade;
    private boolean meia;
    private double valor;


    public Ingresso(int id, String show, String local, int quantidade, boolean meia, double valor) {
        this.id = id;
        this.show = show;
        this.local = local;
        this.quantidade = quantidade;
        this.meia = meia;
        this.valor = valor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getShow() {
        return show;
    }

    public void setShow(String show) {
        this.show = show;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public boolean isMeia() {
        return meia;
    }

    public void setMeia(boolean meia) {
        this.meia = meia;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void visualizar(){

        System.out.println(id);
        System.out.println(show);
        System.out.println(local);
        System.out.println(quantidade);
        System.out.println(meia);
        System.out.println("R$"+valor);

    }
}
