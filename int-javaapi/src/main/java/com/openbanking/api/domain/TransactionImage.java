package com.openbanking.api.domain;

public class TransactionImage {
    private String imageId;
    private String transactionId;
    private String imageUrl;

    public String getImageId() {
        return imageId;
    }
    public void setImageId(String imageId) {
        this.imageId = imageId;
    }
    public String getTransactionId() {
        return transactionId;
    }
    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }
    public String getImageUrl() {
        return imageUrl;
    }
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
