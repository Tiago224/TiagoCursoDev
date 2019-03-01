package ListaDeExercícios03;

import java.util.Scanner;

public class Questao03 {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int idade;

        System.out.println(" Entre com sua idade");
        idade = sc.nextInt();

        if(idade<=10){
            System.out.println(" Categoria: INFANTIL");
        }else if(idade<=17){
            System.out.println(" Categoria: JUVENIL");
        }else{
            System.out.println(" Categoria: SENIOR");
        }


    }
}
