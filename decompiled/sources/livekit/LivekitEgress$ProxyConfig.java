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

/* JADX INFO: loaded from: classes2.dex */
public final class LivekitEgress$ProxyConfig extends AbstractC12133Z implements InterfaceC12094H0 {
    private static final LivekitEgress$ProxyConfig DEFAULT_INSTANCE;
    private static volatile InterfaceC12124U0 PARSER = null;
    public static final int PASSWORD_FIELD_NUMBER = 3;
    public static final int URL_FIELD_NUMBER = 1;
    public static final int USERNAME_FIELD_NUMBER = 2;
    private String url_ = "";
    private String username_ = "";
    private String password_ = "";

    static {
        LivekitEgress$ProxyConfig livekitEgress$ProxyConfig = new LivekitEgress$ProxyConfig();
        DEFAULT_INSTANCE = livekitEgress$ProxyConfig;
        AbstractC12133Z.registerDefaultInstance(LivekitEgress$ProxyConfig.class, livekitEgress$ProxyConfig);
    }

    private LivekitEgress$ProxyConfig() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPassword() {
        this.password_ = getDefaultInstance().getPassword();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUrl() {
        this.url_ = getDefaultInstance().getUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUsername() {
        this.username_ = getDefaultInstance().getUsername();
    }

    public static LivekitEgress$ProxyConfig getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C14577F0 newBuilder() {
        return (C14577F0) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitEgress$ProxyConfig parseDelimitedFrom(InputStream inputStream) {
        return (LivekitEgress$ProxyConfig) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitEgress$ProxyConfig parseFrom(ByteBuffer byteBuffer) {
        return (LivekitEgress$ProxyConfig) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC12124U0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPassword(String str) {
        str.getClass();
        this.password_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPasswordBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.password_ = abstractC12171m.m14012w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUrl(String str) {
        str.getClass();
        this.url_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUrlBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.url_ = abstractC12171m.m14012w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUsername(String str) {
        str.getClass();
        this.username_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUsernameBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.username_ = abstractC12171m.m14012w();
    }

    @Override // com.google.protobuf.AbstractC12133Z
    public final Object dynamicMethod(EnumC12131Y enumC12131Y, Object obj, Object obj2) {
        switch (enumC12131Y.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AbstractC12133Z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ", new Object[]{"url_", "username_", "password_"});
            case 3:
                return new LivekitEgress$ProxyConfig();
            case 4:
                return new C14577F0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC12124U0 c12123u = PARSER;
                if (c12123u == null) {
                    synchronized (LivekitEgress$ProxyConfig.class) {
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

    public String getPassword() {
        return this.password_;
    }

    public AbstractC12171m getPasswordBytes() {
        return AbstractC12171m.m14011m(this.password_);
    }

    public String getUrl() {
        return this.url_;
    }

    public AbstractC12171m getUrlBytes() {
        return AbstractC12171m.m14011m(this.url_);
    }

    public String getUsername() {
        return this.username_;
    }

    public AbstractC12171m getUsernameBytes() {
        return AbstractC12171m.m14011m(this.username_);
    }

    public static C14577F0 newBuilder(LivekitEgress$ProxyConfig livekitEgress$ProxyConfig) {
        return (C14577F0) DEFAULT_INSTANCE.createBuilder(livekitEgress$ProxyConfig);
    }

    public static LivekitEgress$ProxyConfig parseDelimitedFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitEgress$ProxyConfig) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitEgress$ProxyConfig parseFrom(ByteBuffer byteBuffer, C12087F c12087f) {
        return (LivekitEgress$ProxyConfig) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer, c12087f);
    }

    public static LivekitEgress$ProxyConfig parseFrom(AbstractC12171m abstractC12171m) {
        return (LivekitEgress$ProxyConfig) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m);
    }

    public static LivekitEgress$ProxyConfig parseFrom(AbstractC12171m abstractC12171m, C12087F c12087f) {
        return (LivekitEgress$ProxyConfig) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m, c12087f);
    }

    public static LivekitEgress$ProxyConfig parseFrom(byte[] bArr) {
        return (LivekitEgress$ProxyConfig) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitEgress$ProxyConfig parseFrom(byte[] bArr, C12087F c12087f) {
        return (LivekitEgress$ProxyConfig) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr, c12087f);
    }

    public static LivekitEgress$ProxyConfig parseFrom(InputStream inputStream) {
        return (LivekitEgress$ProxyConfig) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitEgress$ProxyConfig parseFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitEgress$ProxyConfig) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitEgress$ProxyConfig parseFrom(AbstractC12186r abstractC12186r) {
        return (LivekitEgress$ProxyConfig) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r);
    }

    public static LivekitEgress$ProxyConfig parseFrom(AbstractC12186r abstractC12186r, C12087F c12087f) {
        return (LivekitEgress$ProxyConfig) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r, c12087f);
    }
}
