package livekit;

import com.google.protobuf.AbstractC12133Z;
import com.google.protobuf.AbstractC12171m;
import com.google.protobuf.AbstractC12186r;
import com.google.protobuf.C12087F;
import com.google.protobuf.C12123U;
import com.google.protobuf.EnumC12131Y;
import com.google.protobuf.InterfaceC12094H0;
import com.google.protobuf.InterfaceC12124U0;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p793ho.C14573E3;
import p793ho.C14581F4;
import p793ho.C14587G4;
import p793ho.C14593H4;
import p793ho.C14605J4;
import p793ho.C14611K4;
import p793ho.C14617L4;
import p793ho.C14623M4;
import p793ho.C14640P3;
import p793ho.C14646Q3;
import p793ho.C14657S3;
import p793ho.C14713b4;
import p793ho.C14720c4;
import p793ho.C14755h4;
import p793ho.C14853v4;
import p793ho.C14874y4;
import p793ho.EnumC14727d4;

/* JADX INFO: loaded from: classes2.dex */
public final class LivekitRtc$SignalRequest extends AbstractC12133Z implements InterfaceC12094H0 {
    public static final int ADD_TRACK_FIELD_NUMBER = 4;
    public static final int ANSWER_FIELD_NUMBER = 2;
    private static final LivekitRtc$SignalRequest DEFAULT_INSTANCE;
    public static final int LEAVE_FIELD_NUMBER = 8;
    public static final int MUTE_FIELD_NUMBER = 5;
    public static final int OFFER_FIELD_NUMBER = 1;
    private static volatile InterfaceC12124U0 PARSER = null;
    public static final int PING_FIELD_NUMBER = 14;
    public static final int PING_REQ_FIELD_NUMBER = 16;
    public static final int SIMULATE_FIELD_NUMBER = 13;
    public static final int SUBSCRIPTION_FIELD_NUMBER = 6;
    public static final int SUBSCRIPTION_PERMISSION_FIELD_NUMBER = 11;
    public static final int SYNC_STATE_FIELD_NUMBER = 12;
    public static final int TRACK_SETTING_FIELD_NUMBER = 7;
    public static final int TRICKLE_FIELD_NUMBER = 3;
    public static final int UPDATE_AUDIO_TRACK_FIELD_NUMBER = 17;
    public static final int UPDATE_LAYERS_FIELD_NUMBER = 10;
    public static final int UPDATE_METADATA_FIELD_NUMBER = 15;
    public static final int UPDATE_VIDEO_TRACK_FIELD_NUMBER = 18;
    private int messageCase_ = 0;
    private Object message_;

    static {
        LivekitRtc$SignalRequest livekitRtc$SignalRequest = new LivekitRtc$SignalRequest();
        DEFAULT_INSTANCE = livekitRtc$SignalRequest;
        AbstractC12133Z.registerDefaultInstance(LivekitRtc$SignalRequest.class, livekitRtc$SignalRequest);
    }

    private LivekitRtc$SignalRequest() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAddTrack() {
        if (this.messageCase_ == 4) {
            this.messageCase_ = 0;
            this.message_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAnswer() {
        if (this.messageCase_ == 2) {
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
        if (this.messageCase_ == 5) {
            this.messageCase_ = 0;
            this.message_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOffer() {
        if (this.messageCase_ == 1) {
            this.messageCase_ = 0;
            this.message_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPing() {
        if (this.messageCase_ == 14) {
            this.messageCase_ = 0;
            this.message_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPingReq() {
        if (this.messageCase_ == 16) {
            this.messageCase_ = 0;
            this.message_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSimulate() {
        if (this.messageCase_ == 13) {
            this.messageCase_ = 0;
            this.message_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSubscription() {
        if (this.messageCase_ == 6) {
            this.messageCase_ = 0;
            this.message_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSubscriptionPermission() {
        if (this.messageCase_ == 11) {
            this.messageCase_ = 0;
            this.message_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSyncState() {
        if (this.messageCase_ == 12) {
            this.messageCase_ = 0;
            this.message_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTrackSetting() {
        if (this.messageCase_ == 7) {
            this.messageCase_ = 0;
            this.message_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTrickle() {
        if (this.messageCase_ == 3) {
            this.messageCase_ = 0;
            this.message_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUpdateAudioTrack() {
        if (this.messageCase_ == 17) {
            this.messageCase_ = 0;
            this.message_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUpdateLayers() {
        if (this.messageCase_ == 10) {
            this.messageCase_ = 0;
            this.message_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUpdateMetadata() {
        if (this.messageCase_ == 15) {
            this.messageCase_ = 0;
            this.message_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUpdateVideoTrack() {
        if (this.messageCase_ == 18) {
            this.messageCase_ = 0;
            this.message_ = null;
        }
    }

    public static LivekitRtc$SignalRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAddTrack(LivekitRtc$AddTrackRequest livekitRtc$AddTrackRequest) {
        livekitRtc$AddTrackRequest.getClass();
        if (this.messageCase_ != 4 || this.message_ == LivekitRtc$AddTrackRequest.getDefaultInstance()) {
            this.message_ = livekitRtc$AddTrackRequest;
        } else {
            C14573E3 c14573e3NewBuilder = LivekitRtc$AddTrackRequest.newBuilder((LivekitRtc$AddTrackRequest) this.message_);
            c14573e3NewBuilder.m13865f(livekitRtc$AddTrackRequest);
            this.message_ = c14573e3NewBuilder.m13862c();
        }
        this.messageCase_ = 4;
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
        if (this.messageCase_ != 5 || this.message_ == LivekitRtc$MuteTrackRequest.getDefaultInstance()) {
            this.message_ = livekitRtc$MuteTrackRequest;
        } else {
            C14646Q3 c14646q3NewBuilder = LivekitRtc$MuteTrackRequest.newBuilder((LivekitRtc$MuteTrackRequest) this.message_);
            c14646q3NewBuilder.m13865f(livekitRtc$MuteTrackRequest);
            this.message_ = c14646q3NewBuilder.m13862c();
        }
        this.messageCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeOffer(LivekitRtc$SessionDescription livekitRtc$SessionDescription) {
        livekitRtc$SessionDescription.getClass();
        if (this.messageCase_ != 1 || this.message_ == LivekitRtc$SessionDescription.getDefaultInstance()) {
            this.message_ = livekitRtc$SessionDescription;
        } else {
            C14713b4 c14713b4NewBuilder = LivekitRtc$SessionDescription.newBuilder((LivekitRtc$SessionDescription) this.message_);
            c14713b4NewBuilder.m13865f(livekitRtc$SessionDescription);
            this.message_ = c14713b4NewBuilder.m13862c();
        }
        this.messageCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePingReq(LivekitRtc$Ping livekitRtc$Ping) {
        livekitRtc$Ping.getClass();
        if (this.messageCase_ != 16 || this.message_ == LivekitRtc$Ping.getDefaultInstance()) {
            this.message_ = livekitRtc$Ping;
        } else {
            C14657S3 c14657s3NewBuilder = LivekitRtc$Ping.newBuilder((LivekitRtc$Ping) this.message_);
            c14657s3NewBuilder.m13865f(livekitRtc$Ping);
            this.message_ = c14657s3NewBuilder.m13862c();
        }
        this.messageCase_ = 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSimulate(LivekitRtc$SimulateScenario livekitRtc$SimulateScenario) {
        livekitRtc$SimulateScenario.getClass();
        if (this.messageCase_ != 13 || this.message_ == LivekitRtc$SimulateScenario.getDefaultInstance()) {
            this.message_ = livekitRtc$SimulateScenario;
        } else {
            C14755h4 c14755h4NewBuilder = LivekitRtc$SimulateScenario.newBuilder((LivekitRtc$SimulateScenario) this.message_);
            c14755h4NewBuilder.m13865f(livekitRtc$SimulateScenario);
            this.message_ = c14755h4NewBuilder.m13862c();
        }
        this.messageCase_ = 13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSubscription(LivekitRtc$UpdateSubscription livekitRtc$UpdateSubscription) {
        livekitRtc$UpdateSubscription.getClass();
        if (this.messageCase_ != 6 || this.message_ == LivekitRtc$UpdateSubscription.getDefaultInstance()) {
            this.message_ = livekitRtc$UpdateSubscription;
        } else {
            C14611K4 c14611k4NewBuilder = LivekitRtc$UpdateSubscription.newBuilder((LivekitRtc$UpdateSubscription) this.message_);
            c14611k4NewBuilder.m13865f(livekitRtc$UpdateSubscription);
            this.message_ = c14611k4NewBuilder.m13862c();
        }
        this.messageCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSubscriptionPermission(LivekitRtc$SubscriptionPermission livekitRtc$SubscriptionPermission) {
        livekitRtc$SubscriptionPermission.getClass();
        if (this.messageCase_ != 11 || this.message_ == LivekitRtc$SubscriptionPermission.getDefaultInstance()) {
            this.message_ = livekitRtc$SubscriptionPermission;
        } else {
            C14853v4 c14853v4NewBuilder = LivekitRtc$SubscriptionPermission.newBuilder((LivekitRtc$SubscriptionPermission) this.message_);
            c14853v4NewBuilder.m13865f(livekitRtc$SubscriptionPermission);
            this.message_ = c14853v4NewBuilder.m13862c();
        }
        this.messageCase_ = 11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSyncState(LivekitRtc$SyncState livekitRtc$SyncState) {
        livekitRtc$SyncState.getClass();
        if (this.messageCase_ != 12 || this.message_ == LivekitRtc$SyncState.getDefaultInstance()) {
            this.message_ = livekitRtc$SyncState;
        } else {
            C14874y4 c14874y4NewBuilder = LivekitRtc$SyncState.newBuilder((LivekitRtc$SyncState) this.message_);
            c14874y4NewBuilder.m13865f(livekitRtc$SyncState);
            this.message_ = c14874y4NewBuilder.m13862c();
        }
        this.messageCase_ = 12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTrackSetting(LivekitRtc$UpdateTrackSettings livekitRtc$UpdateTrackSettings) {
        livekitRtc$UpdateTrackSettings.getClass();
        if (this.messageCase_ != 7 || this.message_ == LivekitRtc$UpdateTrackSettings.getDefaultInstance()) {
            this.message_ = livekitRtc$UpdateTrackSettings;
        } else {
            C14617L4 c14617l4NewBuilder = LivekitRtc$UpdateTrackSettings.newBuilder((LivekitRtc$UpdateTrackSettings) this.message_);
            c14617l4NewBuilder.m13865f(livekitRtc$UpdateTrackSettings);
            this.message_ = c14617l4NewBuilder.m13862c();
        }
        this.messageCase_ = 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTrickle(LivekitRtc$TrickleRequest livekitRtc$TrickleRequest) {
        livekitRtc$TrickleRequest.getClass();
        if (this.messageCase_ != 3 || this.message_ == LivekitRtc$TrickleRequest.getDefaultInstance()) {
            this.message_ = livekitRtc$TrickleRequest;
        } else {
            C14581F4 c14581f4NewBuilder = LivekitRtc$TrickleRequest.newBuilder((LivekitRtc$TrickleRequest) this.message_);
            c14581f4NewBuilder.m13865f(livekitRtc$TrickleRequest);
            this.message_ = c14581f4NewBuilder.m13862c();
        }
        this.messageCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeUpdateAudioTrack(LivekitRtc$UpdateLocalAudioTrack livekitRtc$UpdateLocalAudioTrack) {
        livekitRtc$UpdateLocalAudioTrack.getClass();
        if (this.messageCase_ != 17 || this.message_ == LivekitRtc$UpdateLocalAudioTrack.getDefaultInstance()) {
            this.message_ = livekitRtc$UpdateLocalAudioTrack;
        } else {
            C14587G4 c14587g4NewBuilder = LivekitRtc$UpdateLocalAudioTrack.newBuilder((LivekitRtc$UpdateLocalAudioTrack) this.message_);
            c14587g4NewBuilder.m13865f(livekitRtc$UpdateLocalAudioTrack);
            this.message_ = c14587g4NewBuilder.m13862c();
        }
        this.messageCase_ = 17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeUpdateLayers(LivekitRtc$UpdateVideoLayers livekitRtc$UpdateVideoLayers) {
        livekitRtc$UpdateVideoLayers.getClass();
        if (this.messageCase_ != 10 || this.message_ == LivekitRtc$UpdateVideoLayers.getDefaultInstance()) {
            this.message_ = livekitRtc$UpdateVideoLayers;
        } else {
            C14623M4 c14623m4NewBuilder = LivekitRtc$UpdateVideoLayers.newBuilder((LivekitRtc$UpdateVideoLayers) this.message_);
            c14623m4NewBuilder.m13865f(livekitRtc$UpdateVideoLayers);
            this.message_ = c14623m4NewBuilder.m13862c();
        }
        this.messageCase_ = 10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeUpdateMetadata(LivekitRtc$UpdateParticipantMetadata livekitRtc$UpdateParticipantMetadata) {
        livekitRtc$UpdateParticipantMetadata.getClass();
        if (this.messageCase_ != 15 || this.message_ == LivekitRtc$UpdateParticipantMetadata.getDefaultInstance()) {
            this.message_ = livekitRtc$UpdateParticipantMetadata;
        } else {
            C14605J4 c14605j4NewBuilder = LivekitRtc$UpdateParticipantMetadata.newBuilder((LivekitRtc$UpdateParticipantMetadata) this.message_);
            c14605j4NewBuilder.m13865f(livekitRtc$UpdateParticipantMetadata);
            this.message_ = c14605j4NewBuilder.m13862c();
        }
        this.messageCase_ = 15;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeUpdateVideoTrack(LivekitRtc$UpdateLocalVideoTrack livekitRtc$UpdateLocalVideoTrack) {
        livekitRtc$UpdateLocalVideoTrack.getClass();
        if (this.messageCase_ != 18 || this.message_ == LivekitRtc$UpdateLocalVideoTrack.getDefaultInstance()) {
            this.message_ = livekitRtc$UpdateLocalVideoTrack;
        } else {
            C14593H4 c14593h4NewBuilder = LivekitRtc$UpdateLocalVideoTrack.newBuilder((LivekitRtc$UpdateLocalVideoTrack) this.message_);
            c14593h4NewBuilder.m13865f(livekitRtc$UpdateLocalVideoTrack);
            this.message_ = c14593h4NewBuilder.m13862c();
        }
        this.messageCase_ = 18;
    }

    public static C14720c4 newBuilder() {
        return (C14720c4) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitRtc$SignalRequest parseDelimitedFrom(InputStream inputStream) {
        return (LivekitRtc$SignalRequest) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitRtc$SignalRequest parseFrom(ByteBuffer byteBuffer) {
        return (LivekitRtc$SignalRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC12124U0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAddTrack(LivekitRtc$AddTrackRequest livekitRtc$AddTrackRequest) {
        livekitRtc$AddTrackRequest.getClass();
        this.message_ = livekitRtc$AddTrackRequest;
        this.messageCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAnswer(LivekitRtc$SessionDescription livekitRtc$SessionDescription) {
        livekitRtc$SessionDescription.getClass();
        this.message_ = livekitRtc$SessionDescription;
        this.messageCase_ = 2;
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
        this.messageCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOffer(LivekitRtc$SessionDescription livekitRtc$SessionDescription) {
        livekitRtc$SessionDescription.getClass();
        this.message_ = livekitRtc$SessionDescription;
        this.messageCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPing(long j10) {
        this.messageCase_ = 14;
        this.message_ = Long.valueOf(j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPingReq(LivekitRtc$Ping livekitRtc$Ping) {
        livekitRtc$Ping.getClass();
        this.message_ = livekitRtc$Ping;
        this.messageCase_ = 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSimulate(LivekitRtc$SimulateScenario livekitRtc$SimulateScenario) {
        livekitRtc$SimulateScenario.getClass();
        this.message_ = livekitRtc$SimulateScenario;
        this.messageCase_ = 13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSubscription(LivekitRtc$UpdateSubscription livekitRtc$UpdateSubscription) {
        livekitRtc$UpdateSubscription.getClass();
        this.message_ = livekitRtc$UpdateSubscription;
        this.messageCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSubscriptionPermission(LivekitRtc$SubscriptionPermission livekitRtc$SubscriptionPermission) {
        livekitRtc$SubscriptionPermission.getClass();
        this.message_ = livekitRtc$SubscriptionPermission;
        this.messageCase_ = 11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSyncState(LivekitRtc$SyncState livekitRtc$SyncState) {
        livekitRtc$SyncState.getClass();
        this.message_ = livekitRtc$SyncState;
        this.messageCase_ = 12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTrackSetting(LivekitRtc$UpdateTrackSettings livekitRtc$UpdateTrackSettings) {
        livekitRtc$UpdateTrackSettings.getClass();
        this.message_ = livekitRtc$UpdateTrackSettings;
        this.messageCase_ = 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTrickle(LivekitRtc$TrickleRequest livekitRtc$TrickleRequest) {
        livekitRtc$TrickleRequest.getClass();
        this.message_ = livekitRtc$TrickleRequest;
        this.messageCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUpdateAudioTrack(LivekitRtc$UpdateLocalAudioTrack livekitRtc$UpdateLocalAudioTrack) {
        livekitRtc$UpdateLocalAudioTrack.getClass();
        this.message_ = livekitRtc$UpdateLocalAudioTrack;
        this.messageCase_ = 17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUpdateLayers(LivekitRtc$UpdateVideoLayers livekitRtc$UpdateVideoLayers) {
        livekitRtc$UpdateVideoLayers.getClass();
        this.message_ = livekitRtc$UpdateVideoLayers;
        this.messageCase_ = 10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUpdateMetadata(LivekitRtc$UpdateParticipantMetadata livekitRtc$UpdateParticipantMetadata) {
        livekitRtc$UpdateParticipantMetadata.getClass();
        this.message_ = livekitRtc$UpdateParticipantMetadata;
        this.messageCase_ = 15;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUpdateVideoTrack(LivekitRtc$UpdateLocalVideoTrack livekitRtc$UpdateLocalVideoTrack) {
        livekitRtc$UpdateLocalVideoTrack.getClass();
        this.message_ = livekitRtc$UpdateLocalVideoTrack;
        this.messageCase_ = 18;
    }

    @Override // com.google.protobuf.AbstractC12133Z
    public final Object dynamicMethod(EnumC12131Y enumC12131Y, Object obj, Object obj2) {
        switch (enumC12131Y.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AbstractC12133Z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0011\u0001\u0000\u0001\u0012\u0011\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000\n<\u0000\u000b<\u0000\f<\u0000\r<\u0000\u000e5\u0000\u000f<\u0000\u0010<\u0000\u0011<\u0000\u0012<\u0000", new Object[]{"message_", "messageCase_", LivekitRtc$SessionDescription.class, LivekitRtc$SessionDescription.class, LivekitRtc$TrickleRequest.class, LivekitRtc$AddTrackRequest.class, LivekitRtc$MuteTrackRequest.class, LivekitRtc$UpdateSubscription.class, LivekitRtc$UpdateTrackSettings.class, LivekitRtc$LeaveRequest.class, LivekitRtc$UpdateVideoLayers.class, LivekitRtc$SubscriptionPermission.class, LivekitRtc$SyncState.class, LivekitRtc$SimulateScenario.class, LivekitRtc$UpdateParticipantMetadata.class, LivekitRtc$Ping.class, LivekitRtc$UpdateLocalAudioTrack.class, LivekitRtc$UpdateLocalVideoTrack.class});
            case 3:
                return new LivekitRtc$SignalRequest();
            case 4:
                return new C14720c4(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC12124U0 c12123u = PARSER;
                if (c12123u == null) {
                    synchronized (LivekitRtc$SignalRequest.class) {
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

    public LivekitRtc$AddTrackRequest getAddTrack() {
        return this.messageCase_ == 4 ? (LivekitRtc$AddTrackRequest) this.message_ : LivekitRtc$AddTrackRequest.getDefaultInstance();
    }

    public LivekitRtc$SessionDescription getAnswer() {
        return this.messageCase_ == 2 ? (LivekitRtc$SessionDescription) this.message_ : LivekitRtc$SessionDescription.getDefaultInstance();
    }

    public LivekitRtc$LeaveRequest getLeave() {
        return this.messageCase_ == 8 ? (LivekitRtc$LeaveRequest) this.message_ : LivekitRtc$LeaveRequest.getDefaultInstance();
    }

    public EnumC14727d4 getMessageCase() {
        switch (this.messageCase_) {
            case 0:
                return EnumC14727d4.f46058D0;
            case 1:
                return EnumC14727d4.f46060Y;
            case 2:
                return EnumC14727d4.f46061Z;
            case 3:
                return EnumC14727d4.f46062o0;
            case 4:
                return EnumC14727d4.f46063p0;
            case 5:
                return EnumC14727d4.f46064q0;
            case 6:
                return EnumC14727d4.f46065r0;
            case 7:
                return EnumC14727d4.f46066s0;
            case 8:
                return EnumC14727d4.f46067t0;
            case 9:
            default:
                return null;
            case 10:
                return EnumC14727d4.f46068u0;
            case 11:
                return EnumC14727d4.f46069v0;
            case 12:
                return EnumC14727d4.f46070w0;
            case 13:
                return EnumC14727d4.f46071x0;
            case 14:
                return EnumC14727d4.f46072y0;
            case 15:
                return EnumC14727d4.f46073z0;
            case 16:
                return EnumC14727d4.f46055A0;
            case 17:
                return EnumC14727d4.f46056B0;
            case 18:
                return EnumC14727d4.f46057C0;
        }
    }

    public LivekitRtc$MuteTrackRequest getMute() {
        return this.messageCase_ == 5 ? (LivekitRtc$MuteTrackRequest) this.message_ : LivekitRtc$MuteTrackRequest.getDefaultInstance();
    }

    public LivekitRtc$SessionDescription getOffer() {
        return this.messageCase_ == 1 ? (LivekitRtc$SessionDescription) this.message_ : LivekitRtc$SessionDescription.getDefaultInstance();
    }

    public long getPing() {
        if (this.messageCase_ == 14) {
            return ((Long) this.message_).longValue();
        }
        return 0L;
    }

    public LivekitRtc$Ping getPingReq() {
        return this.messageCase_ == 16 ? (LivekitRtc$Ping) this.message_ : LivekitRtc$Ping.getDefaultInstance();
    }

    public LivekitRtc$SimulateScenario getSimulate() {
        return this.messageCase_ == 13 ? (LivekitRtc$SimulateScenario) this.message_ : LivekitRtc$SimulateScenario.getDefaultInstance();
    }

    public LivekitRtc$UpdateSubscription getSubscription() {
        return this.messageCase_ == 6 ? (LivekitRtc$UpdateSubscription) this.message_ : LivekitRtc$UpdateSubscription.getDefaultInstance();
    }

    public LivekitRtc$SubscriptionPermission getSubscriptionPermission() {
        return this.messageCase_ == 11 ? (LivekitRtc$SubscriptionPermission) this.message_ : LivekitRtc$SubscriptionPermission.getDefaultInstance();
    }

    public LivekitRtc$SyncState getSyncState() {
        return this.messageCase_ == 12 ? (LivekitRtc$SyncState) this.message_ : LivekitRtc$SyncState.getDefaultInstance();
    }

    public LivekitRtc$UpdateTrackSettings getTrackSetting() {
        return this.messageCase_ == 7 ? (LivekitRtc$UpdateTrackSettings) this.message_ : LivekitRtc$UpdateTrackSettings.getDefaultInstance();
    }

    public LivekitRtc$TrickleRequest getTrickle() {
        return this.messageCase_ == 3 ? (LivekitRtc$TrickleRequest) this.message_ : LivekitRtc$TrickleRequest.getDefaultInstance();
    }

    public LivekitRtc$UpdateLocalAudioTrack getUpdateAudioTrack() {
        return this.messageCase_ == 17 ? (LivekitRtc$UpdateLocalAudioTrack) this.message_ : LivekitRtc$UpdateLocalAudioTrack.getDefaultInstance();
    }

    @Deprecated
    public LivekitRtc$UpdateVideoLayers getUpdateLayers() {
        return this.messageCase_ == 10 ? (LivekitRtc$UpdateVideoLayers) this.message_ : LivekitRtc$UpdateVideoLayers.getDefaultInstance();
    }

    public LivekitRtc$UpdateParticipantMetadata getUpdateMetadata() {
        return this.messageCase_ == 15 ? (LivekitRtc$UpdateParticipantMetadata) this.message_ : LivekitRtc$UpdateParticipantMetadata.getDefaultInstance();
    }

    public LivekitRtc$UpdateLocalVideoTrack getUpdateVideoTrack() {
        return this.messageCase_ == 18 ? (LivekitRtc$UpdateLocalVideoTrack) this.message_ : LivekitRtc$UpdateLocalVideoTrack.getDefaultInstance();
    }

    public boolean hasAddTrack() {
        return this.messageCase_ == 4;
    }

    public boolean hasAnswer() {
        return this.messageCase_ == 2;
    }

    public boolean hasLeave() {
        return this.messageCase_ == 8;
    }

    public boolean hasMute() {
        return this.messageCase_ == 5;
    }

    public boolean hasOffer() {
        return this.messageCase_ == 1;
    }

    public boolean hasPing() {
        return this.messageCase_ == 14;
    }

    public boolean hasPingReq() {
        return this.messageCase_ == 16;
    }

    public boolean hasSimulate() {
        return this.messageCase_ == 13;
    }

    public boolean hasSubscription() {
        return this.messageCase_ == 6;
    }

    public boolean hasSubscriptionPermission() {
        return this.messageCase_ == 11;
    }

    public boolean hasSyncState() {
        return this.messageCase_ == 12;
    }

    public boolean hasTrackSetting() {
        return this.messageCase_ == 7;
    }

    public boolean hasTrickle() {
        return this.messageCase_ == 3;
    }

    public boolean hasUpdateAudioTrack() {
        return this.messageCase_ == 17;
    }

    @Deprecated
    public boolean hasUpdateLayers() {
        return this.messageCase_ == 10;
    }

    public boolean hasUpdateMetadata() {
        return this.messageCase_ == 15;
    }

    public boolean hasUpdateVideoTrack() {
        return this.messageCase_ == 18;
    }

    public static C14720c4 newBuilder(LivekitRtc$SignalRequest livekitRtc$SignalRequest) {
        return (C14720c4) DEFAULT_INSTANCE.createBuilder(livekitRtc$SignalRequest);
    }

    public static LivekitRtc$SignalRequest parseDelimitedFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitRtc$SignalRequest) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitRtc$SignalRequest parseFrom(ByteBuffer byteBuffer, C12087F c12087f) {
        return (LivekitRtc$SignalRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer, c12087f);
    }

    public static LivekitRtc$SignalRequest parseFrom(AbstractC12171m abstractC12171m) {
        return (LivekitRtc$SignalRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m);
    }

    public static LivekitRtc$SignalRequest parseFrom(AbstractC12171m abstractC12171m, C12087F c12087f) {
        return (LivekitRtc$SignalRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m, c12087f);
    }

    public static LivekitRtc$SignalRequest parseFrom(byte[] bArr) {
        return (LivekitRtc$SignalRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitRtc$SignalRequest parseFrom(byte[] bArr, C12087F c12087f) {
        return (LivekitRtc$SignalRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr, c12087f);
    }

    public static LivekitRtc$SignalRequest parseFrom(InputStream inputStream) {
        return (LivekitRtc$SignalRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitRtc$SignalRequest parseFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitRtc$SignalRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitRtc$SignalRequest parseFrom(AbstractC12186r abstractC12186r) {
        return (LivekitRtc$SignalRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r);
    }

    public static LivekitRtc$SignalRequest parseFrom(AbstractC12186r abstractC12186r, C12087F c12087f) {
        return (LivekitRtc$SignalRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r, c12087f);
    }
}
