package ListaDeExercícios03;

import java.util.Scanner;

public class Questao01 {
    public static void main( String [] args){
        Scanner sc = new Scanner(System.in);
        double total;
        int numerodefolhas;

        System.out.println(" Entre com a quantidade de copias ");
        numerodefolhas = sc.nextInt();

        if(numerodefolhas>100){
            total = numerodefolhas*0.20;
        }
        else{
            total= numerodefolhas*0.25;
        }

        System.out.println(" O valor total a ser pago é "+ total);

    }
}
