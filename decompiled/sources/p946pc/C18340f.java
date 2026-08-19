package p946pc;

import androidx.compose.foundation.layout.AbstractC10842a;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p003A1.AbstractC0168G;
import p049Bm.InterfaceC1441p;
import p1095x1.AbstractC21075b0;
import p1140z1.C21694h;
import p1140z1.C21696i;
import p1140z1.C21698j;
import p1140z1.InterfaceC21700k;
import p204I1.C3582M;
import p349O0.C5997d;
import p349O0.C6021p;
import p349O0.C6042z0;
import p349O0.InterfaceC6008i0;
import p537W0.AbstractC8411c;
import p537W0.C8410b;
import p635a1.InterfaceC10459q;
import p911o0.AbstractC17780r;
import p911o0.C17782s;

/* JADX INFO: renamed from: pc.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C18340f extends AbstractC16546n implements InterfaceC1441p {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ InterfaceC10459q f58544Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ float f58545Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C3582M f58546o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C8410b f58547p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18340f(InterfaceC10459q interfaceC10459q, float f10, C3582M c3582m, C8410b c8410b) {
        super(4);
        this.f58544Y = interfaceC10459q;
        this.f58545Z = f10;
        this.f58546o0 = c3582m;
        this.f58547p0 = c8410b;
    }

    @Override // p049Bm.InterfaceC1441p
    /* JADX INFO: renamed from: d */
    public final Object mo985d(Object obj, Object obj2, Object obj3, Object obj4) {
        int i10;
        C18320E CodeBlockLayout = (C18320E) obj;
        InterfaceC10459q layoutModifier = (InterfaceC10459q) obj2;
        C6021p c6021p = (C6021p) obj3;
        int iIntValue = ((Number) obj4).intValue();
        AbstractC16544l.m18094g(CodeBlockLayout, "$this$CodeBlockLayout");
        AbstractC16544l.m18094g(layoutModifier, "layoutModifier");
        if ((iIntValue & 14) == 0) {
            i10 = (c6021p.m6542f(CodeBlockLayout) ? 4 : 2) | iIntValue;
        } else {
            i10 = iIntValue;
        }
        if ((iIntValue & 112) == 0) {
            i10 |= c6021p.m6542f(layoutModifier) ? 32 : 16;
        }
        if ((i10 & 731) == 146 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            InterfaceC10459q interfaceC10459qM11233k = AbstractC10842a.m11233k(layoutModifier.mo428M(this.f58544Y), this.f58545Z);
            c6021p.m6525T(733328855);
            C17782s c17782sM19512f = AbstractC17780r.m19512f(0, c6021p, false);
            c6021p.m6525T(-1323940314);
            int i11 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
            InterfaceC21700k.f68875m0.getClass();
            C21696i c21696i = C21698j.f68869b;
            C8410b c8410bM21570k = AbstractC21075b0.m21570k(interfaceC10459qM11233k);
            c6021p.m6528W();
            if (c6021p.f19563O) {
                c6021p.m6549l(c21696i);
            } else {
                c6021p.m6543f0();
            }
            C5997d.m6439Z(C21698j.f68873f, c6021p, c17782sM19512f);
            C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m);
            C21694h c21694h = C21698j.f68874g;
            if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i11))) {
                AbstractC0168G.m537z(i11, c6021p, i11, c21694h);
            }
            c8410bM21570k.invoke(new C6042z0(c6021p), c6021p, 0);
            c6021p.m6525T(2058660585);
            AbstractC18324I.m19851a(CodeBlockLayout, c6021p).mo985d(this.f58546o0, AbstractC8411c.m8968b(206168572, c6021p, new C18339e(this.f58547p0, CodeBlockLayout, 0)), c6021p, 48);
            c6021p.m6553p(false);
            c6021p.m6553p(true);
            c6021p.m6553p(false);
            c6021p.m6553p(false);
        }
        return C17296C.f55119a;
    }
}
