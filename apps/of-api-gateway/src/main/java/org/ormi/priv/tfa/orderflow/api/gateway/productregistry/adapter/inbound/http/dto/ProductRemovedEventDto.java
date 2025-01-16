package org.ormi.priv.tfa.orderflow.api.gateway.productregistry.adapter.inbound.http.dto;

public final class ProductRemovedEventDto extends ProductRegistryEventDto {
  private DtoPayload payload;

  @Override
  public DtoPayload getPayload() {
    return payload;
  }

  @Override
  public void setPayload(ProductRegistryEventDto.DtoPayload payload) {
    this.payload = (ProductRemovedEventDto.DtoPayload) payload;
  }

  public static final class DtoPayload implements ProductRegistryEventDto.DtoPayload {
    private String id;

    public String getId() {
      return id;
    }

    public void setId(String id) {
      this.id = id;
    }
  }
}
