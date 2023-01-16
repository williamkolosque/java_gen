package exerciciospoo.atividade1;

public class TestaCliente {

    public static void main(String[] args) {


        ClasseCliente cliente = new ClasseCliente("vanderlei","pato",1,20,25.00);
        ClasseCliente cliente2 = new ClasseCliente("andre","cerveja",2,18,55.00);

        cliente.visualisar();
        cliente2.visualisar();


    }
}
