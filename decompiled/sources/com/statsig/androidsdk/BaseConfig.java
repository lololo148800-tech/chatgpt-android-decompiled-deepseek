package com.statsig.androidsdk;

import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0003H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, m18067d2 = {"Lcom/statsig/androidsdk/BaseConfig;", "", DiagnosticsEntry.NAME_KEY, "", "details", "Lcom/statsig/androidsdk/EvaluationDetails;", "(Ljava/lang/String;Lcom/statsig/androidsdk/EvaluationDetails;)V", "getEvaluationDetails", "getName", "build_release"}, m18068k = 1, m18069mv = {1, 5, 1}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public class BaseConfig {
    private final EvaluationDetails details;
    private final String name;

    public BaseConfig(String name, EvaluationDetails details) {
        AbstractC16544l.m18094g(name, "name");
        AbstractC16544l.m18094g(details, "details");
        this.name = name;
        this.details = details;
    }

    /* JADX INFO: renamed from: getEvaluationDetails, reason: from getter */
    public EvaluationDetails getDetails() {
        return this.details;
    }

    public String getName() {
        return this.name;
    }
}
