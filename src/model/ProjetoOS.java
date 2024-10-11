package model;

public class ProjetoOS {
    int IDOs;
    String Condicao;
    String Descricao;
    String LinkUnboxing;
    String DataInicio; // verificar o LocalDate
    String DataFim; // verificar o LocalDate
    int fk_Cliente_IDUsuario;
    int fk_Tecnico_IDTecnico;

    public ProjetoOS(){
    }

    public ProjetoOS(int iDOs, String condicao, String descricao, String linkUnboxing, String dataInicio,
            String dataFim, int fk_Cliente_IDUsuario, int fk_Tecnico_IDTecnico) {
        IDOs = iDOs;
        Condicao = condicao;
        Descricao = descricao;
        LinkUnboxing = linkUnboxing;
        DataInicio = dataInicio;
        DataFim = dataFim;
        this.fk_Cliente_IDUsuario = fk_Cliente_IDUsuario;
        this.fk_Tecnico_IDTecnico = fk_Tecnico_IDTecnico;
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

    public String getLinkUnboxing() {
        return LinkUnboxing;
    }

    public void setLinkUnboxing(String linkUnboxing) {
        LinkUnboxing = linkUnboxing;
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

    public int getfk_Cliente_IDUsuario() {
        return fk_Cliente_IDUsuario;
    }

    public void setfk_Cliente_IDUsuario(int fk_Cliente_IDUsuario) {
        this.fk_Cliente_IDUsuario = fk_Cliente_IDUsuario;
    }

    public int getfk_Tecnico_IDTecnico() {
        return fk_Tecnico_IDTecnico;
    }

    public void setfk_Tecnico_IDTecnico(int fk_Tecnico_IDTecnico) {
        this.fk_Tecnico_IDTecnico = fk_Tecnico_IDTecnico;
    }

}
