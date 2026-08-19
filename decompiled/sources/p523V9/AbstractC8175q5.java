package p523V9;

import androidx.compose.p650ui.graphics.AbstractC10864a;
import androidx.compose.p650ui.viewinterop.AbstractC10869a;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import p002A0.C0146w;
import p003A1.AbstractC0168G;
import p049Bm.InterfaceC1436k;
import p051Bo.AbstractC1456b;
import p1057v6.C20462b;
import p1108xi.AbstractC21264a;
import p147Fh.C2744a;
import p147Fh.C2745b;
import p147Fh.C2750g;
import p195Hh.C3430e;
import p229J0.AbstractC4025b1;
import p229J0.AbstractC4124r4;
import p328N1.AbstractC5599o;
import p349O0.C5975S;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p349O0.InterfaceC5985X;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p774h1.C14365u;

/* JADX INFO: renamed from: V9.q5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8175q5 {
    /* JADX WARN: Code duplicated, block: B:34:0x0062  */
    /* JADX WARN: Code duplicated, block: B:36:0x0065  */
    /* JADX WARN: Code duplicated, block: B:37:0x0067  */
    /* JADX WARN: Code duplicated, block: B:40:0x0070  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:44:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:47:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public static final void m8756a(String latex, boolean z6, boolean z10, C6021p c6021p, int i10, int i11) {
        int i12;
        boolean z11;
        boolean z12;
        boolean z13;
        C6018n0 c6018n0M6555r;
        C6018n0 c6018n0M6555r2;
        AbstractC16544l.m18094g(latex, "latex");
        c6021p.m6526U(1526397740);
        if ((i10 & 6) == 0) {
            i12 = (c6021p.m6542f(latex) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= c6021p.m6544g(z6) ? 32 : 16;
        }
        int i13 = i11 & 4;
        if (i13 == 0) {
            if ((i10 & 384) == 0) {
                z11 = z10;
                i12 |= c6021p.m6544g(z11) ? 256 : 128;
            }
            if ((i12 & 147) == 146 || !c6021p.m6562y()) {
                if (i13 != 0) {
                    z12 = false;
                } else {
                    z12 = z11;
                }
                c6021p.m6524S(-635387687);
                if (!z6) {
                    z13 = z12;
                    AbstractC4124r4.m4768b(latex, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6021p, i12 & 14, 0, 131070);
                    c6021p.m6553p(false);
                    c6018n0M6555r = c6021p.m6555r();
                    if (c6018n0M6555r != null) {
                        c6018n0M6555r.f19536d = new C2744a(latex, z6, z13, i10, i11, 0);
                        return;
                    }
                    return;
                }
                boolean z14 = z12;
                c6021p.m6553p(false);
                m8757b(latex, z14, c6021p, ((i12 >> 3) & 112) | (i12 & 14));
                z11 = z14;
            } else {
                c6021p.m6517L();
            }
            c6018n0M6555r2 = c6021p.m6555r();
            if (c6018n0M6555r2 != null) {
                c6018n0M6555r2.f19536d = new C2744a(latex, z6, z11, i10, i11, 1);
            }
        }
        i12 |= 384;
        z11 = z10;
        if ((i12 & 147) == 146) {
            if (i13 != 0) {
                z12 = false;
            } else {
                z12 = z11;
            }
            c6021p.m6524S(-635387687);
            if (!z6) {
                z13 = z12;
                AbstractC4124r4.m4768b(latex, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6021p, i12 & 14, 0, 131070);
                c6021p.m6553p(false);
                c6018n0M6555r = c6021p.m6555r();
                if (c6018n0M6555r != null) {
                    c6018n0M6555r.f19536d = new C2744a(latex, z6, z13, i10, i11, 0);
                    return;
                }
                return;
            }
            boolean z15 = z12;
            c6021p.m6553p(false);
            m8757b(latex, z15, c6021p, ((i12 >> 3) & 112) | (i12 & 14));
            z11 = z15;
        } else {
            if (i13 != 0) {
                z12 = false;
            } else {
                z12 = z11;
            }
            c6021p.m6524S(-635387687);
            if (!z6) {
                z13 = z12;
                AbstractC4124r4.m4768b(latex, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6021p, i12 & 14, 0, 131070);
                c6021p.m6553p(false);
                c6018n0M6555r = c6021p.m6555r();
                if (c6018n0M6555r != null) {
                    c6018n0M6555r.f19536d = new C2744a(latex, z6, z13, i10, i11, 0);
                    return;
                }
                return;
            }
            boolean z16 = z12;
            c6021p.m6553p(false);
            m8757b(latex, z16, c6021p, ((i12 >> 3) & 112) | (i12 & 14));
            z11 = z16;
        }
        c6018n0M6555r2 = c6021p.m6555r();
        if (c6018n0M6555r2 != null) {
            c6018n0M6555r2.f19536d = new C2744a(latex, z6, z11, i10, i11, 1);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m8757b(String str, boolean z6, C6021p c6021p, int i10) {
        int i11;
        boolean z10;
        C6021p c6021p2;
        c6021p.m6526U(-1596039094);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6542f(str) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6544g(z6) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && c6021p.m6562y()) {
            c6021p.m6517L();
            z10 = z6;
        } else {
            C3430e c3430eM8749b = AbstractC8168p6.m8749b("LatexFormulaContent", null);
            c6021p.m6524S(591415676);
            Object objM6514H = c6021p.m6514H();
            C5975S c5975s = C6013l.f19514a;
            C5975S c5975s2 = C5975S.f19448r0;
            if (objM6514H == c5975s) {
                objM6514H = C5997d.m6430Q(Boolean.FALSE, c5975s2);
                c6021p.m6537c0(objM6514H);
            }
            InterfaceC5985X interfaceC5985X = (InterfaceC5985X) objM6514H;
            boolean z11 = false;
            c6021p.m6553p(false);
            c6021p.m6524S(591417443);
            int i12 = i11 & 14;
            boolean z12 = i12 == 4;
            Object objM6514H2 = c6021p.m6514H();
            if (z12 || objM6514H2 == c5975s) {
                objM6514H2 = C5997d.m6430Q(Boolean.FALSE, c5975s2);
                c6021p.m6537c0(objM6514H2);
            }
            InterfaceC5985X interfaceC5985X2 = (InterfaceC5985X) objM6514H2;
            c6021p.m6553p(false);
            long j10 = ((C14365u) c6021p.m6548k(AbstractC4025b1.f12649a)).f45062a;
            c6021p.m6524S(591421339);
            Object objM6514H3 = c6021p.m6514H();
            if (objM6514H3 == c5975s) {
                objM6514H3 = C5997d.m6430Q(null, c5975s2);
                c6021p.m6537c0(objM6514H3);
            }
            InterfaceC5985X interfaceC5985X3 = (InterfaceC5985X) objM6514H3;
            Object objM530s = AbstractC0168G.m530s(591423611, c6021p, false);
            if (objM530s == c5975s) {
                objM530s = C5997d.m6430Q(null, c5975s2);
                c6021p.m6537c0(objM530s);
            }
            InterfaceC5985X interfaceC5985X4 = (InterfaceC5985X) objM530s;
            c6021p.m6553p(false);
            c6021p.m6524S(591425081);
            if (((Boolean) interfaceC5985X2.getValue()).booleanValue()) {
                if (z6) {
                    c6021p.m6524S(1154347699);
                    AbstractC4124r4.m4768b(str, null, 0L, 0L, null, null, AbstractC5599o.f18133o0, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6021p, i12, 0, 131006);
                    c6021p2 = c6021p;
                    z11 = false;
                    c6021p2.m6553p(false);
                } else {
                    c6021p2 = c6021p;
                    c6021p2.m6524S(1154468165);
                    AbstractC21264a.m21617a("LaTeX", str, true, null, c6021p, ((i11 << 3) & 112) | 390);
                    c6021p2.m6553p(false);
                }
                c6021p2.m6553p(z11);
                C6018n0 c6018n0M6555r = c6021p.m6555r();
                if (c6018n0M6555r != null) {
                    c6018n0M6555r.f19536d = new C2745b(i10, 0, str, z6);
                    return;
                }
                return;
            }
            z10 = z6;
            c6021p.m6553p(false);
            InterfaceC10459q interfaceC10459qM11306b = AbstractC10864a.m11306b(C10456n.f30959Y, 0.0f, 0.0f, 0.99607843f, 0.0f, 0.0f, 0.0f, 0.0f, null, true, 0, 126971);
            c6021p.m6524S(591437448);
            boolean zM6545h = c6021p.m6545h(c3430eM8749b) | c6021p.m6542f(interfaceC5985X2);
            Object objM6514H4 = c6021p.m6514H();
            if (zM6545h || objM6514H4 == c5975s) {
                objM6514H4 = new C0146w(interfaceC5985X, c3430eM8749b, interfaceC5985X2, 15);
                c6021p.m6537c0(objM6514H4);
            }
            InterfaceC1436k interfaceC1436k = (InterfaceC1436k) objM6514H4;
            c6021p.m6553p(false);
            c6021p.m6524S(591541115);
            boolean zM6540e = (i12 == 4) | c6021p.m6540e(j10);
            Object objM6514H5 = c6021p.m6514H();
            if (zM6540e || objM6514H5 == c5975s) {
                C2750g c2750g = new C2750g(str, j10, interfaceC5985X, interfaceC5985X3, interfaceC5985X4, 0);
                c6021p.m6537c0(c2750g);
                objM6514H5 = c2750g;
            }
            c6021p.m6553p(false);
            AbstractC10869a.m11356b(interfaceC1436k, interfaceC10459qM11306b, (InterfaceC1436k) objM6514H5, c6021p, 0, 0);
        }
        C6018n0 c6018n0M6555r2 = c6021p.m6555r();
        if (c6018n0M6555r2 != null) {
            c6018n0M6555r2.f19536d = new C2745b(i10, 1, str, z10);
        }
    }

    /* JADX INFO: renamed from: d */
    public static int m8759d(Object obj) {
        if (obj == null) {
            return 4;
        }
        if (obj instanceof String) {
            return AbstractC1456b.m2063c((String) obj).length;
        }
        int i10 = 16;
        if (obj instanceof Boolean) {
            return 16;
        }
        if (obj instanceof Integer) {
            return 4;
        }
        if ((obj instanceof Long) || (obj instanceof Double)) {
            return 8;
        }
        int iM8759d = 0;
        if (obj instanceof List) {
            Iterator it = ((Iterable) obj).iterator();
            while (it.hasNext()) {
                iM8759d += m8759d(it.next());
            }
        } else {
            if (obj instanceof C20462b) {
                return AbstractC1456b.m2063c(((C20462b) obj).f64956a).length + 16;
            }
            if (!(obj instanceof Map)) {
                throw new IllegalStateException(("Unknown field type in Record: '" + obj + '\'').toString());
            }
            Map map = (Map) obj;
            Iterator it2 = map.keySet().iterator();
            int iM8759d2 = 0;
            while (it2.hasNext()) {
                iM8759d2 += m8759d(it2.next());
            }
            i10 = 16 + iM8759d2;
            Iterator it3 = map.values().iterator();
            while (it3.hasNext()) {
                iM8759d += m8759d(it3.next());
            }
        }
        return i10 + iM8759d;
    }
}
