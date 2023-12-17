package ir.co.isc.push.common.logic.domain;


import ir.co.isc.push.common.logic.valueobject.PushNotificationId;
import ir.co.isc.push.common.logic.valueobject.PushNotificationStatus;
import ir.co.isc.push.common.logic.valueobject.PushNotificationTrackId;

import java.util.UUID;

public class PushNotification extends BaseDomainModel<PushNotificationId> {

    private String title;
    private String message;
    private PushNotificationStatus status;
    private PushNotificationTrackId trackId;

    private PushNotification() {}

    public static PushNotification createPushNotification(String title, String message) {
        PushNotification pushNotification = new PushNotification();
        pushNotification.setId(new PushNotificationId(UUID.randomUUID()));
        pushNotification.title = title;
        pushNotification.message = message;
        pushNotification.status = PushNotificationStatus.NOT_DELIVERED;
        pushNotification.trackId = new PushNotificationTrackId(UUID.randomUUID());

        return pushNotification;
    }

    public String getTitle() {
        return title;
    }

    public String getMessage() {
        return message;
    }

    public PushNotificationStatus getStatus() {
        return status;
    }

    public PushNotificationTrackId getTrackId() {
        return trackId;
    }
}
