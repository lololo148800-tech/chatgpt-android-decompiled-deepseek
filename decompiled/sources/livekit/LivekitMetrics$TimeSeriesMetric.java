package livekit;

import com.google.protobuf.AbstractC12133Z;
import com.google.protobuf.AbstractC12138b;
import com.google.protobuf.AbstractC12141c;
import com.google.protobuf.AbstractC12171m;
import com.google.protobuf.AbstractC12186r;
import com.google.protobuf.C12087F;
import com.google.protobuf.C12123U;
import com.google.protobuf.EnumC12131Y;
import com.google.protobuf.InterfaceC12124U0;
import com.google.protobuf.InterfaceC12172m0;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import p009A7.FlM.nkFZpTrMPpn;
import p793ho.C14655S1;
import p793ho.InterfaceC14644Q1;
import p793ho.InterfaceC14661T1;

/* JADX INFO: loaded from: classes2.dex */
public final class LivekitMetrics$TimeSeriesMetric extends AbstractC12133Z implements InterfaceC14661T1 {
    private static final LivekitMetrics$TimeSeriesMetric DEFAULT_INSTANCE;
    public static final int LABEL_FIELD_NUMBER = 1;
    private static volatile InterfaceC12124U0 PARSER = null;
    public static final int PARTICIPANT_IDENTITY_FIELD_NUMBER = 2;
    public static final int RID_FIELD_NUMBER = 5;
    public static final int SAMPLES_FIELD_NUMBER = 4;
    public static final int TRACK_SID_FIELD_NUMBER = 3;
    private int label_;
    private int participantIdentity_;
    private int rid_;
    private InterfaceC12172m0 samples_ = AbstractC12133Z.emptyProtobufList();
    private int trackSid_;

    static {
        LivekitMetrics$TimeSeriesMetric livekitMetrics$TimeSeriesMetric = new LivekitMetrics$TimeSeriesMetric();
        DEFAULT_INSTANCE = livekitMetrics$TimeSeriesMetric;
        AbstractC12133Z.registerDefaultInstance(LivekitMetrics$TimeSeriesMetric.class, livekitMetrics$TimeSeriesMetric);
    }

    private LivekitMetrics$TimeSeriesMetric() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllSamples(Iterable<? extends LivekitMetrics$MetricSample> iterable) {
        ensureSamplesIsMutable();
        AbstractC12138b.addAll((Iterable) iterable, (List) this.samples_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSamples(LivekitMetrics$MetricSample livekitMetrics$MetricSample) {
        livekitMetrics$MetricSample.getClass();
        ensureSamplesIsMutable();
        this.samples_.add(livekitMetrics$MetricSample);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLabel() {
        this.label_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearParticipantIdentity() {
        this.participantIdentity_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRid() {
        this.rid_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSamples() {
        this.samples_ = AbstractC12133Z.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTrackSid() {
        this.trackSid_ = 0;
    }

    private void ensureSamplesIsMutable() {
        InterfaceC12172m0 interfaceC12172m0 = this.samples_;
        if (((AbstractC12141c) interfaceC12172m0).f37021Y) {
            return;
        }
        this.samples_ = AbstractC12133Z.mutableCopy(interfaceC12172m0);
    }

    public static LivekitMetrics$TimeSeriesMetric getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C14655S1 newBuilder() {
        return (C14655S1) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitMetrics$TimeSeriesMetric parseDelimitedFrom(InputStream inputStream) {
        return (LivekitMetrics$TimeSeriesMetric) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitMetrics$TimeSeriesMetric parseFrom(ByteBuffer byteBuffer) {
        return (LivekitMetrics$TimeSeriesMetric) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC12124U0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeSamples(int i10) {
        ensureSamplesIsMutable();
        this.samples_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLabel(int i10) {
        this.label_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParticipantIdentity(int i10) {
        this.participantIdentity_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRid(int i10) {
        this.rid_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSamples(int i10, LivekitMetrics$MetricSample livekitMetrics$MetricSample) {
        livekitMetrics$MetricSample.getClass();
        ensureSamplesIsMutable();
        this.samples_.set(i10, livekitMetrics$MetricSample);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTrackSid(int i10) {
        this.trackSid_ = i10;
    }

    @Override // com.google.protobuf.AbstractC12133Z
    public final Object dynamicMethod(EnumC12131Y enumC12131Y, Object obj, Object obj2) {
        switch (enumC12131Y.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AbstractC12133Z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u000b\u0002\u000b\u0003\u000b\u0004\u001b\u0005\u000b", new Object[]{"label_", "participantIdentity_", "trackSid_", nkFZpTrMPpn.eIo, LivekitMetrics$MetricSample.class, "rid_"});
            case 3:
                return new LivekitMetrics$TimeSeriesMetric();
            case 4:
                return new C14655S1(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC12124U0 c12123u = PARSER;
                if (c12123u == null) {
                    synchronized (LivekitMetrics$TimeSeriesMetric.class) {
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

    public int getLabel() {
        return this.label_;
    }

    public int getParticipantIdentity() {
        return this.participantIdentity_;
    }

    public int getRid() {
        return this.rid_;
    }

    public LivekitMetrics$MetricSample getSamples(int i10) {
        return (LivekitMetrics$MetricSample) this.samples_.get(i10);
    }

    public int getSamplesCount() {
        return this.samples_.size();
    }

    public List<LivekitMetrics$MetricSample> getSamplesList() {
        return this.samples_;
    }

    public InterfaceC14644Q1 getSamplesOrBuilder(int i10) {
        return (InterfaceC14644Q1) this.samples_.get(i10);
    }

    public List<? extends InterfaceC14644Q1> getSamplesOrBuilderList() {
        return this.samples_;
    }

    public int getTrackSid() {
        return this.trackSid_;
    }

    public static C14655S1 newBuilder(LivekitMetrics$TimeSeriesMetric livekitMetrics$TimeSeriesMetric) {
        return (C14655S1) DEFAULT_INSTANCE.createBuilder(livekitMetrics$TimeSeriesMetric);
    }

    public static LivekitMetrics$TimeSeriesMetric parseDelimitedFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitMetrics$TimeSeriesMetric) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitMetrics$TimeSeriesMetric parseFrom(ByteBuffer byteBuffer, C12087F c12087f) {
        return (LivekitMetrics$TimeSeriesMetric) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer, c12087f);
    }

    public static LivekitMetrics$TimeSeriesMetric parseFrom(AbstractC12171m abstractC12171m) {
        return (LivekitMetrics$TimeSeriesMetric) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSamples(int i10, LivekitMetrics$MetricSample livekitMetrics$MetricSample) {
        livekitMetrics$MetricSample.getClass();
        ensureSamplesIsMutable();
        this.samples_.add(i10, livekitMetrics$MetricSample);
    }

    public static LivekitMetrics$TimeSeriesMetric parseFrom(AbstractC12171m abstractC12171m, C12087F c12087f) {
        return (LivekitMetrics$TimeSeriesMetric) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m, c12087f);
    }

    public static LivekitMetrics$TimeSeriesMetric parseFrom(byte[] bArr) {
        return (LivekitMetrics$TimeSeriesMetric) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitMetrics$TimeSeriesMetric parseFrom(byte[] bArr, C12087F c12087f) {
        return (LivekitMetrics$TimeSeriesMetric) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr, c12087f);
    }

    public static LivekitMetrics$TimeSeriesMetric parseFrom(InputStream inputStream) {
        return (LivekitMetrics$TimeSeriesMetric) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitMetrics$TimeSeriesMetric parseFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitMetrics$TimeSeriesMetric) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitMetrics$TimeSeriesMetric parseFrom(AbstractC12186r abstractC12186r) {
        return (LivekitMetrics$TimeSeriesMetric) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r);
    }

    public static LivekitMetrics$TimeSeriesMetric parseFrom(AbstractC12186r abstractC12186r, C12087F c12087f) {
        return (LivekitMetrics$TimeSeriesMetric) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r, c12087f);
    }
}
