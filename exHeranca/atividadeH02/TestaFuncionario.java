package atividadeH02;

public class TestaFuncionario {

    public static void main(String[] args) {

        Gerente g = new Gerente(1,"Jorge","gerente de contas",3500,3);
        Gerente g2 = new Gerente(2,"Augusto","gerente de vendas",2500,2);

        Vendedor v = new Vendedor(3,"Maria","Vendedora", 600,"Calçado");
        Vendedor v2 = new Vendedor(4,"Marcio","caixa", 200,"caixa");

       g.visualizar();
       g2.visualizar();
       v.visualizar();
       v2.visualizar();


    }
}
