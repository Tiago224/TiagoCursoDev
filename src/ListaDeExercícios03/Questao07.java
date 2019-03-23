package ListaDeExercícios03;

import java.util.Scanner;

public class Questao07 {
    public static void main ( String [] args){
        Scanner dado = new Scanner(System.in);
        char info;

        System.out.println(" Entre com a letra que corresponde a seu estado civil: \nS,C,D ou V \n");
        info = dado.next().charAt(0);

        
        
        switch(info){
            case 'S':
                System.out.println("Solteiro");
            case 'C':
                System.out.println("Casado");
            case 'D':
                System.out.println("Divorciado");
            case 'V':
                System.out.println("Viuvo");
            default:
                System.out.println(" Opção Invalida");
        }
    }
}
