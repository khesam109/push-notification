package ir.co.isc.push.gateway.logic.dto;

public record PublishNotificationCommand(
        String clientToken,
        String title,
        String message
) {
}
