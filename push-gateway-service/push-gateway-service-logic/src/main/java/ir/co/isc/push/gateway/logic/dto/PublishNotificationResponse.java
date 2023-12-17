package ir.co.isc.push.gateway.logic.dto;

import java.util.UUID;

public class PublishNotificationResponse {

    private UUID notificationTrackId;
    private String message;

    public UUID getNotificationTrackId() {
        return notificationTrackId;
    }

    public void setNotificationTrackId(UUID notificationTrackId) {
        this.notificationTrackId = notificationTrackId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
