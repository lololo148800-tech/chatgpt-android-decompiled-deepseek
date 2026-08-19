package com.statsig.androidsdk;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import livekit.LivekitInternal$NodeStats;
import p240Jb.InterfaceC4325b;
import p817j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB[\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u001e\u0010\u0007\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00060\u0002\u0012\u001e\u0010\b\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00060\u0002¢\u0006\u0004\b\t\u0010\nJ\u001c\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ(\u0010\r\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00060\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ(\u0010\u000e\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00060\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\fJj\u0010\u000f\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022 \b\u0002\u0010\u0007\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00060\u00022 \b\u0002\u0010\b\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00060\u0002HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R&\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\fR2\u0010\u0007\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00060\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001b\u0010\fR2\u0010\b\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00060\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0019\u001a\u0004\b\u001c\u0010\f¨\u0006\u001e"}, m18067d2 = {"Lcom/statsig/androidsdk/StatsigOverrides;", "", "j$/util/concurrent/ConcurrentHashMap", "", "", "gates", "", "configs", "layers", "<init>", "(Lj$/util/concurrent/ConcurrentHashMap;Lj$/util/concurrent/ConcurrentHashMap;Lj$/util/concurrent/ConcurrentHashMap;)V", "component1", "()Lj$/util/concurrent/ConcurrentHashMap;", "component2", "component3", "copy", "(Lj$/util/concurrent/ConcurrentHashMap;Lj$/util/concurrent/ConcurrentHashMap;Lj$/util/concurrent/ConcurrentHashMap;)Lcom/statsig/androidsdk/StatsigOverrides;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lj$/util/concurrent/ConcurrentHashMap;", "getGates", "getConfigs", "getLayers", "Companion", "build_release"}, m18068k = 1, m18069mv = {1, 5, 1}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final /* data */ class StatsigOverrides {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @InterfaceC4325b("configs")
    private final ConcurrentHashMap<String, Map<String, Object>> configs;

    @InterfaceC4325b("gates")
    private final ConcurrentHashMap<String, Boolean> gates;

    @InterfaceC4325b("layers")
    private final ConcurrentHashMap<String, Map<String, Object>> layers;

    @Metadata(m18066d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, m18067d2 = {"Lcom/statsig/androidsdk/StatsigOverrides$Companion;", "", "()V", "empty", "Lcom/statsig/androidsdk/StatsigOverrides;", "build_release"}, m18068k = 1, m18069mv = {1, 5, 1}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final StatsigOverrides empty() {
            return new StatsigOverrides(new ConcurrentHashMap(), new ConcurrentHashMap(), new ConcurrentHashMap());
        }

        private Companion() {
        }
    }

    public StatsigOverrides(ConcurrentHashMap<String, Boolean> gates, ConcurrentHashMap<String, Map<String, Object>> configs, ConcurrentHashMap<String, Map<String, Object>> layers) {
        AbstractC16544l.m18094g(gates, "gates");
        AbstractC16544l.m18094g(configs, "configs");
        AbstractC16544l.m18094g(layers, "layers");
        this.gates = gates;
        this.configs = configs;
        this.layers = layers;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StatsigOverrides copy$default(StatsigOverrides statsigOverrides, ConcurrentHashMap concurrentHashMap, ConcurrentHashMap concurrentHashMap2, ConcurrentHashMap concurrentHashMap3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            concurrentHashMap = statsigOverrides.gates;
        }
        if ((i10 & 2) != 0) {
            concurrentHashMap2 = statsigOverrides.configs;
        }
        if ((i10 & 4) != 0) {
            concurrentHashMap3 = statsigOverrides.layers;
        }
        return statsigOverrides.copy(concurrentHashMap, concurrentHashMap2, concurrentHashMap3);
    }

    public final ConcurrentHashMap<String, Boolean> component1() {
        return this.gates;
    }

    public final ConcurrentHashMap<String, Map<String, Object>> component2() {
        return this.configs;
    }

    public final ConcurrentHashMap<String, Map<String, Object>> component3() {
        return this.layers;
    }

    public final StatsigOverrides copy(ConcurrentHashMap<String, Boolean> gates, ConcurrentHashMap<String, Map<String, Object>> configs, ConcurrentHashMap<String, Map<String, Object>> layers) {
        AbstractC16544l.m18094g(gates, "gates");
        AbstractC16544l.m18094g(configs, "configs");
        AbstractC16544l.m18094g(layers, "layers");
        return new StatsigOverrides(gates, configs, layers);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StatsigOverrides)) {
            return false;
        }
        StatsigOverrides statsigOverrides = (StatsigOverrides) other;
        return AbstractC16544l.m18089b(this.gates, statsigOverrides.gates) && AbstractC16544l.m18089b(this.configs, statsigOverrides.configs) && AbstractC16544l.m18089b(this.layers, statsigOverrides.layers);
    }

    public final ConcurrentHashMap<String, Map<String, Object>> getConfigs() {
        return this.configs;
    }

    public final ConcurrentHashMap<String, Boolean> getGates() {
        return this.gates;
    }

    public final ConcurrentHashMap<String, Map<String, Object>> getLayers() {
        return this.layers;
    }

    public int hashCode() {
        return this.layers.hashCode() + ((this.configs.hashCode() + (this.gates.hashCode() * 31)) * 31);
    }

    public String toString() {
        return "StatsigOverrides(gates=" + this.gates + ", configs=" + this.configs + ", layers=" + this.layers + ')';
    }
}
