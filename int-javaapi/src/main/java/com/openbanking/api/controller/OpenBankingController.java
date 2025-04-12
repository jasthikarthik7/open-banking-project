package com.openbanking.api.controller;

import com.openbanking.api.domain.*;
import com.openbanking.api.service.OpenBankingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class OpenBankingController {

    @Autowired
    private OpenBankingService service;

    @GetMapping("/accounts")
    public List<Account> getAccounts() {
       return service.getAccounts();
    }

    @GetMapping("/transactions")
    public List<Transaction> getTransactions() {
       return service.getTransactions();
    }

    @GetMapping("/statements")
    public List<Statement> getStatements() {
       return service.getStatements();
    }

    @GetMapping("/transaction-images")
    public List<TransactionImage> getTransactionImages() {
       return service.getTransactionImages();
    }

    @GetMapping("/customers")
    public List<Customer> getCustomers() {
       return service.getCustomers();
    }

    @GetMapping("/tax-documents")
    public List<TaxDocument> getTaxDocuments() {
       return service.getTaxDocuments();
    }
}
