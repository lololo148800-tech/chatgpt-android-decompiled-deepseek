package com.statsig.androidsdk;

import androidx.fragment.app.OwC.wNrQXvwLiB;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import livekit.LivekitInternal$NodeStats;
import p003A1.AbstractC0168G;
import p240Jb.InterfaceC4325b;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0083\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\fJ8\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010!J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020\u0007HÖ\u0001R\"\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006("}, m18067d2 = {"Lcom/statsig/androidsdk/Cache;", "", "values", "Lcom/statsig/androidsdk/InitializeResponse$SuccessfulInitializeResponse;", "stickyUserExperiments", "Lcom/statsig/androidsdk/StickyUserExperiments;", "userHash", "", "evaluationTime", "", "(Lcom/statsig/androidsdk/InitializeResponse$SuccessfulInitializeResponse;Lcom/statsig/androidsdk/StickyUserExperiments;Ljava/lang/String;Ljava/lang/Long;)V", "getEvaluationTime", "()Ljava/lang/Long;", "setEvaluationTime", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getStickyUserExperiments", "()Lcom/statsig/androidsdk/StickyUserExperiments;", "setStickyUserExperiments", "(Lcom/statsig/androidsdk/StickyUserExperiments;)V", "getUserHash", "()Ljava/lang/String;", "setUserHash", "(Ljava/lang/String;)V", "getValues", "()Lcom/statsig/androidsdk/InitializeResponse$SuccessfulInitializeResponse;", "setValues", "(Lcom/statsig/androidsdk/InitializeResponse$SuccessfulInitializeResponse;)V", "component1", "component2", "component3", "component4", "copy", "(Lcom/statsig/androidsdk/InitializeResponse$SuccessfulInitializeResponse;Lcom/statsig/androidsdk/StickyUserExperiments;Ljava/lang/String;Ljava/lang/Long;)Lcom/statsig/androidsdk/Cache;", "equals", "", "other", "hashCode", "", "toString", "build_release"}, m18068k = 1, m18069mv = {1, 5, 1}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
final /* data */ class Cache {

    @InterfaceC4325b("evaluationTime")
    private Long evaluationTime;

    @InterfaceC4325b("stickyUserExperiments")
    private StickyUserExperiments stickyUserExperiments;

    @InterfaceC4325b("userHash")
    private String userHash;

    @InterfaceC4325b("values")
    private InitializeResponse.SuccessfulInitializeResponse values;

    public Cache(InitializeResponse.SuccessfulInitializeResponse values, StickyUserExperiments stickyUserExperiments, String userHash, Long l4) {
        AbstractC16544l.m18094g(values, "values");
        AbstractC16544l.m18094g(stickyUserExperiments, "stickyUserExperiments");
        AbstractC16544l.m18094g(userHash, "userHash");
        this.values = values;
        this.stickyUserExperiments = stickyUserExperiments;
        this.userHash = userHash;
        this.evaluationTime = l4;
    }

    public static /* synthetic */ Cache copy$default(Cache cache, InitializeResponse.SuccessfulInitializeResponse successfulInitializeResponse, StickyUserExperiments stickyUserExperiments, String str, Long l4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            successfulInitializeResponse = cache.values;
        }
        if ((i10 & 2) != 0) {
            stickyUserExperiments = cache.stickyUserExperiments;
        }
        if ((i10 & 4) != 0) {
            str = cache.userHash;
        }
        if ((i10 & 8) != 0) {
            l4 = cache.evaluationTime;
        }
        return cache.copy(successfulInitializeResponse, stickyUserExperiments, str, l4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final InitializeResponse.SuccessfulInitializeResponse getValues() {
        return this.values;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final StickyUserExperiments getStickyUserExperiments() {
        return this.stickyUserExperiments;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getUserHash() {
        return this.userHash;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Long getEvaluationTime() {
        return this.evaluationTime;
    }

    public final Cache copy(InitializeResponse.SuccessfulInitializeResponse values, StickyUserExperiments stickyUserExperiments, String userHash, Long evaluationTime) {
        AbstractC16544l.m18094g(values, "values");
        AbstractC16544l.m18094g(stickyUserExperiments, "stickyUserExperiments");
        AbstractC16544l.m18094g(userHash, wNrQXvwLiB.uwWzEIsME);
        return new Cache(values, stickyUserExperiments, userHash, evaluationTime);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Cache)) {
            return false;
        }
        Cache cache = (Cache) other;
        return AbstractC16544l.m18089b(this.values, cache.values) && AbstractC16544l.m18089b(this.stickyUserExperiments, cache.stickyUserExperiments) && AbstractC16544l.m18089b(this.userHash, cache.userHash) && AbstractC16544l.m18089b(this.evaluationTime, cache.evaluationTime);
    }

    public final Long getEvaluationTime() {
        return this.evaluationTime;
    }

    public final StickyUserExperiments getStickyUserExperiments() {
        return this.stickyUserExperiments;
    }

    public final String getUserHash() {
        return this.userHash;
    }

    public final InitializeResponse.SuccessfulInitializeResponse getValues() {
        return this.values;
    }

    public int hashCode() {
        int iM527p = AbstractC0168G.m527p(((this.values.hashCode() * 31) + this.stickyUserExperiments.hashCode()) * 31, 31, this.userHash);
        Long l4 = this.evaluationTime;
        return iM527p + (l4 == null ? 0 : l4.hashCode());
    }

    public final void setEvaluationTime(Long l4) {
        this.evaluationTime = l4;
    }

    public final void setStickyUserExperiments(StickyUserExperiments stickyUserExperiments) {
        AbstractC16544l.m18094g(stickyUserExperiments, "<set-?>");
        this.stickyUserExperiments = stickyUserExperiments;
    }

    public final void setUserHash(String str) {
        AbstractC16544l.m18094g(str, "<set-?>");
        this.userHash = str;
    }

    public final void setValues(InitializeResponse.SuccessfulInitializeResponse successfulInitializeResponse) {
        AbstractC16544l.m18094g(successfulInitializeResponse, "<set-?>");
        this.values = successfulInitializeResponse;
    }

    public String toString() {
        return "Cache(values=" + this.values + ", stickyUserExperiments=" + this.stickyUserExperiments + ", userHash=" + this.userHash + ", evaluationTime=" + this.evaluationTime + ')';
    }

    public /* synthetic */ Cache(InitializeResponse.SuccessfulInitializeResponse successfulInitializeResponse, StickyUserExperiments stickyUserExperiments, String str, Long l4, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(successfulInitializeResponse, stickyUserExperiments, str, (i10 & 8) != 0 ? Long.valueOf(System.currentTimeMillis()) : l4);
    }
}
