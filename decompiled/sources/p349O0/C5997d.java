package p349O0;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.AbstractC16529F;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p001A.C0013G0;
import p003A1.C0257i0;
import p025An.AbstractC0575H;
import p025An.C0625m0;
import p025An.C0631p0;
import p025An.InterfaceC0627n0;
import p045Bj.C1313k;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p103Dn.C2217y0;
import p103Dn.C2219z0;
import p103Dn.InterfaceC2184i;
import p153Fn.C2925c;
import p228J.AbstractC3794B0;
import p370P0.C6278E;
import p370P0.C6279a;
import p370P0.C6300v;
import p392Q0.C6546d;
import p466T0.C7187n;
import p537W0.C8413e;
import p537W0.C8414f;
import p571X9.AbstractC9215U;
import p658b5.C11242m;
import p692d0.AbstractC12958K;
import p692d0.C12954G;
import p826j6.C16137F;
import p909nm.AbstractC17678l;
import p909nm.C17689w;
import p972qm.C18777j;
import p972qm.InterfaceC18776i;

/* JADX INFO: renamed from: O0.d */
/* JADX INFO: loaded from: classes.dex */
public final class C5997d {

    /* JADX INFO: renamed from: a */
    public static final C5987Y f19475a = new C5987Y("provider");

    /* JADX INFO: renamed from: b */
    public static final C5987Y f19476b = new C5987Y("provider");

    /* JADX INFO: renamed from: c */
    public static final C5987Y f19477c = new C5987Y("compositionLocalMap");

    /* JADX INFO: renamed from: d */
    public static final C5987Y f19478d = new C5987Y("providers");

    /* JADX INFO: renamed from: e */
    public static final C5987Y f19479e = new C5987Y("reference");

    /* JADX INFO: renamed from: f */
    public static final C0013G0 f19480f = new C0013G0(14);

    /* JADX INFO: renamed from: g */
    public static final Object f19481g = new Object();

    /* JADX INFO: renamed from: h */
    public static final C5950F f19482h = new C5950F();

    /* JADX INFO: renamed from: A */
    public static final void m6414A(String str) {
        throw new C6011k(AbstractC10763a.m11054l("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (", str, "). Please report to Google or use https://goo.gle/compose-feedback"));
    }

    /* JADX INFO: renamed from: B */
    public static C6037x m6415B(InterfaceC1426a interfaceC1426a) {
        return new C6037x(interfaceC1426a, C5975S.f19448r0);
    }

    /* JADX INFO: renamed from: C */
    public static final int m6416C(int i10) {
        switch (i10) {
            case 0:
                return 0;
            case 1:
            case 2:
            case 4:
                return 1;
            case 3:
            case 5:
            case 6:
                return 2;
            default:
                return 3;
        }
    }

    /* JADX INFO: renamed from: D */
    public static final C2925c m6417D(C6021p c6021p) {
        C18777j c18777j = C18777j.f59682Y;
        C0625m0 c0625m0 = C0625m0.f1875Y;
        InterfaceC18776i interfaceC18776iMo6490h = c6021p.f19566b.mo6490h();
        return AbstractC0575H.m1174c(interfaceC18776iMo6490h.plus(new C0631p0((InterfaceC0627n0) interfaceC18776iMo6490h.get(c0625m0))).plus(c18777j));
    }

    /* JADX INFO: renamed from: E */
    public static final long m6418E() {
        return Thread.currentThread().getId();
    }

    /* JADX INFO: renamed from: F */
    public static final void m6419F(C5947D0 c5947d0, C1313k c1313k) {
        int i10;
        int iM6366c;
        int iM6377o;
        int i11 = c5947d0.f19383t;
        int i12 = c5947d0.f19384u;
        while (i11 < i12) {
            Object objM6386x = c5947d0.m6386x(i11);
            if (objM6386x instanceof InterfaceC6009j) {
                c1313k.m2022i((InterfaceC6009j) objM6386x, c5947d0.m6377o() - c5947d0.m6355F(c5947d0.f19365b, c5947d0.m6378p(i11)), -1, -1);
            }
            int iM6355F = c5947d0.m6355F(c5947d0.f19365b, c5947d0.m6378p(i11));
            int i13 = i11 + 1;
            int iM6369f = c5947d0.m6369f(c5947d0.f19365b, c5947d0.m6378p(i13));
            int i14 = iM6355F;
            while (i14 < iM6369f) {
                int i15 = i14 - iM6355F;
                Object obj = c5947d0.f19366c[c5947d0.m6370g(i14)];
                boolean z6 = obj instanceof C6036w0;
                C5975S c5975s = C6013l.f19514a;
                if (z6) {
                    C6036w0 c6036w0 = (C6036w0) obj;
                    InterfaceC6034v0 interfaceC6034v0 = c6036w0.f19669a;
                    if (interfaceC6034v0 instanceof C6015m) {
                        i10 = i12;
                    } else {
                        int iM6370g = c5947d0.m6370g(c5947d0.m6356G(i11, i15));
                        Object[] objArr = c5947d0.f19366c;
                        i10 = i12;
                        Object obj2 = objArr[iM6370g];
                        objArr[iM6370g] = c5975s;
                        if (obj != obj2) {
                            m6470z("Slot table is out of sync");
                            throw null;
                        }
                        int iM6377o2 = c5947d0.m6377o() - i15;
                        C5995c c5995c = c6036w0.f19670b;
                        if (c5995c == null || !c5995c.m6411a()) {
                            iM6366c = -1;
                            iM6377o = -1;
                        } else {
                            iM6366c = c5947d0.m6366c(c5995c);
                            iM6377o = c5947d0.m6377o() - c5947d0.m6369f(c5947d0.f19365b, c5947d0.m6378p(c5947d0.m6379q(iM6366c) + iM6366c));
                        }
                        c1313k.m2022i(interfaceC6034v0, iM6377o2, iM6366c, iM6377o);
                    }
                } else {
                    i10 = i12;
                    if (obj instanceof C6018n0) {
                        int iM6370g2 = c5947d0.m6370g(c5947d0.m6356G(i11, i15));
                        Object[] objArr2 = c5947d0.f19366c;
                        Object obj3 = objArr2[iM6370g2];
                        objArr2[iM6370g2] = c5975s;
                        if (obj != obj3) {
                            m6470z("Slot table is out of sync");
                            throw null;
                        }
                        ((C6018n0) obj).m6502d();
                    } else {
                        continue;
                    }
                }
                i14++;
                i12 = i10;
            }
            i11 = i13;
        }
    }

    /* JADX INFO: renamed from: G */
    public static final C6546d m6420G() {
        C11242m c11242m = AbstractC5961K0.f19406b;
        C6546d c6546d = (C6546d) c11242m.m12621z();
        if (c6546d != null) {
            return c6546d;
        }
        C6546d c6546d2 = new C6546d(new C6019o[0]);
        c11242m.m12607I(c6546d2);
        return c6546d2;
    }

    /* JADX INFO: renamed from: H */
    public static final C5944C m6421H(InterfaceC1426a interfaceC1426a) {
        C11242m c11242m = AbstractC5961K0.f19405a;
        return new C5944C(interfaceC1426a, null);
    }

    /* JADX INFO: renamed from: I */
    public static final C5944C m6422I(InterfaceC1426a interfaceC1426a, InterfaceC5959J0 interfaceC5959J0) {
        C11242m c11242m = AbstractC5961K0.f19405a;
        return new C5944C(interfaceC1426a, interfaceC5959J0);
    }

    /* JADX INFO: renamed from: J */
    public static final int m6423J(int i10, ArrayList arrayList) {
        int size = arrayList.size() - 1;
        int i11 = 0;
        while (i11 <= size) {
            int i12 = (i11 + size) >>> 1;
            int iM18096i = AbstractC16544l.m18096i(((C5962L) arrayList.get(i12)).f19408b, i10);
            if (iM18096i < 0) {
                i11 = i12 + 1;
            } else {
                if (iM18096i <= 0) {
                    return i12;
                }
                size = i12 - 1;
            }
        }
        return -(i11 + 1);
    }

    /* JADX INFO: renamed from: K */
    public static final InterfaceC5977T m6424K(InterfaceC18776i interfaceC18776i) {
        InterfaceC5977T interfaceC5977T = (InterfaceC5977T) interfaceC18776i.get(C5975S.f19444Z);
        if (interfaceC5977T != null) {
            return interfaceC5977T;
        }
        throw new IllegalStateException("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.");
    }

    /* JADX INFO: renamed from: L */
    public static final void m6425L() {
        throw new IllegalStateException("Invalid applier");
    }

    /* JADX INFO: renamed from: M */
    public static final void m6426M(C6021p c6021p, InterfaceC1439n interfaceC1439n) {
        AbstractC16544l.m18092e(interfaceC1439n, "null cannot be cast to non-null type kotlin.Function2<androidx.compose.runtime.Composer, kotlin.Int, kotlin.Unit>");
        AbstractC16529F.m18081e(2, interfaceC1439n);
        interfaceC1439n.invoke(c6021p, 1);
    }

    /* JADX INFO: renamed from: N */
    public static List m6427N(C5947D0 c5947d0, int i10, C5947D0 c5947d1, boolean z6, boolean z10, boolean z11) {
        List list;
        boolean zM6352C;
        int i11;
        int iM6379q = c5947d0.m6379q(i10);
        int i12 = i10 + iM6379q;
        int iM6369f = c5947d0.m6369f(c5947d0.f19365b, c5947d0.m6378p(i10));
        int iM6369f2 = c5947d0.m6369f(c5947d0.f19365b, c5947d0.m6378p(i12));
        int i13 = iM6369f2 - iM6369f;
        boolean z12 = i10 >= 0 && (c5947d0.f19365b[(c5947d0.m6378p(i10) * 5) + 1] & 201326592) != 0;
        c5947d1.m6380r(iM6379q);
        c5947d1.m6381s(i13, c5947d1.f19383t);
        if (c5947d0.f19370g < i12) {
            c5947d0.m6384v(i12);
        }
        if (c5947d0.f19374k < iM6369f2) {
            c5947d0.m6385w(iM6369f2, i12);
        }
        int[] iArr = c5947d1.f19365b;
        int i14 = c5947d1.f19383t;
        int i15 = i14 * 5;
        AbstractC17678l.m19303j(i15, i10 * 5, i12 * 5, c5947d0.f19365b, iArr);
        Object[] objArr = c5947d1.f19366c;
        int i16 = c5947d1.f19372i;
        AbstractC17678l.m19304k(i16, iM6369f, iM6369f2, c5947d0.f19366c, objArr);
        int i17 = c5947d1.f19385v;
        iArr[i15 + 2] = i17;
        int i18 = i14 - i10;
        int i19 = i14 + iM6379q;
        int iM6369f3 = i16 - c5947d1.m6369f(iArr, i14);
        int i20 = c5947d1.f19376m;
        int i21 = c5947d1.f19375l;
        int length = objArr.length;
        boolean z13 = z12;
        int i22 = i20;
        int i23 = i14;
        while (i23 < i19) {
            if (i23 != i14) {
                int i24 = (i23 * 5) + 2;
                iArr[i24] = iArr[i24] + i18;
            }
            int i25 = i19;
            iArr[(i23 * 5) + 4] = C5947D0.m6349h(c5947d1.m6369f(iArr, i23) + iM6369f3, i22 < i23 ? 0 : c5947d1.f19374k, i21, length);
            if (i23 == i22) {
                i22++;
            }
            i23++;
            i14 = i14;
            i19 = i25;
        }
        int i26 = i14;
        int i27 = i19;
        c5947d1.f19376m = i22;
        int iM6461q = m6461q(c5947d0.f19367d, i10, c5947d0.m6376n());
        int iM6461q2 = m6461q(c5947d0.f19367d, i12, c5947d0.m6376n());
        if (iM6461q < iM6461q2) {
            ArrayList arrayList = c5947d0.f19367d;
            ArrayList arrayList2 = new ArrayList(iM6461q2 - iM6461q);
            for (int i28 = iM6461q; i28 < iM6461q2; i28++) {
                C5995c c5995c = (C5995c) arrayList.get(i28);
                c5995c.f19473a += i18;
                arrayList2.add(c5995c);
            }
            c5947d1.f19367d.addAll(m6461q(c5947d1.f19367d, c5947d1.f19383t, c5947d1.m6376n()), arrayList2);
            arrayList.subList(iM6461q, iM6461q2).clear();
            list = arrayList2;
        } else {
            list = C17689w.f56480Y;
        }
        if (!list.isEmpty()) {
            HashMap map = c5947d0.f19368e;
            HashMap map2 = c5947d1.f19368e;
            if (map != null && map2 != null) {
                int size = list.size();
                for (int i29 = 0; i29 < size; i29++) {
                }
            }
        }
        int i30 = c5947d1.f19385v;
        c5947d1.m6357H(i17);
        int iM6387y = c5947d0.m6387y(c5947d0.f19365b, i10);
        if (!z11) {
            i11 = 1;
            zM6352C = false;
        } else if (z6) {
            boolean z14 = iM6387y >= 0;
            if (z14) {
                c5947d0.m6358I();
                c5947d0.m6364a(iM6387y - c5947d0.f19383t);
                c5947d0.m6358I();
            }
            c5947d0.m6364a(i10 - c5947d0.f19383t);
            boolean zM6351B = c5947d0.m6351B();
            if (z14) {
                c5947d0.m6354E();
                c5947d0.m6371i();
                c5947d0.m6354E();
                c5947d0.m6371i();
            }
            zM6352C = zM6351B;
            i11 = 1;
        } else {
            zM6352C = c5947d0.m6352C(i10, iM6379q);
            i11 = 1;
            c5947d0.m6353D(iM6369f, i13, i10 - 1);
        }
        if (zM6352C) {
            m6470z("Unexpectedly removed anchors");
            throw null;
        }
        c5947d1.f19378o += m6460p(iArr, i26) ? i11 : m6462r(iArr, i26);
        if (z10) {
            c5947d1.f19383t = i27;
            c5947d1.f19372i = i16 + i13;
        }
        if (z13) {
            c5947d1.m6362M(i17);
        }
        return list;
    }

    /* JADX INFO: renamed from: O */
    public static final C5994b0 m6428O(float f10) {
        int i10 = AbstractC5993b.f19471b;
        return new C5994b0(f10);
    }

    /* JADX INFO: renamed from: P */
    public static final C5996c0 m6429P(int i10) {
        int i11 = AbstractC5993b.f19471b;
        return new C5996c0(i10);
    }

    /* JADX INFO: renamed from: Q */
    public static final C6002f0 m6430Q(Object obj, InterfaceC5959J0 interfaceC5959J0) {
        int i10 = AbstractC5993b.f19471b;
        return new C6002f0(obj, interfaceC5959J0);
    }

    /* JADX INFO: renamed from: R */
    public static final InterfaceC5985X m6431R(InterfaceC1439n interfaceC1439n, C6021p c6021p, Object obj) {
        Object objM6514H = c6021p.m6514H();
        C5975S c5975s = C6013l.f19514a;
        if (objM6514H == c5975s) {
            objM6514H = m6430Q(obj, C5975S.f19448r0);
            c6021p.m6537c0(objM6514H);
        }
        InterfaceC5985X interfaceC5985X = (InterfaceC5985X) objM6514H;
        C17296C c17296c = C17296C.f55119a;
        boolean zM6545h = c6021p.m6545h(interfaceC1439n);
        Object objM6514H2 = c6021p.m6514H();
        if (zM6545h || objM6514H2 == c5975s) {
            objM6514H2 = new C5963L0(interfaceC1439n, interfaceC5985X, null);
            c6021p.m6537c0(objM6514H2);
        }
        m6450f((InterfaceC1439n) objM6514H2, c6021p, c17296c);
        return interfaceC5985X;
    }

    /* JADX INFO: renamed from: S */
    public static final InterfaceC5985X m6432S(Object obj, Object obj2, Object obj3, InterfaceC1439n interfaceC1439n, C6021p c6021p, int i10) {
        Object objM6514H = c6021p.m6514H();
        C5975S c5975s = C6013l.f19514a;
        if (objM6514H == c5975s) {
            objM6514H = m6430Q(obj, C5975S.f19448r0);
            c6021p.m6537c0(objM6514H);
        }
        InterfaceC5985X interfaceC5985X = (InterfaceC5985X) objM6514H;
        boolean zM6545h = c6021p.m6545h(interfaceC1439n);
        Object objM6514H2 = c6021p.m6514H();
        if (zM6545h || objM6514H2 == c5975s) {
            objM6514H2 = new C5965M0(interfaceC1439n, interfaceC5985X, null);
            c6021p.m6537c0(objM6514H2);
        }
        m6451g(obj2, obj3, (InterfaceC1439n) objM6514H2, c6021p);
        return interfaceC5985X;
    }

    /* JADX INFO: renamed from: T */
    public static final Object m6433T(InterfaceC6008i0 interfaceC6008i0, AbstractC6012k0 abstractC6012k0) {
        AbstractC16544l.m18092e(abstractC6012k0, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
        Object objMo6480b = interfaceC6008i0.get(abstractC6012k0);
        if (objMo6480b == null) {
            objMo6480b = abstractC6012k0.mo6480b();
        }
        return ((InterfaceC5988Y0) objMo6480b).mo6389a(interfaceC6008i0);
    }

    /* JADX INFO: renamed from: U */
    public static final C6017n m6434U(C6021p c6021p) {
        c6021p.m6520O(206, f19479e);
        if (c6021p.f19563O) {
            C5947D0 c5947d0 = c6021p.f19556H;
            int i10 = c5947d0.f19385v;
            int iM6378p = c5947d0.m6378p(i10);
            int[] iArr = c5947d0.f19365b;
            int i11 = (iM6378p * 5) + 1;
            int i12 = iArr[i11];
            if ((i12 & 134217728) == 0) {
                iArr[i11] = i12 | 134217728;
                if (!m6455k(iArr, iM6378p)) {
                    c5947d0.m6362M(c5947d0.m6387y(c5947d0.f19365b, i10));
                }
            }
        }
        Object objM6507A = c6021p.m6507A();
        C6015m c6015m = objM6507A instanceof C6015m ? (C6015m) objM6507A : null;
        if (c6015m == null) {
            c6015m = new C6015m(new C6017n(c6021p, c6021p.f19564P, c6021p.f19580p, c6021p.f19550B, c6021p.f19571g.f19613B0));
            c6021p.m6539d0(c6015m);
        }
        InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
        C6017n c6017n = c6015m.f19521Y;
        c6017n.f19531f.setValue(interfaceC6008i0M6550m);
        c6021p.m6553p(false);
        return c6017n;
    }

    /* JADX INFO: renamed from: V */
    public static final InterfaceC5985X m6435V(Object obj, C6021p c6021p) {
        Object objM6514H = c6021p.m6514H();
        if (objM6514H == C6013l.f19514a) {
            objM6514H = m6430Q(obj, C5975S.f19448r0);
            c6021p.m6537c0(objM6514H);
        }
        InterfaceC5985X interfaceC5985X = (InterfaceC5985X) objM6514H;
        interfaceC5985X.setValue(obj);
        return interfaceC5985X;
    }

    /* JADX INFO: renamed from: W */
    public static final void m6436W(C5947D0 c5947d0, C1313k c1313k) {
        int iM6377o;
        int[] iArr = c5947d0.f19365b;
        int i10 = c5947d0.f19383t;
        int iM6369f = c5947d0.m6369f(iArr, c5947d0.m6378p(c5947d0.m6379q(i10) + i10));
        for (int iM6369f2 = c5947d0.m6369f(c5947d0.f19365b, c5947d0.m6378p(c5947d0.f19383t)); iM6369f2 < iM6369f; iM6369f2++) {
            Object obj = c5947d0.f19366c[c5947d0.m6370g(iM6369f2)];
            int iM6366c = -1;
            if (obj instanceof InterfaceC6009j) {
                int iM6377o2 = c5947d0.m6377o() - iM6369f2;
                InterfaceC6009j interfaceC6009j = (InterfaceC6009j) obj;
                C12954G c12954g = (C12954G) c1313k.f3471f;
                if (c12954g == null) {
                    int i11 = AbstractC12958K.f41151a;
                    c12954g = new C12954G();
                    c1313k.f3471f = c12954g;
                }
                c12954g.f41144b[c12954g.m14627d(interfaceC6009j)] = interfaceC6009j;
                c1313k.m2022i(interfaceC6009j, iM6377o2, -1, -1);
            }
            if (obj instanceof C6036w0) {
                int iM6377o3 = c5947d0.m6377o() - iM6369f2;
                C6036w0 c6036w0 = (C6036w0) obj;
                C5995c c5995c = c6036w0.f19670b;
                if (c5995c == null || !c5995c.m6411a()) {
                    iM6377o = -1;
                } else {
                    iM6366c = c5947d0.m6366c(c5995c);
                    iM6377o = c5947d0.m6377o() - c5947d0.m6369f(c5947d0.f19365b, c5947d0.m6378p(c5947d0.m6379q(iM6366c) + iM6366c));
                }
                c1313k.m2022i(c6036w0.f19669a, iM6377o3, iM6366c, iM6377o);
            }
            if (obj instanceof C6018n0) {
                ((C6018n0) obj).m6502d();
            }
        }
        c5947d0.m6351B();
    }

    /* JADX INFO: renamed from: X */
    public static final void m6437X(boolean z6) {
        if (z6) {
            return;
        }
        m6470z("Check failed");
        throw null;
    }

    /* JADX INFO: renamed from: Y */
    public static final int m6438Y(ArrayList arrayList, int i10, int i11) {
        int size = arrayList.size() - 1;
        int i12 = 0;
        while (i12 <= size) {
            int i13 = (i12 + size) >>> 1;
            int i14 = ((C5995c) arrayList.get(i13)).f19473a;
            if (i14 < 0) {
                i14 += i11;
            }
            int iM18096i = AbstractC16544l.m18096i(i14, i10);
            if (iM18096i < 0) {
                i12 = i13 + 1;
            } else {
                if (iM18096i <= 0) {
                    return i13;
                }
                size = i13 - 1;
            }
        }
        return -(i12 + 1);
    }

    /* JADX INFO: renamed from: Z */
    public static final void m6439Z(InterfaceC1439n interfaceC1439n, C6021p c6021p, Object obj) {
        if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), obj)) {
            c6021p.m6537c0(obj);
            c6021p.m6534b(obj, interfaceC1439n);
        }
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:48:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: a */
    public static final void m6440a(C6014l0 c6014l0, InterfaceC1439n interfaceC1439n, C6021p c6021p, int i10) {
        InterfaceC5988Y0 interfaceC5988Y0;
        InterfaceC6008i0 c8414f;
        boolean z6;
        InterfaceC6008i0 interfaceC6008i0;
        C6018n0 c6018n0M6555r;
        InterfaceC6008i0 interfaceC6008i1;
        InterfaceC6008i0 c8414f2;
        c6021p.m6526U(-1350970552);
        InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
        c6021p.m6520O(RCHTTPStatusCodes.CREATED, f19476b);
        Object objM6514H = c6021p.m6514H();
        if (AbstractC16544l.m18089b(objM6514H, C6013l.f19514a)) {
            interfaceC5988Y0 = null;
        } else {
            AbstractC16544l.m18092e(objM6514H, "null cannot be cast to non-null type androidx.compose.runtime.ValueHolder<kotlin.Any?>");
            interfaceC5988Y0 = (InterfaceC5988Y0) objM6514H;
        }
        AbstractC6012k0 abstractC6012k0 = c6014l0.f19515a;
        Object objM6481c = abstractC6012k0.m6481c(c6014l0, interfaceC5988Y0);
        boolean zEquals = objM6481c.equals(interfaceC5988Y0);
        if (!zEquals) {
            c6021p.m6537c0(objM6481c);
        }
        if (!c6021p.f19563O) {
            C5941A0 c5941a0 = c6021p.f19554F;
            Object objM6324b = c5941a0.m6324b(c5941a0.f19327b, c5941a0.f19332g);
            AbstractC16544l.m18092e(objM6324b, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            InterfaceC6008i0 interfaceC6008i2 = (InterfaceC6008i0) objM6324b;
            if (!(c6021p.m6562y() && zEquals) && (c6014l0.f19520f || !interfaceC6008i0M6550m.containsKey(abstractC6012k0))) {
                C8414f c8414f3 = (C8414f) interfaceC6008i0M6550m;
                c8414f3.getClass();
                C16137F c16137fM7582u = c8414f3.f22811Y.m7582u(abstractC6012k0.hashCode(), abstractC6012k0, objM6481c, 0);
                c8414f = c8414f3;
                if (c16137fM7582u != null) {
                    c8414f = new C8414f((C7187n) c16137fM7582u.f50064o0, c8414f3.f22812Z + c16137fM7582u.f50063Z);
                }
            } else {
                c8414f = interfaceC6008i2;
            }
            interfaceC6008i1 = c8414f;
            if (c6021p.f19588x || interfaceC6008i2 != c8414f) {
                z6 = true;
                interfaceC6008i0 = c8414f;
            }
            if (z6 && !c6021p.f19563O) {
                c6021p.m6512F(interfaceC6008i0);
            }
            boolean z10 = c6021p.f19586v;
            C5960K c5960k = c6021p.f19587w;
            c5960k.m6397d(z10 ? 1 : 0);
            c6021p.f19586v = z6;
            c6021p.f19558J = interfaceC6008i0;
            c6021p.m6518M(202, f19477c, interfaceC6008i0, 0);
            interfaceC1439n.invoke(c6021p, Integer.valueOf((i10 >> 3) & 14));
            c6021p.m6553p(false);
            c6021p.m6553p(false);
            c6021p.f19586v = c5960k.m6396c() != 0;
            c6021p.f19558J = null;
            c6018n0M6555r = c6021p.m6555r();
            if (c6018n0M6555r != null) {
                c6018n0M6555r.f19536d = new C0257i0(c6014l0, interfaceC1439n, i10, 24);
            }
        }
        if (c6014l0.f19520f || !interfaceC6008i0M6550m.containsKey(abstractC6012k0)) {
            c8414f2 = interfaceC6008i0M6550m;
            C8414f c8414f4 = (C8414f) interfaceC6008i0M6550m;
            c8414f4.getClass();
            C16137F c16137fM7582u2 = c8414f4.f22811Y.m7582u(abstractC6012k0.hashCode(), abstractC6012k0, objM6481c, 0);
            c8414f2 = c8414f4;
            if (c16137fM7582u2 != null) {
                c8414f2 = new C8414f((C7187n) c16137fM7582u2.f50064o0, c8414f4.f22812Z + c16137fM7582u2.f50063Z);
            }
        }
        c8414f2 = interfaceC6008i0M6550m;
        c6021p.f19557I = true;
        interfaceC6008i1 = c8414f2;
        z6 = false;
        interfaceC6008i0 = interfaceC6008i1;
        if (z6) {
            c6021p.m6512F(interfaceC6008i0);
        }
        boolean z11 = c6021p.f19586v;
        C5960K c5960k2 = c6021p.f19587w;
        c5960k2.m6397d(z11 ? 1 : 0);
        c6021p.f19586v = z6;
        c6021p.f19558J = interfaceC6008i0;
        c6021p.m6518M(202, f19477c, interfaceC6008i0, 0);
        interfaceC1439n.invoke(c6021p, Integer.valueOf((i10 >> 3) & 14));
        c6021p.m6553p(false);
        c6021p.m6553p(false);
        c6021p.f19586v = c5960k2.m6396c() != 0;
        c6021p.f19558J = null;
        c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C0257i0(c6014l0, interfaceC1439n, i10, 24);
        }
    }

    /* JADX INFO: renamed from: a0 */
    public static final C2219z0 m6441a0(InterfaceC1426a interfaceC1426a) {
        return new C2219z0(new C5976S0(interfaceC1426a, null));
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:29:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: b */
    public static final void m6442b(C6014l0[] c6014l0Arr, InterfaceC1439n interfaceC1439n, C6021p c6021p, int i10) {
        InterfaceC6008i0 interfaceC6008i0M6535b0;
        boolean z6;
        C6018n0 c6018n0M6555r;
        c6021p.m6526U(-1390796515);
        InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
        c6021p.m6520O(RCHTTPStatusCodes.CREATED, f19476b);
        if (c6021p.f19563O) {
            interfaceC6008i0M6535b0 = c6021p.m6535b0(interfaceC6008i0M6550m, m6449e0(c6014l0Arr, interfaceC6008i0M6550m, C8414f.f26160p0));
            c6021p.f19557I = true;
        } else {
            C5941A0 c5941a0 = c6021p.f19554F;
            Object objM6329g = c5941a0.m6329g(c5941a0.f19332g, 0);
            AbstractC16544l.m18092e(objM6329g, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            InterfaceC6008i0 interfaceC6008i0 = (InterfaceC6008i0) objM6329g;
            C5941A0 c5941a1 = c6021p.f19554F;
            Object objM6329g2 = c5941a1.m6329g(c5941a1.f19332g, 1);
            AbstractC16544l.m18092e(objM6329g2, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            InterfaceC6008i0 interfaceC6008i1 = (InterfaceC6008i0) objM6329g2;
            C8414f c8414fM6449e0 = m6449e0(c6014l0Arr, interfaceC6008i0M6550m, interfaceC6008i1);
            if (!c6021p.m6562y() || c6021p.f19588x || !interfaceC6008i1.equals(c8414fM6449e0)) {
                interfaceC6008i0M6535b0 = c6021p.m6535b0(interfaceC6008i0M6550m, c8414fM6449e0);
                if (c6021p.f19588x || !AbstractC16544l.m18089b(interfaceC6008i0M6535b0, interfaceC6008i0)) {
                    z6 = true;
                }
                if (z6 && !c6021p.f19563O) {
                    c6021p.m6512F(interfaceC6008i0M6535b0);
                }
                boolean z10 = c6021p.f19586v;
                C5960K c5960k = c6021p.f19587w;
                c5960k.m6397d(z10 ? 1 : 0);
                c6021p.f19586v = z6;
                c6021p.f19558J = interfaceC6008i0M6535b0;
                c6021p.m6518M(202, f19477c, interfaceC6008i0M6535b0, 0);
                interfaceC1439n.invoke(c6021p, Integer.valueOf((i10 >> 3) & 14));
                c6021p.m6553p(false);
                c6021p.m6553p(false);
                c6021p.f19586v = c5960k.m6396c() != 0;
                c6021p.f19558J = null;
                c6018n0M6555r = c6021p.m6555r();
                if (c6018n0M6555r != null) {
                    c6018n0M6555r.f19536d = new C0257i0(c6014l0Arr, interfaceC1439n, i10, 23);
                }
            }
            c6021p.f19575k = c6021p.f19554F.m6334l() + c6021p.f19575k;
            interfaceC6008i0M6535b0 = interfaceC6008i0;
        }
        z6 = false;
        if (z6) {
            c6021p.m6512F(interfaceC6008i0M6535b0);
        }
        boolean z11 = c6021p.f19586v;
        C5960K c5960k2 = c6021p.f19587w;
        c5960k2.m6397d(z11 ? 1 : 0);
        c6021p.f19586v = z6;
        c6021p.f19558J = interfaceC6008i0M6535b0;
        c6021p.m6518M(202, f19477c, interfaceC6008i0M6535b0, 0);
        interfaceC1439n.invoke(c6021p, Integer.valueOf((i10 >> 3) & 14));
        c6021p.m6553p(false);
        c6021p.m6553p(false);
        c6021p.f19586v = c5960k2.m6396c() != 0;
        c6021p.f19558J = null;
        c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C0257i0(c6014l0Arr, interfaceC1439n, i10, 23);
        }
    }

    /* JADX INFO: renamed from: b0 */
    public static final void m6443b0(String str) {
        throw new IllegalArgumentException(str);
    }

    /* JADX INFO: renamed from: c */
    public static final void m6444c(Object obj, InterfaceC1436k interfaceC1436k, C6021p c6021p) {
        boolean zM6542f = c6021p.m6542f(obj);
        Object objM6514H = c6021p.m6514H();
        if (zM6542f || objM6514H == C6013l.f19514a) {
            objM6514H = new C5946D(interfaceC1436k);
            c6021p.m6537c0(objM6514H);
        }
    }

    /* JADX INFO: renamed from: c0 */
    public static final void m6445c0(String str) {
        throw new IllegalStateException(str);
    }

    /* JADX INFO: renamed from: d */
    public static final void m6446d(Object obj, Object obj2, InterfaceC1436k interfaceC1436k, C6021p c6021p) {
        boolean zM6542f = c6021p.m6542f(obj) | c6021p.m6542f(obj2);
        Object objM6514H = c6021p.m6514H();
        if (zM6542f || objM6514H == C6013l.f19514a) {
            objM6514H = new C5946D(interfaceC1436k);
            c6021p.m6537c0(objM6514H);
        }
    }

    /* JADX INFO: renamed from: d0 */
    public static final int m6447d0(int i10) {
        int i11 = 306783378 & i10;
        int i12 = 613566756 & i10;
        return (i10 & (-920350135)) | (i12 >> 1) | i11 | ((i11 << 1) & i12);
    }

    /* JADX INFO: renamed from: e */
    public static final void m6448e(Object[] objArr, InterfaceC1436k interfaceC1436k, C6021p c6021p) {
        boolean zM6542f = false;
        for (Object obj : Arrays.copyOf(objArr, objArr.length)) {
            zM6542f |= c6021p.m6542f(obj);
        }
        Object objM6514H = c6021p.m6514H();
        if (zM6542f || objM6514H == C6013l.f19514a) {
            c6021p.m6537c0(new C5946D(interfaceC1436k));
        }
    }

    /* JADX INFO: renamed from: e0 */
    public static final C8414f m6449e0(C6014l0[] c6014l0Arr, InterfaceC6008i0 interfaceC6008i0, InterfaceC6008i0 interfaceC6008i1) {
        C8414f c8414f = C8414f.f26160p0;
        C8413e c8413e = new C8413e(c8414f);
        c8413e.f26159s0 = c8414f;
        for (C6014l0 c6014l0 : c6014l0Arr) {
            AbstractC6012k0 abstractC6012k0 = c6014l0.f19515a;
            if (c6014l0.f19520f || !interfaceC6008i0.containsKey(abstractC6012k0)) {
                c8413e.put(abstractC6012k0, abstractC6012k0.m6481c(c6014l0, (InterfaceC5988Y0) interfaceC6008i1.get(abstractC6012k0)));
            }
        }
        return c8413e.build();
    }

    /* JADX INFO: renamed from: f */
    public static final void m6450f(InterfaceC1439n interfaceC1439n, C6021p c6021p, Object obj) {
        InterfaceC18776i interfaceC18776iMo6490h = c6021p.f19566b.mo6490h();
        boolean zM6542f = c6021p.m6542f(obj);
        Object objM6514H = c6021p.m6514H();
        if (zM6542f || objM6514H == C6013l.f19514a) {
            objM6514H = new C5968O(interfaceC18776iMo6490h, interfaceC1439n);
            c6021p.m6537c0(objM6514H);
        }
    }

    /* JADX INFO: renamed from: g */
    public static final void m6451g(Object obj, Object obj2, InterfaceC1439n interfaceC1439n, C6021p c6021p) {
        InterfaceC18776i interfaceC18776iMo6490h = c6021p.f19566b.mo6490h();
        boolean zM6542f = c6021p.m6542f(obj) | c6021p.m6542f(obj2);
        Object objM6514H = c6021p.m6514H();
        if (zM6542f || objM6514H == C6013l.f19514a) {
            objM6514H = new C5968O(interfaceC18776iMo6490h, interfaceC1439n);
            c6021p.m6537c0(objM6514H);
        }
    }

    /* JADX INFO: renamed from: h */
    public static final void m6452h(Object obj, Object obj2, Object obj3, InterfaceC1439n interfaceC1439n, C6021p c6021p) {
        InterfaceC18776i interfaceC18776iMo6490h = c6021p.f19566b.mo6490h();
        boolean zM6542f = c6021p.m6542f(obj) | c6021p.m6542f(obj2) | c6021p.m6542f(obj3);
        Object objM6514H = c6021p.m6514H();
        if (zM6542f || objM6514H == C6013l.f19514a) {
            objM6514H = new C5968O(interfaceC18776iMo6490h, interfaceC1439n);
            c6021p.m6537c0(objM6514H);
        }
    }

    /* JADX INFO: renamed from: i */
    public static final void m6453i(Object[] objArr, InterfaceC1439n interfaceC1439n, C6021p c6021p) {
        InterfaceC18776i interfaceC18776iMo6490h = c6021p.f19566b.mo6490h();
        boolean zM6542f = false;
        for (Object obj : Arrays.copyOf(objArr, objArr.length)) {
            zM6542f |= c6021p.m6542f(obj);
        }
        Object objM6514H = c6021p.m6514H();
        if (zM6542f || objM6514H == C6013l.f19514a) {
            c6021p.m6537c0(new C5968O(interfaceC18776iMo6490h, interfaceC1439n));
        }
    }

    /* JADX INFO: renamed from: j */
    public static final void m6454j(InterfaceC1426a interfaceC1426a, C6021p c6021p) {
        C6279a c6279a = c6021p.f19560L.f20396b;
        c6279a.getClass();
        C6300v c6300v = C6300v.f20431c;
        C6278E c6278e = c6279a.f20394a;
        c6278e.m6846j(c6300v);
        AbstractC9215U.m9785c(c6278e, 0, interfaceC1426a);
        int i10 = c6278e.f20392g;
        int i11 = c6300v.f20379a;
        int iM6839c = C6278E.m6839c(c6278e, i11);
        int i12 = c6300v.f20380b;
        if (i10 == iM6839c && c6278e.f20393h == C6278E.m6839c(c6278e, i12)) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        int i13 = 0;
        for (int i14 = 0; i14 < i11; i14++) {
            if (((1 << i14) & c6278e.f20392g) != 0) {
                if (i13 > 0) {
                    sb2.append(", ");
                }
                sb2.append(c6300v.mo6758b(i14));
                i13++;
            }
        }
        String string = sb2.toString();
        StringBuilder sbM4500y = AbstractC3794B0.m4500y(string, "StringBuilder().apply(builderAction).toString()");
        int i15 = 0;
        for (int i16 = 0; i16 < i12; i16++) {
            if (((1 << i16) & c6278e.f20393h) != 0) {
                if (i13 > 0) {
                    sbM4500y.append(", ");
                }
                sbM4500y.append(c6300v.mo6759c(i16));
                i15++;
            }
        }
        String string2 = sbM4500y.toString();
        AbstractC16544l.m18093f(string2, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb3 = new StringBuilder("Error while pushing ");
        sb3.append(c6300v);
        sb3.append(". Not all arguments were provided. Missing ");
        AbstractC10763a.m11066x(sb3, i13, " int arguments (", string, ") and ");
        AbstractC3794B0.m4472G(sb3, i15, " object arguments (", string2, ").");
        throw null;
    }

    /* JADX INFO: renamed from: k */
    public static final boolean m6455k(int[] iArr, int i10) {
        return (iArr[(i10 * 5) + 1] & 67108864) != 0;
    }

    /* JADX INFO: renamed from: l */
    public static final int m6456l(int[] iArr, int i10) {
        return iArr[(i10 * 5) + 4];
    }

    /* JADX INFO: renamed from: m */
    public static final int m6457m(int[] iArr, int i10) {
        return iArr[(i10 * 5) + 3];
    }

    /* JADX INFO: renamed from: n */
    public static final boolean m6458n(int[] iArr, int i10) {
        return (iArr[(i10 * 5) + 1] & 268435456) != 0;
    }

    /* JADX INFO: renamed from: o */
    public static final boolean m6459o(int[] iArr, int i10) {
        return (iArr[(i10 * 5) + 1] & 536870912) != 0;
    }

    /* JADX INFO: renamed from: p */
    public static final boolean m6460p(int[] iArr, int i10) {
        return (iArr[(i10 * 5) + 1] & 1073741824) != 0;
    }

    /* JADX INFO: renamed from: q */
    public static final int m6461q(ArrayList arrayList, int i10, int i11) {
        int iM6438Y = m6438Y(arrayList, i10, i11);
        return iM6438Y >= 0 ? iM6438Y : -(iM6438Y + 1);
    }

    /* JADX INFO: renamed from: r */
    public static final int m6462r(int[] iArr, int i10) {
        return iArr[(i10 * 5) + 1] & 67108863;
    }

    /* JADX INFO: renamed from: s */
    public static final int m6463s(int[] iArr, int i10) {
        return iArr[(i10 * 5) + 2];
    }

    /* JADX INFO: renamed from: t */
    public static final void m6464t(ArrayList arrayList, int i10, int i11) {
        int iM6423J = m6423J(i10, arrayList);
        if (iM6423J < 0) {
            iM6423J = -(iM6423J + 1);
        }
        while (iM6423J < arrayList.size() && ((C5962L) arrayList.get(iM6423J)).f19408b < i11) {
            arrayList.remove(iM6423J);
        }
    }

    /* JADX INFO: renamed from: u */
    public static final int m6465u(int[] iArr, int i10) {
        int i11 = i10 * 5;
        return m6416C(iArr[i11 + 1] >> 28) + iArr[i11 + 4];
    }

    /* JADX INFO: renamed from: v */
    public static final void m6466v(int i10, int i11, int[] iArr) {
        m6437X(i11 >= 0);
        iArr[(i10 * 5) + 3] = i11;
    }

    /* JADX INFO: renamed from: w */
    public static final void m6467w(int i10, int i11, int[] iArr) {
        m6437X(i11 >= 0 && i11 < 67108863);
        int i12 = (i10 * 5) + 1;
        iArr[i12] = i11 | (iArr[i12] & (-67108864));
    }

    /* JADX INFO: renamed from: x */
    public static final InterfaceC5985X m6468x(InterfaceC2184i interfaceC2184i, Object obj, InterfaceC18776i interfaceC18776i, C6021p c6021p, int i10, int i11) {
        if ((i11 & 2) != 0) {
            interfaceC18776i = C18777j.f59682Y;
        }
        InterfaceC18776i interfaceC18776i2 = interfaceC18776i;
        boolean zM6545h = c6021p.m6545h(interfaceC18776i2) | c6021p.m6545h(interfaceC2184i);
        Object objM6514H = c6021p.m6514H();
        if (zM6545h || objM6514H == C6013l.f19514a) {
            objM6514H = new C5973Q0(interfaceC18776i2, interfaceC2184i, null);
            c6021p.m6537c0(objM6514H);
        }
        return m6432S(obj, interfaceC2184i, interfaceC18776i2, (InterfaceC1439n) objM6514H, c6021p, ((i10 >> 3) & 14) | ((i10 << 3) & 112) | (i10 & 896));
    }

    /* JADX INFO: renamed from: y */
    public static final InterfaceC5985X m6469y(C2217y0 c2217y0, C6021p c6021p) {
        return m6468x(c2217y0, c2217y0.f6797Y.getValue(), C18777j.f59682Y, c6021p, 8, 0);
    }

    /* JADX INFO: renamed from: z */
    public static final void m6470z(String str) {
        throw new C6011k(AbstractC10763a.m11054l("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (", str, "). Please report to Google or use https://goo.gle/compose-feedback"));
    }
}
