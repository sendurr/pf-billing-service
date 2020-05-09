package com.sendurr.platform.account.billing.service;

import com.sendurr.platform.account.billing.config.AccountConfig;
import com.sendurr.platform.account.billing.controller.AccountController;
import com.sendurr.platform.account.billing.dto.AccountDTO;
import com.sendurr.platform.account.billing.utils.RestUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

    private static final Logger logger = LoggerFactory.getLogger(AccountController.class);

    @Autowired
    RestUtils restUtils;

    AccountConfig accountConfig;

    public ResponseEntity<Object> getAccounts() {

        logger.info("Executing getAccounts service method");

        ResponseEntity<Object> responseEntity = null;
//        logger.info(accountConfig.getAccountsUrl());

        responseEntity = restUtils.executeRESTGETCall("http://dummy.restapiexample.com/api/v1/employees");

        return responseEntity;
    }
}
