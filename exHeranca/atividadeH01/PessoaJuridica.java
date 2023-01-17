package atividadeH01;

public class PessoaJuridica extends Cliente{

    private String nomeComercial;
    private int cnpj;

    public PessoaJuridica(int id, String nome, String nomeComercial, int cnpj) {
        super(id, nome);
        this.nomeComercial = nomeComercial;
        this.cnpj = cnpj;
    }

    public String getNomeComercial() {
        return nomeComercial;
    }

    public void setNomeComercial(String nomeComercial) {
        this.nomeComercial = nomeComercial;
    }

    public int getCnpj() {
        return cnpj;
    }

    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public void visualizar() {
        super.visualizar();
        System.out.println("\n");
        System.out.println("                       Listagem de Pessoas Juridica             ");
        System.out.println("****************************************************************");
        System.out.println("id: "+this.getId());
        System.out.println("Nome: "+this.getNome());
        System.out.println("Nome Comercial: "+this.getNomeComercial());
        System.out.println("CNPJ: "+this.getCnpj());

    }

}
