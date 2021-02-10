package io.service84.library.resttemplateconfig;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.web.client.RestTemplate;

@ExtendWith(SpringExtension.class)
public class RestTemplateConfigurationTests {
  @TestConfiguration
  public static class Configuration extends RestTemplateConfiguration {}

  // Test Subject
  @Autowired private RestTemplateConfiguration restTemplateConfiguration;

  @Autowired private RestTemplate restTemplate;

  @Test
  public void isLoaded() {
    assertNotNull(restTemplateConfiguration);
    assertNotNull(restTemplate);
  }
}
