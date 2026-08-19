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
import p793ho.C14591H2;

/* JADX INFO: loaded from: classes2.dex */
public final class LivekitModels$RpcAck extends AbstractC12133Z implements InterfaceC12094H0 {
    private static final LivekitModels$RpcAck DEFAULT_INSTANCE;
    private static volatile InterfaceC12124U0 PARSER = null;
    public static final int REQUEST_ID_FIELD_NUMBER = 1;
    private String requestId_ = "";

    static {
        LivekitModels$RpcAck livekitModels$RpcAck = new LivekitModels$RpcAck();
        DEFAULT_INSTANCE = livekitModels$RpcAck;
        AbstractC12133Z.registerDefaultInstance(LivekitModels$RpcAck.class, livekitModels$RpcAck);
    }

    private LivekitModels$RpcAck() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRequestId() {
        this.requestId_ = getDefaultInstance().getRequestId();
    }

    public static LivekitModels$RpcAck getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C14591H2 newBuilder() {
        return (C14591H2) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitModels$RpcAck parseDelimitedFrom(InputStream inputStream) {
        return (LivekitModels$RpcAck) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitModels$RpcAck parseFrom(ByteBuffer byteBuffer) {
        return (LivekitModels$RpcAck) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC12124U0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRequestId(String str) {
        str.getClass();
        this.requestId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRequestIdBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.requestId_ = abstractC12171m.m14012w();
    }

    @Override // com.google.protobuf.AbstractC12133Z
    public final Object dynamicMethod(EnumC12131Y enumC12131Y, Object obj, Object obj2) {
        switch (enumC12131Y.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AbstractC12133Z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"requestId_"});
            case 3:
                return new LivekitModels$RpcAck();
            case 4:
                return new C14591H2(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC12124U0 c12123u = PARSER;
                if (c12123u == null) {
                    synchronized (LivekitModels$RpcAck.class) {
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

    public String getRequestId() {
        return this.requestId_;
    }

    public AbstractC12171m getRequestIdBytes() {
        return AbstractC12171m.m14011m(this.requestId_);
    }

    public static C14591H2 newBuilder(LivekitModels$RpcAck livekitModels$RpcAck) {
        return (C14591H2) DEFAULT_INSTANCE.createBuilder(livekitModels$RpcAck);
    }

    public static LivekitModels$RpcAck parseDelimitedFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitModels$RpcAck) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitModels$RpcAck parseFrom(ByteBuffer byteBuffer, C12087F c12087f) {
        return (LivekitModels$RpcAck) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer, c12087f);
    }

    public static LivekitModels$RpcAck parseFrom(AbstractC12171m abstractC12171m) {
        return (LivekitModels$RpcAck) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m);
    }

    public static LivekitModels$RpcAck parseFrom(AbstractC12171m abstractC12171m, C12087F c12087f) {
        return (LivekitModels$RpcAck) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m, c12087f);
    }

    public static LivekitModels$RpcAck parseFrom(byte[] bArr) {
        return (LivekitModels$RpcAck) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitModels$RpcAck parseFrom(byte[] bArr, C12087F c12087f) {
        return (LivekitModels$RpcAck) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr, c12087f);
    }

    public static LivekitModels$RpcAck parseFrom(InputStream inputStream) {
        return (LivekitModels$RpcAck) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitModels$RpcAck parseFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitModels$RpcAck) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitModels$RpcAck parseFrom(AbstractC12186r abstractC12186r) {
        return (LivekitModels$RpcAck) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r);
    }

    public static LivekitModels$RpcAck parseFrom(AbstractC12186r abstractC12186r, C12087F c12087f) {
        return (LivekitModels$RpcAck) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r, c12087f);
    }
}
