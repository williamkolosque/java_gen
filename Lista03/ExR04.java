package Lista03;

import java.util.Scanner;

public class ExR04 {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

    int idade, opt, cat, cont=0, cont2=0, cont3=0, cont4=0,sai=0;
    String sair;

    
     

      while(sai != 1){


        System.out.println(" Digite sua idade: ");
        idade = ler.nextInt();

        System.out.println("Sexo: ");
        opt = ler.nextInt();
        switch(opt){
            case 1:
            System.out.println( " 1 - Masculino");
            break;
            case 2:
            System.out.println( " 2 - Feminino");
            break;
            case 3:
            System.out.println( " 3 - Outros");
            break;
        }
        System.out.println("Categoria: ");
        cat = ler.nextInt();
        switch(cat){
            case 1:
            System.out.println( " 1 - Backend");
            break;
            case 2:
            System.out.println( " 2 - Frontend");
            break;
            case 3:
            System.out.println( " 3 - Mobile");
            break;
            case 4 :
            System.out.println(" 4 - FullStack");
            break;
        }
        

        System.out.println("Deseja continuar S para sim e N para sair:");
        sair=ler.next().toUpperCase();
        
        
        if(sair.equals("N")){
         sai=1;
        }
    



       if(cat == 1){
        cont++;
       }else if(opt == 2 && cat == 2){

        cont2++;

       }else if(opt == 1 && cat == 3 && idade > 40){

        cont3++;

       }else if(opt == 2 && cat == 4 && idade < 30){

        cont4++;

       }

      


      }

      System.out.println("Total de pessoa desenvolvedoras Backend: "+cont);
      System.out.println("Total de mulheres desenvolvedoras Frontend: "+cont2);
      System.out.println("Total de homens desenvolvedores Mobile maiores de 40 anos:  "+cont3);
      System.out.println("Total de mulheres desenvolvedoras FullStack menores de 30 anos "+cont4);
    }
    
}
