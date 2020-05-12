package com.sendurr.platform.account.billing.controller;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sendurr.platform.account.billing.application.PfBillingServiceApplication;
import org.apache.commons.io.IOUtils;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = PfBillingServiceApplication.class)
@TestPropertySource(locations = "classpath:application-mock.properties")
public class AccountControllerTest {

    @MockBean
    RestTemplate restTemplate;

    @InjectMocks
    @Autowired
    AccountController accountController;

    @Autowired
    ObjectMapper mapper;

    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
    }

//    @Test
//    public void validating_accounts_get_function() {
//
//        try {
//            String restGetResponse = IOUtils.toString(
//                    getClass().getClassLoader().getResourceAsStream("testdata/accountsGet.json"), "UTF-8");
//            HttpEntity<Object> httpEntity = mapper.readValue(restGetResponse, new TypeReference<HttpEntity<Object>>() {
//            });
//            ResponseEntity<Object> responseEntity = new ResponseEntity(httpEntity.getBody(), httpEntity.getHeaders(), HttpStatus.OK);
//
//            Mockito.when(restTemplate.exchange(Mockito.eq("http://dummy.restapiexample.com/api/v1/employees"), Mockito.eq(HttpMethod.GET), Mockito.any(), Mockito.any()))
//                    .thenReturn(responseEntity);
//
//            ResponseEntity<Object> accountResponse = accountController.getAllAccounts();
//            Assert.assertNotNull(accountResponse);
//            Assert.assertEquals(HttpStatus.OK, accountResponse.getStatusCode());
//            Assert.assertEquals("test1", accountResponse.getBody().data[0].employee_name);
//            Assert.assertEquals("test5", accountResponse.getBody().data[4].employee_name);
//
//        } catch(Exception e) {
//            e.printStackTrace();
//        }
//    }
}
