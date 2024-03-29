package com.bookworm.controller;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
 
import javax.servlet.http.HttpServletResponse;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import com.lowagie.text.DocumentException;
import com.bookworm.BWMain.*;
import com.bookworm.entities.InvoiceDetails;
import com.bookworm.services.InvoiceDetailsManager;
 
@Controller
@CrossOrigin("https://localhost:3000")
public class InvoiceDetailController {
 
    @Autowired
    private InvoiceDetailsManager invoicemanager;
         
    @GetMapping("/invoicedetails/export/pdf")
    public void exportToPDF(HttpServletResponse response) throws DocumentException, IOException {
        response.setContentType("application/pdf");
        DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss");
        String currentDateTime = dateFormatter.format(new Date());
         
        String headerKey = "Content-Disposition";
        String headerValue = "attachment; filename=Products_" + currentDateTime + ".pdf";
        response.setHeader(headerKey, headerValue);
         
        List<InvoiceDetails> products = invoicemanager.getInvoiceDetails();
         
        InvoicePdfExporter exporter = new InvoicePdfExporter(products);
        exporter.export(response);
         
    }
}