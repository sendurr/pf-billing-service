package com.sendurr.platform.account.billing.dto;

import java.util.HashSet;

public class AccountDTO {
    private Long id;
    private Long accNumber;
    private String accName;

    public AccountDTO(Long id, Long accNumber, String accName) {
        this.id = id;
        this.accNumber = accNumber;
        this.accName = accName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(Long accNumber) {
        this.accNumber = accNumber;
    }

    public String getAccName() {
        return accName;
    }

    public void setAccName(String accName) {
        this.accName = accName;
    }

}
