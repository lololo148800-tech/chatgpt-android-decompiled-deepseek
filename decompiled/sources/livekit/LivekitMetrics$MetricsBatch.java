package livekit;

import com.google.protobuf.AbstractC12133Z;
import com.google.protobuf.AbstractC12138b;
import com.google.protobuf.AbstractC12141c;
import com.google.protobuf.AbstractC12171m;
import com.google.protobuf.AbstractC12186r;
import com.google.protobuf.C12087F;
import com.google.protobuf.C12123U;
import com.google.protobuf.C12167k1;
import com.google.protobuf.EnumC12131Y;
import com.google.protobuf.InterfaceC12094H0;
import com.google.protobuf.InterfaceC12124U0;
import com.google.protobuf.InterfaceC12172m0;
import com.google.protobuf.Timestamp;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import p793ho.C14649R1;
import p793ho.InterfaceC14626N1;
import p793ho.InterfaceC14661T1;

/* JADX INFO: loaded from: classes2.dex */
public final class LivekitMetrics$MetricsBatch extends AbstractC12133Z implements InterfaceC12094H0 {
    private static final LivekitMetrics$MetricsBatch DEFAULT_INSTANCE;
    public static final int EVENTS_FIELD_NUMBER = 5;
    public static final int NORMALIZED_TIMESTAMP_FIELD_NUMBER = 2;
    private static volatile InterfaceC12124U0 PARSER = null;
    public static final int STR_DATA_FIELD_NUMBER = 3;
    public static final int TIMESTAMP_MS_FIELD_NUMBER = 1;
    public static final int TIME_SERIES_FIELD_NUMBER = 4;
    private Timestamp normalizedTimestamp_;
    private long timestampMs_;
    private InterfaceC12172m0 strData_ = AbstractC12133Z.emptyProtobufList();
    private InterfaceC12172m0 timeSeries_ = AbstractC12133Z.emptyProtobufList();
    private InterfaceC12172m0 events_ = AbstractC12133Z.emptyProtobufList();

    static {
        LivekitMetrics$MetricsBatch livekitMetrics$MetricsBatch = new LivekitMetrics$MetricsBatch();
        DEFAULT_INSTANCE = livekitMetrics$MetricsBatch;
        AbstractC12133Z.registerDefaultInstance(LivekitMetrics$MetricsBatch.class, livekitMetrics$MetricsBatch);
    }

    private LivekitMetrics$MetricsBatch() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllEvents(Iterable<? extends LivekitMetrics$EventMetric> iterable) {
        ensureEventsIsMutable();
        AbstractC12138b.addAll((Iterable) iterable, (List) this.events_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllStrData(Iterable<String> iterable) {
        ensureStrDataIsMutable();
        AbstractC12138b.addAll((Iterable) iterable, (List) this.strData_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllTimeSeries(Iterable<? extends LivekitMetrics$TimeSeriesMetric> iterable) {
        ensureTimeSeriesIsMutable();
        AbstractC12138b.addAll((Iterable) iterable, (List) this.timeSeries_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addEvents(LivekitMetrics$EventMetric livekitMetrics$EventMetric) {
        livekitMetrics$EventMetric.getClass();
        ensureEventsIsMutable();
        this.events_.add(livekitMetrics$EventMetric);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addStrData(String str) {
        str.getClass();
        ensureStrDataIsMutable();
        this.strData_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addStrDataBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        ensureStrDataIsMutable();
        this.strData_.add(abstractC12171m.m14012w());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addTimeSeries(LivekitMetrics$TimeSeriesMetric livekitMetrics$TimeSeriesMetric) {
        livekitMetrics$TimeSeriesMetric.getClass();
        ensureTimeSeriesIsMutable();
        this.timeSeries_.add(livekitMetrics$TimeSeriesMetric);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEvents() {
        this.events_ = AbstractC12133Z.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNormalizedTimestamp() {
        this.normalizedTimestamp_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStrData() {
        this.strData_ = AbstractC12133Z.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimeSeries() {
        this.timeSeries_ = AbstractC12133Z.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimestampMs() {
        this.timestampMs_ = 0L;
    }

    private void ensureEventsIsMutable() {
        InterfaceC12172m0 interfaceC12172m0 = this.events_;
        if (((AbstractC12141c) interfaceC12172m0).f37021Y) {
            return;
        }
        this.events_ = AbstractC12133Z.mutableCopy(interfaceC12172m0);
    }

    private void ensureStrDataIsMutable() {
        InterfaceC12172m0 interfaceC12172m0 = this.strData_;
        if (((AbstractC12141c) interfaceC12172m0).f37021Y) {
            return;
        }
        this.strData_ = AbstractC12133Z.mutableCopy(interfaceC12172m0);
    }

    private void ensureTimeSeriesIsMutable() {
        InterfaceC12172m0 interfaceC12172m0 = this.timeSeries_;
        if (((AbstractC12141c) interfaceC12172m0).f37021Y) {
            return;
        }
        this.timeSeries_ = AbstractC12133Z.mutableCopy(interfaceC12172m0);
    }

    public static LivekitMetrics$MetricsBatch getDefaultInstance() {
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

    public static C14649R1 newBuilder() {
        return (C14649R1) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitMetrics$MetricsBatch parseDelimitedFrom(InputStream inputStream) {
        return (LivekitMetrics$MetricsBatch) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitMetrics$MetricsBatch parseFrom(ByteBuffer byteBuffer) {
        return (LivekitMetrics$MetricsBatch) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC12124U0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeEvents(int i10) {
        ensureEventsIsMutable();
        this.events_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeTimeSeries(int i10) {
        ensureTimeSeriesIsMutable();
        this.timeSeries_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEvents(int i10, LivekitMetrics$EventMetric livekitMetrics$EventMetric) {
        livekitMetrics$EventMetric.getClass();
        ensureEventsIsMutable();
        this.events_.set(i10, livekitMetrics$EventMetric);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNormalizedTimestamp(Timestamp timestamp) {
        timestamp.getClass();
        this.normalizedTimestamp_ = timestamp;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStrData(int i10, String str) {
        str.getClass();
        ensureStrDataIsMutable();
        this.strData_.set(i10, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimeSeries(int i10, LivekitMetrics$TimeSeriesMetric livekitMetrics$TimeSeriesMetric) {
        livekitMetrics$TimeSeriesMetric.getClass();
        ensureTimeSeriesIsMutable();
        this.timeSeries_.set(i10, livekitMetrics$TimeSeriesMetric);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimestampMs(long j10) {
        this.timestampMs_ = j10;
    }

    @Override // com.google.protobuf.AbstractC12133Z
    public final Object dynamicMethod(EnumC12131Y enumC12131Y, Object obj, Object obj2) {
        switch (enumC12131Y.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AbstractC12133Z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0003\u0000\u0001\u0002\u0002\t\u0003Ț\u0004\u001b\u0005\u001b", new Object[]{"timestampMs_", "normalizedTimestamp_", "strData_", "timeSeries_", LivekitMetrics$TimeSeriesMetric.class, "events_", LivekitMetrics$EventMetric.class});
            case 3:
                return new LivekitMetrics$MetricsBatch();
            case 4:
                return new C14649R1(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC12124U0 c12123u = PARSER;
                if (c12123u == null) {
                    synchronized (LivekitMetrics$MetricsBatch.class) {
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

    public LivekitMetrics$EventMetric getEvents(int i10) {
        return (LivekitMetrics$EventMetric) this.events_.get(i10);
    }

    public int getEventsCount() {
        return this.events_.size();
    }

    public List<LivekitMetrics$EventMetric> getEventsList() {
        return this.events_;
    }

    public InterfaceC14626N1 getEventsOrBuilder(int i10) {
        return (InterfaceC14626N1) this.events_.get(i10);
    }

    public List<? extends InterfaceC14626N1> getEventsOrBuilderList() {
        return this.events_;
    }

    public Timestamp getNormalizedTimestamp() {
        Timestamp timestamp = this.normalizedTimestamp_;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    public String getStrData(int i10) {
        return (String) this.strData_.get(i10);
    }

    public AbstractC12171m getStrDataBytes(int i10) {
        return AbstractC12171m.m14011m((String) this.strData_.get(i10));
    }

    public int getStrDataCount() {
        return this.strData_.size();
    }

    public List<String> getStrDataList() {
        return this.strData_;
    }

    public LivekitMetrics$TimeSeriesMetric getTimeSeries(int i10) {
        return (LivekitMetrics$TimeSeriesMetric) this.timeSeries_.get(i10);
    }

    public int getTimeSeriesCount() {
        return this.timeSeries_.size();
    }

    public List<LivekitMetrics$TimeSeriesMetric> getTimeSeriesList() {
        return this.timeSeries_;
    }

    public InterfaceC14661T1 getTimeSeriesOrBuilder(int i10) {
        return (InterfaceC14661T1) this.timeSeries_.get(i10);
    }

    public List<? extends InterfaceC14661T1> getTimeSeriesOrBuilderList() {
        return this.timeSeries_;
    }

    public long getTimestampMs() {
        return this.timestampMs_;
    }

    public boolean hasNormalizedTimestamp() {
        return this.normalizedTimestamp_ != null;
    }

    public static C14649R1 newBuilder(LivekitMetrics$MetricsBatch livekitMetrics$MetricsBatch) {
        return (C14649R1) DEFAULT_INSTANCE.createBuilder(livekitMetrics$MetricsBatch);
    }

    public static LivekitMetrics$MetricsBatch parseDelimitedFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitMetrics$MetricsBatch) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitMetrics$MetricsBatch parseFrom(ByteBuffer byteBuffer, C12087F c12087f) {
        return (LivekitMetrics$MetricsBatch) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer, c12087f);
    }

    public static LivekitMetrics$MetricsBatch parseFrom(AbstractC12171m abstractC12171m) {
        return (LivekitMetrics$MetricsBatch) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addEvents(int i10, LivekitMetrics$EventMetric livekitMetrics$EventMetric) {
        livekitMetrics$EventMetric.getClass();
        ensureEventsIsMutable();
        this.events_.add(i10, livekitMetrics$EventMetric);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addTimeSeries(int i10, LivekitMetrics$TimeSeriesMetric livekitMetrics$TimeSeriesMetric) {
        livekitMetrics$TimeSeriesMetric.getClass();
        ensureTimeSeriesIsMutable();
        this.timeSeries_.add(i10, livekitMetrics$TimeSeriesMetric);
    }

    public static LivekitMetrics$MetricsBatch parseFrom(AbstractC12171m abstractC12171m, C12087F c12087f) {
        return (LivekitMetrics$MetricsBatch) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m, c12087f);
    }

    public static LivekitMetrics$MetricsBatch parseFrom(byte[] bArr) {
        return (LivekitMetrics$MetricsBatch) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitMetrics$MetricsBatch parseFrom(byte[] bArr, C12087F c12087f) {
        return (LivekitMetrics$MetricsBatch) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr, c12087f);
    }

    public static LivekitMetrics$MetricsBatch parseFrom(InputStream inputStream) {
        return (LivekitMetrics$MetricsBatch) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitMetrics$MetricsBatch parseFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitMetrics$MetricsBatch) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitMetrics$MetricsBatch parseFrom(AbstractC12186r abstractC12186r) {
        return (LivekitMetrics$MetricsBatch) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r);
    }

    public static LivekitMetrics$MetricsBatch parseFrom(AbstractC12186r abstractC12186r, C12087F c12087f) {
        return (LivekitMetrics$MetricsBatch) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r, c12087f);
    }
}
