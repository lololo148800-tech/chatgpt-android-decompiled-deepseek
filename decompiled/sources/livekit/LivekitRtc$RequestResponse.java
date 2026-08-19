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
import p793ho.C14693Y3;
import p793ho.EnumC14699Z3;

/* JADX INFO: loaded from: classes2.dex */
public final class LivekitRtc$RequestResponse extends AbstractC12133Z implements InterfaceC12094H0 {
    private static final LivekitRtc$RequestResponse DEFAULT_INSTANCE;
    public static final int MESSAGE_FIELD_NUMBER = 3;
    private static volatile InterfaceC12124U0 PARSER = null;
    public static final int REASON_FIELD_NUMBER = 2;
    public static final int REQUEST_ID_FIELD_NUMBER = 1;
    private String message_ = "";
    private int reason_;
    private int requestId_;

    static {
        LivekitRtc$RequestResponse livekitRtc$RequestResponse = new LivekitRtc$RequestResponse();
        DEFAULT_INSTANCE = livekitRtc$RequestResponse;
        AbstractC12133Z.registerDefaultInstance(LivekitRtc$RequestResponse.class, livekitRtc$RequestResponse);
    }

    private LivekitRtc$RequestResponse() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMessage() {
        this.message_ = getDefaultInstance().getMessage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReason() {
        this.reason_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRequestId() {
        this.requestId_ = 0;
    }

    public static LivekitRtc$RequestResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C14693Y3 newBuilder() {
        return (C14693Y3) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitRtc$RequestResponse parseDelimitedFrom(InputStream inputStream) {
        return (LivekitRtc$RequestResponse) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitRtc$RequestResponse parseFrom(ByteBuffer byteBuffer) {
        return (LivekitRtc$RequestResponse) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC12124U0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
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

    /* JADX INFO: Access modifiers changed from: private */
    public void setReason(EnumC14699Z3 enumC14699Z3) {
        this.reason_ = enumC14699Z3.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReasonValue(int i10) {
        this.reason_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRequestId(int i10) {
        this.requestId_ = i10;
    }

    @Override // com.google.protobuf.AbstractC12133Z
    public final Object dynamicMethod(EnumC12131Y enumC12131Y, Object obj, Object obj2) {
        switch (enumC12131Y.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AbstractC12133Z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\f\u0003Ȉ", new Object[]{"requestId_", "reason_", "message_"});
            case 3:
                return new LivekitRtc$RequestResponse();
            case 4:
                return new C14693Y3(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC12124U0 c12123u = PARSER;
                if (c12123u == null) {
                    synchronized (LivekitRtc$RequestResponse.class) {
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

    public String getMessage() {
        return this.message_;
    }

    public AbstractC12171m getMessageBytes() {
        return AbstractC12171m.m14011m(this.message_);
    }

    public EnumC14699Z3 getReason() {
        EnumC14699Z3 enumC14699Z3;
        int i10 = this.reason_;
        if (i10 == 0) {
            enumC14699Z3 = EnumC14699Z3.OK;
        } else if (i10 == 1) {
            enumC14699Z3 = EnumC14699Z3.NOT_FOUND;
        } else if (i10 != 2) {
            enumC14699Z3 = i10 != 3 ? null : EnumC14699Z3.LIMIT_EXCEEDED;
        } else {
            enumC14699Z3 = EnumC14699Z3.NOT_ALLOWED;
        }
        return enumC14699Z3 == null ? EnumC14699Z3.UNRECOGNIZED : enumC14699Z3;
    }

    public int getReasonValue() {
        return this.reason_;
    }

    public int getRequestId() {
        return this.requestId_;
    }

    public static C14693Y3 newBuilder(LivekitRtc$RequestResponse livekitRtc$RequestResponse) {
        return (C14693Y3) DEFAULT_INSTANCE.createBuilder(livekitRtc$RequestResponse);
    }

    public static LivekitRtc$RequestResponse parseDelimitedFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitRtc$RequestResponse) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitRtc$RequestResponse parseFrom(ByteBuffer byteBuffer, C12087F c12087f) {
        return (LivekitRtc$RequestResponse) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer, c12087f);
    }

    public static LivekitRtc$RequestResponse parseFrom(AbstractC12171m abstractC12171m) {
        return (LivekitRtc$RequestResponse) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m);
    }

    public static LivekitRtc$RequestResponse parseFrom(AbstractC12171m abstractC12171m, C12087F c12087f) {
        return (LivekitRtc$RequestResponse) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m, c12087f);
    }

    public static LivekitRtc$RequestResponse parseFrom(byte[] bArr) {
        return (LivekitRtc$RequestResponse) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitRtc$RequestResponse parseFrom(byte[] bArr, C12087F c12087f) {
        return (LivekitRtc$RequestResponse) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr, c12087f);
    }

    public static LivekitRtc$RequestResponse parseFrom(InputStream inputStream) {
        return (LivekitRtc$RequestResponse) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitRtc$RequestResponse parseFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitRtc$RequestResponse) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitRtc$RequestResponse parseFrom(AbstractC12186r abstractC12186r) {
        return (LivekitRtc$RequestResponse) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r);
    }

    public static LivekitRtc$RequestResponse parseFrom(AbstractC12186r abstractC12186r, C12087F c12087f) {
        return (LivekitRtc$RequestResponse) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r, c12087f);
    }
}
