package Lista03;

import java.util.Scanner;

public class ListaRepeticao {

    //ex01
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

    /*
     * Ex 02
     * 
     * 
     *     public static void main(String[] args) {
        
     
   Scanner ler = new Scanner(System.in);
int num,i, cont=0, cont2=0;

for( i = 0; i<10;i++){
  System.out.println("Digite o "+(i+1)+"° número: ");
  num=ler.nextInt();

  if(num%2 ==0){
      
    cont++;

  }else{
  
    cont2++;

  }

}

System.out.println("Total de números pares: "+ cont );
System.out.println("Total de números pares: "+ cont2 );
    }




    //Ex03


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

//Ex04
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
    

  //Ex 05


   public static void main(String[] args) {
        

     Scanner ler = new Scanner(System.in);

     int soma=0, num;

     do{

        System.out.println("Digite um número: ");
        num = ler.nextInt();

     if(num > 0){
        soma= soma+num;
     }

     }while(num!=0);

     System.out.println("A soma dos números positivos é:"+soma);
     






    }

    //Ex06

     public static void main(String[] args) {
      
        Scanner ler = new Scanner(System.in);

        double media; int soma=0, num,i=0;

        do{
   
           System.out.println("Digite um número: ");
           num = ler.nextInt();
   


        if(num > 0 && num %3 == 0){
            i++;
           soma= soma+num;
        }
   
        }while(num!=0);
   
      media=(soma/i);

        System.out.println("A média de todos os números múltiplos de 3 é:"+media);




    }
     * 
     */
    
}
