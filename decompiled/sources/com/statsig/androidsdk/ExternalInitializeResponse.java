package com.statsig.androidsdk;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import livekit.LivekitInternal$NodeStats;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0017\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u0007\u001a\u00020\u0005J\b\u0010\b\u001a\u0004\u0018\u00010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m18067d2 = {"Lcom/statsig/androidsdk/ExternalInitializeResponse;", "", "values", "", "evaluationDetails", "Lcom/statsig/androidsdk/EvaluationDetails;", "(Ljava/lang/String;Lcom/statsig/androidsdk/EvaluationDetails;)V", "getEvaluationDetails", "getInitializeResponseJSON", "Companion", "build_release"}, m18068k = 1, m18069mv = {1, 5, 1}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class ExternalInitializeResponse {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final EvaluationDetails evaluationDetails;
    private final String values;

    @Metadata(m18066d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, m18067d2 = {"Lcom/statsig/androidsdk/ExternalInitializeResponse$Companion;", "", "()V", "getUninitialized", "Lcom/statsig/androidsdk/ExternalInitializeResponse;", "build_release"}, m18068k = 1, m18069mv = {1, 5, 1}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ExternalInitializeResponse getUninitialized() {
            return new ExternalInitializeResponse(null, new EvaluationDetails(EvaluationReason.Uninitialized, 0L, 2, null));
        }

        private Companion() {
        }
    }

    public ExternalInitializeResponse(String str, EvaluationDetails evaluationDetails) {
        AbstractC16544l.m18094g(evaluationDetails, "evaluationDetails");
        this.values = str;
        this.evaluationDetails = evaluationDetails;
    }

    public final EvaluationDetails getEvaluationDetails() {
        return EvaluationDetails.copy$default(this.evaluationDetails, null, 0L, 3, null);
    }

    /* JADX INFO: renamed from: getInitializeResponseJSON, reason: from getter */
    public final String getValues() {
        return this.values;
    }
}
