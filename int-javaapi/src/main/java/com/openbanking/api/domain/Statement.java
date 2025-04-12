package com.openbanking.api.domain;

public class Statement {
    private String statementId;
    private String accountId;
    private String period;

    public String getStatementId() {
        return statementId;
    }
    public void setStatementId(String statementId) {
        this.statementId = statementId;
    }
    public String getAccountId() {
        return accountId;
    }
    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }
    public String getPeriod() {
        return period;
    }
    public void setPeriod(String period) {
        this.period = period;
    }
}
