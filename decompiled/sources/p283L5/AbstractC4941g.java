package p283L5;

import android.content.Context;
import androidx.compose.foundation.AbstractC10833a;
import androidx.compose.foundation.layout.AbstractC10842a;
import androidx.compose.foundation.layout.AbstractC10844c;
import androidx.compose.p650ui.draw.AbstractC10861a;
import androidx.compose.p650ui.platform.AndroidCompositionLocals_androidKt;
import ao.C11159d0;
import ao.C11164g;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16527D;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;
import p002A0.C0136m;
import p003A1.AbstractC0168G;
import p003A1.AbstractC0187M0;
import p003A1.C0307z;
import p025An.C0644w;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p1095x1.InterfaceC21057K;
import p1140z1.C21694h;
import p1140z1.C21696i;
import p1140z1.C21698j;
import p1140z1.InterfaceC21700k;
import p124Ei.C2463L0;
import p204I1.C3582M;
import p229J0.AbstractC3947L4;
import p229J0.AbstractC4124r4;
import p229J0.C3941K4;
import p277L.AbstractC4835h;
import p279L1.VOxZ.sVoFrD;
import p295Lj.AbstractC5103c;
import p296Lk.AbstractC5112i;
import p296Lk.C5106c;
import p296Lk.C5113j;
import p349O0.C5975S;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p349O0.InterfaceC6008i0;
import p363Og.C6218v;
import p467T1.C7199i;
import p478Tc.AbstractC7313q;
import p492U1.InterfaceC7537b;
import p523V9.AbstractC8118j4;
import p559Wn.C8976h;
import p631Zn.InterfaceC10429b;
import p635a1.AbstractC10443a;
import p635a1.C10444b;
import p635a1.C10450h;
import p635a1.C10451i;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p774h1.AbstractC14334L;
import p789hg.C14505d;
import p894n0.InterfaceC17406l;
import p911o0.AbstractC17770m;
import p911o0.AbstractC17777p0;
import p911o0.AbstractC17780r;
import p911o0.C17779q0;
import p911o0.C17781r0;
import p968qi.AbstractC18724g;
import p968qi.C18718a;
import p968qi.C18719b;
import p968qi.C18721d;
import p968qi.C18722e;
import p968qi.C18723f;
import p968qi.C18729l;
import p968qi.C18730m;
import p968qi.C18731n;
import p968qi.C18732o;
import p968qi.C18733p;
import p968qi.C18739v;
import p968qi.C18742y;
import p968qi.EnumC18738u;

/* JADX INFO: renamed from: L5.g */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4941g implements Encoder, InterfaceC10429b {
    /* JADX INFO: renamed from: H */
    public static final void m5549H(C18742y c18742y, C18739v c18739v, InterfaceC1436k onSelectionStateChange, C6021p c6021p, int i10) {
        int i11;
        AbstractC16544l.m18094g(onSelectionStateChange, "onSelectionStateChange");
        c6021p.m6526U(-559283012);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6542f(c18742y) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6542f(c18739v) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6545h(onSelectionStateChange) ? 256 : 128;
        }
        if ((i11 & 147) == 146 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            m5550I(c18742y, c18739v, onSelectionStateChange, c6021p, i11 & 1022);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C18731n(i10, 0, onSelectionStateChange, c18739v, c18742y);
        }
    }

    /* JADX INFO: renamed from: I */
    public static final void m5550I(C18742y c18742y, C18739v c18739v, InterfaceC1436k interfaceC1436k, C6021p c6021p, int i10) {
        int i11;
        Integer num;
        c6021p.m6526U(251779967);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6542f(c18742y) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6542f(c18739v) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6545h(interfaceC1436k) ? 256 : 128;
        }
        if ((i11 & 147) == 146 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            c6021p.m6524S(-1282685713);
            float fMo7870w = ((InterfaceC7537b) c6021p.m6548k(AbstractC0187M0.f704f)).mo7870w(((C3582M) c6021p.m6548k(AbstractC4124r4.f13310a)).f10910a.f10860b);
            c6021p.m6553p(false);
            List list = c18742y.f59616b;
            int i12 = 1;
            int size = list.size() + 1;
            Iterator it = list.iterator();
            if (it.hasNext()) {
                Integer numValueOf = Integer.valueOf(((C18729l) it.next()).f59572b.size());
                while (it.hasNext()) {
                    Integer numValueOf2 = Integer.valueOf(((C18729l) it.next()).f59572b.size());
                    if (numValueOf.compareTo(numValueOf2) < 0) {
                        numValueOf = numValueOf2;
                    }
                }
                num = numValueOf;
            } else {
                num = null;
            }
            int iIntValue = num != null ? num.intValue() : 0;
            c6021p.m6524S(-1282675353);
            boolean zM6538d = c6021p.m6538d(iIntValue) | c6021p.m6536c(fMo7870w);
            Object objM6514H = c6021p.m6514H();
            C5975S c5975s = C6013l.f19514a;
            if (zM6538d || objM6514H == c5975s) {
                objM6514H = new C18732o(iIntValue, fMo7870w);
                c6021p.m6537c0(objM6514H);
            }
            InterfaceC1436k columnSize = (InterfaceC1436k) objM6514H;
            c6021p.m6553p(false);
            C18733p c18733p = C18733p.f59588Z;
            AbstractC16544l.m18094g(columnSize, "columnSize");
            C5106c c5106c = new C5106c(columnSize, c18733p);
            C5113j c5113j = new C5113j(new C0307z(i12, 1), new C0307z(i12, 2), false);
            InterfaceC10459q interfaceC10459qM11207b = AbstractC10833a.m11207b(C10456n.f30959Y, AbstractC8118j4.m8615a(EnumC18738u.Normal.f59605o0, c6021p), AbstractC14334L.f44973a);
            c6021p.m6524S(-1282647921);
            boolean zM6538d2 = c6021p.m6538d(size) | ((i11 & 112) == 32) | ((i11 & 14) == 4) | ((i11 & 896) == 256) | c6021p.m6538d(iIntValue);
            Object objM6514H2 = c6021p.m6514H();
            if (zM6538d2 || objM6514H2 == c5975s) {
                C17779q0 c17779q0 = new C17779q0(size, iIntValue, interfaceC1436k, c18739v, c18742y);
                c6021p.m6537c0(c17779q0);
                objM6514H2 = c17779q0;
            }
            c6021p.m6553p(false);
            AbstractC5112i.m5672a(interfaceC10459qM11207b, null, c5113j, c5106c, null, null, (InterfaceC1436k) objM6514H2, c6021p, 0);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C18731n(i10, 1, interfaceC1436k, c18739v, c18742y);
        }
    }

    /* JADX INFO: renamed from: J */
    public static final void m5551J(AbstractC18724g abstractC18724g, EnumC18738u palette, int i10, int i11, C18739v c18739v, InterfaceC1426a interfaceC1426a, C6021p c6021p, int i12) {
        int i13;
        String strValueOf;
        c6021p.m6526U(-1415723928);
        if ((i12 & 6) == 0) {
            i13 = (c6021p.m6542f(abstractC18724g) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 48) == 0) {
            i13 |= c6021p.m6542f(palette) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i13 |= c6021p.m6538d(i10) ? 256 : 128;
        }
        if ((i12 & 3072) == 0) {
            i13 |= c6021p.m6538d(i11) ? 2048 : 1024;
        }
        if ((i12 & 24576) == 0) {
            i13 |= c6021p.m6542f(c18739v) ? 16384 : 8192;
        }
        if ((196608 & i12) == 0) {
            i13 |= c6021p.m6545h(interfaceC1426a) ? 131072 : 65536;
        }
        int i14 = i13;
        if ((i14 & 74899) == 74898 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            Context context = (Context) c6021p.m6548k(AndroidCompositionLocals_androidKt.f32825b);
            if (abstractC18724g instanceof C18721d) {
                strValueOf = String.valueOf(((C18721d) abstractC18724g).f59563a);
            } else if (abstractC18724g instanceof C18723f) {
                strValueOf = ((C18723f) abstractC18724g).f59565a;
            } else {
                if (!(abstractC18724g instanceof C18722e) && abstractC18724g != null) {
                    throw new C0644w();
                }
                strValueOf = "";
            }
            String str = strValueOf;
            C10451i c10451i = C10444b.f30937p0;
            InterfaceC10459q interfaceC10459qM11243c = AbstractC10844c.m11243c(C10456n.f30959Y, 1.0f);
            AbstractC16544l.m18094g(interfaceC10459qM11243c, "<this>");
            AbstractC16544l.m18094g(context, "context");
            AbstractC16544l.m18094g(palette, "palette");
            boolean zM5458J = AbstractC4835h.m5458J(c18739v, i10, i11);
            boolean zM5459K = AbstractC4835h.m5459K(c18739v, i10, i11);
            boolean zM5460L = AbstractC4835h.m5460L(c18739v, i10, i11);
            boolean zM5456H = AbstractC4835h.m5456H(c18739v, i10, i11);
            boolean zM5462N = AbstractC4835h.m5462N(c18739v, i10, i11);
            InterfaceC10459q interfaceC10459qM11297c = AbstractC10861a.m11297c(interfaceC10459qM11243c, new C18718a(palette, zM5460L, context, zM5458J, zM5459K, zM5456H, zM5462N && !zM5458J && !zM5460L && AbstractC4835h.m5458J(c18739v, i10 + (-1), i11) && AbstractC4835h.m5460L(c18739v, i10, i11 + (-1)), zM5462N && !zM5459K && !zM5460L && AbstractC4835h.m5459K(c18739v, i10 + (-1), i11) && AbstractC4835h.m5460L(c18739v, i10, i11 + 1), zM5462N && !zM5459K && !zM5456H && AbstractC4835h.m5459K(c18739v, i10 + 1, i11) && AbstractC4835h.m5456H(c18739v, i10, i11 + 1), zM5462N && !zM5458J && !zM5456H && AbstractC4835h.m5458J(c18739v, i10 + 1, i11) && AbstractC4835h.m5456H(c18739v, i10, i11 + (-1))));
            C18719b c18719b = palette.f59604Z;
            InterfaceC10459q interfaceC10459qM11207b = AbstractC10833a.m11207b(interfaceC10459qM11297c, AbstractC8118j4.m8615a(c18719b.f59562b, c6021p), AbstractC14334L.f44973a);
            c6021p.m6524S(-1652731974);
            Object objM6514H = c6021p.m6514H();
            C5975S c5975s = C6013l.f19514a;
            if (objM6514H == c5975s) {
                objM6514H = AbstractC0168G.m536y(c6021p);
            }
            InterfaceC17406l interfaceC17406l = (InterfaceC17406l) objM6514H;
            c6021p.m6553p(false);
            c6021p.m6524S(-1652730240);
            boolean z6 = (i14 & 458752) == 131072;
            Object objM6514H2 = c6021p.m6514H();
            if (z6 || objM6514H2 == c5975s) {
                objM6514H2 = new C14505d(15, interfaceC1426a);
                c6021p.m6537c0(objM6514H2);
            }
            c6021p.m6553p(false);
            InterfaceC10459q interfaceC10459qM11208c = AbstractC10833a.m11208c(interfaceC10459qM11207b, interfaceC17406l, null, false, null, (InterfaceC1426a) objM6514H2, 28);
            float f10 = AbstractC7313q.f23199d;
            InterfaceC10459q interfaceC10459qM11234l = AbstractC10842a.m11234l(interfaceC10459qM11208c, f10, f10);
            InterfaceC21057K interfaceC21057KM19511e = AbstractC17780r.m19511e(c10451i, false);
            int i15 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p, interfaceC10459qM11234l);
            InterfaceC21700k.f68875m0.getClass();
            C21696i c21696i = C21698j.f68869b;
            c6021p.m6528W();
            if (c6021p.f19563O) {
                c6021p.m6549l(c21696i);
            } else {
                c6021p.m6543f0();
            }
            C5997d.m6439Z(C21698j.f68873f, c6021p, interfaceC21057KM19511e);
            C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m);
            C21694h c21694h = C21698j.f68874g;
            if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i15))) {
                AbstractC0168G.m537z(i15, c6021p, i15, c21694h);
            }
            C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d);
            AbstractC4124r4.m4768b(str, null, AbstractC8118j4.m8615a(c18719b.f59561a, c6021p), 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, null, c6021p, 0, 3120, 120826);
            c6021p.m6553p(true);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C18730m(abstractC18724g, palette, i10, i11, c18739v, interfaceC1426a, i12);
        }
    }

    /* JADX INFO: renamed from: K */
    public static final void m5552K(String str, EnumC18738u palette, boolean z6, InterfaceC1426a interfaceC1426a, C6021p c6021p, int i10) {
        int i11;
        c6021p.m6526U(454969298);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6542f(str) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6542f(palette) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6544g(z6) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c6021p.m6545h(interfaceC1426a) ? 2048 : 1024;
        }
        int i12 = i11;
        if ((i12 & 1171) == 1170 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            Context context = (Context) c6021p.m6548k(AndroidCompositionLocals_androidKt.f32825b);
            C10450h c10450h = C10444b.f30944w0;
            C0136m c0136m = AbstractC17770m.f56729f;
            c6021p.m6524S(333835265);
            InterfaceC10459q interfaceC10459qM11243c = AbstractC10844c.m11243c(C10456n.f30959Y, 1.0f);
            AbstractC16544l.m18094g(interfaceC10459qM11243c, "<this>");
            AbstractC16544l.m18094g(context, "context");
            AbstractC16544l.m18094g(palette, "palette");
            InterfaceC10459q interfaceC10459qM5457I = AbstractC4835h.m5457I(interfaceC10459qM11243c, context, palette, z6, z6, z6, z6);
            C18719b c18719b = palette.f59603Y;
            InterfaceC10459q interfaceC10459qM11207b = AbstractC10833a.m11207b(interfaceC10459qM5457I, AbstractC8118j4.m8615a(c18719b.f59562b, c6021p), AbstractC14334L.f44973a);
            if (interfaceC1426a != null) {
                c6021p.m6524S(763166692);
                Object objM6514H = c6021p.m6514H();
                C5975S c5975s = C6013l.f19514a;
                if (objM6514H == c5975s) {
                    objM6514H = AbstractC0168G.m536y(c6021p);
                }
                InterfaceC17406l interfaceC17406l = (InterfaceC17406l) objM6514H;
                c6021p.m6553p(false);
                c6021p.m6524S(763168562);
                boolean z10 = (i12 & 7168) == 2048;
                Object objM6514H2 = c6021p.m6514H();
                if (z10 || objM6514H2 == c5975s) {
                    objM6514H2 = new C14505d(16, interfaceC1426a);
                    c6021p.m6537c0(objM6514H2);
                }
                c6021p.m6553p(false);
                interfaceC10459qM11207b = AbstractC10833a.m11208c(interfaceC10459qM11207b, interfaceC17406l, null, false, null, (InterfaceC1426a) objM6514H2, 28);
            }
            c6021p.m6553p(false);
            float f10 = AbstractC7313q.f23199d;
            InterfaceC10459q interfaceC10459qM11234l = AbstractC10842a.m11234l(interfaceC10459qM11207b, f10, f10);
            C17781r0 c17781r0M19506b = AbstractC17777p0.m19506b(c0136m, c10450h, c6021p, 54);
            int i13 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p, interfaceC10459qM11234l);
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
            if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i13))) {
                AbstractC0168G.m537z(i13, c6021p, i13, c21694h);
            }
            C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d);
            AbstractC4124r4.m4768b(str, null, AbstractC8118j4.m8615a(c18719b.f59561a, c6021p), 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, ((C3941K4) c6021p.m6548k(AbstractC3947L4.f12183a)).f12157m, c6021p, i12 & 14, 3120, 55290);
            c6021p.m6553p(true);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C2463L0(str, palette, z6, interfaceC1426a, i10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0073 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x0075  */
    /* JADX WARN: Code duplicated, block: B:44:0x0078  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:53:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:56:0x00e0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:57:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:61:0x0126  */
    /* JADX WARN: Code duplicated, block: B:62:0x012a  */
    /* JADX WARN: Code duplicated, block: B:65:0x013d  */
    /* JADX WARN: Code duplicated, block: B:67:0x014b  */
    /* JADX WARN: Code duplicated, block: B:71:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:73:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: L */
    public static final void m5553L(String str, EnumC18738u enumC18738u, boolean z6, InterfaceC1426a interfaceC1426a, C6021p c6021p, int i10, int i11) {
        int i12;
        InterfaceC1426a interfaceC1426a2;
        int i13;
        InterfaceC1426a interfaceC1426a3;
        InterfaceC10459q interfaceC10459qM11207b;
        int i14;
        C21696i c21696i;
        C21694h c21694h;
        InterfaceC1426a interfaceC1426a4;
        Object objM6514H;
        C5975S c5975s;
        boolean z10;
        Object objM6514H2;
        C6018n0 c6018n0M6555r;
        c6021p.m6526U(1870739910);
        if ((i10 & 6) == 0) {
            i12 = (c6021p.m6542f(str) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= c6021p.m6542f(enumC18738u) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i12 |= c6021p.m6544g(z6) ? 256 : 128;
        }
        int i15 = i11 & 8;
        if (i15 == 0) {
            if ((i10 & 3072) == 0) {
                interfaceC1426a2 = interfaceC1426a;
                i12 |= c6021p.m6545h(interfaceC1426a2) ? 2048 : 1024;
            }
            i13 = i12;
            if ((i13 & 1171) == 1170 || !c6021p.m6562y()) {
                if (i15 != 0) {
                    interfaceC1426a3 = null;
                } else {
                    interfaceC1426a3 = interfaceC1426a2;
                }
                Context context = (Context) c6021p.m6548k(AndroidCompositionLocals_androidKt.f32825b);
                C10451i c10451i = C10444b.f30938q0;
                c6021p.m6524S(-156208651);
                C10456n c10456n = C10456n.f30959Y;
                InterfaceC10459q interfaceC10459qM5457I = AbstractC4835h.m5457I(AbstractC10844c.m11243c(c10456n, 1.0f), context, enumC18738u, z6, z6, z6, z6);
                C18719b c18719b = enumC18738u.f59603Y;
                interfaceC10459qM11207b = AbstractC10833a.m11207b(interfaceC10459qM5457I, AbstractC8118j4.m8615a(c18719b.f59562b, c6021p), AbstractC14334L.f44973a);
                if (interfaceC1426a3 != null) {
                    c6021p.m6524S(-893560872);
                    objM6514H = c6021p.m6514H();
                    c5975s = C6013l.f19514a;
                    if (objM6514H == c5975s) {
                        objM6514H = AbstractC0168G.m536y(c6021p);
                    }
                    InterfaceC17406l interfaceC17406l = (InterfaceC17406l) objM6514H;
                    c6021p.m6553p(false);
                    c6021p.m6524S(-893559002);
                    if ((i13 & 7168) == 2048) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    objM6514H2 = c6021p.m6514H();
                    if (z10 || objM6514H2 == c5975s) {
                        objM6514H2 = new C14505d(17, interfaceC1426a3);
                        c6021p.m6537c0(objM6514H2);
                    }
                    c6021p.m6553p(false);
                    interfaceC10459qM11207b = AbstractC10833a.m11208c(interfaceC10459qM11207b, interfaceC17406l, null, false, null, (InterfaceC1426a) objM6514H2, 28);
                }
                c6021p.m6553p(false);
                float f10 = AbstractC7313q.f23199d;
                InterfaceC10459q interfaceC10459qM11234l = AbstractC10842a.m11234l(interfaceC10459qM11207b, f10, f10);
                InterfaceC21057K interfaceC21057KM19511e = AbstractC17780r.m19511e(c10451i, false);
                i14 = c6021p.f19564P;
                InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
                InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p, interfaceC10459qM11234l);
                InterfaceC21700k.f68875m0.getClass();
                c21696i = C21698j.f68869b;
                c6021p.m6528W();
                if (c6021p.f19563O) {
                    c6021p.m6549l(c21696i);
                } else {
                    c6021p.m6543f0();
                }
                C5997d.m6439Z(C21698j.f68873f, c6021p, interfaceC21057KM19511e);
                C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m);
                c21694h = C21698j.f68874g;
                if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i14))) {
                    AbstractC0168G.m537z(i14, c6021p, i14, c21694h);
                }
                C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d);
                interfaceC1426a4 = interfaceC1426a3;
                AbstractC4124r4.m4768b(str, AbstractC10844c.m11244d(c10456n, 1.0f), AbstractC8118j4.m8615a(c18719b.f59561a, c6021p), 0L, null, null, null, 0L, null, new C7199i(3), 0L, 0, false, 1, 0, null, ((C3941K4) c6021p.m6548k(AbstractC3947L4.f12183a)).f12157m, c6021p, (i13 & 14) | 48, 3072, 56824);
                c6021p.m6553p(true);
            } else {
                c6021p.m6517L();
                interfaceC1426a4 = interfaceC1426a2;
            }
            c6018n0M6555r = c6021p.m6555r();
            if (c6018n0M6555r != null) {
                c6018n0M6555r.f19536d = new C6218v(str, enumC18738u, z6, interfaceC1426a4, i10, i11, 3);
            }
        }
        i12 |= 3072;
        interfaceC1426a2 = interfaceC1426a;
        i13 = i12;
        if ((i13 & 1171) == 1170) {
            if (i15 != 0) {
                interfaceC1426a3 = null;
            } else {
                interfaceC1426a3 = interfaceC1426a2;
            }
            Context context2 = (Context) c6021p.m6548k(AndroidCompositionLocals_androidKt.f32825b);
            C10451i c10451i2 = C10444b.f30938q0;
            c6021p.m6524S(-156208651);
            C10456n c10456n2 = C10456n.f30959Y;
            InterfaceC10459q interfaceC10459qM5457I2 = AbstractC4835h.m5457I(AbstractC10844c.m11243c(c10456n2, 1.0f), context2, enumC18738u, z6, z6, z6, z6);
            C18719b c18719b2 = enumC18738u.f59603Y;
            interfaceC10459qM11207b = AbstractC10833a.m11207b(interfaceC10459qM5457I2, AbstractC8118j4.m8615a(c18719b2.f59562b, c6021p), AbstractC14334L.f44973a);
            if (interfaceC1426a3 != null) {
                c6021p.m6524S(-893560872);
                objM6514H = c6021p.m6514H();
                c5975s = C6013l.f19514a;
                if (objM6514H == c5975s) {
                    objM6514H = AbstractC0168G.m536y(c6021p);
                }
                InterfaceC17406l interfaceC17406l2 = (InterfaceC17406l) objM6514H;
                c6021p.m6553p(false);
                c6021p.m6524S(-893559002);
                if ((i13 & 7168) == 2048) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                objM6514H2 = c6021p.m6514H();
                if (z10) {
                    objM6514H2 = new C14505d(17, interfaceC1426a3);
                    c6021p.m6537c0(objM6514H2);
                } else {
                    objM6514H2 = new C14505d(17, interfaceC1426a3);
                    c6021p.m6537c0(objM6514H2);
                }
                c6021p.m6553p(false);
                interfaceC10459qM11207b = AbstractC10833a.m11208c(interfaceC10459qM11207b, interfaceC17406l2, null, false, null, (InterfaceC1426a) objM6514H2, 28);
            }
            c6021p.m6553p(false);
            float f11 = AbstractC7313q.f23199d;
            InterfaceC10459q interfaceC10459qM11234l2 = AbstractC10842a.m11234l(interfaceC10459qM11207b, f11, f11);
            InterfaceC21057K interfaceC21057KM19511e2 = AbstractC17780r.m19511e(c10451i2, false);
            i14 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m2 = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d2 = AbstractC10443a.m10923d(c6021p, interfaceC10459qM11234l2);
            InterfaceC21700k.f68875m0.getClass();
            c21696i = C21698j.f68869b;
            c6021p.m6528W();
            if (c6021p.f19563O) {
                c6021p.m6549l(c21696i);
            } else {
                c6021p.m6543f0();
            }
            C5997d.m6439Z(C21698j.f68873f, c6021p, interfaceC21057KM19511e2);
            C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m2);
            c21694h = C21698j.f68874g;
            if (c6021p.f19563O) {
                AbstractC0168G.m537z(i14, c6021p, i14, c21694h);
            } else {
                AbstractC0168G.m537z(i14, c6021p, i14, c21694h);
            }
            C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d2);
            interfaceC1426a4 = interfaceC1426a3;
            AbstractC4124r4.m4768b(str, AbstractC10844c.m11244d(c10456n2, 1.0f), AbstractC8118j4.m8615a(c18719b2.f59561a, c6021p), 0L, null, null, null, 0L, null, new C7199i(3), 0L, 0, false, 1, 0, null, ((C3941K4) c6021p.m6548k(AbstractC3947L4.f12183a)).f12157m, c6021p, (i13 & 14) | 48, 3072, 56824);
            c6021p.m6553p(true);
        } else {
            if (i15 != 0) {
                interfaceC1426a3 = null;
            } else {
                interfaceC1426a3 = interfaceC1426a2;
            }
            Context context3 = (Context) c6021p.m6548k(AndroidCompositionLocals_androidKt.f32825b);
            C10451i c10451i3 = C10444b.f30938q0;
            c6021p.m6524S(-156208651);
            C10456n c10456n3 = C10456n.f30959Y;
            InterfaceC10459q interfaceC10459qM5457I3 = AbstractC4835h.m5457I(AbstractC10844c.m11243c(c10456n3, 1.0f), context3, enumC18738u, z6, z6, z6, z6);
            C18719b c18719b3 = enumC18738u.f59603Y;
            interfaceC10459qM11207b = AbstractC10833a.m11207b(interfaceC10459qM5457I3, AbstractC8118j4.m8615a(c18719b3.f59562b, c6021p), AbstractC14334L.f44973a);
            if (interfaceC1426a3 != null) {
                c6021p.m6524S(-893560872);
                objM6514H = c6021p.m6514H();
                c5975s = C6013l.f19514a;
                if (objM6514H == c5975s) {
                    objM6514H = AbstractC0168G.m536y(c6021p);
                }
                InterfaceC17406l interfaceC17406l3 = (InterfaceC17406l) objM6514H;
                c6021p.m6553p(false);
                c6021p.m6524S(-893559002);
                if ((i13 & 7168) == 2048) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                objM6514H2 = c6021p.m6514H();
                if (z10) {
                    objM6514H2 = new C14505d(17, interfaceC1426a3);
                    c6021p.m6537c0(objM6514H2);
                } else {
                    objM6514H2 = new C14505d(17, interfaceC1426a3);
                    c6021p.m6537c0(objM6514H2);
                }
                c6021p.m6553p(false);
                interfaceC10459qM11207b = AbstractC10833a.m11208c(interfaceC10459qM11207b, interfaceC17406l3, null, false, null, (InterfaceC1426a) objM6514H2, 28);
            }
            c6021p.m6553p(false);
            float f12 = AbstractC7313q.f23199d;
            InterfaceC10459q interfaceC10459qM11234l3 = AbstractC10842a.m11234l(interfaceC10459qM11207b, f12, f12);
            InterfaceC21057K interfaceC21057KM19511e3 = AbstractC17780r.m19511e(c10451i3, false);
            i14 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m3 = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d3 = AbstractC10443a.m10923d(c6021p, interfaceC10459qM11234l3);
            InterfaceC21700k.f68875m0.getClass();
            c21696i = C21698j.f68869b;
            c6021p.m6528W();
            if (c6021p.f19563O) {
                c6021p.m6549l(c21696i);
            } else {
                c6021p.m6543f0();
            }
            C5997d.m6439Z(C21698j.f68873f, c6021p, interfaceC21057KM19511e3);
            C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m3);
            c21694h = C21698j.f68874g;
            if (c6021p.f19563O) {
                AbstractC0168G.m537z(i14, c6021p, i14, c21694h);
            } else {
                AbstractC0168G.m537z(i14, c6021p, i14, c21694h);
            }
            C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d3);
            interfaceC1426a4 = interfaceC1426a3;
            AbstractC4124r4.m4768b(str, AbstractC10844c.m11244d(c10456n3, 1.0f), AbstractC8118j4.m8615a(c18719b3.f59561a, c6021p), 0L, null, null, null, 0L, null, new C7199i(3), 0L, 0, false, 1, 0, null, ((C3941K4) c6021p.m6548k(AbstractC3947L4.f12183a)).f12157m, c6021p, (i13 & 14) | 48, 3072, 56824);
            c6021p.m6553p(true);
        }
        c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C6218v(str, enumC18738u, z6, interfaceC1426a4, i10, i11, 3);
        }
    }

    /* JADX INFO: renamed from: M */
    public static void m5554M(String str, boolean z6) {
        if (!z6) {
            throw new IllegalArgumentException(String.valueOf(str));
        }
    }

    /* JADX INFO: renamed from: N */
    public static void m5555N(boolean z6) {
        if (!z6) {
            throw new IllegalArgumentException();
        }
    }

    /* JADX INFO: renamed from: O */
    public static void m5556O(String str, int i10, int i11, int i12) {
        if (i10 < i11) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException(str + " is out of range of [" + i11 + ", " + i12 + "] (too low)");
        }
        if (i10 <= i12) {
            return;
        }
        Locale locale2 = Locale.US;
        throw new IllegalArgumentException(str + " is out of range of [" + i11 + ", " + i12 + "] (too high)");
    }

    /* JADX INFO: renamed from: P */
    public static void m5557P(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException();
        }
    }

    /* JADX INFO: renamed from: Q */
    public static void m5558Q(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(String.valueOf(str));
        }
    }

    /* JADX INFO: renamed from: R */
    public static void m5559R(String str, boolean z6) {
        if (!z6) {
            throw new IllegalStateException(str);
        }
    }

    @Override // kotlinx.serialization.encoding.Encoder
    /* JADX INFO: renamed from: A */
    public void mo5560A(KSerializer serializer, Object obj) {
        AbstractC16544l.m18094g(serializer, "serializer");
        serializer.serialize(this, obj);
    }

    @Override // p631Zn.InterfaceC10429b
    /* JADX INFO: renamed from: B */
    public void mo5561B(SerialDescriptor descriptor, int i10, double d10) {
        AbstractC16544l.m18094g(descriptor, "descriptor");
        mo5567S(descriptor, i10);
        mo5573g(d10);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    /* JADX INFO: renamed from: C */
    public void mo5562C(long j10) {
        m5568T(Long.valueOf(j10));
    }

    @Override // p631Zn.InterfaceC10429b
    /* JADX INFO: renamed from: D */
    public void mo5563D(C11159d0 descriptor, int i10, byte b) {
        AbstractC16544l.m18094g(descriptor, "descriptor");
        mo5567S(descriptor, i10);
        mo5576j(b);
    }

    @Override // p631Zn.InterfaceC10429b
    /* JADX INFO: renamed from: E */
    public void mo5564E(SerialDescriptor descriptor, int i10, long j10) {
        AbstractC16544l.m18094g(descriptor, "descriptor");
        mo5567S(descriptor, i10);
        mo5562C(j10);
    }

    @Override // p631Zn.InterfaceC10429b
    /* JADX INFO: renamed from: F */
    public boolean mo5565F(SerialDescriptor descriptor) {
        AbstractC16544l.m18094g(descriptor, "descriptor");
        return true;
    }

    @Override // kotlinx.serialization.encoding.Encoder
    /* JADX INFO: renamed from: G */
    public void mo5566G(String value) {
        AbstractC16544l.m18094g(value, "value");
        m5568T(value);
    }

    /* JADX INFO: renamed from: S */
    public void mo5567S(SerialDescriptor descriptor, int i10) {
        AbstractC16544l.m18094g(descriptor, "descriptor");
    }

    /* JADX INFO: renamed from: T */
    public void m5568T(Object value) {
        AbstractC16544l.m18094g(value, "value");
        StringBuilder sb2 = new StringBuilder("Non-serializable ");
        Class<?> cls = value.getClass();
        C16527D c16527d = AbstractC16526C.f51263a;
        sb2.append(c16527d.mo5693b(cls));
        sb2.append(" is not supported by ");
        sb2.append(c16527d.mo5693b(getClass()));
        sb2.append(" encoder");
        throw new C8976h(sb2.toString());
    }

    @Override // p631Zn.InterfaceC10429b
    /* JADX INFO: renamed from: b */
    public void mo5569b(SerialDescriptor descriptor) {
        AbstractC16544l.m18094g(descriptor, "descriptor");
    }

    @Override // kotlinx.serialization.encoding.Encoder
    /* JADX INFO: renamed from: c */
    public InterfaceC10429b mo5570c(SerialDescriptor descriptor) {
        AbstractC16544l.m18094g(descriptor, "descriptor");
        return this;
    }

    @Override // kotlinx.serialization.encoding.Encoder
    /* JADX INFO: renamed from: e */
    public void mo5571e(Boolean bool) {
        AbstractC5103c.m5668d(this, C11164g.f33804a, bool);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    /* JADX INFO: renamed from: f */
    public void mo5572f() {
        throw new C8976h("'null' is not supported by default");
    }

    @Override // kotlinx.serialization.encoding.Encoder
    /* JADX INFO: renamed from: g */
    public void mo5573g(double d10) {
        m5568T(Double.valueOf(d10));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    /* JADX INFO: renamed from: h */
    public void mo5574h(short s10) {
        m5568T(Short.valueOf(s10));
    }

    @Override // p631Zn.InterfaceC10429b
    /* JADX INFO: renamed from: i */
    public void mo5575i(SerialDescriptor descriptor, int i10, KSerializer serializer, Object obj) {
        AbstractC16544l.m18094g(descriptor, "descriptor");
        AbstractC16544l.m18094g(serializer, "serializer");
        mo5567S(descriptor, i10);
        mo5560A(serializer, obj);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    /* JADX INFO: renamed from: j */
    public void mo5576j(byte b) {
        m5568T(Byte.valueOf(b));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    /* JADX INFO: renamed from: k */
    public void mo5577k(boolean z6) {
        m5568T(Boolean.valueOf(z6));
    }

    @Override // p631Zn.InterfaceC10429b
    /* JADX INFO: renamed from: m */
    public void mo5579m(int i10, int i11, SerialDescriptor descriptor) {
        AbstractC16544l.m18094g(descriptor, "descriptor");
        mo5567S(descriptor, i10);
        mo5589x(i11);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    /* JADX INFO: renamed from: n */
    public void mo5580n(float f10) {
        m5568T(Float.valueOf(f10));
    }

    @Override // p631Zn.InterfaceC10429b
    /* JADX INFO: renamed from: o */
    public Encoder mo5581o(C11159d0 descriptor, int i10) {
        AbstractC16544l.m18094g(descriptor, "descriptor");
        mo5567S(descriptor, i10);
        return mo5590y(descriptor.mo10685h(i10));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    /* JADX INFO: renamed from: p */
    public void mo5582p(char c9) {
        m5568T(Character.valueOf(c9));
    }

    @Override // p631Zn.InterfaceC10429b
    /* JADX INFO: renamed from: q */
    public void mo5583q(SerialDescriptor descriptor, int i10, boolean z6) {
        AbstractC16544l.m18094g(descriptor, "descriptor");
        mo5567S(descriptor, i10);
        mo5577k(z6);
    }

    @Override // p631Zn.InterfaceC10429b
    /* JADX INFO: renamed from: r */
    public void mo5584r(SerialDescriptor descriptor, int i10, String value) {
        AbstractC16544l.m18094g(descriptor, "descriptor");
        AbstractC16544l.m18094g(value, "value");
        mo5567S(descriptor, i10);
        mo5566G(value);
    }

    @Override // p631Zn.InterfaceC10429b
    /* JADX INFO: renamed from: s */
    public void mo5585s(SerialDescriptor descriptor, int i10, KSerializer serializer, Object obj) {
        AbstractC16544l.m18094g(descriptor, "descriptor");
        AbstractC16544l.m18094g(serializer, "serializer");
        mo5567S(descriptor, i10);
        AbstractC5103c.m5668d(this, serializer, obj);
    }

    @Override // p631Zn.InterfaceC10429b
    /* JADX INFO: renamed from: t */
    public void mo5586t(C11159d0 descriptor, int i10, char c9) {
        AbstractC16544l.m18094g(descriptor, "descriptor");
        mo5567S(descriptor, i10);
        mo5582p(c9);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    /* JADX INFO: renamed from: u */
    public InterfaceC10429b mo5587u(SerialDescriptor descriptor, int i10) {
        AbstractC16544l.m18094g(descriptor, "descriptor");
        return mo5570c(descriptor);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    /* JADX INFO: renamed from: v */
    public void mo5588v(SerialDescriptor enumDescriptor, int i10) {
        AbstractC16544l.m18094g(enumDescriptor, "enumDescriptor");
        m5568T(Integer.valueOf(i10));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    /* JADX INFO: renamed from: x */
    public void mo5589x(int i10) {
        m5568T(Integer.valueOf(i10));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    /* JADX INFO: renamed from: y */
    public Encoder mo5590y(SerialDescriptor descriptor) {
        AbstractC16544l.m18094g(descriptor, "descriptor");
        return this;
    }

    @Override // p631Zn.InterfaceC10429b
    /* JADX INFO: renamed from: z */
    public void mo5591z(C11159d0 descriptor, int i10, short s10) {
        AbstractC16544l.m18094g(descriptor, "descriptor");
        mo5567S(descriptor, i10);
        mo5574h(s10);
    }

    @Override // p631Zn.InterfaceC10429b
    /* JADX INFO: renamed from: l */
    public void mo5578l(SerialDescriptor serialDescriptor, int i10, float f10) {
        AbstractC16544l.m18094g(serialDescriptor, sVoFrD.EoDQdRabEMoaqk);
        mo5567S(serialDescriptor, i10);
        mo5580n(f10);
    }
}
