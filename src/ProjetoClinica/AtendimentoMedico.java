package ProjetoClinica;

public class AtendimentoMedico {
    String tipo [] = new String[]{"1Remoção","2Pequena Cirurgia",
            "3Terapias","4Consulta","5Exames","6Atendimento Domiciliar","7SATD Internado",
            "8Quimioterapia","9Radioterapia","10Terapia Renal Substitutiva(TRS)"};
    String data,horario;
    Medico m01;
    Paciente p01;
    String status;

    public String[] getTipo() {
        return tipo;
    }

    public void setTipo(String[] tipo) {
        this.tipo = tipo;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Medico getM01() {
        return m01;
    }

    public void setM01(Medico m01) {
        this.m01 = m01;
    }

    public Paciente getP01() {
        return p01;
    }

    public void setP01(Paciente p01) {
        this.p01 = p01;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
