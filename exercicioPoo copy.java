package exerciciospoo.atividade1;

public class TestaCliente {

    public static void main(String[] args) {


        ClasseCliente cliente = new ClasseCliente("vanderlei","pato",1,20,25.00);
        ClasseCliente cliente2 = new ClasseCliente("andre","cerveja",2,18,55.00);

        cliente.visualisar();
        cliente2.visualisar();


    }
}

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

// Atividade 02

package atividade2;

public class TestaFuncionario {
    public static void main(String[] args) {

      Funcionario funcionario = new Funcionario(1, "João",34,"Desenvolvedor", 4000);
        Funcionario funcionario2 = new Funcionario(2, "Pablo",32,"Backend", 5000);

        funcionario.visualizar();
        funcionario2.visualizar();
    }
}

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

//Atividade 03

package atividade3;

public class LojadeGames {
    public static void main(String[] args) {

        Produto produto = new Produto(1,"Super mario world","Aventura","Nintendo", 1990);
        Produto produto2 = new Produto(2,"Street Fighter","Luta","Nintendo", 1987);

        produto.visualizar();
        produto2.visualizar();
    }
}

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

//Atividade 04

package atividade4;

public class FarmaciaLoja {
    public static void main(String[] args) {

        Farmacia farmacia = new Farmacia(1,"Lozartana", "Madley",142024,20.00);
        Farmacia farmacia2 = new Farmacia(2,"Paracetamol", "OMS",132024,15.00);

        farmacia.visualizar();
        farmacia2.visualizar();

    }
}


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


//Atividade 05

package atividade5;

public class Eventos {
    public static void main(String[] args) {

        Ingresso ingresso = new Ingresso(1,"Foofighters","Lolapalooza", 10000, true, 150.00);
        Ingresso ingresso2 = new Ingresso(1,"Eric clapton","Teatro guarany", 6000, true, 50.00);

        ingresso.visualizar();
        ingresso2.visualizar();

    }
}

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

//Atividade 06

package atividade6;

public class Plataforma {

    public static void main(String[] args) {


        Curso curso = new Curso(1,"Analise e desenvolvimento de sistemas", 6, true,350.00);
        Curso curso2 = new Curso(2,"Marketing", 6, true,450.00);

        curso.visualizar();
        curso2.visualizar();
    }
}



public class Curso {

    private int id;
    private String curso;
    private int semestre;
    private boolean EAD;
    private double valor;

    public Curso(int id, String curso, int semestre, boolean EAD, double valor) {
        this.id = id;
        this.curso = curso;
        this.semestre = semestre;
        this.EAD = EAD;
        this.valor = valor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public boolean isEAD() {
        return EAD;
    }

    public void setEAD(boolean EAD) {
        this.EAD = EAD;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void visualizar(){
        System.out.println(id);
        System.out.println(curso);
        System.out.println(semestre);
        System.out.println(EAD);
        System.out.println("R$"+valor);
    }
}
