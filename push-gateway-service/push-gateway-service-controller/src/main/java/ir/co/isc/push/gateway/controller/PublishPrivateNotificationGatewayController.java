package ir.co.isc.push.gateway.controller;

import ir.co.isc.push.gateway.logic.dto.PublishNotificationCommand;
import ir.co.isc.push.gateway.logic.dto.PublishNotificationResponse;
import ir.co.isc.push.gateway.logic.mapper.PushNotificationMapper;
import ir.co.isc.push.gateway.logic.port.PublishPrivateNotificationGatewayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/push-notification/private")
public class PublishPrivateNotificationGatewayController {

    private final PublishPrivateNotificationGatewayService publishPrivateNotificationGatewayService;
    private final PushNotificationMapper pushNotificationMapper;

    @Autowired
    public PublishPrivateNotificationGatewayController(
            PublishPrivateNotificationGatewayService publishPrivateNotificationGatewayService,
            PushNotificationMapper pushNotificationMapper
    ) {
        this.publishPrivateNotificationGatewayService = publishPrivateNotificationGatewayService;
        this.pushNotificationMapper = pushNotificationMapper;
    }

    @PostMapping
    public ResponseEntity<PublishNotificationResponse> publishPrivateNotification(
            @RequestBody PublishNotificationCommand publishNotificationCommand
    ) {
        PublishNotificationResponse response = publishPrivateNotificationGatewayService.publishPrivateNotification(
                pushNotificationMapper.fromPublishNotificationCommand(
                        publishNotificationCommand
                )
        );

        return ResponseEntity.created(
                ServletUriComponentsBuilder.fromCurrentRequest().path("/{trackId}").buildAndExpand(
                        response.getNotificationTrackId()
                ).toUri()
        ).body(response);
    }

    @GetMapping("/{trackId}")
    public ResponseEntity<Void> getNotificationStatus(@PathVariable UUID trackId) {
        return ResponseEntity.noContent().build();
    }
}
