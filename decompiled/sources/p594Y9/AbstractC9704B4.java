package p594Y9;

import androidx.compose.animation.AbstractC10831a;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p003A1.AbstractC0168G;
import p042Bf.C1264f;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p1140z1.C21694h;
import p1140z1.C21696i;
import p1140z1.C21698j;
import p1140z1.InterfaceC21700k;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p349O0.InterfaceC6008i0;
import p537W0.AbstractC8411c;
import p586Y0.C9566r;
import p635a1.AbstractC10443a;
import p635a1.C10444b;
import p635a1.InterfaceC10459q;
import p736f0.AbstractC13508z;
import p758g0.AbstractC13758e;
import p758g0.InterfaceC13798z;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17681o;
import p911o0.AbstractC17770m;
import p911o0.AbstractC17788v;
import p911o0.C17790w;
import p927og.C18191b;
import p927og.C18193d;
import p990rg.C18985l;

/* JADX INFO: renamed from: Y9.B4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9704B4 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r20v0, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r24v0, types: [O0.p] */
    /* JADX INFO: renamed from: a */
    public static final void m10298a(List suggestedPrompts, InterfaceC1436k onPromptClick, InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10) {
        AbstractC16544l.m18094g(suggestedPrompts, "suggestedPrompts");
        AbstractC16544l.m18094g(onPromptClick, "onPromptClick");
        c6021p.m6526U(-359250224);
        int i11 = 2;
        int i12 = (i10 & 6) == 0 ? (c6021p.m6545h(suggestedPrompts) ? 4 : 2) | i10 : i10;
        if ((i10 & 48) == 0) {
            i12 |= c6021p.m6545h(onPromptClick) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i12 |= c6021p.m6542f(interfaceC10459q) ? 256 : 128;
        }
        if ((i12 & 147) == 146 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            c6021p.m6524S(-57775394);
            Object objM6514H = c6021p.m6514H();
            Object obj = C6013l.f19514a;
            if (objM6514H == obj) {
                objM6514H = new C9566r();
                c6021p.m6537c0(objM6514H);
            }
            C9566r c9566r = (C9566r) objM6514H;
            int i13 = 0;
            c6021p.m6553p(false);
            C17296C c17296c = C17296C.f55119a;
            c6021p.m6524S(-57772975);
            boolean zM6545h = c6021p.m6545h(suggestedPrompts);
            Object objM6514H2 = c6021p.m6514H();
            InterfaceC13798z interfaceC13798z = null;
            if (zM6545h || objM6514H2 == obj) {
                objM6514H2 = new C18191b(c9566r, suggestedPrompts, null);
                c6021p.m6537c0(objM6514H2);
            }
            c6021p.m6553p(false);
            C5997d.m6450f((InterfaceC1439n) objM6514H2, c6021p, c17296c);
            C17790w c17790wM19515a = AbstractC17788v.m19515a(AbstractC17770m.f56726c, C10444b.f30946y0, c6021p, 0);
            int i14 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p, interfaceC10459q);
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
            if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i14))) {
                AbstractC0168G.m537z(i14, c6021p, i14, c21694h);
            }
            C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d);
            c6021p.m6524S(1929311292);
            int i15 = 0;
            for (Object obj2 : suggestedPrompts) {
                int i16 = i15 + 1;
                if (i15 < 0) {
                    ?? r20 = interfaceC13798z;
                    AbstractC17681o.m19388q();
                    throw r20;
                }
                AbstractC10831a.m11202e(AbstractC16544l.m18089b(AbstractC17680n.m19344T(i15, c9566r), Boolean.TRUE), null, AbstractC13508z.m15013e(AbstractC13758e.m15255t(700, i13, interfaceC13798z, 6), i11), null, null, AbstractC8411c.m8969c(-118266322, c6021p, new C18193d(onPromptClick, (C18985l) obj2, i15, suggestedPrompts)), c6021p, 1575942, 26);
                i13 = i13;
                i15 = i16;
                interfaceC13798z = interfaceC13798z;
                i11 = 2;
            }
            c6021p.m6553p(i13);
            c6021p.m6553p(true);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C1264f(suggestedPrompts, onPromptClick, interfaceC10459q, i10, 1);
        }
    }

    /* JADX INFO: renamed from: b */
    public static int m10299b(Object obj) {
        return (int) (((long) Integer.rotateLeft((int) (((long) (obj == null ? 0 : obj.hashCode())) * (-862048943)), 15)) * 461845907);
    }
}
