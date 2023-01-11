package Lista02;

import java.util.Scanner;

public class Ex05 {
    
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
    
    double salario, imposto;

    System.out.println("Digite o salário: ");
    salario=teclado.nextDouble();

    

    if(salario < 2000){

        System.out.println("Isento");

    }else if(salario > 2000.01 && salario < 3000){
      System.out.println("Imposto: 8%");
      imposto = 0.08 * salario;

      System.out.printf("Imposto de renda: R$ %.2f",imposto);
      

    }else if(salario > 3000.01 && salario < 4500){
        System.out.println("Imposto: 18%");

        imposto = 0.18*salario;

        System.out.printf("Imposto de renda: R$ %.2f",imposto);
        
  
      }else if(salario >= 4500){
        System.out.println("Imposto: 28%");

   
  
         System.out.println("Imposto de renda: R$ "+ 0.28 * salario);
        
  
      }


        
    }


}
