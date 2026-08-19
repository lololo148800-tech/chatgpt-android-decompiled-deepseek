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
import p793ho.C14875y5;

/* JADX INFO: loaded from: classes2.dex */
public final class LivekitSip$SIPParticipantInfo extends AbstractC12133Z implements InterfaceC12094H0 {
    private static final LivekitSip$SIPParticipantInfo DEFAULT_INSTANCE;
    private static volatile InterfaceC12124U0 PARSER = null;
    public static final int PARTICIPANT_IDENTITY_FIELD_NUMBER = 2;
    public static final int PARTICIPANT_ID_FIELD_NUMBER = 1;
    public static final int ROOM_NAME_FIELD_NUMBER = 3;
    public static final int SIP_CALL_ID_FIELD_NUMBER = 4;
    private String participantId_ = "";
    private String participantIdentity_ = "";
    private String roomName_ = "";
    private String sipCallId_ = "";

    static {
        LivekitSip$SIPParticipantInfo livekitSip$SIPParticipantInfo = new LivekitSip$SIPParticipantInfo();
        DEFAULT_INSTANCE = livekitSip$SIPParticipantInfo;
        AbstractC12133Z.registerDefaultInstance(LivekitSip$SIPParticipantInfo.class, livekitSip$SIPParticipantInfo);
    }

    private LivekitSip$SIPParticipantInfo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearParticipantId() {
        this.participantId_ = getDefaultInstance().getParticipantId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearParticipantIdentity() {
        this.participantIdentity_ = getDefaultInstance().getParticipantIdentity();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRoomName() {
        this.roomName_ = getDefaultInstance().getRoomName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSipCallId() {
        this.sipCallId_ = getDefaultInstance().getSipCallId();
    }

    public static LivekitSip$SIPParticipantInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C14875y5 newBuilder() {
        return (C14875y5) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitSip$SIPParticipantInfo parseDelimitedFrom(InputStream inputStream) {
        return (LivekitSip$SIPParticipantInfo) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitSip$SIPParticipantInfo parseFrom(ByteBuffer byteBuffer) {
        return (LivekitSip$SIPParticipantInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC12124U0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParticipantId(String str) {
        str.getClass();
        this.participantId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParticipantIdBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.participantId_ = abstractC12171m.m14012w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParticipantIdentity(String str) {
        str.getClass();
        this.participantIdentity_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParticipantIdentityBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.participantIdentity_ = abstractC12171m.m14012w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRoomName(String str) {
        str.getClass();
        this.roomName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRoomNameBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.roomName_ = abstractC12171m.m14012w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSipCallId(String str) {
        str.getClass();
        this.sipCallId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSipCallIdBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.sipCallId_ = abstractC12171m.m14012w();
    }

    @Override // com.google.protobuf.AbstractC12133Z
    public final Object dynamicMethod(EnumC12131Y enumC12131Y, Object obj, Object obj2) {
        switch (enumC12131Y.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AbstractC12133Z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ", new Object[]{"participantId_", "participantIdentity_", "roomName_", "sipCallId_"});
            case 3:
                return new LivekitSip$SIPParticipantInfo();
            case 4:
                return new C14875y5(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC12124U0 c12123u = PARSER;
                if (c12123u == null) {
                    synchronized (LivekitSip$SIPParticipantInfo.class) {
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

    public String getParticipantId() {
        return this.participantId_;
    }

    public AbstractC12171m getParticipantIdBytes() {
        return AbstractC12171m.m14011m(this.participantId_);
    }

    public String getParticipantIdentity() {
        return this.participantIdentity_;
    }

    public AbstractC12171m getParticipantIdentityBytes() {
        return AbstractC12171m.m14011m(this.participantIdentity_);
    }

    public String getRoomName() {
        return this.roomName_;
    }

    public AbstractC12171m getRoomNameBytes() {
        return AbstractC12171m.m14011m(this.roomName_);
    }

    public String getSipCallId() {
        return this.sipCallId_;
    }

    public AbstractC12171m getSipCallIdBytes() {
        return AbstractC12171m.m14011m(this.sipCallId_);
    }

    public static C14875y5 newBuilder(LivekitSip$SIPParticipantInfo livekitSip$SIPParticipantInfo) {
        return (C14875y5) DEFAULT_INSTANCE.createBuilder(livekitSip$SIPParticipantInfo);
    }

    public static LivekitSip$SIPParticipantInfo parseDelimitedFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitSip$SIPParticipantInfo) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitSip$SIPParticipantInfo parseFrom(ByteBuffer byteBuffer, C12087F c12087f) {
        return (LivekitSip$SIPParticipantInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer, c12087f);
    }

    public static LivekitSip$SIPParticipantInfo parseFrom(AbstractC12171m abstractC12171m) {
        return (LivekitSip$SIPParticipantInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m);
    }

    public static LivekitSip$SIPParticipantInfo parseFrom(AbstractC12171m abstractC12171m, C12087F c12087f) {
        return (LivekitSip$SIPParticipantInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m, c12087f);
    }

    public static LivekitSip$SIPParticipantInfo parseFrom(byte[] bArr) {
        return (LivekitSip$SIPParticipantInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitSip$SIPParticipantInfo parseFrom(byte[] bArr, C12087F c12087f) {
        return (LivekitSip$SIPParticipantInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr, c12087f);
    }

    public static LivekitSip$SIPParticipantInfo parseFrom(InputStream inputStream) {
        return (LivekitSip$SIPParticipantInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitSip$SIPParticipantInfo parseFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitSip$SIPParticipantInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitSip$SIPParticipantInfo parseFrom(AbstractC12186r abstractC12186r) {
        return (LivekitSip$SIPParticipantInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r);
    }

    public static LivekitSip$SIPParticipantInfo parseFrom(AbstractC12186r abstractC12186r, C12087F c12087f) {
        return (LivekitSip$SIPParticipantInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r, c12087f);
    }
}
