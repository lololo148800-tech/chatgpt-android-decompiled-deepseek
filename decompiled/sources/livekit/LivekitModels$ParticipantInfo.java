package livekit;

import com.google.protobuf.AbstractC12133Z;
import com.google.protobuf.AbstractC12138b;
import com.google.protobuf.AbstractC12141c;
import com.google.protobuf.AbstractC12171m;
import com.google.protobuf.AbstractC12186r;
import com.google.protobuf.C12076B0;
import com.google.protobuf.C12087F;
import com.google.protobuf.C12123U;
import com.google.protobuf.EnumC12131Y;
import com.google.protobuf.InterfaceC12124U0;
import com.google.protobuf.InterfaceC12172m0;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;
import p793ho.AbstractC14795n2;
import p793ho.C14802o2;
import p793ho.C14830s2;
import p793ho.EnumC14767j2;
import p793ho.EnumC14809p2;
import p793ho.EnumC14816q2;
import p793ho.InterfaceC14680W2;
import p793ho.InterfaceC14823r2;
import p817j$.util.DesugarCollections;

/* JADX INFO: loaded from: classes2.dex */
public final class LivekitModels$ParticipantInfo extends AbstractC12133Z implements InterfaceC14823r2 {
    public static final int ATTRIBUTES_FIELD_NUMBER = 15;
    private static final LivekitModels$ParticipantInfo DEFAULT_INSTANCE;
    public static final int DISCONNECT_REASON_FIELD_NUMBER = 16;
    public static final int IDENTITY_FIELD_NUMBER = 2;
    public static final int IS_PUBLISHER_FIELD_NUMBER = 13;
    public static final int JOINED_AT_FIELD_NUMBER = 6;
    public static final int KIND_FIELD_NUMBER = 14;
    public static final int METADATA_FIELD_NUMBER = 5;
    public static final int NAME_FIELD_NUMBER = 9;
    private static volatile InterfaceC12124U0 PARSER = null;
    public static final int PERMISSION_FIELD_NUMBER = 11;
    public static final int REGION_FIELD_NUMBER = 12;
    public static final int SID_FIELD_NUMBER = 1;
    public static final int STATE_FIELD_NUMBER = 3;
    public static final int TRACKS_FIELD_NUMBER = 4;
    public static final int VERSION_FIELD_NUMBER = 10;
    private int disconnectReason_;
    private boolean isPublisher_;
    private long joinedAt_;
    private int kind_;
    private LivekitModels$ParticipantPermission permission_;
    private int state_;
    private int version_;
    private C12076B0 attributes_ = C12076B0.f36868Z;
    private String sid_ = "";
    private String identity_ = "";
    private InterfaceC12172m0 tracks_ = AbstractC12133Z.emptyProtobufList();
    private String metadata_ = "";
    private String name_ = "";
    private String region_ = "";

    static {
        LivekitModels$ParticipantInfo livekitModels$ParticipantInfo = new LivekitModels$ParticipantInfo();
        DEFAULT_INSTANCE = livekitModels$ParticipantInfo;
        AbstractC12133Z.registerDefaultInstance(LivekitModels$ParticipantInfo.class, livekitModels$ParticipantInfo);
    }

    private LivekitModels$ParticipantInfo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllTracks(Iterable<? extends LivekitModels$TrackInfo> iterable) {
        ensureTracksIsMutable();
        AbstractC12138b.addAll((Iterable) iterable, (List) this.tracks_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addTracks(LivekitModels$TrackInfo livekitModels$TrackInfo) {
        livekitModels$TrackInfo.getClass();
        ensureTracksIsMutable();
        this.tracks_.add(livekitModels$TrackInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDisconnectReason() {
        this.disconnectReason_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIdentity() {
        this.identity_ = getDefaultInstance().getIdentity();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsPublisher() {
        this.isPublisher_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearJoinedAt() {
        this.joinedAt_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearKind() {
        this.kind_ = 0;
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
    public void clearPermission() {
        this.permission_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRegion() {
        this.region_ = getDefaultInstance().getRegion();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSid() {
        this.sid_ = getDefaultInstance().getSid();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearState() {
        this.state_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTracks() {
        this.tracks_ = AbstractC12133Z.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVersion() {
        this.version_ = 0;
    }

    private void ensureTracksIsMutable() {
        InterfaceC12172m0 interfaceC12172m0 = this.tracks_;
        if (((AbstractC12141c) interfaceC12172m0).f37021Y) {
            return;
        }
        this.tracks_ = AbstractC12133Z.mutableCopy(interfaceC12172m0);
    }

    public static LivekitModels$ParticipantInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, String> getMutableAttributesMap() {
        return internalGetMutableAttributes();
    }

    private C12076B0 internalGetAttributes() {
        return this.attributes_;
    }

    private C12076B0 internalGetMutableAttributes() {
        C12076B0 c12076b0 = this.attributes_;
        if (!c12076b0.f36869Y) {
            this.attributes_ = c12076b0.m13719c();
        }
        return this.attributes_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePermission(LivekitModels$ParticipantPermission livekitModels$ParticipantPermission) {
        livekitModels$ParticipantPermission.getClass();
        LivekitModels$ParticipantPermission livekitModels$ParticipantPermission2 = this.permission_;
        if (livekitModels$ParticipantPermission2 == null || livekitModels$ParticipantPermission2 == LivekitModels$ParticipantPermission.getDefaultInstance()) {
            this.permission_ = livekitModels$ParticipantPermission;
            return;
        }
        C14830s2 c14830s2NewBuilder = LivekitModels$ParticipantPermission.newBuilder(this.permission_);
        c14830s2NewBuilder.m13865f(livekitModels$ParticipantPermission);
        this.permission_ = (LivekitModels$ParticipantPermission) c14830s2NewBuilder.m13862c();
    }

    public static C14802o2 newBuilder() {
        return (C14802o2) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitModels$ParticipantInfo parseDelimitedFrom(InputStream inputStream) {
        return (LivekitModels$ParticipantInfo) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitModels$ParticipantInfo parseFrom(ByteBuffer byteBuffer) {
        return (LivekitModels$ParticipantInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC12124U0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeTracks(int i10) {
        ensureTracksIsMutable();
        this.tracks_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisconnectReason(EnumC14767j2 enumC14767j2) {
        this.disconnectReason_ = enumC14767j2.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisconnectReasonValue(int i10) {
        this.disconnectReason_ = i10;
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
    public void setIsPublisher(boolean z6) {
        this.isPublisher_ = z6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJoinedAt(long j10) {
        this.joinedAt_ = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKind(EnumC14809p2 enumC14809p2) {
        this.kind_ = enumC14809p2.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKindValue(int i10) {
        this.kind_ = i10;
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
    public void setPermission(LivekitModels$ParticipantPermission livekitModels$ParticipantPermission) {
        livekitModels$ParticipantPermission.getClass();
        this.permission_ = livekitModels$ParticipantPermission;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRegion(String str) {
        str.getClass();
        this.region_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRegionBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.region_ = abstractC12171m.m14012w();
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
    public void setState(EnumC14816q2 enumC14816q2) {
        this.state_ = enumC14816q2.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStateValue(int i10) {
        this.state_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTracks(int i10, LivekitModels$TrackInfo livekitModels$TrackInfo) {
        livekitModels$TrackInfo.getClass();
        ensureTracksIsMutable();
        this.tracks_.set(i10, livekitModels$TrackInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVersion(int i10) {
        this.version_ = i10;
    }

    public boolean containsAttributes(String str) {
        str.getClass();
        return internalGetAttributes().containsKey(str);
    }

    @Override // com.google.protobuf.AbstractC12133Z
    public final Object dynamicMethod(EnumC12131Y enumC12131Y, Object obj, Object obj2) {
        switch (enumC12131Y.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AbstractC12133Z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000e\u0000\u0000\u0001\u0010\u000e\u0001\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003\f\u0004\u001b\u0005Ȉ\u0006\u0002\tȈ\n\u000b\u000b\t\fȈ\r\u0007\u000e\f\u000f2\u0010\f", new Object[]{"sid_", "identity_", "state_", "tracks_", LivekitModels$TrackInfo.class, "metadata_", "joinedAt_", "name_", "version_", "permission_", "region_", "isPublisher_", "kind_", "attributes_", AbstractC14795n2.f46251a, "disconnectReason_"});
            case 3:
                return new LivekitModels$ParticipantInfo();
            case 4:
                return new C14802o2(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC12124U0 c12123u = PARSER;
                if (c12123u == null) {
                    synchronized (LivekitModels$ParticipantInfo.class) {
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
    public Map<String, String> getAttributes() {
        return getAttributesMap();
    }

    public int getAttributesCount() {
        return internalGetAttributes().size();
    }

    public Map<String, String> getAttributesMap() {
        return DesugarCollections.unmodifiableMap(internalGetAttributes());
    }

    public String getAttributesOrDefault(String str, String str2) {
        str.getClass();
        C12076B0 c12076b0InternalGetAttributes = internalGetAttributes();
        return c12076b0InternalGetAttributes.containsKey(str) ? (String) c12076b0InternalGetAttributes.get(str) : str2;
    }

    public String getAttributesOrThrow(String str) {
        str.getClass();
        C12076B0 c12076b0InternalGetAttributes = internalGetAttributes();
        if (c12076b0InternalGetAttributes.containsKey(str)) {
            return (String) c12076b0InternalGetAttributes.get(str);
        }
        throw new IllegalArgumentException();
    }

    public EnumC14767j2 getDisconnectReason() {
        EnumC14767j2 enumC14767j2M16052a = EnumC14767j2.m16052a(this.disconnectReason_);
        return enumC14767j2M16052a == null ? EnumC14767j2.UNRECOGNIZED : enumC14767j2M16052a;
    }

    public int getDisconnectReasonValue() {
        return this.disconnectReason_;
    }

    public String getIdentity() {
        return this.identity_;
    }

    public AbstractC12171m getIdentityBytes() {
        return AbstractC12171m.m14011m(this.identity_);
    }

    public boolean getIsPublisher() {
        return this.isPublisher_;
    }

    public long getJoinedAt() {
        return this.joinedAt_;
    }

    public EnumC14809p2 getKind() {
        EnumC14809p2 enumC14809p2;
        int i10 = this.kind_;
        if (i10 == 0) {
            enumC14809p2 = EnumC14809p2.STANDARD;
        } else if (i10 == 1) {
            enumC14809p2 = EnumC14809p2.INGRESS;
        } else if (i10 == 2) {
            enumC14809p2 = EnumC14809p2.EGRESS;
        } else if (i10 != 3) {
            enumC14809p2 = i10 != 4 ? null : EnumC14809p2.AGENT;
        } else {
            enumC14809p2 = EnumC14809p2.SIP;
        }
        return enumC14809p2 == null ? EnumC14809p2.UNRECOGNIZED : enumC14809p2;
    }

    public int getKindValue() {
        return this.kind_;
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

    public LivekitModels$ParticipantPermission getPermission() {
        LivekitModels$ParticipantPermission livekitModels$ParticipantPermission = this.permission_;
        return livekitModels$ParticipantPermission == null ? LivekitModels$ParticipantPermission.getDefaultInstance() : livekitModels$ParticipantPermission;
    }

    public String getRegion() {
        return this.region_;
    }

    public AbstractC12171m getRegionBytes() {
        return AbstractC12171m.m14011m(this.region_);
    }

    public String getSid() {
        return this.sid_;
    }

    public AbstractC12171m getSidBytes() {
        return AbstractC12171m.m14011m(this.sid_);
    }

    public EnumC14816q2 getState() {
        EnumC14816q2 enumC14816q2M16054a = EnumC14816q2.m16054a(this.state_);
        return enumC14816q2M16054a == null ? EnumC14816q2.UNRECOGNIZED : enumC14816q2M16054a;
    }

    public int getStateValue() {
        return this.state_;
    }

    public LivekitModels$TrackInfo getTracks(int i10) {
        return (LivekitModels$TrackInfo) this.tracks_.get(i10);
    }

    public int getTracksCount() {
        return this.tracks_.size();
    }

    public List<LivekitModels$TrackInfo> getTracksList() {
        return this.tracks_;
    }

    public InterfaceC14680W2 getTracksOrBuilder(int i10) {
        return (InterfaceC14680W2) this.tracks_.get(i10);
    }

    public List<? extends InterfaceC14680W2> getTracksOrBuilderList() {
        return this.tracks_;
    }

    public int getVersion() {
        return this.version_;
    }

    public boolean hasPermission() {
        return this.permission_ != null;
    }

    public static C14802o2 newBuilder(LivekitModels$ParticipantInfo livekitModels$ParticipantInfo) {
        return (C14802o2) DEFAULT_INSTANCE.createBuilder(livekitModels$ParticipantInfo);
    }

    public static LivekitModels$ParticipantInfo parseDelimitedFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitModels$ParticipantInfo) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitModels$ParticipantInfo parseFrom(ByteBuffer byteBuffer, C12087F c12087f) {
        return (LivekitModels$ParticipantInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer, c12087f);
    }

    public static LivekitModels$ParticipantInfo parseFrom(AbstractC12171m abstractC12171m) {
        return (LivekitModels$ParticipantInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addTracks(int i10, LivekitModels$TrackInfo livekitModels$TrackInfo) {
        livekitModels$TrackInfo.getClass();
        ensureTracksIsMutable();
        this.tracks_.add(i10, livekitModels$TrackInfo);
    }

    public static LivekitModels$ParticipantInfo parseFrom(AbstractC12171m abstractC12171m, C12087F c12087f) {
        return (LivekitModels$ParticipantInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m, c12087f);
    }

    public static LivekitModels$ParticipantInfo parseFrom(byte[] bArr) {
        return (LivekitModels$ParticipantInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitModels$ParticipantInfo parseFrom(byte[] bArr, C12087F c12087f) {
        return (LivekitModels$ParticipantInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr, c12087f);
    }

    public static LivekitModels$ParticipantInfo parseFrom(InputStream inputStream) {
        return (LivekitModels$ParticipantInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitModels$ParticipantInfo parseFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitModels$ParticipantInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitModels$ParticipantInfo parseFrom(AbstractC12186r abstractC12186r) {
        return (LivekitModels$ParticipantInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r);
    }

    public static LivekitModels$ParticipantInfo parseFrom(AbstractC12186r abstractC12186r, C12087F c12087f) {
        return (LivekitModels$ParticipantInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r, c12087f);
    }
}
