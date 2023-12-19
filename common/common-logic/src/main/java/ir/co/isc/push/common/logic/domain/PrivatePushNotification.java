package ir.co.isc.push.common.logic.domain;


import ir.co.isc.push.common.logic.valueobject.PushNotificationId;
import ir.co.isc.push.common.logic.valueobject.PushNotificationStatus;
import ir.co.isc.push.common.logic.valueobject.PushNotificationTrackId;

import java.util.UUID;

public class PrivatePushNotification extends BaseDomainModel<PushNotificationId> {

    private String title;
    private String message;
    private PushNotificationStatus status;
    private PushNotificationTrackId trackId;

    private PrivatePushNotification() {}

    public static PrivatePushNotification createPushNotification(String title, String message) {
        PrivatePushNotification privatePushNotification = new PrivatePushNotification();
        privatePushNotification.setId(new PushNotificationId(UUID.randomUUID()));
        privatePushNotification.title = title;
        privatePushNotification.message = message;
        privatePushNotification.status = PushNotificationStatus.NOT_DELIVERED;
        privatePushNotification.trackId = new PushNotificationTrackId(UUID.randomUUID());

        return privatePushNotification;
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
