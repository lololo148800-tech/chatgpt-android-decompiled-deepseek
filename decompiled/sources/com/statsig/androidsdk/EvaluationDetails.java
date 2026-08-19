package com.statsig.androidsdk;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import livekit.LivekitInternal$NodeStats;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, m18067d2 = {"Lcom/statsig/androidsdk/EvaluationDetails;", "", "reason", "Lcom/statsig/androidsdk/EvaluationReason;", "time", "", "(Lcom/statsig/androidsdk/EvaluationReason;J)V", "getReason", "()Lcom/statsig/androidsdk/EvaluationReason;", "setReason", "(Lcom/statsig/androidsdk/EvaluationReason;)V", "getTime", "()J", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "build_release"}, m18068k = 1, m18069mv = {1, 5, 1}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final /* data */ class EvaluationDetails {
    private EvaluationReason reason;
    private final long time;

    public EvaluationDetails(EvaluationReason reason, long j10) {
        AbstractC16544l.m18094g(reason, "reason");
        this.reason = reason;
        this.time = j10;
    }

    public static /* synthetic */ EvaluationDetails copy$default(EvaluationDetails evaluationDetails, EvaluationReason evaluationReason, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            evaluationReason = evaluationDetails.reason;
        }
        if ((i10 & 2) != 0) {
            j10 = evaluationDetails.time;
        }
        return evaluationDetails.copy(evaluationReason, j10);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final EvaluationReason getReason() {
        return this.reason;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    public final EvaluationDetails copy(EvaluationReason reason, long time) {
        AbstractC16544l.m18094g(reason, "reason");
        return new EvaluationDetails(reason, time);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EvaluationDetails)) {
            return false;
        }
        EvaluationDetails evaluationDetails = (EvaluationDetails) other;
        return this.reason == evaluationDetails.reason && this.time == evaluationDetails.time;
    }

    public final EvaluationReason getReason() {
        return this.reason;
    }

    public final long getTime() {
        return this.time;
    }

    public int hashCode() {
        int iHashCode = this.reason.hashCode() * 31;
        long j10 = this.time;
        return iHashCode + ((int) (j10 ^ (j10 >>> 32)));
    }

    public final void setReason(EvaluationReason evaluationReason) {
        AbstractC16544l.m18094g(evaluationReason, "<set-?>");
        this.reason = evaluationReason;
    }

    public String toString() {
        return "EvaluationDetails(reason=" + this.reason + ", time=" + this.time + ')';
    }

    public /* synthetic */ EvaluationDetails(EvaluationReason evaluationReason, long j10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(evaluationReason, (i10 & 2) != 0 ? System.currentTimeMillis() : j10);
    }
}
