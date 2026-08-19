package livekit;

import com.google.protobuf.AbstractC12133Z;
import com.google.protobuf.AbstractC12138b;
import com.google.protobuf.AbstractC12141c;
import com.google.protobuf.AbstractC12171m;
import com.google.protobuf.AbstractC12186r;
import com.google.protobuf.C12087F;
import com.google.protobuf.C12123U;
import com.google.protobuf.EnumC12131Y;
import com.google.protobuf.InterfaceC12094H0;
import com.google.protobuf.InterfaceC12124U0;
import com.google.protobuf.InterfaceC12172m0;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import p793ho.C14659T;
import p793ho.InterfaceC14653S;

/* JADX INFO: loaded from: classes2.dex */
public final class LivekitAnalytics$AnalyticsStats extends AbstractC12133Z implements InterfaceC12094H0 {
    private static final LivekitAnalytics$AnalyticsStats DEFAULT_INSTANCE;
    private static volatile InterfaceC12124U0 PARSER = null;
    public static final int STATS_FIELD_NUMBER = 1;
    private InterfaceC12172m0 stats_ = AbstractC12133Z.emptyProtobufList();

    static {
        LivekitAnalytics$AnalyticsStats livekitAnalytics$AnalyticsStats = new LivekitAnalytics$AnalyticsStats();
        DEFAULT_INSTANCE = livekitAnalytics$AnalyticsStats;
        AbstractC12133Z.registerDefaultInstance(LivekitAnalytics$AnalyticsStats.class, livekitAnalytics$AnalyticsStats);
    }

    private LivekitAnalytics$AnalyticsStats() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllStats(Iterable<? extends LivekitAnalytics$AnalyticsStat> iterable) {
        ensureStatsIsMutable();
        AbstractC12138b.addAll((Iterable) iterable, (List) this.stats_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addStats(LivekitAnalytics$AnalyticsStat livekitAnalytics$AnalyticsStat) {
        livekitAnalytics$AnalyticsStat.getClass();
        ensureStatsIsMutable();
        this.stats_.add(livekitAnalytics$AnalyticsStat);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStats() {
        this.stats_ = AbstractC12133Z.emptyProtobufList();
    }

    private void ensureStatsIsMutable() {
        InterfaceC12172m0 interfaceC12172m0 = this.stats_;
        if (((AbstractC12141c) interfaceC12172m0).f37021Y) {
            return;
        }
        this.stats_ = AbstractC12133Z.mutableCopy(interfaceC12172m0);
    }

    public static LivekitAnalytics$AnalyticsStats getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C14659T newBuilder() {
        return (C14659T) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitAnalytics$AnalyticsStats parseDelimitedFrom(InputStream inputStream) {
        return (LivekitAnalytics$AnalyticsStats) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitAnalytics$AnalyticsStats parseFrom(ByteBuffer byteBuffer) {
        return (LivekitAnalytics$AnalyticsStats) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC12124U0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeStats(int i10) {
        ensureStatsIsMutable();
        this.stats_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStats(int i10, LivekitAnalytics$AnalyticsStat livekitAnalytics$AnalyticsStat) {
        livekitAnalytics$AnalyticsStat.getClass();
        ensureStatsIsMutable();
        this.stats_.set(i10, livekitAnalytics$AnalyticsStat);
    }

    @Override // com.google.protobuf.AbstractC12133Z
    public final Object dynamicMethod(EnumC12131Y enumC12131Y, Object obj, Object obj2) {
        switch (enumC12131Y.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AbstractC12133Z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"stats_", LivekitAnalytics$AnalyticsStat.class});
            case 3:
                return new LivekitAnalytics$AnalyticsStats();
            case 4:
                return new C14659T(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC12124U0 c12123u = PARSER;
                if (c12123u == null) {
                    synchronized (LivekitAnalytics$AnalyticsStats.class) {
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

    public LivekitAnalytics$AnalyticsStat getStats(int i10) {
        return (LivekitAnalytics$AnalyticsStat) this.stats_.get(i10);
    }

    public int getStatsCount() {
        return this.stats_.size();
    }

    public List<LivekitAnalytics$AnalyticsStat> getStatsList() {
        return this.stats_;
    }

    public InterfaceC14653S getStatsOrBuilder(int i10) {
        return (InterfaceC14653S) this.stats_.get(i10);
    }

    public List<? extends InterfaceC14653S> getStatsOrBuilderList() {
        return this.stats_;
    }

    public static C14659T newBuilder(LivekitAnalytics$AnalyticsStats livekitAnalytics$AnalyticsStats) {
        return (C14659T) DEFAULT_INSTANCE.createBuilder(livekitAnalytics$AnalyticsStats);
    }

    public static LivekitAnalytics$AnalyticsStats parseDelimitedFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitAnalytics$AnalyticsStats) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitAnalytics$AnalyticsStats parseFrom(ByteBuffer byteBuffer, C12087F c12087f) {
        return (LivekitAnalytics$AnalyticsStats) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer, c12087f);
    }

    public static LivekitAnalytics$AnalyticsStats parseFrom(AbstractC12171m abstractC12171m) {
        return (LivekitAnalytics$AnalyticsStats) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addStats(int i10, LivekitAnalytics$AnalyticsStat livekitAnalytics$AnalyticsStat) {
        livekitAnalytics$AnalyticsStat.getClass();
        ensureStatsIsMutable();
        this.stats_.add(i10, livekitAnalytics$AnalyticsStat);
    }

    public static LivekitAnalytics$AnalyticsStats parseFrom(AbstractC12171m abstractC12171m, C12087F c12087f) {
        return (LivekitAnalytics$AnalyticsStats) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m, c12087f);
    }

    public static LivekitAnalytics$AnalyticsStats parseFrom(byte[] bArr) {
        return (LivekitAnalytics$AnalyticsStats) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitAnalytics$AnalyticsStats parseFrom(byte[] bArr, C12087F c12087f) {
        return (LivekitAnalytics$AnalyticsStats) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr, c12087f);
    }

    public static LivekitAnalytics$AnalyticsStats parseFrom(InputStream inputStream) {
        return (LivekitAnalytics$AnalyticsStats) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitAnalytics$AnalyticsStats parseFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitAnalytics$AnalyticsStats) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitAnalytics$AnalyticsStats parseFrom(AbstractC12186r abstractC12186r) {
        return (LivekitAnalytics$AnalyticsStats) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r);
    }

    public static LivekitAnalytics$AnalyticsStats parseFrom(AbstractC12186r abstractC12186r, C12087F c12087f) {
        return (LivekitAnalytics$AnalyticsStats) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r, c12087f);
    }
}
