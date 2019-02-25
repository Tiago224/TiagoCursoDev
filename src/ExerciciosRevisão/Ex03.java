package ExerciciosRevisão;
import java.util.Scanner;
import ExerciciosRevisão.Ex01.*;


public class Ex03 {
    static int escolha = 2;

    public static void dobro(){
        do {
            Scanner entrada = new Scanner(System.in);
            System.out.println(" Entre com o numero real a ser processado : \n");
            double numero = entrada.nextDouble();

            double resultado = numero * 2.00;
            System.out.println(" O dobro do numero " + numero + " é " + resultado);
            System.out.println( "Deseja calcular outro numero ? \n1)Sim \n2)Não \n");
            escolha = entrada.nextInt();
        }
        while (escolha == 1);


    }

    public static  void area (){
        Scanner inf = new Scanner(System.in);
        double comp, lar;
        do {
            System.out.println(" Entre com comprimento em metros: ");
            comp = inf.nextDouble();
            System.out.println(" Entre com Largura em metros: ");
            lar = inf.nextDouble();

            System.out.println(" O Area da Sala em metros é"+ comp*lar +" m² \n");

            System.out.println( "Deseja calcular outra area ? \n1)Sim \n2)Não \n");
            escolha = inf.nextInt();
        }
        while (escolha == 1);
    }

    public static void salario(){

    }





    public static void main (String [] args){
        System.out.println(" Seja Bem vindo ");
        do {
         Scanner dado = new Scanner(System.in);

         System.out.println("Este programa é um conjunto de funções que correspondem " +
                 "a lista de exercicio 01");
         System.out.println(" Escolha umas opções abaixo \n" +
                 " 1)Dobro de um numero real \n" +
                 " 2)Calculo de comissão de um vendendo \n" +
                 " 3)Calculo de Area de um sala \n" +
                 " 4)Reajuste de Salario \n" +
                 " 5)Calcular Desconto \n" +
                 " 6)Contação do dolar \n" +
                 " 7)Sair \n");
         int op = dado.nextInt();

         switch (op) {
             case 1:System.out.println("OPÇÃO SELENCIONADA: " + op);
                    dobro();
                 break;
             case 2:System.out.println("OPÇÃO SELENCIONADA: " + op);
                    Ex01.comissao();

                 break;
             case 3:

             case 4:
             case 5:
                 System.exit(0);
             default: {
                 System.out.println(" Opção Invalida!");
                 System.exit(0);
             }

         }
     }
        while(escolha == 2);
        System.exit(0);

    }
}
