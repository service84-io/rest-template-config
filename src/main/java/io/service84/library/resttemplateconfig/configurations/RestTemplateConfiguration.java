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

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.BufferingClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

@Configuration("F5E69F75-224E-4555-8067-99A5391AFB1C")
public class RestTemplateConfiguration {
  private static final Logger logger = LoggerFactory.getLogger(RestTemplateConfiguration.class);

  @Bean("D5F3C189-1BF8-4E39-B11F-C5910D5CC54F")
  public RestTemplate getRestTemplate() {
    logger.debug("getRestTemplate");
    RestTemplate restTemplate = new RestTemplate();
    // This allows us to read the response more than once - Necessary for debugging.
    restTemplate.setRequestFactory(
        new BufferingClientHttpRequestFactory(restTemplate.getRequestFactory()));
    return restTemplate;
  }
}
