package livekit;

import com.google.protobuf.AbstractC12133Z;
import com.google.protobuf.AbstractC12138b;
import com.google.protobuf.AbstractC12141c;
import com.google.protobuf.AbstractC12171m;
import com.google.protobuf.AbstractC12186r;
import com.google.protobuf.C12087F;
import com.google.protobuf.C12123U;
import com.google.protobuf.EnumC12131Y;
import com.google.protobuf.InterfaceC12094H0;
import com.google.protobuf.InterfaceC12124U0;
import com.google.protobuf.InterfaceC12172m0;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import p793ho.C14591H2;
import p793ho.C14603J2;
import p793ho.C14609K2;
import p793ho.C14645Q2;
import p793ho.C14649R1;
import p793ho.C14667U1;
import p793ho.C14685X1;
import p793ho.C14698Z2;
import p793ho.C14719c3;
import p793ho.C14739f2;
import p793ho.EnumC14746g2;
import p793ho.EnumC14753h2;

/* JADX INFO: loaded from: classes2.dex */
public final class LivekitModels$DataPacket extends AbstractC12133Z implements InterfaceC12094H0 {
    public static final int CHAT_MESSAGE_FIELD_NUMBER = 9;
    private static final LivekitModels$DataPacket DEFAULT_INSTANCE;
    public static final int DESTINATION_IDENTITIES_FIELD_NUMBER = 5;
    public static final int KIND_FIELD_NUMBER = 1;
    public static final int METRICS_FIELD_NUMBER = 8;
    private static volatile InterfaceC12124U0 PARSER = null;
    public static final int PARTICIPANT_IDENTITY_FIELD_NUMBER = 4;
    public static final int RPC_ACK_FIELD_NUMBER = 11;
    public static final int RPC_REQUEST_FIELD_NUMBER = 10;
    public static final int RPC_RESPONSE_FIELD_NUMBER = 12;
    public static final int SIP_DTMF_FIELD_NUMBER = 6;
    public static final int SPEAKER_FIELD_NUMBER = 3;
    public static final int TRANSCRIPTION_FIELD_NUMBER = 7;
    public static final int USER_FIELD_NUMBER = 2;
    private int kind_;
    private Object value_;
    private int valueCase_ = 0;
    private String participantIdentity_ = "";
    private InterfaceC12172m0 destinationIdentities_ = AbstractC12133Z.emptyProtobufList();

    static {
        LivekitModels$DataPacket livekitModels$DataPacket = new LivekitModels$DataPacket();
        DEFAULT_INSTANCE = livekitModels$DataPacket;
        AbstractC12133Z.registerDefaultInstance(LivekitModels$DataPacket.class, livekitModels$DataPacket);
    }

    private LivekitModels$DataPacket() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllDestinationIdentities(Iterable<String> iterable) {
        ensureDestinationIdentitiesIsMutable();
        AbstractC12138b.addAll((Iterable) iterable, (List) this.destinationIdentities_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addDestinationIdentities(String str) {
        str.getClass();
        ensureDestinationIdentitiesIsMutable();
        this.destinationIdentities_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addDestinationIdentitiesBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        ensureDestinationIdentitiesIsMutable();
        this.destinationIdentities_.add(abstractC12171m.m14012w());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearChatMessage() {
        if (this.valueCase_ == 9) {
            this.valueCase_ = 0;
            this.value_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDestinationIdentities() {
        this.destinationIdentities_ = AbstractC12133Z.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearKind() {
        this.kind_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMetrics() {
        if (this.valueCase_ == 8) {
            this.valueCase_ = 0;
            this.value_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearParticipantIdentity() {
        this.participantIdentity_ = getDefaultInstance().getParticipantIdentity();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRpcAck() {
        if (this.valueCase_ == 11) {
            this.valueCase_ = 0;
            this.value_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRpcRequest() {
        if (this.valueCase_ == 10) {
            this.valueCase_ = 0;
            this.value_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRpcResponse() {
        if (this.valueCase_ == 12) {
            this.valueCase_ = 0;
            this.value_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSipDtmf() {
        if (this.valueCase_ == 6) {
            this.valueCase_ = 0;
            this.value_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSpeaker() {
        if (this.valueCase_ == 3) {
            this.valueCase_ = 0;
            this.value_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTranscription() {
        if (this.valueCase_ == 7) {
            this.valueCase_ = 0;
            this.value_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUser() {
        if (this.valueCase_ == 2) {
            this.valueCase_ = 0;
            this.value_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValue() {
        this.valueCase_ = 0;
        this.value_ = null;
    }

    private void ensureDestinationIdentitiesIsMutable() {
        InterfaceC12172m0 interfaceC12172m0 = this.destinationIdentities_;
        if (((AbstractC12141c) interfaceC12172m0).f37021Y) {
            return;
        }
        this.destinationIdentities_ = AbstractC12133Z.mutableCopy(interfaceC12172m0);
    }

    public static LivekitModels$DataPacket getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeChatMessage(LivekitModels$ChatMessage livekitModels$ChatMessage) {
        livekitModels$ChatMessage.getClass();
        if (this.valueCase_ != 9 || this.value_ == LivekitModels$ChatMessage.getDefaultInstance()) {
            this.value_ = livekitModels$ChatMessage;
        } else {
            C14685X1 c14685x1NewBuilder = LivekitModels$ChatMessage.newBuilder((LivekitModels$ChatMessage) this.value_);
            c14685x1NewBuilder.m13865f(livekitModels$ChatMessage);
            this.value_ = c14685x1NewBuilder.m13862c();
        }
        this.valueCase_ = 9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMetrics(LivekitMetrics$MetricsBatch livekitMetrics$MetricsBatch) {
        livekitMetrics$MetricsBatch.getClass();
        if (this.valueCase_ != 8 || this.value_ == LivekitMetrics$MetricsBatch.getDefaultInstance()) {
            this.value_ = livekitMetrics$MetricsBatch;
        } else {
            C14649R1 c14649r1NewBuilder = LivekitMetrics$MetricsBatch.newBuilder((LivekitMetrics$MetricsBatch) this.value_);
            c14649r1NewBuilder.m13865f(livekitMetrics$MetricsBatch);
            this.value_ = c14649r1NewBuilder.m13862c();
        }
        this.valueCase_ = 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRpcAck(LivekitModels$RpcAck livekitModels$RpcAck) {
        livekitModels$RpcAck.getClass();
        if (this.valueCase_ != 11 || this.value_ == LivekitModels$RpcAck.getDefaultInstance()) {
            this.value_ = livekitModels$RpcAck;
        } else {
            C14591H2 c14591h2NewBuilder = LivekitModels$RpcAck.newBuilder((LivekitModels$RpcAck) this.value_);
            c14591h2NewBuilder.m13865f(livekitModels$RpcAck);
            this.value_ = c14591h2NewBuilder.m13862c();
        }
        this.valueCase_ = 11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRpcRequest(LivekitModels$RpcRequest livekitModels$RpcRequest) {
        livekitModels$RpcRequest.getClass();
        if (this.valueCase_ != 10 || this.value_ == LivekitModels$RpcRequest.getDefaultInstance()) {
            this.value_ = livekitModels$RpcRequest;
        } else {
            C14603J2 c14603j2NewBuilder = LivekitModels$RpcRequest.newBuilder((LivekitModels$RpcRequest) this.value_);
            c14603j2NewBuilder.m13865f(livekitModels$RpcRequest);
            this.value_ = c14603j2NewBuilder.m13862c();
        }
        this.valueCase_ = 10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRpcResponse(LivekitModels$RpcResponse livekitModels$RpcResponse) {
        livekitModels$RpcResponse.getClass();
        if (this.valueCase_ != 12 || this.value_ == LivekitModels$RpcResponse.getDefaultInstance()) {
            this.value_ = livekitModels$RpcResponse;
        } else {
            C14609K2 c14609k2NewBuilder = LivekitModels$RpcResponse.newBuilder((LivekitModels$RpcResponse) this.value_);
            c14609k2NewBuilder.m13865f(livekitModels$RpcResponse);
            this.value_ = c14609k2NewBuilder.m13862c();
        }
        this.valueCase_ = 12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSipDtmf(LivekitModels$SipDTMF livekitModels$SipDTMF) {
        livekitModels$SipDTMF.getClass();
        if (this.valueCase_ != 6 || this.value_ == LivekitModels$SipDTMF.getDefaultInstance()) {
            this.value_ = livekitModels$SipDTMF;
        } else {
            C14645Q2 c14645q2NewBuilder = LivekitModels$SipDTMF.newBuilder((LivekitModels$SipDTMF) this.value_);
            c14645q2NewBuilder.m13865f(livekitModels$SipDTMF);
            this.value_ = c14645q2NewBuilder.m13862c();
        }
        this.valueCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSpeaker(LivekitModels$ActiveSpeakerUpdate livekitModels$ActiveSpeakerUpdate) {
        livekitModels$ActiveSpeakerUpdate.getClass();
        if (this.valueCase_ != 3 || this.value_ == LivekitModels$ActiveSpeakerUpdate.getDefaultInstance()) {
            this.value_ = livekitModels$ActiveSpeakerUpdate;
        } else {
            C14667U1 c14667u1NewBuilder = LivekitModels$ActiveSpeakerUpdate.newBuilder((LivekitModels$ActiveSpeakerUpdate) this.value_);
            c14667u1NewBuilder.m13865f(livekitModels$ActiveSpeakerUpdate);
            this.value_ = c14667u1NewBuilder.m13862c();
        }
        this.valueCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTranscription(LivekitModels$Transcription livekitModels$Transcription) {
        livekitModels$Transcription.getClass();
        if (this.valueCase_ != 7 || this.value_ == LivekitModels$Transcription.getDefaultInstance()) {
            this.value_ = livekitModels$Transcription;
        } else {
            C14698Z2 c14698z2NewBuilder = LivekitModels$Transcription.newBuilder((LivekitModels$Transcription) this.value_);
            c14698z2NewBuilder.m13865f(livekitModels$Transcription);
            this.value_ = c14698z2NewBuilder.m13862c();
        }
        this.valueCase_ = 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeUser(LivekitModels$UserPacket livekitModels$UserPacket) {
        livekitModels$UserPacket.getClass();
        if (this.valueCase_ != 2 || this.value_ == LivekitModels$UserPacket.getDefaultInstance()) {
            this.value_ = livekitModels$UserPacket;
        } else {
            C14719c3 c14719c3NewBuilder = LivekitModels$UserPacket.newBuilder((LivekitModels$UserPacket) this.value_);
            c14719c3NewBuilder.m13865f(livekitModels$UserPacket);
            this.value_ = c14719c3NewBuilder.m13862c();
        }
        this.valueCase_ = 2;
    }

    public static C14739f2 newBuilder() {
        return (C14739f2) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitModels$DataPacket parseDelimitedFrom(InputStream inputStream) {
        return (LivekitModels$DataPacket) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitModels$DataPacket parseFrom(ByteBuffer byteBuffer) {
        return (LivekitModels$DataPacket) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC12124U0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setChatMessage(LivekitModels$ChatMessage livekitModels$ChatMessage) {
        livekitModels$ChatMessage.getClass();
        this.value_ = livekitModels$ChatMessage;
        this.valueCase_ = 9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDestinationIdentities(int i10, String str) {
        str.getClass();
        ensureDestinationIdentitiesIsMutable();
        this.destinationIdentities_.set(i10, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKind(EnumC14746g2 enumC14746g2) {
        this.kind_ = enumC14746g2.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKindValue(int i10) {
        this.kind_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMetrics(LivekitMetrics$MetricsBatch livekitMetrics$MetricsBatch) {
        livekitMetrics$MetricsBatch.getClass();
        this.value_ = livekitMetrics$MetricsBatch;
        this.valueCase_ = 8;
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
    public void setRpcAck(LivekitModels$RpcAck livekitModels$RpcAck) {
        livekitModels$RpcAck.getClass();
        this.value_ = livekitModels$RpcAck;
        this.valueCase_ = 11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRpcRequest(LivekitModels$RpcRequest livekitModels$RpcRequest) {
        livekitModels$RpcRequest.getClass();
        this.value_ = livekitModels$RpcRequest;
        this.valueCase_ = 10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRpcResponse(LivekitModels$RpcResponse livekitModels$RpcResponse) {
        livekitModels$RpcResponse.getClass();
        this.value_ = livekitModels$RpcResponse;
        this.valueCase_ = 12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSipDtmf(LivekitModels$SipDTMF livekitModels$SipDTMF) {
        livekitModels$SipDTMF.getClass();
        this.value_ = livekitModels$SipDTMF;
        this.valueCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSpeaker(LivekitModels$ActiveSpeakerUpdate livekitModels$ActiveSpeakerUpdate) {
        livekitModels$ActiveSpeakerUpdate.getClass();
        this.value_ = livekitModels$ActiveSpeakerUpdate;
        this.valueCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTranscription(LivekitModels$Transcription livekitModels$Transcription) {
        livekitModels$Transcription.getClass();
        this.value_ = livekitModels$Transcription;
        this.valueCase_ = 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUser(LivekitModels$UserPacket livekitModels$UserPacket) {
        livekitModels$UserPacket.getClass();
        this.value_ = livekitModels$UserPacket;
        this.valueCase_ = 2;
    }

    @Override // com.google.protobuf.AbstractC12133Z
    public final Object dynamicMethod(EnumC12131Y enumC12131Y, Object obj, Object obj2) {
        switch (enumC12131Y.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AbstractC12133Z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\f\u0001\u0000\u0001\f\f\u0000\u0001\u0000\u0001\f\u0002<\u0000\u0003<\u0000\u0004Ȉ\u0005Ț\u0006<\u0000\u0007<\u0000\b<\u0000\t<\u0000\n<\u0000\u000b<\u0000\f<\u0000", new Object[]{"value_", "valueCase_", "kind_", LivekitModels$UserPacket.class, LivekitModels$ActiveSpeakerUpdate.class, "participantIdentity_", "destinationIdentities_", LivekitModels$SipDTMF.class, LivekitModels$Transcription.class, LivekitMetrics$MetricsBatch.class, LivekitModels$ChatMessage.class, LivekitModels$RpcRequest.class, LivekitModels$RpcAck.class, LivekitModels$RpcResponse.class});
            case 3:
                return new LivekitModels$DataPacket();
            case 4:
                return new C14739f2(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC12124U0 c12123u = PARSER;
                if (c12123u == null) {
                    synchronized (LivekitModels$DataPacket.class) {
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

    public LivekitModels$ChatMessage getChatMessage() {
        return this.valueCase_ == 9 ? (LivekitModels$ChatMessage) this.value_ : LivekitModels$ChatMessage.getDefaultInstance();
    }

    public String getDestinationIdentities(int i10) {
        return (String) this.destinationIdentities_.get(i10);
    }

    public AbstractC12171m getDestinationIdentitiesBytes(int i10) {
        return AbstractC12171m.m14011m((String) this.destinationIdentities_.get(i10));
    }

    public int getDestinationIdentitiesCount() {
        return this.destinationIdentities_.size();
    }

    public List<String> getDestinationIdentitiesList() {
        return this.destinationIdentities_;
    }

    @Deprecated
    public EnumC14746g2 getKind() {
        EnumC14746g2 enumC14746g2;
        int i10 = this.kind_;
        if (i10 != 0) {
            enumC14746g2 = i10 != 1 ? null : EnumC14746g2.LOSSY;
        } else {
            enumC14746g2 = EnumC14746g2.RELIABLE;
        }
        return enumC14746g2 == null ? EnumC14746g2.UNRECOGNIZED : enumC14746g2;
    }

    @Deprecated
    public int getKindValue() {
        return this.kind_;
    }

    public LivekitMetrics$MetricsBatch getMetrics() {
        return this.valueCase_ == 8 ? (LivekitMetrics$MetricsBatch) this.value_ : LivekitMetrics$MetricsBatch.getDefaultInstance();
    }

    public String getParticipantIdentity() {
        return this.participantIdentity_;
    }

    public AbstractC12171m getParticipantIdentityBytes() {
        return AbstractC12171m.m14011m(this.participantIdentity_);
    }

    public LivekitModels$RpcAck getRpcAck() {
        return this.valueCase_ == 11 ? (LivekitModels$RpcAck) this.value_ : LivekitModels$RpcAck.getDefaultInstance();
    }

    public LivekitModels$RpcRequest getRpcRequest() {
        return this.valueCase_ == 10 ? (LivekitModels$RpcRequest) this.value_ : LivekitModels$RpcRequest.getDefaultInstance();
    }

    public LivekitModels$RpcResponse getRpcResponse() {
        return this.valueCase_ == 12 ? (LivekitModels$RpcResponse) this.value_ : LivekitModels$RpcResponse.getDefaultInstance();
    }

    public LivekitModels$SipDTMF getSipDtmf() {
        return this.valueCase_ == 6 ? (LivekitModels$SipDTMF) this.value_ : LivekitModels$SipDTMF.getDefaultInstance();
    }

    @Deprecated
    public LivekitModels$ActiveSpeakerUpdate getSpeaker() {
        return this.valueCase_ == 3 ? (LivekitModels$ActiveSpeakerUpdate) this.value_ : LivekitModels$ActiveSpeakerUpdate.getDefaultInstance();
    }

    public LivekitModels$Transcription getTranscription() {
        return this.valueCase_ == 7 ? (LivekitModels$Transcription) this.value_ : LivekitModels$Transcription.getDefaultInstance();
    }

    public LivekitModels$UserPacket getUser() {
        return this.valueCase_ == 2 ? (LivekitModels$UserPacket) this.value_ : LivekitModels$UserPacket.getDefaultInstance();
    }

    public EnumC14753h2 getValueCase() {
        int i10 = this.valueCase_;
        if (i10 == 0) {
            return EnumC14753h2.f46149v0;
        }
        if (i10 == 2) {
            return EnumC14753h2.f46140Y;
        }
        if (i10 == 3) {
            return EnumC14753h2.f46141Z;
        }
        switch (i10) {
            case 6:
                return EnumC14753h2.f46142o0;
            case 7:
                return EnumC14753h2.f46143p0;
            case 8:
                return EnumC14753h2.f46144q0;
            case 9:
                return EnumC14753h2.f46145r0;
            case 10:
                return EnumC14753h2.f46146s0;
            case 11:
                return EnumC14753h2.f46147t0;
            case 12:
                return EnumC14753h2.f46148u0;
            default:
                return null;
        }
    }

    public boolean hasChatMessage() {
        return this.valueCase_ == 9;
    }

    public boolean hasMetrics() {
        return this.valueCase_ == 8;
    }

    public boolean hasRpcAck() {
        return this.valueCase_ == 11;
    }

    public boolean hasRpcRequest() {
        return this.valueCase_ == 10;
    }

    public boolean hasRpcResponse() {
        return this.valueCase_ == 12;
    }

    public boolean hasSipDtmf() {
        return this.valueCase_ == 6;
    }

    @Deprecated
    public boolean hasSpeaker() {
        return this.valueCase_ == 3;
    }

    public boolean hasTranscription() {
        return this.valueCase_ == 7;
    }

    public boolean hasUser() {
        return this.valueCase_ == 2;
    }

    public static C14739f2 newBuilder(LivekitModels$DataPacket livekitModels$DataPacket) {
        return (C14739f2) DEFAULT_INSTANCE.createBuilder(livekitModels$DataPacket);
    }

    public static LivekitModels$DataPacket parseDelimitedFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitModels$DataPacket) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitModels$DataPacket parseFrom(ByteBuffer byteBuffer, C12087F c12087f) {
        return (LivekitModels$DataPacket) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer, c12087f);
    }

    public static LivekitModels$DataPacket parseFrom(AbstractC12171m abstractC12171m) {
        return (LivekitModels$DataPacket) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m);
    }

    public static LivekitModels$DataPacket parseFrom(AbstractC12171m abstractC12171m, C12087F c12087f) {
        return (LivekitModels$DataPacket) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m, c12087f);
    }

    public static LivekitModels$DataPacket parseFrom(byte[] bArr) {
        return (LivekitModels$DataPacket) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitModels$DataPacket parseFrom(byte[] bArr, C12087F c12087f) {
        return (LivekitModels$DataPacket) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr, c12087f);
    }

    public static LivekitModels$DataPacket parseFrom(InputStream inputStream) {
        return (LivekitModels$DataPacket) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitModels$DataPacket parseFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitModels$DataPacket) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitModels$DataPacket parseFrom(AbstractC12186r abstractC12186r) {
        return (LivekitModels$DataPacket) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r);
    }

    public static LivekitModels$DataPacket parseFrom(AbstractC12186r abstractC12186r, C12087F c12087f) {
        return (LivekitModels$DataPacket) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r, c12087f);
    }
}
