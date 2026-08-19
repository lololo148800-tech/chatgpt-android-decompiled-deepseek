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
import p793ho.AbstractC14599I4;
import p793ho.C14605J4;
import p817j$.util.DesugarCollections;

/* JADX INFO: loaded from: classes2.dex */
public final class LivekitRtc$UpdateParticipantMetadata extends AbstractC12133Z implements InterfaceC12094H0 {
    public static final int ATTRIBUTES_FIELD_NUMBER = 3;
    private static final LivekitRtc$UpdateParticipantMetadata DEFAULT_INSTANCE;
    public static final int METADATA_FIELD_NUMBER = 1;
    public static final int NAME_FIELD_NUMBER = 2;
    private static volatile InterfaceC12124U0 PARSER = null;
    public static final int REQUEST_ID_FIELD_NUMBER = 4;
    private C12076B0 attributes_ = C12076B0.f36868Z;
    private String metadata_ = "";
    private String name_ = "";
    private int requestId_;

    static {
        LivekitRtc$UpdateParticipantMetadata livekitRtc$UpdateParticipantMetadata = new LivekitRtc$UpdateParticipantMetadata();
        DEFAULT_INSTANCE = livekitRtc$UpdateParticipantMetadata;
        AbstractC12133Z.registerDefaultInstance(LivekitRtc$UpdateParticipantMetadata.class, livekitRtc$UpdateParticipantMetadata);
    }

    private LivekitRtc$UpdateParticipantMetadata() {
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
    public void clearRequestId() {
        this.requestId_ = 0;
    }

    public static LivekitRtc$UpdateParticipantMetadata getDefaultInstance() {
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

    public static C14605J4 newBuilder() {
        return (C14605J4) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitRtc$UpdateParticipantMetadata parseDelimitedFrom(InputStream inputStream) {
        return (LivekitRtc$UpdateParticipantMetadata) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitRtc$UpdateParticipantMetadata parseFrom(ByteBuffer byteBuffer) {
        return (LivekitRtc$UpdateParticipantMetadata) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC12124U0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
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
    public void setRequestId(int i10) {
        this.requestId_ = i10;
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
                return AbstractC12133Z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0001Ȉ\u0002Ȉ\u00032\u0004\u000b", new Object[]{"metadata_", "name_", "attributes_", AbstractC14599I4.f45863a, "requestId_"});
            case 3:
                return new LivekitRtc$UpdateParticipantMetadata();
            case 4:
                return new C14605J4(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC12124U0 c12123u = PARSER;
                if (c12123u == null) {
                    synchronized (LivekitRtc$UpdateParticipantMetadata.class) {
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

    public int getRequestId() {
        return this.requestId_;
    }

    public static C14605J4 newBuilder(LivekitRtc$UpdateParticipantMetadata livekitRtc$UpdateParticipantMetadata) {
        return (C14605J4) DEFAULT_INSTANCE.createBuilder(livekitRtc$UpdateParticipantMetadata);
    }

    public static LivekitRtc$UpdateParticipantMetadata parseDelimitedFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitRtc$UpdateParticipantMetadata) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitRtc$UpdateParticipantMetadata parseFrom(ByteBuffer byteBuffer, C12087F c12087f) {
        return (LivekitRtc$UpdateParticipantMetadata) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer, c12087f);
    }

    public static LivekitRtc$UpdateParticipantMetadata parseFrom(AbstractC12171m abstractC12171m) {
        return (LivekitRtc$UpdateParticipantMetadata) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m);
    }

    public static LivekitRtc$UpdateParticipantMetadata parseFrom(AbstractC12171m abstractC12171m, C12087F c12087f) {
        return (LivekitRtc$UpdateParticipantMetadata) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m, c12087f);
    }

    public static LivekitRtc$UpdateParticipantMetadata parseFrom(byte[] bArr) {
        return (LivekitRtc$UpdateParticipantMetadata) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitRtc$UpdateParticipantMetadata parseFrom(byte[] bArr, C12087F c12087f) {
        return (LivekitRtc$UpdateParticipantMetadata) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr, c12087f);
    }

    public static LivekitRtc$UpdateParticipantMetadata parseFrom(InputStream inputStream) {
        return (LivekitRtc$UpdateParticipantMetadata) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitRtc$UpdateParticipantMetadata parseFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitRtc$UpdateParticipantMetadata) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitRtc$UpdateParticipantMetadata parseFrom(AbstractC12186r abstractC12186r) {
        return (LivekitRtc$UpdateParticipantMetadata) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r);
    }

    public static LivekitRtc$UpdateParticipantMetadata parseFrom(AbstractC12186r abstractC12186r, C12087F c12087f) {
        return (LivekitRtc$UpdateParticipantMetadata) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r, c12087f);
    }
}
