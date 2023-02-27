package Lista04;

import java.util.Scanner;

public class Ex02 {
    
    public static void main(String[] args) {
        
    int numeros[];
    numeros = new int[10];
    int num, cont=0;
    double media;

    Scanner ler = new Scanner(System.in);

    for(int i=0; i<10; i++) {
     
        System.out.println("Digite os números: ");
        num = ler.nextInt();

         numeros[i]=num;

         

    }
System.out.println("Elementos nos indices ímpares:");
for(int j=0; j<10; j++){

    if(j%2==1){

System.out.print(numeros[j]+"|");
    } 

}
System.out.println("Elementos pares");
for(int k=0; k<10; k++){
    if(numeros[k]%2==0){

        
        System.out.print(numeros[k]+"|");
        
            }
cont=cont+numeros[k];

}
media = cont/10;
System.out.println("\n Soma: "+cont);
System.out.println(" Média: "+media);

    }
    
}
