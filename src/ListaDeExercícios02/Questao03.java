package ListaDeExercícios02;

import java.util.Scanner;

public class Questao03 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double COMPRIMENTO, LARGURA, TOTAL;
        System.out.println("INFORME A LARGURA EM METROS: ");
        LARGURA = sc.nextDouble();
        System.out.println("DIGITE O COMPRIMENTO EM METROS: ");
        COMPRIMENTO = sc.nextDouble();
        TOTAL = COMPRIMENTO * LARGURA;
        System.out.println("A AREA EM METROS QUADRADOS É: "+TOTAL);
    }
}
