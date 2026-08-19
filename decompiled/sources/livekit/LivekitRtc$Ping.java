package livekit;

import com.google.protobuf.AbstractC12133Z;
import com.google.protobuf.AbstractC12171m;
import com.google.protobuf.AbstractC12186r;
import com.google.protobuf.C12087F;
import com.google.protobuf.C12123U;
import com.google.protobuf.EnumC12131Y;
import com.google.protobuf.InterfaceC12094H0;
import com.google.protobuf.InterfaceC12124U0;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p793ho.C14657S3;

/* JADX INFO: loaded from: classes2.dex */
public final class LivekitRtc$Ping extends AbstractC12133Z implements InterfaceC12094H0 {
    private static final LivekitRtc$Ping DEFAULT_INSTANCE;
    private static volatile InterfaceC12124U0 PARSER = null;
    public static final int RTT_FIELD_NUMBER = 2;
    public static final int TIMESTAMP_FIELD_NUMBER = 1;
    private long rtt_;
    private long timestamp_;

    static {
        LivekitRtc$Ping livekitRtc$Ping = new LivekitRtc$Ping();
        DEFAULT_INSTANCE = livekitRtc$Ping;
        AbstractC12133Z.registerDefaultInstance(LivekitRtc$Ping.class, livekitRtc$Ping);
    }

    private LivekitRtc$Ping() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRtt() {
        this.rtt_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimestamp() {
        this.timestamp_ = 0L;
    }

    public static LivekitRtc$Ping getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C14657S3 newBuilder() {
        return (C14657S3) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitRtc$Ping parseDelimitedFrom(InputStream inputStream) {
        return (LivekitRtc$Ping) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitRtc$Ping parseFrom(ByteBuffer byteBuffer) {
        return (LivekitRtc$Ping) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC12124U0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRtt(long j10) {
        this.rtt_ = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimestamp(long j10) {
        this.timestamp_ = j10;
    }

    @Override // com.google.protobuf.AbstractC12133Z
    public final Object dynamicMethod(EnumC12131Y enumC12131Y, Object obj, Object obj2) {
        switch (enumC12131Y.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AbstractC12133Z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0002", new Object[]{"timestamp_", "rtt_"});
            case 3:
                return new LivekitRtc$Ping();
            case 4:
                return new C14657S3(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC12124U0 c12123u = PARSER;
                if (c12123u == null) {
                    synchronized (LivekitRtc$Ping.class) {
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

    public long getRtt() {
        return this.rtt_;
    }

    public long getTimestamp() {
        return this.timestamp_;
    }

    public static C14657S3 newBuilder(LivekitRtc$Ping livekitRtc$Ping) {
        return (C14657S3) DEFAULT_INSTANCE.createBuilder(livekitRtc$Ping);
    }

    public static LivekitRtc$Ping parseDelimitedFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitRtc$Ping) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitRtc$Ping parseFrom(ByteBuffer byteBuffer, C12087F c12087f) {
        return (LivekitRtc$Ping) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer, c12087f);
    }

    public static LivekitRtc$Ping parseFrom(AbstractC12171m abstractC12171m) {
        return (LivekitRtc$Ping) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m);
    }

    public static LivekitRtc$Ping parseFrom(AbstractC12171m abstractC12171m, C12087F c12087f) {
        return (LivekitRtc$Ping) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m, c12087f);
    }

    public static LivekitRtc$Ping parseFrom(byte[] bArr) {
        return (LivekitRtc$Ping) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitRtc$Ping parseFrom(byte[] bArr, C12087F c12087f) {
        return (LivekitRtc$Ping) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr, c12087f);
    }

    public static LivekitRtc$Ping parseFrom(InputStream inputStream) {
        return (LivekitRtc$Ping) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitRtc$Ping parseFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitRtc$Ping) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitRtc$Ping parseFrom(AbstractC12186r abstractC12186r) {
        return (LivekitRtc$Ping) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r);
    }

    public static LivekitRtc$Ping parseFrom(AbstractC12186r abstractC12186r, C12087F c12087f) {
        return (LivekitRtc$Ping) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r, c12087f);
    }
}
