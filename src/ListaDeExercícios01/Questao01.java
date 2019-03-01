package ListaDeExercícios01;

import java.util.Scanner;

public class Questao01 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        double numero;
        System.out.println("INFORME UM NUMERO REAL");
        numero = sc.nextDouble();
        System.out.println("O DOBRO DO VALOR: "+(numero * 2));
    }
}
