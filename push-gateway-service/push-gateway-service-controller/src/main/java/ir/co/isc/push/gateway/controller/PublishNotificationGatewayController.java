package ir.co.isc.push.gateway.controller;

import ir.co.isc.push.gateway.logic.dto.PublishNotificationCommand;
import ir.co.isc.push.gateway.logic.dto.PublishNotificationResponse;
import ir.co.isc.push.gateway.logic.mapper.PushNotificationMapper;
import ir.co.isc.push.gateway.logic.port.PublishNotificationGatewayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;

@RestController
@RequestMapping("/api/v1/push-notification")
public class PublishNotificationGatewayController {

    private final PublishNotificationGatewayService publishNotificationGatewayService;
    private final PushNotificationMapper pushNotificationMapper;

    @Autowired
    public PublishNotificationGatewayController(
            PublishNotificationGatewayService publishNotificationGatewayService,
            PushNotificationMapper pushNotificationMapper
    ) {
        this.publishNotificationGatewayService = publishNotificationGatewayService;
        this.pushNotificationMapper = pushNotificationMapper;
    }

    @PostMapping(":publish")
    public ResponseEntity<PublishNotificationResponse> publishPrivateNotification(
            @RequestBody PublishNotificationCommand publishNotificationCommand
    ) {
        return null;
//        return ResponseEntity.created(URI.create())
    }
}
