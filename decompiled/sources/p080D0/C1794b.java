package p080D0;

import androidx.compose.foundation.layout.AbstractC10844c;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p003A1.AbstractC0168G;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1439n;
import p1140z1.C21694h;
import p1140z1.C21696i;
import p1140z1.C21698j;
import p1140z1.InterfaceC21700k;
import p349O0.C5975S;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6021p;
import p349O0.InterfaceC6008i0;
import p492U1.C7542g;
import p635a1.AbstractC10443a;
import p635a1.C10444b;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p911o0.AbstractC17758g;
import p911o0.AbstractC17777p0;
import p911o0.C17756f;
import p911o0.C17781r0;

/* JADX INFO: renamed from: D0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1794b extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ long f5142Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ boolean f5143Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC10459q f5144o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ InterfaceC1818n f5145p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1794b(long j10, boolean z6, InterfaceC10459q interfaceC10459q, InterfaceC1818n interfaceC1818n) {
        super(2);
        this.f5142Y = j10;
        this.f5143Z = z6;
        this.f5144o0 = interfaceC10459q;
        this.f5145p0 = interfaceC1818n;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C6021p c6021p = (C6021p) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            long j10 = this.f5142Y;
            C5975S c5975s = C6013l.f19514a;
            InterfaceC1818n interfaceC1818n = this.f5145p0;
            boolean z6 = this.f5143Z;
            if (j10 != 9205357640488583168L) {
                c6021p.m6524S(-837727128);
                C17756f c17756f = z6 ? AbstractC17758g.f56699b : AbstractC17758g.f56698a;
                InterfaceC10459q interfaceC10459qM11251k = AbstractC10844c.m11251k(this.f5144o0, C7542g.m7877b(j10), C7542g.m7876a(j10), 0.0f, 0.0f, 12);
                C17781r0 c17781r0M19506b = AbstractC17777p0.m19506b(c17756f, C10444b.f30943v0, c6021p, 0);
                int i10 = c6021p.f19564P;
                InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
                InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p, interfaceC10459qM11251k);
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
                C10456n c10456n = C10456n.f30959Y;
                boolean zM6545h = c6021p.m6545h(interfaceC1818n);
                Object objM6514H = c6021p.m6514H();
                if (zM6545h || objM6514H == c5975s) {
                    objM6514H = new C1792a(interfaceC1818n, 0);
                    c6021p.m6537c0(objM6514H);
                }
                AbstractC1807h0.m2617f(6, (InterfaceC1426a) objM6514H, c6021p, c10456n, z6);
                c6021p.m6553p(true);
                c6021p.m6553p(false);
            } else {
                c6021p.m6524S(-836867312);
                boolean zM6545h2 = c6021p.m6545h(interfaceC1818n);
                Object objM6514H2 = c6021p.m6514H();
                if (zM6545h2 || objM6514H2 == c5975s) {
                    objM6514H2 = new C1792a(interfaceC1818n, 1);
                    c6021p.m6537c0(objM6514H2);
                }
                AbstractC1807h0.m2617f(0, (InterfaceC1426a) objM6514H2, c6021p, this.f5144o0, z6);
                c6021p.m6553p(false);
            }
        }
        return C17296C.f55119a;
    }
}
