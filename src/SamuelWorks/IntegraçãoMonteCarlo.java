package SamuelWorks;

public class IntegraçãoMonteCarlo {

    public static double f( double x){
        return Math.cos(x);
    }

    public static double IntegraçãoMonteCarlof(double a, double b, long iterations){
        double sum = 0, x = 0;

        if(a>b){
        return IntegraçãoMonteCarlof(b,a,iterations);
        }

        for(long i = 1; i<= iterations ; i++){
            x = Math.random();
            sum = sum + f(a + ((b - a) * x));
            }
        sum = ((b-a)/iterations)*sum;

    return sum;
    }

     public static void main( String ars [] ){
     System.out.println("O valor estimado é aproximadamente " + IntegraçãoMonteCarlof(0,1,1000000000));
     }
}
