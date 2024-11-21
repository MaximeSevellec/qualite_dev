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
	public ObjectId id;
  /**
   * l'identifiant unique de l'événement.
   */
  public String eventId;
  /**
   * le type de l'événement, défini par les classes dérivées.
   */
  public String eventType = getEventType();
  /**
   * l'identifiant de la racine agrégée associée à cet événement.
   */
  public String aggregateRootId;
  /**
   * la version de l'événement.
   */
  public long version;
  /**
   * l'horodatage de l'événement.
   */
  public long timestamp;

  /**
   * Retourne le type de l'événement.
   * 
   * @return le type de l'événement.
   */
  abstract String getEventType();
}
