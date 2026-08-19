package com.statsig.androidsdk;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import livekit.LivekitInternal$NodeStats;
import p240Jb.InterfaceC4325b;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u00052\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR \u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u001f"}, m18067d2 = {"Lcom/statsig/androidsdk/InitializationDetails;", "", "duration", "", "success", "", "failureDetails", "Lcom/statsig/androidsdk/InitializeResponse$FailedInitializeResponse;", "(JZLcom/statsig/androidsdk/InitializeResponse$FailedInitializeResponse;)V", "getDuration", "()J", "setDuration", "(J)V", "getFailureDetails", "()Lcom/statsig/androidsdk/InitializeResponse$FailedInitializeResponse;", "setFailureDetails", "(Lcom/statsig/androidsdk/InitializeResponse$FailedInitializeResponse;)V", "getSuccess", "()Z", "setSuccess", "(Z)V", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "build_release"}, m18068k = 1, m18069mv = {1, 5, 1}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final /* data */ class InitializationDetails {

    @InterfaceC4325b("duration")
    private long duration;

    @InterfaceC4325b("failureDetails")
    private InitializeResponse.FailedInitializeResponse failureDetails;

    @InterfaceC4325b("success")
    private boolean success;

    public InitializationDetails(long j10, boolean z6, InitializeResponse.FailedInitializeResponse failedInitializeResponse) {
        this.duration = j10;
        this.success = z6;
        this.failureDetails = failedInitializeResponse;
    }

    public static /* synthetic */ InitializationDetails copy$default(InitializationDetails initializationDetails, long j10, boolean z6, InitializeResponse.FailedInitializeResponse failedInitializeResponse, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = initializationDetails.duration;
        }
        if ((i10 & 2) != 0) {
            z6 = initializationDetails.success;
        }
        if ((i10 & 4) != 0) {
            failedInitializeResponse = initializationDetails.failureDetails;
        }
        return initializationDetails.copy(j10, z6, failedInitializeResponse);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getDuration() {
        return this.duration;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getSuccess() {
        return this.success;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final InitializeResponse.FailedInitializeResponse getFailureDetails() {
        return this.failureDetails;
    }

    public final InitializationDetails copy(long duration, boolean success, InitializeResponse.FailedInitializeResponse failureDetails) {
        return new InitializationDetails(duration, success, failureDetails);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InitializationDetails)) {
            return false;
        }
        InitializationDetails initializationDetails = (InitializationDetails) other;
        return this.duration == initializationDetails.duration && this.success == initializationDetails.success && AbstractC16544l.m18089b(this.failureDetails, initializationDetails.failureDetails);
    }

    public final long getDuration() {
        return this.duration;
    }

    public final InitializeResponse.FailedInitializeResponse getFailureDetails() {
        return this.failureDetails;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    public int hashCode() {
        long j10 = this.duration;
        int i10 = ((int) (j10 ^ (j10 >>> 32))) * 31;
        boolean z6 = this.success;
        ?? r6 = z6;
        if (z6) {
            r6 = 1;
        }
        int i11 = (i10 + r6) * 31;
        InitializeResponse.FailedInitializeResponse failedInitializeResponse = this.failureDetails;
        return i11 + (failedInitializeResponse == null ? 0 : failedInitializeResponse.hashCode());
    }

    public final void setDuration(long j10) {
        this.duration = j10;
    }

    public final void setFailureDetails(InitializeResponse.FailedInitializeResponse failedInitializeResponse) {
        this.failureDetails = failedInitializeResponse;
    }

    public final void setSuccess(boolean z6) {
        this.success = z6;
    }

    public String toString() {
        return "InitializationDetails(duration=" + this.duration + ", success=" + this.success + ", failureDetails=" + this.failureDetails + ')';
    }

    public /* synthetic */ InitializationDetails(long j10, boolean z6, InitializeResponse.FailedInitializeResponse failedInitializeResponse, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, z6, (i10 & 4) != 0 ? null : failedInitializeResponse);
    }
}
