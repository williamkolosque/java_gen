package atividadeH03;

public class Jogos extends Produto{


    private String tipo;
    private String plataforma;

    public Jogos(int id, String nome, int ano, String tipo, String plataforma) {
        super(id, nome, ano);
        this.tipo = tipo;
        this.plataforma = plataforma;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    @Override
    public void visualizar() {
        super.visualizar();
        System.out.println("\n**************************************************************");
        System.out.println("                    Listagem de Games                           ");
        System.out.println("****************************************************************");
        System.out.println("Nome: "+this.getNome()+"\n"+"Id: "+this.getId()+"\n Ano: "+this.getAno()+"\n Tipo: "+this.getTipo()+
                "\n Plataforma: "+this.getPlataforma());

    }
}
