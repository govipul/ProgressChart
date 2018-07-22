package com.govipul.rest.progresschart.webservices.progresschart.service.customs;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class CustomsServiceTest {

  @Autowired
  private CustomsService service;

  @Ignore
  @Test
  public void testGetSuccessMessageCount() {
    int successMessageCount = service.getSuccessMessageCount("20151");
    Assert.assertTrue(successMessageCount == 11529);
  }

  @Ignore
  @Test
  public void testGetFailureMessageCount() {
    int successMessageCount = service.getFailureMessageCount("20151");
    Assert.assertTrue(successMessageCount == 180);
  }

  @Ignore
  @Test
  public void testGetPendingMessageCount() {
    int successMessageCount = service.getPendingMessageCount("20151");
    Assert.assertTrue(successMessageCount == 0);
  }

}
