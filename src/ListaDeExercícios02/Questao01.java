package ListaDeExercícios02;

import java.util.Scanner;

public class Questao01 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double distanciaP, totalComb, consumo;
        System.out.println("INFORME A DISTANCIA PERCORRIDA EM KM: ");
        distanciaP = sc.nextDouble();
        System.out.println("INFORME O TOTAL DE COMBUSTIVEL GASTO EM LITROS: ");
        totalComb = sc.nextDouble();
        consumo = distanciaP / totalComb;
        System.out.println("CONSUMO MÉDIO DO VEÍCULO: "+ consumo);
        }
}
