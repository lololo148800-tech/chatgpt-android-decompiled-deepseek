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
import p793ho.C14597I2;
import p793ho.C14609K2;
import p793ho.EnumC14615L2;

/* JADX INFO: loaded from: classes2.dex */
public final class LivekitModels$RpcResponse extends AbstractC12133Z implements InterfaceC12094H0 {
    private static final LivekitModels$RpcResponse DEFAULT_INSTANCE;
    public static final int ERROR_FIELD_NUMBER = 3;
    private static volatile InterfaceC12124U0 PARSER = null;
    public static final int PAYLOAD_FIELD_NUMBER = 2;
    public static final int REQUEST_ID_FIELD_NUMBER = 1;
    private Object value_;
    private int valueCase_ = 0;
    private String requestId_ = "";

    static {
        LivekitModels$RpcResponse livekitModels$RpcResponse = new LivekitModels$RpcResponse();
        DEFAULT_INSTANCE = livekitModels$RpcResponse;
        AbstractC12133Z.registerDefaultInstance(LivekitModels$RpcResponse.class, livekitModels$RpcResponse);
    }

    private LivekitModels$RpcResponse() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearError() {
        if (this.valueCase_ == 3) {
            this.valueCase_ = 0;
            this.value_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPayload() {
        if (this.valueCase_ == 2) {
            this.valueCase_ = 0;
            this.value_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRequestId() {
        this.requestId_ = getDefaultInstance().getRequestId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValue() {
        this.valueCase_ = 0;
        this.value_ = null;
    }

    public static LivekitModels$RpcResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeError(LivekitModels$RpcError livekitModels$RpcError) {
        livekitModels$RpcError.getClass();
        if (this.valueCase_ != 3 || this.value_ == LivekitModels$RpcError.getDefaultInstance()) {
            this.value_ = livekitModels$RpcError;
        } else {
            C14597I2 c14597i2NewBuilder = LivekitModels$RpcError.newBuilder((LivekitModels$RpcError) this.value_);
            c14597i2NewBuilder.m13865f(livekitModels$RpcError);
            this.value_ = c14597i2NewBuilder.m13862c();
        }
        this.valueCase_ = 3;
    }

    public static C14609K2 newBuilder() {
        return (C14609K2) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitModels$RpcResponse parseDelimitedFrom(InputStream inputStream) {
        return (LivekitModels$RpcResponse) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitModels$RpcResponse parseFrom(ByteBuffer byteBuffer) {
        return (LivekitModels$RpcResponse) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC12124U0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setError(LivekitModels$RpcError livekitModels$RpcError) {
        livekitModels$RpcError.getClass();
        this.value_ = livekitModels$RpcError;
        this.valueCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPayload(String str) {
        str.getClass();
        this.valueCase_ = 2;
        this.value_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPayloadBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.value_ = abstractC12171m.m14012w();
        this.valueCase_ = 2;
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
                return AbstractC12133Z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȼ\u0000\u0003<\u0000", new Object[]{"value_", "valueCase_", "requestId_", LivekitModels$RpcError.class});
            case 3:
                return new LivekitModels$RpcResponse();
            case 4:
                return new C14609K2(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC12124U0 c12123u = PARSER;
                if (c12123u == null) {
                    synchronized (LivekitModels$RpcResponse.class) {
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

    public LivekitModels$RpcError getError() {
        return this.valueCase_ == 3 ? (LivekitModels$RpcError) this.value_ : LivekitModels$RpcError.getDefaultInstance();
    }

    public String getPayload() {
        return this.valueCase_ == 2 ? (String) this.value_ : "";
    }

    public AbstractC12171m getPayloadBytes() {
        return AbstractC12171m.m14011m(this.valueCase_ == 2 ? (String) this.value_ : "");
    }

    public String getRequestId() {
        return this.requestId_;
    }

    public AbstractC12171m getRequestIdBytes() {
        return AbstractC12171m.m14011m(this.requestId_);
    }

    public EnumC14615L2 getValueCase() {
        int i10 = this.valueCase_;
        if (i10 == 0) {
            return EnumC14615L2.f45907o0;
        }
        if (i10 == 2) {
            return EnumC14615L2.f45905Y;
        }
        if (i10 != 3) {
            return null;
        }
        return EnumC14615L2.f45906Z;
    }

    public boolean hasError() {
        return this.valueCase_ == 3;
    }

    public boolean hasPayload() {
        return this.valueCase_ == 2;
    }

    public static C14609K2 newBuilder(LivekitModels$RpcResponse livekitModels$RpcResponse) {
        return (C14609K2) DEFAULT_INSTANCE.createBuilder(livekitModels$RpcResponse);
    }

    public static LivekitModels$RpcResponse parseDelimitedFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitModels$RpcResponse) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitModels$RpcResponse parseFrom(ByteBuffer byteBuffer, C12087F c12087f) {
        return (LivekitModels$RpcResponse) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer, c12087f);
    }

    public static LivekitModels$RpcResponse parseFrom(AbstractC12171m abstractC12171m) {
        return (LivekitModels$RpcResponse) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m);
    }

    public static LivekitModels$RpcResponse parseFrom(AbstractC12171m abstractC12171m, C12087F c12087f) {
        return (LivekitModels$RpcResponse) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m, c12087f);
    }

    public static LivekitModels$RpcResponse parseFrom(byte[] bArr) {
        return (LivekitModels$RpcResponse) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitModels$RpcResponse parseFrom(byte[] bArr, C12087F c12087f) {
        return (LivekitModels$RpcResponse) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr, c12087f);
    }

    public static LivekitModels$RpcResponse parseFrom(InputStream inputStream) {
        return (LivekitModels$RpcResponse) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitModels$RpcResponse parseFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitModels$RpcResponse) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitModels$RpcResponse parseFrom(AbstractC12186r abstractC12186r) {
        return (LivekitModels$RpcResponse) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r);
    }

    public static LivekitModels$RpcResponse parseFrom(AbstractC12186r abstractC12186r, C12087F c12087f) {
        return (LivekitModels$RpcResponse) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r, c12087f);
    }
}
