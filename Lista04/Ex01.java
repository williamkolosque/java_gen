package Lista04;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        int contagem[] = {2,5,1,3,4,9,7,8,10,6};
         int cont1, cont2, copia;
         
         for(cont1=0; cont1 < 9; cont1++){
         
          for(cont2=0; cont2 < 9 - cont1; cont2++){
if(contagem[cont2] > contagem[cont2+1]){

copia = contagem[cont2];
contagem[cont2] = contagem[cont2+1];
contagem[cont2+1] = copia;


}

          }

         }
System.out.println("Saída: ");
for(int i = 0; i < 10; i++){

    System.out.print(contagem[9-i]+" | ");

}
      
      }
    
}
