package atividadeH02;

public class Gerente extends Funcionario{

    protected double salario;
    protected int agencias;

    public Gerente(int id, String nome, String funcao, double salario, int agencias) {
        super(id, nome, funcao);
        this.salario = salario;
        this.agencias = agencias;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getAgencias() {
        return agencias;
    }

    public void setAgencias(int agencias) {
        this.agencias = agencias;
    }
    @Override
    public void visualizar(){
        super.visualizar();
        System.out.println("                    Listagem de Gerentes                        ");
        System.out.println("****************************************************************");
        System.out.println("Nome: "+this.getNome()+"\n"+"Id: "+this.getId()+"\n Função: "+this.getFuncao()+"\n Salario: "+this.getSalario()+
                "\n Agengias: "+this.getAgencias());
    }
}
