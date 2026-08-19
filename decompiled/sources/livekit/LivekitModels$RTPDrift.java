package livekit;

import com.google.protobuf.AbstractC12133Z;
import com.google.protobuf.AbstractC12171m;
import com.google.protobuf.AbstractC12186r;
import com.google.protobuf.C12087F;
import com.google.protobuf.C12123U;
import com.google.protobuf.C12167k1;
import com.google.protobuf.EnumC12131Y;
import com.google.protobuf.InterfaceC12094H0;
import com.google.protobuf.InterfaceC12124U0;
import com.google.protobuf.Timestamp;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p793ho.C14872y2;

/* JADX INFO: loaded from: classes2.dex */
public final class LivekitModels$RTPDrift extends AbstractC12133Z implements InterfaceC12094H0 {
    public static final int CLOCK_RATE_FIELD_NUMBER = 9;
    private static final LivekitModels$RTPDrift DEFAULT_INSTANCE;
    public static final int DRIFT_MS_FIELD_NUMBER = 8;
    public static final int DRIFT_SAMPLES_FIELD_NUMBER = 7;
    public static final int DURATION_FIELD_NUMBER = 3;
    public static final int END_TIMESTAMP_FIELD_NUMBER = 5;
    public static final int END_TIME_FIELD_NUMBER = 2;
    private static volatile InterfaceC12124U0 PARSER = null;
    public static final int RTP_CLOCK_TICKS_FIELD_NUMBER = 6;
    public static final int START_TIMESTAMP_FIELD_NUMBER = 4;
    public static final int START_TIME_FIELD_NUMBER = 1;
    private double clockRate_;
    private double driftMs_;
    private long driftSamples_;
    private double duration_;
    private Timestamp endTime_;
    private long endTimestamp_;
    private long rtpClockTicks_;
    private Timestamp startTime_;
    private long startTimestamp_;

    static {
        LivekitModels$RTPDrift livekitModels$RTPDrift = new LivekitModels$RTPDrift();
        DEFAULT_INSTANCE = livekitModels$RTPDrift;
        AbstractC12133Z.registerDefaultInstance(LivekitModels$RTPDrift.class, livekitModels$RTPDrift);
    }

    private LivekitModels$RTPDrift() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClockRate() {
        this.clockRate_ = 0.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDriftMs() {
        this.driftMs_ = 0.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDriftSamples() {
        this.driftSamples_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDuration() {
        this.duration_ = 0.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEndTime() {
        this.endTime_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEndTimestamp() {
        this.endTimestamp_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRtpClockTicks() {
        this.rtpClockTicks_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStartTime() {
        this.startTime_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStartTimestamp() {
        this.startTimestamp_ = 0L;
    }

    public static LivekitModels$RTPDrift getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeEndTime(Timestamp timestamp) {
        timestamp.getClass();
        Timestamp timestamp2 = this.endTime_;
        if (timestamp2 == null || timestamp2 == Timestamp.getDefaultInstance()) {
            this.endTime_ = timestamp;
            return;
        }
        C12167k1 c12167k1NewBuilder = Timestamp.newBuilder(this.endTime_);
        c12167k1NewBuilder.m13865f(timestamp);
        this.endTime_ = (Timestamp) c12167k1NewBuilder.m13862c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeStartTime(Timestamp timestamp) {
        timestamp.getClass();
        Timestamp timestamp2 = this.startTime_;
        if (timestamp2 == null || timestamp2 == Timestamp.getDefaultInstance()) {
            this.startTime_ = timestamp;
            return;
        }
        C12167k1 c12167k1NewBuilder = Timestamp.newBuilder(this.startTime_);
        c12167k1NewBuilder.m13865f(timestamp);
        this.startTime_ = (Timestamp) c12167k1NewBuilder.m13862c();
    }

    public static C14872y2 newBuilder() {
        return (C14872y2) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitModels$RTPDrift parseDelimitedFrom(InputStream inputStream) {
        return (LivekitModels$RTPDrift) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitModels$RTPDrift parseFrom(ByteBuffer byteBuffer) {
        return (LivekitModels$RTPDrift) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC12124U0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClockRate(double d10) {
        this.clockRate_ = d10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDriftMs(double d10) {
        this.driftMs_ = d10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDriftSamples(long j10) {
        this.driftSamples_ = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDuration(double d10) {
        this.duration_ = d10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEndTime(Timestamp timestamp) {
        timestamp.getClass();
        this.endTime_ = timestamp;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEndTimestamp(long j10) {
        this.endTimestamp_ = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRtpClockTicks(long j10) {
        this.rtpClockTicks_ = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStartTime(Timestamp timestamp) {
        timestamp.getClass();
        this.startTime_ = timestamp;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStartTimestamp(long j10) {
        this.startTimestamp_ = j10;
    }

    @Override // com.google.protobuf.AbstractC12133Z
    public final Object dynamicMethod(EnumC12131Y enumC12131Y, Object obj, Object obj2) {
        switch (enumC12131Y.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AbstractC12133Z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0000\u0001\t\t\u0000\u0000\u0000\u0001\t\u0002\t\u0003\u0000\u0004\u0003\u0005\u0003\u0006\u0003\u0007\u0002\b\u0000\t\u0000", new Object[]{"startTime_", "endTime_", "duration_", "startTimestamp_", "endTimestamp_", "rtpClockTicks_", "driftSamples_", "driftMs_", "clockRate_"});
            case 3:
                return new LivekitModels$RTPDrift();
            case 4:
                return new C14872y2(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC12124U0 c12123u = PARSER;
                if (c12123u == null) {
                    synchronized (LivekitModels$RTPDrift.class) {
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

    public double getClockRate() {
        return this.clockRate_;
    }

    public double getDriftMs() {
        return this.driftMs_;
    }

    public long getDriftSamples() {
        return this.driftSamples_;
    }

    public double getDuration() {
        return this.duration_;
    }

    public Timestamp getEndTime() {
        Timestamp timestamp = this.endTime_;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    public long getEndTimestamp() {
        return this.endTimestamp_;
    }

    public long getRtpClockTicks() {
        return this.rtpClockTicks_;
    }

    public Timestamp getStartTime() {
        Timestamp timestamp = this.startTime_;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    public long getStartTimestamp() {
        return this.startTimestamp_;
    }

    public boolean hasEndTime() {
        return this.endTime_ != null;
    }

    public boolean hasStartTime() {
        return this.startTime_ != null;
    }

    public static C14872y2 newBuilder(LivekitModels$RTPDrift livekitModels$RTPDrift) {
        return (C14872y2) DEFAULT_INSTANCE.createBuilder(livekitModels$RTPDrift);
    }

    public static LivekitModels$RTPDrift parseDelimitedFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitModels$RTPDrift) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitModels$RTPDrift parseFrom(ByteBuffer byteBuffer, C12087F c12087f) {
        return (LivekitModels$RTPDrift) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer, c12087f);
    }

    public static LivekitModels$RTPDrift parseFrom(AbstractC12171m abstractC12171m) {
        return (LivekitModels$RTPDrift) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m);
    }

    public static LivekitModels$RTPDrift parseFrom(AbstractC12171m abstractC12171m, C12087F c12087f) {
        return (LivekitModels$RTPDrift) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m, c12087f);
    }

    public static LivekitModels$RTPDrift parseFrom(byte[] bArr) {
        return (LivekitModels$RTPDrift) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitModels$RTPDrift parseFrom(byte[] bArr, C12087F c12087f) {
        return (LivekitModels$RTPDrift) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr, c12087f);
    }

    public static LivekitModels$RTPDrift parseFrom(InputStream inputStream) {
        return (LivekitModels$RTPDrift) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitModels$RTPDrift parseFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitModels$RTPDrift) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitModels$RTPDrift parseFrom(AbstractC12186r abstractC12186r) {
        return (LivekitModels$RTPDrift) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r);
    }

    public static LivekitModels$RTPDrift parseFrom(AbstractC12186r abstractC12186r, C12087F c12087f) {
        return (LivekitModels$RTPDrift) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r, c12087f);
    }
}
