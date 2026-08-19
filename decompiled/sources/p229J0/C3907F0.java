package p229J0;

import androidx.compose.p650ui.layout.AbstractC10868a;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16558z;
import p1071w0.AbstractC20734X;
import p1095x1.AbstractC21069X;
import p1095x1.AbstractC21076c;
import p1095x1.C21094o;
import p1095x1.InterfaceC21056J;
import p1095x1.InterfaceC21057K;
import p1095x1.InterfaceC21058L;
import p1095x1.InterfaceC21059M;
import p1095x1.InterfaceC21095p;
import p278L0.AbstractC4879i0;
import p302M0.AbstractC5238E;
import p492U1.C7536a;
import p571X9.AbstractC9388w4;
import p909nm.AbstractC17680n;
import p909nm.C17690x;

/* JADX INFO: renamed from: J0.F0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3907F0 implements InterfaceC21057K {

    /* JADX INFO: renamed from: b */
    public static final C3907F0 f11954b = new C3907F0(0);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f11955a;

    public /* synthetic */ C3907F0(int i10) {
        this.f11955a = i10;
    }

    /* JADX INFO: renamed from: f */
    public static final void m4610f(ArrayList arrayList, C16558z c16558z, InterfaceC21059M interfaceC21059M, ArrayList arrayList2, ArrayList arrayList3, C16558z c16558z2, ArrayList arrayList4, C16558z c16558z3, C16558z c16558z4) {
        float f10 = AbstractC4071j.f12956d;
        if (!arrayList.isEmpty()) {
            c16558z.f51287Y = interfaceC21059M.mo7866k0(f10) + c16558z.f51287Y;
        }
        arrayList.add(0, AbstractC17680n.m19322C0(arrayList2));
        arrayList3.add(Integer.valueOf(c16558z2.f51287Y));
        arrayList4.add(Integer.valueOf(c16558z.f51287Y));
        c16558z.f51287Y += c16558z2.f51287Y;
        c16558z3.f51287Y = Math.max(c16558z3.f51287Y, c16558z4.f51287Y);
        arrayList2.clear();
        c16558z4.f51287Y = 0;
        c16558z2.f51287Y = 0;
    }

    @Override // p1095x1.InterfaceC21057K
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int mo1119a(InterfaceC21095p interfaceC21095p, List list, int i10) {
        int i11 = this.f11955a;
        return AbstractC20734X.m21232c(this, interfaceC21095p, list, i10);
    }

    @Override // p1095x1.InterfaceC21057K
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int mo1120b(InterfaceC21095p interfaceC21095p, List list, int i10) {
        int i11 = this.f11955a;
        return AbstractC20734X.m21240k(this, interfaceC21095p, list, i10);
    }

    @Override // p1095x1.InterfaceC21057K
    /* JADX INFO: renamed from: c */
    public final InterfaceC21058L mo1121c(InterfaceC21059M interfaceC21059M, List list, long j10) {
        Object obj;
        Object obj2;
        AbstractC21069X abstractC21069X;
        C16558z c16558z;
        C16558z c16558z2;
        Object obj3;
        Object obj4;
        int iMax;
        int i10;
        int i11;
        int iMo21547H;
        long j11 = j10;
        C17690x c17690x = C17690x.f56481Y;
        boolean z6 = true;
        switch (this.f11955a) {
            case 0:
                int size = list.size();
                int i12 = 0;
                while (true) {
                    if (i12 < size) {
                        obj = list.get(i12);
                        if (!AbstractC16544l.m18089b(AbstractC10868a.m11315a((InterfaceC21056J) obj), "leadingIcon")) {
                            i12++;
                        }
                    } else {
                        obj = null;
                    }
                }
                InterfaceC21056J interfaceC21056J = (InterfaceC21056J) obj;
                AbstractC21069X abstractC21069XMo21533p = interfaceC21056J != null ? interfaceC21056J.mo21533p(C7536a.m7847b(j10, 0, 0, 0, 0, 10)) : null;
                int iM5515g = AbstractC4879i0.m5515g(abstractC21069XMo21533p);
                int iM5514f = AbstractC4879i0.m5514f(abstractC21069XMo21533p);
                int size2 = list.size();
                int i13 = 0;
                while (true) {
                    if (i13 < size2) {
                        obj2 = list.get(i13);
                        if (!AbstractC16544l.m18089b(AbstractC10868a.m11315a((InterfaceC21056J) obj2), "trailingIcon")) {
                            i13++;
                        }
                    } else {
                        obj2 = null;
                    }
                }
                InterfaceC21056J interfaceC21056J2 = (InterfaceC21056J) obj2;
                AbstractC21069X abstractC21069XMo21533p2 = interfaceC21056J2 != null ? interfaceC21056J2.mo21533p(C7536a.m7847b(j10, 0, 0, 0, 0, 10)) : null;
                int iM5515g2 = AbstractC4879i0.m5515g(abstractC21069XMo21533p2);
                int iM5514f2 = AbstractC4879i0.m5514f(abstractC21069XMo21533p2);
                int size3 = list.size();
                for (int i14 = 0; i14 < size3; i14++) {
                    InterfaceC21056J interfaceC21056J3 = (InterfaceC21056J) list.get(i14);
                    if (AbstractC16544l.m18089b(AbstractC10868a.m11315a(interfaceC21056J3), "label")) {
                        AbstractC21069X abstractC21069XMo21533p3 = interfaceC21056J3.mo21533p(AbstractC9388w4.m9970m(-(iM5515g + iM5515g2), 0, 2, j10));
                        int i15 = iM5515g + abstractC21069XMo21533p3.f66981Y + iM5515g2;
                        int iMax2 = Math.max(iM5514f, Math.max(abstractC21069XMo21533p3.f66982Z, iM5514f2));
                        return interfaceC21059M.mo19936R(i15, iMax2, c17690x, new C3901E0(abstractC21069XMo21533p, iM5514f, iMax2, abstractC21069XMo21533p3, iM5515g, abstractC21069XMo21533p2, iM5514f2));
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            case 1:
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                C16558z c16558z3 = new C16558z();
                C16558z c16558z4 = new C16558z();
                ArrayList arrayList4 = new ArrayList();
                C16558z c16558z5 = new C16558z();
                C16558z c16558z6 = new C16558z();
                int size4 = list.size();
                int i16 = 0;
                while (i16 < size4) {
                    AbstractC21069X abstractC21069XMo21533p4 = ((InterfaceC21056J) list.get(i16)).mo21533p(j11);
                    boolean zIsEmpty = arrayList4.isEmpty();
                    float f10 = AbstractC4071j.f12955c;
                    if (zIsEmpty) {
                        abstractC21069X = abstractC21069XMo21533p4;
                        c16558z = c16558z6;
                        c16558z2 = c16558z5;
                    } else if (interfaceC21059M.mo7866k0(f10) + c16558z5.f51287Y + abstractC21069XMo21533p4.f66981Y <= C7536a.m7854i(j10)) {
                        c16558z = c16558z6;
                        c16558z2 = c16558z5;
                        abstractC21069X = abstractC21069XMo21533p4;
                    } else {
                        float f11 = AbstractC4071j.f12953a;
                        abstractC21069X = abstractC21069XMo21533p4;
                        c16558z = c16558z6;
                        c16558z2 = c16558z5;
                        m4610f(arrayList, c16558z4, interfaceC21059M, arrayList4, arrayList2, c16558z, arrayList3, c16558z3, c16558z2);
                    }
                    C16558z c16558z7 = c16558z2;
                    if (!arrayList4.isEmpty()) {
                        c16558z7.f51287Y = interfaceC21059M.mo7866k0(f10) + c16558z7.f51287Y;
                    }
                    ArrayList arrayList5 = arrayList4;
                    arrayList5.add(abstractC21069X);
                    c16558z7.f51287Y += abstractC21069X.f66981Y;
                    C16558z c16558z8 = c16558z;
                    c16558z8.f51287Y = Math.max(c16558z8.f51287Y, abstractC21069X.f66982Z);
                    i16++;
                    j11 = j10;
                    c16558z5 = c16558z7;
                    size4 = size4;
                    c16558z4 = c16558z4;
                    c16558z3 = c16558z3;
                    arrayList3 = arrayList3;
                    arrayList4 = arrayList5;
                    c16558z6 = c16558z8;
                }
                C16558z c16558z9 = c16558z4;
                C16558z c16558z10 = c16558z3;
                ArrayList arrayList6 = arrayList3;
                C16558z c16558z11 = c16558z5;
                ArrayList arrayList7 = arrayList4;
                C16558z c16558z12 = c16558z6;
                if (!arrayList7.isEmpty()) {
                    float f12 = AbstractC4071j.f12953a;
                    m4610f(arrayList, c16558z9, interfaceC21059M, arrayList7, arrayList2, c16558z12, arrayList6, c16558z10, c16558z11);
                }
                int iMax3 = Math.max(c16558z10.f51287Y, C7536a.m7856k(j10));
                int iMax4 = Math.max(c16558z9.f51287Y, C7536a.m7855j(j10));
                float f13 = AbstractC4071j.f12953a;
                return interfaceC21059M.mo19936R(iMax3, iMax4, c17690x, new C4041e(arrayList, interfaceC21059M, iMax3, arrayList6));
            default:
                int iMin = Math.min(C7536a.m7854i(j10), interfaceC21059M.mo7866k0(AbstractC3996V3.f12537a));
                int size5 = list.size();
                int i17 = 0;
                while (true) {
                    if (i17 < size5) {
                        obj3 = list.get(i17);
                        if (!AbstractC16544l.m18089b(AbstractC10868a.m11315a((InterfaceC21056J) obj3), "action")) {
                            i17++;
                        }
                    } else {
                        obj3 = null;
                    }
                }
                InterfaceC21056J interfaceC21056J4 = (InterfaceC21056J) obj3;
                AbstractC21069X abstractC21069XMo21533p5 = interfaceC21056J4 != null ? interfaceC21056J4.mo21533p(j11) : null;
                int size6 = list.size();
                int i18 = 0;
                while (true) {
                    if (i18 < size6) {
                        obj4 = list.get(i18);
                        if (!AbstractC16544l.m18089b(AbstractC10868a.m11315a((InterfaceC21056J) obj4), "dismissAction")) {
                            i18++;
                        }
                    } else {
                        obj4 = null;
                    }
                }
                InterfaceC21056J interfaceC21056J5 = (InterfaceC21056J) obj4;
                AbstractC21069X abstractC21069XMo21533p6 = interfaceC21056J5 != null ? interfaceC21056J5.mo21533p(j11) : null;
                int i19 = abstractC21069XMo21533p5 != null ? abstractC21069XMo21533p5.f66981Y : 0;
                int i20 = abstractC21069XMo21533p5 != null ? abstractC21069XMo21533p5.f66982Z : 0;
                int i21 = abstractC21069XMo21533p6 != null ? abstractC21069XMo21533p6.f66981Y : 0;
                int i22 = abstractC21069XMo21533p6 != null ? abstractC21069XMo21533p6.f66982Z : 0;
                int iMo7866k0 = ((iMin - i19) - i21) - (i21 == 0 ? interfaceC21059M.mo7866k0(AbstractC3996V3.f12543g) : 0);
                int iM7856k = C7536a.m7856k(j10);
                int i23 = iMo7866k0 < iM7856k ? iM7856k : iMo7866k0;
                int size7 = list.size();
                int i24 = 0;
                while (i24 < size7) {
                    InterfaceC21056J interfaceC21056J6 = (InterfaceC21056J) list.get(i24);
                    int i25 = size7;
                    if (AbstractC16544l.m18089b(AbstractC10868a.m11315a(interfaceC21056J6), "text")) {
                        int i26 = i22;
                        int i27 = i20;
                        AbstractC21069X abstractC21069X2 = abstractC21069XMo21533p5;
                        AbstractC21069X abstractC21069XMo21533p7 = interfaceC21056J6.mo21533p(C7536a.m7847b(j10, 0, i23, 0, 0, 9));
                        C21094o c21094o = AbstractC21076c.f66994a;
                        int iMo21547H2 = abstractC21069XMo21533p7.mo21547H(c21094o);
                        int iMo21547H3 = abstractC21069XMo21533p7.mo21547H(AbstractC21076c.f66995b);
                        boolean z10 = (iMo21547H2 == Integer.MIN_VALUE || iMo21547H3 == Integer.MIN_VALUE) ? false : true;
                        if (iMo21547H2 != iMo21547H3 && z10) {
                            z6 = false;
                        }
                        int i28 = iMin - i21;
                        int i29 = i28 - i19;
                        if (z6) {
                            iMax = Math.max(interfaceC21059M.mo7866k0(AbstractC5238E.f17008f), Math.max(i27, i26));
                            int i30 = (iMax - abstractC21069XMo21533p7.f66982Z) / 2;
                            i11 = (abstractC21069X2 == null || (iMo21547H = abstractC21069X2.mo21547H(c21094o)) == Integer.MIN_VALUE) ? 0 : (iMo21547H2 + i30) - iMo21547H;
                            i10 = i30;
                        } else {
                            int iMo7866k1 = interfaceC21059M.mo7866k0(AbstractC3996V3.f12538b) - iMo21547H2;
                            iMax = Math.max(interfaceC21059M.mo7866k0(AbstractC5238E.f17009g), abstractC21069XMo21533p7.f66982Z + iMo7866k1);
                            i10 = iMo7866k1;
                            i11 = abstractC21069X2 != null ? (iMax - abstractC21069X2.f66982Z) / 2 : 0;
                        }
                        return interfaceC21059M.mo19936R(iMin, iMax, c17690x, new C3962O3(abstractC21069XMo21533p7, i10, abstractC21069XMo21533p6, i28, abstractC21069XMo21533p6 != null ? (iMax - abstractC21069XMo21533p6.f66982Z) / 2 : 0, abstractC21069X2, i29, i11));
                    }
                    i24++;
                    i22 = i22;
                    i20 = i20;
                    size7 = i25;
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
    }

    @Override // p1095x1.InterfaceC21057K
    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int mo1122d(InterfaceC21095p interfaceC21095p, List list, int i10) {
        int i11 = this.f11955a;
        return AbstractC20734X.m21236g(this, interfaceC21095p, list, i10);
    }

    @Override // p1095x1.InterfaceC21057K
    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int mo1123e(InterfaceC21095p interfaceC21095p, List list, int i10) {
        int i11 = this.f11955a;
        return AbstractC20734X.m21244o(this, interfaceC21095p, list, i10);
    }
}
