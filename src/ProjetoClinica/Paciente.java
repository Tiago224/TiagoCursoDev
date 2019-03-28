package ProjetoClinica;

public class Paciente {
    String nomeCompleto,rua,bairro,cidade,estado,complemento,sexo,telefone,CPF,
            email,escolaridade,
            ocupacao;
    String[] limitacao = new String[]{"cognitiva","locomocao","visao","audicao","outras"};
    int idade;
    String estadoClinico,diagnostico,prescricao;


}
