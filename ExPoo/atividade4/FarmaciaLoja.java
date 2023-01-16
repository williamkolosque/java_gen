package atividade4;

public class FarmaciaLoja {
    public static void main(String[] args) {

        Farmacia farmacia = new Farmacia(1,"Lozartana", "Madley",142024,20.00);
        Farmacia farmacia2 = new Farmacia(2,"Paracetamol", "OMS",132024,15.00);

        farmacia.visualizar();
        farmacia2.visualizar();

    }
}
