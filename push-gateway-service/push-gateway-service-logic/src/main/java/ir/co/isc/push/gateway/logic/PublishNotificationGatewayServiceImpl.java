package ir.co.isc.push.gateway.logic;

import ir.co.isc.push.common.logic.domain.PushNotification;
import ir.co.isc.push.gateway.logic.dto.PublishNotificationResponse;
import ir.co.isc.push.gateway.logic.port.PublishNotificationGatewayService;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class PublishNotificationGatewayServiceImpl implements PublishNotificationGatewayService {

    @Override
    public PublishNotificationResponse publishPrivateNotification(PushNotification pushNotification) {
        PublishNotificationResponse response = new PublishNotificationResponse();
        response.setNotificationTrackId(pushNotification.getTrackId().getValue());

        return response;
    }
}
