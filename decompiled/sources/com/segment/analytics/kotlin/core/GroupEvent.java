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
@Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, m18067d2 = {"Lcom/segment/analytics/kotlin/core/GroupEvent;", "Lcom/segment/analytics/kotlin/core/a;", "Companion", "$serializer", "core"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final /* data */ class GroupEvent extends AbstractC12774a {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a */
    public String f40463a;

    /* JADX INFO: renamed from: b */
    public C16644c f40464b;

    /* JADX INFO: renamed from: c */
    public EnumC8319o f40465c;

    /* JADX INFO: renamed from: d */
    public String f40466d;

    /* JADX INFO: renamed from: e */
    public String f40467e;

    /* JADX INFO: renamed from: f */
    public C16644c f40468f;

    /* JADX INFO: renamed from: g */
    public C16644c f40469g;

    /* JADX INFO: renamed from: h */
    public String f40470h;

    /* JADX INFO: renamed from: i */
    public DestinationMetadata f40471i;

    /* JADX INFO: renamed from: j */
    public String f40472j;

    @Metadata(m18066d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m18067d2 = {"Lcom/segment/analytics/kotlin/core/GroupEvent$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/segment/analytics/kotlin/core/GroupEvent;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class Companion {
        public final KSerializer serializer() {
            return GroupEvent$$serializer.INSTANCE;
        }
    }

    @Override // com.segment.analytics.kotlin.core.AbstractC12774a
    /* JADX INFO: renamed from: c */
    public final String mo14506c() {
        String str = this.f40467e;
        if (str != null) {
            return str;
        }
        AbstractC16544l.m18103p("anonymousId");
        throw null;
    }

    @Override // com.segment.analytics.kotlin.core.AbstractC12774a
    /* JADX INFO: renamed from: d */
    public final C16644c mo14507d() {
        C16644c c16644c = this.f40469g;
        if (c16644c != null) {
            return c16644c;
        }
        AbstractC16544l.m18103p("context");
        throw null;
    }

    @Override // com.segment.analytics.kotlin.core.AbstractC12774a
    /* JADX INFO: renamed from: e */
    public final C16644c mo14508e() {
        C16644c c16644c = this.f40468f;
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
        if (!GroupEvent.class.equals(obj != null ? obj.getClass() : null) || !super.equals(obj)) {
            return false;
        }
        AbstractC16544l.m18092e(obj, "null cannot be cast to non-null type com.segment.analytics.kotlin.core.GroupEvent");
        GroupEvent groupEvent = (GroupEvent) obj;
        return AbstractC16544l.m18089b(this.f40463a, groupEvent.f40463a) && AbstractC16544l.m18089b(this.f40464b, groupEvent.f40464b);
    }

    @Override // com.segment.analytics.kotlin.core.AbstractC12774a
    /* JADX INFO: renamed from: f */
    public final String mo14509f() {
        String str = this.f40466d;
        if (str != null) {
            return str;
        }
        AbstractC16544l.m18103p("messageId");
        throw null;
    }

    @Override // com.segment.analytics.kotlin.core.AbstractC12774a
    /* JADX INFO: renamed from: g */
    public final String mo14510g() {
        String str = this.f40472j;
        if (str != null) {
            return str;
        }
        AbstractC16544l.m18103p(DiagnosticsEntry.TIMESTAMP_KEY);
        throw null;
    }

    @Override // com.segment.analytics.kotlin.core.AbstractC12774a
    /* JADX INFO: renamed from: h, reason: from getter */
    public final EnumC8319o getF40475c() {
        return this.f40465c;
    }

    @Override // com.segment.analytics.kotlin.core.AbstractC12774a
    public final int hashCode() {
        return this.f40464b.f53331Y.hashCode() + AbstractC0168G.m527p(super.hashCode() * 31, 31, this.f40463a);
    }

    @Override // com.segment.analytics.kotlin.core.AbstractC12774a
    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getF40473a() {
        return this.f40470h;
    }

    @Override // com.segment.analytics.kotlin.core.AbstractC12774a
    /* JADX INFO: renamed from: j, reason: from getter */
    public final DestinationMetadata getF40481i() {
        return this.f40471i;
    }

    @Override // com.segment.analytics.kotlin.core.AbstractC12774a
    /* JADX INFO: renamed from: k */
    public final void mo14514k(String str) {
        AbstractC16544l.m18094g(str, "<set-?>");
        this.f40467e = str;
    }

    @Override // com.segment.analytics.kotlin.core.AbstractC12774a
    /* JADX INFO: renamed from: l */
    public final void mo14515l(C16644c c16644c) {
        AbstractC16544l.m18094g(c16644c, "<set-?>");
        this.f40469g = c16644c;
    }

    @Override // com.segment.analytics.kotlin.core.AbstractC12774a
    /* JADX INFO: renamed from: m */
    public final void mo14516m(C16644c c16644c) {
        AbstractC16544l.m18094g(c16644c, "<set-?>");
        this.f40468f = c16644c;
    }

    @Override // com.segment.analytics.kotlin.core.AbstractC12774a
    /* JADX INFO: renamed from: n */
    public final void mo14517n(String str) {
        AbstractC16544l.m18094g(str, "<set-?>");
        this.f40466d = str;
    }

    @Override // com.segment.analytics.kotlin.core.AbstractC12774a
    /* JADX INFO: renamed from: o */
    public final void mo14518o(String str) {
        AbstractC16544l.m18094g(str, "<set-?>");
        this.f40472j = str;
    }

    @Override // com.segment.analytics.kotlin.core.AbstractC12774a
    /* JADX INFO: renamed from: p */
    public final void mo14519p(String str) {
        AbstractC16544l.m18094g(str, "<set-?>");
        this.f40470h = str;
    }

    @Override // com.segment.analytics.kotlin.core.AbstractC12774a
    /* JADX INFO: renamed from: q */
    public final void mo14520q(DestinationMetadata destinationMetadata) {
        AbstractC16544l.m18094g(destinationMetadata, "<set-?>");
        this.f40471i = destinationMetadata;
    }

    public final String toString() {
        return "GroupEvent(groupId=" + this.f40463a + ", traits=" + this.f40464b + ')';
    }
}
