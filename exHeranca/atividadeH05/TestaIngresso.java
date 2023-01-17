package atividadeH05;

public class TestaIngresso {
    public static void main(String[] args) {

        Vip vp = new Vip(1,"Foofighters","25/12/2023",3000,"Purina");

        Vip vp2 = new Vip(3,"Molejo","05/05/2023",3000,"Havaianas");

        MeiaEntrada meia = new MeiaEntrada(1, "Foofighters","25/12/2023",true,3000);

        MeiaEntrada meia2 = new MeiaEntrada(2, "veraloca","24/03/2023",true,3000);

        vp.visualizar();
        vp2.visualizar();
        meia.visualizar();
        meia2.visualizar();
    }
}
