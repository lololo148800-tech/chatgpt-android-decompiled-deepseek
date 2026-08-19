package com.statsig.androidsdk;

import java.util.Arrays;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m18067d2 = {"Lcom/statsig/androidsdk/InitializeFailReason;", "", "(Ljava/lang/String;I)V", "CoroutineTimeout", "NetworkTimeout", "NetworkError", "InternalError", "build_release"}, m18068k = 1, m18069mv = {1, 5, 1}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public enum InitializeFailReason {
    CoroutineTimeout,
    NetworkTimeout,
    NetworkError,
    InternalError;

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static InitializeFailReason[] valuesCustom() {
        InitializeFailReason[] initializeFailReasonArrValuesCustom = values();
        return (InitializeFailReason[]) Arrays.copyOf(initializeFailReasonArrValuesCustom, initializeFailReasonArrValuesCustom.length);
    }
}
