package ProjetoPessoa;

public class Pessoa {
    String nome;
    String cpf;

    public Pessoa() {
        System.out.println(" Iniciando...");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
