package com.statsig.androidsdk;

import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p240Jb.InterfaceC4325b;
import p571X9.AbstractC9306j0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, m18067d2 = {"Lcom/statsig/androidsdk/StatsigOfflineRequest;", "", DiagnosticsEntry.TIMESTAMP_KEY, "", "requestBody", "", "(JLjava/lang/String;)V", "getRequestBody", "()Ljava/lang/String;", "getTimestamp", "()J", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "build_release"}, m18068k = 1, m18069mv = {1, 5, 1}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final /* data */ class StatsigOfflineRequest {

    @InterfaceC4325b("requestBody")
    private final String requestBody;

    @InterfaceC4325b(DiagnosticsEntry.TIMESTAMP_KEY)
    private final long timestamp;

    public StatsigOfflineRequest(long j10, String requestBody) {
        AbstractC16544l.m18094g(requestBody, "requestBody");
        this.timestamp = j10;
        this.requestBody = requestBody;
    }

    public static /* synthetic */ StatsigOfflineRequest copy$default(StatsigOfflineRequest statsigOfflineRequest, long j10, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = statsigOfflineRequest.timestamp;
        }
        if ((i10 & 2) != 0) {
            str = statsigOfflineRequest.requestBody;
        }
        return statsigOfflineRequest.copy(j10, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getRequestBody() {
        return this.requestBody;
    }

    public final StatsigOfflineRequest copy(long timestamp, String requestBody) {
        AbstractC16544l.m18094g(requestBody, "requestBody");
        return new StatsigOfflineRequest(timestamp, requestBody);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StatsigOfflineRequest)) {
            return false;
        }
        StatsigOfflineRequest statsigOfflineRequest = (StatsigOfflineRequest) other;
        return this.timestamp == statsigOfflineRequest.timestamp && AbstractC16544l.m18089b(this.requestBody, statsigOfflineRequest.requestBody);
    }

    public final String getRequestBody() {
        return this.requestBody;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        long j10 = this.timestamp;
        return this.requestBody.hashCode() + (((int) (j10 ^ (j10 >>> 32))) * 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("StatsigOfflineRequest(timestamp=");
        sb2.append(this.timestamp);
        sb2.append(", requestBody=");
        return AbstractC9306j0.m9892k(sb2, this.requestBody, ')');
    }
}
