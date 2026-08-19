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
import p793ho.C14614L1;
import p793ho.C14704a2;
import p793ho.C14768j3;
import p793ho.EnumC14572E2;

/* JADX INFO: loaded from: classes2.dex */
public final class LivekitInternal$StartSession extends AbstractC12133Z implements InterfaceC12094H0 {
    public static final int ADAPTIVE_STREAM_FIELD_NUMBER = 15;
    public static final int AUTO_SUBSCRIBE_FIELD_NUMBER = 9;
    public static final int CLIENT_FIELD_NUMBER = 11;
    public static final int CONNECTION_ID_FIELD_NUMBER = 3;
    public static final int CREATE_ROOM_FIELD_NUMBER = 20;
    private static final LivekitInternal$StartSession DEFAULT_INSTANCE;
    public static final int DISABLE_ICE_LITE_FIELD_NUMBER = 19;
    public static final int GRANTS_JSON_FIELD_NUMBER = 14;
    public static final int HIDDEN_FIELD_NUMBER = 10;
    public static final int IDENTITY_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 13;
    private static volatile InterfaceC12124U0 PARSER = null;
    public static final int PARTICIPANT_ID_FIELD_NUMBER = 16;
    public static final int RECONNECT_FIELD_NUMBER = 4;
    public static final int RECONNECT_REASON_FIELD_NUMBER = 17;
    public static final int RECORDER_FIELD_NUMBER = 12;
    public static final int ROOM_NAME_FIELD_NUMBER = 1;
    public static final int SUBSCRIBER_ALLOW_PAUSE_FIELD_NUMBER = 18;
    private boolean adaptiveStream_;
    private boolean autoSubscribe_;
    private int bitField0_;
    private LivekitModels$ClientInfo client_;
    private LivekitRoom$CreateRoomRequest createRoom_;
    private boolean disableIceLite_;
    private boolean hidden_;
    private int reconnectReason_;
    private boolean reconnect_;
    private boolean recorder_;
    private boolean subscriberAllowPause_;
    private String roomName_ = "";
    private String identity_ = "";
    private String connectionId_ = "";
    private String name_ = "";
    private String grantsJson_ = "";
    private String participantId_ = "";

    static {
        LivekitInternal$StartSession livekitInternal$StartSession = new LivekitInternal$StartSession();
        DEFAULT_INSTANCE = livekitInternal$StartSession;
        AbstractC12133Z.registerDefaultInstance(LivekitInternal$StartSession.class, livekitInternal$StartSession);
    }

    private LivekitInternal$StartSession() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAdaptiveStream() {
        this.adaptiveStream_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAutoSubscribe() {
        this.autoSubscribe_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClient() {
        this.client_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearConnectionId() {
        this.connectionId_ = getDefaultInstance().getConnectionId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCreateRoom() {
        this.createRoom_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDisableIceLite() {
        this.disableIceLite_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGrantsJson() {
        this.grantsJson_ = getDefaultInstance().getGrantsJson();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHidden() {
        this.hidden_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIdentity() {
        this.identity_ = getDefaultInstance().getIdentity();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearParticipantId() {
        this.participantId_ = getDefaultInstance().getParticipantId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReconnect() {
        this.reconnect_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReconnectReason() {
        this.reconnectReason_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRecorder() {
        this.recorder_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRoomName() {
        this.roomName_ = getDefaultInstance().getRoomName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSubscriberAllowPause() {
        this.bitField0_ &= -2;
        this.subscriberAllowPause_ = false;
    }

    public static LivekitInternal$StartSession getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeClient(LivekitModels$ClientInfo livekitModels$ClientInfo) {
        livekitModels$ClientInfo.getClass();
        LivekitModels$ClientInfo livekitModels$ClientInfo2 = this.client_;
        if (livekitModels$ClientInfo2 == null || livekitModels$ClientInfo2 == LivekitModels$ClientInfo.getDefaultInstance()) {
            this.client_ = livekitModels$ClientInfo;
            return;
        }
        C14704a2 c14704a2NewBuilder = LivekitModels$ClientInfo.newBuilder(this.client_);
        c14704a2NewBuilder.m13865f(livekitModels$ClientInfo);
        this.client_ = (LivekitModels$ClientInfo) c14704a2NewBuilder.m13862c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCreateRoom(LivekitRoom$CreateRoomRequest livekitRoom$CreateRoomRequest) {
        livekitRoom$CreateRoomRequest.getClass();
        LivekitRoom$CreateRoomRequest livekitRoom$CreateRoomRequest2 = this.createRoom_;
        if (livekitRoom$CreateRoomRequest2 == null || livekitRoom$CreateRoomRequest2 == LivekitRoom$CreateRoomRequest.getDefaultInstance()) {
            this.createRoom_ = livekitRoom$CreateRoomRequest;
            return;
        }
        C14768j3 c14768j3NewBuilder = LivekitRoom$CreateRoomRequest.newBuilder(this.createRoom_);
        c14768j3NewBuilder.m13865f(livekitRoom$CreateRoomRequest);
        this.createRoom_ = (LivekitRoom$CreateRoomRequest) c14768j3NewBuilder.m13862c();
    }

    public static C14614L1 newBuilder() {
        return (C14614L1) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitInternal$StartSession parseDelimitedFrom(InputStream inputStream) {
        return (LivekitInternal$StartSession) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitInternal$StartSession parseFrom(ByteBuffer byteBuffer) {
        return (LivekitInternal$StartSession) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC12124U0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdaptiveStream(boolean z6) {
        this.adaptiveStream_ = z6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAutoSubscribe(boolean z6) {
        this.autoSubscribe_ = z6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClient(LivekitModels$ClientInfo livekitModels$ClientInfo) {
        livekitModels$ClientInfo.getClass();
        this.client_ = livekitModels$ClientInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConnectionId(String str) {
        str.getClass();
        this.connectionId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConnectionIdBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.connectionId_ = abstractC12171m.m14012w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCreateRoom(LivekitRoom$CreateRoomRequest livekitRoom$CreateRoomRequest) {
        livekitRoom$CreateRoomRequest.getClass();
        this.createRoom_ = livekitRoom$CreateRoomRequest;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisableIceLite(boolean z6) {
        this.disableIceLite_ = z6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGrantsJson(String str) {
        str.getClass();
        this.grantsJson_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGrantsJsonBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.grantsJson_ = abstractC12171m.m14012w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHidden(boolean z6) {
        this.hidden_ = z6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIdentity(String str) {
        str.getClass();
        this.identity_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIdentityBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.identity_ = abstractC12171m.m14012w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(String str) {
        str.getClass();
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.name_ = abstractC12171m.m14012w();
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
    public void setReconnect(boolean z6) {
        this.reconnect_ = z6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReconnectReason(EnumC14572E2 enumC14572E2) {
        this.reconnectReason_ = enumC14572E2.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReconnectReasonValue(int i10) {
        this.reconnectReason_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRecorder(boolean z6) {
        this.recorder_ = z6;
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
    public void setSubscriberAllowPause(boolean z6) {
        this.bitField0_ |= 1;
        this.subscriberAllowPause_ = z6;
    }

    @Override // com.google.protobuf.AbstractC12133Z
    public final Object dynamicMethod(EnumC12131Y enumC12131Y, Object obj, Object obj2) {
        switch (enumC12131Y.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AbstractC12133Z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0010\u0000\u0001\u0001\u0014\u0010\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\u0007\t\u0007\n\u0007\u000b\t\f\u0007\rȈ\u000eȈ\u000f\u0007\u0010Ȉ\u0011\f\u0012ဇ\u0000\u0013\u0007\u0014\t", new Object[]{"bitField0_", "roomName_", "identity_", "connectionId_", "reconnect_", "autoSubscribe_", "hidden_", "client_", "recorder_", "name_", "grantsJson_", "adaptiveStream_", "participantId_", "reconnectReason_", "subscriberAllowPause_", "disableIceLite_", "createRoom_"});
            case 3:
                return new LivekitInternal$StartSession();
            case 4:
                return new C14614L1(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC12124U0 c12123u = PARSER;
                if (c12123u == null) {
                    synchronized (LivekitInternal$StartSession.class) {
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

    public boolean getAdaptiveStream() {
        return this.adaptiveStream_;
    }

    public boolean getAutoSubscribe() {
        return this.autoSubscribe_;
    }

    public LivekitModels$ClientInfo getClient() {
        LivekitModels$ClientInfo livekitModels$ClientInfo = this.client_;
        return livekitModels$ClientInfo == null ? LivekitModels$ClientInfo.getDefaultInstance() : livekitModels$ClientInfo;
    }

    public String getConnectionId() {
        return this.connectionId_;
    }

    public AbstractC12171m getConnectionIdBytes() {
        return AbstractC12171m.m14011m(this.connectionId_);
    }

    public LivekitRoom$CreateRoomRequest getCreateRoom() {
        LivekitRoom$CreateRoomRequest livekitRoom$CreateRoomRequest = this.createRoom_;
        return livekitRoom$CreateRoomRequest == null ? LivekitRoom$CreateRoomRequest.getDefaultInstance() : livekitRoom$CreateRoomRequest;
    }

    public boolean getDisableIceLite() {
        return this.disableIceLite_;
    }

    public String getGrantsJson() {
        return this.grantsJson_;
    }

    public AbstractC12171m getGrantsJsonBytes() {
        return AbstractC12171m.m14011m(this.grantsJson_);
    }

    public boolean getHidden() {
        return this.hidden_;
    }

    public String getIdentity() {
        return this.identity_;
    }

    public AbstractC12171m getIdentityBytes() {
        return AbstractC12171m.m14011m(this.identity_);
    }

    public String getName() {
        return this.name_;
    }

    public AbstractC12171m getNameBytes() {
        return AbstractC12171m.m14011m(this.name_);
    }

    public String getParticipantId() {
        return this.participantId_;
    }

    public AbstractC12171m getParticipantIdBytes() {
        return AbstractC12171m.m14011m(this.participantId_);
    }

    public boolean getReconnect() {
        return this.reconnect_;
    }

    public EnumC14572E2 getReconnectReason() {
        EnumC14572E2 enumC14572E2M16042a = EnumC14572E2.m16042a(this.reconnectReason_);
        return enumC14572E2M16042a == null ? EnumC14572E2.UNRECOGNIZED : enumC14572E2M16042a;
    }

    public int getReconnectReasonValue() {
        return this.reconnectReason_;
    }

    public boolean getRecorder() {
        return this.recorder_;
    }

    public String getRoomName() {
        return this.roomName_;
    }

    public AbstractC12171m getRoomNameBytes() {
        return AbstractC12171m.m14011m(this.roomName_);
    }

    public boolean getSubscriberAllowPause() {
        return this.subscriberAllowPause_;
    }

    public boolean hasClient() {
        return this.client_ != null;
    }

    public boolean hasCreateRoom() {
        return this.createRoom_ != null;
    }

    public boolean hasSubscriberAllowPause() {
        return (this.bitField0_ & 1) != 0;
    }

    public static C14614L1 newBuilder(LivekitInternal$StartSession livekitInternal$StartSession) {
        return (C14614L1) DEFAULT_INSTANCE.createBuilder(livekitInternal$StartSession);
    }

    public static LivekitInternal$StartSession parseDelimitedFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitInternal$StartSession) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitInternal$StartSession parseFrom(ByteBuffer byteBuffer, C12087F c12087f) {
        return (LivekitInternal$StartSession) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer, c12087f);
    }

    public static LivekitInternal$StartSession parseFrom(AbstractC12171m abstractC12171m) {
        return (LivekitInternal$StartSession) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m);
    }

    public static LivekitInternal$StartSession parseFrom(AbstractC12171m abstractC12171m, C12087F c12087f) {
        return (LivekitInternal$StartSession) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m, c12087f);
    }

    public static LivekitInternal$StartSession parseFrom(byte[] bArr) {
        return (LivekitInternal$StartSession) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitInternal$StartSession parseFrom(byte[] bArr, C12087F c12087f) {
        return (LivekitInternal$StartSession) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr, c12087f);
    }

    public static LivekitInternal$StartSession parseFrom(InputStream inputStream) {
        return (LivekitInternal$StartSession) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitInternal$StartSession parseFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitInternal$StartSession) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitInternal$StartSession parseFrom(AbstractC12186r abstractC12186r) {
        return (LivekitInternal$StartSession) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r);
    }

    public static LivekitInternal$StartSession parseFrom(AbstractC12186r abstractC12186r, C12087F c12087f) {
        return (LivekitInternal$StartSession) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r, c12087f);
    }
}
