package com.statsig.androidsdk;

import java.util.Arrays;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, m18067d2 = {"Lcom/statsig/androidsdk/EvaluationReason;", "", "(Ljava/lang/String;I)V", "Network", "Cache", "Sticky", "LocalOverride", "Unrecognized", "Uninitialized", "Bootstrap", "InvalidBootstrap", "NetworkNotModified", "Error", "build_release"}, m18068k = 1, m18069mv = {1, 5, 1}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public enum EvaluationReason {
    Network,
    Cache,
    Sticky,
    LocalOverride,
    Unrecognized,
    Uninitialized,
    Bootstrap,
    InvalidBootstrap,
    NetworkNotModified,
    Error;

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static EvaluationReason[] valuesCustom() {
        EvaluationReason[] evaluationReasonArrValuesCustom = values();
        return (EvaluationReason[]) Arrays.copyOf(evaluationReasonArrValuesCustom, evaluationReasonArrValuesCustom.length);
    }
}
