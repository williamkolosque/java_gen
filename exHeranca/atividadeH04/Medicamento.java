package atividadeH04;

public class Medicamento extends Farmacia {
    protected String laboratorio;

    public Medicamento(int id, String nome, int quant, double valor, String laboratorio) {
        super(id, nome, quant, valor);
        this.laboratorio = laboratorio;
    }

    public String getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(String laboratorio) {
        this.laboratorio = laboratorio;
    }

    @Override
    public void visualizar() {
        super.visualizar();
        System.out.println("\n**************************************************************");
        System.out.println("                    Listagem de Medicamentos                           ");
        System.out.println("****************************************************************");
        System.out.println("Nome: "+this.getNome()+"\n"+"Id: "+this.getId()+"\n Quantidade: "+this.getQuant()+"\n Valor: R$"+this.getValor()+
                "\n Laboratório: "+this.getLaboratorio());

    }
}
