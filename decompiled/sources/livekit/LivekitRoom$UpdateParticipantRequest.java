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
import p793ho.AbstractC14880z3;
import p793ho.C14545A3;
import p793ho.C14830s2;
import p817j$.util.DesugarCollections;

/* JADX INFO: loaded from: classes2.dex */
public final class LivekitRoom$UpdateParticipantRequest extends AbstractC12133Z implements InterfaceC12094H0 {
    public static final int ATTRIBUTES_FIELD_NUMBER = 6;
    private static final LivekitRoom$UpdateParticipantRequest DEFAULT_INSTANCE;
    public static final int IDENTITY_FIELD_NUMBER = 2;
    public static final int METADATA_FIELD_NUMBER = 3;
    public static final int NAME_FIELD_NUMBER = 5;
    private static volatile InterfaceC12124U0 PARSER = null;
    public static final int PERMISSION_FIELD_NUMBER = 4;
    public static final int ROOM_FIELD_NUMBER = 1;
    private LivekitModels$ParticipantPermission permission_;
    private C12076B0 attributes_ = C12076B0.f36868Z;
    private String room_ = "";
    private String identity_ = "";
    private String metadata_ = "";
    private String name_ = "";

    static {
        LivekitRoom$UpdateParticipantRequest livekitRoom$UpdateParticipantRequest = new LivekitRoom$UpdateParticipantRequest();
        DEFAULT_INSTANCE = livekitRoom$UpdateParticipantRequest;
        AbstractC12133Z.registerDefaultInstance(LivekitRoom$UpdateParticipantRequest.class, livekitRoom$UpdateParticipantRequest);
    }

    private LivekitRoom$UpdateParticipantRequest() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIdentity() {
        this.identity_ = getDefaultInstance().getIdentity();
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
    public void clearRoom() {
        this.room_ = getDefaultInstance().getRoom();
    }

    public static LivekitRoom$UpdateParticipantRequest getDefaultInstance() {
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

    public static C14545A3 newBuilder() {
        return (C14545A3) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitRoom$UpdateParticipantRequest parseDelimitedFrom(InputStream inputStream) {
        return (LivekitRoom$UpdateParticipantRequest) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitRoom$UpdateParticipantRequest parseFrom(ByteBuffer byteBuffer) {
        return (LivekitRoom$UpdateParticipantRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC12124U0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
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
    public void setRoom(String str) {
        str.getClass();
        this.room_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRoomBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.room_ = abstractC12171m.m14012w();
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
                return AbstractC12133Z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0001\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\t\u0005Ȉ\u00062", new Object[]{"room_", "identity_", "metadata_", "permission_", "name_", "attributes_", AbstractC14880z3.f46356a});
            case 3:
                return new LivekitRoom$UpdateParticipantRequest();
            case 4:
                return new C14545A3(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC12124U0 c12123u = PARSER;
                if (c12123u == null) {
                    synchronized (LivekitRoom$UpdateParticipantRequest.class) {
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

    public String getIdentity() {
        return this.identity_;
    }

    public AbstractC12171m getIdentityBytes() {
        return AbstractC12171m.m14011m(this.identity_);
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

    public String getRoom() {
        return this.room_;
    }

    public AbstractC12171m getRoomBytes() {
        return AbstractC12171m.m14011m(this.room_);
    }

    public boolean hasPermission() {
        return this.permission_ != null;
    }

    public static C14545A3 newBuilder(LivekitRoom$UpdateParticipantRequest livekitRoom$UpdateParticipantRequest) {
        return (C14545A3) DEFAULT_INSTANCE.createBuilder(livekitRoom$UpdateParticipantRequest);
    }

    public static LivekitRoom$UpdateParticipantRequest parseDelimitedFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitRoom$UpdateParticipantRequest) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitRoom$UpdateParticipantRequest parseFrom(ByteBuffer byteBuffer, C12087F c12087f) {
        return (LivekitRoom$UpdateParticipantRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer, c12087f);
    }

    public static LivekitRoom$UpdateParticipantRequest parseFrom(AbstractC12171m abstractC12171m) {
        return (LivekitRoom$UpdateParticipantRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m);
    }

    public static LivekitRoom$UpdateParticipantRequest parseFrom(AbstractC12171m abstractC12171m, C12087F c12087f) {
        return (LivekitRoom$UpdateParticipantRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m, c12087f);
    }

    public static LivekitRoom$UpdateParticipantRequest parseFrom(byte[] bArr) {
        return (LivekitRoom$UpdateParticipantRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitRoom$UpdateParticipantRequest parseFrom(byte[] bArr, C12087F c12087f) {
        return (LivekitRoom$UpdateParticipantRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr, c12087f);
    }

    public static LivekitRoom$UpdateParticipantRequest parseFrom(InputStream inputStream) {
        return (LivekitRoom$UpdateParticipantRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitRoom$UpdateParticipantRequest parseFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitRoom$UpdateParticipantRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitRoom$UpdateParticipantRequest parseFrom(AbstractC12186r abstractC12186r) {
        return (LivekitRoom$UpdateParticipantRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r);
    }

    public static LivekitRoom$UpdateParticipantRequest parseFrom(AbstractC12186r abstractC12186r, C12087F c12087f) {
        return (LivekitRoom$UpdateParticipantRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r, c12087f);
    }
}
