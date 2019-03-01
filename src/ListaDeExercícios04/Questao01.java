package ListaDeExercícios04;

import java.util.Scanner;

public class Questao01 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double notas[] = new double[4];
        double media, soma = 0.0;
        for(int i=0; i < notas.length; i++){
            System.out.println("DIGITE A "+(i+1)+"º NOTA: ");
            notas[i] = sc.nextDouble();
            soma = soma + notas[i];
        }
        media = (soma / 4);
        for(int i=0; i < notas.length; i++){
            System.out.println(i+"º NOTA: "+notas[i]);
        }
        System.out.println("A MÉDIA É: "+ media);
        }
}
