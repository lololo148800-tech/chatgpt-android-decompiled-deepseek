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

/* JADX INFO: loaded from: classes2.dex */
public final class LivekitModels$RpcError extends AbstractC12133Z implements InterfaceC12094H0 {
    public static final int CODE_FIELD_NUMBER = 1;
    public static final int DATA_FIELD_NUMBER = 3;
    private static final LivekitModels$RpcError DEFAULT_INSTANCE;
    public static final int MESSAGE_FIELD_NUMBER = 2;
    private static volatile InterfaceC12124U0 PARSER;
    private int code_;
    private String message_ = "";
    private String data_ = "";

    static {
        LivekitModels$RpcError livekitModels$RpcError = new LivekitModels$RpcError();
        DEFAULT_INSTANCE = livekitModels$RpcError;
        AbstractC12133Z.registerDefaultInstance(LivekitModels$RpcError.class, livekitModels$RpcError);
    }

    private LivekitModels$RpcError() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCode() {
        this.code_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearData() {
        this.data_ = getDefaultInstance().getData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMessage() {
        this.message_ = getDefaultInstance().getMessage();
    }

    public static LivekitModels$RpcError getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C14597I2 newBuilder() {
        return (C14597I2) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitModels$RpcError parseDelimitedFrom(InputStream inputStream) {
        return (LivekitModels$RpcError) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitModels$RpcError parseFrom(ByteBuffer byteBuffer) {
        return (LivekitModels$RpcError) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC12124U0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCode(int i10) {
        this.code_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setData(String str) {
        str.getClass();
        this.data_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDataBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.data_ = abstractC12171m.m14012w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMessage(String str) {
        str.getClass();
        this.message_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMessageBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.message_ = abstractC12171m.m14012w();
    }

    @Override // com.google.protobuf.AbstractC12133Z
    public final Object dynamicMethod(EnumC12131Y enumC12131Y, Object obj, Object obj2) {
        switch (enumC12131Y.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AbstractC12133Z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002Ȉ\u0003Ȉ", new Object[]{"code_", "message_", "data_"});
            case 3:
                return new LivekitModels$RpcError();
            case 4:
                return new C14597I2(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC12124U0 c12123u = PARSER;
                if (c12123u == null) {
                    synchronized (LivekitModels$RpcError.class) {
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

    public int getCode() {
        return this.code_;
    }

    public String getData() {
        return this.data_;
    }

    public AbstractC12171m getDataBytes() {
        return AbstractC12171m.m14011m(this.data_);
    }

    public String getMessage() {
        return this.message_;
    }

    public AbstractC12171m getMessageBytes() {
        return AbstractC12171m.m14011m(this.message_);
    }

    public static C14597I2 newBuilder(LivekitModels$RpcError livekitModels$RpcError) {
        return (C14597I2) DEFAULT_INSTANCE.createBuilder(livekitModels$RpcError);
    }

    public static LivekitModels$RpcError parseDelimitedFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitModels$RpcError) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitModels$RpcError parseFrom(ByteBuffer byteBuffer, C12087F c12087f) {
        return (LivekitModels$RpcError) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer, c12087f);
    }

    public static LivekitModels$RpcError parseFrom(AbstractC12171m abstractC12171m) {
        return (LivekitModels$RpcError) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m);
    }

    public static LivekitModels$RpcError parseFrom(AbstractC12171m abstractC12171m, C12087F c12087f) {
        return (LivekitModels$RpcError) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m, c12087f);
    }

    public static LivekitModels$RpcError parseFrom(byte[] bArr) {
        return (LivekitModels$RpcError) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitModels$RpcError parseFrom(byte[] bArr, C12087F c12087f) {
        return (LivekitModels$RpcError) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr, c12087f);
    }

    public static LivekitModels$RpcError parseFrom(InputStream inputStream) {
        return (LivekitModels$RpcError) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitModels$RpcError parseFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitModels$RpcError) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitModels$RpcError parseFrom(AbstractC12186r abstractC12186r) {
        return (LivekitModels$RpcError) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r);
    }

    public static LivekitModels$RpcError parseFrom(AbstractC12186r abstractC12186r, C12087F c12087f) {
        return (LivekitModels$RpcError) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r, c12087f);
    }
}
