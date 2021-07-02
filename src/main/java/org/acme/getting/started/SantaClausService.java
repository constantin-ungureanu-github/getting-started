package org.acme.getting.started;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@ApplicationScoped
public class SantaClausService {
  @Inject
  EntityManager entityManager;

  @Transactional
  public void createGift(String giftDescription) {
    var gift = Gift.builder().name(giftDescription).build();

    entityManager.persist(gift);
    log.info("Created gift {}", gift);
  }
}
