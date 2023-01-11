package Lista02;

import java.util.Scanner;

public class Lista02Lacos {
    //Ex01

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

    /*
     * //Ex02
     * 
     * public class Ex02 {
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



//EX03

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



    //Ex04

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


    //Ex05

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

    //Ex06

     public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
      
        String classe, especie, tipo;

        System.out.println("Escolha a classe 'Vertebrado' ou 'Invertebrado'?");
        classe= teclado.nextLine().toUpperCase();

      

     



        if(classe.equals("VERTEBRADO")){
         
            System.out.println("Escolha a classe 'Ave' ou 'Mamifero'?");
            especie= teclado.nextLine().toUpperCase();
          
            if(especie.equals("AVE")){
                System.out.println("Escolha a classe 'Carnivoro' ou 'Onivoro'?");
                tipo= teclado.nextLine().toUpperCase();
               
                if(tipo.equals("CARNIVORO")){
                  
                    System.out.println("Águia");

                }else if(tipo.equals("ONIVORO")){
                    System.out.println("Pomba");

                }

                 

            }else if(especie.equals("MAMIFERO")){
             //mamifero


             System.out.println("Escolha a classe 'Onivoro' ou 'Herbívoro'?");
             tipo= teclado.nextLine().toUpperCase();
            
             if(tipo.equals("HERBIVORO")){
               
                 System.out.println("Vaca");

             }else if(tipo.equals("ONIVORO")){
                 System.out.println("Homem");

             }

            }





        }else if(classe.equals("INVERTEBRADO")){
            //classe

            System.out.println("Escolha a classe 'Inseto' ou 'Anelideo'?");
            especie= teclado.nextLine().toUpperCase();
          
            if(especie.equals("INSETO")){
                System.out.println("Escolha a classe 'Hematófago' ou 'Herbivoro'?");
                tipo= teclado.nextLine().toUpperCase();
               
                if(tipo.equals("HEMATOFAGO")){
                  
                    System.out.println("Pulga");

                }else if(tipo.equals("HERBIVORO")){
                    System.out.println("Lagarta");

                }
                 

            }else if(especie.equals("ANELIDEO")){
             


             System.out.println("Escolha a classe 'Hematófago' ou 'Onívoro'?");
             tipo= teclado.nextLine().toUpperCase();
            
             if(tipo .equals("HEMATOFAGO")){
               
                 System.out.println("SANGUESSUGA");

             }else if(tipo.equals("ONIVORO")){
                 System.out.println("Minhoca");

             }

            }




        }

      


        
    }

     * 
     * 
     */
    
}
