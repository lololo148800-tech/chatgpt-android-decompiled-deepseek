package com.segment.analytics.kotlin.core;

import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.json.C16644c;
import livekit.LivekitInternal$NodeStats;
import p1071w0.AbstractC20734X;
import p530Vi.EnumC8319o;
import p559Wn.InterfaceC8975g;
import p571X9.AbstractC9306j0;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
@Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, m18067d2 = {"Lcom/segment/analytics/kotlin/core/TrackEvent;", "Lcom/segment/analytics/kotlin/core/a;", "Companion", "$serializer", "core"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final /* data */ class TrackEvent extends AbstractC12774a {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a */
    public C16644c f40504a;

    /* JADX INFO: renamed from: b */
    public String f40505b;

    /* JADX INFO: renamed from: c */
    public EnumC8319o f40506c;

    /* JADX INFO: renamed from: d */
    public String f40507d;

    /* JADX INFO: renamed from: e */
    public String f40508e;

    /* JADX INFO: renamed from: f */
    public C16644c f40509f;

    /* JADX INFO: renamed from: g */
    public C16644c f40510g;

    /* JADX INFO: renamed from: h */
    public String f40511h;

    /* JADX INFO: renamed from: i */
    public DestinationMetadata f40512i;

    /* JADX INFO: renamed from: j */
    public String f40513j;

    @Metadata(m18066d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m18067d2 = {"Lcom/segment/analytics/kotlin/core/TrackEvent$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/segment/analytics/kotlin/core/TrackEvent;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class Companion {
        public final KSerializer serializer() {
            return TrackEvent$$serializer.INSTANCE;
        }
    }

    public TrackEvent(String event, C16644c properties) {
        AbstractC16544l.m18094g(properties, "properties");
        AbstractC16544l.m18094g(event, "event");
        this.f40504a = properties;
        this.f40505b = event;
        this.f40506c = EnumC8319o.f25935Z;
        this.f40511h = "";
        this.f40512i = new DestinationMetadata();
    }

    @Override // com.segment.analytics.kotlin.core.AbstractC12774a
    /* JADX INFO: renamed from: c */
    public final String mo14506c() {
        String str = this.f40508e;
        if (str != null) {
            return str;
        }
        AbstractC16544l.m18103p("anonymousId");
        throw null;
    }

    @Override // com.segment.analytics.kotlin.core.AbstractC12774a
    /* JADX INFO: renamed from: d */
    public final C16644c mo14507d() {
        C16644c c16644c = this.f40510g;
        if (c16644c != null) {
            return c16644c;
        }
        AbstractC16544l.m18103p("context");
        throw null;
    }

    @Override // com.segment.analytics.kotlin.core.AbstractC12774a
    /* JADX INFO: renamed from: e */
    public final C16644c mo14508e() {
        C16644c c16644c = this.f40509f;
        if (c16644c != null) {
            return c16644c;
        }
        AbstractC16544l.m18103p("integrations");
        throw null;
    }

    @Override // com.segment.analytics.kotlin.core.AbstractC12774a
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!TrackEvent.class.equals(obj != null ? obj.getClass() : null) || !super.equals(obj)) {
            return false;
        }
        AbstractC16544l.m18092e(obj, "null cannot be cast to non-null type com.segment.analytics.kotlin.core.TrackEvent");
        TrackEvent trackEvent = (TrackEvent) obj;
        return AbstractC16544l.m18089b(this.f40504a, trackEvent.f40504a) && AbstractC16544l.m18089b(this.f40505b, trackEvent.f40505b);
    }

    @Override // com.segment.analytics.kotlin.core.AbstractC12774a
    /* JADX INFO: renamed from: f */
    public final String mo14509f() {
        String str = this.f40507d;
        if (str != null) {
            return str;
        }
        AbstractC16544l.m18103p("messageId");
        throw null;
    }

    @Override // com.segment.analytics.kotlin.core.AbstractC12774a
    /* JADX INFO: renamed from: g */
    public final String mo14510g() {
        String str = this.f40513j;
        if (str != null) {
            return str;
        }
        AbstractC16544l.m18103p(DiagnosticsEntry.TIMESTAMP_KEY);
        throw null;
    }

    @Override // com.segment.analytics.kotlin.core.AbstractC12774a
    /* JADX INFO: renamed from: h, reason: from getter */
    public final EnumC8319o getF40490d() {
        return this.f40506c;
    }

    @Override // com.segment.analytics.kotlin.core.AbstractC12774a
    public final int hashCode() {
        return this.f40505b.hashCode() + AbstractC20734X.m21250u(super.hashCode() * 31, 31, this.f40504a.f53331Y);
    }

    @Override // com.segment.analytics.kotlin.core.AbstractC12774a
    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getF40495i() {
        return this.f40511h;
    }

    @Override // com.segment.analytics.kotlin.core.AbstractC12774a
    /* JADX INFO: renamed from: j, reason: from getter */
    public final DestinationMetadata getF40497k() {
        return this.f40512i;
    }

    @Override // com.segment.analytics.kotlin.core.AbstractC12774a
    /* JADX INFO: renamed from: k */
    public final void mo14514k(String str) {
        AbstractC16544l.m18094g(str, "<set-?>");
        this.f40508e = str;
    }

    @Override // com.segment.analytics.kotlin.core.AbstractC12774a
    /* JADX INFO: renamed from: l */
    public final void mo14515l(C16644c c16644c) {
        AbstractC16544l.m18094g(c16644c, "<set-?>");
        this.f40510g = c16644c;
    }

    @Override // com.segment.analytics.kotlin.core.AbstractC12774a
    /* JADX INFO: renamed from: m */
    public final void mo14516m(C16644c c16644c) {
        AbstractC16544l.m18094g(c16644c, "<set-?>");
        this.f40509f = c16644c;
    }

    @Override // com.segment.analytics.kotlin.core.AbstractC12774a
    /* JADX INFO: renamed from: n */
    public final void mo14517n(String str) {
        AbstractC16544l.m18094g(str, "<set-?>");
        this.f40507d = str;
    }

    @Override // com.segment.analytics.kotlin.core.AbstractC12774a
    /* JADX INFO: renamed from: o */
    public final void mo14518o(String str) {
        AbstractC16544l.m18094g(str, "<set-?>");
        this.f40513j = str;
    }

    @Override // com.segment.analytics.kotlin.core.AbstractC12774a
    /* JADX INFO: renamed from: p */
    public final void mo14519p(String str) {
        AbstractC16544l.m18094g(str, "<set-?>");
        this.f40511h = str;
    }

    @Override // com.segment.analytics.kotlin.core.AbstractC12774a
    /* JADX INFO: renamed from: q */
    public final void mo14520q(DestinationMetadata destinationMetadata) {
        AbstractC16544l.m18094g(destinationMetadata, "<set-?>");
        this.f40512i = destinationMetadata;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TrackEvent(properties=");
        sb2.append(this.f40504a);
        sb2.append(", event=");
        return AbstractC9306j0.m9892k(sb2, this.f40505b, ')');
    }
}
