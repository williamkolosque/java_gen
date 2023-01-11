package Lista02;

import java.util.Scanner;

public class Ex03 {
    
    public static void main(String[] args) {
     
        Scanner teclado = new Scanner(System.in);

     int num; double quant;

     System.out.println("Escolha o número do seu pedido: ");
     num = teclado.nextInt();

     switch(num){
     
        case 1: 
        System.out.println("Cachorro quente, valor R$10,00");
        System.out.println("Quantidade?");
        quant=teclado.nextInt();
        
        System.out.println("Produto: Cachorro quente \4n Valor Total: R$"+quant*10);
        break;
         case 2:
         System.out.println("X-Salada, valor R$15,00");
         System.out.println("Quantidade?");
        quant=teclado.nextInt();
        
        System.out.println("Produto: X-Salada \n Valor Total: R$"+quant*15);
         break;
         case 3:
         System.out.println("X-Bacon, valor R$18,00");
         System.out.println("Quantidade?");
        quant=teclado.nextInt();
        System.out.println("Produto: X-Bacon \n Valor Total: R$"+quant*18);
         
         break;

         case 4:
         System.out.println("Bauru, valor R$12,00");
         System.out.println("Quantidade?");
        quant=teclado.nextInt();
        System.out.println("Produto: Bauru \n Valor Total: R$"+quant*12);
         
         break;
         case 5:
         System.out.println("Refrigerante, valor R$8,00");
         System.out.println("Quantidade?");
        quant=teclado.nextInt();
        System.out.println("Produto: Cachorro quente \n Valor Total: R$"+quant*10);
         
         break;
         case 6:
         System.out.println("Suco de laranja, valor R$13,00");
         System.out.println("Quantidade?");
        quant=teclado.nextInt();
        System.out.println("Produto: Cachorro quente \n Valor Total: R$"+quant*10);
         
         break;



     }



    }
}