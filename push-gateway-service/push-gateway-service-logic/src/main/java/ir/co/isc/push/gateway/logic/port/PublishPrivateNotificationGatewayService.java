package ir.co.isc.push.gateway.logic.port;

import ir.co.isc.push.common.logic.domain.PushNotification;
import ir.co.isc.push.gateway.logic.dto.PublishNotificationResponse;

public interface PublishPrivateNotificationGatewayService {

    PublishNotificationResponse publishPrivateNotification(PushNotification pushNotification);
}
