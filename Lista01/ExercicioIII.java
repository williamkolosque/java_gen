package Lista01;
import java.util.Scanner;

public class ExercicioIII {
    
    public static void main(String[] args) {
        
   Scanner teclado = new Scanner(System.in);

   float salario, addNoturno, horasExtras, descontos, salarioLiquido;

   System.out.println("Digite o salário Bruto: ");
   salario=teclado.nextFloat();

   System.out.println("Digite o adicional noturno: ");
   addNoturno = teclado.nextFloat();

   System.out.println("Digite as horas extras: ");
   horasExtras = teclado.nextFloat();

   System.out.println("Digite os descontos: ");
   descontos=teclado.nextFloat();

   salarioLiquido = salario+addNoturno+(horasExtras*5) - descontos;

   System.out.println("Salário liquido: R$"+salarioLiquido);
   


    }


}