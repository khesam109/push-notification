package ir.co.isc.push.common.logic.event.publisher;

import ir.co.isc.push.common.logic.event.DomainEvent;

public interface DomainEventPublisher<T extends DomainEvent<?>> {

    void publish(T domainEvent);
}
