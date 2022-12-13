package org.tnmk.practice_java_resilient.pro_00_circuit_breaker_simple.story;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.tnmk.practice_java_resilient.pro_00_circuit_breaker_simple.common.rest.RestSupport;

@RestController
@RequiredArgsConstructor
public class HelloController {

  private final HelloService helloService;

  @GetMapping(RestSupport.API_PREFIX + "/hello")
  public String hello(@RequestParam(value = "success", required = false, defaultValue = "true") boolean success) {
    helloService.excecute(success);
    return "Finished";
  }
}
