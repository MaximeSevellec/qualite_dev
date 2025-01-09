package org.ormi.priv.tfa.orderflow.product.registry.aggregate.repository.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.ormi.priv.tfa.orderflow.lib.publishedlanguage.event.ProductRegistered;
import org.ormi.priv.tfa.orderflow.lib.publishedlanguage.event.ProductRemoved;
import org.ormi.priv.tfa.orderflow.lib.publishedlanguage.event.ProductUpdated;
import org.ormi.priv.tfa.orderflow.lib.publishedlanguage.valueobject.mapper.ProductIdMapper;
import org.ormi.priv.tfa.orderflow.product.registry.aggregate.repository.model.ProductRegisteredEventEntity;
import org.ormi.priv.tfa.orderflow.product.registry.aggregate.repository.model.ProductRemovedEventEntity;
import org.ormi.priv.tfa.orderflow.product.registry.aggregate.repository.model.ProductUpdatedEventEntity;

/**
 * Mapper pour les événements de registre de produit.
 * Transforme les événements de registre de produit en entités, transforme aussi les entités en événements.
 */
@Mapper(uses = {ProductIdMapper.class})
public interface ProductRegistryEventPayloadMapper {
  
  /*
   * Transforme un événement de registre de produit enregistré en entité.
   */
  @Named("productRegisteredEventPayloadToEntity")
  @Mapping(target = "productId", source = "productId", qualifiedByName = "productIdToString")
  @Mapping(target = "name", source = "name")
  @Mapping(target = "productDescription", source = "productDescription")
  public ProductRegisteredEventEntity.Payload toEntity(ProductRegistered.Payload eventPayload);

  /*
   * Transforme une entité de registre de produit enregistré en événement.
   */
  @Named("productRegisteredEventPayloadToEvent")
  @Mapping(target = "productId", source = "productId", qualifiedByName = "toProductId")
  @Mapping(target = "name", source = "name")
  @Mapping(target = "productDescription", source = "productDescription")
  public ProductRegistered.Payload toEvent(ProductRegisteredEventEntity.Payload entityPayload);

  /*
   * Transforme un événement de registre de produit supprimé en DTO.
   */
  @Named("productUpdatedEventEntityToEntity")
  @Mapping(target = "productId", source = "productId", qualifiedByName = "productIdToString")
  @Mapping(target = "name", source = "name")
  @Mapping(target = "productDescription", source = "productDescription")
  public ProductUpdatedEventEntity.Payload toDto(ProductUpdated.Payload eventPayload);

  /*
   * Transforme une entité de registre de produit supprimé en une entité ???.
   */
  @Named("productUpdatedEventPayloadToEvent")
  @Mapping(target = "productId", source = "productId", qualifiedByName = "toProductId")
  @Mapping(target = "name", source = "name")
  @Mapping(target = "productDescription", source = "productDescription")
  public ProductUpdated.Payload toEntity(ProductUpdatedEventEntity.Payload entityPayload);

  /*
   * Transforme un événement de registre de produit supprimé en entité.
   */
  @Named("productRemovedEventPayloadToEntity")
  @Mapping(target = "productId", source = "productId", qualifiedByName = "productIdToString")
  public ProductRemovedEventEntity.Payload toEntity(ProductRemoved.Payload eventPayload);

  /*
   * Transforme une entité de registre de produit supprimé en événement.
   */
  @Named("productRemovedEventPayloadToEvent")
  @Mapping(target = "productId", source = "productId", qualifiedByName = "toProductId")
  public ProductRemoved.Payload toEvent(ProductRemovedEventEntity.Payload entityPayload);
}
