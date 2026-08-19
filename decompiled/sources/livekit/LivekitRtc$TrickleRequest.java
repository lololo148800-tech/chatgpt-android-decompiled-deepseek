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
import kotlin.reflect.jvm.internal.impl.utils.addToStdlib.GNuz.HJrCuD;
import p793ho.C14581F4;
import p793ho.EnumC14748g4;

/* JADX INFO: loaded from: classes2.dex */
public final class LivekitRtc$TrickleRequest extends AbstractC12133Z implements InterfaceC12094H0 {
    public static final int CANDIDATEINIT_FIELD_NUMBER = 1;
    private static final LivekitRtc$TrickleRequest DEFAULT_INSTANCE;
    public static final int FINAL_FIELD_NUMBER = 3;
    private static volatile InterfaceC12124U0 PARSER = null;
    public static final int TARGET_FIELD_NUMBER = 2;
    private String candidateInit_ = "";
    private boolean final_;
    private int target_;

    static {
        LivekitRtc$TrickleRequest livekitRtc$TrickleRequest = new LivekitRtc$TrickleRequest();
        DEFAULT_INSTANCE = livekitRtc$TrickleRequest;
        AbstractC12133Z.registerDefaultInstance(LivekitRtc$TrickleRequest.class, livekitRtc$TrickleRequest);
    }

    private LivekitRtc$TrickleRequest() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCandidateInit() {
        this.candidateInit_ = getDefaultInstance().getCandidateInit();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFinal() {
        this.final_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTarget() {
        this.target_ = 0;
    }

    public static LivekitRtc$TrickleRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C14581F4 newBuilder() {
        return (C14581F4) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitRtc$TrickleRequest parseDelimitedFrom(InputStream inputStream) {
        return (LivekitRtc$TrickleRequest) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitRtc$TrickleRequest parseFrom(ByteBuffer byteBuffer) {
        return (LivekitRtc$TrickleRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC12124U0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCandidateInit(String str) {
        str.getClass();
        this.candidateInit_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCandidateInitBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.candidateInit_ = abstractC12171m.m14012w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFinal(boolean z6) {
        this.final_ = z6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTarget(EnumC14748g4 enumC14748g4) {
        this.target_ = enumC14748g4.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTargetValue(int i10) {
        this.target_ = i10;
    }

    @Override // com.google.protobuf.AbstractC12133Z
    public final Object dynamicMethod(EnumC12131Y enumC12131Y, Object obj, Object obj2) {
        switch (enumC12131Y.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AbstractC12133Z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u0007", new Object[]{"candidateInit_", HJrCuD.JnKBsAkwThkLW, "final_"});
            case 3:
                return new LivekitRtc$TrickleRequest();
            case 4:
                return new C14581F4(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC12124U0 c12123u = PARSER;
                if (c12123u == null) {
                    synchronized (LivekitRtc$TrickleRequest.class) {
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

    public String getCandidateInit() {
        return this.candidateInit_;
    }

    public AbstractC12171m getCandidateInitBytes() {
        return AbstractC12171m.m14011m(this.candidateInit_);
    }

    public boolean getFinal() {
        return this.final_;
    }

    public EnumC14748g4 getTarget() {
        EnumC14748g4 enumC14748g4;
        int i10 = this.target_;
        if (i10 != 0) {
            enumC14748g4 = i10 != 1 ? null : EnumC14748g4.SUBSCRIBER;
        } else {
            enumC14748g4 = EnumC14748g4.PUBLISHER;
        }
        return enumC14748g4 == null ? EnumC14748g4.UNRECOGNIZED : enumC14748g4;
    }

    public int getTargetValue() {
        return this.target_;
    }

    public static C14581F4 newBuilder(LivekitRtc$TrickleRequest livekitRtc$TrickleRequest) {
        return (C14581F4) DEFAULT_INSTANCE.createBuilder(livekitRtc$TrickleRequest);
    }

    public static LivekitRtc$TrickleRequest parseDelimitedFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitRtc$TrickleRequest) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitRtc$TrickleRequest parseFrom(ByteBuffer byteBuffer, C12087F c12087f) {
        return (LivekitRtc$TrickleRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer, c12087f);
    }

    public static LivekitRtc$TrickleRequest parseFrom(AbstractC12171m abstractC12171m) {
        return (LivekitRtc$TrickleRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m);
    }

    public static LivekitRtc$TrickleRequest parseFrom(AbstractC12171m abstractC12171m, C12087F c12087f) {
        return (LivekitRtc$TrickleRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m, c12087f);
    }

    public static LivekitRtc$TrickleRequest parseFrom(byte[] bArr) {
        return (LivekitRtc$TrickleRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitRtc$TrickleRequest parseFrom(byte[] bArr, C12087F c12087f) {
        return (LivekitRtc$TrickleRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr, c12087f);
    }

    public static LivekitRtc$TrickleRequest parseFrom(InputStream inputStream) {
        return (LivekitRtc$TrickleRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitRtc$TrickleRequest parseFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitRtc$TrickleRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitRtc$TrickleRequest parseFrom(AbstractC12186r abstractC12186r) {
        return (LivekitRtc$TrickleRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r);
    }

    public static LivekitRtc$TrickleRequest parseFrom(AbstractC12186r abstractC12186r, C12087F c12087f) {
        return (LivekitRtc$TrickleRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r, c12087f);
    }
}
