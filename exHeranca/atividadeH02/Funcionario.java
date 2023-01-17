package atividadeH02;

public class Funcionario {
    protected int id;
    protected String nome;
    protected String funcao;

    public Funcionario(int id, String nome, String funcao) {
        this.id = id;
        this.nome = nome;
        this.funcao = funcao;
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

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public void visualizar() {

        System.out.println("\n**************************************************************");
        System.out.println("                    Listagem de Funcionarios                    ");
        System.out.println("****************************************************************");


    }
}
