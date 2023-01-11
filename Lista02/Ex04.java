package Lista02;

import java.util.Scanner;

public class Ex04 {
    
public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    int num;

    System.out.println("Digite a idade: ");
    num=teclado.nextInt();



    if(num < 18 && num >= 16 ){
      
        System.out.println("A pessoa está apta a votar e o voto é facultativo");



    }else if( num >= 18 && num < 65){
        System.out.println("A pessoa está apta a votar e o voto é obrigatório");

    }else if(num >= 65){

     System.out.println("A pessoa está apta a votar e o voto é facultativo");

    }else if(num < 16){

        System.out.println("A pessoa não está apta a votar");
    }

    
}


}
