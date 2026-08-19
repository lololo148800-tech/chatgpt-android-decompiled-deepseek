package ad;

import androidx.compose.foundation.layout.WithAlignmentLineElement;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p003A1.AbstractC0168G;
import p049Bm.InterfaceC1440o;
import p1095x1.AbstractC21076c;
import p1095x1.C21094o;
import p1140z1.C21694h;
import p1140z1.C21696i;
import p1140z1.C21698j;
import p1140z1.InterfaceC21700k;
import p156G1.AbstractC2965l;
import p204I1.C3582M;
import p229J0.AbstractC4124r4;
import p349O0.C5997d;
import p349O0.C6021p;
import p349O0.InterfaceC6008i0;
import p574Xc.AbstractC9431a;
import p635a1.AbstractC10443a;
import p635a1.C10444b;
import p635a1.InterfaceC10459q;
import p911o0.AbstractC17770m;
import p911o0.AbstractC17777p0;
import p911o0.C17781r0;

/* JADX INFO: renamed from: ad.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C10543d extends AbstractC16546n implements InterfaceC1440o {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ InterfaceC10459q f31290Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ long f31291Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C3582M f31292o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ long f31293p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10543d(InterfaceC10459q interfaceC10459q, long j10, C3582M c3582m, long j11) {
        super(3);
        this.f31290Y = interfaceC10459q;
        this.f31291Z = j10;
        this.f31292o0 = c3582m;
        this.f31293p0 = j11;
    }

    @Override // p049Bm.InterfaceC1440o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        String currentText = (String) obj;
        C6021p c6021p = (C6021p) obj2;
        int iIntValue = ((Number) obj3).intValue();
        AbstractC16544l.m18094g(currentText, "currentText");
        if ((iIntValue & 6) == 0) {
            iIntValue |= c6021p.m6542f(currentText) ? 4 : 2;
        }
        if ((iIntValue & 19) == 18 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            C17781r0 c17781r0M19506b = AbstractC17777p0.m19506b(AbstractC17770m.f56724a, C10444b.f30945x0, c6021p, 48);
            int i10 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p, this.f31290Y);
            InterfaceC21700k.f68875m0.getClass();
            C21696i c21696i = C21698j.f68869b;
            c6021p.m6528W();
            if (c6021p.f19563O) {
                c6021p.m6549l(c21696i);
            } else {
                c6021p.m6543f0();
            }
            C5997d.m6439Z(C21698j.f68873f, c6021p, c17781r0M19506b);
            C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m);
            C21694h c21694h = C21698j.f68874g;
            if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i10))) {
                AbstractC0168G.m537z(i10, c6021p, i10, c21694h);
            }
            C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d);
            C21094o c21094o = AbstractC21076c.f66994a;
            long j10 = this.f31291Z;
            C3582M c3582m = this.f31292o0;
            AbstractC4124r4.m4768b(currentText, new WithAlignmentLineElement(c21094o), j10, 0L, null, null, AbstractC9431a.f28413a, 0L, null, null, 0L, 0, false, 0, 0, null, c3582m, c6021p, (iIntValue & 14) | 1572864, 0, 65464);
            AbstractC4124r4.m4768b("●", AbstractC2965l.m3789a(new WithAlignmentLineElement(c21094o), false, C10542c.f31289Y), this.f31293p0, 0L, null, null, AbstractC9431a.f28414b, 0L, null, null, 0L, 0, false, 0, 0, null, c3582m, c6021p, 1572870, 0, 65464);
            c6021p.m6553p(true);
        }
        return C17296C.f55119a;
    }
}
