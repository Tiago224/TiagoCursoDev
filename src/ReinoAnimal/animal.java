package ReinoAnimal;

public class animal {
    private String nome;
    private String raca;

    public animal(){

    }

    public animal ( String nome){
    this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String caminha(  ){
        String caminha = " Caminhando...";
        return caminha;
    }

}


