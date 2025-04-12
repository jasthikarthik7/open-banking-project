package com.openbanking.api.domain;

public class TaxDocument {
    private String documentId;
    private String customerId;
    private String documentUrl;

    public String getDocumentId() {
        return documentId;
    }
    public void setDocumentId(String documentId) {
        this.documentId = documentId;
    }
    public String getCustomerId() {
        return customerId;
    }
    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }
    public String getDocumentUrl() {
        return documentUrl;
    }
    public void setDocumentUrl(String documentUrl) {
        this.documentUrl = documentUrl;
    }
}
