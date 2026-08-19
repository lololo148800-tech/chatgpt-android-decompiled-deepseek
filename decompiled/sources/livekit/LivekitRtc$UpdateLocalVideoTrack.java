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
import p793ho.C14593H4;

/* JADX INFO: loaded from: classes2.dex */
public final class LivekitRtc$UpdateLocalVideoTrack extends AbstractC12133Z implements InterfaceC12094H0 {
    private static final LivekitRtc$UpdateLocalVideoTrack DEFAULT_INSTANCE;
    public static final int HEIGHT_FIELD_NUMBER = 3;
    private static volatile InterfaceC12124U0 PARSER = null;
    public static final int TRACK_SID_FIELD_NUMBER = 1;
    public static final int WIDTH_FIELD_NUMBER = 2;
    private int height_;
    private String trackSid_ = "";
    private int width_;

    static {
        LivekitRtc$UpdateLocalVideoTrack livekitRtc$UpdateLocalVideoTrack = new LivekitRtc$UpdateLocalVideoTrack();
        DEFAULT_INSTANCE = livekitRtc$UpdateLocalVideoTrack;
        AbstractC12133Z.registerDefaultInstance(LivekitRtc$UpdateLocalVideoTrack.class, livekitRtc$UpdateLocalVideoTrack);
    }

    private LivekitRtc$UpdateLocalVideoTrack() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHeight() {
        this.height_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTrackSid() {
        this.trackSid_ = getDefaultInstance().getTrackSid();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWidth() {
        this.width_ = 0;
    }

    public static LivekitRtc$UpdateLocalVideoTrack getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C14593H4 newBuilder() {
        return (C14593H4) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitRtc$UpdateLocalVideoTrack parseDelimitedFrom(InputStream inputStream) {
        return (LivekitRtc$UpdateLocalVideoTrack) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitRtc$UpdateLocalVideoTrack parseFrom(ByteBuffer byteBuffer) {
        return (LivekitRtc$UpdateLocalVideoTrack) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC12124U0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHeight(int i10) {
        this.height_ = i10;
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

    /* JADX INFO: Access modifiers changed from: private */
    public void setWidth(int i10) {
        this.width_ = i10;
    }

    @Override // com.google.protobuf.AbstractC12133Z
    public final Object dynamicMethod(EnumC12131Y enumC12131Y, Object obj, Object obj2) {
        switch (enumC12131Y.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AbstractC12133Z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\u000b\u0003\u000b", new Object[]{"trackSid_", "width_", "height_"});
            case 3:
                return new LivekitRtc$UpdateLocalVideoTrack();
            case 4:
                return new C14593H4(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC12124U0 c12123u = PARSER;
                if (c12123u == null) {
                    synchronized (LivekitRtc$UpdateLocalVideoTrack.class) {
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

    public int getHeight() {
        return this.height_;
    }

    public String getTrackSid() {
        return this.trackSid_;
    }

    public AbstractC12171m getTrackSidBytes() {
        return AbstractC12171m.m14011m(this.trackSid_);
    }

    public int getWidth() {
        return this.width_;
    }

    public static C14593H4 newBuilder(LivekitRtc$UpdateLocalVideoTrack livekitRtc$UpdateLocalVideoTrack) {
        return (C14593H4) DEFAULT_INSTANCE.createBuilder(livekitRtc$UpdateLocalVideoTrack);
    }

    public static LivekitRtc$UpdateLocalVideoTrack parseDelimitedFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitRtc$UpdateLocalVideoTrack) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitRtc$UpdateLocalVideoTrack parseFrom(ByteBuffer byteBuffer, C12087F c12087f) {
        return (LivekitRtc$UpdateLocalVideoTrack) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer, c12087f);
    }

    public static LivekitRtc$UpdateLocalVideoTrack parseFrom(AbstractC12171m abstractC12171m) {
        return (LivekitRtc$UpdateLocalVideoTrack) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m);
    }

    public static LivekitRtc$UpdateLocalVideoTrack parseFrom(AbstractC12171m abstractC12171m, C12087F c12087f) {
        return (LivekitRtc$UpdateLocalVideoTrack) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m, c12087f);
    }

    public static LivekitRtc$UpdateLocalVideoTrack parseFrom(byte[] bArr) {
        return (LivekitRtc$UpdateLocalVideoTrack) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitRtc$UpdateLocalVideoTrack parseFrom(byte[] bArr, C12087F c12087f) {
        return (LivekitRtc$UpdateLocalVideoTrack) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr, c12087f);
    }

    public static LivekitRtc$UpdateLocalVideoTrack parseFrom(InputStream inputStream) {
        return (LivekitRtc$UpdateLocalVideoTrack) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitRtc$UpdateLocalVideoTrack parseFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitRtc$UpdateLocalVideoTrack) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitRtc$UpdateLocalVideoTrack parseFrom(AbstractC12186r abstractC12186r) {
        return (LivekitRtc$UpdateLocalVideoTrack) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r);
    }

    public static LivekitRtc$UpdateLocalVideoTrack parseFrom(AbstractC12186r abstractC12186r, C12087F c12087f) {
        return (LivekitRtc$UpdateLocalVideoTrack) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r, c12087f);
    }
}
