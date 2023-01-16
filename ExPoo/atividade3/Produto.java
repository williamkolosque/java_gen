package atividade3;

public class Produto {

    private int id;
    private String nome;
    private String genero;
    private String plataforma;
    private int ano;

    public Produto(int id, String nome, String genero, String plataforma, int ano) {
        this.id = id;
        this.nome = nome;
        this.genero = genero;
        this.plataforma = plataforma;
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

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    public void visualizar(){
        System.out.println(id);
        System.out.println(nome);
        System.out.println(genero);
        System.out.println(plataforma);
        System.out.println(ano);
    }
}
