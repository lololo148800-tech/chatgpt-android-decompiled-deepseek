package com.statsig.androidsdk;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p240Jb.InterfaceC4325b;
import p571X9.AbstractC9306j0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\u0013\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020,HÖ\u0001J\t\u0010-\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R.\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR4\u0010\r\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\b\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R.\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\n\"\u0004\b\u0016\u0010\fR\u0016\u0010\u0017\u001a\u00020\u00188\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR*\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c8\u0006@FX\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R \u0010\u001b\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%¨\u0006."}, m18067d2 = {"Lcom/statsig/androidsdk/LogEvent;", "", "eventName", "", "(Ljava/lang/String;)V", "getEventName", "()Ljava/lang/String;", "metadata", "", "getMetadata", "()Ljava/util/Map;", "setMetadata", "(Ljava/util/Map;)V", "secondaryExposures", "", "getSecondaryExposures", "()[Ljava/util/Map;", "setSecondaryExposures", "([Ljava/util/Map;)V", "[Ljava/util/Map;", "statsigMetadata", "getStatsigMetadata", "setStatsigMetadata", "time", "", "getTime", "()J", "value", "Lcom/statsig/androidsdk/StatsigUser;", "user", "getUser", "()Lcom/statsig/androidsdk/StatsigUser;", "setUser", "(Lcom/statsig/androidsdk/StatsigUser;)V", "getValue", "()Ljava/lang/Object;", "setValue", "(Ljava/lang/Object;)V", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "build_release"}, m18068k = 1, m18069mv = {1, 5, 1}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final /* data */ class LogEvent {

    @InterfaceC4325b("eventName")
    private final String eventName;

    @InterfaceC4325b("metadata")
    private Map<String, String> metadata;

    @InterfaceC4325b("secondaryExposures")
    private Map<String, String>[] secondaryExposures;

    @InterfaceC4325b("statsigMetadata")
    private Map<String, String> statsigMetadata;

    @InterfaceC4325b("time")
    private final long time;

    @InterfaceC4325b("user")
    private StatsigUser user;

    @InterfaceC4325b("value")
    private Object value;

    public LogEvent(String eventName) {
        AbstractC16544l.m18094g(eventName, "eventName");
        this.eventName = eventName;
        this.time = System.currentTimeMillis();
    }

    public static /* synthetic */ LogEvent copy$default(LogEvent logEvent, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = logEvent.eventName;
        }
        return logEvent.copy(str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getEventName() {
        return this.eventName;
    }

    public final LogEvent copy(String eventName) {
        AbstractC16544l.m18094g(eventName, "eventName");
        return new LogEvent(eventName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof LogEvent) && AbstractC16544l.m18089b(this.eventName, ((LogEvent) other).eventName);
    }

    public final String getEventName() {
        return this.eventName;
    }

    public final Map<String, String> getMetadata() {
        return this.metadata;
    }

    public final Map<String, String>[] getSecondaryExposures() {
        return this.secondaryExposures;
    }

    public final Map<String, String> getStatsigMetadata() {
        return this.statsigMetadata;
    }

    public final long getTime() {
        return this.time;
    }

    public final StatsigUser getUser() {
        return this.user;
    }

    public final Object getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.eventName.hashCode();
    }

    public final void setMetadata(Map<String, String> map) {
        this.metadata = map;
    }

    public final void setSecondaryExposures(Map<String, String>[] mapArr) {
        this.secondaryExposures = mapArr;
    }

    public final void setStatsigMetadata(Map<String, String> map) {
        this.statsigMetadata = map;
    }

    public final void setUser(StatsigUser statsigUser) {
        this.user = statsigUser == null ? null : statsigUser.getCopyForLogging$build_release();
    }

    public final void setValue(Object obj) {
        this.value = obj;
    }

    public String toString() {
        return AbstractC9306j0.m9892k(new StringBuilder("LogEvent(eventName="), this.eventName, ')');
    }
}
