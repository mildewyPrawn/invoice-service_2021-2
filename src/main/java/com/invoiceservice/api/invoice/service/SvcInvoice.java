package com.invoiceservice.api.invoice.service;

import java.util.List;

import com.invoiceservice.api.invoice.entity.Invoice;

public interface SvcInvoice {

    public List<Invoice> getInvoices();
    public Invoice getInvoice(Integer id);
    public void createInvoice(Invoice invoice);
    public void deleteInvoice(Integer id);
}
