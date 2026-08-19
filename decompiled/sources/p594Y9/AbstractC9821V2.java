package p594Y9;

import android.gov.nist.javax.sip.header.ParameterNames;
import android.gov.nist.javax.sip.header.extensions.ReferencesHeader;
import android.gov.nist.javax.sip.stack.SIPServerTransaction;
import androidx.compose.foundation.layout.AbstractC10842a;
import com.openai.chatgpt.R;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.utils.addToStdlib.GNuz.HJrCuD;
import p001A.AbstractC0010F;
import p003A1.AbstractC0168G;
import p003A1.C0184L0;
import p042Bf.C1281w;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p1042uh.C20263a0;
import p1095x1.InterfaceC21057K;
import p1140z1.C21694h;
import p1140z1.C21696i;
import p1140z1.C21698j;
import p1140z1.InterfaceC21700k;
import p124Ei.C2467N0;
import p214Ib.AbstractC3673p;
import p214Ib.C3676s;
import p214Ib.C3677t;
import p229J0.AbstractC3943L0;
import p229J0.AbstractC4101o;
import p349O0.C5975S;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p349O0.InterfaceC5985X;
import p349O0.InterfaceC6008i0;
import p363Og.C6207k;
import p478Tc.AbstractC7313q;
import p523V9.AbstractC8142m4;
import p523V9.AbstractC8190s4;
import p527Ve.AbstractC8265b;
import p527Ve.C8276m;
import p537W0.AbstractC8411c;
import p635a1.AbstractC10443a;
import p635a1.C10444b;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p911o0.AbstractC17780r;
import p919o8.AbstractC17976h1;
import p919o8.C17904I0;
import p919o8.C17907J0;
import p919o8.C17913L0;
import p919o8.C17922O0;
import p919o8.C17925P0;
import p919o8.C17930R0;
import p919o8.C17933S0;
import p919o8.C17939U0;
import p919o8.C17942V0;
import p919o8.C17958b1;
import p919o8.C17970f1;
import p919o8.C17973g1;
import p919o8.C17979i1;
import p919o8.C17985k1;
import p919o8.C17988l1;
import p919o8.C17994n1;

/* JADX INFO: renamed from: Y9.V2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9821V2 {
    /* JADX INFO: renamed from: a */
    public static final void m10460a(List gizmos, C20263a0 c20263a0, InterfaceC1436k onGizmoSelect, InterfaceC10459q interfaceC10459q, boolean z6, C6021p c6021p, int i10) {
        int i11;
        InterfaceC5985X interfaceC5985X;
        InterfaceC10459q interfaceC10459q2;
        AbstractC16544l.m18094g(gizmos, "gizmos");
        AbstractC16544l.m18094g(onGizmoSelect, "onGizmoSelect");
        c6021p.m6526U(1871352026);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6545h(gizmos) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6545h(c20263a0) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6545h(onGizmoSelect) ? 256 : 128;
        }
        int i12 = i11 | 3072;
        if ((i10 & 24576) == 0) {
            i12 |= c6021p.m6544g(z6) ? 16384 : 8192;
        }
        if ((i12 & 9363) == 9362 && c6021p.m6562y()) {
            c6021p.m6517L();
            interfaceC10459q2 = interfaceC10459q;
        } else {
            C10456n c10456n = C10456n.f30959Y;
            c6021p.m6524S(-1021453060);
            Object objM6514H = c6021p.m6514H();
            C5975S c5975s = C6013l.f19514a;
            if (objM6514H == c5975s) {
                objM6514H = C5997d.m6430Q(Boolean.FALSE, C5975S.f19448r0);
                c6021p.m6537c0(objM6514H);
            }
            InterfaceC5985X interfaceC5985X2 = (InterfaceC5985X) objM6514H;
            c6021p.m6553p(false);
            InterfaceC21057K interfaceC21057KM19511e = AbstractC17780r.m19511e(C10444b.f30934Y, false);
            int i13 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p, c10456n);
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
            if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i13))) {
                AbstractC0168G.m537z(i13, c6021p, i13, c21694h);
            }
            C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d);
            c6021p.m6524S(1415304257);
            Object objM6514H2 = c6021p.m6514H();
            if (objM6514H2 == c5975s) {
                objM6514H2 = new C6207k(interfaceC5985X2, 14);
                c6021p.m6537c0(objM6514H2);
            }
            c6021p.m6553p(false);
            AbstractC3943L0.m4643a((InterfaceC1426a) objM6514H2, AbstractC8411c.m8969c(-510369405, c6021p, new C8276m(c20263a0, 0)), AbstractC10842a.m11235m(c10456n, AbstractC7313q.f23199d, 0.0f, 2), z6, AbstractC8411c.m8969c(-1303472186, c6021p, new C8276m(c20263a0, 1)), AbstractC8265b.f25770a, null, null, null, null, null, c6021p, ((i12 >> 3) & 7168) | 221238, 0, 1984);
            boolean zBooleanValue = ((Boolean) interfaceC5985X2.getValue()).booleanValue();
            c6021p.m6524S(1415328757);
            Object objM6514H3 = c6021p.m6514H();
            if (objM6514H3 == c5975s) {
                interfaceC5985X = interfaceC5985X2;
                objM6514H3 = new C6207k(interfaceC5985X, 15);
                c6021p.m6537c0(objM6514H3);
            } else {
                interfaceC5985X = interfaceC5985X2;
            }
            c6021p.m6553p(false);
            AbstractC8190s4.m8770a(zBooleanValue, (InterfaceC1426a) objM6514H3, null, 0L, null, null, AbstractC8411c.m8969c(1892392275, c6021p, new C1281w(onGizmoSelect, gizmos, interfaceC5985X, 12)), c6021p, 1572912, 60);
            c6021p.m6553p(true);
            interfaceC10459q2 = c10456n;
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C2467N0(gizmos, c20263a0, onGizmoSelect, interfaceC10459q2, z6, i10);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m10461b(C20263a0 c20263a0, InterfaceC1426a interfaceC1426a, InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10) {
        int i11;
        InterfaceC10459q interfaceC10459q2;
        c6021p.m6526U(30161424);
        if ((i10 & 6) == 0) {
            i11 = i10 | (c6021p.m6545h(c20263a0) ? 4 : 2);
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6545h(interfaceC1426a) ? 32 : 16;
        }
        int i12 = i11 | 384;
        if ((i12 & 147) == 146 && c6021p.m6562y()) {
            c6021p.m6517L();
            interfaceC10459q2 = interfaceC10459q;
        } else {
            C10456n c10456n = C10456n.f30959Y;
            AbstractC4101o.m4761b(AbstractC8411c.m8969c(1532716096, c6021p, new C8276m(c20263a0, 2)), interfaceC1426a, c10456n, AbstractC8411c.m8969c(476374941, c6021p, new C8276m(c20263a0, 3)), null, false, null, null, null, c6021p, (i12 & 112) | 3078 | (i12 & 896), 496);
            interfaceC10459q2 = c10456n;
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C0184L0(c20263a0, interfaceC1426a, interfaceC10459q2, i10, 29);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final String m10463d(C20263a0 c20263a0, C6021p c6021p) {
        c6021p.m6524S(-745602002);
        String strM8676d = c20263a0 != null ? c20263a0.f64086c.f64081a : null;
        if (strM8676d == null) {
            strM8676d = AbstractC8142m4.m8676d(R.string.gizmo_default_name, c6021p);
        }
        c6021p.m6553p(false);
        return strM8676d;
    }

    /* JADX INFO: renamed from: c */
    public static C17994n1 m10462c(C3676s jsonObject) {
        String strMo4384r;
        AbstractC16544l.m18094g(jsonObject, "jsonObject");
        try {
            long jMo4382p = jsonObject.m4395w("date").mo4382p();
            C17907J0 c17907j0M10425a = AbstractC9803S2.m10425a(jsonObject.m4395w(SIPServerTransaction.CONTENT_TYPE_APPLICATION).m4390m());
            AbstractC3673p abstractC3673pM4395w = jsonObject.m4395w(ReferencesHeader.SERVICE);
            String strMo4384r2 = abstractC3673pM4395w != null ? abstractC3673pM4395w.mo4384r() : null;
            AbstractC3673p abstractC3673pM4395w2 = jsonObject.m4395w("version");
            String strMo4384r3 = abstractC3673pM4395w2 != null ? abstractC3673pM4395w2.mo4384r() : null;
            AbstractC3673p abstractC3673pM4395w3 = jsonObject.m4395w("build_version");
            String strMo4384r4 = abstractC3673pM4395w3 != null ? abstractC3673pM4395w3.mo4384r() : null;
            AbstractC3673p abstractC3673pM4395w4 = jsonObject.m4395w(HJrCuD.YRac);
            String strMo4384r5 = abstractC3673pM4395w4 != null ? abstractC3673pM4395w4.mo4384r() : null;
            C17973g1 c17973g1M10637b = AbstractC9996x3.m10637b(jsonObject.m4395w(ParameterNames.SESSION).m4390m());
            AbstractC3673p abstractC3673pM4395w5 = jsonObject.m4395w("source");
            int i10 = 0;
            if (abstractC3673pM4395w5 != null && (strMo4384r = abstractC3673pM4395w5.mo4384r()) != null) {
                int[] iArrM27k = AbstractC0010F.m27k(8);
                int length = iArrM27k.length;
                while (true) {
                    if (i10 >= length) {
                        throw new NoSuchElementException("Array contains no element matching the predicate.");
                    }
                    int i11 = iArrM27k[i10];
                    if (AbstractC17976h1.m19667b(i11).equals(strMo4384r)) {
                        i10 = i11;
                        break;
                    }
                    i10++;
                }
            }
            C17979i1 c17979i1M10647b = AbstractC10008z3.m10647b(jsonObject.m4395w("view").m4390m());
            AbstractC3673p abstractC3673pM4395w6 = jsonObject.m4395w("usr");
            C17988l1 c17988l1M10301b = abstractC3673pM4395w6 != null ? AbstractC9709C3.m10301b(abstractC3673pM4395w6.m4390m()) : null;
            AbstractC3673p abstractC3673pM4395w7 = jsonObject.m4395w("connectivity");
            C17922O0 c17922o0M10486c = abstractC3673pM4395w7 != null ? AbstractC9839Y2.m10486c(abstractC3673pM4395w7.m4390m()) : null;
            AbstractC3673p abstractC3673pM4395w8 = jsonObject.m4395w("display");
            C17942V0 c17942v0M10564a = abstractC3673pM4395w8 != null ? AbstractC9900h3.m10564a(abstractC3673pM4395w8.m4390m()) : null;
            AbstractC3673p abstractC3673pM4395w9 = jsonObject.m4395w("synthetics");
            C17985k1 c17985k1M10297b = abstractC3673pM4395w9 != null ? AbstractC9703B3.m10297b(abstractC3673pM4395w9.m4390m()) : null;
            AbstractC3673p abstractC3673pM4395w10 = jsonObject.m4395w("ci_test");
            C17913L0 c17913l0M10449h = abstractC3673pM4395w10 != null ? AbstractC9815U2.m10449h(abstractC3673pM4395w10.m4390m()) : null;
            AbstractC3673p abstractC3673pM4395w11 = jsonObject.m4395w("os");
            C17958b1 c17958b1M10605a = abstractC3673pM4395w11 != null ? AbstractC9948p3.m10605a(abstractC3673pM4395w11.m4390m()) : null;
            AbstractC3673p abstractC3673pM4395w12 = jsonObject.m4395w("device");
            C17939U0 c17939u0M10545b = abstractC3673pM4395w12 != null ? AbstractC9894g3.m10545b(abstractC3673pM4395w12.m4390m()) : null;
            C17933S0 c17933s0M10519a = AbstractC9866c3.m10519a(jsonObject.m4395w("_dd").m4390m());
            AbstractC3673p abstractC3673pM4395w13 = jsonObject.m4395w("context");
            C17930R0 c17930r0M10510b = abstractC3673pM4395w13 != null ? AbstractC9859b3.m10510b(abstractC3673pM4395w13.m4390m()) : null;
            AbstractC3673p abstractC3673pM4395w14 = jsonObject.m4395w("action");
            C17904I0 c17904i0M10413a = abstractC3673pM4395w14 != null ? AbstractC9797R2.m10413a(abstractC3673pM4395w14.m4390m()) : null;
            AbstractC3673p abstractC3673pM4395w15 = jsonObject.m4395w("container");
            C17925P0 c17925p0M10492b = abstractC3673pM4395w15 != null ? AbstractC9845Z2.m10492b(abstractC3673pM4395w15.m4390m()) : null;
            String strMo4384r6 = jsonObject.m4395w("type").mo4384r();
            C17970f1 c17970f1M10631b = AbstractC9990w3.m10631b(jsonObject.m4395w("resource").m4390m());
            if (AbstractC16544l.m18089b(strMo4384r6, "resource")) {
                return new C17994n1(jMo4382p, c17907j0M10425a, strMo4384r2, strMo4384r3, strMo4384r4, strMo4384r5, c17973g1M10637b, i10, c17979i1M10647b, c17988l1M10301b, c17922o0M10486c, c17942v0M10564a, c17985k1M10297b, c17913l0M10449h, c17958b1M10605a, c17939u0M10545b, c17933s0M10519a, c17930r0M10510b, c17904i0M10413a, c17925p0M10492b, c17970f1M10631b);
            }
            throw new IllegalStateException("Check failed.");
        } catch (IllegalStateException e10) {
            throw new C3677t("Unable to parse json into type ResourceEvent", e10);
        } catch (NullPointerException e11) {
            throw new C3677t("Unable to parse json into type ResourceEvent", e11);
        } catch (NumberFormatException e12) {
            throw new C3677t("Unable to parse json into type ResourceEvent", e12);
        }
    }
}
