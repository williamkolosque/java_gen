package Lista03;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        
        int num1, num2;
        System.out.println("Digite o primeiro número: ");
        num1 = ler.nextInt();

        System.out.println("Digite o segundo número: ");
        num2=ler.nextInt();

        if(num1<num2){
            if(num1>0){
            for(int i=0; i<num1; i++){

                if((3*i)==num1){

                    System.out.println(num1+" é multiplo de 5 e 3");


                }else if((5*i)==num2){

                    System.out.println(num2+" é multiplo de 5 e 3");

                }



            }

            }else{
                for(int i=0; i>num1; i--){

                    if((3*i)==num1){

                        System.out.println(num2+" é multiplo de 5 e 3");


                    }else if((5*i)==num2){

                        System.out.println(num1+" é multiplo de 5 e 3");

                    }
                }



            }


        }else{
            System.out.println("Intervalo invalido");
        }


    }



}
