package androidx.compose.foundation.gestures;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p049Bm.InterfaceC1440o;
import p1140z1.AbstractC21672S;
import p635a1.AbstractC10458p;
import p860l0.C16725b;
import p860l0.C16798z0;
import p860l0.EnumC16673F0;
import p860l0.InterfaceC16658A0;
import p894n0.InterfaceC17406l;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m18067d2 = {"Landroidx/compose/foundation/gestures/DraggableElement;", "Lz1/S;", "Ll0/z0;", "foundation_release"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class DraggableElement extends AbstractC21672S {

    /* JADX INFO: renamed from: Y */
    public final InterfaceC16658A0 f32453Y;

    /* JADX INFO: renamed from: Z */
    public final boolean f32454Z;

    /* JADX INFO: renamed from: o0 */
    public final InterfaceC17406l f32455o0;

    /* JADX INFO: renamed from: p0 */
    public final boolean f32456p0;

    /* JADX INFO: renamed from: q0 */
    public final InterfaceC1440o f32457q0;

    /* JADX INFO: renamed from: r0 */
    public final InterfaceC1440o f32458r0;

    /* JADX INFO: renamed from: s0 */
    public final boolean f32459s0;

    public DraggableElement(InterfaceC16658A0 interfaceC16658A0, boolean z6, InterfaceC17406l interfaceC17406l, boolean z10, InterfaceC1440o interfaceC1440o, InterfaceC1440o interfaceC1440o2, boolean z11) {
        this.f32453Y = interfaceC16658A0;
        this.f32454Z = z6;
        this.f32455o0 = interfaceC17406l;
        this.f32456p0 = z10;
        this.f32457q0 = interfaceC1440o;
        this.f32458r0 = interfaceC1440o2;
        this.f32459s0 = z11;
    }

    @Override // p1140z1.AbstractC21672S
    /* JADX INFO: renamed from: a */
    public final AbstractC10458p mo11196a() {
        C16725b c16725b = C16725b.f53601t0;
        EnumC16673F0 enumC16673F0 = EnumC16673F0.f53401Y;
        C16798z0 c16798z0 = new C16798z0(c16725b, this.f32454Z, this.f32455o0, enumC16673F0);
        c16798z0.f53909J0 = this.f32453Y;
        c16798z0.f53910K0 = enumC16673F0;
        c16798z0.f53911L0 = this.f32456p0;
        c16798z0.f53912M0 = this.f32457q0;
        c16798z0.f53913N0 = this.f32458r0;
        c16798z0.f53914O0 = this.f32459s0;
        return c16798z0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DraggableElement.class != obj.getClass()) {
            return false;
        }
        DraggableElement draggableElement = (DraggableElement) obj;
        return AbstractC16544l.m18089b(this.f32453Y, draggableElement.f32453Y) && this.f32454Z == draggableElement.f32454Z && AbstractC16544l.m18089b(this.f32455o0, draggableElement.f32455o0) && this.f32456p0 == draggableElement.f32456p0 && AbstractC16544l.m18089b(this.f32457q0, draggableElement.f32457q0) && AbstractC16544l.m18089b(this.f32458r0, draggableElement.f32458r0) && this.f32459s0 == draggableElement.f32459s0;
    }

    public final int hashCode() {
        int iHashCode = (((EnumC16673F0.f53401Y.hashCode() + (this.f32453Y.hashCode() * 31)) * 31) + (this.f32454Z ? 1231 : 1237)) * 31;
        InterfaceC17406l interfaceC17406l = this.f32455o0;
        return ((this.f32458r0.hashCode() + ((this.f32457q0.hashCode() + ((((iHashCode + (interfaceC17406l != null ? interfaceC17406l.hashCode() : 0)) * 31) + (this.f32456p0 ? 1231 : 1237)) * 31)) * 31)) * 31) + (this.f32459s0 ? 1231 : 1237);
    }

    @Override // p1140z1.AbstractC21672S
    /* JADX INFO: renamed from: i */
    public final void mo11197i(AbstractC10458p abstractC10458p) {
        boolean z6;
        boolean z10;
        C16798z0 c16798z0 = (C16798z0) abstractC10458p;
        C16725b c16725b = C16725b.f53601t0;
        InterfaceC16658A0 interfaceC16658A0 = c16798z0.f53909J0;
        InterfaceC16658A0 interfaceC16658A1 = this.f32453Y;
        if (AbstractC16544l.m18089b(interfaceC16658A0, interfaceC16658A1)) {
            z6 = false;
        } else {
            c16798z0.f53909J0 = interfaceC16658A1;
            z6 = true;
        }
        EnumC16673F0 enumC16673F0 = c16798z0.f53910K0;
        EnumC16673F0 enumC16673F1 = EnumC16673F0.f53401Y;
        if (enumC16673F0 != enumC16673F1) {
            c16798z0.f53910K0 = enumC16673F1;
            z6 = true;
        }
        boolean z11 = c16798z0.f53914O0;
        boolean z12 = this.f32459s0;
        if (z11 != z12) {
            c16798z0.f53914O0 = z12;
            z10 = true;
        } else {
            z10 = z6;
        }
        c16798z0.f53912M0 = this.f32457q0;
        c16798z0.f53913N0 = this.f32458r0;
        c16798z0.f53911L0 = this.f32456p0;
        c16798z0.m18543V0(c16725b, this.f32454Z, this.f32455o0, enumC16673F1, z10);
    }
}
