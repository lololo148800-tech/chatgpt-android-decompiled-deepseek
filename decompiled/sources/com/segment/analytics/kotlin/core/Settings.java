package com.segment.analytics.kotlin.core;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.json.C16644c;
import livekit.LivekitInternal$NodeStats;
import p1071w0.AbstractC20734X;
import p530Vi.AbstractC8320p;
import p559Wn.InterfaceC8975g;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
@Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, m18067d2 = {"Lcom/segment/analytics/kotlin/core/Settings;", "", "Companion", "$serializer", "core"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final /* data */ class Settings {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a */
    public C16644c f40498a;

    /* JADX INFO: renamed from: b */
    public C16644c f40499b;

    /* JADX INFO: renamed from: c */
    public C16644c f40500c;

    /* JADX INFO: renamed from: d */
    public C16644c f40501d;

    /* JADX INFO: renamed from: e */
    public C16644c f40502e;

    /* JADX INFO: renamed from: f */
    public C16644c f40503f;

    @Metadata(m18066d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m18067d2 = {"Lcom/segment/analytics/kotlin/core/Settings$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/segment/analytics/kotlin/core/Settings;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class Companion {
        public final KSerializer serializer() {
            return Settings$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Settings() {
        C16644c c16644c = AbstractC8320p.f25941a;
        this(c16644c, c16644c, c16644c, c16644c, c16644c, c16644c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Settings)) {
            return false;
        }
        Settings settings = (Settings) obj;
        return AbstractC16544l.m18089b(this.f40498a, settings.f40498a) && AbstractC16544l.m18089b(this.f40499b, settings.f40499b) && AbstractC16544l.m18089b(this.f40500c, settings.f40500c) && AbstractC16544l.m18089b(this.f40501d, settings.f40501d) && AbstractC16544l.m18089b(this.f40502e, settings.f40502e) && AbstractC16544l.m18089b(this.f40503f, settings.f40503f);
    }

    public final int hashCode() {
        return this.f40503f.f53331Y.hashCode() + AbstractC20734X.m21250u(AbstractC20734X.m21250u(AbstractC20734X.m21250u(AbstractC20734X.m21250u(this.f40498a.f53331Y.hashCode() * 31, 31, this.f40499b.f53331Y), 31, this.f40500c.f53331Y), 31, this.f40501d.f53331Y), 31, this.f40502e.f53331Y);
    }

    public final String toString() {
        return "Settings(integrations=" + this.f40498a + ", plan=" + this.f40499b + ", edgeFunction=" + this.f40500c + ", middlewareSettings=" + this.f40501d + ", metrics=" + this.f40502e + ", consentSettings=" + this.f40503f + ')';
    }

    public Settings(C16644c integrations, C16644c plan, C16644c edgeFunction, C16644c middlewareSettings, C16644c metrics, C16644c consentSettings) {
        AbstractC16544l.m18094g(integrations, "integrations");
        AbstractC16544l.m18094g(plan, "plan");
        AbstractC16544l.m18094g(edgeFunction, "edgeFunction");
        AbstractC16544l.m18094g(middlewareSettings, "middlewareSettings");
        AbstractC16544l.m18094g(metrics, "metrics");
        AbstractC16544l.m18094g(consentSettings, "consentSettings");
        this.f40498a = integrations;
        this.f40499b = plan;
        this.f40500c = edgeFunction;
        this.f40501d = middlewareSettings;
        this.f40502e = metrics;
        this.f40503f = consentSettings;
    }
}
