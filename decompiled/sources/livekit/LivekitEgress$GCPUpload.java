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
import p793ho.C14577F0;
import p793ho.C14842u0;

/* JADX INFO: loaded from: classes2.dex */
public final class LivekitEgress$GCPUpload extends AbstractC12133Z implements InterfaceC12094H0 {
    public static final int BUCKET_FIELD_NUMBER = 2;
    public static final int CREDENTIALS_FIELD_NUMBER = 1;
    private static final LivekitEgress$GCPUpload DEFAULT_INSTANCE;
    private static volatile InterfaceC12124U0 PARSER = null;
    public static final int PROXY_FIELD_NUMBER = 3;
    private LivekitEgress$ProxyConfig proxy_;
    private String credentials_ = "";
    private String bucket_ = "";

    static {
        LivekitEgress$GCPUpload livekitEgress$GCPUpload = new LivekitEgress$GCPUpload();
        DEFAULT_INSTANCE = livekitEgress$GCPUpload;
        AbstractC12133Z.registerDefaultInstance(LivekitEgress$GCPUpload.class, livekitEgress$GCPUpload);
    }

    private LivekitEgress$GCPUpload() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBucket() {
        this.bucket_ = getDefaultInstance().getBucket();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCredentials() {
        this.credentials_ = getDefaultInstance().getCredentials();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProxy() {
        this.proxy_ = null;
    }

    public static LivekitEgress$GCPUpload getDefaultInstance() {
        return DEFAULT_INSTANCE;
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

    public static C14842u0 newBuilder() {
        return (C14842u0) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitEgress$GCPUpload parseDelimitedFrom(InputStream inputStream) {
        return (LivekitEgress$GCPUpload) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitEgress$GCPUpload parseFrom(ByteBuffer byteBuffer) {
        return (LivekitEgress$GCPUpload) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC12124U0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
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
    public void setCredentials(String str) {
        str.getClass();
        this.credentials_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCredentialsBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.credentials_ = abstractC12171m.m14012w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProxy(LivekitEgress$ProxyConfig livekitEgress$ProxyConfig) {
        livekitEgress$ProxyConfig.getClass();
        this.proxy_ = livekitEgress$ProxyConfig;
    }

    @Override // com.google.protobuf.AbstractC12133Z
    public final Object dynamicMethod(EnumC12131Y enumC12131Y, Object obj, Object obj2) {
        switch (enumC12131Y.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AbstractC12133Z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\t", new Object[]{"credentials_", "bucket_", "proxy_"});
            case 3:
                return new LivekitEgress$GCPUpload();
            case 4:
                return new C14842u0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC12124U0 c12123u = PARSER;
                if (c12123u == null) {
                    synchronized (LivekitEgress$GCPUpload.class) {
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

    public String getBucket() {
        return this.bucket_;
    }

    public AbstractC12171m getBucketBytes() {
        return AbstractC12171m.m14011m(this.bucket_);
    }

    public String getCredentials() {
        return this.credentials_;
    }

    public AbstractC12171m getCredentialsBytes() {
        return AbstractC12171m.m14011m(this.credentials_);
    }

    public LivekitEgress$ProxyConfig getProxy() {
        LivekitEgress$ProxyConfig livekitEgress$ProxyConfig = this.proxy_;
        return livekitEgress$ProxyConfig == null ? LivekitEgress$ProxyConfig.getDefaultInstance() : livekitEgress$ProxyConfig;
    }

    public boolean hasProxy() {
        return this.proxy_ != null;
    }

    public static C14842u0 newBuilder(LivekitEgress$GCPUpload livekitEgress$GCPUpload) {
        return (C14842u0) DEFAULT_INSTANCE.createBuilder(livekitEgress$GCPUpload);
    }

    public static LivekitEgress$GCPUpload parseDelimitedFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitEgress$GCPUpload) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitEgress$GCPUpload parseFrom(ByteBuffer byteBuffer, C12087F c12087f) {
        return (LivekitEgress$GCPUpload) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer, c12087f);
    }

    public static LivekitEgress$GCPUpload parseFrom(AbstractC12171m abstractC12171m) {
        return (LivekitEgress$GCPUpload) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m);
    }

    public static LivekitEgress$GCPUpload parseFrom(AbstractC12171m abstractC12171m, C12087F c12087f) {
        return (LivekitEgress$GCPUpload) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m, c12087f);
    }

    public static LivekitEgress$GCPUpload parseFrom(byte[] bArr) {
        return (LivekitEgress$GCPUpload) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitEgress$GCPUpload parseFrom(byte[] bArr, C12087F c12087f) {
        return (LivekitEgress$GCPUpload) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr, c12087f);
    }

    public static LivekitEgress$GCPUpload parseFrom(InputStream inputStream) {
        return (LivekitEgress$GCPUpload) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitEgress$GCPUpload parseFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitEgress$GCPUpload) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitEgress$GCPUpload parseFrom(AbstractC12186r abstractC12186r) {
        return (LivekitEgress$GCPUpload) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r);
    }

    public static LivekitEgress$GCPUpload parseFrom(AbstractC12186r abstractC12186r, C12087F c12087f) {
        return (LivekitEgress$GCPUpload) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r, c12087f);
    }
}
