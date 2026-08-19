package livekit;

import com.google.protobuf.AbstractC12133Z;
import com.google.protobuf.AbstractC12138b;
import com.google.protobuf.AbstractC12141c;
import com.google.protobuf.AbstractC12171m;
import com.google.protobuf.AbstractC12186r;
import com.google.protobuf.C12087F;
import com.google.protobuf.C12123U;
import com.google.protobuf.EnumC12131Y;
import com.google.protobuf.InterfaceC12124U0;
import com.google.protobuf.InterfaceC12172m0;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import p793ho.C14579F2;
import p793ho.C14668U2;
import p793ho.InterfaceC14585G2;
import p793ho.InterfaceC14725d2;
import sj.hJY.CsqksqyPE;

/* JADX INFO: loaded from: classes2.dex */
public final class LivekitModels$Room extends AbstractC12133Z implements InterfaceC14585G2 {
    public static final int ACTIVE_RECORDING_FIELD_NUMBER = 10;
    public static final int CREATION_TIME_FIELD_NUMBER = 5;
    private static final LivekitModels$Room DEFAULT_INSTANCE;
    public static final int DEPARTURE_TIMEOUT_FIELD_NUMBER = 14;
    public static final int EMPTY_TIMEOUT_FIELD_NUMBER = 3;
    public static final int ENABLED_CODECS_FIELD_NUMBER = 7;
    public static final int MAX_PARTICIPANTS_FIELD_NUMBER = 4;
    public static final int METADATA_FIELD_NUMBER = 8;
    public static final int NAME_FIELD_NUMBER = 2;
    public static final int NUM_PARTICIPANTS_FIELD_NUMBER = 9;
    public static final int NUM_PUBLISHERS_FIELD_NUMBER = 11;
    private static volatile InterfaceC12124U0 PARSER = null;
    public static final int SID_FIELD_NUMBER = 1;
    public static final int TURN_PASSWORD_FIELD_NUMBER = 6;
    public static final int VERSION_FIELD_NUMBER = 13;
    private boolean activeRecording_;
    private long creationTime_;
    private int departureTimeout_;
    private int emptyTimeout_;
    private int maxParticipants_;
    private int numParticipants_;
    private int numPublishers_;
    private LivekitModels$TimedVersion version_;
    private String sid_ = "";
    private String name_ = "";
    private String turnPassword_ = "";
    private InterfaceC12172m0 enabledCodecs_ = AbstractC12133Z.emptyProtobufList();
    private String metadata_ = "";

    static {
        LivekitModels$Room livekitModels$Room = new LivekitModels$Room();
        DEFAULT_INSTANCE = livekitModels$Room;
        AbstractC12133Z.registerDefaultInstance(LivekitModels$Room.class, livekitModels$Room);
    }

    private LivekitModels$Room() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllEnabledCodecs(Iterable<? extends LivekitModels$Codec> iterable) {
        ensureEnabledCodecsIsMutable();
        AbstractC12138b.addAll((Iterable) iterable, (List) this.enabledCodecs_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addEnabledCodecs(LivekitModels$Codec livekitModels$Codec) {
        livekitModels$Codec.getClass();
        ensureEnabledCodecsIsMutable();
        this.enabledCodecs_.add(livekitModels$Codec);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearActiveRecording() {
        this.activeRecording_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCreationTime() {
        this.creationTime_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDepartureTimeout() {
        this.departureTimeout_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEmptyTimeout() {
        this.emptyTimeout_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEnabledCodecs() {
        this.enabledCodecs_ = AbstractC12133Z.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMaxParticipants() {
        this.maxParticipants_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMetadata() {
        this.metadata_ = getDefaultInstance().getMetadata();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNumParticipants() {
        this.numParticipants_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNumPublishers() {
        this.numPublishers_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSid() {
        this.sid_ = getDefaultInstance().getSid();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTurnPassword() {
        this.turnPassword_ = getDefaultInstance().getTurnPassword();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVersion() {
        this.version_ = null;
    }

    private void ensureEnabledCodecsIsMutable() {
        InterfaceC12172m0 interfaceC12172m0 = this.enabledCodecs_;
        if (((AbstractC12141c) interfaceC12172m0).f37021Y) {
            return;
        }
        this.enabledCodecs_ = AbstractC12133Z.mutableCopy(interfaceC12172m0);
    }

    public static LivekitModels$Room getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeVersion(LivekitModels$TimedVersion livekitModels$TimedVersion) {
        livekitModels$TimedVersion.getClass();
        LivekitModels$TimedVersion livekitModels$TimedVersion2 = this.version_;
        if (livekitModels$TimedVersion2 == null || livekitModels$TimedVersion2 == LivekitModels$TimedVersion.getDefaultInstance()) {
            this.version_ = livekitModels$TimedVersion;
            return;
        }
        C14668U2 c14668u2NewBuilder = LivekitModels$TimedVersion.newBuilder(this.version_);
        c14668u2NewBuilder.m13865f(livekitModels$TimedVersion);
        this.version_ = (LivekitModels$TimedVersion) c14668u2NewBuilder.m13862c();
    }

    public static C14579F2 newBuilder() {
        return (C14579F2) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitModels$Room parseDelimitedFrom(InputStream inputStream) {
        return (LivekitModels$Room) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitModels$Room parseFrom(ByteBuffer byteBuffer) {
        return (LivekitModels$Room) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC12124U0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeEnabledCodecs(int i10) {
        ensureEnabledCodecsIsMutable();
        this.enabledCodecs_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActiveRecording(boolean z6) {
        this.activeRecording_ = z6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCreationTime(long j10) {
        this.creationTime_ = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDepartureTimeout(int i10) {
        this.departureTimeout_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEmptyTimeout(int i10) {
        this.emptyTimeout_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEnabledCodecs(int i10, LivekitModels$Codec livekitModels$Codec) {
        livekitModels$Codec.getClass();
        ensureEnabledCodecsIsMutable();
        this.enabledCodecs_.set(i10, livekitModels$Codec);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMaxParticipants(int i10) {
        this.maxParticipants_ = i10;
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
    public void setNumParticipants(int i10) {
        this.numParticipants_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNumPublishers(int i10) {
        this.numPublishers_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSid(String str) {
        str.getClass();
        this.sid_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSidBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.sid_ = abstractC12171m.m14012w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTurnPassword(String str) {
        str.getClass();
        this.turnPassword_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTurnPasswordBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.turnPassword_ = abstractC12171m.m14012w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVersion(LivekitModels$TimedVersion livekitModels$TimedVersion) {
        livekitModels$TimedVersion.getClass();
        this.version_ = livekitModels$TimedVersion;
    }

    @Override // com.google.protobuf.AbstractC12133Z
    public final Object dynamicMethod(EnumC12131Y enumC12131Y, Object obj, Object obj2) {
        switch (enumC12131Y.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AbstractC12133Z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\r\u0000\u0000\u0001\u000e\r\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003\u000b\u0004\u000b\u0005\u0002\u0006Ȉ\u0007\u001b\bȈ\t\u000b\n\u0007\u000b\u000b\r\t\u000e\u000b", new Object[]{"sid_", "name_", CsqksqyPE.EimAdPpinhdk, "maxParticipants_", "creationTime_", "turnPassword_", "enabledCodecs_", LivekitModels$Codec.class, "metadata_", "numParticipants_", "activeRecording_", "numPublishers_", "version_", "departureTimeout_"});
            case 3:
                return new LivekitModels$Room();
            case 4:
                return new C14579F2(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC12124U0 c12123u = PARSER;
                if (c12123u == null) {
                    synchronized (LivekitModels$Room.class) {
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

    public boolean getActiveRecording() {
        return this.activeRecording_;
    }

    public long getCreationTime() {
        return this.creationTime_;
    }

    public int getDepartureTimeout() {
        return this.departureTimeout_;
    }

    public int getEmptyTimeout() {
        return this.emptyTimeout_;
    }

    public LivekitModels$Codec getEnabledCodecs(int i10) {
        return (LivekitModels$Codec) this.enabledCodecs_.get(i10);
    }

    public int getEnabledCodecsCount() {
        return this.enabledCodecs_.size();
    }

    public List<LivekitModels$Codec> getEnabledCodecsList() {
        return this.enabledCodecs_;
    }

    public InterfaceC14725d2 getEnabledCodecsOrBuilder(int i10) {
        return (InterfaceC14725d2) this.enabledCodecs_.get(i10);
    }

    public List<? extends InterfaceC14725d2> getEnabledCodecsOrBuilderList() {
        return this.enabledCodecs_;
    }

    public int getMaxParticipants() {
        return this.maxParticipants_;
    }

    public String getMetadata() {
        return this.metadata_;
    }

    public AbstractC12171m getMetadataBytes() {
        return AbstractC12171m.m14011m(this.metadata_);
    }

    public String getName() {
        return this.name_;
    }

    public AbstractC12171m getNameBytes() {
        return AbstractC12171m.m14011m(this.name_);
    }

    public int getNumParticipants() {
        return this.numParticipants_;
    }

    public int getNumPublishers() {
        return this.numPublishers_;
    }

    public String getSid() {
        return this.sid_;
    }

    public AbstractC12171m getSidBytes() {
        return AbstractC12171m.m14011m(this.sid_);
    }

    public String getTurnPassword() {
        return this.turnPassword_;
    }

    public AbstractC12171m getTurnPasswordBytes() {
        return AbstractC12171m.m14011m(this.turnPassword_);
    }

    public LivekitModels$TimedVersion getVersion() {
        LivekitModels$TimedVersion livekitModels$TimedVersion = this.version_;
        return livekitModels$TimedVersion == null ? LivekitModels$TimedVersion.getDefaultInstance() : livekitModels$TimedVersion;
    }

    public boolean hasVersion() {
        return this.version_ != null;
    }

    public static C14579F2 newBuilder(LivekitModels$Room livekitModels$Room) {
        return (C14579F2) DEFAULT_INSTANCE.createBuilder(livekitModels$Room);
    }

    public static LivekitModels$Room parseDelimitedFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitModels$Room) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitModels$Room parseFrom(ByteBuffer byteBuffer, C12087F c12087f) {
        return (LivekitModels$Room) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer, c12087f);
    }

    public static LivekitModels$Room parseFrom(AbstractC12171m abstractC12171m) {
        return (LivekitModels$Room) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addEnabledCodecs(int i10, LivekitModels$Codec livekitModels$Codec) {
        livekitModels$Codec.getClass();
        ensureEnabledCodecsIsMutable();
        this.enabledCodecs_.add(i10, livekitModels$Codec);
    }

    public static LivekitModels$Room parseFrom(AbstractC12171m abstractC12171m, C12087F c12087f) {
        return (LivekitModels$Room) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m, c12087f);
    }

    public static LivekitModels$Room parseFrom(byte[] bArr) {
        return (LivekitModels$Room) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitModels$Room parseFrom(byte[] bArr, C12087F c12087f) {
        return (LivekitModels$Room) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr, c12087f);
    }

    public static LivekitModels$Room parseFrom(InputStream inputStream) {
        return (LivekitModels$Room) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitModels$Room parseFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitModels$Room) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitModels$Room parseFrom(AbstractC12186r abstractC12186r) {
        return (LivekitModels$Room) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r);
    }

    public static LivekitModels$Room parseFrom(AbstractC12186r abstractC12186r, C12087F c12087f) {
        return (LivekitModels$Room) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r, c12087f);
    }
}
