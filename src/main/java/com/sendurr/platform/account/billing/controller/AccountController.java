package com.sendurr.platform.account.billing.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE)
public class AccountController {
    Logger logger = LoggerFactory.getLogger(AccountController.class);

    @RequestMapping(value = "/accounts", method = RequestMethod.GET)
    public ResponseEntity<String> getAllAccounts() {
        logger.info("processing get accounts call");

        ResponseEntity<String> responseEntity = null;
        responseEntity = new ResponseEntity<>("here are all your accounts", HttpStatus.OK);
        return responseEntity;
    }
}
