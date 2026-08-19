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
import p793ho.C14646Q3;

/* JADX INFO: loaded from: classes2.dex */
public final class LivekitRtc$MuteTrackRequest extends AbstractC12133Z implements InterfaceC12094H0 {
    private static final LivekitRtc$MuteTrackRequest DEFAULT_INSTANCE;
    public static final int MUTED_FIELD_NUMBER = 2;
    private static volatile InterfaceC12124U0 PARSER = null;
    public static final int SID_FIELD_NUMBER = 1;
    private boolean muted_;
    private String sid_ = "";

    static {
        LivekitRtc$MuteTrackRequest livekitRtc$MuteTrackRequest = new LivekitRtc$MuteTrackRequest();
        DEFAULT_INSTANCE = livekitRtc$MuteTrackRequest;
        AbstractC12133Z.registerDefaultInstance(LivekitRtc$MuteTrackRequest.class, livekitRtc$MuteTrackRequest);
    }

    private LivekitRtc$MuteTrackRequest() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMuted() {
        this.muted_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSid() {
        this.sid_ = getDefaultInstance().getSid();
    }

    public static LivekitRtc$MuteTrackRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C14646Q3 newBuilder() {
        return (C14646Q3) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitRtc$MuteTrackRequest parseDelimitedFrom(InputStream inputStream) {
        return (LivekitRtc$MuteTrackRequest) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitRtc$MuteTrackRequest parseFrom(ByteBuffer byteBuffer) {
        return (LivekitRtc$MuteTrackRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC12124U0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMuted(boolean z6) {
        this.muted_ = z6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSid(String str) {
        str.getClass();
        this.sid_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSidBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.sid_ = abstractC12171m.m14012w();
    }

    @Override // com.google.protobuf.AbstractC12133Z
    public final Object dynamicMethod(EnumC12131Y enumC12131Y, Object obj, Object obj2) {
        switch (enumC12131Y.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AbstractC12133Z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\u0007", new Object[]{"sid_", "muted_"});
            case 3:
                return new LivekitRtc$MuteTrackRequest();
            case 4:
                return new C14646Q3(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC12124U0 c12123u = PARSER;
                if (c12123u == null) {
                    synchronized (LivekitRtc$MuteTrackRequest.class) {
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

    public boolean getMuted() {
        return this.muted_;
    }

    public String getSid() {
        return this.sid_;
    }

    public AbstractC12171m getSidBytes() {
        return AbstractC12171m.m14011m(this.sid_);
    }

    public static C14646Q3 newBuilder(LivekitRtc$MuteTrackRequest livekitRtc$MuteTrackRequest) {
        return (C14646Q3) DEFAULT_INSTANCE.createBuilder(livekitRtc$MuteTrackRequest);
    }

    public static LivekitRtc$MuteTrackRequest parseDelimitedFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitRtc$MuteTrackRequest) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitRtc$MuteTrackRequest parseFrom(ByteBuffer byteBuffer, C12087F c12087f) {
        return (LivekitRtc$MuteTrackRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer, c12087f);
    }

    public static LivekitRtc$MuteTrackRequest parseFrom(AbstractC12171m abstractC12171m) {
        return (LivekitRtc$MuteTrackRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m);
    }

    public static LivekitRtc$MuteTrackRequest parseFrom(AbstractC12171m abstractC12171m, C12087F c12087f) {
        return (LivekitRtc$MuteTrackRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m, c12087f);
    }

    public static LivekitRtc$MuteTrackRequest parseFrom(byte[] bArr) {
        return (LivekitRtc$MuteTrackRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitRtc$MuteTrackRequest parseFrom(byte[] bArr, C12087F c12087f) {
        return (LivekitRtc$MuteTrackRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr, c12087f);
    }

    public static LivekitRtc$MuteTrackRequest parseFrom(InputStream inputStream) {
        return (LivekitRtc$MuteTrackRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitRtc$MuteTrackRequest parseFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitRtc$MuteTrackRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitRtc$MuteTrackRequest parseFrom(AbstractC12186r abstractC12186r) {
        return (LivekitRtc$MuteTrackRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r);
    }

    public static LivekitRtc$MuteTrackRequest parseFrom(AbstractC12186r abstractC12186r, C12087F c12087f) {
        return (LivekitRtc$MuteTrackRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r, c12087f);
    }
}
