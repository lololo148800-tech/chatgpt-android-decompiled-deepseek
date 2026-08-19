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
import p793ho.C14851v2;

/* JADX INFO: loaded from: classes2.dex */
public final class LivekitModels$PlayoutDelay extends AbstractC12133Z implements InterfaceC12094H0 {
    private static final LivekitModels$PlayoutDelay DEFAULT_INSTANCE;
    public static final int ENABLED_FIELD_NUMBER = 1;
    public static final int MAX_FIELD_NUMBER = 3;
    public static final int MIN_FIELD_NUMBER = 2;
    private static volatile InterfaceC12124U0 PARSER;
    private boolean enabled_;
    private int max_;
    private int min_;

    static {
        LivekitModels$PlayoutDelay livekitModels$PlayoutDelay = new LivekitModels$PlayoutDelay();
        DEFAULT_INSTANCE = livekitModels$PlayoutDelay;
        AbstractC12133Z.registerDefaultInstance(LivekitModels$PlayoutDelay.class, livekitModels$PlayoutDelay);
    }

    private LivekitModels$PlayoutDelay() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEnabled() {
        this.enabled_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMax() {
        this.max_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMin() {
        this.min_ = 0;
    }

    public static LivekitModels$PlayoutDelay getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C14851v2 newBuilder() {
        return (C14851v2) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitModels$PlayoutDelay parseDelimitedFrom(InputStream inputStream) {
        return (LivekitModels$PlayoutDelay) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitModels$PlayoutDelay parseFrom(ByteBuffer byteBuffer) {
        return (LivekitModels$PlayoutDelay) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC12124U0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEnabled(boolean z6) {
        this.enabled_ = z6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMax(int i10) {
        this.max_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMin(int i10) {
        this.min_ = i10;
    }

    @Override // com.google.protobuf.AbstractC12133Z
    public final Object dynamicMethod(EnumC12131Y enumC12131Y, Object obj, Object obj2) {
        switch (enumC12131Y.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AbstractC12133Z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0007\u0002\u000b\u0003\u000b", new Object[]{"enabled_", "min_", "max_"});
            case 3:
                return new LivekitModels$PlayoutDelay();
            case 4:
                return new C14851v2(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC12124U0 c12123u = PARSER;
                if (c12123u == null) {
                    synchronized (LivekitModels$PlayoutDelay.class) {
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

    public boolean getEnabled() {
        return this.enabled_;
    }

    public int getMax() {
        return this.max_;
    }

    public int getMin() {
        return this.min_;
    }

    public static C14851v2 newBuilder(LivekitModels$PlayoutDelay livekitModels$PlayoutDelay) {
        return (C14851v2) DEFAULT_INSTANCE.createBuilder(livekitModels$PlayoutDelay);
    }

    public static LivekitModels$PlayoutDelay parseDelimitedFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitModels$PlayoutDelay) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitModels$PlayoutDelay parseFrom(ByteBuffer byteBuffer, C12087F c12087f) {
        return (LivekitModels$PlayoutDelay) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer, c12087f);
    }

    public static LivekitModels$PlayoutDelay parseFrom(AbstractC12171m abstractC12171m) {
        return (LivekitModels$PlayoutDelay) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m);
    }

    public static LivekitModels$PlayoutDelay parseFrom(AbstractC12171m abstractC12171m, C12087F c12087f) {
        return (LivekitModels$PlayoutDelay) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m, c12087f);
    }

    public static LivekitModels$PlayoutDelay parseFrom(byte[] bArr) {
        return (LivekitModels$PlayoutDelay) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitModels$PlayoutDelay parseFrom(byte[] bArr, C12087F c12087f) {
        return (LivekitModels$PlayoutDelay) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr, c12087f);
    }

    public static LivekitModels$PlayoutDelay parseFrom(InputStream inputStream) {
        return (LivekitModels$PlayoutDelay) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitModels$PlayoutDelay parseFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitModels$PlayoutDelay) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitModels$PlayoutDelay parseFrom(AbstractC12186r abstractC12186r) {
        return (LivekitModels$PlayoutDelay) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r);
    }

    public static LivekitModels$PlayoutDelay parseFrom(AbstractC12186r abstractC12186r, C12087F c12087f) {
        return (LivekitModels$PlayoutDelay) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r, c12087f);
    }
}
