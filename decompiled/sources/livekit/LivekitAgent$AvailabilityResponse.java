package livekit;

import cn.UfGr.EhBykzn;
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
import p793ho.AbstractC14715c;
import p793ho.C14708b;
import p817j$.util.DesugarCollections;

/* JADX INFO: loaded from: classes2.dex */
public final class LivekitAgent$AvailabilityResponse extends AbstractC12133Z implements InterfaceC12094H0 {
    public static final int AVAILABLE_FIELD_NUMBER = 2;
    private static final LivekitAgent$AvailabilityResponse DEFAULT_INSTANCE;
    public static final int JOB_ID_FIELD_NUMBER = 1;
    private static volatile InterfaceC12124U0 PARSER = null;
    public static final int PARTICIPANT_ATTRIBUTES_FIELD_NUMBER = 7;
    public static final int PARTICIPANT_IDENTITY_FIELD_NUMBER = 5;
    public static final int PARTICIPANT_METADATA_FIELD_NUMBER = 6;
    public static final int PARTICIPANT_NAME_FIELD_NUMBER = 4;
    public static final int SUPPORTS_RESUME_FIELD_NUMBER = 3;
    private boolean available_;
    private boolean supportsResume_;
    private C12076B0 participantAttributes_ = C12076B0.f36868Z;
    private String jobId_ = "";
    private String participantName_ = "";
    private String participantIdentity_ = "";
    private String participantMetadata_ = "";

    static {
        LivekitAgent$AvailabilityResponse livekitAgent$AvailabilityResponse = new LivekitAgent$AvailabilityResponse();
        DEFAULT_INSTANCE = livekitAgent$AvailabilityResponse;
        AbstractC12133Z.registerDefaultInstance(LivekitAgent$AvailabilityResponse.class, livekitAgent$AvailabilityResponse);
    }

    private LivekitAgent$AvailabilityResponse() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAvailable() {
        this.available_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearJobId() {
        this.jobId_ = getDefaultInstance().getJobId();
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
    public void clearSupportsResume() {
        this.supportsResume_ = false;
    }

    public static LivekitAgent$AvailabilityResponse getDefaultInstance() {
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

    public static C14708b newBuilder() {
        return (C14708b) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitAgent$AvailabilityResponse parseDelimitedFrom(InputStream inputStream) {
        return (LivekitAgent$AvailabilityResponse) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitAgent$AvailabilityResponse parseFrom(ByteBuffer byteBuffer) {
        return (LivekitAgent$AvailabilityResponse) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC12124U0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAvailable(boolean z6) {
        this.available_ = z6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJobId(String str) {
        str.getClass();
        this.jobId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJobIdBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.jobId_ = abstractC12171m.m14012w();
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
    public void setSupportsResume(boolean z6) {
        this.supportsResume_ = z6;
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
                return AbstractC12133Z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0001\u0000\u0000\u0001Ȉ\u0002\u0007\u0003\u0007\u0004Ȉ\u0005Ȉ\u0006Ȉ\u00072", new Object[]{"jobId_", "available_", "supportsResume_", "participantName_", "participantIdentity_", "participantMetadata_", EhBykzn.hgwojRsWVzmgo, AbstractC14715c.f46043a});
            case 3:
                return new LivekitAgent$AvailabilityResponse();
            case 4:
                return new C14708b(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC12124U0 c12123u = PARSER;
                if (c12123u == null) {
                    synchronized (LivekitAgent$AvailabilityResponse.class) {
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

    public boolean getAvailable() {
        return this.available_;
    }

    public String getJobId() {
        return this.jobId_;
    }

    public AbstractC12171m getJobIdBytes() {
        return AbstractC12171m.m14011m(this.jobId_);
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

    public boolean getSupportsResume() {
        return this.supportsResume_;
    }

    public static C14708b newBuilder(LivekitAgent$AvailabilityResponse livekitAgent$AvailabilityResponse) {
        return (C14708b) DEFAULT_INSTANCE.createBuilder(livekitAgent$AvailabilityResponse);
    }

    public static LivekitAgent$AvailabilityResponse parseDelimitedFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitAgent$AvailabilityResponse) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitAgent$AvailabilityResponse parseFrom(ByteBuffer byteBuffer, C12087F c12087f) {
        return (LivekitAgent$AvailabilityResponse) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer, c12087f);
    }

    public static LivekitAgent$AvailabilityResponse parseFrom(AbstractC12171m abstractC12171m) {
        return (LivekitAgent$AvailabilityResponse) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m);
    }

    public static LivekitAgent$AvailabilityResponse parseFrom(AbstractC12171m abstractC12171m, C12087F c12087f) {
        return (LivekitAgent$AvailabilityResponse) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m, c12087f);
    }

    public static LivekitAgent$AvailabilityResponse parseFrom(byte[] bArr) {
        return (LivekitAgent$AvailabilityResponse) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitAgent$AvailabilityResponse parseFrom(byte[] bArr, C12087F c12087f) {
        return (LivekitAgent$AvailabilityResponse) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr, c12087f);
    }

    public static LivekitAgent$AvailabilityResponse parseFrom(InputStream inputStream) {
        return (LivekitAgent$AvailabilityResponse) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitAgent$AvailabilityResponse parseFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitAgent$AvailabilityResponse) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitAgent$AvailabilityResponse parseFrom(AbstractC12186r abstractC12186r) {
        return (LivekitAgent$AvailabilityResponse) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r);
    }

    public static LivekitAgent$AvailabilityResponse parseFrom(AbstractC12186r abstractC12186r, C12087F c12087f) {
        return (LivekitAgent$AvailabilityResponse) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r, c12087f);
    }
}
