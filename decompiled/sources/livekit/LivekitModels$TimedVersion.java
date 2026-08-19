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
import p793ho.C14668U2;

/* JADX INFO: loaded from: classes2.dex */
public final class LivekitModels$TimedVersion extends AbstractC12133Z implements InterfaceC12094H0 {
    private static final LivekitModels$TimedVersion DEFAULT_INSTANCE;
    private static volatile InterfaceC12124U0 PARSER = null;
    public static final int TICKS_FIELD_NUMBER = 2;
    public static final int UNIX_MICRO_FIELD_NUMBER = 1;
    private int ticks_;
    private long unixMicro_;

    static {
        LivekitModels$TimedVersion livekitModels$TimedVersion = new LivekitModels$TimedVersion();
        DEFAULT_INSTANCE = livekitModels$TimedVersion;
        AbstractC12133Z.registerDefaultInstance(LivekitModels$TimedVersion.class, livekitModels$TimedVersion);
    }

    private LivekitModels$TimedVersion() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTicks() {
        this.ticks_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUnixMicro() {
        this.unixMicro_ = 0L;
    }

    public static LivekitModels$TimedVersion getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C14668U2 newBuilder() {
        return (C14668U2) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitModels$TimedVersion parseDelimitedFrom(InputStream inputStream) {
        return (LivekitModels$TimedVersion) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitModels$TimedVersion parseFrom(ByteBuffer byteBuffer) {
        return (LivekitModels$TimedVersion) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC12124U0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTicks(int i10) {
        this.ticks_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUnixMicro(long j10) {
        this.unixMicro_ = j10;
    }

    @Override // com.google.protobuf.AbstractC12133Z
    public final Object dynamicMethod(EnumC12131Y enumC12131Y, Object obj, Object obj2) {
        switch (enumC12131Y.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AbstractC12133Z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004", new Object[]{"unixMicro_", "ticks_"});
            case 3:
                return new LivekitModels$TimedVersion();
            case 4:
                return new C14668U2(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC12124U0 c12123u = PARSER;
                if (c12123u == null) {
                    synchronized (LivekitModels$TimedVersion.class) {
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

    public int getTicks() {
        return this.ticks_;
    }

    public long getUnixMicro() {
        return this.unixMicro_;
    }

    public static C14668U2 newBuilder(LivekitModels$TimedVersion livekitModels$TimedVersion) {
        return (C14668U2) DEFAULT_INSTANCE.createBuilder(livekitModels$TimedVersion);
    }

    public static LivekitModels$TimedVersion parseDelimitedFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitModels$TimedVersion) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitModels$TimedVersion parseFrom(ByteBuffer byteBuffer, C12087F c12087f) {
        return (LivekitModels$TimedVersion) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer, c12087f);
    }

    public static LivekitModels$TimedVersion parseFrom(AbstractC12171m abstractC12171m) {
        return (LivekitModels$TimedVersion) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m);
    }

    public static LivekitModels$TimedVersion parseFrom(AbstractC12171m abstractC12171m, C12087F c12087f) {
        return (LivekitModels$TimedVersion) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m, c12087f);
    }

    public static LivekitModels$TimedVersion parseFrom(byte[] bArr) {
        return (LivekitModels$TimedVersion) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitModels$TimedVersion parseFrom(byte[] bArr, C12087F c12087f) {
        return (LivekitModels$TimedVersion) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr, c12087f);
    }

    public static LivekitModels$TimedVersion parseFrom(InputStream inputStream) {
        return (LivekitModels$TimedVersion) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitModels$TimedVersion parseFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitModels$TimedVersion) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitModels$TimedVersion parseFrom(AbstractC12186r abstractC12186r) {
        return (LivekitModels$TimedVersion) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r);
    }

    public static LivekitModels$TimedVersion parseFrom(AbstractC12186r abstractC12186r, C12087F c12087f) {
        return (LivekitModels$TimedVersion) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r, c12087f);
    }
}
