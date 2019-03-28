package ProjetoClinica;

import java.util.Scanner;

public class Clinica {

    static void cadastrar(Paciente p)
    {
        Scanner sc = new Scanner( System.in);
        System.out.println(" Entre com o nome do paciente ");
        p.nomeCompleto = sc.next();
        System.out.print(" Entre com CPF:");
        p.CPF = sc.next();
        System.out.println(" Entre com o sexo:");
        p.sexo = sc.next();
        System.out.println("\n");
        System.out.println(" Preencha as informações de Endereço ");
        System.out.print(" Rua: ");
        p.rua = sc.next();
        System.out.print(" Bairro: ");
        p.bairro = sc.next();
        System.out.println("\n");
        System.out.print(" Cidade: ");
        p.cidade = sc.next();
        System.out.print(" Estado: ");
        p.estado = sc.next();
        System.out.println("\n");






        //return 0;
    }

    public static void main( String [] args){

        String nome,CNPJ;
        String rua, bairro, cidade, estado, numero;
        Paciente p01 = new Paciente();
        Medico m01 = new Medico();
        cadastrar(p01);

        //Será que o professor vai xingar por causa disso?
        // São atributos da Clinica, aqueles era atributos do paciente e do medico
        // mas deixa assim, esta dando certo mesmo
        // Deu certo também, mas ai objeto fica local, mas acho que não tem problema
        // kkk, diga , não pode
        // exatamente
        // ele vai ter que aceitar assim
        // eu que pago aquele
        // beleza

    }


}
