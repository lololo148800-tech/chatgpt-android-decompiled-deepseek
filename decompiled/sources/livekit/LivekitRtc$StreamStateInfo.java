package livekit;

import com.google.protobuf.AbstractC12133Z;
import com.google.protobuf.AbstractC12138b;
import com.google.protobuf.AbstractC12171m;
import com.google.protobuf.AbstractC12186r;
import com.google.protobuf.C12087F;
import com.google.protobuf.C12123U;
import com.google.protobuf.EnumC12131Y;
import com.google.protobuf.InterfaceC12124U0;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p793ho.C14797n4;
import p793ho.EnumC14790m4;
import p793ho.InterfaceC14804o4;

/* JADX INFO: loaded from: classes2.dex */
public final class LivekitRtc$StreamStateInfo extends AbstractC12133Z implements InterfaceC14804o4 {
    private static final LivekitRtc$StreamStateInfo DEFAULT_INSTANCE;
    private static volatile InterfaceC12124U0 PARSER = null;
    public static final int PARTICIPANT_SID_FIELD_NUMBER = 1;
    public static final int STATE_FIELD_NUMBER = 3;
    public static final int TRACK_SID_FIELD_NUMBER = 2;
    private int state_;
    private String participantSid_ = "";
    private String trackSid_ = "";

    static {
        LivekitRtc$StreamStateInfo livekitRtc$StreamStateInfo = new LivekitRtc$StreamStateInfo();
        DEFAULT_INSTANCE = livekitRtc$StreamStateInfo;
        AbstractC12133Z.registerDefaultInstance(LivekitRtc$StreamStateInfo.class, livekitRtc$StreamStateInfo);
    }

    private LivekitRtc$StreamStateInfo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearParticipantSid() {
        this.participantSid_ = getDefaultInstance().getParticipantSid();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearState() {
        this.state_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTrackSid() {
        this.trackSid_ = getDefaultInstance().getTrackSid();
    }

    public static LivekitRtc$StreamStateInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C14797n4 newBuilder() {
        return (C14797n4) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitRtc$StreamStateInfo parseDelimitedFrom(InputStream inputStream) {
        return (LivekitRtc$StreamStateInfo) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitRtc$StreamStateInfo parseFrom(ByteBuffer byteBuffer) {
        return (LivekitRtc$StreamStateInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC12124U0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
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
    public void setState(EnumC14790m4 enumC14790m4) {
        this.state_ = enumC14790m4.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStateValue(int i10) {
        this.state_ = i10;
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
                return AbstractC12133Z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\f", new Object[]{"participantSid_", "trackSid_", "state_"});
            case 3:
                return new LivekitRtc$StreamStateInfo();
            case 4:
                return new C14797n4(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC12124U0 c12123u = PARSER;
                if (c12123u == null) {
                    synchronized (LivekitRtc$StreamStateInfo.class) {
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

    public String getParticipantSid() {
        return this.participantSid_;
    }

    public AbstractC12171m getParticipantSidBytes() {
        return AbstractC12171m.m14011m(this.participantSid_);
    }

    public EnumC14790m4 getState() {
        EnumC14790m4 enumC14790m4;
        int i10 = this.state_;
        if (i10 != 0) {
            enumC14790m4 = i10 != 1 ? null : EnumC14790m4.PAUSED;
        } else {
            enumC14790m4 = EnumC14790m4.ACTIVE;
        }
        return enumC14790m4 == null ? EnumC14790m4.UNRECOGNIZED : enumC14790m4;
    }

    public int getStateValue() {
        return this.state_;
    }

    public String getTrackSid() {
        return this.trackSid_;
    }

    public AbstractC12171m getTrackSidBytes() {
        return AbstractC12171m.m14011m(this.trackSid_);
    }

    public static C14797n4 newBuilder(LivekitRtc$StreamStateInfo livekitRtc$StreamStateInfo) {
        return (C14797n4) DEFAULT_INSTANCE.createBuilder(livekitRtc$StreamStateInfo);
    }

    public static LivekitRtc$StreamStateInfo parseDelimitedFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitRtc$StreamStateInfo) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitRtc$StreamStateInfo parseFrom(ByteBuffer byteBuffer, C12087F c12087f) {
        return (LivekitRtc$StreamStateInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer, c12087f);
    }

    public static LivekitRtc$StreamStateInfo parseFrom(AbstractC12171m abstractC12171m) {
        return (LivekitRtc$StreamStateInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m);
    }

    public static LivekitRtc$StreamStateInfo parseFrom(AbstractC12171m abstractC12171m, C12087F c12087f) {
        return (LivekitRtc$StreamStateInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m, c12087f);
    }

    public static LivekitRtc$StreamStateInfo parseFrom(byte[] bArr) {
        return (LivekitRtc$StreamStateInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitRtc$StreamStateInfo parseFrom(byte[] bArr, C12087F c12087f) {
        return (LivekitRtc$StreamStateInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr, c12087f);
    }

    public static LivekitRtc$StreamStateInfo parseFrom(InputStream inputStream) {
        return (LivekitRtc$StreamStateInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitRtc$StreamStateInfo parseFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitRtc$StreamStateInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitRtc$StreamStateInfo parseFrom(AbstractC12186r abstractC12186r) {
        return (LivekitRtc$StreamStateInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r);
    }

    public static LivekitRtc$StreamStateInfo parseFrom(AbstractC12186r abstractC12186r, C12087F c12087f) {
        return (LivekitRtc$StreamStateInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r, c12087f);
    }
}
