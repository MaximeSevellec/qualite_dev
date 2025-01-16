package org.ormi.priv.tfa.orderflow.api.gateway.productregistry.adapter.inbound.http.dto;

public abstract class ProductRegistryEventDto {
  private String id;
  private String productRegistryId;
  private long version;
  private long timestamp;
  private String eventType;
  private DtoPayload payload;

  public static interface DtoPayload {
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getProductRegistryId() {
    return productRegistryId;
  }

  public void setProductRegistryId(String productRegistryId) {
    this.productRegistryId = productRegistryId;
  }

  public long getVersion() {
    return version;
  }

  public void setVersion(long version) {
    this.version = version;
  }

  public long getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(long timestamp) {
    this.timestamp = timestamp;
  }

  public String getEventType() {
    return eventType;
  }

  public void setEventType(String eventType) {
    this.eventType = eventType;
  }

  public DtoPayload getPayload() {
    return payload;
  }

  public void setPayload(DtoPayload payload) {
    this.payload = payload;
  }
}

// attribut en private, ajout d'accessors