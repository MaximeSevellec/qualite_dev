package org.ormi.priv.tfa.orderflow.product.registry.aggregate.repository.model;

import org.bson.types.ObjectId;

import io.quarkus.mongodb.panache.common.MongoEntity;

/**
 * Représente une entité d'événement de registre de produit dans MongoDB.
 * Cette classe est abstraite et doit être étendue par des classes concrètes
 * qui définissent le type d'événement spécifique.
 */
@MongoEntity(collection = "product_registry_events")
public abstract class ProductRegistryEventEntity {
  /**
   * l'identifiant unique de l'entité dans MongoDB.
   */
  private ObjectId id;
  /**
   * l'identifiant unique de l'événement.
   */
  private String eventId;
  /**
   * le type de l'événement, défini par les classes dérivées.
   */
  private String eventType = getEventType();
  /**
   * l'identifiant de la racine agrégée associée à cet événement.
   */
  private String aggregateRootId;
  /**
   * la version de l'événement.
   */
  private long version;
  /**
   * l'horodatage de l'événement.
   */
  private long timestamp;

  /**
   * Retourne le type de l'événement.
   * 
   * @return le type de l'événement.
   */

  public ObjectId getId() {
    return id;
  }

  public void setId(ObjectId id) {
    this.id = id;
  }

  public String getEventId() {
    return eventId;
  }

  public void setEventId(String eventId) {
    this.eventId = eventId;
  }

  public String getEventType() {
    return eventType;
  }

  public void setEventType(String eventType) {
    this.eventType = eventType;
  }

  public String getAggregateRootId() {
    return aggregateRootId;
  }

  public void setAggregateRootId(String aggregateRootId) {
    this.aggregateRootId = aggregateRootId;
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
}
