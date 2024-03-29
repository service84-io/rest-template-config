/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.service84.library.resttemplateconfig.configurations;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.web.client.RestTemplate;

import io.service84.library.resttemplateconfig.configurations.RestTemplateConfiguration;

@ExtendWith(SpringExtension.class)
public class RestTemplateConfigurationTests {
  @TestConfiguration
  public static class TestRestTemplateConfiguration extends RestTemplateConfiguration {}

  // Test Subject
  @Autowired private RestTemplateConfiguration restTemplateConfiguration;

  @Autowired private RestTemplate restTemplate;

  @Test
  public void isLoaded() {
    assertNotNull(restTemplateConfiguration);
    assertNotNull(restTemplate);
  }
}
