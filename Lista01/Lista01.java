import java.util.Scanner;
public class Lista01 {
 //ex01
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

//ex02
/*
 * 
 * public static void main(String[] args) {
    
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

// Ex03
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


    //ex04

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

 */


}