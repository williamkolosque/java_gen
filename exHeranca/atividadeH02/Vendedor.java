package atividadeH02;

public class Vendedor extends Funcionario{
    protected double comicao;
    protected String setor;

    public Vendedor(int id, String nome, String funcao, double comicao, String setor) {
        super(id, nome, funcao);
        this.comicao = comicao;
        this.setor = setor;
    }

    public double getComicao() {
        return comicao;
    }

    public void setComicao(double comicao) {
        this.comicao = comicao;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    @Override
    public void visualizar(){
        super.visualizar();
        System.out.println("                    Listagem de Vendedor                        ");
        System.out.println("****************************************************************");
        System.out.println("Nome: "+this.getNome()+"\n"+"Id: "+this.getId()+"\n Função: "+this.getFuncao()+"\n Comição: "+this.getComicao()+
                "\n Setor: "+this.getSetor());
    }
}
