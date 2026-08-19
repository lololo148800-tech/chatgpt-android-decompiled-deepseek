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
import p793ho.C14579F2;
import p793ho.C14722d;
import p793ho.C14743g;
import p793ho.C14802o2;
import p793ho.EnumC14764j;
import p793ho.InterfaceC14736f;

/* JADX INFO: loaded from: classes2.dex */
public final class LivekitAgent$Job extends AbstractC12133Z implements InterfaceC14736f {
    public static final int AGENT_NAME_FIELD_NUMBER = 7;
    private static final LivekitAgent$Job DEFAULT_INSTANCE;
    public static final int DISPATCH_ID_FIELD_NUMBER = 9;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int METADATA_FIELD_NUMBER = 6;
    public static final int NAMESPACE_FIELD_NUMBER = 5;
    private static volatile InterfaceC12124U0 PARSER = null;
    public static final int PARTICIPANT_FIELD_NUMBER = 4;
    public static final int ROOM_FIELD_NUMBER = 3;
    public static final int STATE_FIELD_NUMBER = 8;
    public static final int TYPE_FIELD_NUMBER = 2;
    private int bitField0_;
    private LivekitModels$ParticipantInfo participant_;
    private LivekitModels$Room room_;
    private LivekitAgent$JobState state_;
    private int type_;
    private String id_ = "";
    private String dispatchId_ = "";
    private String namespace_ = "";
    private String metadata_ = "";
    private String agentName_ = "";

    static {
        LivekitAgent$Job livekitAgent$Job = new LivekitAgent$Job();
        DEFAULT_INSTANCE = livekitAgent$Job;
        AbstractC12133Z.registerDefaultInstance(LivekitAgent$Job.class, livekitAgent$Job);
    }

    private LivekitAgent$Job() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAgentName() {
        this.agentName_ = getDefaultInstance().getAgentName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDispatchId() {
        this.dispatchId_ = getDefaultInstance().getDispatchId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.id_ = getDefaultInstance().getId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMetadata() {
        this.metadata_ = getDefaultInstance().getMetadata();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNamespace() {
        this.namespace_ = getDefaultInstance().getNamespace();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearParticipant() {
        this.participant_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRoom() {
        this.room_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearState() {
        this.state_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = 0;
    }

    public static LivekitAgent$Job getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeParticipant(LivekitModels$ParticipantInfo livekitModels$ParticipantInfo) {
        livekitModels$ParticipantInfo.getClass();
        LivekitModels$ParticipantInfo livekitModels$ParticipantInfo2 = this.participant_;
        if (livekitModels$ParticipantInfo2 == null || livekitModels$ParticipantInfo2 == LivekitModels$ParticipantInfo.getDefaultInstance()) {
            this.participant_ = livekitModels$ParticipantInfo;
        } else {
            C14802o2 c14802o2NewBuilder = LivekitModels$ParticipantInfo.newBuilder(this.participant_);
            c14802o2NewBuilder.m13865f(livekitModels$ParticipantInfo);
            this.participant_ = (LivekitModels$ParticipantInfo) c14802o2NewBuilder.m13862c();
        }
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRoom(LivekitModels$Room livekitModels$Room) {
        livekitModels$Room.getClass();
        LivekitModels$Room livekitModels$Room2 = this.room_;
        if (livekitModels$Room2 == null || livekitModels$Room2 == LivekitModels$Room.getDefaultInstance()) {
            this.room_ = livekitModels$Room;
            return;
        }
        C14579F2 c14579f2NewBuilder = LivekitModels$Room.newBuilder(this.room_);
        c14579f2NewBuilder.m13865f(livekitModels$Room);
        this.room_ = (LivekitModels$Room) c14579f2NewBuilder.m13862c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeState(LivekitAgent$JobState livekitAgent$JobState) {
        livekitAgent$JobState.getClass();
        LivekitAgent$JobState livekitAgent$JobState2 = this.state_;
        if (livekitAgent$JobState2 == null || livekitAgent$JobState2 == LivekitAgent$JobState.getDefaultInstance()) {
            this.state_ = livekitAgent$JobState;
            return;
        }
        C14743g c14743gNewBuilder = LivekitAgent$JobState.newBuilder(this.state_);
        c14743gNewBuilder.m13865f(livekitAgent$JobState);
        this.state_ = (LivekitAgent$JobState) c14743gNewBuilder.m13862c();
    }

    public static C14722d newBuilder() {
        return (C14722d) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitAgent$Job parseDelimitedFrom(InputStream inputStream) {
        return (LivekitAgent$Job) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitAgent$Job parseFrom(ByteBuffer byteBuffer) {
        return (LivekitAgent$Job) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC12124U0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAgentName(String str) {
        str.getClass();
        this.agentName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAgentNameBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.agentName_ = abstractC12171m.m14012w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDispatchId(String str) {
        str.getClass();
        this.dispatchId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDispatchIdBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.dispatchId_ = abstractC12171m.m14012w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setId(String str) {
        str.getClass();
        this.id_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIdBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.id_ = abstractC12171m.m14012w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMetadata(String str) {
        str.getClass();
        this.metadata_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMetadataBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.metadata_ = abstractC12171m.m14012w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNamespace(String str) {
        str.getClass();
        this.namespace_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNamespaceBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.namespace_ = abstractC12171m.m14012w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParticipant(LivekitModels$ParticipantInfo livekitModels$ParticipantInfo) {
        livekitModels$ParticipantInfo.getClass();
        this.participant_ = livekitModels$ParticipantInfo;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRoom(LivekitModels$Room livekitModels$Room) {
        livekitModels$Room.getClass();
        this.room_ = livekitModels$Room;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setState(LivekitAgent$JobState livekitAgent$JobState) {
        livekitAgent$JobState.getClass();
        this.state_ = livekitAgent$JobState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(EnumC14764j enumC14764j) {
        this.type_ = enumC14764j.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeValue(int i10) {
        this.type_ = i10;
    }

    @Override // com.google.protobuf.AbstractC12133Z
    public final Object dynamicMethod(EnumC12131Y enumC12131Y, Object obj, Object obj2) {
        switch (enumC12131Y.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AbstractC12133Z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\t\u0004ဉ\u0000\u0005Ȉ\u0006Ȉ\u0007Ȉ\b\t\tȈ", new Object[]{"bitField0_", "id_", "type_", "room_", "participant_", "namespace_", "metadata_", "agentName_", "state_", "dispatchId_"});
            case 3:
                return new LivekitAgent$Job();
            case 4:
                return new C14722d(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC12124U0 c12123u = PARSER;
                if (c12123u == null) {
                    synchronized (LivekitAgent$Job.class) {
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

    public String getAgentName() {
        return this.agentName_;
    }

    public AbstractC12171m getAgentNameBytes() {
        return AbstractC12171m.m14011m(this.agentName_);
    }

    public String getDispatchId() {
        return this.dispatchId_;
    }

    public AbstractC12171m getDispatchIdBytes() {
        return AbstractC12171m.m14011m(this.dispatchId_);
    }

    public String getId() {
        return this.id_;
    }

    public AbstractC12171m getIdBytes() {
        return AbstractC12171m.m14011m(this.id_);
    }

    public String getMetadata() {
        return this.metadata_;
    }

    public AbstractC12171m getMetadataBytes() {
        return AbstractC12171m.m14011m(this.metadata_);
    }

    @Deprecated
    public String getNamespace() {
        return this.namespace_;
    }

    @Deprecated
    public AbstractC12171m getNamespaceBytes() {
        return AbstractC12171m.m14011m(this.namespace_);
    }

    public LivekitModels$ParticipantInfo getParticipant() {
        LivekitModels$ParticipantInfo livekitModels$ParticipantInfo = this.participant_;
        return livekitModels$ParticipantInfo == null ? LivekitModels$ParticipantInfo.getDefaultInstance() : livekitModels$ParticipantInfo;
    }

    public LivekitModels$Room getRoom() {
        LivekitModels$Room livekitModels$Room = this.room_;
        return livekitModels$Room == null ? LivekitModels$Room.getDefaultInstance() : livekitModels$Room;
    }

    public LivekitAgent$JobState getState() {
        LivekitAgent$JobState livekitAgent$JobState = this.state_;
        return livekitAgent$JobState == null ? LivekitAgent$JobState.getDefaultInstance() : livekitAgent$JobState;
    }

    public EnumC14764j getType() {
        EnumC14764j enumC14764jM16051a = EnumC14764j.m16051a(this.type_);
        return enumC14764jM16051a == null ? EnumC14764j.UNRECOGNIZED : enumC14764jM16051a;
    }

    public int getTypeValue() {
        return this.type_;
    }

    public boolean hasParticipant() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasRoom() {
        return this.room_ != null;
    }

    public boolean hasState() {
        return this.state_ != null;
    }

    public static C14722d newBuilder(LivekitAgent$Job livekitAgent$Job) {
        return (C14722d) DEFAULT_INSTANCE.createBuilder(livekitAgent$Job);
    }

    public static LivekitAgent$Job parseDelimitedFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitAgent$Job) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitAgent$Job parseFrom(ByteBuffer byteBuffer, C12087F c12087f) {
        return (LivekitAgent$Job) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer, c12087f);
    }

    public static LivekitAgent$Job parseFrom(AbstractC12171m abstractC12171m) {
        return (LivekitAgent$Job) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m);
    }

    public static LivekitAgent$Job parseFrom(AbstractC12171m abstractC12171m, C12087F c12087f) {
        return (LivekitAgent$Job) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m, c12087f);
    }

    public static LivekitAgent$Job parseFrom(byte[] bArr) {
        return (LivekitAgent$Job) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitAgent$Job parseFrom(byte[] bArr, C12087F c12087f) {
        return (LivekitAgent$Job) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr, c12087f);
    }

    public static LivekitAgent$Job parseFrom(InputStream inputStream) {
        return (LivekitAgent$Job) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitAgent$Job parseFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitAgent$Job) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitAgent$Job parseFrom(AbstractC12186r abstractC12186r) {
        return (LivekitAgent$Job) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r);
    }

    public static LivekitAgent$Job parseFrom(AbstractC12186r abstractC12186r, C12087F c12087f) {
        return (LivekitAgent$Job) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r, c12087f);
    }
}
