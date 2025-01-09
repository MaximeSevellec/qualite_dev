package org.ormi.priv.tfa.orderflow.product.registry.aggregate.repository.model;

public class ProductRegisteredEventEntity extends ProductRegistryEventEntity {
  static final String EVENT_TYPE = "ProductRegistered";

  /**
   * Record class for the payload.
   */
  public record Payload (String productId,String name,String productDescription) {
  }

  /**
   * The payload for the event.
   */
  private Payload payload;

  public Payload getPayload() {
    return payload;
  }

  public void setPayload(Payload payload) {
    this.payload = payload;
  }

  @Override
  public String getEventType() {
    return EVENT_TYPE;
  }
}
