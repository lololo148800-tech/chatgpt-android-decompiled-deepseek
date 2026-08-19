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
import p793ho.C14603J2;

/* JADX INFO: loaded from: classes2.dex */
public final class LivekitModels$RpcRequest extends AbstractC12133Z implements InterfaceC12094H0 {
    private static final LivekitModels$RpcRequest DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int METHOD_FIELD_NUMBER = 2;
    private static volatile InterfaceC12124U0 PARSER = null;
    public static final int PAYLOAD_FIELD_NUMBER = 3;
    public static final int RESPONSE_TIMEOUT_MS_FIELD_NUMBER = 4;
    public static final int VERSION_FIELD_NUMBER = 5;
    private String id_ = "";
    private String method_ = "";
    private String payload_ = "";
    private int responseTimeoutMs_;
    private int version_;

    static {
        LivekitModels$RpcRequest livekitModels$RpcRequest = new LivekitModels$RpcRequest();
        DEFAULT_INSTANCE = livekitModels$RpcRequest;
        AbstractC12133Z.registerDefaultInstance(LivekitModels$RpcRequest.class, livekitModels$RpcRequest);
    }

    private LivekitModels$RpcRequest() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.id_ = getDefaultInstance().getId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMethod() {
        this.method_ = getDefaultInstance().getMethod();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPayload() {
        this.payload_ = getDefaultInstance().getPayload();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResponseTimeoutMs() {
        this.responseTimeoutMs_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVersion() {
        this.version_ = 0;
    }

    public static LivekitModels$RpcRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C14603J2 newBuilder() {
        return (C14603J2) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitModels$RpcRequest parseDelimitedFrom(InputStream inputStream) {
        return (LivekitModels$RpcRequest) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitModels$RpcRequest parseFrom(ByteBuffer byteBuffer) {
        return (LivekitModels$RpcRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC12124U0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setId(String str) {
        str.getClass();
        this.id_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIdBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.id_ = abstractC12171m.m14012w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMethod(String str) {
        str.getClass();
        this.method_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMethodBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.method_ = abstractC12171m.m14012w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPayload(String str) {
        str.getClass();
        this.payload_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPayloadBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.payload_ = abstractC12171m.m14012w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResponseTimeoutMs(int i10) {
        this.responseTimeoutMs_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVersion(int i10) {
        this.version_ = i10;
    }

    @Override // com.google.protobuf.AbstractC12133Z
    public final Object dynamicMethod(EnumC12131Y enumC12131Y, Object obj, Object obj2) {
        switch (enumC12131Y.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AbstractC12133Z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\u000b\u0005\u000b", new Object[]{"id_", "method_", "payload_", "responseTimeoutMs_", "version_"});
            case 3:
                return new LivekitModels$RpcRequest();
            case 4:
                return new C14603J2(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC12124U0 c12123u = PARSER;
                if (c12123u == null) {
                    synchronized (LivekitModels$RpcRequest.class) {
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

    public String getId() {
        return this.id_;
    }

    public AbstractC12171m getIdBytes() {
        return AbstractC12171m.m14011m(this.id_);
    }

    public String getMethod() {
        return this.method_;
    }

    public AbstractC12171m getMethodBytes() {
        return AbstractC12171m.m14011m(this.method_);
    }

    public String getPayload() {
        return this.payload_;
    }

    public AbstractC12171m getPayloadBytes() {
        return AbstractC12171m.m14011m(this.payload_);
    }

    public int getResponseTimeoutMs() {
        return this.responseTimeoutMs_;
    }

    public int getVersion() {
        return this.version_;
    }

    public static C14603J2 newBuilder(LivekitModels$RpcRequest livekitModels$RpcRequest) {
        return (C14603J2) DEFAULT_INSTANCE.createBuilder(livekitModels$RpcRequest);
    }

    public static LivekitModels$RpcRequest parseDelimitedFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitModels$RpcRequest) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitModels$RpcRequest parseFrom(ByteBuffer byteBuffer, C12087F c12087f) {
        return (LivekitModels$RpcRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer, c12087f);
    }

    public static LivekitModels$RpcRequest parseFrom(AbstractC12171m abstractC12171m) {
        return (LivekitModels$RpcRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m);
    }

    public static LivekitModels$RpcRequest parseFrom(AbstractC12171m abstractC12171m, C12087F c12087f) {
        return (LivekitModels$RpcRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m, c12087f);
    }

    public static LivekitModels$RpcRequest parseFrom(byte[] bArr) {
        return (LivekitModels$RpcRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitModels$RpcRequest parseFrom(byte[] bArr, C12087F c12087f) {
        return (LivekitModels$RpcRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr, c12087f);
    }

    public static LivekitModels$RpcRequest parseFrom(InputStream inputStream) {
        return (LivekitModels$RpcRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitModels$RpcRequest parseFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitModels$RpcRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitModels$RpcRequest parseFrom(AbstractC12186r abstractC12186r) {
        return (LivekitModels$RpcRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r);
    }

    public static LivekitModels$RpcRequest parseFrom(AbstractC12186r abstractC12186r, C12087F c12087f) {
        return (LivekitModels$RpcRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r, c12087f);
    }
}
