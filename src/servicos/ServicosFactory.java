package servicos;

public class ServicosFactory {
    private static AdministradorServico AdministradorS = new AdministradorServico();

    public static AdministradorServico getAdministradorServico(){
        return AdministradorS;
    }

    private static ClienteServico ClienteS = new ClienteServico();

    public static ClienteServico getClienteServico(){
        return ClienteS;
    }

    private static TecnicoServico TecnicoS = new TecnicoServico();

    public static TecnicoServico getTecnicoServico(){
        return TecnicoS;
    }

    private static ProjetoOSServico ProjetoOSServicoS = new ProjetoOSServico();

    public static ProjetoOSServico getProjetoOSServico(){
        return ProjetoOSServicoS;
    }
}
