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
import p793ho.C14780l1;

/* JADX INFO: loaded from: classes2.dex */
public final class LivekitIngress$DeleteIngressRequest extends AbstractC12133Z implements InterfaceC12094H0 {
    private static final LivekitIngress$DeleteIngressRequest DEFAULT_INSTANCE;
    public static final int INGRESS_ID_FIELD_NUMBER = 1;
    private static volatile InterfaceC12124U0 PARSER;
    private String ingressId_ = "";

    static {
        LivekitIngress$DeleteIngressRequest livekitIngress$DeleteIngressRequest = new LivekitIngress$DeleteIngressRequest();
        DEFAULT_INSTANCE = livekitIngress$DeleteIngressRequest;
        AbstractC12133Z.registerDefaultInstance(LivekitIngress$DeleteIngressRequest.class, livekitIngress$DeleteIngressRequest);
    }

    private LivekitIngress$DeleteIngressRequest() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIngressId() {
        this.ingressId_ = getDefaultInstance().getIngressId();
    }

    public static LivekitIngress$DeleteIngressRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C14780l1 newBuilder() {
        return (C14780l1) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitIngress$DeleteIngressRequest parseDelimitedFrom(InputStream inputStream) {
        return (LivekitIngress$DeleteIngressRequest) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitIngress$DeleteIngressRequest parseFrom(ByteBuffer byteBuffer) {
        return (LivekitIngress$DeleteIngressRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC12124U0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIngressId(String str) {
        str.getClass();
        this.ingressId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIngressIdBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.ingressId_ = abstractC12171m.m14012w();
    }

    @Override // com.google.protobuf.AbstractC12133Z
    public final Object dynamicMethod(EnumC12131Y enumC12131Y, Object obj, Object obj2) {
        switch (enumC12131Y.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AbstractC12133Z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"ingressId_"});
            case 3:
                return new LivekitIngress$DeleteIngressRequest();
            case 4:
                return new C14780l1(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC12124U0 c12123u = PARSER;
                if (c12123u == null) {
                    synchronized (LivekitIngress$DeleteIngressRequest.class) {
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

    public String getIngressId() {
        return this.ingressId_;
    }

    public AbstractC12171m getIngressIdBytes() {
        return AbstractC12171m.m14011m(this.ingressId_);
    }

    public static C14780l1 newBuilder(LivekitIngress$DeleteIngressRequest livekitIngress$DeleteIngressRequest) {
        return (C14780l1) DEFAULT_INSTANCE.createBuilder(livekitIngress$DeleteIngressRequest);
    }

    public static LivekitIngress$DeleteIngressRequest parseDelimitedFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitIngress$DeleteIngressRequest) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitIngress$DeleteIngressRequest parseFrom(ByteBuffer byteBuffer, C12087F c12087f) {
        return (LivekitIngress$DeleteIngressRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer, c12087f);
    }

    public static LivekitIngress$DeleteIngressRequest parseFrom(AbstractC12171m abstractC12171m) {
        return (LivekitIngress$DeleteIngressRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m);
    }

    public static LivekitIngress$DeleteIngressRequest parseFrom(AbstractC12171m abstractC12171m, C12087F c12087f) {
        return (LivekitIngress$DeleteIngressRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m, c12087f);
    }

    public static LivekitIngress$DeleteIngressRequest parseFrom(byte[] bArr) {
        return (LivekitIngress$DeleteIngressRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitIngress$DeleteIngressRequest parseFrom(byte[] bArr, C12087F c12087f) {
        return (LivekitIngress$DeleteIngressRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr, c12087f);
    }

    public static LivekitIngress$DeleteIngressRequest parseFrom(InputStream inputStream) {
        return (LivekitIngress$DeleteIngressRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitIngress$DeleteIngressRequest parseFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitIngress$DeleteIngressRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitIngress$DeleteIngressRequest parseFrom(AbstractC12186r abstractC12186r) {
        return (LivekitIngress$DeleteIngressRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r);
    }

    public static LivekitIngress$DeleteIngressRequest parseFrom(AbstractC12186r abstractC12186r, C12087F c12087f) {
        return (LivekitIngress$DeleteIngressRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r, c12087f);
    }
}
