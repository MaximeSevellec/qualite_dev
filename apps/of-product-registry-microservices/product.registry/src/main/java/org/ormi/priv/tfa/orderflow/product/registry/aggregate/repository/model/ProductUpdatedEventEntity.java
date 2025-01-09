package org.ormi.priv.tfa.orderflow.product.registry.aggregate.repository.model;

public class ProductUpdatedEventEntity extends ProductRegistryEventEntity {
  static final String EVENT_TYPE = "ProductUpdated";

  /**
   * Record class for the payload.
   */
  public record Payload (String productId,String name,String productDescription) {
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
