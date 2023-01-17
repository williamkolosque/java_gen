package atividadeH03;

public class Console extends Produto{

    protected String fabricante;
    protected boolean portatil;

    public Console(int id, String nome, int ano, String fabricante, boolean portatil) {
        super(id, nome, ano);
        this.fabricante = fabricante;
        this.portatil = portatil;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public boolean isPortatil() {
        return portatil;
    }

    public void setPortatil(boolean portatil) {
        this.portatil = portatil;
    }

    @Override
    public void visualizar() {
        super.visualizar();
        System.out.println("\n**************************************************************");
        System.out.println("                    Listagem de Consoles                        ");
        System.out.println("****************************************************************");
        System.out.println("Nome: "+this.getNome()+"\n"+"Id: "+this.getId()+"\n Ano: "+this.getAno()+"\n Portatil: "+this.isPortatil()+
                "\n Fabricante: "+this.getFabricante());

    }
}
