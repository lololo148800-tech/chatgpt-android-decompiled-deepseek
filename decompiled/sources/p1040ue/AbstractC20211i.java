package p1040ue;

import androidx.compose.foundation.AbstractC10833a;
import androidx.compose.foundation.layout.AbstractC10842a;
import androidx.compose.foundation.layout.AbstractC10844c;
import androidx.compose.material3.C10858c;
import com.openai.chatgpt.R;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p1051v0.AbstractC20417e;
import p1051v0.C20414b;
import p1051v0.C20416d;
import p1095x1.InterfaceC21057K;
import p1140z1.C21694h;
import p1140z1.C21698j;
import p1140z1.InterfaceC21700k;
import p229J0.AbstractC3878A1;
import p229J0.AbstractC3947L4;
import p229J0.AbstractC3959O0;
import p229J0.AbstractC4005X2;
import p229J0.AbstractC4124r4;
import p229J0.C3941K4;
import p229J0.C3949M0;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p349O0.InterfaceC6008i0;
import p404Qe.C6683s;
import p478Tc.AbstractC7312p;
import p478Tc.AbstractC7313q;
import p523V9.AbstractC8126k4;
import p523V9.AbstractC8142m4;
import p544W9.AbstractC8467E;
import p635a1.AbstractC10443a;
import p635a1.C10444b;
import p635a1.C10450h;
import p635a1.C10451i;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p774h1.AbstractC14334L;
import p882m1.AbstractC17140a;
import p911o0.AbstractC17770m;
import p911o0.AbstractC17777p0;
import p911o0.AbstractC17780r;
import p911o0.C17756f;
import p911o0.C17764j;
import p911o0.C17781r0;
import p911o0.C17785t0;

/* JADX INFO: renamed from: ue.i */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC20211i {

    /* JADX INFO: renamed from: a */
    public static final long f63987a = AbstractC14334L.m15626d(4287060961L);

    /* JADX INFO: renamed from: b */
    public static final long f63988b = AbstractC14334L.m15626d(4289628159L);

    /* JADX INFO: renamed from: a */
    public static final void m21011a(boolean z6, boolean z10, C20206d c20206d, InterfaceC1436k interfaceC1436k, C6021p c6021p, int i10) {
        int i11;
        Object next;
        Object next2;
        boolean z11;
        boolean z12;
        boolean z13;
        c6021p.m6526U(1806210668);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6544g(z6) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6544g(z10) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6542f(c20206d) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c6021p.m6545h(interfaceC1436k) ? 2048 : 1024;
        }
        int i12 = i11;
        if ((i12 & 1171) == 1170 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            Iterator it = c20206d.f63976d.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!(((InterfaceC20205c) next) instanceof C6683s));
            InterfaceC20205c interfaceC20205c = (InterfaceC20205c) next;
            Iterator it2 = c20206d.f63976d.iterator();
            do {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it2.next();
            } while (!(((InterfaceC20205c) next2) instanceof InterfaceC20203a));
            InterfaceC20205c interfaceC20205c2 = (InterfaceC20205c) next2;
            C10450h c10450h = C10444b.f30944w0;
            C17756f c17756f = AbstractC17770m.f56724a;
            float f10 = AbstractC7313q.f23199d;
            C17764j c17764jM19500g = AbstractC17770m.m19500g(f10);
            c6021p.m6524S(262479907);
            C10456n c10456n = C10456n.f30959Y;
            InterfaceC10459q interfaceC10459qM11244d = AbstractC10844c.m11244d(c10456n, 1.0f);
            Object obj = C6013l.f19514a;
            if (interfaceC20205c != null) {
                c6021p.m6524S(-1746195124);
                boolean zM6545h = ((i12 & 7168) == 2048) | c6021p.m6545h(interfaceC20205c);
                Object objM6514H = c6021p.m6514H();
                if (zM6545h || objM6514H == obj) {
                    z11 = false;
                    objM6514H = new C20209g(interfaceC1436k, interfaceC20205c, 0);
                    c6021p.m6537c0(objM6514H);
                } else {
                    z11 = false;
                }
                c6021p.m6553p(z11);
                interfaceC10459qM11244d = AbstractC10833a.m11209d(interfaceC10459qM11244d, z11, null, (InterfaceC1426a) objM6514H, 7);
            } else {
                z11 = false;
            }
            c6021p.m6553p(z11);
            InterfaceC10459q interfaceC10459qM11233k = AbstractC10842a.m11233k(AbstractC10833a.m11207b(interfaceC10459qM11244d, ((C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a)).f12234p, new C20416d(new C20414b(z6 ? 20 : 0), new C20414b(z6 ? 20 : 0), new C20414b(z10 ? 6 : 0), new C20414b(z10 ? 6 : 0))), f10);
            C17781r0 c17781r0M19506b = AbstractC17777p0.m19506b(c17764jM19500g, c10450h, c6021p, 48);
            int i13 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p, interfaceC10459qM11233k);
            InterfaceC21700k.f68875m0.getClass();
            InterfaceC1426a interfaceC1426a = C21698j.f68869b;
            c6021p.m6528W();
            if (c6021p.f19563O) {
                c6021p.m6549l(interfaceC1426a);
            } else {
                c6021p.m6543f0();
            }
            C21694h c21694h = C21698j.f68873f;
            C5997d.m6439Z(c21694h, c6021p, c17781r0M19506b);
            C21694h c21694h2 = C21698j.f68872e;
            C5997d.m6439Z(c21694h2, c6021p, interfaceC6008i0M6550m);
            C21694h c21694h3 = C21698j.f68874g;
            if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i13))) {
                AbstractC0168G.m537z(i13, c6021p, i13, c21694h3);
            }
            C21694h c21694h4 = C21698j.f68871d;
            C5997d.m6439Z(c21694h4, c6021p, interfaceC10459qM10923d);
            C17785t0 c17785t0 = C17785t0.f56761a;
            c6021p.m6524S(-1746177019);
            int iIntValue = c20206d.f63974b.intValue();
            C10451i c10451i = C10444b.f30938q0;
            InterfaceC10459q interfaceC10459qM11252l = AbstractC10844c.m11252l(c10456n, 28);
            c6021p.m6524S(1444196893);
            long jM15626d = AbstractC14334L.m15626d(AbstractC8467E.m9097b(c6021p) ? 4281542478L : 2582042879L);
            c6021p.m6553p(false);
            InterfaceC10459q interfaceC10459qM11207b = AbstractC10833a.m11207b(interfaceC10459qM11252l, jM15626d, AbstractC20417e.f64539a);
            InterfaceC21057K interfaceC21057KM19511e = AbstractC17780r.m19511e(c10451i, false);
            int i14 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m2 = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d2 = AbstractC10443a.m10923d(c6021p, interfaceC10459qM11207b);
            c6021p.m6528W();
            if (c6021p.f19563O) {
                c6021p.m6549l(interfaceC1426a);
            } else {
                c6021p.m6543f0();
            }
            C5997d.m6439Z(c21694h, c6021p, interfaceC21057KM19511e);
            C5997d.m6439Z(c21694h2, c6021p, interfaceC6008i0M6550m2);
            if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i14))) {
                AbstractC0168G.m537z(i14, c6021p, i14, c21694h3);
            }
            C5997d.m6439Z(c21694h4, c6021p, interfaceC10459qM10923d2);
            AbstractC17140a abstractC17140aM8631b = AbstractC8126k4.m8631b(iIntValue, c6021p, 0);
            c6021p.m6524S(-1528160967);
            long j10 = AbstractC8467E.m9097b(c6021p) ? f63988b : f63987a;
            c6021p.m6553p(false);
            AbstractC3878A1.m4596a(abstractC17140aM8631b, null, AbstractC10844c.m11252l(c10456n, 20), j10, c6021p, 432, 0);
            c6021p.m6553p(true);
            c6021p.m6553p(false);
            AbstractC4124r4.m4768b(c20206d.f63975c, c17785t0.m19513a(c10456n, 1.0f, true), 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, ((C3941K4) c6021p.m6548k(AbstractC3947L4.f12183a)).f12157m, c6021p, 0, 3120, 55292);
            c6021p.m6524S(-1746151344);
            if (interfaceC20205c2 == null) {
                z13 = true;
                z12 = false;
            } else {
                z12 = false;
                AbstractC17140a abstractC17140aM8631b2 = AbstractC8126k4.m8631b(R.drawable.close_xs, c6021p, 0);
                String strM8676d = AbstractC8142m4.m8676d(R.string.input_decoration_close, c6021p);
                InterfaceC10459q interfaceC10459qM11252l2 = AbstractC10844c.m11252l(c10456n, AbstractC7312p.f23186c);
                C10858c c10858cM4717b = AbstractC4005X2.m4717b(0.0f, 6, 0L, false);
                c6021p.m6524S(1179404779);
                boolean zM6545h2 = c6021p.m6545h(interfaceC20205c2) | ((i12 & 7168) == 2048);
                Object objM6514H2 = c6021p.m6514H();
                if (zM6545h2 || objM6514H2 == obj) {
                    z13 = true;
                    objM6514H2 = new C20209g(interfaceC1436k, interfaceC20205c2, 1);
                    c6021p.m6537c0(objM6514H2);
                } else {
                    z13 = true;
                }
                c6021p.m6553p(false);
                AbstractC3878A1.m4596a(abstractC17140aM8631b2, strM8676d, AbstractC10833a.m11208c(interfaceC10459qM11252l2, null, c10858cM4717b, false, null, (InterfaceC1426a) objM6514H2, 28), 0L, c6021p, 0, 8);
            }
            c6021p.m6553p(z12);
            c6021p.m6553p(z13);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C20210h(z6, z10, c20206d, interfaceC1436k, i10, 0);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m21012b(boolean z6, boolean z10, C20206d decoration, InterfaceC1436k onAction, C6021p c6021p, int i10) {
        int i11;
        AbstractC16544l.m18094g(decoration, "decoration");
        AbstractC16544l.m18094g(onAction, "onAction");
        c6021p.m6526U(-1400795246);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6544g(z6) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6544g(z10) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6542f(decoration) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c6021p.m6545h(onAction) ? 2048 : 1024;
        }
        if ((i11 & 1171) == 1170 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else if (decoration instanceof C20206d) {
            m21011a(z6, z10, decoration, onAction, c6021p, i11 & 7294);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C20210h(z6, z10, decoration, onAction, i10, 1);
        }
    }
}
