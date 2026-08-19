package com.statsig.androidsdk;

import com.google.protobuf.AbstractC12107L1;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p240Jb.InterfaceC4325b;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\u0010\u0006J\u0015\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0003J\u001f\u0010\n\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0004HÖ\u0001R\"\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0011"}, m18067d2 = {"Lcom/statsig/androidsdk/StickyUserExperiments;", "", "experiments", "", "", "Lcom/statsig/androidsdk/APIDynamicConfig;", "(Ljava/util/Map;)V", "getExperiments", "()Ljava/util/Map;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "build_release"}, m18068k = 1, m18069mv = {1, 5, 1}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
final /* data */ class StickyUserExperiments {

    @InterfaceC4325b("values")
    private final Map<String, APIDynamicConfig> experiments;

    public StickyUserExperiments(Map<String, APIDynamicConfig> experiments) {
        AbstractC16544l.m18094g(experiments, "experiments");
        this.experiments = experiments;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StickyUserExperiments copy$default(StickyUserExperiments stickyUserExperiments, Map map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            map = stickyUserExperiments.experiments;
        }
        return stickyUserExperiments.copy(map);
    }

    public final Map<String, APIDynamicConfig> component1() {
        return this.experiments;
    }

    public final StickyUserExperiments copy(Map<String, APIDynamicConfig> experiments) {
        AbstractC16544l.m18094g(experiments, "experiments");
        return new StickyUserExperiments(experiments);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof StickyUserExperiments) && AbstractC16544l.m18089b(this.experiments, ((StickyUserExperiments) other).experiments);
    }

    public final Map<String, APIDynamicConfig> getExperiments() {
        return this.experiments;
    }

    public int hashCode() {
        return this.experiments.hashCode();
    }

    public String toString() {
        return AbstractC12107L1.m13827r(new StringBuilder("StickyUserExperiments(experiments="), this.experiments, ')');
    }
}
