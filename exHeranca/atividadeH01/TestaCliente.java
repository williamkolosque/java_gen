package atividadeH01;

public class TestaCliente {

    public static void main(String[] args) {

        PessoaFisica pf = new PessoaFisica(1,"Andre luiz",332748232,02141326);
        PessoaFisica pf2 = new PessoaFisica(2,"Fabio",2137414522,331543245);

        pf.visualizar();
        pf2.visualizar();

        PessoaJuridica pj = new PessoaJuridica(3,"Marcio","Marcio bate martelo",255546888);
        PessoaJuridica pj2 = new PessoaJuridica(4,"Caio","Caio rolando da rocha Alpinista",445522886);
        pj.visualizar();
        pj2.visualizar();
    }
}
