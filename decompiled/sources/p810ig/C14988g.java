package p810ig;

import androidx.compose.foundation.layout.AbstractC10842a;
import androidx.compose.foundation.layout.AbstractC10844c;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p003A1.AbstractC0168G;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1439n;
import p049Bm.InterfaceC1440o;
import p1140z1.C21694h;
import p1140z1.C21696i;
import p1140z1.C21698j;
import p1140z1.InterfaceC21700k;
import p229J0.AbstractC3878A1;
import p229J0.AbstractC3947L4;
import p229J0.AbstractC4124r4;
import p229J0.C3941K4;
import p349O0.C5997d;
import p349O0.C6021p;
import p349O0.InterfaceC6008i0;
import p478Tc.AbstractC7312p;
import p478Tc.AbstractC7313q;
import p523V9.AbstractC8126k4;
import p544W9.AbstractC8626e3;
import p635a1.AbstractC10443a;
import p635a1.C10444b;
import p635a1.C10449g;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p774h1.C14365u;
import p882m1.AbstractC17140a;
import p911o0.AbstractC17770m;
import p911o0.AbstractC17777p0;
import p911o0.AbstractC17788v;
import p911o0.C17781r0;
import p911o0.C17790w;
import p911o0.InterfaceC17783s0;

/* JADX INFO: renamed from: ig.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C14988g extends AbstractC16546n implements InterfaceC1440o {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f46654Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ int f46655Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ String f46656o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C14988g(int i10, int i11, String str) {
        super(3);
        this.f46654Y = i11;
        this.f46655Z = i10;
        this.f46656o0 = str;
    }

    @Override // p049Bm.InterfaceC1440o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f46654Y) {
            case 0:
                InterfaceC1439n innerTextField = (InterfaceC1439n) obj;
                C6021p c6021p = (C6021p) obj2;
                int iIntValue = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(innerTextField, "innerTextField");
                if ((iIntValue & 6) == 0) {
                    iIntValue |= c6021p.m6545h(innerTextField) ? 4 : 2;
                }
                if ((iIntValue & 19) == 18 && c6021p.m6562y()) {
                    c6021p.m6517L();
                } else {
                    innerTextField.invoke(c6021p, Integer.valueOf(iIntValue & 14));
                    InterfaceC10459q interfaceC10459qM11244d = AbstractC10844c.m11244d(C10456n.f30959Y, 1.0f);
                    C17781r0 c17781r0M19506b = AbstractC17777p0.m19506b(AbstractC17770m.f56729f, C10444b.f30943v0, c6021p, 6);
                    int i10 = c6021p.f19564P;
                    InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
                    InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p, interfaceC10459qM11244d);
                    InterfaceC21700k.f68875m0.getClass();
                    InterfaceC1426a interfaceC1426a = C21698j.f68869b;
                    c6021p.m6528W();
                    if (c6021p.f19563O) {
                        c6021p.m6549l(interfaceC1426a);
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
                    c6021p.m6524S(-1540150675);
                    int i11 = 0;
                    while (true) {
                        boolean z6 = true;
                        if (i11 < this.f46655Z) {
                            String str = this.f46656o0;
                            char cCharAt = (i11 < 0 || i11 >= str.length()) ? ' ' : str.charAt(i11);
                            if (i11 != str.length()) {
                                z6 = false;
                            }
                            AbstractC8626e3.m9275d(cCharAt, z6, c6021p, 0);
                            i11++;
                        } else {
                            c6021p.m6553p(false);
                            c6021p.m6553p(true);
                        }
                    }
                }
                break;
            default:
                InterfaceC17783s0 TextButton = (InterfaceC17783s0) obj;
                C6021p c6021p2 = (C6021p) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(TextButton, "$this$TextButton");
                if ((iIntValue2 & 17) == 16 && c6021p2.m6562y()) {
                    c6021p2.m6517L();
                } else {
                    C10449g c10449g = C10444b.f30947z0;
                    C10456n c10456n = C10456n.f30959Y;
                    C17790w c17790wM19515a = AbstractC17788v.m19515a(AbstractC17770m.f56726c, c10449g, c6021p2, 48);
                    int i12 = c6021p2.f19564P;
                    InterfaceC6008i0 interfaceC6008i0M6550m2 = c6021p2.m6550m();
                    InterfaceC10459q interfaceC10459qM10923d2 = AbstractC10443a.m10923d(c6021p2, c10456n);
                    InterfaceC21700k.f68875m0.getClass();
                    C21696i c21696i = C21698j.f68869b;
                    c6021p2.m6528W();
                    if (c6021p2.f19563O) {
                        c6021p2.m6549l(c21696i);
                    } else {
                        c6021p2.m6543f0();
                    }
                    C5997d.m6439Z(C21698j.f68873f, c6021p2, c17790wM19515a);
                    C5997d.m6439Z(C21698j.f68872e, c6021p2, interfaceC6008i0M6550m2);
                    C21694h c21694h2 = C21698j.f68874g;
                    if (c6021p2.f19563O || !AbstractC16544l.m18089b(c6021p2.m6514H(), Integer.valueOf(i12))) {
                        AbstractC0168G.m537z(i12, c6021p2, i12, c21694h2);
                    }
                    C5997d.m6439Z(C21698j.f68871d, c6021p2, interfaceC10459qM10923d2);
                    InterfaceC10459q interfaceC10459qM11252l = AbstractC10844c.m11252l(c10456n, AbstractC7312p.f23186c);
                    AbstractC17140a abstractC17140aM8631b = AbstractC8126k4.m8631b(this.f46655Z, c6021p2, 0);
                    long j10 = C14365u.f45055e;
                    AbstractC3878A1.m4596a(abstractC17140aM8631b, null, interfaceC10459qM11252l, j10, c6021p2, 3120, 0);
                    AbstractC4124r4.m4768b(this.f46656o0, AbstractC10842a.m11237o(c10456n, 0.0f, AbstractC7313q.f23198c, 0.0f, 0.0f, 13), j10, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, ((C3941K4) c6021p2.m6548k(AbstractC3947L4.f12183a)).f12159o, c6021p2, 384, 3120, 55288);
                    c6021p2.m6553p(true);
                }
                break;
        }
        return C17296C.f55119a;
    }
}
