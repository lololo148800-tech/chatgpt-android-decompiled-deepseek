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
import p138F8.vJO.vRJidSveZHcTw;
import p793ho.C14645Q2;

/* JADX INFO: loaded from: classes2.dex */
public final class LivekitModels$SipDTMF extends AbstractC12133Z implements InterfaceC12094H0 {
    public static final int CODE_FIELD_NUMBER = 3;
    private static final LivekitModels$SipDTMF DEFAULT_INSTANCE;
    public static final int DIGIT_FIELD_NUMBER = 4;
    private static volatile InterfaceC12124U0 PARSER;
    private int code_;
    private String digit_ = "";

    static {
        LivekitModels$SipDTMF livekitModels$SipDTMF = new LivekitModels$SipDTMF();
        DEFAULT_INSTANCE = livekitModels$SipDTMF;
        AbstractC12133Z.registerDefaultInstance(LivekitModels$SipDTMF.class, livekitModels$SipDTMF);
    }

    private LivekitModels$SipDTMF() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCode() {
        this.code_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDigit() {
        this.digit_ = getDefaultInstance().getDigit();
    }

    public static LivekitModels$SipDTMF getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C14645Q2 newBuilder() {
        return (C14645Q2) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitModels$SipDTMF parseDelimitedFrom(InputStream inputStream) {
        return (LivekitModels$SipDTMF) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitModels$SipDTMF parseFrom(ByteBuffer byteBuffer) {
        return (LivekitModels$SipDTMF) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC12124U0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCode(int i10) {
        this.code_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDigit(String str) {
        str.getClass();
        this.digit_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDigitBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.digit_ = abstractC12171m.m14012w();
    }

    @Override // com.google.protobuf.AbstractC12133Z
    public final Object dynamicMethod(EnumC12131Y enumC12131Y, Object obj, Object obj2) {
        switch (enumC12131Y.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AbstractC12133Z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0003\u0004\u0002\u0000\u0000\u0000\u0003\u000b\u0004Ȉ", new Object[]{"code_", vRJidSveZHcTw.WpxWMIattaLzOlf});
            case 3:
                return new LivekitModels$SipDTMF();
            case 4:
                return new C14645Q2(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC12124U0 c12123u = PARSER;
                if (c12123u == null) {
                    synchronized (LivekitModels$SipDTMF.class) {
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

    public String getDigit() {
        return this.digit_;
    }

    public AbstractC12171m getDigitBytes() {
        return AbstractC12171m.m14011m(this.digit_);
    }

    public static C14645Q2 newBuilder(LivekitModels$SipDTMF livekitModels$SipDTMF) {
        return (C14645Q2) DEFAULT_INSTANCE.createBuilder(livekitModels$SipDTMF);
    }

    public static LivekitModels$SipDTMF parseDelimitedFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitModels$SipDTMF) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitModels$SipDTMF parseFrom(ByteBuffer byteBuffer, C12087F c12087f) {
        return (LivekitModels$SipDTMF) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer, c12087f);
    }

    public static LivekitModels$SipDTMF parseFrom(AbstractC12171m abstractC12171m) {
        return (LivekitModels$SipDTMF) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m);
    }

    public static LivekitModels$SipDTMF parseFrom(AbstractC12171m abstractC12171m, C12087F c12087f) {
        return (LivekitModels$SipDTMF) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m, c12087f);
    }

    public static LivekitModels$SipDTMF parseFrom(byte[] bArr) {
        return (LivekitModels$SipDTMF) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitModels$SipDTMF parseFrom(byte[] bArr, C12087F c12087f) {
        return (LivekitModels$SipDTMF) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr, c12087f);
    }

    public static LivekitModels$SipDTMF parseFrom(InputStream inputStream) {
        return (LivekitModels$SipDTMF) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitModels$SipDTMF parseFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitModels$SipDTMF) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitModels$SipDTMF parseFrom(AbstractC12186r abstractC12186r) {
        return (LivekitModels$SipDTMF) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r);
    }

    public static LivekitModels$SipDTMF parseFrom(AbstractC12186r abstractC12186r, C12087F c12087f) {
        return (LivekitModels$SipDTMF) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r, c12087f);
    }
}
