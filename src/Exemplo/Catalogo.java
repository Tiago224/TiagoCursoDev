package Exemplo;

public class Catalogo {
    public static void main( String [] args){
        /* Estrutura de seleção */
        int a = 10, b = 90, c = -100;
        if( a > 0) {
          a = c;
        }
        System.out.println(a);

        if( c> a){
            c = a;
        }else {
            c = b;
        }

        System.out.println(c);

    }
}
