package p000;

import androidx.compose.foundation.layout.AbstractC10844c;
import androidx.compose.foundation.layout.FillElement;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p003A1.AbstractC0168G;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1440o;
import p106E0.AbstractC2236j;
import p1095x1.InterfaceC21057K;
import p1140z1.C21694h;
import p1140z1.C21696i;
import p1140z1.C21698j;
import p1140z1.InterfaceC21700k;
import p124Ei.C2556z0;
import p179H0.AbstractC3189g;
import p179H0.C3196n;
import p229J0.AbstractC4124r4;
import p349O0.C5997d;
import p349O0.C6021p;
import p349O0.InterfaceC6008i0;
import p523V9.AbstractC8223w5;
import p537W0.AbstractC8411c;
import p635a1.AbstractC10443a;
import p635a1.C10444b;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p736f0.InterfaceC13499q;
import p911o0.AbstractC17780r;
import p911o0.InterfaceC17783s0;

/* JADX INFO: renamed from: k */
/* JADX INFO: loaded from: classes.dex */
public final class C16280k extends AbstractC16546n implements InterfaceC1440o {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f50445Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ long f50446Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Object f50447o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C16280k(long j10, Object obj, int i10) {
        super(3);
        this.f50445Y = i10;
        this.f50446Z = j10;
        this.f50447o0 = obj;
    }

    @Override // p049Bm.InterfaceC1440o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f50445Y) {
            case 0:
                InterfaceC13499q AnimatedVisibility = (InterfaceC13499q) obj;
                ((Number) obj3).intValue();
                AbstractC16544l.m18094g(AnimatedVisibility, "$this$AnimatedVisibility");
                AbstractC17714o.m19455e(this.f50446Z, (InterfaceC1426a) this.f50447o0, (C6021p) obj2, 0);
                break;
            case 1:
                String hintText = (String) obj;
                C6021p c6021p = (C6021p) obj2;
                int iIntValue = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(hintText, "hintText");
                if ((iIntValue & 6) == 0) {
                    iIntValue |= c6021p.m6542f(hintText) ? 4 : 2;
                }
                if ((iIntValue & 19) == 18 && c6021p.m6562y()) {
                    c6021p.m6517L();
                } else {
                    AbstractC8223w5.m8850b(hintText, (InterfaceC10459q) this.f50447o0, null, null, "VoiceModeHint", null, AbstractC8411c.m8969c(-704924878, c6021p, new C2556z0(this.f50446Z)), c6021p, (iIntValue & 14) | 1597440, 44);
                }
                break;
            case 2:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                C6021p c6021p2 = (C6021p) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= c6021p2.m6544g(zBooleanValue) ? 4 : 2;
                }
                if ((iIntValue2 & 19) == 18 && c6021p2.m6562y()) {
                    c6021p2.m6517L();
                } else {
                    C10456n c10456n = C10456n.f30959Y;
                    FillElement fillElement = AbstractC10844c.f32512c;
                    InterfaceC21057K interfaceC21057KM19511e = AbstractC17780r.m19511e(C10444b.f30938q0, false);
                    int i10 = c6021p2.f19564P;
                    InterfaceC6008i0 interfaceC6008i0M6550m = c6021p2.m6550m();
                    InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p2, fillElement);
                    InterfaceC21700k.f68875m0.getClass();
                    C21696i c21696i = C21698j.f68869b;
                    c6021p2.m6528W();
                    if (c6021p2.f19563O) {
                        c6021p2.m6549l(c21696i);
                    } else {
                        c6021p2.m6543f0();
                    }
                    C5997d.m6439Z(C21698j.f68873f, c6021p2, interfaceC21057KM19511e);
                    C5997d.m6439Z(C21698j.f68872e, c6021p2, interfaceC6008i0M6550m);
                    C21694h c21694h = C21698j.f68874g;
                    if (c6021p2.f19563O || !AbstractC16544l.m18089b(c6021p2.m6514H(), Integer.valueOf(i10))) {
                        AbstractC0168G.m537z(i10, c6021p2, i10, c21694h);
                    }
                    C5997d.m6439Z(C21698j.f68871d, c6021p2, interfaceC10459qM10923d);
                    float f10 = AbstractC3189g.f9616c;
                    float f11 = AbstractC3189g.f9617d;
                    float f12 = (f10 + f11) * 2;
                    long j10 = this.f50446Z;
                    if (zBooleanValue) {
                        c6021p2.m6524S(-1565983018);
                        AbstractC2236j.m3267a(f11, 0, 390, j10, 0L, c6021p2, AbstractC10844c.m11252l(c10456n, f12));
                        c6021p2.m6553p(false);
                    } else {
                        c6021p2.m6524S(-1565735297);
                        AbstractC3189g.m4036b((C3196n) this.f50447o0, j10, AbstractC10844c.m11252l(c10456n, f12), c6021p2, 384);
                        c6021p2.m6553p(false);
                    }
                    c6021p2.m6553p(true);
                }
                break;
            default:
                InterfaceC17783s0 TextButton = (InterfaceC17783s0) obj;
                C6021p c6021p3 = (C6021p) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(TextButton, "$this$TextButton");
                if ((iIntValue3 & 17) == 16 && c6021p3.m6562y()) {
                    c6021p3.m6517L();
                } else {
                    AbstractC4124r4.m4768b((String) this.f50447o0, null, this.f50446Z, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6021p3, 0, 0, 131066);
                }
                break;
        }
        return C17296C.f55119a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C16280k(Object obj, long j10, int i10) {
        super(3);
        this.f50445Y = i10;
        this.f50447o0 = obj;
        this.f50446Z = j10;
    }
}
