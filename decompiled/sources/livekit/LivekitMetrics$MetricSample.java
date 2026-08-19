package livekit;

import com.google.protobuf.AbstractC12133Z;
import com.google.protobuf.AbstractC12171m;
import com.google.protobuf.AbstractC12186r;
import com.google.protobuf.C12087F;
import com.google.protobuf.C12123U;
import com.google.protobuf.C12167k1;
import com.google.protobuf.EnumC12131Y;
import com.google.protobuf.InterfaceC12124U0;
import com.google.protobuf.Timestamp;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p793ho.C14638P1;
import p793ho.InterfaceC14644Q1;

/* JADX INFO: loaded from: classes2.dex */
public final class LivekitMetrics$MetricSample extends AbstractC12133Z implements InterfaceC14644Q1 {
    private static final LivekitMetrics$MetricSample DEFAULT_INSTANCE;
    public static final int NORMALIZED_TIMESTAMP_FIELD_NUMBER = 2;
    private static volatile InterfaceC12124U0 PARSER = null;
    public static final int TIMESTAMP_MS_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 3;
    private Timestamp normalizedTimestamp_;
    private long timestampMs_;
    private float value_;

    static {
        LivekitMetrics$MetricSample livekitMetrics$MetricSample = new LivekitMetrics$MetricSample();
        DEFAULT_INSTANCE = livekitMetrics$MetricSample;
        AbstractC12133Z.registerDefaultInstance(LivekitMetrics$MetricSample.class, livekitMetrics$MetricSample);
    }

    private LivekitMetrics$MetricSample() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNormalizedTimestamp() {
        this.normalizedTimestamp_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimestampMs() {
        this.timestampMs_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValue() {
        this.value_ = 0.0f;
    }

    public static LivekitMetrics$MetricSample getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeNormalizedTimestamp(Timestamp timestamp) {
        timestamp.getClass();
        Timestamp timestamp2 = this.normalizedTimestamp_;
        if (timestamp2 == null || timestamp2 == Timestamp.getDefaultInstance()) {
            this.normalizedTimestamp_ = timestamp;
            return;
        }
        C12167k1 c12167k1NewBuilder = Timestamp.newBuilder(this.normalizedTimestamp_);
        c12167k1NewBuilder.m13865f(timestamp);
        this.normalizedTimestamp_ = (Timestamp) c12167k1NewBuilder.m13862c();
    }

    public static C14638P1 newBuilder() {
        return (C14638P1) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitMetrics$MetricSample parseDelimitedFrom(InputStream inputStream) {
        return (LivekitMetrics$MetricSample) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitMetrics$MetricSample parseFrom(ByteBuffer byteBuffer) {
        return (LivekitMetrics$MetricSample) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC12124U0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNormalizedTimestamp(Timestamp timestamp) {
        timestamp.getClass();
        this.normalizedTimestamp_ = timestamp;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimestampMs(long j10) {
        this.timestampMs_ = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValue(float f10) {
        this.value_ = f10;
    }

    @Override // com.google.protobuf.AbstractC12133Z
    public final Object dynamicMethod(EnumC12131Y enumC12131Y, Object obj, Object obj2) {
        switch (enumC12131Y.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AbstractC12133Z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0002\u0002\t\u0003\u0001", new Object[]{"timestampMs_", "normalizedTimestamp_", "value_"});
            case 3:
                return new LivekitMetrics$MetricSample();
            case 4:
                return new C14638P1(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC12124U0 c12123u = PARSER;
                if (c12123u == null) {
                    synchronized (LivekitMetrics$MetricSample.class) {
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

    public Timestamp getNormalizedTimestamp() {
        Timestamp timestamp = this.normalizedTimestamp_;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    public long getTimestampMs() {
        return this.timestampMs_;
    }

    public float getValue() {
        return this.value_;
    }

    public boolean hasNormalizedTimestamp() {
        return this.normalizedTimestamp_ != null;
    }

    public static C14638P1 newBuilder(LivekitMetrics$MetricSample livekitMetrics$MetricSample) {
        return (C14638P1) DEFAULT_INSTANCE.createBuilder(livekitMetrics$MetricSample);
    }

    public static LivekitMetrics$MetricSample parseDelimitedFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitMetrics$MetricSample) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitMetrics$MetricSample parseFrom(ByteBuffer byteBuffer, C12087F c12087f) {
        return (LivekitMetrics$MetricSample) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer, c12087f);
    }

    public static LivekitMetrics$MetricSample parseFrom(AbstractC12171m abstractC12171m) {
        return (LivekitMetrics$MetricSample) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m);
    }

    public static LivekitMetrics$MetricSample parseFrom(AbstractC12171m abstractC12171m, C12087F c12087f) {
        return (LivekitMetrics$MetricSample) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m, c12087f);
    }

    public static LivekitMetrics$MetricSample parseFrom(byte[] bArr) {
        return (LivekitMetrics$MetricSample) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitMetrics$MetricSample parseFrom(byte[] bArr, C12087F c12087f) {
        return (LivekitMetrics$MetricSample) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr, c12087f);
    }

    public static LivekitMetrics$MetricSample parseFrom(InputStream inputStream) {
        return (LivekitMetrics$MetricSample) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitMetrics$MetricSample parseFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitMetrics$MetricSample) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitMetrics$MetricSample parseFrom(AbstractC12186r abstractC12186r) {
        return (LivekitMetrics$MetricSample) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r);
    }

    public static LivekitMetrics$MetricSample parseFrom(AbstractC12186r abstractC12186r, C12087F c12087f) {
        return (LivekitMetrics$MetricSample) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r, c12087f);
    }
}
