package androidx.compose.foundation;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p1140z1.AbstractC21672S;
import p1140z1.InterfaceC21704m;
import p635a1.AbstractC10458p;
import p773h0.C14272a0;
import p773h0.InterfaceC14274b0;
import p894n0.InterfaceC17406l;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m18067d2 = {"Landroidx/compose/foundation/IndicationModifierElement;", "Lz1/S;", "Lh0/a0;", "foundation_release"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
final class IndicationModifierElement extends AbstractC21672S {

    /* JADX INFO: renamed from: Y */
    public final InterfaceC17406l f32401Y;

    /* JADX INFO: renamed from: Z */
    public final InterfaceC14274b0 f32402Z;

    public IndicationModifierElement(InterfaceC17406l interfaceC17406l, InterfaceC14274b0 interfaceC14274b0) {
        this.f32401Y = interfaceC17406l;
        this.f32402Z = interfaceC14274b0;
    }

    @Override // p1140z1.AbstractC21672S
    /* JADX INFO: renamed from: a */
    public final AbstractC10458p mo11196a() {
        InterfaceC21704m interfaceC21704mMo11283a = this.f32402Z.mo11283a(this.f32401Y);
        C14272a0 c14272a0 = new C14272a0();
        c14272a0.f44775B0 = interfaceC21704mMo11283a;
        c14272a0.m22223K0(interfaceC21704mMo11283a);
        return c14272a0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IndicationModifierElement)) {
            return false;
        }
        IndicationModifierElement indicationModifierElement = (IndicationModifierElement) obj;
        return AbstractC16544l.m18089b(this.f32401Y, indicationModifierElement.f32401Y) && AbstractC16544l.m18089b(this.f32402Z, indicationModifierElement.f32402Z);
    }

    public final int hashCode() {
        return this.f32402Z.hashCode() + (this.f32401Y.hashCode() * 31);
    }

    @Override // p1140z1.AbstractC21672S
    /* JADX INFO: renamed from: i */
    public final void mo11197i(AbstractC10458p abstractC10458p) {
        C14272a0 c14272a0 = (C14272a0) abstractC10458p;
        InterfaceC21704m interfaceC21704mMo11283a = this.f32402Z.mo11283a(this.f32401Y);
        c14272a0.m22224L0(c14272a0.f44775B0);
        c14272a0.f44775B0 = interfaceC21704mMo11283a;
        c14272a0.m22223K0(interfaceC21704mMo11283a);
    }
}
