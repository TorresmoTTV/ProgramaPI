package servicos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.List;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import dao.ClienteDAO;

import dao.ProjetoOSDAO;
import dao.TecnicoDAO;
import model.Cliente;
import model.ProjetoOS;
import model.Tecnico;

public class GeradorRelatorioPDF {

    public void gerarRelatorioProjetoOS() throws FileNotFoundException, DocumentException {
        ProjetoOSDAO projetoOSDAO = new ProjetoOSDAO();
        List<ProjetoOS> projetoOSs = projetoOSDAO.getProjetoOS();

        Document document = new Document();

        // Criando diretório se não existir
        File diretorio = new File("C:\\Relatorios\\Projetos.OrdensDeServico");
        if (!diretorio.exists()) {
            diretorio.mkdirs();
        }

        PdfWriter.getInstance(document, new FileOutputStream(
                "C:\\Relatorios\\Projetos.OrdensDeServico\\Relatorio_Projetos.OrdensDeServico.pdf"));

        document.open();
        document.add(new Paragraph("Relatório de Ordens de Serviço"));
        document.add(new Paragraph(" "));

        for (ProjetoOS pos : projetoOSs) {
            document.add(new Paragraph("ID: " + pos.getIDOs()));
            document.add(new Paragraph("Data de Inicio: " + pos.getDataInicio()));
            document.add(new Paragraph("Data de Finalização: " + pos.getDataFim()));
            document.add(new Paragraph("Condição: " + pos.getCondicao()));
            document.add(new Paragraph("Descrição: " + pos.getDescricao()));
            document.add(new Paragraph("Cliente: " + pos.getfk_Cliente_IDUsuario()));
            document.add(new Paragraph("Tecnico: " + pos.getfk_Tecnico_IDTecnico()));
            document.add(new Paragraph(" "));
        }

        document.close();

    }

    public void gerarRelatorioTecnicos() throws FileNotFoundException, DocumentException {
        TecnicoDAO tecnicoDAO = new TecnicoDAO();
        List<Tecnico> tecnicos = tecnicoDAO.getTecnicos();

        Document documentt = new Document();

        File diretoriot = new File("C:\\Relatorios\\Tecnicos");
        if (!diretoriot.exists()) {
            diretoriot.mkdirs();
        }
        PdfWriter.getInstance(documentt, new FileOutputStream("C:\\Relatorios\\Tecnicos\\Relatorio_Tecnicos.pdf"));

        documentt.open();
        documentt.add(new Paragraph("Relatório de Tecnicos"));
        documentt.add(new Paragraph(" "));

        for (Tecnico tec : tecnicos) {
            documentt.add(new Paragraph("ID do Tecnico: " + tec.getIDTecnico()));
            documentt.add(new Paragraph("Nome: " + tec.getNome()));
            documentt.add(new Paragraph("CPF: " + tec.getCPF()));
            documentt.add(new Paragraph("E-mail: " + tec.getEmail()));
            documentt.add(new Paragraph("Telefone: " + tec.getTelefone()));
            documentt.add(new Paragraph("Usuario: " + tec.getUsuarioTec()));
            documentt.add(new Paragraph(" "));
        }

        documentt.close();

    }

    public void gerarRelatorioClientes() throws FileNotFoundException, DocumentException {
        ClienteDAO clienteDAO = new ClienteDAO();
        List<Cliente> clientes = clienteDAO.getClientes();

        Document documentt = new Document();

        File diretoriot = new File("C:\\Relatorios\\Clientes");
        if (!diretoriot.exists()) {
            diretoriot.mkdirs();
        }
        PdfWriter.getInstance(documentt, new FileOutputStream("C:\\Relatorios\\Clientes\\Relatorio_Clientes.pdf"));

        documentt.open();
        documentt.add(new Paragraph("Relatório de Clientes"));
        documentt.add(new Paragraph(" "));
        
        for (Cliente cli : clientes) {
            documentt.add(new Paragraph("ID do Cliente: " + cli.getIDUsuario()));
            documentt.add(new Paragraph("Nome do Cliente: " + cli.getNome()));
            documentt.add(new Paragraph("E-mail do Cliente: " + cli.getEmail()));
            documentt.add(new Paragraph("Endereço: " + cli.getEndereco()));
            documentt.add(new Paragraph("CPF: " + cli.getCPF()));
            documentt.add(new Paragraph("Telefone: " + cli.getTelefone()));
            documentt.add(new Paragraph("Usuário do cliente: " + cli.getUsuarioCliente()));
            documentt.add(new Paragraph(" "));
        }
        
        documentt.close();
        
    }
}
