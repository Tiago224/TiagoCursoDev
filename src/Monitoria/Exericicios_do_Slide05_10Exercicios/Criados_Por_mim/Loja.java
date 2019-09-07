package Monitoria.Exericicios_do_Slide05_10Exercicios.Criados_Por_mim;


import java.util.Scanner;

public class Loja {
    public static void main( String [] args) {
        String sessão, op, op2;
        int quantidade;
        double valor,preço_total=0, preço_sessão1=0,preço_sessão2=0,preço_sessão3=0,preço_sessão4=0,porcetagem,dinheiro;
        Scanner sc = new Scanner(System.in);
        System.out.println(" Seja Bem vindo! \n Este programa funciona como caixa de uma loja ");
        System.out.println(" Escolha uma das sessões abaixo para iniciar sua compra " +
                "\n 1)Alimentícias" +
                "\n 2)Limpeza" +
                "\n 3)Escritório" +
                "\n 4)Informática ");
        sessão = sc.nextLine();

        switch (sessão) {
            case "1":
                System.out.println(" Quantos Arroz você vai querer ? ");
                quantidade = sc.nextInt();
                if(quantidade < 0 ){
                    System.err.println("Quantidade Incorreta");
                }else if( quantidade < 2 ){
                    preço_total = quantidade * 2.00 ;
                }else if(quantidade <= 4 ){
                    porcetagem = (quantidade *2.00)*0.10;
                    preço_total = quantidade * 2.00 + porcetagem;
                }else if(quantidade <= 8 ){
                    porcetagem = (quantidade *2.00)*0.5;
                    preço_total = quantidade * 2.00 - porcetagem;
                }else {
                    porcetagem = (quantidade *2.00)*0.20;
                    preço_total = quantidade * 2.00 - porcetagem;
                }
                    preço_sessão1 = preço_total + preço_sessão1;

                System.out.println(" Quantos de Feijão você vai querer ? ");
                quantidade = sc.nextInt();
                if(quantidade < 0 ){
                    System.err.println("Quantidade Incorreta");
                }else if( quantidade < 2 ){
                    preço_total = quantidade * 3.00 ;
                }else if(quantidade <= 4 ){
                    porcetagem = (quantidade *3.00)*0.10;
                    preço_total = quantidade * 3.00 + porcetagem;
                }else if(quantidade <= 8 ){
                    porcetagem = (quantidade *3.00)*0.5;
                    preço_total = quantidade * 3.00 - porcetagem;
                }else {
                    porcetagem = (quantidade *3.00)*0.20;
                    preço_total = quantidade * 3.00 - porcetagem;
                }
                preço_sessão1 = preço_total + preço_sessão1;

                System.out.println(" Quantos Macarrão você vai querer ? ");
                quantidade = sc.nextInt();
                if(quantidade < 0 ){
                    System.err.println("Quantidade Incorreta");
                }else if( quantidade < 2 ){
                    preço_total = quantidade * 2.00 ;
                }else if(quantidade <= 4 ){
                    porcetagem = (quantidade *2.00)*0.10;
                    preço_total = quantidade * 2.00 + porcetagem;
                }else if(quantidade <= 8 ){
                    porcetagem = (quantidade *2.00)*0.5;
                    preço_total = quantidade * 2.00 - porcetagem;
                }else {
                    porcetagem = (quantidade *2.00)*0.20;
                    preço_total = quantidade * 2.00 - porcetagem;
                }
                preço_sessão1 = preço_total + preço_sessão1;
                break;
            case "2":
                System.out.println(" Quantas Vassouras você vai querer ? ");
                quantidade = sc.nextInt();
                if(quantidade < 0 ){
                    System.err.println("Quantidade Incorreta");
                }else if( quantidade < 1 ){
                    preço_total = quantidade * 5.00 ;
                }else if(quantidade <= 3 ){
                    porcetagem = (quantidade *5.00)*0.10;
                    preço_total = quantidade * 5.00 + porcetagem;
                }else if(quantidade <= 6 ){
                    porcetagem = (quantidade *5.00)*0.5;
                    preço_total = quantidade * 5.00 - porcetagem;
                }else {
                    porcetagem = (quantidade *5.00)*0.20;
                    preço_total = quantidade * 5.00 - porcetagem;
                }
                preço_sessão2 = preço_total + preço_sessão2;

                System.out.println(" Quantos de Sabões em Pó você vai querer ? ");
                quantidade = sc.nextInt();
                if(quantidade < 0 ){
                    System.err.println("Quantidade Incorreta");
                }else if( quantidade < 1 ){
                    preço_total = quantidade * 3.00 ;
                }else if(quantidade <= 3 ){
                    porcetagem = (quantidade *3.00)*0.10;
                    preço_total = quantidade * 3.00 + porcetagem;
                }else if(quantidade <= 6 ){
                    porcetagem = (quantidade *3.00)*0.5;
                    preço_total = quantidade * 3.00 - porcetagem;
                }else {
                    porcetagem = (quantidade *3.00)*0.20;
                    preço_total = quantidade * 3.00 - porcetagem;
                }
                preço_sessão2 = preço_total + preço_sessão2;

                System.out.println(" Quantos sabões Liquidos você vai querer ? ");
                quantidade = sc.nextInt();
                if(quantidade < 0 ){
                    System.err.println("Quantidade Incorreta");
                }else if( quantidade < 1 ){
                    preço_total = quantidade * 2.00 ;
                }else if(quantidade <= 3 ){
                    porcetagem = (quantidade *2.00)*0.10;
                    preço_total = quantidade * 2.00 + porcetagem;
                }else if(quantidade <= 6 ){
                    porcetagem = (quantidade *2.00)*0.5;
                    preço_total = quantidade * 2.00 - porcetagem;
                }else {
                    porcetagem = (quantidade *2.00)*0.20;
                    preço_total = quantidade * 2.00 - porcetagem;
                }
                preço_sessão2 = preço_total + preço_sessão2;
                break;
            case "3":
                System.out.println(" Quantas Resmas você vai querer ? ");
                quantidade = sc.nextInt();
                if(quantidade < 0 ){
                    System.err.println("Quantidade Incorreta");
                }else if( quantidade < 3 ){
                    preço_total = quantidade * 18.00 ;
                }else if(quantidade <= 5 ){
                    porcetagem = (quantidade *18.00)*0.10;
                    preço_total = quantidade * 18.00 + porcetagem;
                }else if(quantidade <= 7 ){
                    porcetagem = (quantidade *18.00)*0.5;
                    preço_total = quantidade * 18.00 - porcetagem;
                }else {
                    porcetagem = (quantidade *18.00)*0.20;
                    preço_total = quantidade * 18.00 - porcetagem;
                }
                preço_sessão3 = preço_total + preço_sessão3;

                System.out.println(" Quantas de Caneta você vai querer ? ");
                quantidade = sc.nextInt();
                if(quantidade < 0 ){
                    System.err.println("Quantidade Incorreta");
                }else if( quantidade <=3 ){
                    preço_total = quantidade * 2.00 ;
                }else if(quantidade <= 5 ){
                    porcetagem = (quantidade *2.00)*0.10;
                    preço_total = quantidade * 2.00 + porcetagem;
                }else if(quantidade <= 7 ){
                    porcetagem = (quantidade *2.00)*0.5;
                    preço_total = quantidade * 2.00 - porcetagem;
                }else {
                    porcetagem = (quantidade *2.00)*0.20;
                    preço_total = quantidade * 2.00 - porcetagem;
                }
                preço_sessão3 = preço_total + preço_sessão3;

                System.out.println(" Quantas agendas você vai querer ? ");
                quantidade = sc.nextInt();
                if(quantidade < 0 ){
                    System.err.println("Quantidade Incorreta");
                }else if( quantidade < 3 ){
                    preço_total = quantidade * 15.00 ;
                }else if(quantidade <= 5 ){
                    porcetagem = (quantidade *15.00)*0.10;
                    preço_total = quantidade * 15.00 + porcetagem;
                }else if(quantidade <= 7 ){
                    porcetagem = (quantidade *15.00)*0.5;
                    preço_total = quantidade * 15.00 - porcetagem;
                }else {
                    porcetagem = (quantidade *15.00)*0.20;
                    preço_total = quantidade * 15.00 - porcetagem;
                }
                preço_sessão3 = preço_total + preço_sessão3;
                break;
            case "4":
                System.out.println(" Quantos Mouses você vai querer ? ");
                quantidade = sc.nextInt();
                if(quantidade < 0 ){
                    System.err.println("Quantidade Incorreta");
                }else if( quantidade < 2 ){
                    preço_total = quantidade * 15.00 ;
                }else if(quantidade <= 5 ){
                    porcetagem = (quantidade *15.00)*0.10;
                    preço_total = quantidade * 15.00 + porcetagem;
                }else if(quantidade <= 8 ){
                    porcetagem = (quantidade *15.00)*0.5;
                    preço_total = quantidade * 15.00 - porcetagem;
                }else {
                    porcetagem = (quantidade *15.00)*0.20;
                    preço_total = quantidade * 15.00 - porcetagem;
                }
                preço_sessão4 = preço_total + preço_sessão4;

                System.out.println(" Quantos Teclados você vai querer ? ");
                quantidade = sc.nextInt();
                if(quantidade < 0 ){
                    System.err.println("Quantidade Incorreta");
                }else if( quantidade < 2 ){
                    preço_total = quantidade * 20.00 ;
                }else if(quantidade <= 5 ){
                    porcetagem = (quantidade *20.00)*0.10;
                    preço_total = quantidade * 20.00 + porcetagem;
                }else if(quantidade <= 8 ){
                    porcetagem = (quantidade *20.00)*0.5;
                    preço_total = quantidade * 20.00 - porcetagem;
                }else {
                    porcetagem = (quantidade *20.00)*0.20;
                    preço_total = quantidade * 20.00 - porcetagem;
                }
                preço_sessão4 = preço_total + preço_sessão4;

                System.out.println(" Quantos Monitores você vai querer ? ");
                quantidade = sc.nextInt();
                if(quantidade < 0 ){
                    System.err.println("Quantidade Incorreta");
                }else if( quantidade < 2 ){
                    preço_total = quantidade * 500.00 ;
                }else if(quantidade <= 5 ){
                    porcetagem = (quantidade *500.00)*0.10;
                    preço_total = quantidade * 500.00 + porcetagem;
                }else if(quantidade <= 8 ){
                    porcetagem = (quantidade *500.00)*0.5;
                    preço_total = quantidade * 500.00 - porcetagem;
                }else {
                    porcetagem = (quantidade *500.00)*0.20;
                    preço_total = quantidade * 500.00 - porcetagem;
                }
                preço_sessão4 = preço_total + preço_sessão4;
                break;
            default:
                System.out.println(" Sessão não encontrada!");
        }
        valor =preço_sessão1+preço_sessão2+preço_sessão3+preço_sessão4;
        System.out.println("O preço total de produto é "+valor);
        System.out.println("O preço por sessão é \n " +
                "1)Alimentiícios = "+preço_sessão1+"\n"+
                "2)Produtos de Limpeza = "+preço_sessão2+"\n"+
                "3)Material de Escritório = "+preço_sessão3+"\n"+
                "4)Informática = "+preço_sessão4+"\n");
        System.out.println("Entre com o valor de pagamento ?");
        dinheiro = sc.nextDouble();
        if(dinheiro<valor)
            System.out.println("Você ainda deve :");
        else
            System.out.println("O seu troco é : R$");

        System.out.println((dinheiro-valor));
    }
}
