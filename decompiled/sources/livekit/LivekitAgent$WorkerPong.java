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
import p793ho.C14848v;

/* JADX INFO: loaded from: classes2.dex */
public final class LivekitAgent$WorkerPong extends AbstractC12133Z implements InterfaceC12094H0 {
    private static final LivekitAgent$WorkerPong DEFAULT_INSTANCE;
    public static final int LAST_TIMESTAMP_FIELD_NUMBER = 1;
    private static volatile InterfaceC12124U0 PARSER = null;
    public static final int TIMESTAMP_FIELD_NUMBER = 2;
    private long lastTimestamp_;
    private long timestamp_;

    static {
        LivekitAgent$WorkerPong livekitAgent$WorkerPong = new LivekitAgent$WorkerPong();
        DEFAULT_INSTANCE = livekitAgent$WorkerPong;
        AbstractC12133Z.registerDefaultInstance(LivekitAgent$WorkerPong.class, livekitAgent$WorkerPong);
    }

    private LivekitAgent$WorkerPong() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLastTimestamp() {
        this.lastTimestamp_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimestamp() {
        this.timestamp_ = 0L;
    }

    public static LivekitAgent$WorkerPong getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C14848v newBuilder() {
        return (C14848v) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitAgent$WorkerPong parseDelimitedFrom(InputStream inputStream) {
        return (LivekitAgent$WorkerPong) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitAgent$WorkerPong parseFrom(ByteBuffer byteBuffer) {
        return (LivekitAgent$WorkerPong) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC12124U0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLastTimestamp(long j10) {
        this.lastTimestamp_ = j10;
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
                return AbstractC12133Z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0002", new Object[]{"lastTimestamp_", "timestamp_"});
            case 3:
                return new LivekitAgent$WorkerPong();
            case 4:
                return new C14848v(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC12124U0 c12123u = PARSER;
                if (c12123u == null) {
                    synchronized (LivekitAgent$WorkerPong.class) {
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

    public long getLastTimestamp() {
        return this.lastTimestamp_;
    }

    public long getTimestamp() {
        return this.timestamp_;
    }

    public static C14848v newBuilder(LivekitAgent$WorkerPong livekitAgent$WorkerPong) {
        return (C14848v) DEFAULT_INSTANCE.createBuilder(livekitAgent$WorkerPong);
    }

    public static LivekitAgent$WorkerPong parseDelimitedFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitAgent$WorkerPong) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitAgent$WorkerPong parseFrom(ByteBuffer byteBuffer, C12087F c12087f) {
        return (LivekitAgent$WorkerPong) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer, c12087f);
    }

    public static LivekitAgent$WorkerPong parseFrom(AbstractC12171m abstractC12171m) {
        return (LivekitAgent$WorkerPong) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m);
    }

    public static LivekitAgent$WorkerPong parseFrom(AbstractC12171m abstractC12171m, C12087F c12087f) {
        return (LivekitAgent$WorkerPong) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m, c12087f);
    }

    public static LivekitAgent$WorkerPong parseFrom(byte[] bArr) {
        return (LivekitAgent$WorkerPong) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitAgent$WorkerPong parseFrom(byte[] bArr, C12087F c12087f) {
        return (LivekitAgent$WorkerPong) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr, c12087f);
    }

    public static LivekitAgent$WorkerPong parseFrom(InputStream inputStream) {
        return (LivekitAgent$WorkerPong) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitAgent$WorkerPong parseFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitAgent$WorkerPong) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitAgent$WorkerPong parseFrom(AbstractC12186r abstractC12186r) {
        return (LivekitAgent$WorkerPong) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r);
    }

    public static LivekitAgent$WorkerPong parseFrom(AbstractC12186r abstractC12186r, C12087F c12087f) {
        return (LivekitAgent$WorkerPong) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r, c12087f);
    }
}
