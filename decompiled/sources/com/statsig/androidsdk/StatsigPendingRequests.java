package com.statsig.androidsdk;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p240Jb.InterfaceC4325b;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m18067d2 = {"Lcom/statsig/androidsdk/StatsigPendingRequests;", "", "requests", "", "Lcom/statsig/androidsdk/StatsigOfflineRequest;", "(Ljava/util/List;)V", "getRequests", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "build_release"}, m18068k = 1, m18069mv = {1, 5, 1}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final /* data */ class StatsigPendingRequests {

    @InterfaceC4325b("requests")
    private final List<StatsigOfflineRequest> requests;

    public StatsigPendingRequests(List<StatsigOfflineRequest> requests) {
        AbstractC16544l.m18094g(requests, "requests");
        this.requests = requests;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StatsigPendingRequests copy$default(StatsigPendingRequests statsigPendingRequests, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = statsigPendingRequests.requests;
        }
        return statsigPendingRequests.copy(list);
    }

    public final List<StatsigOfflineRequest> component1() {
        return this.requests;
    }

    public final StatsigPendingRequests copy(List<StatsigOfflineRequest> requests) {
        AbstractC16544l.m18094g(requests, "requests");
        return new StatsigPendingRequests(requests);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof StatsigPendingRequests) && AbstractC16544l.m18089b(this.requests, ((StatsigPendingRequests) other).requests);
    }

    public final List<StatsigOfflineRequest> getRequests() {
        return this.requests;
    }

    public int hashCode() {
        return this.requests.hashCode();
    }

    public String toString() {
        return "StatsigPendingRequests(requests=" + this.requests + ')';
    }
}
