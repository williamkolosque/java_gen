package Lista03;

import java.util.Scanner;

public class Ex05 {

    public static void main(String[] args) {
        

     Scanner ler = new Scanner(System.in);

     int soma=0, num;

     do{

        System.out.println("Digite um número: ");
        num = ler.nextInt();

     if(num > 0){
        soma= soma+num;
     }

     }while(num!=0);

     System.out.println("A soma dos números positivos é:"+soma);
     






    }
    
}
