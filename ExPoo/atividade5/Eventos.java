package atividade5;

public class Eventos {
    public static void main(String[] args) {

        Ingresso ingresso = new Ingresso(1,"Foofighters","Lolapalooza", 10000, true, 150.00);
        Ingresso ingresso2 = new Ingresso(1,"Eric clapton","Teatro guarany", 6000, true, 50.00);

        ingresso.visualizar();
        ingresso2.visualizar();

    }
}
