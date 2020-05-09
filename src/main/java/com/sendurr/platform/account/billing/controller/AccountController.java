package com.sendurr.platform.account.billing.controller;

import com.sendurr.platform.account.billing.dto.AccountDTO;
import com.sendurr.platform.account.billing.service.AccountService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashSet;
import java.util.Set;

@RestController
@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE)
public class AccountController {

    private static final Logger logger = LoggerFactory.getLogger(AccountController.class);

    @Autowired
    AccountService accountService;

    @RequestMapping(value = "/accounts", method = RequestMethod.GET)
    public ResponseEntity<Object> getAllAccounts() {

        logger.info("processing get accounts call");

//        Set<AccountDTO> accounts = new HashSet<>();
//        accounts.add(new AccountDTO(new Long(1), new Long(123456), "BOFA - sam"));
//        accounts.add(new AccountDTO(new Long(2), new Long(923156), "CITI - sam"));

        ResponseEntity<Object> responseEntity = null;

        responseEntity = accountService.getAccounts();

        return responseEntity;
    }
}
