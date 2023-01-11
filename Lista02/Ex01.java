package Lista02;

import java.util.Scanner;

public class Ex01 {
    
public static void main(String[] args) {
    

    Scanner ler = new Scanner(System.in);
    int num, num2, num3, soma;

    System.out.println("Digite um número A:");
    num = ler.nextInt();

    System.out.println("Digite o número B:");
    num2= ler.nextInt();

    System.out.println("Digite o número C:");
    num3= ler.nextInt();

    soma=num + num2;

    if(soma > num3){

        System.out.println("A soma de A + B é maior que C "+ num+"+"+ num2+"="+soma+">"+num3);
    }else if(soma < num3){
        System.out.println("A soma de A + B é menor que C "+ num+"+"+ num2+"="+soma+"<"+num3);
    }else if(soma==num3){
        System.out.println("A soma de A + B é igual que C "+ num+"+"+ num2+"="+soma+"="+num3);
    }




}




}