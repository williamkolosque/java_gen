package Lista02;

import java.util.Scanner;

public class Ex02 {
public static void main(String[] args) {
    


    int num;
    Scanner ler = new Scanner(System.in);

    System.out.println("Digite um número: ");
    num=ler.nextInt();

    if(num%2==0 && num > 0){
        System.out.println("O número "+num+" é par e positivo");
    }
    else if(num%2==0 && num < 0){
        System.out.println("O número "+num+" é par e negativo");
    }
   else if (num%2==1){
        System.out.println("O número "+num+" é impar e positivo");
    }
   else  {
        System.out.println("O número " + num + " é impar e negativo");
    }



}
}
