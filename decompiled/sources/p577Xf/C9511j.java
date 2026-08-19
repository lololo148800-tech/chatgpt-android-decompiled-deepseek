package p577Xf;

import androidx.compose.foundation.layout.AbstractC10842a;
import androidx.compose.foundation.layout.AbstractC10844c;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p003A1.AbstractC0168G;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1442q;
import p1140z1.C21694h;
import p1140z1.C21696i;
import p1140z1.C21698j;
import p1140z1.InterfaceC21700k;
import p229J0.AbstractC3980S2;
import p349O0.C5997d;
import p349O0.C6021p;
import p349O0.InterfaceC6008i0;
import p635a1.AbstractC10443a;
import p635a1.C10444b;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p911o0.AbstractC17770m;
import p911o0.AbstractC17788v;
import p911o0.C17790w;
import p911o0.InterfaceC17763i0;

/* JADX INFO: renamed from: Xf.j */
/* JADX INFO: loaded from: classes3.dex */
public final class C9511j extends AbstractC16546n implements InterfaceC1442q {

    /* JADX INFO: renamed from: Y */
    public static final C9511j f28632Y = new C9511j(5);

    @Override // p049Bm.InterfaceC1442q
    /* JADX INFO: renamed from: j */
    public final Object mo2052j(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        InterfaceC17763i0 paddings = (InterfaceC17763i0) obj;
        C9509h anonymous$parameter$1$ = (C9509h) obj2;
        InterfaceC1436k anonymous$parameter$2$ = (InterfaceC1436k) obj3;
        C6021p c6021p = (C6021p) obj4;
        int iIntValue = ((Number) obj5).intValue();
        AbstractC16544l.m18094g(paddings, "paddings");
        AbstractC16544l.m18094g(anonymous$parameter$1$, "$anonymous$parameter$1$");
        AbstractC16544l.m18094g(anonymous$parameter$2$, "$anonymous$parameter$2$");
        if ((iIntValue & 6) == 0) {
            iIntValue |= c6021p.m6542f(paddings) ? 4 : 2;
        }
        if ((iIntValue & 1027) == 1026 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            C10456n c10456n = C10456n.f30959Y;
            InterfaceC10459q interfaceC10459qMo428M = AbstractC10842a.m11232j(c10456n, paddings).mo428M(AbstractC10844c.f32512c);
            C17790w c17790wM19515a = AbstractC17788v.m19515a(AbstractC17770m.f56728e, C10444b.f30947z0, c6021p, 54);
            int i10 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p, interfaceC10459qMo428M);
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
            AbstractC3980S2.m4668b(c10456n, 0L, 0.0f, 0L, 0, c6021p, 6, 30);
            c6021p.m6553p(true);
        }
        return C17296C.f55119a;
    }
}
