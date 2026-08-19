package com.segment.analytics.kotlin.core;

import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.json.C16644c;
import livekit.LivekitInternal$NodeStats;
import p003A1.AbstractC0168G;
import p530Vi.EnumC8319o;
import p559Wn.InterfaceC8975g;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
@Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, m18067d2 = {"Lcom/segment/analytics/kotlin/core/ScreenEvent;", "Lcom/segment/analytics/kotlin/core/a;", "Companion", "$serializer", "core"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final /* data */ class ScreenEvent extends AbstractC12774a {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a */
    public String f40487a;

    /* JADX INFO: renamed from: b */
    public String f40488b;

    /* JADX INFO: renamed from: c */
    public C16644c f40489c;

    /* JADX INFO: renamed from: d */
    public EnumC8319o f40490d;

    /* JADX INFO: renamed from: e */
    public String f40491e;

    /* JADX INFO: renamed from: f */
    public String f40492f;

    /* JADX INFO: renamed from: g */
    public C16644c f40493g;

    /* JADX INFO: renamed from: h */
    public C16644c f40494h;

    /* JADX INFO: renamed from: i */
    public String f40495i;

    /* JADX INFO: renamed from: j */
    public String f40496j;

    /* JADX INFO: renamed from: k */
    public DestinationMetadata f40497k;

    @Metadata(m18066d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m18067d2 = {"Lcom/segment/analytics/kotlin/core/ScreenEvent$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/segment/analytics/kotlin/core/ScreenEvent;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class Companion {
        public final KSerializer serializer() {
            return ScreenEvent$$serializer.INSTANCE;
        }
    }

    public ScreenEvent(String name, String category, C16644c properties) {
        AbstractC16544l.m18094g(name, "name");
        AbstractC16544l.m18094g(category, "category");
        AbstractC16544l.m18094g(properties, "properties");
        this.f40487a = name;
        this.f40488b = category;
        this.f40489c = properties;
        this.f40490d = EnumC8319o.f25936o0;
        this.f40495i = "";
        this.f40497k = new DestinationMetadata();
    }

    @Override // com.segment.analytics.kotlin.core.AbstractC12774a
    /* JADX INFO: renamed from: c */
    public final String mo14506c() {
        String str = this.f40492f;
        if (str != null) {
            return str;
        }
        AbstractC16544l.m18103p("anonymousId");
        throw null;
    }

    @Override // com.segment.analytics.kotlin.core.AbstractC12774a
    /* JADX INFO: renamed from: d */
    public final C16644c mo14507d() {
        C16644c c16644c = this.f40493g;
        if (c16644c != null) {
            return c16644c;
        }
        AbstractC16544l.m18103p("context");
        throw null;
    }

    @Override // com.segment.analytics.kotlin.core.AbstractC12774a
    /* JADX INFO: renamed from: e */
    public final C16644c mo14508e() {
        C16644c c16644c = this.f40494h;
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
        if (!ScreenEvent.class.equals(obj != null ? obj.getClass() : null) || !super.equals(obj)) {
            return false;
        }
        AbstractC16544l.m18092e(obj, "null cannot be cast to non-null type com.segment.analytics.kotlin.core.ScreenEvent");
        ScreenEvent screenEvent = (ScreenEvent) obj;
        return AbstractC16544l.m18089b(this.f40487a, screenEvent.f40487a) && AbstractC16544l.m18089b(this.f40488b, screenEvent.f40488b) && AbstractC16544l.m18089b(this.f40489c, screenEvent.f40489c);
    }

    @Override // com.segment.analytics.kotlin.core.AbstractC12774a
    /* JADX INFO: renamed from: f */
    public final String mo14509f() {
        String str = this.f40491e;
        if (str != null) {
            return str;
        }
        AbstractC16544l.m18103p("messageId");
        throw null;
    }

    @Override // com.segment.analytics.kotlin.core.AbstractC12774a
    /* JADX INFO: renamed from: g */
    public final String mo14510g() {
        String str = this.f40496j;
        if (str != null) {
            return str;
        }
        AbstractC16544l.m18103p(DiagnosticsEntry.TIMESTAMP_KEY);
        throw null;
    }

    @Override // com.segment.analytics.kotlin.core.AbstractC12774a
    /* JADX INFO: renamed from: h, reason: from getter */
    public final EnumC8319o getF40475c() {
        return this.f40490d;
    }

    @Override // com.segment.analytics.kotlin.core.AbstractC12774a
    public final int hashCode() {
        return this.f40489c.f53331Y.hashCode() + AbstractC0168G.m527p(AbstractC0168G.m527p(super.hashCode() * 31, 31, this.f40487a), 31, this.f40488b);
    }

    @Override // com.segment.analytics.kotlin.core.AbstractC12774a
    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getF40473a() {
        return this.f40495i;
    }

    @Override // com.segment.analytics.kotlin.core.AbstractC12774a
    /* JADX INFO: renamed from: j, reason: from getter */
    public final DestinationMetadata getF40481i() {
        return this.f40497k;
    }

    @Override // com.segment.analytics.kotlin.core.AbstractC12774a
    /* JADX INFO: renamed from: k */
    public final void mo14514k(String str) {
        AbstractC16544l.m18094g(str, "<set-?>");
        this.f40492f = str;
    }

    @Override // com.segment.analytics.kotlin.core.AbstractC12774a
    /* JADX INFO: renamed from: l */
    public final void mo14515l(C16644c c16644c) {
        AbstractC16544l.m18094g(c16644c, "<set-?>");
        this.f40493g = c16644c;
    }

    @Override // com.segment.analytics.kotlin.core.AbstractC12774a
    /* JADX INFO: renamed from: m */
    public final void mo14516m(C16644c c16644c) {
        AbstractC16544l.m18094g(c16644c, "<set-?>");
        this.f40494h = c16644c;
    }

    @Override // com.segment.analytics.kotlin.core.AbstractC12774a
    /* JADX INFO: renamed from: n */
    public final void mo14517n(String str) {
        AbstractC16544l.m18094g(str, "<set-?>");
        this.f40491e = str;
    }

    @Override // com.segment.analytics.kotlin.core.AbstractC12774a
    /* JADX INFO: renamed from: o */
    public final void mo14518o(String str) {
        AbstractC16544l.m18094g(str, "<set-?>");
        this.f40496j = str;
    }

    @Override // com.segment.analytics.kotlin.core.AbstractC12774a
    /* JADX INFO: renamed from: p */
    public final void mo14519p(String str) {
        AbstractC16544l.m18094g(str, "<set-?>");
        this.f40495i = str;
    }

    @Override // com.segment.analytics.kotlin.core.AbstractC12774a
    /* JADX INFO: renamed from: q */
    public final void mo14520q(DestinationMetadata destinationMetadata) {
        AbstractC16544l.m18094g(destinationMetadata, "<set-?>");
        this.f40497k = destinationMetadata;
    }

    public final String toString() {
        return "ScreenEvent(name=" + this.f40487a + ", category=" + this.f40488b + ", properties=" + this.f40489c + ')';
    }
}
