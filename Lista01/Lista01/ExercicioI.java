package Lista01;

import java.util.Scanner;

public class ExercicioI {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        float salario, abono, soma;
        System.out.println("Digite o salario:");
        salario=teclado.nextFloat();

        System.out.println("Digite o abono: ");
        abono=teclado.nextFloat();

       soma = salario + abono;
       
       System.out.println("Salario novo: "+soma);





    }
}
