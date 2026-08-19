package p523V9;

import androidx.compose.foundation.AbstractC10833a;
import androidx.compose.foundation.layout.AbstractC10842a;
import cd.C11709i;
import com.openai.chatgpt.R;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p003A1.C0286s;
import p017Af.C0459F;
import p039Bc.C0885s;
import p042Bf.C1269k;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p1081wc.AbstractC20875V;
import p1081wc.InterfaceC20904w;
import p1140z1.C21694h;
import p1140z1.C21698j;
import p1140z1.InterfaceC21700k;
import p124Ei.C2461K0;
import p169Gf.C3045i;
import p229J0.AbstractC3878A1;
import p229J0.AbstractC3959O0;
import p229J0.AbstractC4124r4;
import p229J0.C3949M0;
import p349O0.AbstractC6012k0;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p349O0.InterfaceC6008i0;
import p403Qd.C6639j0;
import p403Qd.EnumC6606L;
import p478Tc.AbstractC7313q;
import p537W0.AbstractC8411c;
import p635a1.AbstractC10443a;
import p635a1.C10444b;
import p635a1.C10450h;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p882m1.AbstractC17140a;
import p894n0.InterfaceC17406l;
import p895n1.C17425e;
import p911o0.AbstractC17770m;
import p911o0.AbstractC17777p0;
import p911o0.C17756f;
import p911o0.C17764j;
import p911o0.C17781r0;

/* JADX INFO: renamed from: V9.S5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7989S5 {

    /* JADX INFO: renamed from: a */
    public static C17425e f25267a;

    /* JADX INFO: renamed from: a */
    public static final void m8292a(C6639j0 memory, EnumC6606L status, InterfaceC1436k onIntent, InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10) {
        int i11;
        AbstractC16544l.m18094g(memory, "memory");
        AbstractC16544l.m18094g(status, "status");
        AbstractC16544l.m18094g(onIntent, "onIntent");
        c6021p.m6526U(1361390658);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6542f(memory) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6542f(status) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6545h(onIntent) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c6021p.m6542f(interfaceC10459q) ? 2048 : 1024;
        }
        if ((i11 & 1171) == 1170 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            C10456n c10456n = C10456n.f30959Y;
            c6021p.m6524S(-2112365752);
            Object objM6514H = c6021p.m6514H();
            Object obj = C6013l.f19514a;
            if (objM6514H == obj) {
                objM6514H = new C11709i(null, 3);
                c6021p.m6537c0(objM6514H);
            }
            C11709i c11709i = (C11709i) objM6514H;
            c6021p.m6553p(false);
            Object obj2 = (InterfaceC20904w) c6021p.m6548k(AbstractC20875V.f66456a);
            if (status != EnumC6606L.f21328Z) {
                C6018n0 c6018n0M6555r = c6021p.m6555r();
                if (c6018n0M6555r != null) {
                    c6018n0M6555r.f19536d = new C3045i(memory, status, onIntent, interfaceC10459q, i10, 0);
                    return;
                }
                return;
            }
            C17756f c17756f = AbstractC17770m.f56724a;
            C17764j c17764jM19500g = AbstractC17770m.m19500g(AbstractC7313q.f23199d);
            C10450h c10450h = C10444b.f30944w0;
            c6021p.m6524S(-2112354510);
            Object objM6514H2 = c6021p.m6514H();
            if (objM6514H2 == obj) {
                objM6514H2 = AbstractC0168G.m536y(c6021p);
            }
            InterfaceC17406l interfaceC17406l = (InterfaceC17406l) objM6514H2;
            c6021p.m6553p(false);
            c6021p.m6524S(-2112351534);
            boolean zM6545h = c6021p.m6545h(obj2) | c6021p.m6545h(c11709i);
            Object objM6514H3 = c6021p.m6514H();
            if (zM6545h || objM6514H3 == obj) {
                objM6514H3 = new C0286s(obj2, 24, c11709i);
                c6021p.m6537c0(objM6514H3);
            }
            c6021p.m6553p(false);
            InterfaceC10459q interfaceC10459qM11237o = AbstractC10842a.m11237o(AbstractC10833a.m11208c(interfaceC10459q, interfaceC17406l, null, false, null, (InterfaceC1426a) objM6514H3, 28), 0.0f, 0.0f, AbstractC7313q.f23198c, 0.0f, 11);
            C17781r0 c17781r0M19506b = AbstractC17777p0.m19506b(c17764jM19500g, c10450h, c6021p, 48);
            int i12 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p, interfaceC10459qM11237o);
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
            if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i12))) {
                AbstractC0168G.m537z(i12, c6021p, i12, c21694h);
            }
            C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d);
            AbstractC17140a abstractC17140aM8631b = AbstractC8126k4.m8631b(R.drawable.notebook, c6021p, 0);
            AbstractC6012k0 abstractC6012k0 = AbstractC3959O0.f12302a;
            int i13 = i11;
            AbstractC3878A1.m4596a(abstractC17140aM8631b, null, null, ((C3949M0) c6021p.m6548k(abstractC6012k0)).f12237s, c6021p, 48, 4);
            AbstractC4124r4.m4768b(AbstractC8142m4.m8676d(R.string.tool_status_memory_updated, c6021p), null, ((C3949M0) c6021p.m6548k(abstractC6012k0)).f12237s, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6021p, 0, 0, 131066);
            c6021p.m6524S(-1227685739);
            boolean z6 = (i13 & 896) == 256;
            Object objM6514H4 = c6021p.m6514H();
            if (z6 || objM6514H4 == obj) {
                objM6514H4 = new C0459F(13, onIntent);
                c6021p.m6537c0(objM6514H4);
            }
            c6021p.m6553p(false);
            m8293b(c11709i, memory, (InterfaceC1426a) objM6514H4, c10456n, c6021p, 3072 | ((i13 << 3) & 112));
            c6021p.m6553p(true);
        }
        C6018n0 c6018n0M6555r2 = c6021p.m6555r();
        if (c6018n0M6555r2 != null) {
            c6018n0M6555r2.f19536d = new C3045i(memory, status, onIntent, interfaceC10459q, i10, 1);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m8293b(C11709i popupMenuState, C6639j0 memory, InterfaceC1426a onNavigateToMemory, InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10) {
        int i11;
        AbstractC16544l.m18094g(popupMenuState, "popupMenuState");
        AbstractC16544l.m18094g(memory, "memory");
        AbstractC16544l.m18094g(onNavigateToMemory, "onNavigateToMemory");
        c6021p.m6526U(1669380223);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? c6021p.m6542f(popupMenuState) : c6021p.m6545h(popupMenuState) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6542f(memory) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6545h(onNavigateToMemory) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c6021p.m6542f(interfaceC10459q) ? 2048 : 1024;
        }
        if ((i11 & 1171) == 1170 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            c6021p.m6524S(-2713283);
            boolean z6 = true;
            boolean z10 = (i11 & 896) == 256;
            int i12 = i11 & 14;
            if (i12 != 4 && ((i11 & 8) == 0 || !c6021p.m6545h(popupMenuState))) {
                z6 = false;
            }
            boolean z11 = z10 | z6;
            Object objM6514H = c6021p.m6514H();
            if (z11 || objM6514H == C6013l.f19514a) {
                objM6514H = new C2461K0(onNavigateToMemory, popupMenuState, 2);
                c6021p.m6537c0(objM6514H);
            }
            c6021p.m6553p(false);
            AbstractC8198t4.m8798a(popupMenuState, interfaceC10459q, AbstractC8411c.m8969c(-1938271012, c6021p, new C0885s(memory, 4, (InterfaceC1426a) objM6514H)), c6021p, 384 | i12 | ((i11 >> 6) & 112), 0);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C1269k(i10, 4, popupMenuState, memory, onNavigateToMemory, interfaceC10459q);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m8294c(StringBuilder sb2, Object obj, InterfaceC1436k interfaceC1436k) {
        AbstractC16544l.m18094g(sb2, "<this>");
        if (interfaceC1436k != null) {
            sb2.append((CharSequence) interfaceC1436k.invoke(obj));
            return;
        }
        if (obj == null ? true : obj instanceof CharSequence) {
            sb2.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            sb2.append(((Character) obj).charValue());
        } else {
            sb2.append((CharSequence) obj.toString());
        }
    }
}
