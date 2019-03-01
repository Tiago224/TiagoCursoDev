package ListaDeExercícios02;

import java.util.Scanner;

public class Questao02 {
    public static void main( String [] args){
        Scanner sc = new Scanner(System.in);
        double comprimento, largura, preço, valortotal;

        System.out.println( " Entre com o comprimento da sala");
        comprimento = sc.nextDouble();

        System.out.println(" Entre com a largura da sala");
        largura = sc.nextDouble();

        System.out.println(" Entre com o preço do carpete em R$ ");
        preço= sc.nextDouble();

        valortotal = preço * ( largura*comprimento);

        System.out.println(" O custo total para forrar a sala é "+ valortotal);


    }
}
