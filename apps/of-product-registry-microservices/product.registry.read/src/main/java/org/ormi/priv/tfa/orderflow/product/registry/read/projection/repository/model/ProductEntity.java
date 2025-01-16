package org.ormi.priv.tfa.orderflow.product.registry.read.projection.repository.model;

import org.bson.types.ObjectId;

import io.quarkus.mongodb.panache.common.MongoEntity;

@MongoEntity(collection = "products")
public class ProductEntity {
  private ObjectId id;
  private String productId;
  private String name;
  private String description;
  private long version;
  private long updatedAt;
  private long registeredAt;
  public ObjectId getId() {
    return id;
  }

  public void setId(ObjectId id) {
    this.id = id;
  }

  public String getProductId() {
    return productId;
  }

  public void setProductId(String productId) {
    this.productId = productId;
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

  public long getVersion() {
    return version;
  }

  public void setVersion(long version) {
    this.version = version;
  }

  public long getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(long updatedAt) {
    this.updatedAt = updatedAt;
  }

  public long getRegisteredAt() {
    return registeredAt;
  }

  public void setRegisteredAt(long registeredAt) {
    this.registeredAt = registeredAt;
  }
}
