package atividadeH04;

public class TesteFarmacia {
    public static void main(String[] args) {

        Medicamento m = new Medicamento(1,"Lozartana", 50,20.00,"AMS");
        Medicamento m2 = new Medicamento(2,"Alegra", 40,50.00,"Medley");
        Perfumaria p = new Perfumaria(3,"Planalto",50,60.00,"natura");

        Perfumaria p2 = new Perfumaria(4,"Zaraaa",300,80.00,"natura");

   m.visualizar();
   m2.visualizar();
   p.visualizar();
   p2.visualizar();
    }
}
