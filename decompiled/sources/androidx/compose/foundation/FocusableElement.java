package androidx.compose.foundation;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p1140z1.AbstractC21672S;
import p635a1.AbstractC10458p;
import p773h0.C14256K;
import p894n0.InterfaceC17406l;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m18067d2 = {"Landroidx/compose/foundation/FocusableElement;", "Lz1/S;", "Lh0/K;", "foundation_release"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
final class FocusableElement extends AbstractC21672S {

    /* JADX INFO: renamed from: Y */
    public final InterfaceC17406l f32399Y;

    public FocusableElement(InterfaceC17406l interfaceC17406l) {
        this.f32399Y = interfaceC17406l;
    }

    @Override // p1140z1.AbstractC21672S
    /* JADX INFO: renamed from: a */
    public final AbstractC10458p mo11196a() {
        return new C14256K(this.f32399Y);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FocusableElement) {
            return AbstractC16544l.m18089b(this.f32399Y, ((FocusableElement) obj).f32399Y);
        }
        return false;
    }

    public final int hashCode() {
        InterfaceC17406l interfaceC17406l = this.f32399Y;
        if (interfaceC17406l != null) {
            return interfaceC17406l.hashCode();
        }
        return 0;
    }

    @Override // p1140z1.AbstractC21672S
    /* JADX INFO: renamed from: i */
    public final void mo11197i(AbstractC10458p abstractC10458p) {
        ((C14256K) abstractC10458p).m15555N0(this.f32399Y);
    }
}
