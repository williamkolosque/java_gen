package atividade6;

public class Plataforma {

    public static void main(String[] args) {


        Curso curso = new Curso(1,"Analise e desenvolvimento de sistemas", 6, true,350.00);
        Curso curso2 = new Curso(2,"Marketing", 6, true,450.00);

        curso.visualizar();
        curso2.visualizar();
    }
}
