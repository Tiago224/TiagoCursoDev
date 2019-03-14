package ProjetoPOO;

public class ProjetoPraia {
    public static void main(String [] args){
        crianca c1 = new crianca();

        c1.altura= 1.6;
        c1.corCabelo = "preto";
        c1.corPele = " Branca";
        c1.idade = 10;

        c1.brincar();
        c1.correr(3);
        System.out.println(c1.sorrir());



        System.out.println();



        crianca c2 = new crianca();

        c2.altura= 2.0;
        c2.corCabelo = "loiro";
        c2.corPele = " negro";
        c2.idade = 15;

        c1.brincar();
        c1.correr(1.5);
        System.out.println(c2.sorrir());

    }
}
