package org.ormi.priv.tfa.orderflow.product.registry.aggregate.repository.model;

public class ProductRemovedEventEntity extends ProductRegistryEventEntity {
  static final String EVENT_TYPE = "ProductRemoved";

  /**
   * Record class for the payload.
   */
  public record Payload (String productId) {  
  }

  /**
   * The payload for the event.
   */
  public Payload payload;

  @Override
  public String getEventType() {
    return EVENT_TYPE;
  }
  
}
