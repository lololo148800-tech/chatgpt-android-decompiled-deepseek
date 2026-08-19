package androidx.compose.foundation.lazy.layout;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p1140z1.AbstractC21672S;
import p635a1.AbstractC10458p;
import p953q0.C18566Y;
import p953q0.C18591l0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0083\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m18067d2 = {"Landroidx/compose/foundation/lazy/layout/TraversablePrefetchStateModifierElement;", "Lz1/S;", "Lq0/l0;", "foundation_release"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
final /* data */ class TraversablePrefetchStateModifierElement extends AbstractC21672S {

    /* JADX INFO: renamed from: Y */
    public final C18566Y f32532Y;

    public TraversablePrefetchStateModifierElement(C18566Y c18566y) {
        this.f32532Y = c18566y;
    }

    @Override // p1140z1.AbstractC21672S
    /* JADX INFO: renamed from: a */
    public final AbstractC10458p mo11196a() {
        C18591l0 c18591l0 = new C18591l0();
        c18591l0.f59229z0 = this.f32532Y;
        return c18591l0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TraversablePrefetchStateModifierElement) && AbstractC16544l.m18089b(this.f32532Y, ((TraversablePrefetchStateModifierElement) obj).f32532Y);
    }

    public final int hashCode() {
        return this.f32532Y.hashCode();
    }

    @Override // p1140z1.AbstractC21672S
    /* JADX INFO: renamed from: i */
    public final void mo11197i(AbstractC10458p abstractC10458p) {
        ((C18591l0) abstractC10458p).f59229z0 = this.f32532Y;
    }

    public final String toString() {
        return "TraversablePrefetchStateModifierElement(prefetchState=" + this.f32532Y + ')';
    }
}
