package Lista01;
import java.util.Scanner;

public class ExercicioII {
    
public static void main(String[] args) {
    
Scanner teclado = new Scanner(System.in);

float nota1, nota2, nota3, nota4, media; 

System.out.println("digite a nota1: ");
nota1=teclado.nextFloat();

System.out.println("digite a nota2: ");
nota2=teclado.nextFloat();

System.out.println("digite a nota3: ");
nota3=teclado.nextFloat();

System.out.println("digite a nota4: ");
nota4=teclado.nextFloat();


media = (nota1+nota2+nota3+nota4)/4;

System.out.printf("Media final: %.1f", media );


}



}