package atividadeH01;

public class PessoaFisica extends Cliente{

    private int telefone;
    private int cpf;

    public PessoaFisica(int id, String nome, int telefone, int cpf) {
        super(id, nome);
        this.telefone = telefone;
        this.cpf = cpf;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    @Override
    public void visualizar() {
          super.visualizar();
        System.out.println("\n");
        System.out.println("                       Listagem de Pessoas Fisica               ");
        System.out.println("****************************************************************");
        System.out.println("id: "+this.getId());
        System.out.println("Nome: "+this.getNome());
        System.out.println("Telefone: "+this.getTelefone());
        System.out.println("CPF: "+this.getCpf());

    }
}
