package androidx.compose.foundation.text.modifiers;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p054C0.C1492e;
import p054C0.C1505r;
import p1140z1.AbstractC21672S;
import p1140z1.AbstractC21690f;
import p204I1.C3582M;
import p328N1.InterfaceC5598n;
import p571X9.AbstractC9113C4;
import p571X9.AbstractC9160K3;
import p571X9.AbstractC9388w4;
import p635a1.AbstractC10458p;
import p774h1.InterfaceC14366v;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m18066d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m18067d2 = {"Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;", "Lz1/S;", "LC0/r;", "Lh1/v;", "color", "Lh1/v;", "foundation_release"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class TextStringSimpleElement extends AbstractC21672S {

    /* JADX INFO: renamed from: Y */
    public final String f32631Y;

    /* JADX INFO: renamed from: Z */
    public final C3582M f32632Z;
    private final InterfaceC14366v color;

    /* JADX INFO: renamed from: o0 */
    public final InterfaceC5598n f32633o0;

    /* JADX INFO: renamed from: p0 */
    public final int f32634p0;

    /* JADX INFO: renamed from: q0 */
    public final boolean f32635q0;

    /* JADX INFO: renamed from: r0 */
    public final int f32636r0;

    /* JADX INFO: renamed from: s0 */
    public final int f32637s0;

    public TextStringSimpleElement(String str, C3582M c3582m, InterfaceC5598n interfaceC5598n, int i10, boolean z6, int i11, int i12, InterfaceC14366v interfaceC14366v) {
        this.f32631Y = str;
        this.f32632Z = c3582m;
        this.f32633o0 = interfaceC5598n;
        this.f32634p0 = i10;
        this.f32635q0 = z6;
        this.f32636r0 = i11;
        this.f32637s0 = i12;
        this.color = interfaceC14366v;
    }

    @Override // p1140z1.AbstractC21672S
    /* JADX INFO: renamed from: a */
    public final AbstractC10458p mo11196a() {
        InterfaceC14366v interfaceC14366v = this.color;
        C1505r c1505r = new C1505r();
        c1505r.f4019z0 = this.f32631Y;
        c1505r.f4008A0 = this.f32632Z;
        c1505r.f4009B0 = this.f32633o0;
        c1505r.f4010C0 = this.f32634p0;
        c1505r.f4011D0 = this.f32635q0;
        c1505r.f4012E0 = this.f32636r0;
        c1505r.f4013F0 = this.f32637s0;
        c1505r.f4014G0 = interfaceC14366v;
        return c1505r;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextStringSimpleElement)) {
            return false;
        }
        TextStringSimpleElement textStringSimpleElement = (TextStringSimpleElement) obj;
        return AbstractC16544l.m18089b(this.color, textStringSimpleElement.color) && AbstractC16544l.m18089b(this.f32631Y, textStringSimpleElement.f32631Y) && AbstractC16544l.m18089b(this.f32632Z, textStringSimpleElement.f32632Z) && AbstractC16544l.m18089b(this.f32633o0, textStringSimpleElement.f32633o0) && AbstractC9160K3.m9708a(this.f32634p0, textStringSimpleElement.f32634p0) && this.f32635q0 == textStringSimpleElement.f32635q0 && this.f32636r0 == textStringSimpleElement.f32636r0 && this.f32637s0 == textStringSimpleElement.f32637s0;
    }

    public final int hashCode() {
        int iHashCode = (((((((((this.f32633o0.hashCode() + ((this.f32632Z.hashCode() + (this.f32631Y.hashCode() * 31)) * 31)) * 31) + this.f32634p0) * 31) + (this.f32635q0 ? 1231 : 1237)) * 31) + this.f32636r0) * 31) + this.f32637s0) * 31;
        InterfaceC14366v interfaceC14366v = this.color;
        return iHashCode + (interfaceC14366v != null ? interfaceC14366v.hashCode() : 0);
    }

    @Override // p1140z1.AbstractC21672S
    /* JADX INFO: renamed from: i */
    public final void mo11197i(AbstractC10458p abstractC10458p) {
        boolean z6;
        C1505r c1505r = (C1505r) abstractC10458p;
        InterfaceC14366v interfaceC14366v = this.color;
        boolean zM18089b = AbstractC16544l.m18089b(interfaceC14366v, c1505r.f4014G0);
        c1505r.f4014G0 = interfaceC14366v;
        boolean z10 = true;
        C3582M c3582m = this.f32632Z;
        boolean z11 = (zM18089b && c3582m.m4278e(c1505r.f4008A0)) ? false : true;
        String str = c1505r.f4019z0;
        String str2 = this.f32631Y;
        if (AbstractC16544l.m18089b(str, str2)) {
            z6 = false;
        } else {
            c1505r.f4019z0 = str2;
            c1505r.f4018K0 = null;
            z6 = true;
        }
        boolean z12 = !c1505r.f4008A0.m4279f(c3582m);
        c1505r.f4008A0 = c3582m;
        int i10 = c1505r.f4013F0;
        int i11 = this.f32637s0;
        if (i10 != i11) {
            c1505r.f4013F0 = i11;
            z12 = true;
        }
        int i12 = c1505r.f4012E0;
        int i13 = this.f32636r0;
        if (i12 != i13) {
            c1505r.f4012E0 = i13;
            z12 = true;
        }
        boolean z13 = c1505r.f4011D0;
        boolean z14 = this.f32635q0;
        if (z13 != z14) {
            c1505r.f4011D0 = z14;
            z12 = true;
        }
        InterfaceC5598n interfaceC5598n = c1505r.f4009B0;
        InterfaceC5598n interfaceC5598n2 = this.f32633o0;
        if (!AbstractC16544l.m18089b(interfaceC5598n, interfaceC5598n2)) {
            c1505r.f4009B0 = interfaceC5598n2;
            z12 = true;
        }
        int i14 = c1505r.f4010C0;
        int i15 = this.f32634p0;
        if (AbstractC9160K3.m9708a(i14, i15)) {
            z10 = z12;
        } else {
            c1505r.f4010C0 = i15;
        }
        if (z6 || z10) {
            C1492e c1492eM2167K0 = c1505r.m2167K0();
            String str3 = c1505r.f4019z0;
            C3582M c3582m2 = c1505r.f4008A0;
            InterfaceC5598n interfaceC5598n3 = c1505r.f4009B0;
            int i16 = c1505r.f4010C0;
            boolean z15 = c1505r.f4011D0;
            int i17 = c1505r.f4012E0;
            int i18 = c1505r.f4013F0;
            c1492eM2167K0.f3936a = str3;
            c1492eM2167K0.f3937b = c3582m2;
            c1492eM2167K0.f3938c = interfaceC5598n3;
            c1492eM2167K0.f3939d = i16;
            c1492eM2167K0.f3940e = z15;
            c1492eM2167K0.f3941f = i17;
            c1492eM2167K0.f3942g = i18;
            c1492eM2167K0.f3945j = null;
            c1492eM2167K0.f3949n = null;
            c1492eM2167K0.f3950o = null;
            c1492eM2167K0.f3952q = -1;
            c1492eM2167K0.f3953r = -1;
            c1492eM2167K0.f3951p = AbstractC9388w4.m9966i(0, 0, 0, 0);
            c1492eM2167K0.f3947l = AbstractC9113C4.m9643a(0, 0);
            c1492eM2167K0.f3946k = false;
        }
        if (c1505r.f30972y0) {
            if (z6 || (z11 && c1505r.f4017J0 != null)) {
                AbstractC21690f.m22211p(c1505r);
            }
            if (z6 || z10) {
                AbstractC21690f.m22210o(c1505r);
                AbstractC21690f.m22209n(c1505r);
            }
            if (z11) {
                AbstractC21690f.m22209n(c1505r);
            }
        }
    }
}
