package servicos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.List;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import dao.ProjetoOSDAO;
import model.ProjetoOS;

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

        PdfWriter.getInstance(document, new FileOutputStream("C:\\Relatorios\\Projetos.OrdensDeServico\\Relatorio_Projetos.OrdensDeServico.pdf"));

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
}
