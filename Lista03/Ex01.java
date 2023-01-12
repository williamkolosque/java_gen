package Lista03;

import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args) {
        
Scanner ler = new Scanner(System.in);

        int num;

        System.out.println("Digite um número de (1 - 10)");
        num = ler.nextInt();

        if (num <= 10) {
            for (int i = 0; i <= 10; i++) {

                System.out.println(num + "x" + i + "=" + num * i);


            }
        }else{
            System.out.println("Digite um número entre 1 e 10");
        }



    }
    
}
