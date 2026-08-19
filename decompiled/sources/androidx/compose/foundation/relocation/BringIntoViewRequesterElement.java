package androidx.compose.foundation.relocation;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p1013t0.C19715c;
import p1013t0.C19716d;
import p1140z1.AbstractC21672S;
import p635a1.AbstractC10458p;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m18067d2 = {"Landroidx/compose/foundation/relocation/BringIntoViewRequesterElement;", "Lz1/S;", "Lt0/d;", "foundation_release"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
final class BringIntoViewRequesterElement extends AbstractC21672S {

    /* JADX INFO: renamed from: Y */
    public final C19715c f32548Y;

    public BringIntoViewRequesterElement(C19715c c19715c) {
        this.f32548Y = c19715c;
    }

    @Override // p1140z1.AbstractC21672S
    /* JADX INFO: renamed from: a */
    public final AbstractC10458p mo11196a() {
        C19716d c19716d = new C19716d();
        c19716d.f62416z0 = this.f32548Y;
        return c19716d;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BringIntoViewRequesterElement) {
                if (AbstractC16544l.m18089b(this.f32548Y, ((BringIntoViewRequesterElement) obj).f32548Y)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f32548Y.hashCode();
    }

    @Override // p1140z1.AbstractC21672S
    /* JADX INFO: renamed from: i */
    public final void mo11197i(AbstractC10458p abstractC10458p) {
        C19716d c19716d = (C19716d) abstractC10458p;
        C19715c c19715c = c19716d.f62416z0;
        if (c19715c instanceof C19715c) {
            AbstractC16544l.m18092e(c19715c, "null cannot be cast to non-null type androidx.compose.foundation.relocation.BringIntoViewRequesterImpl");
            c19715c.f62415a.m7110o(c19716d);
        }
        C19715c c19715c2 = this.f32548Y;
        if (c19715c2 instanceof C19715c) {
            c19715c2.f62415a.m7099c(c19716d);
        }
        c19716d.f62416z0 = c19715c2;
    }
}
