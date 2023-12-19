package ir.co.isc.push.gateway.logic.port.output;

import ir.co.isc.push.common.logic.event.publisher.DomainEventPublisher;
import ir.co.isc.push.gateway.logic.event.PublishPrivateNotificationEvent;

public interface PrivateNotificationMessagePublisher extends DomainEventPublisher<PublishPrivateNotificationEvent> {
}
