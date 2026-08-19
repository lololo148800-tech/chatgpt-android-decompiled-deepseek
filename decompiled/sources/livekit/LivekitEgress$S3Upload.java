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
import p793ho.AbstractC14607K0;
import p793ho.C14577F0;
import p793ho.C14601J0;
import p817j$.util.DesugarCollections;

/* JADX INFO: loaded from: classes2.dex */
public final class LivekitEgress$S3Upload extends AbstractC12133Z implements InterfaceC12094H0 {
    public static final int ACCESS_KEY_FIELD_NUMBER = 1;
    public static final int BUCKET_FIELD_NUMBER = 5;
    public static final int CONTENT_DISPOSITION_FIELD_NUMBER = 9;
    private static final LivekitEgress$S3Upload DEFAULT_INSTANCE;
    public static final int ENDPOINT_FIELD_NUMBER = 4;
    public static final int FORCE_PATH_STYLE_FIELD_NUMBER = 6;
    public static final int METADATA_FIELD_NUMBER = 7;
    private static volatile InterfaceC12124U0 PARSER = null;
    public static final int PROXY_FIELD_NUMBER = 10;
    public static final int REGION_FIELD_NUMBER = 3;
    public static final int SECRET_FIELD_NUMBER = 2;
    public static final int SESSION_TOKEN_FIELD_NUMBER = 11;
    public static final int TAGGING_FIELD_NUMBER = 8;
    private boolean forcePathStyle_;
    private LivekitEgress$ProxyConfig proxy_;
    private C12076B0 metadata_ = C12076B0.f36868Z;
    private String accessKey_ = "";
    private String secret_ = "";
    private String sessionToken_ = "";
    private String region_ = "";
    private String endpoint_ = "";
    private String bucket_ = "";
    private String tagging_ = "";
    private String contentDisposition_ = "";

    static {
        LivekitEgress$S3Upload livekitEgress$S3Upload = new LivekitEgress$S3Upload();
        DEFAULT_INSTANCE = livekitEgress$S3Upload;
        AbstractC12133Z.registerDefaultInstance(LivekitEgress$S3Upload.class, livekitEgress$S3Upload);
    }

    private LivekitEgress$S3Upload() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAccessKey() {
        this.accessKey_ = getDefaultInstance().getAccessKey();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBucket() {
        this.bucket_ = getDefaultInstance().getBucket();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearContentDisposition() {
        this.contentDisposition_ = getDefaultInstance().getContentDisposition();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEndpoint() {
        this.endpoint_ = getDefaultInstance().getEndpoint();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearForcePathStyle() {
        this.forcePathStyle_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProxy() {
        this.proxy_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRegion() {
        this.region_ = getDefaultInstance().getRegion();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSecret() {
        this.secret_ = getDefaultInstance().getSecret();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSessionToken() {
        this.sessionToken_ = getDefaultInstance().getSessionToken();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTagging() {
        this.tagging_ = getDefaultInstance().getTagging();
    }

    public static LivekitEgress$S3Upload getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, String> getMutableMetadataMap() {
        return internalGetMutableMetadata();
    }

    private C12076B0 internalGetMetadata() {
        return this.metadata_;
    }

    private C12076B0 internalGetMutableMetadata() {
        C12076B0 c12076b0 = this.metadata_;
        if (!c12076b0.f36869Y) {
            this.metadata_ = c12076b0.m13719c();
        }
        return this.metadata_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeProxy(LivekitEgress$ProxyConfig livekitEgress$ProxyConfig) {
        livekitEgress$ProxyConfig.getClass();
        LivekitEgress$ProxyConfig livekitEgress$ProxyConfig2 = this.proxy_;
        if (livekitEgress$ProxyConfig2 == null || livekitEgress$ProxyConfig2 == LivekitEgress$ProxyConfig.getDefaultInstance()) {
            this.proxy_ = livekitEgress$ProxyConfig;
            return;
        }
        C14577F0 c14577f0NewBuilder = LivekitEgress$ProxyConfig.newBuilder(this.proxy_);
        c14577f0NewBuilder.m13865f(livekitEgress$ProxyConfig);
        this.proxy_ = (LivekitEgress$ProxyConfig) c14577f0NewBuilder.m13862c();
    }

    public static C14601J0 newBuilder() {
        return (C14601J0) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitEgress$S3Upload parseDelimitedFrom(InputStream inputStream) {
        return (LivekitEgress$S3Upload) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitEgress$S3Upload parseFrom(ByteBuffer byteBuffer) {
        return (LivekitEgress$S3Upload) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC12124U0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAccessKey(String str) {
        str.getClass();
        this.accessKey_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAccessKeyBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.accessKey_ = abstractC12171m.m14012w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBucket(String str) {
        str.getClass();
        this.bucket_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBucketBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.bucket_ = abstractC12171m.m14012w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setContentDisposition(String str) {
        str.getClass();
        this.contentDisposition_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setContentDispositionBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.contentDisposition_ = abstractC12171m.m14012w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEndpoint(String str) {
        str.getClass();
        this.endpoint_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEndpointBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.endpoint_ = abstractC12171m.m14012w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setForcePathStyle(boolean z6) {
        this.forcePathStyle_ = z6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProxy(LivekitEgress$ProxyConfig livekitEgress$ProxyConfig) {
        livekitEgress$ProxyConfig.getClass();
        this.proxy_ = livekitEgress$ProxyConfig;
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
    public void setSecret(String str) {
        str.getClass();
        this.secret_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSecretBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.secret_ = abstractC12171m.m14012w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSessionToken(String str) {
        str.getClass();
        this.sessionToken_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSessionTokenBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.sessionToken_ = abstractC12171m.m14012w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTagging(String str) {
        str.getClass();
        this.tagging_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTaggingBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.tagging_ = abstractC12171m.m14012w();
    }

    public boolean containsMetadata(String str) {
        str.getClass();
        return internalGetMetadata().containsKey(str);
    }

    @Override // com.google.protobuf.AbstractC12133Z
    public final Object dynamicMethod(EnumC12131Y enumC12131Y, Object obj, Object obj2) {
        switch (enumC12131Y.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AbstractC12133Z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000b\u0000\u0000\u0001\u000b\u000b\u0001\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006\u0007\u00072\bȈ\tȈ\n\t\u000bȈ", new Object[]{"accessKey_", "secret_", "region_", "endpoint_", "bucket_", "forcePathStyle_", "metadata_", AbstractC14607K0.f45904a, "tagging_", "contentDisposition_", "proxy_", "sessionToken_"});
            case 3:
                return new LivekitEgress$S3Upload();
            case 4:
                return new C14601J0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC12124U0 c12123u = PARSER;
                if (c12123u == null) {
                    synchronized (LivekitEgress$S3Upload.class) {
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

    public String getAccessKey() {
        return this.accessKey_;
    }

    public AbstractC12171m getAccessKeyBytes() {
        return AbstractC12171m.m14011m(this.accessKey_);
    }

    public String getBucket() {
        return this.bucket_;
    }

    public AbstractC12171m getBucketBytes() {
        return AbstractC12171m.m14011m(this.bucket_);
    }

    public String getContentDisposition() {
        return this.contentDisposition_;
    }

    public AbstractC12171m getContentDispositionBytes() {
        return AbstractC12171m.m14011m(this.contentDisposition_);
    }

    public String getEndpoint() {
        return this.endpoint_;
    }

    public AbstractC12171m getEndpointBytes() {
        return AbstractC12171m.m14011m(this.endpoint_);
    }

    public boolean getForcePathStyle() {
        return this.forcePathStyle_;
    }

    @Deprecated
    public Map<String, String> getMetadata() {
        return getMetadataMap();
    }

    public int getMetadataCount() {
        return internalGetMetadata().size();
    }

    public Map<String, String> getMetadataMap() {
        return DesugarCollections.unmodifiableMap(internalGetMetadata());
    }

    public String getMetadataOrDefault(String str, String str2) {
        str.getClass();
        C12076B0 c12076b0InternalGetMetadata = internalGetMetadata();
        return c12076b0InternalGetMetadata.containsKey(str) ? (String) c12076b0InternalGetMetadata.get(str) : str2;
    }

    public String getMetadataOrThrow(String str) {
        str.getClass();
        C12076B0 c12076b0InternalGetMetadata = internalGetMetadata();
        if (c12076b0InternalGetMetadata.containsKey(str)) {
            return (String) c12076b0InternalGetMetadata.get(str);
        }
        throw new IllegalArgumentException();
    }

    public LivekitEgress$ProxyConfig getProxy() {
        LivekitEgress$ProxyConfig livekitEgress$ProxyConfig = this.proxy_;
        return livekitEgress$ProxyConfig == null ? LivekitEgress$ProxyConfig.getDefaultInstance() : livekitEgress$ProxyConfig;
    }

    public String getRegion() {
        return this.region_;
    }

    public AbstractC12171m getRegionBytes() {
        return AbstractC12171m.m14011m(this.region_);
    }

    public String getSecret() {
        return this.secret_;
    }

    public AbstractC12171m getSecretBytes() {
        return AbstractC12171m.m14011m(this.secret_);
    }

    public String getSessionToken() {
        return this.sessionToken_;
    }

    public AbstractC12171m getSessionTokenBytes() {
        return AbstractC12171m.m14011m(this.sessionToken_);
    }

    public String getTagging() {
        return this.tagging_;
    }

    public AbstractC12171m getTaggingBytes() {
        return AbstractC12171m.m14011m(this.tagging_);
    }

    public boolean hasProxy() {
        return this.proxy_ != null;
    }

    public static C14601J0 newBuilder(LivekitEgress$S3Upload livekitEgress$S3Upload) {
        return (C14601J0) DEFAULT_INSTANCE.createBuilder(livekitEgress$S3Upload);
    }

    public static LivekitEgress$S3Upload parseDelimitedFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitEgress$S3Upload) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitEgress$S3Upload parseFrom(ByteBuffer byteBuffer, C12087F c12087f) {
        return (LivekitEgress$S3Upload) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer, c12087f);
    }

    public static LivekitEgress$S3Upload parseFrom(AbstractC12171m abstractC12171m) {
        return (LivekitEgress$S3Upload) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m);
    }

    public static LivekitEgress$S3Upload parseFrom(AbstractC12171m abstractC12171m, C12087F c12087f) {
        return (LivekitEgress$S3Upload) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m, c12087f);
    }

    public static LivekitEgress$S3Upload parseFrom(byte[] bArr) {
        return (LivekitEgress$S3Upload) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitEgress$S3Upload parseFrom(byte[] bArr, C12087F c12087f) {
        return (LivekitEgress$S3Upload) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr, c12087f);
    }

    public static LivekitEgress$S3Upload parseFrom(InputStream inputStream) {
        return (LivekitEgress$S3Upload) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitEgress$S3Upload parseFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitEgress$S3Upload) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitEgress$S3Upload parseFrom(AbstractC12186r abstractC12186r) {
        return (LivekitEgress$S3Upload) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r);
    }

    public static LivekitEgress$S3Upload parseFrom(AbstractC12186r abstractC12186r, C12087F c12087f) {
        return (LivekitEgress$S3Upload) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r, c12087f);
    }
}
