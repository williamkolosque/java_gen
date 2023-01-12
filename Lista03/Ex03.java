package Lista03;

import java.util.Scanner;

public class Ex03 {

    public static void main(String[] args) {
        
     
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
/* 
while(i<10){

i++;

System.out.println("Digite o "+i+"° número: ");
   num=ler.nextInt();
   


     if(num%2 ==0){
      
       cont++;

     }else{
     
       cont2++;

     }

   }
 
   System.out.println("Total de números pares: "+ cont );
   System.out.println("Total de números pares: "+ cont2 );


   */
    }
    

