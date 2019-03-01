package ListaDeExercícios03;

import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int produzidas, defeituosas;
        double valor;
        System.out.println("INFORME O TOTAL DE PEÇAS PRODUZIDAS");
        produzidas = sc.nextInt();
        System.out.println("INFORME O TOTAL DE PEÇAS DEFEITUOSAS");
        defeituosas = sc.nextInt();

        valor = produzidas * 0.10;
        if(valor > defeituosas) {
            System.out.println("A MÁQUINA NÃO PRECISA DE MANUTENÇÃO!");
        }else{
            System.out.println("A MÁQUINA PRECISA DE MANUTENÇÃO!");
        }
    }
}
