package com.sendurr.platform.account.billing.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {
    @RequestMapping(value = "/accounts", method = RequestMethod.GET)
    public String getAllAccounts() {
        return "here are all your accounts";
    }
}
