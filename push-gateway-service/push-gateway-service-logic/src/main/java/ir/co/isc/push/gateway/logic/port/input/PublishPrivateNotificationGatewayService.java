package ir.co.isc.push.gateway.logic.port.input;

import ir.co.isc.push.common.logic.domain.PrivatePushNotification;
import ir.co.isc.push.gateway.logic.dto.PublishNotificationResponse;

public interface PublishPrivateNotificationGatewayService {

    PublishNotificationResponse publishPrivateNotification(PrivatePushNotification privatePushNotification);
}
