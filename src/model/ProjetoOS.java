package model;

public class ProjetoOS {
    int IDOs;
    String Condicao;
    String Descricao;
    String LinkUnbonxing;
    String DataInicio; // verificar o LocalDate
    String DataFim; // verificar o LocalDate
    int fk_Cliente_IDUsuario;
    int fk_Tecnico_IDUsuario;

    public ProjetoOS(int iDOs, String condicao, String descricao, String linkUnbonxing, String dataInicio,
            String dataFim, int fk_Cliente_IDUsuario, int fk_Tecnico_IDUsuario) {
        IDOs = iDOs;
        Condicao = condicao;
        Descricao = descricao;
        LinkUnbonxing = linkUnbonxing;
        DataInicio = dataInicio;
        DataFim = dataFim;
        this.fk_Cliente_IDUsuario = fk_Cliente_IDUsuario;
        this.fk_Tecnico_IDUsuario = fk_Tecnico_IDUsuario;
    }

    public int getIDOs() {
        return IDOs;
    }

    public void setIDOs(int iDOs) {
        IDOs = iDOs;
    }

    public String getCondicao() {
        return Condicao;
    }

    public void setCondicao(String condicao) {
        Condicao = condicao;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String descricao) {
        Descricao = descricao;
    }

    public String getLinkUnbonxing() {
        return LinkUnbonxing;
    }

    public void setLinkUnbonxing(String linkUnbonxing) {
        LinkUnbonxing = linkUnbonxing;
    }

    public String getDataInicio() {
        return DataInicio;
    }

    public void setDataInicio(String dataInicio) {
        DataInicio = dataInicio;
    }

    public String getDataFim() {
        return DataFim;
    }

    public void setDataFim(String dataFim) {
        DataFim = dataFim;
    }

    public int getFk_Cliente_IDUsuario() {
        return fk_Cliente_IDUsuario;
    }

    public void setFk_Cliente_IDUsuario(int fk_Cliente_IDUsuario) {
        this.fk_Cliente_IDUsuario = fk_Cliente_IDUsuario;
    }

    public int getFk_Tecnico_IDUsuario() {
        return fk_Tecnico_IDUsuario;
    }

    public void setFk_Tecnico_IDUsuario(int fk_Tecnico_IDUsuario) {
        this.fk_Tecnico_IDUsuario = fk_Tecnico_IDUsuario;
    }

}
