package com.sendurr.platform.account.billing.utils;

import com.sendurr.platform.account.billing.controller.AccountController;
import com.sendurr.platform.account.billing.dto.AccountDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import java.util.HashSet;
import java.util.Set;

@Component
public class RestUtils {

    private static final Logger logger = LoggerFactory.getLogger(AccountController.class);

    @Autowired
    RestTemplate restTemplate;

    public ResponseEntity<Object> executeRESTGETCall(String url) {

        logger.info("Executing executeRESTGETCall utils method");

        ResponseEntity<Object> responseEntity = null;
        HttpEntity<String> emptyEntity = new HttpEntity<>(null, null);

        try {
            responseEntity = restTemplate.exchange(url, HttpMethod.GET, emptyEntity, Object.class);
            logger.info("REST GET call successful.");
        } catch (Exception e) {

            logger.info("REST GET call failed. Executing default values");

            Set<AccountDTO> accounts = new HashSet<>();
            accounts.add(new AccountDTO(new Long(1), new Long(123456), "BOFA - sam"));
            accounts.add(new AccountDTO(new Long(2), new Long(923156), "CITI - sam"));
            responseEntity = new ResponseEntity<>(accounts, HttpStatus.OK);
        }

        return responseEntity;
    }
}
