package com.bookworm.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bookworm.entities.GetProduct;
import com.bookworm.entities.InvoiceMaster;
import com.bookworm.services.InvoiceMasterManager;


@RestController
//@CrossOrigin("https://localhost:3000")
public class InvoiceMasterController
{
	@Autowired
	private InvoiceMasterManager service;
	
	@PostMapping("/api/addInvoiceMaster")
	public void addInvoice(@RequestBody InvoiceMaster ref)
	{
		service.addInvoiceMaster(ref);
	}
	
	@GetMapping("/api/InvoiceMaster")
	public List<InvoiceMaster> getAllStudents()
	{
		return service.getInvoiceMasters();
	}
	
//	@GetMapping("/my-page")
//    public void myPage(HttpServletRequest request, Model model) {
//        try{
//        // Retrieve data from sessionStorage
//        String myDataString = (String) request.getSession().getAttribute("cart");
//        
//        // Parse sessionStorage data as a JSON object
//        JSONObject myDataJson = new JSONObject(myDataString);
//        
//        // Retrieve specific values from JSON object
//        //String name = myDataJson.getString("name");
//        int ProductMasterId = myDataJson.getInt("ProductMasterId");
//        System.out.println(ProductMasterId);
//        
//        // Do something with the name and age here
//        }
//        catch(Exception ex)
//        {
//        	System.out.println(ex);
//        }
//        //return "my-page";
//    }
	@CrossOrigin(origins = "*",allowedHeaders="*")
	@PostMapping("/api/getInvoice")
    public String getProductElement(@RequestBody int id, GetProduct prod) {
        
       int id1=prod.getGetProductId();
        System.out.println(id);
        		
        
        return "my-api-response";
    }
	
	
//	@GetMapping("api/invoiceDetails/{invdtlId}")
//	public void calculateRoyalty(@PathVariable int invdtlId) {
//		int i=0;
//		invoiceDetails = (InvoiceDetails) httpSession.getAttribute("invoiceDetails");
//		if (invoiceDetails != null) {
//			List<ProductMaster> productList = httpSession.getAttribute("cart");
//			List<Double> basePriceList = new ArrayList<>();
			//List<Double> percentage = proBen.getBenIdAndPrecentage(productList.);
			
//			int size = basePriceList.size();
//			double[] royalty = new double[size];
//			for (ProductMaster product : productList) {
//			    double basePrice = product.getBasePrice();
//			    basePriceList.add(basePrice);
//			}
//			Iterator<Double> itr = basePriceList.iterator();
//			while(itr.hasNext()) {
//				royalty[i++] = itr.next() * 0.1;
//			}
//		} else {
//		    // handle the case when the object is not found in the session
//		}
//
//	}
	
}
