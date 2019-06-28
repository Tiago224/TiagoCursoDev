package SamuelWorks;

public class MonteCarlo {
    public static double pi(int n){
        int acertos = 0;

        for(int i = 0; i < n; i++){
            double x = Math.random();
            double y = Math.random();

            if(x * x + y * y < 1.0){
                acertos++;
            }
        }
        return (double) (4.0 * acertos / n);
    }


    public static void main( String args []){

        for (int i = 0; i  < 10; i++ ) {
            System.out.println(pi(i));
        }
    }


}
