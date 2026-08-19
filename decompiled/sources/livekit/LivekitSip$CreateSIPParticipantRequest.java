package livekit;

import com.google.protobuf.AbstractC12133Z;
import com.google.protobuf.AbstractC12138b;
import com.google.protobuf.AbstractC12171m;
import com.google.protobuf.AbstractC12186r;
import com.google.protobuf.C12076B0;
import com.google.protobuf.C12087F;
import com.google.protobuf.C12123U;
import com.google.protobuf.EnumC12131Y;
import com.google.protobuf.InterfaceC12094H0;
import com.google.protobuf.InterfaceC12124U0;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Map;
import p793ho.AbstractC14658S4;
import p793ho.C14652R4;
import p817j$.util.DesugarCollections;

/* JADX INFO: loaded from: classes2.dex */
public final class LivekitSip$CreateSIPParticipantRequest extends AbstractC12133Z implements InterfaceC12094H0 {
    private static final LivekitSip$CreateSIPParticipantRequest DEFAULT_INSTANCE;
    public static final int DTMF_FIELD_NUMBER = 5;
    public static final int HIDE_PHONE_NUMBER_FIELD_NUMBER = 10;
    private static volatile InterfaceC12124U0 PARSER = null;
    public static final int PARTICIPANT_ATTRIBUTES_FIELD_NUMBER = 9;
    public static final int PARTICIPANT_IDENTITY_FIELD_NUMBER = 4;
    public static final int PARTICIPANT_METADATA_FIELD_NUMBER = 8;
    public static final int PARTICIPANT_NAME_FIELD_NUMBER = 7;
    public static final int PLAY_RINGTONE_FIELD_NUMBER = 6;
    public static final int ROOM_NAME_FIELD_NUMBER = 3;
    public static final int SIP_CALL_TO_FIELD_NUMBER = 2;
    public static final int SIP_TRUNK_ID_FIELD_NUMBER = 1;
    private boolean hidePhoneNumber_;
    private boolean playRingtone_;
    private C12076B0 participantAttributes_ = C12076B0.f36868Z;
    private String sipTrunkId_ = "";
    private String sipCallTo_ = "";
    private String roomName_ = "";
    private String participantIdentity_ = "";
    private String participantName_ = "";
    private String participantMetadata_ = "";
    private String dtmf_ = "";

    static {
        LivekitSip$CreateSIPParticipantRequest livekitSip$CreateSIPParticipantRequest = new LivekitSip$CreateSIPParticipantRequest();
        DEFAULT_INSTANCE = livekitSip$CreateSIPParticipantRequest;
        AbstractC12133Z.registerDefaultInstance(LivekitSip$CreateSIPParticipantRequest.class, livekitSip$CreateSIPParticipantRequest);
    }

    private LivekitSip$CreateSIPParticipantRequest() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDtmf() {
        this.dtmf_ = getDefaultInstance().getDtmf();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHidePhoneNumber() {
        this.hidePhoneNumber_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearParticipantIdentity() {
        this.participantIdentity_ = getDefaultInstance().getParticipantIdentity();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearParticipantMetadata() {
        this.participantMetadata_ = getDefaultInstance().getParticipantMetadata();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearParticipantName() {
        this.participantName_ = getDefaultInstance().getParticipantName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlayRingtone() {
        this.playRingtone_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRoomName() {
        this.roomName_ = getDefaultInstance().getRoomName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSipCallTo() {
        this.sipCallTo_ = getDefaultInstance().getSipCallTo();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSipTrunkId() {
        this.sipTrunkId_ = getDefaultInstance().getSipTrunkId();
    }

    public static LivekitSip$CreateSIPParticipantRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, String> getMutableParticipantAttributesMap() {
        return internalGetMutableParticipantAttributes();
    }

    private C12076B0 internalGetMutableParticipantAttributes() {
        C12076B0 c12076b0 = this.participantAttributes_;
        if (!c12076b0.f36869Y) {
            this.participantAttributes_ = c12076b0.m13719c();
        }
        return this.participantAttributes_;
    }

    private C12076B0 internalGetParticipantAttributes() {
        return this.participantAttributes_;
    }

    public static C14652R4 newBuilder() {
        return (C14652R4) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitSip$CreateSIPParticipantRequest parseDelimitedFrom(InputStream inputStream) {
        return (LivekitSip$CreateSIPParticipantRequest) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitSip$CreateSIPParticipantRequest parseFrom(ByteBuffer byteBuffer) {
        return (LivekitSip$CreateSIPParticipantRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC12124U0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDtmf(String str) {
        str.getClass();
        this.dtmf_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDtmfBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.dtmf_ = abstractC12171m.m14012w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHidePhoneNumber(boolean z6) {
        this.hidePhoneNumber_ = z6;
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
    public void setParticipantMetadata(String str) {
        str.getClass();
        this.participantMetadata_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParticipantMetadataBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.participantMetadata_ = abstractC12171m.m14012w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParticipantName(String str) {
        str.getClass();
        this.participantName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParticipantNameBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.participantName_ = abstractC12171m.m14012w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlayRingtone(boolean z6) {
        this.playRingtone_ = z6;
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
    public void setSipCallTo(String str) {
        str.getClass();
        this.sipCallTo_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSipCallToBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.sipCallTo_ = abstractC12171m.m14012w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSipTrunkId(String str) {
        str.getClass();
        this.sipTrunkId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSipTrunkIdBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.sipTrunkId_ = abstractC12171m.m14012w();
    }

    public boolean containsParticipantAttributes(String str) {
        str.getClass();
        return internalGetParticipantAttributes().containsKey(str);
    }

    @Override // com.google.protobuf.AbstractC12133Z
    public final Object dynamicMethod(EnumC12131Y enumC12131Y, Object obj, Object obj2) {
        switch (enumC12131Y.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AbstractC12133Z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0000\u0000\u0001\n\n\u0001\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006\u0007\u0007Ȉ\bȈ\t2\n\u0007", new Object[]{"sipTrunkId_", "sipCallTo_", "roomName_", "participantIdentity_", "dtmf_", "playRingtone_", "participantName_", "participantMetadata_", "participantAttributes_", AbstractC14658S4.f45953a, "hidePhoneNumber_"});
            case 3:
                return new LivekitSip$CreateSIPParticipantRequest();
            case 4:
                return new C14652R4(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC12124U0 c12123u = PARSER;
                if (c12123u == null) {
                    synchronized (LivekitSip$CreateSIPParticipantRequest.class) {
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

    public String getDtmf() {
        return this.dtmf_;
    }

    public AbstractC12171m getDtmfBytes() {
        return AbstractC12171m.m14011m(this.dtmf_);
    }

    public boolean getHidePhoneNumber() {
        return this.hidePhoneNumber_;
    }

    @Deprecated
    public Map<String, String> getParticipantAttributes() {
        return getParticipantAttributesMap();
    }

    public int getParticipantAttributesCount() {
        return internalGetParticipantAttributes().size();
    }

    public Map<String, String> getParticipantAttributesMap() {
        return DesugarCollections.unmodifiableMap(internalGetParticipantAttributes());
    }

    public String getParticipantAttributesOrDefault(String str, String str2) {
        str.getClass();
        C12076B0 c12076b0InternalGetParticipantAttributes = internalGetParticipantAttributes();
        return c12076b0InternalGetParticipantAttributes.containsKey(str) ? (String) c12076b0InternalGetParticipantAttributes.get(str) : str2;
    }

    public String getParticipantAttributesOrThrow(String str) {
        str.getClass();
        C12076B0 c12076b0InternalGetParticipantAttributes = internalGetParticipantAttributes();
        if (c12076b0InternalGetParticipantAttributes.containsKey(str)) {
            return (String) c12076b0InternalGetParticipantAttributes.get(str);
        }
        throw new IllegalArgumentException();
    }

    public String getParticipantIdentity() {
        return this.participantIdentity_;
    }

    public AbstractC12171m getParticipantIdentityBytes() {
        return AbstractC12171m.m14011m(this.participantIdentity_);
    }

    public String getParticipantMetadata() {
        return this.participantMetadata_;
    }

    public AbstractC12171m getParticipantMetadataBytes() {
        return AbstractC12171m.m14011m(this.participantMetadata_);
    }

    public String getParticipantName() {
        return this.participantName_;
    }

    public AbstractC12171m getParticipantNameBytes() {
        return AbstractC12171m.m14011m(this.participantName_);
    }

    public boolean getPlayRingtone() {
        return this.playRingtone_;
    }

    public String getRoomName() {
        return this.roomName_;
    }

    public AbstractC12171m getRoomNameBytes() {
        return AbstractC12171m.m14011m(this.roomName_);
    }

    public String getSipCallTo() {
        return this.sipCallTo_;
    }

    public AbstractC12171m getSipCallToBytes() {
        return AbstractC12171m.m14011m(this.sipCallTo_);
    }

    public String getSipTrunkId() {
        return this.sipTrunkId_;
    }

    public AbstractC12171m getSipTrunkIdBytes() {
        return AbstractC12171m.m14011m(this.sipTrunkId_);
    }

    public static C14652R4 newBuilder(LivekitSip$CreateSIPParticipantRequest livekitSip$CreateSIPParticipantRequest) {
        return (C14652R4) DEFAULT_INSTANCE.createBuilder(livekitSip$CreateSIPParticipantRequest);
    }

    public static LivekitSip$CreateSIPParticipantRequest parseDelimitedFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitSip$CreateSIPParticipantRequest) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitSip$CreateSIPParticipantRequest parseFrom(ByteBuffer byteBuffer, C12087F c12087f) {
        return (LivekitSip$CreateSIPParticipantRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer, c12087f);
    }

    public static LivekitSip$CreateSIPParticipantRequest parseFrom(AbstractC12171m abstractC12171m) {
        return (LivekitSip$CreateSIPParticipantRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m);
    }

    public static LivekitSip$CreateSIPParticipantRequest parseFrom(AbstractC12171m abstractC12171m, C12087F c12087f) {
        return (LivekitSip$CreateSIPParticipantRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m, c12087f);
    }

    public static LivekitSip$CreateSIPParticipantRequest parseFrom(byte[] bArr) {
        return (LivekitSip$CreateSIPParticipantRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitSip$CreateSIPParticipantRequest parseFrom(byte[] bArr, C12087F c12087f) {
        return (LivekitSip$CreateSIPParticipantRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr, c12087f);
    }

    public static LivekitSip$CreateSIPParticipantRequest parseFrom(InputStream inputStream) {
        return (LivekitSip$CreateSIPParticipantRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitSip$CreateSIPParticipantRequest parseFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitSip$CreateSIPParticipantRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitSip$CreateSIPParticipantRequest parseFrom(AbstractC12186r abstractC12186r) {
        return (LivekitSip$CreateSIPParticipantRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r);
    }

    public static LivekitSip$CreateSIPParticipantRequest parseFrom(AbstractC12186r abstractC12186r, C12087F c12087f) {
        return (LivekitSip$CreateSIPParticipantRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r, c12087f);
    }
}
