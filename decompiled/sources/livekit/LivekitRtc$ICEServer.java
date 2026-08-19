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
import p793ho.C14616L3;
import p793ho.InterfaceC14622M3;

/* JADX INFO: loaded from: classes2.dex */
public final class LivekitRtc$ICEServer extends AbstractC12133Z implements InterfaceC14622M3 {
    public static final int CREDENTIAL_FIELD_NUMBER = 3;
    private static final LivekitRtc$ICEServer DEFAULT_INSTANCE;
    private static volatile InterfaceC12124U0 PARSER = null;
    public static final int URLS_FIELD_NUMBER = 1;
    public static final int USERNAME_FIELD_NUMBER = 2;
    private InterfaceC12172m0 urls_ = AbstractC12133Z.emptyProtobufList();
    private String username_ = "";
    private String credential_ = "";

    static {
        LivekitRtc$ICEServer livekitRtc$ICEServer = new LivekitRtc$ICEServer();
        DEFAULT_INSTANCE = livekitRtc$ICEServer;
        AbstractC12133Z.registerDefaultInstance(LivekitRtc$ICEServer.class, livekitRtc$ICEServer);
    }

    private LivekitRtc$ICEServer() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllUrls(Iterable<String> iterable) {
        ensureUrlsIsMutable();
        AbstractC12138b.addAll((Iterable) iterable, (List) this.urls_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addUrls(String str) {
        str.getClass();
        ensureUrlsIsMutable();
        this.urls_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addUrlsBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        ensureUrlsIsMutable();
        this.urls_.add(abstractC12171m.m14012w());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCredential() {
        this.credential_ = getDefaultInstance().getCredential();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUrls() {
        this.urls_ = AbstractC12133Z.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUsername() {
        this.username_ = getDefaultInstance().getUsername();
    }

    private void ensureUrlsIsMutable() {
        InterfaceC12172m0 interfaceC12172m0 = this.urls_;
        if (((AbstractC12141c) interfaceC12172m0).f37021Y) {
            return;
        }
        this.urls_ = AbstractC12133Z.mutableCopy(interfaceC12172m0);
    }

    public static LivekitRtc$ICEServer getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C14616L3 newBuilder() {
        return (C14616L3) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitRtc$ICEServer parseDelimitedFrom(InputStream inputStream) {
        return (LivekitRtc$ICEServer) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitRtc$ICEServer parseFrom(ByteBuffer byteBuffer) {
        return (LivekitRtc$ICEServer) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC12124U0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCredential(String str) {
        str.getClass();
        this.credential_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCredentialBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.credential_ = abstractC12171m.m14012w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUrls(int i10, String str) {
        str.getClass();
        ensureUrlsIsMutable();
        this.urls_.set(i10, str);
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
                return AbstractC12133Z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ț\u0002Ȉ\u0003Ȉ", new Object[]{"urls_", "username_", "credential_"});
            case 3:
                return new LivekitRtc$ICEServer();
            case 4:
                return new C14616L3(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC12124U0 c12123u = PARSER;
                if (c12123u == null) {
                    synchronized (LivekitRtc$ICEServer.class) {
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

    public String getCredential() {
        return this.credential_;
    }

    public AbstractC12171m getCredentialBytes() {
        return AbstractC12171m.m14011m(this.credential_);
    }

    public String getUrls(int i10) {
        return (String) this.urls_.get(i10);
    }

    public AbstractC12171m getUrlsBytes(int i10) {
        return AbstractC12171m.m14011m((String) this.urls_.get(i10));
    }

    public int getUrlsCount() {
        return this.urls_.size();
    }

    public List<String> getUrlsList() {
        return this.urls_;
    }

    public String getUsername() {
        return this.username_;
    }

    public AbstractC12171m getUsernameBytes() {
        return AbstractC12171m.m14011m(this.username_);
    }

    public static C14616L3 newBuilder(LivekitRtc$ICEServer livekitRtc$ICEServer) {
        return (C14616L3) DEFAULT_INSTANCE.createBuilder(livekitRtc$ICEServer);
    }

    public static LivekitRtc$ICEServer parseDelimitedFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitRtc$ICEServer) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitRtc$ICEServer parseFrom(ByteBuffer byteBuffer, C12087F c12087f) {
        return (LivekitRtc$ICEServer) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer, c12087f);
    }

    public static LivekitRtc$ICEServer parseFrom(AbstractC12171m abstractC12171m) {
        return (LivekitRtc$ICEServer) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m);
    }

    public static LivekitRtc$ICEServer parseFrom(AbstractC12171m abstractC12171m, C12087F c12087f) {
        return (LivekitRtc$ICEServer) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m, c12087f);
    }

    public static LivekitRtc$ICEServer parseFrom(byte[] bArr) {
        return (LivekitRtc$ICEServer) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitRtc$ICEServer parseFrom(byte[] bArr, C12087F c12087f) {
        return (LivekitRtc$ICEServer) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr, c12087f);
    }

    public static LivekitRtc$ICEServer parseFrom(InputStream inputStream) {
        return (LivekitRtc$ICEServer) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitRtc$ICEServer parseFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitRtc$ICEServer) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitRtc$ICEServer parseFrom(AbstractC12186r abstractC12186r) {
        return (LivekitRtc$ICEServer) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r);
    }

    public static LivekitRtc$ICEServer parseFrom(AbstractC12186r abstractC12186r, C12087F c12087f) {
        return (LivekitRtc$ICEServer) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r, c12087f);
    }
}
