package com.openbanking.api.service;

import com.openbanking.api.domain.*;
import com.openbanking.api.processor.TransactionProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class OpenBankingService {

    @Autowired
    private TransactionProcessor transactionProcessor;

    public List<Account> getAccounts() {
         List<Account> accounts = new ArrayList<>();
         Account account = new Account();
         account.setAccountId("ACC001");
         account.setAccountType("Checking");
         account.setBalance(1500.0);
         accounts.add(account);
         return accounts;
    }

    public List<Transaction> getTransactions() {
         List<Transaction> transactions = new ArrayList<>();
         Transaction transaction = new Transaction();
         transaction.setTransactionId("TXN001");
         transaction.setAccountId("ACC001");
         transaction.setAmount(250.0);
         transaction.setDate("2025-04-12");
         transaction.setDescription("Grocery Purchase");
         transactions.add(transactionProcessor.processTransaction(transaction));
         return transactions;
    }

    public List<Statement> getStatements() {
         List<Statement> statements = new ArrayList<>();
         Statement statement = new Statement();
         statement.setStatementId("STMT001");
         statement.setAccountId("ACC001");
         statement.setPeriod("2025-03");
         statements.add(statement);
         return statements;
    }

    public List<TransactionImage> getTransactionImages() {
         List<TransactionImage> images = new ArrayList<>();
         TransactionImage image = new TransactionImage();
         image.setImageId("IMG001");
         image.setTransactionId("TXN001");
         image.setImageUrl("http://example.com/image1.jpg");
         images.add(image);
         return images;
    }

    public List<Customer> getCustomers() {
         List<Customer> customers = new ArrayList<>();
         Customer customer = new Customer();
         customer.setCustomerId("CUST001");
         customer.setName("John Doe");
         customer.setEmail("john.doe@example.com");
         customers.add(customer);
         return customers;
    }

    public List<TaxDocument> getTaxDocuments() {
         List<TaxDocument> docs = new ArrayList<>();
         TaxDocument doc = new TaxDocument();
         doc.setDocumentId("TAX001");
         doc.setCustomerId("CUST001");
         doc.setDocumentUrl("http://example.com/taxdocument.pdf");
         docs.add(doc);
         return docs;
    }
}
