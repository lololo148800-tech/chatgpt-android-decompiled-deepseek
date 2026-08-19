package androidx.compose.foundation;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p1140z1.AbstractC21672S;
import p635a1.AbstractC10458p;
import p773h0.C14265U;
import p894n0.InterfaceC17406l;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m18067d2 = {"Landroidx/compose/foundation/HoverableElement;", "Lz1/S;", "Lh0/U;", "foundation_release"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
final class HoverableElement extends AbstractC21672S {

    /* JADX INFO: renamed from: Y */
    public final InterfaceC17406l f32400Y;

    public HoverableElement(InterfaceC17406l interfaceC17406l) {
        this.f32400Y = interfaceC17406l;
    }

    @Override // p1140z1.AbstractC21672S
    /* JADX INFO: renamed from: a */
    public final AbstractC10458p mo11196a() {
        C14265U c14265u = new C14265U();
        c14265u.f44766z0 = this.f32400Y;
        return c14265u;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof HoverableElement) && AbstractC16544l.m18089b(((HoverableElement) obj).f32400Y, this.f32400Y);
    }

    public final int hashCode() {
        return this.f32400Y.hashCode() * 31;
    }

    @Override // p1140z1.AbstractC21672S
    /* JADX INFO: renamed from: i */
    public final void mo11197i(AbstractC10458p abstractC10458p) {
        C14265U c14265u = (C14265U) abstractC10458p;
        InterfaceC17406l interfaceC17406l = c14265u.f44766z0;
        InterfaceC17406l interfaceC17406l2 = this.f32400Y;
        if (AbstractC16544l.m18089b(interfaceC17406l, interfaceC17406l2)) {
            return;
        }
        c14265u.m15562M0();
        c14265u.f44766z0 = interfaceC17406l2;
    }
}
