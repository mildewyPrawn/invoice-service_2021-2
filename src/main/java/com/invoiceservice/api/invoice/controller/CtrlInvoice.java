package com.invoiceservice.api.invoice.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.invoiceservice.api.invoice.entity.Invoice;
import com.invoiceservice.api.invoice.service.SvcInvoice;
import com.invoiceservice.exceptionHandling.ApiException;

@RestController
@RequestMapping("/invoice")
public class CtrlInvoice {
	
    @Autowired
    SvcInvoice svc;

    @GetMapping
    public ResponseEntity<List<Invoice>> getInvoices() {
        return new ResponseEntity<>(svc.getInvoices(), HttpStatus.OK);
    }

    @GetMapping("/{id_invoce}")
    public ResponseEntity<Invoice> getInvoice(@PathVariable("id_invoce") Integer idInvoice) {
        return new ResponseEntity<>(svc.getInvoice(idInvoice), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<HttpStatus> createInvoice(@Valid @RequestBody Invoice invoice, BindingResult bindingResult) {
        if(bindingResult.hasErrors())
            throw new ApiException(HttpStatus.BAD_REQUEST, bindingResult.getAllErrors().get(0).getDefaultMessage());
		
        svc.createInvoice(invoice);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @DeleteMapping("/{id_invoice}")
    public ResponseEntity<HttpStatus> deleteInvoice(@PathVariable("id_invoice") Integer idInvoice){
        svc.deleteInvoice(idInvoice);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
