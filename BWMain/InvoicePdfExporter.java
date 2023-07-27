package com.bookworm.BWMain;

import java.awt.Color;
import java.io.IOException;
import java.util.List;
 
import javax.servlet.http.HttpServletResponse;

import com.bookworm.entities.InvoiceDetails;
import com.lowagie.text.*;
import com.lowagie.text.pdf.*;
 
 
public class InvoicePdfExporter {
    private List<InvoiceDetails> invoice;
     
    public InvoicePdfExporter (List<InvoiceDetails> invoice) {
        this.invoice = invoice;
    }
 
    private void writeTableHeader(PdfPTable table) {
        PdfPCell cell = new PdfPCell();
        cell.setPadding(5);
        
        cell.setBackgroundColor(Color.BLUE);
    
         
        Font font = FontFactory.getFont(FontFactory.HELVETICA);
        font.setColor(Color.WHITE);
         
        cell.setPhrase(new Phrase("InvoiceDetailId", font));
         
        table.addCell(cell);
         
        cell.setPhrase(new Phrase("Price", font));
        table.addCell(cell);
         
        cell.setPhrase(new Phrase("Quantity", font));
        table.addCell(cell);
         
        cell.setPhrase(new Phrase("TransactionType", font));
        table.addCell(cell);
         
    
    }
     
    private void writeTableData(PdfPTable table) {
        for (InvoiceDetails invoice : invoice) {
            table.addCell(String.valueOf(invoice.getInvoiceDetailId()));
            table.addCell(String.valueOf(invoice.getBasePrice()));
            table.addCell(String.valueOf(invoice.getQuantity()));
            table.addCell(String.valueOf(invoice.getTransactionType()));
        }
    }
     
    public void export(HttpServletResponse response) throws DocumentException, IOException {
        Document document = new Document(PageSize.A4);
        PdfWriter.getInstance(document, response.getOutputStream());
         
        document.open();
        Font font = FontFactory.getFont(FontFactory.HELVETICA_BOLD);
        font.setSize(18);
        font.setColor(Color.BLUE);
         
        Paragraph p = new Paragraph("List of Products", font);
        p.setAlignment(Paragraph.ALIGN_CENTER);
         
        document.add(p);
         
        PdfPTable table = new PdfPTable(4);
        table.setWidthPercentage(100f);
        table.setWidths(new float[] {3.5f, 3.5f, 3.0f, 3.0f});
        table.setSpacingBefore(10);
         
        writeTableHeader(table);
        writeTableData(table);
         
        document.add(table);
         
        document.close();
         
    }
}