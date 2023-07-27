package com.bookworm.controller;

import com.bookworm.entities.CustomerMaster;

public class LoginResponse {
    private boolean success;
    private CustomerMaster customer;

    public LoginResponse(boolean success, CustomerMaster customer) {
        this.success = success;
        this.customer = customer;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public CustomerMaster getCustomer() {
        return customer;
    }

    public void setCustomer(CustomerMaster customer) {
        this.customer = customer;
    }
}