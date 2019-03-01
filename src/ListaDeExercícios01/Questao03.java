package ListaDeExercícios01;

import java.util.Scanner;

public class Questao03 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double largura, comprimento, area;
        System.out.println("DIGITE A LARGURA EM METROS:");
        largura = sc.nextDouble();
        System.out.println("DIGITE O COMPRIMENTO EM METROS");
        comprimento = sc.nextDouble();
        area = largura * comprimento;
        System.out.println("O VALOR DA ÁREA É: "+ area);
    }
}
