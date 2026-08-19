package com.statsig.androidsdk;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p240Jb.InterfaceC4325b;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B%\u0012\u0016\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0019\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0007HÆ\u0003J-\u0010\u000f\u001a\u00020\u00002\u0018\b\u0002\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R&\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, m18067d2 = {"Lcom/statsig/androidsdk/LogEventData;", "", "events", "Ljava/util/ArrayList;", "Lcom/statsig/androidsdk/LogEvent;", "Lkotlin/collections/ArrayList;", "statsigMetadata", "Lcom/statsig/androidsdk/StatsigMetadata;", "(Ljava/util/ArrayList;Lcom/statsig/androidsdk/StatsigMetadata;)V", "getEvents", "()Ljava/util/ArrayList;", "getStatsigMetadata", "()Lcom/statsig/androidsdk/StatsigMetadata;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "build_release"}, m18068k = 1, m18069mv = {1, 5, 1}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final /* data */ class LogEventData {

    @InterfaceC4325b("events")
    private final ArrayList<LogEvent> events;

    @InterfaceC4325b("statsigMetadata")
    private final StatsigMetadata statsigMetadata;

    public LogEventData(ArrayList<LogEvent> events, StatsigMetadata statsigMetadata) {
        AbstractC16544l.m18094g(events, "events");
        AbstractC16544l.m18094g(statsigMetadata, "statsigMetadata");
        this.events = events;
        this.statsigMetadata = statsigMetadata;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LogEventData copy$default(LogEventData logEventData, ArrayList arrayList, StatsigMetadata statsigMetadata, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            arrayList = logEventData.events;
        }
        if ((i10 & 2) != 0) {
            statsigMetadata = logEventData.statsigMetadata;
        }
        return logEventData.copy(arrayList, statsigMetadata);
    }

    public final ArrayList<LogEvent> component1() {
        return this.events;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final StatsigMetadata getStatsigMetadata() {
        return this.statsigMetadata;
    }

    public final LogEventData copy(ArrayList<LogEvent> events, StatsigMetadata statsigMetadata) {
        AbstractC16544l.m18094g(events, "events");
        AbstractC16544l.m18094g(statsigMetadata, "statsigMetadata");
        return new LogEventData(events, statsigMetadata);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LogEventData)) {
            return false;
        }
        LogEventData logEventData = (LogEventData) other;
        return AbstractC16544l.m18089b(this.events, logEventData.events) && AbstractC16544l.m18089b(this.statsigMetadata, logEventData.statsigMetadata);
    }

    public final ArrayList<LogEvent> getEvents() {
        return this.events;
    }

    public final StatsigMetadata getStatsigMetadata() {
        return this.statsigMetadata;
    }

    public int hashCode() {
        return this.statsigMetadata.hashCode() + (this.events.hashCode() * 31);
    }

    public String toString() {
        return "LogEventData(events=" + this.events + ", statsigMetadata=" + this.statsigMetadata + ')';
    }
}
