package p793ho;

import com.google.protobuf.InterfaceC12151f0;

/* JADX INFO: renamed from: ho.J */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC14600J implements InterfaceC12151f0 {
    ROOM_CREATED(0),
    ROOM_ENDED(1),
    PARTICIPANT_JOINED(2),
    PARTICIPANT_LEFT(3),
    TRACK_PUBLISHED(4),
    TRACK_PUBLISH_REQUESTED(20),
    TRACK_UNPUBLISHED(5),
    TRACK_SUBSCRIBED(6),
    TRACK_SUBSCRIBE_REQUESTED(21),
    TRACK_SUBSCRIBE_FAILED(25),
    TRACK_UNSUBSCRIBED(7),
    TRACK_PUBLISHED_UPDATE(10),
    TRACK_MUTED(23),
    TRACK_UNMUTED(24),
    TRACK_PUBLISH_STATS(26),
    TRACK_SUBSCRIBE_STATS(27),
    PARTICIPANT_ACTIVE(11),
    PARTICIPANT_RESUMED(22),
    EGRESS_STARTED(12),
    EGRESS_ENDED(13),
    EGRESS_UPDATED(28),
    TRACK_MAX_SUBSCRIBED_VIDEO_QUALITY(14),
    RECONNECTED(15),
    INGRESS_CREATED(18),
    INGRESS_DELETED(19),
    INGRESS_STARTED(16),
    INGRESS_ENDED(17),
    INGRESS_UPDATED(29),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: Y */
    public final int f45894Y;

    EnumC14600J(int i10) {
        this.f45894Y = i10;
    }

    @Override // com.google.protobuf.InterfaceC12151f0
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f45894Y;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
