package ListaDeExercícios01;

import java.util.Scanner;

public class Questao04 {
    public static void main( String [] args){
        Scanner dado = new Scanner(System.in);
        double salario,reajuste, novosal;

        System.out.println(" Entre com o salario");
        salario = dado.nextDouble();

        System.out.println( "  Entre com o percentual de reajuste? \n Instruções: O percentual " +
                "de reajuste deve ser um valor entre representativo entre 0-1. \n" +
                "Por exemplo: 0,05 = 5%/ 0,15 = 15% / 1 = 100% ");
        reajuste = dado.nextDouble();

        novosal = salario + ( salario*reajuste );

        System.out.println(" O salario reajustado é :"+novosal);


    }
}
