package ir.co.isc.push.gateway.logic.event;

import ir.co.isc.push.common.logic.domain.PrivatePushNotification;
import ir.co.isc.push.common.logic.event.DomainEvent;
import ir.co.isc.push.common.logic.event.publisher.DomainEventPublisher;

import java.time.ZonedDateTime;

public record PublishPrivateNotificationEvent(
        DomainEventPublisher<PublishPrivateNotificationEvent> publishPrivateNotificationEventDomainEventPublisher,
        PrivatePushNotification privatePushNotification,
        ZonedDateTime createdAt
) implements DomainEvent<PrivatePushNotification> {

    @Override
    public void fire() {
        publishPrivateNotificationEventDomainEventPublisher.publish(this);
    }
}
