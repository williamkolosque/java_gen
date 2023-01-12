package Lista03;

import java.util.Scanner;

public class Ex04 {
    
public static void main(String[] args) {
    
Scanner ler = new Scanner(System.in);

int idade = 1, cont = 0, cont2 = 0;

while(idade > 0){


System.out.println("Digite a idade: ");
idade = ler.nextInt();


if(idade < 21){

cont++;

}else if(idade > 50){

    cont2 ++;

}
}

System.out.println("Total de pessoas menores de 21 anos:"+(cont-1));
System.out.println("Total de pessoas maiores de 50 anos:"+cont2);


}


}
