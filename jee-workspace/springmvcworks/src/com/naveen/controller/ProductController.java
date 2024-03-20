package com.naveen.controller;

import javax.swing.text.html.FormSubmitEvent.MethodType;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.naveen.beans.Product;

@Controller
public class ProductController {
	
	// to get product-form.html
	
	@RequestMapping("/add-product")
	public String addProductForm(Model model) {
		model.addAttribute("product", new Product()); 
		return "add-product-form"; 
	}
	
	@RequestMapping(method = RequestMethod.POST, path = "/save-product" )
	public String saveProduct(@ModelAttribute Product product) {
		System.out.println("Product got to save is " + product);
		// invoke dao layer 
		return "product-inserted"; 
	}
}












