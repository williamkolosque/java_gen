package Lista03;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
      
        Scanner ler = new Scanner(System.in);

        double media; int soma=0, num,i=0;

        do{
   
           System.out.println("Digite um número: ");
           num = ler.nextInt();
   


        if(num > 0 && num %3 == 0){
            i++;
           soma= soma+num;
        }
   
        }while(num!=0);
   
      media=(soma/i);

        System.out.println("A média de todos os números múltiplos de 3 é:"+media);




    }
    
}
