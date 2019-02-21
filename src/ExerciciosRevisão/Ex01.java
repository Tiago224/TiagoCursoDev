package ExerciciosRevisão;

import java.util.Scanner;

public class Ex01 {
    public static void main( String [] args){
        double total;
        double comissao;

        Scanner a =  new Scanner(System.in);
        System.out.println( "Entre com a comissão do Vendendor");
        total = a.nextDouble();

        comissao = total * 0.10 ;

        System.out.println( " A comissão é " + comissao);


    }
}
