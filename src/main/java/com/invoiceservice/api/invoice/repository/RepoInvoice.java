package com.invoiceservice.api.invoice.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.invoiceservice.api.invoice.entity.Invoice;

@Repository
public interface RepoInvoice extends JpaRepository<Invoice, Integer>{

    @Query(value ="SELECT * FROM invoice WHERE status = 1", nativeQuery = true)
    List<Invoice> getInvoices();
	
    @Modifying
    @Transactional
    @Query(value ="UPDATE invoice SET status = 0 WHERE id_invoice = :id", nativeQuery = true)
    void deleteInvoice(@Param("id") Integer id);
}
