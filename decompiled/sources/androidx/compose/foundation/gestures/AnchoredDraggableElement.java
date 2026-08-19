package androidx.compose.foundation.gestures;

import android.gov.nist.javax.sip.parser.TokenNames;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p1140z1.AbstractC21672S;
import p635a1.AbstractC10458p;
import p773h0.InterfaceC14300o0;
import p860l0.C16725b;
import p860l0.C16758m;
import p860l0.C16782u;
import p860l0.EnumC16673F0;
import p894n0.InterfaceC17406l;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m18066d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002¨\u0006\u0004"}, m18067d2 = {"Landroidx/compose/foundation/gestures/AnchoredDraggableElement;", TokenNames.f32019T, "Lz1/S;", "Ll0/m;", "foundation_release"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
final class AnchoredDraggableElement<T> extends AbstractC21672S {

    /* JADX INFO: renamed from: Y */
    public final C16782u f32447Y;

    /* JADX INFO: renamed from: Z */
    public final EnumC16673F0 f32448Z;

    /* JADX INFO: renamed from: o0 */
    public final boolean f32449o0;

    /* JADX INFO: renamed from: p0 */
    public final InterfaceC17406l f32450p0;

    /* JADX INFO: renamed from: q0 */
    public final boolean f32451q0;

    /* JADX INFO: renamed from: r0 */
    public final InterfaceC14300o0 f32452r0;

    public AnchoredDraggableElement(C16782u c16782u, EnumC16673F0 enumC16673F0, boolean z6, InterfaceC17406l interfaceC17406l, boolean z10, InterfaceC14300o0 interfaceC14300o0) {
        this.f32447Y = c16782u;
        this.f32448Z = enumC16673F0;
        this.f32449o0 = z6;
        this.f32450p0 = interfaceC17406l;
        this.f32451q0 = z10;
        this.f32452r0 = interfaceC14300o0;
    }

    @Override // p1140z1.AbstractC21672S
    /* JADX INFO: renamed from: a */
    public final AbstractC10458p mo11196a() {
        C16725b c16725b = C16725b.f53595Z;
        EnumC16673F0 enumC16673F0 = this.f32448Z;
        C16758m c16758m = new C16758m(c16725b, this.f32449o0, this.f32450p0, enumC16673F0);
        c16758m.f53767J0 = this.f32447Y;
        c16758m.f53768K0 = enumC16673F0;
        c16758m.f53769L0 = this.f32452r0;
        c16758m.f53770M0 = this.f32451q0;
        return c16758m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnchoredDraggableElement)) {
            return false;
        }
        AnchoredDraggableElement anchoredDraggableElement = (AnchoredDraggableElement) obj;
        return AbstractC16544l.m18089b(this.f32447Y, anchoredDraggableElement.f32447Y) && this.f32448Z == anchoredDraggableElement.f32448Z && this.f32449o0 == anchoredDraggableElement.f32449o0 && AbstractC16544l.m18089b(null, null) && AbstractC16544l.m18089b(this.f32450p0, anchoredDraggableElement.f32450p0) && this.f32451q0 == anchoredDraggableElement.f32451q0 && AbstractC16544l.m18089b(this.f32452r0, anchoredDraggableElement.f32452r0);
    }

    public final int hashCode() {
        int iHashCode = (((this.f32448Z.hashCode() + (this.f32447Y.hashCode() * 31)) * 31) + (this.f32449o0 ? 1231 : 1237)) * 961;
        InterfaceC17406l interfaceC17406l = this.f32450p0;
        int iHashCode2 = (((iHashCode + (interfaceC17406l != null ? interfaceC17406l.hashCode() : 0)) * 31) + (this.f32451q0 ? 1231 : 1237)) * 31;
        InterfaceC14300o0 interfaceC14300o0 = this.f32452r0;
        return iHashCode2 + (interfaceC14300o0 != null ? interfaceC14300o0.hashCode() : 0);
    }

    @Override // p1140z1.AbstractC21672S
    /* JADX INFO: renamed from: i */
    public final void mo11197i(AbstractC10458p abstractC10458p) {
        boolean z6;
        C16758m c16758m = (C16758m) abstractC10458p;
        C16782u c16782u = c16758m.f53767J0;
        C16782u c16782u2 = this.f32447Y;
        if (AbstractC16544l.m18089b(c16782u, c16782u2)) {
            z6 = false;
        } else {
            c16758m.f53767J0 = c16782u2;
            z6 = true;
        }
        EnumC16673F0 enumC16673F0 = c16758m.f53768K0;
        EnumC16673F0 enumC16673F1 = this.f32448Z;
        if (enumC16673F0 != enumC16673F1) {
            c16758m.f53768K0 = enumC16673F1;
            z6 = true;
        }
        boolean z10 = !AbstractC16544l.m18089b(null, null) ? true : z6;
        c16758m.f53770M0 = this.f32451q0;
        c16758m.f53769L0 = this.f32452r0;
        c16758m.m18543V0(c16758m.f53840C0, this.f32449o0, this.f32450p0, enumC16673F1, z10);
    }
}
