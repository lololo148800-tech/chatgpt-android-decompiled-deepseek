package com.openai.feature.messages.impl.listitem.content.reference.sports;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import mm.C17321x;
import p069Cf.C1644c;
import p1140z1.AbstractC21672S;
import p635a1.AbstractC10458p;
import p773h0.C14322z0;
import p774h1.C14365u;
import p775h2.AbstractC14376f;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m18067d2 = {"Lcom/openai/feature/messages/impl/listitem/content/reference/sports/FadingEdgeModifier;", "Lz1/S;", "LCf/c;", "impl_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
final /* data */ class FadingEdgeModifier extends AbstractC21672S {

    /* JADX INFO: renamed from: Y */
    public final C14322z0 f38835Y;

    /* JADX INFO: renamed from: Z */
    public final long f38836Z;

    /* JADX INFO: renamed from: o0 */
    public final long f38837o0;

    public FadingEdgeModifier(C14322z0 c14322z0, long j10, long j11) {
        this.f38835Y = c14322z0;
        this.f38836Z = j10;
        this.f38837o0 = j11;
    }

    @Override // p1140z1.AbstractC21672S
    /* JADX INFO: renamed from: a */
    public final AbstractC10458p mo11196a() {
        return new C1644c(this.f38835Y, this.f38836Z, this.f38837o0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FadingEdgeModifier)) {
            return false;
        }
        FadingEdgeModifier fadingEdgeModifier = (FadingEdgeModifier) obj;
        return AbstractC16544l.m18089b(this.f38835Y, fadingEdgeModifier.f38835Y) && C14365u.m15775c(this.f38836Z, fadingEdgeModifier.f38836Z) && C14365u.m15775c(this.f38837o0, fadingEdgeModifier.f38837o0);
    }

    public final int hashCode() {
        int iHashCode = this.f38835Y.hashCode() * 31;
        int i10 = C14365u.f45061k;
        return C17321x.m18981a(this.f38837o0) + AbstractC14376f.m15857w(this.f38836Z, iHashCode, 31);
    }

    @Override // p1140z1.AbstractC21672S
    /* JADX INFO: renamed from: i */
    public final void mo11197i(AbstractC10458p abstractC10458p) {
        C1644c node = (C1644c) abstractC10458p;
        AbstractC16544l.m18094g(node, "node");
        node.f4656z0.setValue(this.f38835Y);
        node.f4652A0.setValue(new C14365u(this.f38836Z));
        node.f4653B0.setValue(new C14365u(this.f38837o0));
    }

    public final String toString() {
        return "█";
    }
}
