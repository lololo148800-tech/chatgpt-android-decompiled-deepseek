package af;

import androidx.compose.foundation.layout.AbstractC10844c;
import bf.C11349D;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p003A1.AbstractC0168G;
import p049Bm.InterfaceC1439n;
import p1140z1.C21694h;
import p1140z1.C21696i;
import p1140z1.C21698j;
import p1140z1.InterfaceC21700k;
import p229J0.AbstractC3947L4;
import p229J0.AbstractC4124r4;
import p229J0.C3941K4;
import p349O0.C5997d;
import p349O0.C6021p;
import p349O0.InterfaceC6008i0;
import p467T1.C7199i;
import p478Tc.AbstractC7312p;
import p478Tc.AbstractC7313q;
import p594Y9.AbstractC9815U2;
import p635a1.AbstractC10443a;
import p635a1.C10444b;
import p635a1.C10450h;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p911o0.AbstractC17758g;
import p911o0.AbstractC17770m;
import p911o0.AbstractC17777p0;
import p911o0.C17756f;
import p911o0.C17764j;
import p911o0.C17781r0;

/* JADX INFO: renamed from: af.N */
/* JADX INFO: loaded from: classes3.dex */
public final class C10558N extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ String f31341Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C11349D f31342Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ float f31343o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10558N(String str, C11349D c11349d, float f10) {
        super(2);
        this.f31341Y = str;
        this.f31342Z = c11349d;
        this.f31343o0 = f10;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C6021p c6021p;
        C6021p c6021p2 = (C6021p) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c6021p2.m6562y()) {
            c6021p2.m6517L();
        } else {
            C10450h c10450h = C10444b.f30944w0;
            C17756f c17756f = AbstractC17770m.f56724a;
            C17764j c17764jM19500g = AbstractC17770m.m19500g(AbstractC7313q.f23199d);
            C10456n c10456n = C10456n.f30959Y;
            C17781r0 c17781r0M19506b = AbstractC17777p0.m19506b(c17764jM19500g, c10450h, c6021p2, 48);
            int i10 = c6021p2.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m = c6021p2.m6550m();
            InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p2, c10456n);
            InterfaceC21700k.f68875m0.getClass();
            C21696i c21696i = C21698j.f68869b;
            c6021p2.m6528W();
            if (c6021p2.f19563O) {
                c6021p2.m6549l(c21696i);
            } else {
                c6021p2.m6543f0();
            }
            C5997d.m6439Z(C21698j.f68873f, c6021p2, c17781r0M19506b);
            C5997d.m6439Z(C21698j.f68872e, c6021p2, interfaceC6008i0M6550m);
            C21694h c21694h = C21698j.f68874g;
            if (c6021p2.f19563O || !AbstractC16544l.m18089b(c6021p2.m6514H(), Integer.valueOf(i10))) {
                AbstractC0168G.m537z(i10, c6021p2, i10, c21694h);
            }
            C5997d.m6439Z(C21698j.f68871d, c6021p2, interfaceC10459qM10923d);
            c6021p2.m6524S(1273249052);
            String str = this.f31341Y;
            if (str != null) {
                c6021p = c6021p2;
                AbstractC4124r4.m4768b(str, AbstractC10844c.m11256p(c10456n, AbstractC7313q.f23203h), 0L, 0L, null, null, null, 0L, null, new C7199i(6), 0L, 0, false, 0, 0, null, ((C3941K4) c6021p2.m6548k(AbstractC3947L4.f12183a)).f12152h, c6021p, 0, 0, 65020);
            } else {
                c6021p = c6021p2;
            }
            C6021p c6021p3 = c6021p;
            c6021p3.m6553p(false);
            AbstractC9815U2.m10444c(this.f31342Z, AbstractC10844c.m11252l(c10456n, this.f31343o0), c6021p3, 0);
            c6021p3.m6524S(1273261853);
            if (str != null) {
                AbstractC17758g.m19482b(c6021p3, AbstractC10844c.m11256p(c10456n, (AbstractC7312p.f23189f - AbstractC7312p.f23188e) - AbstractC7313q.f23201f));
            }
            c6021p3.m6553p(false);
            c6021p3.m6553p(true);
        }
        return C17296C.f55119a;
    }
}
