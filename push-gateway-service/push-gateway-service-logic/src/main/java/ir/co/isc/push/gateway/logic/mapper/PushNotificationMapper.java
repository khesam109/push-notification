package ir.co.isc.push.gateway.logic.mapper;

import ir.co.isc.push.common.logic.domain.PushNotification;
import ir.co.isc.push.gateway.logic.dto.PublishNotificationCommand;
import org.springframework.stereotype.Component;

@Component
public class PushNotificationMapper {

    public PushNotification fromPublishNotificationCommand(
            PublishNotificationCommand publishNotificationCommand
    ) {
        return PushNotification.createPushNotification(
                publishNotificationCommand.title(), publishNotificationCommand.message()
        );
    }
}
