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
import p793ho.C14695Z;

/* JADX INFO: loaded from: classes2.dex */
public final class LivekitEgress$AliOSSUpload extends AbstractC12133Z implements InterfaceC12094H0 {
    public static final int ACCESS_KEY_FIELD_NUMBER = 1;
    public static final int BUCKET_FIELD_NUMBER = 5;
    private static final LivekitEgress$AliOSSUpload DEFAULT_INSTANCE;
    public static final int ENDPOINT_FIELD_NUMBER = 4;
    private static volatile InterfaceC12124U0 PARSER = null;
    public static final int REGION_FIELD_NUMBER = 3;
    public static final int SECRET_FIELD_NUMBER = 2;
    private String accessKey_ = "";
    private String secret_ = "";
    private String region_ = "";
    private String endpoint_ = "";
    private String bucket_ = "";

    static {
        LivekitEgress$AliOSSUpload livekitEgress$AliOSSUpload = new LivekitEgress$AliOSSUpload();
        DEFAULT_INSTANCE = livekitEgress$AliOSSUpload;
        AbstractC12133Z.registerDefaultInstance(LivekitEgress$AliOSSUpload.class, livekitEgress$AliOSSUpload);
    }

    private LivekitEgress$AliOSSUpload() {
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
    public void clearEndpoint() {
        this.endpoint_ = getDefaultInstance().getEndpoint();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRegion() {
        this.region_ = getDefaultInstance().getRegion();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSecret() {
        this.secret_ = getDefaultInstance().getSecret();
    }

    public static LivekitEgress$AliOSSUpload getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C14695Z newBuilder() {
        return (C14695Z) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitEgress$AliOSSUpload parseDelimitedFrom(InputStream inputStream) {
        return (LivekitEgress$AliOSSUpload) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitEgress$AliOSSUpload parseFrom(ByteBuffer byteBuffer) {
        return (LivekitEgress$AliOSSUpload) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
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

    @Override // com.google.protobuf.AbstractC12133Z
    public final Object dynamicMethod(EnumC12131Y enumC12131Y, Object obj, Object obj2) {
        switch (enumC12131Y.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AbstractC12133Z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ", new Object[]{"accessKey_", "secret_", "region_", "endpoint_", "bucket_"});
            case 3:
                return new LivekitEgress$AliOSSUpload();
            case 4:
                return new C14695Z(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC12124U0 c12123u = PARSER;
                if (c12123u == null) {
                    synchronized (LivekitEgress$AliOSSUpload.class) {
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

    public String getEndpoint() {
        return this.endpoint_;
    }

    public AbstractC12171m getEndpointBytes() {
        return AbstractC12171m.m14011m(this.endpoint_);
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

    public static C14695Z newBuilder(LivekitEgress$AliOSSUpload livekitEgress$AliOSSUpload) {
        return (C14695Z) DEFAULT_INSTANCE.createBuilder(livekitEgress$AliOSSUpload);
    }

    public static LivekitEgress$AliOSSUpload parseDelimitedFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitEgress$AliOSSUpload) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitEgress$AliOSSUpload parseFrom(ByteBuffer byteBuffer, C12087F c12087f) {
        return (LivekitEgress$AliOSSUpload) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer, c12087f);
    }

    public static LivekitEgress$AliOSSUpload parseFrom(AbstractC12171m abstractC12171m) {
        return (LivekitEgress$AliOSSUpload) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m);
    }

    public static LivekitEgress$AliOSSUpload parseFrom(AbstractC12171m abstractC12171m, C12087F c12087f) {
        return (LivekitEgress$AliOSSUpload) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m, c12087f);
    }

    public static LivekitEgress$AliOSSUpload parseFrom(byte[] bArr) {
        return (LivekitEgress$AliOSSUpload) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitEgress$AliOSSUpload parseFrom(byte[] bArr, C12087F c12087f) {
        return (LivekitEgress$AliOSSUpload) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr, c12087f);
    }

    public static LivekitEgress$AliOSSUpload parseFrom(InputStream inputStream) {
        return (LivekitEgress$AliOSSUpload) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitEgress$AliOSSUpload parseFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitEgress$AliOSSUpload) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitEgress$AliOSSUpload parseFrom(AbstractC12186r abstractC12186r) {
        return (LivekitEgress$AliOSSUpload) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r);
    }

    public static LivekitEgress$AliOSSUpload parseFrom(AbstractC12186r abstractC12186r, C12087F c12087f) {
        return (LivekitEgress$AliOSSUpload) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r, c12087f);
    }
}
