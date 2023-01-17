package atividadeH04;

public class Perfumaria extends Farmacia{

    protected String fabricante;

    public Perfumaria(int id, String nome, int quant, double valor, String fabricante) {
        super(id, nome, quant, valor);
        this.fabricante = fabricante;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    @Override
    public void visualizar() {
        super.visualizar();
        System.out.println("\n**************************************************************");
        System.out.println("                    Listagem de Perfumes                          ");
        System.out.println("****************************************************************");
        System.out.println("Nome: "+this.getNome()+"\n"+"Id: "+this.getId()+"\n Quantidade: "+this.getQuant()+"\n Valor: R$"+this.getValor()+
                "\n Laboratório: "+this.getFabricante());

    }
}
