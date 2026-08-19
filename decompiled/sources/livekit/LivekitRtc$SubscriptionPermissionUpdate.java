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
import p793ho.C14860w4;

/* JADX INFO: loaded from: classes2.dex */
public final class LivekitRtc$SubscriptionPermissionUpdate extends AbstractC12133Z implements InterfaceC12094H0 {
    public static final int ALLOWED_FIELD_NUMBER = 3;
    private static final LivekitRtc$SubscriptionPermissionUpdate DEFAULT_INSTANCE;
    private static volatile InterfaceC12124U0 PARSER = null;
    public static final int PARTICIPANT_SID_FIELD_NUMBER = 1;
    public static final int TRACK_SID_FIELD_NUMBER = 2;
    private boolean allowed_;
    private String participantSid_ = "";
    private String trackSid_ = "";

    static {
        LivekitRtc$SubscriptionPermissionUpdate livekitRtc$SubscriptionPermissionUpdate = new LivekitRtc$SubscriptionPermissionUpdate();
        DEFAULT_INSTANCE = livekitRtc$SubscriptionPermissionUpdate;
        AbstractC12133Z.registerDefaultInstance(LivekitRtc$SubscriptionPermissionUpdate.class, livekitRtc$SubscriptionPermissionUpdate);
    }

    private LivekitRtc$SubscriptionPermissionUpdate() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAllowed() {
        this.allowed_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearParticipantSid() {
        this.participantSid_ = getDefaultInstance().getParticipantSid();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTrackSid() {
        this.trackSid_ = getDefaultInstance().getTrackSid();
    }

    public static LivekitRtc$SubscriptionPermissionUpdate getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C14860w4 newBuilder() {
        return (C14860w4) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitRtc$SubscriptionPermissionUpdate parseDelimitedFrom(InputStream inputStream) {
        return (LivekitRtc$SubscriptionPermissionUpdate) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitRtc$SubscriptionPermissionUpdate parseFrom(ByteBuffer byteBuffer) {
        return (LivekitRtc$SubscriptionPermissionUpdate) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC12124U0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAllowed(boolean z6) {
        this.allowed_ = z6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParticipantSid(String str) {
        str.getClass();
        this.participantSid_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParticipantSidBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.participantSid_ = abstractC12171m.m14012w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTrackSid(String str) {
        str.getClass();
        this.trackSid_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTrackSidBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.trackSid_ = abstractC12171m.m14012w();
    }

    @Override // com.google.protobuf.AbstractC12133Z
    public final Object dynamicMethod(EnumC12131Y enumC12131Y, Object obj, Object obj2) {
        switch (enumC12131Y.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AbstractC12133Z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0007", new Object[]{"participantSid_", "trackSid_", "allowed_"});
            case 3:
                return new LivekitRtc$SubscriptionPermissionUpdate();
            case 4:
                return new C14860w4(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC12124U0 c12123u = PARSER;
                if (c12123u == null) {
                    synchronized (LivekitRtc$SubscriptionPermissionUpdate.class) {
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

    public boolean getAllowed() {
        return this.allowed_;
    }

    public String getParticipantSid() {
        return this.participantSid_;
    }

    public AbstractC12171m getParticipantSidBytes() {
        return AbstractC12171m.m14011m(this.participantSid_);
    }

    public String getTrackSid() {
        return this.trackSid_;
    }

    public AbstractC12171m getTrackSidBytes() {
        return AbstractC12171m.m14011m(this.trackSid_);
    }

    public static C14860w4 newBuilder(LivekitRtc$SubscriptionPermissionUpdate livekitRtc$SubscriptionPermissionUpdate) {
        return (C14860w4) DEFAULT_INSTANCE.createBuilder(livekitRtc$SubscriptionPermissionUpdate);
    }

    public static LivekitRtc$SubscriptionPermissionUpdate parseDelimitedFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitRtc$SubscriptionPermissionUpdate) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitRtc$SubscriptionPermissionUpdate parseFrom(ByteBuffer byteBuffer, C12087F c12087f) {
        return (LivekitRtc$SubscriptionPermissionUpdate) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer, c12087f);
    }

    public static LivekitRtc$SubscriptionPermissionUpdate parseFrom(AbstractC12171m abstractC12171m) {
        return (LivekitRtc$SubscriptionPermissionUpdate) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m);
    }

    public static LivekitRtc$SubscriptionPermissionUpdate parseFrom(AbstractC12171m abstractC12171m, C12087F c12087f) {
        return (LivekitRtc$SubscriptionPermissionUpdate) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m, c12087f);
    }

    public static LivekitRtc$SubscriptionPermissionUpdate parseFrom(byte[] bArr) {
        return (LivekitRtc$SubscriptionPermissionUpdate) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitRtc$SubscriptionPermissionUpdate parseFrom(byte[] bArr, C12087F c12087f) {
        return (LivekitRtc$SubscriptionPermissionUpdate) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr, c12087f);
    }

    public static LivekitRtc$SubscriptionPermissionUpdate parseFrom(InputStream inputStream) {
        return (LivekitRtc$SubscriptionPermissionUpdate) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitRtc$SubscriptionPermissionUpdate parseFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitRtc$SubscriptionPermissionUpdate) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitRtc$SubscriptionPermissionUpdate parseFrom(AbstractC12186r abstractC12186r) {
        return (LivekitRtc$SubscriptionPermissionUpdate) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r);
    }

    public static LivekitRtc$SubscriptionPermissionUpdate parseFrom(AbstractC12186r abstractC12186r, C12087F c12087f) {
        return (LivekitRtc$SubscriptionPermissionUpdate) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r, c12087f);
    }
}
