package com.statsig.androidsdk;

import java.util.Arrays;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m18067d2 = {"Lcom/statsig/androidsdk/Tier;", "", "(Ljava/lang/String;I)V", "PRODUCTION", "STAGING", "DEVELOPMENT", "build_release"}, m18068k = 1, m18069mv = {1, 5, 1}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public enum Tier {
    PRODUCTION,
    STAGING,
    DEVELOPMENT;

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static Tier[] valuesCustom() {
        Tier[] tierArrValuesCustom = values();
        return (Tier[]) Arrays.copyOf(tierArrValuesCustom, tierArrValuesCustom.length);
    }
}
