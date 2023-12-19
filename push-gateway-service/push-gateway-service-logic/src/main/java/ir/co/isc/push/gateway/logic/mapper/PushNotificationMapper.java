package ir.co.isc.push.gateway.logic.mapper;

import ir.co.isc.push.common.logic.domain.PrivatePushNotification;
import ir.co.isc.push.gateway.logic.dto.PublishNotificationCommand;
import org.springframework.stereotype.Component;

@Component
public class PushNotificationMapper {

    public PrivatePushNotification fromPublishNotificationCommand(
            PublishNotificationCommand publishNotificationCommand
    ) {
        return PrivatePushNotification.createPushNotification(
                publishNotificationCommand.title(), publishNotificationCommand.message()
        );
    }
}
