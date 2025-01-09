package org.ormi.priv.tfa.orderflow.api.gateway.productregistry.adapter.inbound.http.resource.exception;

public class ProductRegistryConsumerbyCorrelationException extends RuntimeException{
    public ProductRegistryConsumerbyCorrelationException(String message, Throwable cause) {
        super(message, cause);
    }
}
