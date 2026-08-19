package livekit;

import com.google.protobuf.AbstractC12133Z;
import com.google.protobuf.AbstractC12138b;
import com.google.protobuf.AbstractC12171m;
import com.google.protobuf.AbstractC12186r;
import com.google.protobuf.C12087F;
import com.google.protobuf.C12123U;
import com.google.protobuf.EnumC12131Y;
import com.google.protobuf.InterfaceC12094H0;
import com.google.protobuf.InterfaceC12124U0;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p793ho.C14553B4;
import p793ho.C14567D4;
import p793ho.C14574E4;
import p793ho.C14581F4;
import p793ho.C14598I3;
import p793ho.C14628N3;
import p793ho.C14640P3;
import p793ho.C14646Q3;
import p793ho.C14651R3;
import p793ho.C14663T3;
import p793ho.C14669U3;
import p793ho.C14693Y3;
import p793ho.C14706a4;
import p793ho.C14713b4;
import p793ho.C14734e4;
import p793ho.C14783l4;
import p793ho.C14811p4;
import p793ho.C14846u4;
import p793ho.C14860w4;
import p793ho.C14867x4;
import p793ho.EnumC14741f4;

/* JADX INFO: loaded from: classes2.dex */
public final class LivekitRtc$SignalResponse extends AbstractC12133Z implements InterfaceC12094H0 {
    public static final int ANSWER_FIELD_NUMBER = 2;
    public static final int CONNECTION_QUALITY_FIELD_NUMBER = 12;
    private static final LivekitRtc$SignalResponse DEFAULT_INSTANCE;
    public static final int JOIN_FIELD_NUMBER = 1;
    public static final int LEAVE_FIELD_NUMBER = 8;
    public static final int MUTE_FIELD_NUMBER = 9;
    public static final int OFFER_FIELD_NUMBER = 3;
    private static volatile InterfaceC12124U0 PARSER = null;
    public static final int PONG_FIELD_NUMBER = 18;
    public static final int PONG_RESP_FIELD_NUMBER = 20;
    public static final int RECONNECT_FIELD_NUMBER = 19;
    public static final int REFRESH_TOKEN_FIELD_NUMBER = 16;
    public static final int REQUEST_RESPONSE_FIELD_NUMBER = 22;
    public static final int ROOM_UPDATE_FIELD_NUMBER = 11;
    public static final int SPEAKERS_CHANGED_FIELD_NUMBER = 10;
    public static final int STREAM_STATE_UPDATE_FIELD_NUMBER = 13;
    public static final int SUBSCRIBED_QUALITY_UPDATE_FIELD_NUMBER = 14;
    public static final int SUBSCRIPTION_PERMISSION_UPDATE_FIELD_NUMBER = 15;
    public static final int SUBSCRIPTION_RESPONSE_FIELD_NUMBER = 21;
    public static final int TRACK_PUBLISHED_FIELD_NUMBER = 6;
    public static final int TRACK_SUBSCRIBED_FIELD_NUMBER = 23;
    public static final int TRACK_UNPUBLISHED_FIELD_NUMBER = 17;
    public static final int TRICKLE_FIELD_NUMBER = 4;
    public static final int UPDATE_FIELD_NUMBER = 5;
    private int messageCase_ = 0;
    private Object message_;

    static {
        LivekitRtc$SignalResponse livekitRtc$SignalResponse = new LivekitRtc$SignalResponse();
        DEFAULT_INSTANCE = livekitRtc$SignalResponse;
        AbstractC12133Z.registerDefaultInstance(LivekitRtc$SignalResponse.class, livekitRtc$SignalResponse);
    }

    private LivekitRtc$SignalResponse() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAnswer() {
        if (this.messageCase_ == 2) {
            this.messageCase_ = 0;
            this.message_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearConnectionQuality() {
        if (this.messageCase_ == 12) {
            this.messageCase_ = 0;
            this.message_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearJoin() {
        if (this.messageCase_ == 1) {
            this.messageCase_ = 0;
            this.message_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLeave() {
        if (this.messageCase_ == 8) {
            this.messageCase_ = 0;
            this.message_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMessage() {
        this.messageCase_ = 0;
        this.message_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMute() {
        if (this.messageCase_ == 9) {
            this.messageCase_ = 0;
            this.message_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOffer() {
        if (this.messageCase_ == 3) {
            this.messageCase_ = 0;
            this.message_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPong() {
        if (this.messageCase_ == 18) {
            this.messageCase_ = 0;
            this.message_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPongResp() {
        if (this.messageCase_ == 20) {
            this.messageCase_ = 0;
            this.message_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReconnect() {
        if (this.messageCase_ == 19) {
            this.messageCase_ = 0;
            this.message_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRefreshToken() {
        if (this.messageCase_ == 16) {
            this.messageCase_ = 0;
            this.message_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRequestResponse() {
        if (this.messageCase_ == 22) {
            this.messageCase_ = 0;
            this.message_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRoomUpdate() {
        if (this.messageCase_ == 11) {
            this.messageCase_ = 0;
            this.message_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSpeakersChanged() {
        if (this.messageCase_ == 10) {
            this.messageCase_ = 0;
            this.message_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStreamStateUpdate() {
        if (this.messageCase_ == 13) {
            this.messageCase_ = 0;
            this.message_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSubscribedQualityUpdate() {
        if (this.messageCase_ == 14) {
            this.messageCase_ = 0;
            this.message_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSubscriptionPermissionUpdate() {
        if (this.messageCase_ == 15) {
            this.messageCase_ = 0;
            this.message_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSubscriptionResponse() {
        if (this.messageCase_ == 21) {
            this.messageCase_ = 0;
            this.message_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTrackPublished() {
        if (this.messageCase_ == 6) {
            this.messageCase_ = 0;
            this.message_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTrackSubscribed() {
        if (this.messageCase_ == 23) {
            this.messageCase_ = 0;
            this.message_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTrackUnpublished() {
        if (this.messageCase_ == 17) {
            this.messageCase_ = 0;
            this.message_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTrickle() {
        if (this.messageCase_ == 4) {
            this.messageCase_ = 0;
            this.message_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUpdate() {
        if (this.messageCase_ == 5) {
            this.messageCase_ = 0;
            this.message_ = null;
        }
    }

    public static LivekitRtc$SignalResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAnswer(LivekitRtc$SessionDescription livekitRtc$SessionDescription) {
        livekitRtc$SessionDescription.getClass();
        if (this.messageCase_ != 2 || this.message_ == LivekitRtc$SessionDescription.getDefaultInstance()) {
            this.message_ = livekitRtc$SessionDescription;
        } else {
            C14713b4 c14713b4NewBuilder = LivekitRtc$SessionDescription.newBuilder((LivekitRtc$SessionDescription) this.message_);
            c14713b4NewBuilder.m13865f(livekitRtc$SessionDescription);
            this.message_ = c14713b4NewBuilder.m13862c();
        }
        this.messageCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeConnectionQuality(LivekitRtc$ConnectionQualityUpdate livekitRtc$ConnectionQualityUpdate) {
        livekitRtc$ConnectionQualityUpdate.getClass();
        if (this.messageCase_ != 12 || this.message_ == LivekitRtc$ConnectionQualityUpdate.getDefaultInstance()) {
            this.message_ = livekitRtc$ConnectionQualityUpdate;
        } else {
            C14598I3 c14598i3NewBuilder = LivekitRtc$ConnectionQualityUpdate.newBuilder((LivekitRtc$ConnectionQualityUpdate) this.message_);
            c14598i3NewBuilder.m13865f(livekitRtc$ConnectionQualityUpdate);
            this.message_ = c14598i3NewBuilder.m13862c();
        }
        this.messageCase_ = 12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeJoin(LivekitRtc$JoinResponse livekitRtc$JoinResponse) {
        livekitRtc$JoinResponse.getClass();
        if (this.messageCase_ != 1 || this.message_ == LivekitRtc$JoinResponse.getDefaultInstance()) {
            this.message_ = livekitRtc$JoinResponse;
        } else {
            C14628N3 c14628n3NewBuilder = LivekitRtc$JoinResponse.newBuilder((LivekitRtc$JoinResponse) this.message_);
            c14628n3NewBuilder.m13865f(livekitRtc$JoinResponse);
            this.message_ = c14628n3NewBuilder.m13862c();
        }
        this.messageCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeLeave(LivekitRtc$LeaveRequest livekitRtc$LeaveRequest) {
        livekitRtc$LeaveRequest.getClass();
        if (this.messageCase_ != 8 || this.message_ == LivekitRtc$LeaveRequest.getDefaultInstance()) {
            this.message_ = livekitRtc$LeaveRequest;
        } else {
            C14640P3 c14640p3NewBuilder = LivekitRtc$LeaveRequest.newBuilder((LivekitRtc$LeaveRequest) this.message_);
            c14640p3NewBuilder.m13865f(livekitRtc$LeaveRequest);
            this.message_ = c14640p3NewBuilder.m13862c();
        }
        this.messageCase_ = 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMute(LivekitRtc$MuteTrackRequest livekitRtc$MuteTrackRequest) {
        livekitRtc$MuteTrackRequest.getClass();
        if (this.messageCase_ != 9 || this.message_ == LivekitRtc$MuteTrackRequest.getDefaultInstance()) {
            this.message_ = livekitRtc$MuteTrackRequest;
        } else {
            C14646Q3 c14646q3NewBuilder = LivekitRtc$MuteTrackRequest.newBuilder((LivekitRtc$MuteTrackRequest) this.message_);
            c14646q3NewBuilder.m13865f(livekitRtc$MuteTrackRequest);
            this.message_ = c14646q3NewBuilder.m13862c();
        }
        this.messageCase_ = 9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeOffer(LivekitRtc$SessionDescription livekitRtc$SessionDescription) {
        livekitRtc$SessionDescription.getClass();
        if (this.messageCase_ != 3 || this.message_ == LivekitRtc$SessionDescription.getDefaultInstance()) {
            this.message_ = livekitRtc$SessionDescription;
        } else {
            C14713b4 c14713b4NewBuilder = LivekitRtc$SessionDescription.newBuilder((LivekitRtc$SessionDescription) this.message_);
            c14713b4NewBuilder.m13865f(livekitRtc$SessionDescription);
            this.message_ = c14713b4NewBuilder.m13862c();
        }
        this.messageCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePongResp(LivekitRtc$Pong livekitRtc$Pong) {
        livekitRtc$Pong.getClass();
        if (this.messageCase_ != 20 || this.message_ == LivekitRtc$Pong.getDefaultInstance()) {
            this.message_ = livekitRtc$Pong;
        } else {
            C14663T3 c14663t3NewBuilder = LivekitRtc$Pong.newBuilder((LivekitRtc$Pong) this.message_);
            c14663t3NewBuilder.m13865f(livekitRtc$Pong);
            this.message_ = c14663t3NewBuilder.m13862c();
        }
        this.messageCase_ = 20;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeReconnect(LivekitRtc$ReconnectResponse livekitRtc$ReconnectResponse) {
        livekitRtc$ReconnectResponse.getClass();
        if (this.messageCase_ != 19 || this.message_ == LivekitRtc$ReconnectResponse.getDefaultInstance()) {
            this.message_ = livekitRtc$ReconnectResponse;
        } else {
            C14669U3 c14669u3NewBuilder = LivekitRtc$ReconnectResponse.newBuilder((LivekitRtc$ReconnectResponse) this.message_);
            c14669u3NewBuilder.m13865f(livekitRtc$ReconnectResponse);
            this.message_ = c14669u3NewBuilder.m13862c();
        }
        this.messageCase_ = 19;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRequestResponse(LivekitRtc$RequestResponse livekitRtc$RequestResponse) {
        livekitRtc$RequestResponse.getClass();
        if (this.messageCase_ != 22 || this.message_ == LivekitRtc$RequestResponse.getDefaultInstance()) {
            this.message_ = livekitRtc$RequestResponse;
        } else {
            C14693Y3 c14693y3NewBuilder = LivekitRtc$RequestResponse.newBuilder((LivekitRtc$RequestResponse) this.message_);
            c14693y3NewBuilder.m13865f(livekitRtc$RequestResponse);
            this.message_ = c14693y3NewBuilder.m13862c();
        }
        this.messageCase_ = 22;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRoomUpdate(LivekitRtc$RoomUpdate livekitRtc$RoomUpdate) {
        livekitRtc$RoomUpdate.getClass();
        if (this.messageCase_ != 11 || this.message_ == LivekitRtc$RoomUpdate.getDefaultInstance()) {
            this.message_ = livekitRtc$RoomUpdate;
        } else {
            C14706a4 c14706a4NewBuilder = LivekitRtc$RoomUpdate.newBuilder((LivekitRtc$RoomUpdate) this.message_);
            c14706a4NewBuilder.m13865f(livekitRtc$RoomUpdate);
            this.message_ = c14706a4NewBuilder.m13862c();
        }
        this.messageCase_ = 11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSpeakersChanged(LivekitRtc$SpeakersChanged livekitRtc$SpeakersChanged) {
        livekitRtc$SpeakersChanged.getClass();
        if (this.messageCase_ != 10 || this.message_ == LivekitRtc$SpeakersChanged.getDefaultInstance()) {
            this.message_ = livekitRtc$SpeakersChanged;
        } else {
            C14783l4 c14783l4NewBuilder = LivekitRtc$SpeakersChanged.newBuilder((LivekitRtc$SpeakersChanged) this.message_);
            c14783l4NewBuilder.m13865f(livekitRtc$SpeakersChanged);
            this.message_ = c14783l4NewBuilder.m13862c();
        }
        this.messageCase_ = 10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeStreamStateUpdate(LivekitRtc$StreamStateUpdate livekitRtc$StreamStateUpdate) {
        livekitRtc$StreamStateUpdate.getClass();
        if (this.messageCase_ != 13 || this.message_ == LivekitRtc$StreamStateUpdate.getDefaultInstance()) {
            this.message_ = livekitRtc$StreamStateUpdate;
        } else {
            C14811p4 c14811p4NewBuilder = LivekitRtc$StreamStateUpdate.newBuilder((LivekitRtc$StreamStateUpdate) this.message_);
            c14811p4NewBuilder.m13865f(livekitRtc$StreamStateUpdate);
            this.message_ = c14811p4NewBuilder.m13862c();
        }
        this.messageCase_ = 13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSubscribedQualityUpdate(LivekitRtc$SubscribedQualityUpdate livekitRtc$SubscribedQualityUpdate) {
        livekitRtc$SubscribedQualityUpdate.getClass();
        if (this.messageCase_ != 14 || this.message_ == LivekitRtc$SubscribedQualityUpdate.getDefaultInstance()) {
            this.message_ = livekitRtc$SubscribedQualityUpdate;
        } else {
            C14846u4 c14846u4NewBuilder = LivekitRtc$SubscribedQualityUpdate.newBuilder((LivekitRtc$SubscribedQualityUpdate) this.message_);
            c14846u4NewBuilder.m13865f(livekitRtc$SubscribedQualityUpdate);
            this.message_ = c14846u4NewBuilder.m13862c();
        }
        this.messageCase_ = 14;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSubscriptionPermissionUpdate(LivekitRtc$SubscriptionPermissionUpdate livekitRtc$SubscriptionPermissionUpdate) {
        livekitRtc$SubscriptionPermissionUpdate.getClass();
        if (this.messageCase_ != 15 || this.message_ == LivekitRtc$SubscriptionPermissionUpdate.getDefaultInstance()) {
            this.message_ = livekitRtc$SubscriptionPermissionUpdate;
        } else {
            C14860w4 c14860w4NewBuilder = LivekitRtc$SubscriptionPermissionUpdate.newBuilder((LivekitRtc$SubscriptionPermissionUpdate) this.message_);
            c14860w4NewBuilder.m13865f(livekitRtc$SubscriptionPermissionUpdate);
            this.message_ = c14860w4NewBuilder.m13862c();
        }
        this.messageCase_ = 15;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSubscriptionResponse(LivekitRtc$SubscriptionResponse livekitRtc$SubscriptionResponse) {
        livekitRtc$SubscriptionResponse.getClass();
        if (this.messageCase_ != 21 || this.message_ == LivekitRtc$SubscriptionResponse.getDefaultInstance()) {
            this.message_ = livekitRtc$SubscriptionResponse;
        } else {
            C14867x4 c14867x4NewBuilder = LivekitRtc$SubscriptionResponse.newBuilder((LivekitRtc$SubscriptionResponse) this.message_);
            c14867x4NewBuilder.m13865f(livekitRtc$SubscriptionResponse);
            this.message_ = c14867x4NewBuilder.m13862c();
        }
        this.messageCase_ = 21;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTrackPublished(LivekitRtc$TrackPublishedResponse livekitRtc$TrackPublishedResponse) {
        livekitRtc$TrackPublishedResponse.getClass();
        if (this.messageCase_ != 6 || this.message_ == LivekitRtc$TrackPublishedResponse.getDefaultInstance()) {
            this.message_ = livekitRtc$TrackPublishedResponse;
        } else {
            C14553B4 c14553b4NewBuilder = LivekitRtc$TrackPublishedResponse.newBuilder((LivekitRtc$TrackPublishedResponse) this.message_);
            c14553b4NewBuilder.m13865f(livekitRtc$TrackPublishedResponse);
            this.message_ = c14553b4NewBuilder.m13862c();
        }
        this.messageCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTrackSubscribed(LivekitRtc$TrackSubscribed livekitRtc$TrackSubscribed) {
        livekitRtc$TrackSubscribed.getClass();
        if (this.messageCase_ != 23 || this.message_ == LivekitRtc$TrackSubscribed.getDefaultInstance()) {
            this.message_ = livekitRtc$TrackSubscribed;
        } else {
            C14567D4 c14567d4NewBuilder = LivekitRtc$TrackSubscribed.newBuilder((LivekitRtc$TrackSubscribed) this.message_);
            c14567d4NewBuilder.m13865f(livekitRtc$TrackSubscribed);
            this.message_ = c14567d4NewBuilder.m13862c();
        }
        this.messageCase_ = 23;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTrackUnpublished(LivekitRtc$TrackUnpublishedResponse livekitRtc$TrackUnpublishedResponse) {
        livekitRtc$TrackUnpublishedResponse.getClass();
        if (this.messageCase_ != 17 || this.message_ == LivekitRtc$TrackUnpublishedResponse.getDefaultInstance()) {
            this.message_ = livekitRtc$TrackUnpublishedResponse;
        } else {
            C14574E4 c14574e4NewBuilder = LivekitRtc$TrackUnpublishedResponse.newBuilder((LivekitRtc$TrackUnpublishedResponse) this.message_);
            c14574e4NewBuilder.m13865f(livekitRtc$TrackUnpublishedResponse);
            this.message_ = c14574e4NewBuilder.m13862c();
        }
        this.messageCase_ = 17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTrickle(LivekitRtc$TrickleRequest livekitRtc$TrickleRequest) {
        livekitRtc$TrickleRequest.getClass();
        if (this.messageCase_ != 4 || this.message_ == LivekitRtc$TrickleRequest.getDefaultInstance()) {
            this.message_ = livekitRtc$TrickleRequest;
        } else {
            C14581F4 c14581f4NewBuilder = LivekitRtc$TrickleRequest.newBuilder((LivekitRtc$TrickleRequest) this.message_);
            c14581f4NewBuilder.m13865f(livekitRtc$TrickleRequest);
            this.message_ = c14581f4NewBuilder.m13862c();
        }
        this.messageCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeUpdate(LivekitRtc$ParticipantUpdate livekitRtc$ParticipantUpdate) {
        livekitRtc$ParticipantUpdate.getClass();
        if (this.messageCase_ != 5 || this.message_ == LivekitRtc$ParticipantUpdate.getDefaultInstance()) {
            this.message_ = livekitRtc$ParticipantUpdate;
        } else {
            C14651R3 c14651r3NewBuilder = LivekitRtc$ParticipantUpdate.newBuilder((LivekitRtc$ParticipantUpdate) this.message_);
            c14651r3NewBuilder.m13865f(livekitRtc$ParticipantUpdate);
            this.message_ = c14651r3NewBuilder.m13862c();
        }
        this.messageCase_ = 5;
    }

    public static C14734e4 newBuilder() {
        return (C14734e4) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitRtc$SignalResponse parseDelimitedFrom(InputStream inputStream) {
        return (LivekitRtc$SignalResponse) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitRtc$SignalResponse parseFrom(ByteBuffer byteBuffer) {
        return (LivekitRtc$SignalResponse) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC12124U0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAnswer(LivekitRtc$SessionDescription livekitRtc$SessionDescription) {
        livekitRtc$SessionDescription.getClass();
        this.message_ = livekitRtc$SessionDescription;
        this.messageCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConnectionQuality(LivekitRtc$ConnectionQualityUpdate livekitRtc$ConnectionQualityUpdate) {
        livekitRtc$ConnectionQualityUpdate.getClass();
        this.message_ = livekitRtc$ConnectionQualityUpdate;
        this.messageCase_ = 12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJoin(LivekitRtc$JoinResponse livekitRtc$JoinResponse) {
        livekitRtc$JoinResponse.getClass();
        this.message_ = livekitRtc$JoinResponse;
        this.messageCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLeave(LivekitRtc$LeaveRequest livekitRtc$LeaveRequest) {
        livekitRtc$LeaveRequest.getClass();
        this.message_ = livekitRtc$LeaveRequest;
        this.messageCase_ = 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMute(LivekitRtc$MuteTrackRequest livekitRtc$MuteTrackRequest) {
        livekitRtc$MuteTrackRequest.getClass();
        this.message_ = livekitRtc$MuteTrackRequest;
        this.messageCase_ = 9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOffer(LivekitRtc$SessionDescription livekitRtc$SessionDescription) {
        livekitRtc$SessionDescription.getClass();
        this.message_ = livekitRtc$SessionDescription;
        this.messageCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPong(long j10) {
        this.messageCase_ = 18;
        this.message_ = Long.valueOf(j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPongResp(LivekitRtc$Pong livekitRtc$Pong) {
        livekitRtc$Pong.getClass();
        this.message_ = livekitRtc$Pong;
        this.messageCase_ = 20;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReconnect(LivekitRtc$ReconnectResponse livekitRtc$ReconnectResponse) {
        livekitRtc$ReconnectResponse.getClass();
        this.message_ = livekitRtc$ReconnectResponse;
        this.messageCase_ = 19;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRefreshToken(String str) {
        str.getClass();
        this.messageCase_ = 16;
        this.message_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRefreshTokenBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.message_ = abstractC12171m.m14012w();
        this.messageCase_ = 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRequestResponse(LivekitRtc$RequestResponse livekitRtc$RequestResponse) {
        livekitRtc$RequestResponse.getClass();
        this.message_ = livekitRtc$RequestResponse;
        this.messageCase_ = 22;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRoomUpdate(LivekitRtc$RoomUpdate livekitRtc$RoomUpdate) {
        livekitRtc$RoomUpdate.getClass();
        this.message_ = livekitRtc$RoomUpdate;
        this.messageCase_ = 11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSpeakersChanged(LivekitRtc$SpeakersChanged livekitRtc$SpeakersChanged) {
        livekitRtc$SpeakersChanged.getClass();
        this.message_ = livekitRtc$SpeakersChanged;
        this.messageCase_ = 10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStreamStateUpdate(LivekitRtc$StreamStateUpdate livekitRtc$StreamStateUpdate) {
        livekitRtc$StreamStateUpdate.getClass();
        this.message_ = livekitRtc$StreamStateUpdate;
        this.messageCase_ = 13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSubscribedQualityUpdate(LivekitRtc$SubscribedQualityUpdate livekitRtc$SubscribedQualityUpdate) {
        livekitRtc$SubscribedQualityUpdate.getClass();
        this.message_ = livekitRtc$SubscribedQualityUpdate;
        this.messageCase_ = 14;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSubscriptionPermissionUpdate(LivekitRtc$SubscriptionPermissionUpdate livekitRtc$SubscriptionPermissionUpdate) {
        livekitRtc$SubscriptionPermissionUpdate.getClass();
        this.message_ = livekitRtc$SubscriptionPermissionUpdate;
        this.messageCase_ = 15;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSubscriptionResponse(LivekitRtc$SubscriptionResponse livekitRtc$SubscriptionResponse) {
        livekitRtc$SubscriptionResponse.getClass();
        this.message_ = livekitRtc$SubscriptionResponse;
        this.messageCase_ = 21;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTrackPublished(LivekitRtc$TrackPublishedResponse livekitRtc$TrackPublishedResponse) {
        livekitRtc$TrackPublishedResponse.getClass();
        this.message_ = livekitRtc$TrackPublishedResponse;
        this.messageCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTrackSubscribed(LivekitRtc$TrackSubscribed livekitRtc$TrackSubscribed) {
        livekitRtc$TrackSubscribed.getClass();
        this.message_ = livekitRtc$TrackSubscribed;
        this.messageCase_ = 23;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTrackUnpublished(LivekitRtc$TrackUnpublishedResponse livekitRtc$TrackUnpublishedResponse) {
        livekitRtc$TrackUnpublishedResponse.getClass();
        this.message_ = livekitRtc$TrackUnpublishedResponse;
        this.messageCase_ = 17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTrickle(LivekitRtc$TrickleRequest livekitRtc$TrickleRequest) {
        livekitRtc$TrickleRequest.getClass();
        this.message_ = livekitRtc$TrickleRequest;
        this.messageCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUpdate(LivekitRtc$ParticipantUpdate livekitRtc$ParticipantUpdate) {
        livekitRtc$ParticipantUpdate.getClass();
        this.message_ = livekitRtc$ParticipantUpdate;
        this.messageCase_ = 5;
    }

    @Override // com.google.protobuf.AbstractC12133Z
    public final Object dynamicMethod(EnumC12131Y enumC12131Y, Object obj, Object obj2) {
        switch (enumC12131Y.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AbstractC12133Z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0016\u0001\u0000\u0001\u0017\u0016\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\b<\u0000\t<\u0000\n<\u0000\u000b<\u0000\f<\u0000\r<\u0000\u000e<\u0000\u000f<\u0000\u0010Ȼ\u0000\u0011<\u0000\u00125\u0000\u0013<\u0000\u0014<\u0000\u0015<\u0000\u0016<\u0000\u0017<\u0000", new Object[]{"message_", "messageCase_", LivekitRtc$JoinResponse.class, LivekitRtc$SessionDescription.class, LivekitRtc$SessionDescription.class, LivekitRtc$TrickleRequest.class, LivekitRtc$ParticipantUpdate.class, LivekitRtc$TrackPublishedResponse.class, LivekitRtc$LeaveRequest.class, LivekitRtc$MuteTrackRequest.class, LivekitRtc$SpeakersChanged.class, LivekitRtc$RoomUpdate.class, LivekitRtc$ConnectionQualityUpdate.class, LivekitRtc$StreamStateUpdate.class, LivekitRtc$SubscribedQualityUpdate.class, LivekitRtc$SubscriptionPermissionUpdate.class, LivekitRtc$TrackUnpublishedResponse.class, LivekitRtc$ReconnectResponse.class, LivekitRtc$Pong.class, LivekitRtc$SubscriptionResponse.class, LivekitRtc$RequestResponse.class, LivekitRtc$TrackSubscribed.class});
            case 3:
                return new LivekitRtc$SignalResponse();
            case 4:
                return new C14734e4(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC12124U0 c12123u = PARSER;
                if (c12123u == null) {
                    synchronized (LivekitRtc$SignalResponse.class) {
                        try {
                            c12123u = PARSER;
                            if (c12123u == null) {
                                c12123u = new C12123U();
                                PARSER = c12123u;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                        break;
                    }
                }
                return c12123u;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public LivekitRtc$SessionDescription getAnswer() {
        return this.messageCase_ == 2 ? (LivekitRtc$SessionDescription) this.message_ : LivekitRtc$SessionDescription.getDefaultInstance();
    }

    public LivekitRtc$ConnectionQualityUpdate getConnectionQuality() {
        return this.messageCase_ == 12 ? (LivekitRtc$ConnectionQualityUpdate) this.message_ : LivekitRtc$ConnectionQualityUpdate.getDefaultInstance();
    }

    public LivekitRtc$JoinResponse getJoin() {
        return this.messageCase_ == 1 ? (LivekitRtc$JoinResponse) this.message_ : LivekitRtc$JoinResponse.getDefaultInstance();
    }

    public LivekitRtc$LeaveRequest getLeave() {
        return this.messageCase_ == 8 ? (LivekitRtc$LeaveRequest) this.message_ : LivekitRtc$LeaveRequest.getDefaultInstance();
    }

    public EnumC14741f4 getMessageCase() {
        switch (this.messageCase_) {
            case 0:
                return EnumC14741f4.f46101I0;
            case 1:
                return EnumC14741f4.f46103Y;
            case 2:
                return EnumC14741f4.f46104Z;
            case 3:
                return EnumC14741f4.f46105o0;
            case 4:
                return EnumC14741f4.f46106p0;
            case 5:
                return EnumC14741f4.f46107q0;
            case 6:
                return EnumC14741f4.f46108r0;
            case 7:
            default:
                return null;
            case 8:
                return EnumC14741f4.f46109s0;
            case 9:
                return EnumC14741f4.f46110t0;
            case 10:
                return EnumC14741f4.f46111u0;
            case 11:
                return EnumC14741f4.f46112v0;
            case 12:
                return EnumC14741f4.f46113w0;
            case 13:
                return EnumC14741f4.f46114x0;
            case 14:
                return EnumC14741f4.f46115y0;
            case 15:
                return EnumC14741f4.f46116z0;
            case 16:
                return EnumC14741f4.f46093A0;
            case 17:
                return EnumC14741f4.f46094B0;
            case 18:
                return EnumC14741f4.f46095C0;
            case 19:
                return EnumC14741f4.f46096D0;
            case 20:
                return EnumC14741f4.f46097E0;
            case 21:
                return EnumC14741f4.f46098F0;
            case 22:
                return EnumC14741f4.f46099G0;
            case 23:
                return EnumC14741f4.f46100H0;
        }
    }

    public LivekitRtc$MuteTrackRequest getMute() {
        return this.messageCase_ == 9 ? (LivekitRtc$MuteTrackRequest) this.message_ : LivekitRtc$MuteTrackRequest.getDefaultInstance();
    }

    public LivekitRtc$SessionDescription getOffer() {
        return this.messageCase_ == 3 ? (LivekitRtc$SessionDescription) this.message_ : LivekitRtc$SessionDescription.getDefaultInstance();
    }

    public long getPong() {
        if (this.messageCase_ == 18) {
            return ((Long) this.message_).longValue();
        }
        return 0L;
    }

    public LivekitRtc$Pong getPongResp() {
        return this.messageCase_ == 20 ? (LivekitRtc$Pong) this.message_ : LivekitRtc$Pong.getDefaultInstance();
    }

    public LivekitRtc$ReconnectResponse getReconnect() {
        return this.messageCase_ == 19 ? (LivekitRtc$ReconnectResponse) this.message_ : LivekitRtc$ReconnectResponse.getDefaultInstance();
    }

    public String getRefreshToken() {
        return this.messageCase_ == 16 ? (String) this.message_ : "";
    }

    public AbstractC12171m getRefreshTokenBytes() {
        return AbstractC12171m.m14011m(this.messageCase_ == 16 ? (String) this.message_ : "");
    }

    public LivekitRtc$RequestResponse getRequestResponse() {
        return this.messageCase_ == 22 ? (LivekitRtc$RequestResponse) this.message_ : LivekitRtc$RequestResponse.getDefaultInstance();
    }

    public LivekitRtc$RoomUpdate getRoomUpdate() {
        return this.messageCase_ == 11 ? (LivekitRtc$RoomUpdate) this.message_ : LivekitRtc$RoomUpdate.getDefaultInstance();
    }

    public LivekitRtc$SpeakersChanged getSpeakersChanged() {
        return this.messageCase_ == 10 ? (LivekitRtc$SpeakersChanged) this.message_ : LivekitRtc$SpeakersChanged.getDefaultInstance();
    }

    public LivekitRtc$StreamStateUpdate getStreamStateUpdate() {
        return this.messageCase_ == 13 ? (LivekitRtc$StreamStateUpdate) this.message_ : LivekitRtc$StreamStateUpdate.getDefaultInstance();
    }

    public LivekitRtc$SubscribedQualityUpdate getSubscribedQualityUpdate() {
        return this.messageCase_ == 14 ? (LivekitRtc$SubscribedQualityUpdate) this.message_ : LivekitRtc$SubscribedQualityUpdate.getDefaultInstance();
    }

    public LivekitRtc$SubscriptionPermissionUpdate getSubscriptionPermissionUpdate() {
        return this.messageCase_ == 15 ? (LivekitRtc$SubscriptionPermissionUpdate) this.message_ : LivekitRtc$SubscriptionPermissionUpdate.getDefaultInstance();
    }

    public LivekitRtc$SubscriptionResponse getSubscriptionResponse() {
        return this.messageCase_ == 21 ? (LivekitRtc$SubscriptionResponse) this.message_ : LivekitRtc$SubscriptionResponse.getDefaultInstance();
    }

    public LivekitRtc$TrackPublishedResponse getTrackPublished() {
        return this.messageCase_ == 6 ? (LivekitRtc$TrackPublishedResponse) this.message_ : LivekitRtc$TrackPublishedResponse.getDefaultInstance();
    }

    public LivekitRtc$TrackSubscribed getTrackSubscribed() {
        return this.messageCase_ == 23 ? (LivekitRtc$TrackSubscribed) this.message_ : LivekitRtc$TrackSubscribed.getDefaultInstance();
    }

    public LivekitRtc$TrackUnpublishedResponse getTrackUnpublished() {
        return this.messageCase_ == 17 ? (LivekitRtc$TrackUnpublishedResponse) this.message_ : LivekitRtc$TrackUnpublishedResponse.getDefaultInstance();
    }

    public LivekitRtc$TrickleRequest getTrickle() {
        return this.messageCase_ == 4 ? (LivekitRtc$TrickleRequest) this.message_ : LivekitRtc$TrickleRequest.getDefaultInstance();
    }

    public LivekitRtc$ParticipantUpdate getUpdate() {
        return this.messageCase_ == 5 ? (LivekitRtc$ParticipantUpdate) this.message_ : LivekitRtc$ParticipantUpdate.getDefaultInstance();
    }

    public boolean hasAnswer() {
        return this.messageCase_ == 2;
    }

    public boolean hasConnectionQuality() {
        return this.messageCase_ == 12;
    }

    public boolean hasJoin() {
        return this.messageCase_ == 1;
    }

    public boolean hasLeave() {
        return this.messageCase_ == 8;
    }

    public boolean hasMute() {
        return this.messageCase_ == 9;
    }

    public boolean hasOffer() {
        return this.messageCase_ == 3;
    }

    public boolean hasPong() {
        return this.messageCase_ == 18;
    }

    public boolean hasPongResp() {
        return this.messageCase_ == 20;
    }

    public boolean hasReconnect() {
        return this.messageCase_ == 19;
    }

    public boolean hasRefreshToken() {
        return this.messageCase_ == 16;
    }

    public boolean hasRequestResponse() {
        return this.messageCase_ == 22;
    }

    public boolean hasRoomUpdate() {
        return this.messageCase_ == 11;
    }

    public boolean hasSpeakersChanged() {
        return this.messageCase_ == 10;
    }

    public boolean hasStreamStateUpdate() {
        return this.messageCase_ == 13;
    }

    public boolean hasSubscribedQualityUpdate() {
        return this.messageCase_ == 14;
    }

    public boolean hasSubscriptionPermissionUpdate() {
        return this.messageCase_ == 15;
    }

    public boolean hasSubscriptionResponse() {
        return this.messageCase_ == 21;
    }

    public boolean hasTrackPublished() {
        return this.messageCase_ == 6;
    }

    public boolean hasTrackSubscribed() {
        return this.messageCase_ == 23;
    }

    public boolean hasTrackUnpublished() {
        return this.messageCase_ == 17;
    }

    public boolean hasTrickle() {
        return this.messageCase_ == 4;
    }

    public boolean hasUpdate() {
        return this.messageCase_ == 5;
    }

    public static C14734e4 newBuilder(LivekitRtc$SignalResponse livekitRtc$SignalResponse) {
        return (C14734e4) DEFAULT_INSTANCE.createBuilder(livekitRtc$SignalResponse);
    }

    public static LivekitRtc$SignalResponse parseDelimitedFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitRtc$SignalResponse) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitRtc$SignalResponse parseFrom(ByteBuffer byteBuffer, C12087F c12087f) {
        return (LivekitRtc$SignalResponse) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer, c12087f);
    }

    public static LivekitRtc$SignalResponse parseFrom(AbstractC12171m abstractC12171m) {
        return (LivekitRtc$SignalResponse) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m);
    }

    public static LivekitRtc$SignalResponse parseFrom(AbstractC12171m abstractC12171m, C12087F c12087f) {
        return (LivekitRtc$SignalResponse) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m, c12087f);
    }

    public static LivekitRtc$SignalResponse parseFrom(byte[] bArr) {
        return (LivekitRtc$SignalResponse) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitRtc$SignalResponse parseFrom(byte[] bArr, C12087F c12087f) {
        return (LivekitRtc$SignalResponse) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr, c12087f);
    }

    public static LivekitRtc$SignalResponse parseFrom(InputStream inputStream) {
        return (LivekitRtc$SignalResponse) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitRtc$SignalResponse parseFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitRtc$SignalResponse) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitRtc$SignalResponse parseFrom(AbstractC12186r abstractC12186r) {
        return (LivekitRtc$SignalResponse) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r);
    }

    public static LivekitRtc$SignalResponse parseFrom(AbstractC12186r abstractC12186r, C12087F c12087f) {
        return (LivekitRtc$SignalResponse) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r, c12087f);
    }
}
