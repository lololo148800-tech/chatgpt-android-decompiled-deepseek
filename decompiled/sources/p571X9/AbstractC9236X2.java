package p571X9;

import af.C10561Q;
import android.content.Context;
import androidx.compose.foundation.AbstractC10833a;
import androidx.compose.foundation.layout.AbstractC10842a;
import androidx.compose.foundation.layout.AbstractC10844c;
import androidx.compose.p650ui.input.nestedscroll.AbstractC10866a;
import androidx.compose.p650ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import com.openai.feature.licenses.impl.LicensesScreenKt$LicensesScreen$$inlined$injectViewModel$1;
import com.openai.feature.licenses.impl.LicensesViewModel;
import com.openai.feature.viewmodel.InternalViewModelEffectKt;
import com.openai.viewmodel.BaseViewModel;
import com.openai.viewmodel.LocalViewModelStateKt;
import com.openai.viewmodel.ViewModelFactoryProviderKt;
import ee.C13373h;
import gf.C14127l;
import java.util.List;
import ki.AbstractC16421b;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16527D;
import nf.C17606e;
import nf.C17608g;
import nf.C17609h;
import p003A1.AbstractC0168G;
import p003A1.AbstractC0187M0;
import p003A1.AbstractC0233b1;
import p003A1.C0184L0;
import p003A1.InterfaceC0309z1;
import p025An.C0644w;
import p042Bf.C1275q;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p098Di.InterfaceC2062k;
import p1140z1.C21694h;
import p1140z1.C21696i;
import p1140z1.C21698j;
import p1140z1.InterfaceC21700k;
import p117Eb.C2392v;
import p124Ei.C2494b;
import p124Ei.C2535p;
import p204I1.C3582M;
import p204I1.C3590f;
import p229J0.AbstractC3914G1;
import p229J0.AbstractC3917G4;
import p229J0.AbstractC3947L4;
import p229J0.AbstractC3959O0;
import p229J0.AbstractC3984T1;
import p229J0.AbstractC4048f0;
import p229J0.AbstractC4124r4;
import p229J0.AbstractC4152w2;
import p229J0.C3880A3;
import p229J0.C3941K4;
import p229J0.C3949M0;
import p229J0.C4055g1;
import p328N1.C5609y;
import p349O0.C5984W0;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p349O0.C6035w;
import p349O0.InterfaceC5985X;
import p349O0.InterfaceC6008i0;
import p382Pf.C6401d;
import p402Qc.C6593i;
import p429Re.C6867a;
import p429Re.C6869c;
import p429Re.C6877k;
import p467T1.C7199i;
import p478Tc.AbstractC7313q;
import p537W0.AbstractC8411c;
import p544W9.AbstractC8662k3;
import p547Wc.C8805o;
import p553Wh.AbstractC8873i;
import p553Wh.C8870f;
import p594Y9.AbstractC9746I4;
import p635a1.AbstractC10443a;
import p635a1.C10444b;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p789hg.C14505d;
import p909nm.AbstractC17680n;
import p911o0.AbstractC17770m;
import p911o0.AbstractC17788v;
import p911o0.AbstractC17792x;
import p911o0.C17764j;
import p911o0.C17767k0;
import p911o0.C17790w;

/* JADX INFO: renamed from: X9.X2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9236X2 {
    /* JADX INFO: renamed from: a */
    public static final void m9808a(C17608g artifact, InterfaceC1426a onClick, C6021p c6021p, int i10) {
        int i11;
        AbstractC16544l.m18094g(artifact, "artifact");
        AbstractC16544l.m18094g(onClick, "onClick");
        c6021p.m6526U(732351787);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6542f(artifact) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6545h(onClick) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            C10456n c10456n = C10456n.f30959Y;
            c6021p.m6524S(282111691);
            boolean z6 = (i11 & 112) == 32;
            Object objM6514H = c6021p.m6514H();
            if (z6 || objM6514H == C6013l.f19514a) {
                objM6514H = new C14505d(10, onClick);
                c6021p.m6537c0(objM6514H);
            }
            c6021p.m6553p(false);
            AbstractC3914G1.m4611a(AbstractC8411c.m8969c(-215604083, c6021p, new C17606e(artifact, 0)), AbstractC10833a.m11209d(c10456n, false, null, (InterfaceC1426a) objM6514H, 7), null, AbstractC8411c.m8969c(491430442, c6021p, new C17606e(artifact, 1)), null, null, null, 0.0f, 0.0f, c6021p, 3078, 500);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C6401d(artifact, onClick, i10, 23);
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0058  */
    /* JADX WARN: Code duplicated, block: B:37:0x006e  */
    /* JADX WARN: Code duplicated, block: B:39:0x0075  */
    /* JADX WARN: Code duplicated, block: B:43:0x0087 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:44:0x0089  */
    /* JADX WARN: Code duplicated, block: B:45:0x008c  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:53:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    public static final void m9809b(C6877k content, InterfaceC1426a onDismiss, InterfaceC1426a interfaceC1426a, C3880A3 c3880a3, C6021p c6021p, int i10, int i11) {
        int i12;
        InterfaceC1426a interfaceC1426a2;
        InterfaceC1426a interfaceC1426a3;
        int i13;
        C3880A3 c3880a3M4785f;
        InterfaceC1426a interfaceC1426a4;
        Object objM6514H;
        C3880A3 c3880a4;
        C6018n0 c6018n0M6555r;
        AbstractC16544l.m18094g(content, "content");
        AbstractC16544l.m18094g(onDismiss, "onDismiss");
        c6021p.m6526U(518229895);
        if ((i10 & 6) == 0) {
            i12 = (c6021p.m6542f(content) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= c6021p.m6545h(onDismiss) ? 32 : 16;
        }
        int i14 = i11 & 4;
        if (i14 == 0) {
            if ((i10 & 384) == 0) {
                interfaceC1426a2 = interfaceC1426a;
                i12 |= c6021p.m6545h(interfaceC1426a2) ? 256 : 128;
            }
            if ((i10 & 3072) == 0) {
                i12 |= 1024;
            }
            if ((i12 & 1171) == 1170 || !c6021p.m6562y()) {
                c6021p.m6519N();
                if ((i10 & 1) != 0 || c6021p.m6561x()) {
                    if (i14 != 0) {
                        interfaceC1426a3 = C6867a.f22033Y;
                    } else {
                        interfaceC1426a3 = interfaceC1426a2;
                    }
                    i13 = i12 & (-7169);
                    c3880a3M4785f = AbstractC4152w2.m4785f(6, 2, c6021p, true);
                    interfaceC1426a4 = interfaceC1426a3;
                } else {
                    c6021p.m6517L();
                    c3880a3M4785f = c3880a3;
                    i13 = i12 & (-7169);
                    interfaceC1426a4 = interfaceC1426a2;
                }
                c6021p.m6554q();
                objM6514H = c6021p.m6514H();
                if (objM6514H == C6013l.f19514a) {
                    objM6514H = AbstractC0168G.m529r(C5997d.m6417D(c6021p), c6021p);
                }
                AbstractC4152w2.m4780a(onDismiss, C10456n.f30959Y, c3880a3M4785f, 0.0f, null, 0L, 0L, 0.0f, 0L, null, null, null, AbstractC8411c.m8969c(-54771612, c6021p, new C2494b(content, ((C6035w) objM6514H).f19668Y, c3880a3M4785f, onDismiss, interfaceC1426a4)), c6021p, ((i13 >> 3) & 14) | 48, 384, 4088);
                interfaceC1426a2 = interfaceC1426a4;
                c3880a4 = c3880a3M4785f;
            } else {
                c6021p.m6517L();
                c3880a4 = c3880a3;
            }
            c6018n0M6555r = c6021p.m6555r();
            if (c6018n0M6555r != null) {
                c6018n0M6555r.f19536d = new C1275q(content, onDismiss, interfaceC1426a2, c3880a4, i10, i11, 4);
            }
        }
        i12 |= 384;
        interfaceC1426a2 = interfaceC1426a;
        if ((i10 & 3072) == 0) {
            i12 |= 1024;
        }
        if ((i12 & 1171) == 1170) {
            c6021p.m6519N();
            if ((i10 & 1) != 0) {
                if (i14 != 0) {
                    interfaceC1426a3 = C6867a.f22033Y;
                } else {
                    interfaceC1426a3 = interfaceC1426a2;
                }
                i13 = i12 & (-7169);
                c3880a3M4785f = AbstractC4152w2.m4785f(6, 2, c6021p, true);
                interfaceC1426a4 = interfaceC1426a3;
            } else {
                if (i14 != 0) {
                    interfaceC1426a3 = C6867a.f22033Y;
                } else {
                    interfaceC1426a3 = interfaceC1426a2;
                }
                i13 = i12 & (-7169);
                c3880a3M4785f = AbstractC4152w2.m4785f(6, 2, c6021p, true);
                interfaceC1426a4 = interfaceC1426a3;
            }
            c6021p.m6554q();
            objM6514H = c6021p.m6514H();
            if (objM6514H == C6013l.f19514a) {
                objM6514H = AbstractC0168G.m529r(C5997d.m6417D(c6021p), c6021p);
            }
            AbstractC4152w2.m4780a(onDismiss, C10456n.f30959Y, c3880a3M4785f, 0.0f, null, 0L, 0L, 0.0f, 0L, null, null, null, AbstractC8411c.m8969c(-54771612, c6021p, new C2494b(content, ((C6035w) objM6514H).f19668Y, c3880a3M4785f, onDismiss, interfaceC1426a4)), c6021p, ((i13 >> 3) & 14) | 48, 384, 4088);
            interfaceC1426a2 = interfaceC1426a4;
            c3880a4 = c3880a3M4785f;
        } else {
            c6021p.m6519N();
            if ((i10 & 1) != 0) {
                if (i14 != 0) {
                    interfaceC1426a3 = C6867a.f22033Y;
                } else {
                    interfaceC1426a3 = interfaceC1426a2;
                }
                i13 = i12 & (-7169);
                c3880a3M4785f = AbstractC4152w2.m4785f(6, 2, c6021p, true);
                interfaceC1426a4 = interfaceC1426a3;
            } else {
                if (i14 != 0) {
                    interfaceC1426a3 = C6867a.f22033Y;
                } else {
                    interfaceC1426a3 = interfaceC1426a2;
                }
                i13 = i12 & (-7169);
                c3880a3M4785f = AbstractC4152w2.m4785f(6, 2, c6021p, true);
                interfaceC1426a4 = interfaceC1426a3;
            }
            c6021p.m6554q();
            objM6514H = c6021p.m6514H();
            if (objM6514H == C6013l.f19514a) {
                objM6514H = AbstractC0168G.m529r(C5997d.m6417D(c6021p), c6021p);
            }
            AbstractC4152w2.m4780a(onDismiss, C10456n.f30959Y, c3880a3M4785f, 0.0f, null, 0L, 0L, 0.0f, 0L, null, null, null, AbstractC8411c.m8969c(-54771612, c6021p, new C2494b(content, ((C6035w) objM6514H).f19668Y, c3880a3M4785f, onDismiss, interfaceC1426a4)), c6021p, ((i13 >> 3) & 14) | 48, 384, 4088);
            interfaceC1426a2 = interfaceC1426a4;
            c3880a4 = c3880a3M4785f;
        }
        c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C1275q(content, onDismiss, interfaceC1426a2, c3880a4, i10, i11, 4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX INFO: renamed from: c */
    public static final void m9810c(C6877k content, InterfaceC1426a onDismiss, InterfaceC1426a interfaceC1426a, C6021p c6021p, int i10) {
        int i11;
        ?? r13;
        boolean z6;
        AbstractC16544l.m18094g(content, "content");
        AbstractC16544l.m18094g(onDismiss, "onDismiss");
        c6021p.m6526U(920573724);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6542f(content) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6545h(onDismiss) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6545h(interfaceC1426a) ? 256 : 128;
        }
        int i12 = i11;
        if ((i12 & 147) == 146 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            C10456n c10456n = C10456n.f30959Y;
            float f10 = AbstractC7313q.f23202g;
            InterfaceC10459q interfaceC10459qM11237o = AbstractC10842a.m11237o(AbstractC10842a.m11235m(c10456n, f10, 0.0f, 2), 0.0f, 0.0f, 0.0f, f10, 7);
            C17790w c17790wM19515a = AbstractC17788v.m19515a(AbstractC17770m.f56726c, C10444b.f30946y0, c6021p, 0);
            int i13 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p, interfaceC10459qM11237o);
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
            if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i13))) {
                AbstractC0168G.m537z(i13, c6021p, i13, c21694h);
            }
            C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d);
            c6021p.m6524S(-1321904552);
            String str = content.f22052a;
            if (str != null) {
                AbstractC4124r4.m4768b(str, AbstractC10842a.m11237o(AbstractC10844c.m11244d(c10456n, 1.0f), 0.0f, 0.0f, 0.0f, f10, 7), 0L, 0L, null, null, null, 0L, null, new C7199i(3), 0L, 0, false, 0, 0, null, new C3582M(0L, AbstractC9119D4.m9650c(28), C5609y.f18158u0, 0L, 0, 0L, 16777209), c6021p, 0, 1572864, 65020);
            }
            c6021p.m6553p(false);
            c6021p.m6524S(-1321890800);
            C3590f c3590f = content.f22055d;
            if (c3590f != null) {
                AbstractC4124r4.m4769c(c3590f, AbstractC10842a.m11237o(AbstractC10844c.m11244d(c10456n, 1.0f), 0.0f, 0.0f, 0.0f, f10, 7), 0L, 0L, null, null, null, 0L, null, new C7199i(3), 0L, 0, false, 0, 0, null, null, ((C3941K4) c6021p.m6548k(AbstractC3947L4.f12183a)).f12154j, c6021p, 0, 0, 130556);
            }
            c6021p.m6553p(false);
            c6021p.m6524S(-1321878320);
            boolean zIsEmpty = content.f22056e.isEmpty();
            Object obj = C6013l.f19514a;
            if (zIsEmpty) {
                r13 = 0;
            } else {
                C17764j c17764jM19500g = AbstractC17770m.m19500g(AbstractC7313q.f23201f);
                InterfaceC10459q interfaceC10459qM11237o2 = AbstractC10842a.m11237o(c10456n, 0.0f, 0.0f, 0.0f, f10, 7);
                c6021p.m6524S(-1321871634);
                int i14 = 4;
                boolean z10 = (i12 & 14) == 4;
                Object objM6514H = c6021p.m6514H();
                if (z10 || objM6514H == obj) {
                    objM6514H = new C6593i(content, i14);
                    c6021p.m6537c0(objM6514H);
                }
                c6021p.m6553p(false);
                AbstractC9746I4.m10337a(interfaceC10459qM11237o2, null, null, false, c17764jM19500g, null, null, false, (InterfaceC1436k) objM6514H, c6021p, 0, 238);
                r13 = 0;
            }
            c6021p.m6553p(r13);
            InterfaceC10459q interfaceC10459qM11244d = AbstractC10844c.m11244d(c10456n, 1.0f);
            C17767k0 c17767k0 = AbstractC4048f0.f12769a;
            C5984W0 c5984w0 = AbstractC3959O0.f12302a;
            AbstractC3984T1.m4685d(onDismiss, interfaceC10459qM11244d, false, null, AbstractC4048f0.m4733b(((C3949M0) c6021p.m6548k(c5984w0)).f12239u, ((C3949M0) c6021p.m6548k(c5984w0)).f12240v, c6021p, 12), null, null, null, null, AbstractC8411c.m8969c(805232502, c6021p, new C6869c(content, r13)), c6021p, ((i12 >> 3) & 14) | 805306416, 492);
            c6021p.m6524S(-1321825232);
            if (content.f22059h != null) {
                c6021p.m6524S(-1321822654);
                boolean z11 = (i12 & 896) == 256;
                Object objM6514H2 = c6021p.m6514H();
                if (z11 || objM6514H2 == obj) {
                    objM6514H2 = new C2535p(17, interfaceC1426a);
                    c6021p.m6537c0(objM6514H2);
                }
                c6021p.m6553p(false);
                z6 = false;
                AbstractC3984T1.m4695n((InterfaceC1426a) objM6514H2, AbstractC10842a.m11237o(AbstractC10844c.m11244d(c10456n, 1.0f), 0.0f, AbstractC7313q.f23201f, 0.0f, 0.0f, 13), false, null, null, null, null, null, null, AbstractC8411c.m8969c(1632756576, c6021p, new C6869c(content, 1)), c6021p, 805306368, 508);
            } else {
                z6 = false;
            }
            c6021p.m6553p(z6);
            c6021p.m6553p(true);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C0184L0(content, onDismiss, interfaceC1426a, i10, 25);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m9811d(InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10) {
        InterfaceC10459q interfaceC10459q2;
        InterfaceC2062k interfaceC2062k;
        c6021p.m6526U(-1611258356);
        if (((i10 | 6) & 3) == 2 && c6021p.m6562y()) {
            c6021p.m6517L();
            interfaceC10459q2 = interfaceC10459q;
        } else {
            interfaceC10459q2 = C10456n.f30959Y;
            C8870f c8870f = (C8870f) c6021p.m6548k(AbstractC8873i.f27157a);
            InterfaceC0309z1 interfaceC0309z1 = (InterfaceC0309z1) c6021p.m6548k(AbstractC0187M0.f714p);
            c6021p.m6524S(-1804372622);
            boolean zM6545h = c6021p.m6545h(interfaceC0309z1);
            Object objM6514H = c6021p.m6514H();
            Object obj = C6013l.f19514a;
            if (zM6545h || objM6514H == obj) {
                objM6514H = new C13373h(interfaceC0309z1, 2);
                c6021p.m6537c0(objM6514H);
            }
            InterfaceC1436k interfaceC1436k = (InterfaceC1436k) objM6514H;
            c6021p.m6553p(false);
            c6021p.m6524S(189483815);
            c6021p.m6524S(-1020152108);
            Context context = (Context) c6021p.m6548k(AndroidCompositionLocals_androidKt.f32825b);
            boolean zBooleanValue = ((Boolean) c6021p.m6548k(AbstractC0233b1.f873a)).booleanValue();
            List list = (List) c6021p.m6548k(AbstractC16421b.f50950a);
            c6021p.m6524S(-1395507574);
            if (zBooleanValue) {
                interfaceC2062k = (InterfaceC2062k) AbstractC17680n.m19343S(AbstractC17680n.m19338N((Iterable) c6021p.m6548k(LocalViewModelStateKt.f40364a), C17609h.class));
            } else {
                if (zBooleanValue) {
                    throw new C0644w();
                }
                interfaceC2062k = null;
            }
            c6021p.m6553p(false);
            LocalViewModelStoreOwner.f33491a.getClass();
            ViewModelStoreOwner viewModelStoreOwnerM12165a = LocalViewModelStoreOwner.m12165a(c6021p);
            if (viewModelStoreOwnerM12165a == null) {
                throw new IllegalStateException("Unable to find ViewModelStoreOwner");
            }
            C16527D c16527d = AbstractC16526C.f51263a;
            Object objMo5693b = c16527d.mo5693b(LicensesViewModel.class);
            Object objMo5693b2 = c16527d.mo5693b(C17609h.class);
            c6021p.m6524S(-1395498839);
            boolean zM6542f = c6021p.m6542f(objMo5693b) | c6021p.m6542f(objMo5693b2) | c6021p.m6542f(list) | c6021p.m6544g(zBooleanValue) | c6021p.m6542f(interfaceC2062k);
            Object objM6514H2 = c6021p.m6514H();
            if (zM6542f || objM6514H2 == obj) {
                if (zBooleanValue) {
                    ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C17609h.class), c16527d.mo5693b(LicensesViewModel.class), context, interfaceC2062k);
                    throw null;
                }
                if (zBooleanValue) {
                    throw new C0644w();
                }
                objM6514H2 = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(LicensesViewModel.class), null, viewModelStoreOwnerM12165a, list);
                c6021p.m6537c0(objM6514H2);
            }
            BaseViewModel baseViewModel = (BaseViewModel) objM6514H2;
            c6021p.m6553p(false);
            InternalViewModelEffectKt.m14374a(baseViewModel, c6021p, 0);
            InterfaceC5985X interfaceC5985XM19531n = AbstractC17792x.m19531n(c6021p, false, interfaceC1436k, c6021p, -1395474517);
            boolean zM6545h2 = c6021p.m6545h(baseViewModel) | c6021p.m6542f(interfaceC5985XM19531n);
            Object objM6514H3 = c6021p.m6514H();
            if (zM6545h2 || objM6514H3 == obj) {
                objM6514H3 = new LicensesScreenKt$LicensesScreen$$inlined$injectViewModel$1(baseViewModel, interfaceC5985XM19531n, null);
                c6021p.m6537c0(objM6514H3);
            }
            c6021p.m6553p(false);
            C5997d.m6450f((InterfaceC1439n) objM6514H3, c6021p, baseViewModel);
            c6021p.m6553p(false);
            LicensesViewModel licensesViewModel = (LicensesViewModel) baseViewModel;
            C17609h c17609h = (C17609h) AbstractC9112C3.m9642d(licensesViewModel.f40343c, c6021p).getValue();
            C2392v c2392vM4615a = AbstractC3917G4.m4615a(c6021p);
            AbstractC8662k3.m9350a(AbstractC10866a.m11313a(interfaceC10459q2, (C4055g1) c2392vM4615a.f7440r0, null), null, 0L, AbstractC8411c.m8969c(-1723793227, c6021p, new C8805o(c2392vM4615a, 24, c8870f)), false, AbstractC8411c.m8969c(-713214640, c6021p, new C14127l(c17609h, 6, licensesViewModel)), c6021p, 199680, 22);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C10561Q(interfaceC10459q2, i10, 16);
        }
    }
}
