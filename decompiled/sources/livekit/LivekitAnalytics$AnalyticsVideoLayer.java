package livekit;

import com.google.protobuf.AbstractC12133Z;
import com.google.protobuf.AbstractC12171m;
import com.google.protobuf.AbstractC12186r;
import com.google.protobuf.C12087F;
import com.google.protobuf.C12123U;
import com.google.protobuf.EnumC12131Y;
import com.google.protobuf.InterfaceC12124U0;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p793ho.C14677W;
import p793ho.InterfaceC14683X;

/* JADX INFO: loaded from: classes2.dex */
public final class LivekitAnalytics$AnalyticsVideoLayer extends AbstractC12133Z implements InterfaceC14683X {
    public static final int BYTES_FIELD_NUMBER = 3;
    private static final LivekitAnalytics$AnalyticsVideoLayer DEFAULT_INSTANCE;
    public static final int FRAMES_FIELD_NUMBER = 4;
    public static final int LAYER_FIELD_NUMBER = 1;
    public static final int PACKETS_FIELD_NUMBER = 2;
    private static volatile InterfaceC12124U0 PARSER;
    private long bytes_;
    private int frames_;
    private int layer_;
    private int packets_;

    static {
        LivekitAnalytics$AnalyticsVideoLayer livekitAnalytics$AnalyticsVideoLayer = new LivekitAnalytics$AnalyticsVideoLayer();
        DEFAULT_INSTANCE = livekitAnalytics$AnalyticsVideoLayer;
        AbstractC12133Z.registerDefaultInstance(LivekitAnalytics$AnalyticsVideoLayer.class, livekitAnalytics$AnalyticsVideoLayer);
    }

    private LivekitAnalytics$AnalyticsVideoLayer() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBytes() {
        this.bytes_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFrames() {
        this.frames_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLayer() {
        this.layer_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPackets() {
        this.packets_ = 0;
    }

    public static LivekitAnalytics$AnalyticsVideoLayer getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C14677W newBuilder() {
        return (C14677W) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitAnalytics$AnalyticsVideoLayer parseDelimitedFrom(InputStream inputStream) {
        return (LivekitAnalytics$AnalyticsVideoLayer) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitAnalytics$AnalyticsVideoLayer parseFrom(ByteBuffer byteBuffer) {
        return (LivekitAnalytics$AnalyticsVideoLayer) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC12124U0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBytes(long j10) {
        this.bytes_ = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFrames(int i10) {
        this.frames_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLayer(int i10) {
        this.layer_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPackets(int i10) {
        this.packets_ = i10;
    }

    @Override // com.google.protobuf.AbstractC12133Z
    public final Object dynamicMethod(EnumC12131Y enumC12131Y, Object obj, Object obj2) {
        switch (enumC12131Y.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AbstractC12133Z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0004\u0002\u000b\u0003\u0003\u0004\u000b", new Object[]{"layer_", "packets_", "bytes_", "frames_"});
            case 3:
                return new LivekitAnalytics$AnalyticsVideoLayer();
            case 4:
                return new C14677W(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC12124U0 c12123u = PARSER;
                if (c12123u == null) {
                    synchronized (LivekitAnalytics$AnalyticsVideoLayer.class) {
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

    public long getBytes() {
        return this.bytes_;
    }

    public int getFrames() {
        return this.frames_;
    }

    public int getLayer() {
        return this.layer_;
    }

    public int getPackets() {
        return this.packets_;
    }

    public static C14677W newBuilder(LivekitAnalytics$AnalyticsVideoLayer livekitAnalytics$AnalyticsVideoLayer) {
        return (C14677W) DEFAULT_INSTANCE.createBuilder(livekitAnalytics$AnalyticsVideoLayer);
    }

    public static LivekitAnalytics$AnalyticsVideoLayer parseDelimitedFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitAnalytics$AnalyticsVideoLayer) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitAnalytics$AnalyticsVideoLayer parseFrom(ByteBuffer byteBuffer, C12087F c12087f) {
        return (LivekitAnalytics$AnalyticsVideoLayer) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer, c12087f);
    }

    public static LivekitAnalytics$AnalyticsVideoLayer parseFrom(AbstractC12171m abstractC12171m) {
        return (LivekitAnalytics$AnalyticsVideoLayer) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m);
    }

    public static LivekitAnalytics$AnalyticsVideoLayer parseFrom(AbstractC12171m abstractC12171m, C12087F c12087f) {
        return (LivekitAnalytics$AnalyticsVideoLayer) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m, c12087f);
    }

    public static LivekitAnalytics$AnalyticsVideoLayer parseFrom(byte[] bArr) {
        return (LivekitAnalytics$AnalyticsVideoLayer) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitAnalytics$AnalyticsVideoLayer parseFrom(byte[] bArr, C12087F c12087f) {
        return (LivekitAnalytics$AnalyticsVideoLayer) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr, c12087f);
    }

    public static LivekitAnalytics$AnalyticsVideoLayer parseFrom(InputStream inputStream) {
        return (LivekitAnalytics$AnalyticsVideoLayer) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitAnalytics$AnalyticsVideoLayer parseFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitAnalytics$AnalyticsVideoLayer) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitAnalytics$AnalyticsVideoLayer parseFrom(AbstractC12186r abstractC12186r) {
        return (LivekitAnalytics$AnalyticsVideoLayer) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r);
    }

    public static LivekitAnalytics$AnalyticsVideoLayer parseFrom(AbstractC12186r abstractC12186r, C12087F c12087f) {
        return (LivekitAnalytics$AnalyticsVideoLayer) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r, c12087f);
    }
}
