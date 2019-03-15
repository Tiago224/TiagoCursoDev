package ProjetoPOO;

public class Planta {
    String cor;
    double tamanho;
    String tipoVegetacao;

    void florescer ( double tempo){
    for(int i = 0;i<tempo;i++){
        System.out.println("Florescendo em :"+ (tempo-i));
    }
        System.out.println(" Floresceu!");
    }

    void morrer ( double tempo ){
        for(int i = 0;i<tempo;i++){
            System.out.println("Morrendo em :"+ (tempo-i));
        }
        System.out.println(" Morreu!");
    }



    }





