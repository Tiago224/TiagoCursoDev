package ExerciciosRevisão;

import java.util.Scanner;

public class Ex02 {

    public static void main(String [] agrs){
    Scanner dado = new Scanner(System.in);

    int quant_folhas;
    double total;

        System.out.println( " Entre com a quantidade de folhas ?");
        quant_folhas = dado.nextInt();

        if(quant_folhas> 100){
        total = quant_folhas*0.20;
        }else{
            total = quant_folhas*0.25;
        }

        System.out.println( "O total a ser pago é R$"+(int)total+" reais ");




    }
}
