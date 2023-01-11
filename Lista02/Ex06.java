package Lista02;

import java.util.Scanner;
import java.util.function.DoubleToIntFunction;

public class Ex06 {

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
    
}
