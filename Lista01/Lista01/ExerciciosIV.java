package Lista01;
import java.util.Scanner;

public class ExerciciosIV {
    

public static void main(String[] args) {
    


Scanner teclado = new Scanner(System.in);


Float n1, n2, n3, n4, dif;


System.out.println("Digite o primeiro número: ");
n1 = teclado.nextFloat();
System.out.println("Digite o segundo número: ");
n2 = teclado.nextFloat();
System.out.println("Digite o terceiro número: ");
n3 = teclado.nextFloat();
System.out.println("Digite o quarto número: ");
n4 = teclado.nextFloat();

dif =(n1*n2)-(n3*n4); 

System.out.println("Diferença: "+dif);



}




}