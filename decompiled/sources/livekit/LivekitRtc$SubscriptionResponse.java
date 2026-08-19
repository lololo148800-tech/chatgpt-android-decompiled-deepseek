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
import p793ho.C14867x4;
import p793ho.EnumC14662T2;

/* JADX INFO: loaded from: classes2.dex */
public final class LivekitRtc$SubscriptionResponse extends AbstractC12133Z implements InterfaceC12094H0 {
    private static final LivekitRtc$SubscriptionResponse DEFAULT_INSTANCE;
    public static final int ERR_FIELD_NUMBER = 2;
    private static volatile InterfaceC12124U0 PARSER = null;
    public static final int TRACK_SID_FIELD_NUMBER = 1;
    private int err_;
    private String trackSid_ = "";

    static {
        LivekitRtc$SubscriptionResponse livekitRtc$SubscriptionResponse = new LivekitRtc$SubscriptionResponse();
        DEFAULT_INSTANCE = livekitRtc$SubscriptionResponse;
        AbstractC12133Z.registerDefaultInstance(LivekitRtc$SubscriptionResponse.class, livekitRtc$SubscriptionResponse);
    }

    private LivekitRtc$SubscriptionResponse() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearErr() {
        this.err_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTrackSid() {
        this.trackSid_ = getDefaultInstance().getTrackSid();
    }

    public static LivekitRtc$SubscriptionResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C14867x4 newBuilder() {
        return (C14867x4) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitRtc$SubscriptionResponse parseDelimitedFrom(InputStream inputStream) {
        return (LivekitRtc$SubscriptionResponse) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitRtc$SubscriptionResponse parseFrom(ByteBuffer byteBuffer) {
        return (LivekitRtc$SubscriptionResponse) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC12124U0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setErr(EnumC14662T2 enumC14662T2) {
        this.err_ = enumC14662T2.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setErrValue(int i10) {
        this.err_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTrackSid(String str) {
        str.getClass();
        this.trackSid_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTrackSidBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.trackSid_ = abstractC12171m.m14012w();
    }

    @Override // com.google.protobuf.AbstractC12133Z
    public final Object dynamicMethod(EnumC12131Y enumC12131Y, Object obj, Object obj2) {
        switch (enumC12131Y.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AbstractC12133Z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\f", new Object[]{"trackSid_", "err_"});
            case 3:
                return new LivekitRtc$SubscriptionResponse();
            case 4:
                return new C14867x4(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC12124U0 c12123u = PARSER;
                if (c12123u == null) {
                    synchronized (LivekitRtc$SubscriptionResponse.class) {
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

    public EnumC14662T2 getErr() {
        EnumC14662T2 enumC14662T2;
        int i10 = this.err_;
        if (i10 == 0) {
            enumC14662T2 = EnumC14662T2.SE_UNKNOWN;
        } else if (i10 != 1) {
            enumC14662T2 = i10 != 2 ? null : EnumC14662T2.SE_TRACK_NOTFOUND;
        } else {
            enumC14662T2 = EnumC14662T2.SE_CODEC_UNSUPPORTED;
        }
        return enumC14662T2 == null ? EnumC14662T2.UNRECOGNIZED : enumC14662T2;
    }

    public int getErrValue() {
        return this.err_;
    }

    public String getTrackSid() {
        return this.trackSid_;
    }

    public AbstractC12171m getTrackSidBytes() {
        return AbstractC12171m.m14011m(this.trackSid_);
    }

    public static C14867x4 newBuilder(LivekitRtc$SubscriptionResponse livekitRtc$SubscriptionResponse) {
        return (C14867x4) DEFAULT_INSTANCE.createBuilder(livekitRtc$SubscriptionResponse);
    }

    public static LivekitRtc$SubscriptionResponse parseDelimitedFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitRtc$SubscriptionResponse) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitRtc$SubscriptionResponse parseFrom(ByteBuffer byteBuffer, C12087F c12087f) {
        return (LivekitRtc$SubscriptionResponse) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer, c12087f);
    }

    public static LivekitRtc$SubscriptionResponse parseFrom(AbstractC12171m abstractC12171m) {
        return (LivekitRtc$SubscriptionResponse) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m);
    }

    public static LivekitRtc$SubscriptionResponse parseFrom(AbstractC12171m abstractC12171m, C12087F c12087f) {
        return (LivekitRtc$SubscriptionResponse) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m, c12087f);
    }

    public static LivekitRtc$SubscriptionResponse parseFrom(byte[] bArr) {
        return (LivekitRtc$SubscriptionResponse) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitRtc$SubscriptionResponse parseFrom(byte[] bArr, C12087F c12087f) {
        return (LivekitRtc$SubscriptionResponse) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr, c12087f);
    }

    public static LivekitRtc$SubscriptionResponse parseFrom(InputStream inputStream) {
        return (LivekitRtc$SubscriptionResponse) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitRtc$SubscriptionResponse parseFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitRtc$SubscriptionResponse) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitRtc$SubscriptionResponse parseFrom(AbstractC12186r abstractC12186r) {
        return (LivekitRtc$SubscriptionResponse) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r);
    }

    public static LivekitRtc$SubscriptionResponse parseFrom(AbstractC12186r abstractC12186r, C12087F c12087f) {
        return (LivekitRtc$SubscriptionResponse) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r, c12087f);
    }
}
