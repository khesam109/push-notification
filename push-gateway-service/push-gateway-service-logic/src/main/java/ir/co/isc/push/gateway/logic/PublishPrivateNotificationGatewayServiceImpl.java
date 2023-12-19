package ir.co.isc.push.gateway.logic;

import ir.co.isc.push.common.logic.domain.PrivatePushNotification;
import ir.co.isc.push.gateway.logic.dto.PublishNotificationResponse;
import ir.co.isc.push.gateway.logic.port.input.PublishPrivateNotificationGatewayService;
import org.springframework.stereotype.Service;

@Service
public class PublishPrivateNotificationGatewayServiceImpl implements PublishPrivateNotificationGatewayService {

    @Override
    public PublishNotificationResponse publishPrivateNotification(PrivatePushNotification privatePushNotification) {
        PublishNotificationResponse response = new PublishNotificationResponse();
        response.setNotificationTrackId(privatePushNotification.getTrackId().getValue());

        return response;
    }
}
