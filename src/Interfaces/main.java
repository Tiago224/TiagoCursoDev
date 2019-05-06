package Interfaces;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class main {
    public static void main( String [] args){
        Quadrado q = new Quadrado(10);
        System.out.println(" Area do Quadrado" + q.calcArea());
        System.out.println(" Perimetro do Quadrado" + q.calcPerimetro());

        Circulo c = new Circulo(10);
        System.out.println(" Area do Circulo" + c.calcArea());
        System.out.println(" Perimentro do Circulo" + c.calcPerimetro());

        Retangulo r = new Retangulo(10,5);
        System.out.println(" Area do Retangulo " + c.calcArea());
        System.out.println(" Perimentro do Retangulo" + c.calcPerimetro());
    }
}
