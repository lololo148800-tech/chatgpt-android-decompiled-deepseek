package p194Hg;

import androidx.compose.foundation.layout.AbstractC10844c;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p003A1.AbstractC0168G;
import p049Bm.InterfaceC1439n;
import p1140z1.C21694h;
import p1140z1.C21696i;
import p1140z1.C21698j;
import p1140z1.InterfaceC21700k;
import p1155zi.C21891A;
import p1155zi.C22038o;
import p229J0.AbstractC3947L4;
import p229J0.AbstractC4124r4;
import p229J0.C3941K4;
import p349O0.C5984W0;
import p349O0.C5997d;
import p349O0.C6021p;
import p349O0.InterfaceC6008i0;
import p478Tc.AbstractC7312p;
import p523V9.AbstractC8142m4;
import p523V9.AbstractC8152n6;
import p594Y9.AbstractC9793Q3;
import p635a1.AbstractC10443a;
import p635a1.C10444b;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p911o0.AbstractC17770m;
import p911o0.AbstractC17788v;
import p911o0.C17790w;

/* JADX INFO: renamed from: Hg.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C3424d extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f10439Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C21891A f10440Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3424d(C21891A c21891a, int i10) {
        super(2);
        this.f10439Y = i10;
        this.f10440Z = c21891a;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        String str;
        switch (this.f10439Y) {
            case 0:
                C6021p c6021p = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p.m6562y()) {
                    c6021p.m6517L();
                } else {
                    C10456n c10456n = C10456n.f30959Y;
                    C17790w c17790wM19515a = AbstractC17788v.m19515a(AbstractC17770m.f56726c, C10444b.f30946y0, c6021p, 0);
                    int i10 = c6021p.f19564P;
                    InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
                    InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p, c10456n);
                    InterfaceC21700k.f68875m0.getClass();
                    C21696i c21696i = C21698j.f68869b;
                    c6021p.m6528W();
                    if (c6021p.f19563O) {
                        c6021p.m6549l(c21696i);
                    } else {
                        c6021p.m6543f0();
                    }
                    C5997d.m6439Z(C21698j.f68873f, c6021p, c17790wM19515a);
                    C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m);
                    C21694h c21694h = C21698j.f68874g;
                    if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i10))) {
                        AbstractC0168G.m537z(i10, c6021p, i10, c21694h);
                    }
                    C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d);
                    C21891A c21891a = this.f10440Z;
                    C22038o c22038o = c21891a.f69415a;
                    if (c22038o == null || (str = c22038o.f69715e) == null) {
                        str = c21891a.f69416b.f69658d;
                    }
                    String str2 = str;
                    C5984W0 c5984w0 = AbstractC3947L4.f12183a;
                    AbstractC4124r4.m4768b(str2, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, ((C3941K4) c6021p.m6548k(c5984w0)).f12152h, c6021p, 0, 3072, 57342);
                    Integer numM8701f = AbstractC8152n6.m8701f(c21891a);
                    c6021p.m6524S(1521347416);
                    if (numM8701f != null) {
                        AbstractC4124r4.m4768b(AbstractC8142m4.m8676d(numM8701f.intValue(), c6021p), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 2, 0, null, ((C3941K4) c6021p.m6548k(c5984w0)).f12156l, c6021p, 0, 3072, 57342);
                    }
                    c6021p.m6553p(false);
                    c6021p.m6553p(true);
                }
                break;
            default:
                C6021p c6021p2 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p2.m6562y()) {
                    c6021p2.m6517L();
                } else {
                    C21891A c21891a2 = this.f10440Z;
                    AbstractC9793Q3.m10411a(c21891a2.m22323b(), c21891a2.m22331j(), AbstractC10844c.m11252l(C10456n.f30959Y, AbstractC7312p.f23187d), null, 0L, c6021p2, 0);
                }
                break;
        }
        return C17296C.f55119a;
    }
}
