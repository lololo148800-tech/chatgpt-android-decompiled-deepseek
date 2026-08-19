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
import p793ho.C14719c3;
import p806ia.nJAW.FpwNpGDhomXHZ;

/* JADX INFO: loaded from: classes2.dex */
public final class LivekitModels$UserPacket extends AbstractC12133Z implements InterfaceC12094H0 {
    private static final LivekitModels$UserPacket DEFAULT_INSTANCE;
    public static final int DESTINATION_IDENTITIES_FIELD_NUMBER = 6;
    public static final int DESTINATION_SIDS_FIELD_NUMBER = 3;
    public static final int END_TIME_FIELD_NUMBER = 10;
    public static final int ID_FIELD_NUMBER = 8;
    private static volatile InterfaceC12124U0 PARSER = null;
    public static final int PARTICIPANT_IDENTITY_FIELD_NUMBER = 5;
    public static final int PARTICIPANT_SID_FIELD_NUMBER = 1;
    public static final int PAYLOAD_FIELD_NUMBER = 2;
    public static final int START_TIME_FIELD_NUMBER = 9;
    public static final int TOPIC_FIELD_NUMBER = 4;
    private int bitField0_;
    private InterfaceC12172m0 destinationIdentities_;
    private InterfaceC12172m0 destinationSids_;
    private long endTime_;
    private String id_;
    private String participantIdentity_;
    private String participantSid_;
    private AbstractC12171m payload_;
    private long startTime_;
    private String topic_;

    static {
        LivekitModels$UserPacket livekitModels$UserPacket = new LivekitModels$UserPacket();
        DEFAULT_INSTANCE = livekitModels$UserPacket;
        AbstractC12133Z.registerDefaultInstance(LivekitModels$UserPacket.class, livekitModels$UserPacket);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllDestinationIdentities(Iterable<String> iterable) {
        ensureDestinationIdentitiesIsMutable();
        AbstractC12138b.addAll((Iterable) iterable, (List) this.destinationIdentities_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllDestinationSids(Iterable<String> iterable) {
        ensureDestinationSidsIsMutable();
        AbstractC12138b.addAll((Iterable) iterable, (List) this.destinationSids_);
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
    public void addDestinationSids(String str) {
        str.getClass();
        ensureDestinationSidsIsMutable();
        this.destinationSids_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addDestinationSidsBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        ensureDestinationSidsIsMutable();
        this.destinationSids_.add(abstractC12171m.m14012w());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDestinationIdentities() {
        this.destinationIdentities_ = AbstractC12133Z.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDestinationSids() {
        this.destinationSids_ = AbstractC12133Z.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEndTime() {
        this.bitField0_ &= -9;
        this.endTime_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.bitField0_ &= -3;
        this.id_ = getDefaultInstance().getId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearParticipantIdentity() {
        this.participantIdentity_ = getDefaultInstance().getParticipantIdentity();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearParticipantSid() {
        this.participantSid_ = getDefaultInstance().getParticipantSid();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPayload() {
        this.payload_ = getDefaultInstance().getPayload();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStartTime() {
        this.bitField0_ &= -5;
        this.startTime_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTopic() {
        this.bitField0_ &= -2;
        this.topic_ = getDefaultInstance().getTopic();
    }

    private void ensureDestinationIdentitiesIsMutable() {
        InterfaceC12172m0 interfaceC12172m0 = this.destinationIdentities_;
        if (((AbstractC12141c) interfaceC12172m0).f37021Y) {
            return;
        }
        this.destinationIdentities_ = AbstractC12133Z.mutableCopy(interfaceC12172m0);
    }

    private void ensureDestinationSidsIsMutable() {
        InterfaceC12172m0 interfaceC12172m0 = this.destinationSids_;
        if (((AbstractC12141c) interfaceC12172m0).f37021Y) {
            return;
        }
        this.destinationSids_ = AbstractC12133Z.mutableCopy(interfaceC12172m0);
    }

    public static LivekitModels$UserPacket getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C14719c3 newBuilder() {
        return (C14719c3) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitModels$UserPacket parseDelimitedFrom(InputStream inputStream) {
        return (LivekitModels$UserPacket) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitModels$UserPacket parseFrom(ByteBuffer byteBuffer) {
        return (LivekitModels$UserPacket) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC12124U0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDestinationIdentities(int i10, String str) {
        str.getClass();
        ensureDestinationIdentitiesIsMutable();
        this.destinationIdentities_.set(i10, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDestinationSids(int i10, String str) {
        str.getClass();
        ensureDestinationSidsIsMutable();
        this.destinationSids_.set(i10, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEndTime(long j10) {
        this.bitField0_ |= 8;
        this.endTime_ = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setId(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.id_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIdBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.id_ = abstractC12171m.m14012w();
        this.bitField0_ |= 2;
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
    public void setPayload(AbstractC12171m abstractC12171m) {
        abstractC12171m.getClass();
        this.payload_ = abstractC12171m;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStartTime(long j10) {
        this.bitField0_ |= 4;
        this.startTime_ = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTopic(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.topic_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTopicBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.topic_ = abstractC12171m.m14012w();
        this.bitField0_ |= 1;
    }

    @Override // com.google.protobuf.AbstractC12133Z
    public final Object dynamicMethod(EnumC12131Y enumC12131Y, Object obj, Object obj2) {
        switch (enumC12131Y.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AbstractC12133Z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0001\u0001\n\t\u0000\u0002\u0000\u0001Ȉ\u0002\n\u0003Ț\u0004ለ\u0000\u0005Ȉ\u0006Ț\bለ\u0001\tဃ\u0002\nဃ\u0003", new Object[]{"bitField0_", "participantSid_", "payload_", "destinationSids_", "topic_", "participantIdentity_", "destinationIdentities_", "id_", "startTime_", "endTime_"});
            case 3:
                return new LivekitModels$UserPacket();
            case 4:
                return new C14719c3(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC12124U0 c12123u = PARSER;
                if (c12123u == null) {
                    synchronized (LivekitModels$UserPacket.class) {
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

    @Deprecated
    public String getDestinationIdentities(int i10) {
        return (String) this.destinationIdentities_.get(i10);
    }

    @Deprecated
    public AbstractC12171m getDestinationIdentitiesBytes(int i10) {
        return AbstractC12171m.m14011m((String) this.destinationIdentities_.get(i10));
    }

    @Deprecated
    public int getDestinationIdentitiesCount() {
        return this.destinationIdentities_.size();
    }

    @Deprecated
    public List<String> getDestinationIdentitiesList() {
        return this.destinationIdentities_;
    }

    @Deprecated
    public String getDestinationSids(int i10) {
        return (String) this.destinationSids_.get(i10);
    }

    @Deprecated
    public AbstractC12171m getDestinationSidsBytes(int i10) {
        return AbstractC12171m.m14011m((String) this.destinationSids_.get(i10));
    }

    @Deprecated
    public int getDestinationSidsCount() {
        return this.destinationSids_.size();
    }

    @Deprecated
    public List<String> getDestinationSidsList() {
        return this.destinationSids_;
    }

    public long getEndTime() {
        return this.endTime_;
    }

    public String getId() {
        return this.id_;
    }

    public AbstractC12171m getIdBytes() {
        return AbstractC12171m.m14011m(this.id_);
    }

    @Deprecated
    public String getParticipantIdentity() {
        return this.participantIdentity_;
    }

    @Deprecated
    public AbstractC12171m getParticipantIdentityBytes() {
        return AbstractC12171m.m14011m(this.participantIdentity_);
    }

    @Deprecated
    public String getParticipantSid() {
        return this.participantSid_;
    }

    @Deprecated
    public AbstractC12171m getParticipantSidBytes() {
        return AbstractC12171m.m14011m(this.participantSid_);
    }

    public AbstractC12171m getPayload() {
        return this.payload_;
    }

    public long getStartTime() {
        return this.startTime_;
    }

    public String getTopic() {
        return this.topic_;
    }

    public AbstractC12171m getTopicBytes() {
        return AbstractC12171m.m14011m(this.topic_);
    }

    public boolean hasEndTime() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasId() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasStartTime() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasTopic() {
        return (this.bitField0_ & 1) != 0;
    }

    public static C14719c3 newBuilder(LivekitModels$UserPacket livekitModels$UserPacket) {
        return (C14719c3) DEFAULT_INSTANCE.createBuilder(livekitModels$UserPacket);
    }

    public static LivekitModels$UserPacket parseDelimitedFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitModels$UserPacket) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitModels$UserPacket parseFrom(ByteBuffer byteBuffer, C12087F c12087f) {
        return (LivekitModels$UserPacket) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer, c12087f);
    }

    private LivekitModels$UserPacket() {
        String str = FpwNpGDhomXHZ.zRJD;
        this.participantSid_ = str;
        this.participantIdentity_ = str;
        this.payload_ = AbstractC12171m.f37047Z;
        this.destinationSids_ = AbstractC12133Z.emptyProtobufList();
        this.destinationIdentities_ = AbstractC12133Z.emptyProtobufList();
        this.topic_ = str;
        this.id_ = str;
    }

    public static LivekitModels$UserPacket parseFrom(AbstractC12171m abstractC12171m) {
        return (LivekitModels$UserPacket) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m);
    }

    public static LivekitModels$UserPacket parseFrom(AbstractC12171m abstractC12171m, C12087F c12087f) {
        return (LivekitModels$UserPacket) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m, c12087f);
    }

    public static LivekitModels$UserPacket parseFrom(byte[] bArr) {
        return (LivekitModels$UserPacket) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitModels$UserPacket parseFrom(byte[] bArr, C12087F c12087f) {
        return (LivekitModels$UserPacket) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr, c12087f);
    }

    public static LivekitModels$UserPacket parseFrom(InputStream inputStream) {
        return (LivekitModels$UserPacket) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitModels$UserPacket parseFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitModels$UserPacket) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitModels$UserPacket parseFrom(AbstractC12186r abstractC12186r) {
        return (LivekitModels$UserPacket) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r);
    }

    public static LivekitModels$UserPacket parseFrom(AbstractC12186r abstractC12186r, C12087F c12087f) {
        return (LivekitModels$UserPacket) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r, c12087f);
    }
}
