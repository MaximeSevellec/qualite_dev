package org.ormi.priv.tfa.orderflow.product.registry.aggregate.repository.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import org.ormi.priv.tfa.orderflow.lib.event.sourcing.aggregate.mapper.EventIdMapper;
import org.ormi.priv.tfa.orderflow.lib.publishedlanguage.event.ProductRegistered;
import org.ormi.priv.tfa.orderflow.lib.publishedlanguage.event.ProductRemoved;
import org.ormi.priv.tfa.orderflow.lib.publishedlanguage.event.ProductUpdated;
import org.ormi.priv.tfa.orderflow.product.registry.aggregate.repository.model.ProductRegisteredEventEntity;
import org.ormi.priv.tfa.orderflow.product.registry.aggregate.repository.model.ProductRemovedEventEntity;
import org.ormi.priv.tfa.orderflow.product.registry.aggregate.repository.model.ProductUpdatedEventEntity;

/**
 * Transforme les événements de registre de produit en entités, fais aussi l'inverse
 */
@Mapper(uses = {EventIdMapper.class, ProductRegistryEventPayloadMapper.class})
public interface ProductRegistryEventEntityMapper {

  ProductRegistryEventEntityMapper INSTANCE = Mappers.getMapper(ProductRegistryEventEntityMapper.class);

  /**
   * Transforme un événement de produit enregistré en entité
   * 
   * @param evt l'événement de produit
   * @return l'entité de l'événement de produit
   */
  @Mapping(target = "id", ignore = true)
  @Mapping(target = "eventId", source = "id", qualifiedByName = "eventIdToString")
  @Mapping(target = "eventType", source = "eventType")
  @Mapping(target = "aggregateRootId", source = "aggregateId")
  @Mapping(target = "version", source = "version")
  @Mapping(target = "timestamp", source = "timestamp")
  @Mapping(target = "payload", source = "payload", qualifiedByName = "productRegisteredEventPayloadToEntity")
  ProductRegisteredEventEntity toEntity(ProductRegistered evt);

  /**
   * Transforme une entité d'événement de produit enregistré en événement de produit
   * 
   * @param entity l'entité d'événement de produit
   * @return l'événement de produit
   */
  @Mapping(target = "id", source = "eventId", qualifiedByName = "toEventId")
  @Mapping(target = "eventType", ignore = true)
  @Mapping(target = "aggregateId", source = "aggregateRootId")
  @Mapping(target = "version", source = "version")
  @Mapping(target = "timestamp", source = "timestamp")
  @Mapping(target = "payload", source = "payload", qualifiedByName = "productRegisteredEventPayloadToEvent")
  ProductRegistered toEvent(ProductRegisteredEventEntity entity);

  /**
   * Transforme un événement de produit mis à jour en entité
   * 
   * @param evt l'événement de produit mis à jour
   * @return l'entité de l'événement de produit mis à jour
   */
  @Mapping(target = "id", ignore = true)
  @Mapping(target = "eventId", source = "id", qualifiedByName = "eventIdToString")
  @Mapping(target = "eventType", source = "eventType")
  @Mapping(target = "aggregateRootId", source = "aggregateId")
  @Mapping(target = "version", source = "version")
  @Mapping(target = "timestamp", source = "timestamp")
  @Mapping(target = "payload", source = "payload", qualifiedByName = "productUpdatedEventEntityToEntity")
  ProductUpdatedEventEntity toEntity(ProductUpdated evt);

  /**
   * Transforme une entité d'événement de produit mis à jour en événement de produit mis à jour
   * 
   * @param entity l'entité d'événement de produit mis à jour
   * @return l'événement de produit mis à jour
   */
  @Mapping(target = "id", source = "eventId", qualifiedByName = "toEventId")
  @Mapping(target = "eventType", ignore = true)
  @Mapping(target = "aggregateId", source = "aggregateRootId")
  @Mapping(target = "version", source = "version")
  @Mapping(target = "timestamp", source = "timestamp")
  @Mapping(target = "payload", source = "payload", qualifiedByName = "productUpdatedEventPayloadToEvent")
  ProductUpdated toEvent(ProductUpdatedEventEntity entity);

  /**
   * Transforme un événement de produit supprimé en entité
   * 
   * @param evt l'événement de produit supprimé
   * @return l'entité de l'événement de produit supprimé
   */
  @Mapping(target = "id", ignore = true)
  @Mapping(target = "eventId", source = "id", qualifiedByName = "eventIdToString")
  @Mapping(target = "eventType", source = "eventType")
  @Mapping(target = "aggregateRootId", source = "aggregateId")
  @Mapping(target = "version", source = "version")
  @Mapping(target = "timestamp", source = "timestamp")
  @Mapping(target = "payload", source = "payload", qualifiedByName = "productRemovedEventPayloadToEntity")
  ProductRemovedEventEntity toEntity(ProductRemoved evt);

  /**
   * Transforme une entité d'événement de produit supprimé en événement de produit supprimé
   * 
   * @param entity l'entité d'événement de produit supprimé
   * @return l'événement de produit supprimé
   */
  @Mapping(target = "id", source = "eventId", qualifiedByName = "toEventId")
  @Mapping(target = "eventType", ignore = true)
  @Mapping(target = "aggregateId", source = "aggregateRootId")
  @Mapping(target = "version", source = "version")
  @Mapping(target = "timestamp", source = "timestamp")
  @Mapping(target = "payload", source = "payload", qualifiedByName = "productRemovedEventPayloadToEvent")
  ProductRemoved toEvent(ProductRemovedEventEntity entity);
}
