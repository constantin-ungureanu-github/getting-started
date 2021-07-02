package org.acme.getting.started;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Path("/hello")
public class GreetingResource {

  private final SantaClausService santaClausService;

  @Inject
  GreetingResource(SantaClausService santaClausService) {
    this.santaClausService = santaClausService;
  }

  @GET
  @Produces(MediaType.TEXT_PLAIN)
  public String hello() {
    log.info("Hello RESTEasy");
    santaClausService.createGift("toy");
    return "Hello RESTEasy";
  }
}
