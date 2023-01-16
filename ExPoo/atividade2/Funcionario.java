package atividade2;

public class Funcionario {

    private int id;
    private String nome;
    private int idade;
    private String funcao;
    private double salario;

    public Funcionario(int id, String nome, int idade, String funcao, double salario) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.funcao = funcao;
        this.salario = salario;
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

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void visualizar(){

        System.out.println(id);
        System.out.println(nome);
        System.out.println(idade);
        System.out.println(funcao);
        System.out.println("R$"+salario);
    }
}
