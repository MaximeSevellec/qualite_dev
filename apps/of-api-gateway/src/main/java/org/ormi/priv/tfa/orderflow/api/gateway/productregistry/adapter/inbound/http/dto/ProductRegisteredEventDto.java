package org.ormi.priv.tfa.orderflow.api.gateway.productregistry.adapter.inbound.http.dto;

public final class ProductRegisteredEventDto extends ProductRegistryEventDto {
  private DtoPayload payload;

  @Override
  public DtoPayload getPayload() {
    return payload;
  }

  @Override
  public void setPayload(ProductRegistryEventDto.DtoPayload payload) {
    this.payload = (ProductRegisteredEventDto.DtoPayload) payload;
  }

  public static final class DtoPayload implements ProductRegistryEventDto.DtoPayload {
    private String id;
    private String name;
    private String description;

    public String getId() {
      return id;
    }

    public void setId(String id) {
      this.id = id;
    }

    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }

    public String getDescription() {
      return description;
    }

    public void setDescription(String description) {
      this.description = description;
    }
  }
}

// peut pas changer cela, le fichier ProductRegisteryEventPayloadMapper.java utilise les argument de cette