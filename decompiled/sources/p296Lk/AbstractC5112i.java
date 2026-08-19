package p296Lk;

import androidx.compose.p650ui.layout.AbstractC10868a;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16558z;
import p003A1.AbstractC0187M0;
import p003A1.C0248f0;
import p025An.C0644w;
import p045Bj.C1307e;
import p049Bm.InterfaceC1436k;
import p321Mk.EnumC5477o;
import p349O0.C5975S;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p349O0.InterfaceC5985X;
import p492U1.C7540e;
import p492U1.InterfaceC7537b;
import p544W9.AbstractC8489H3;
import p635a1.InterfaceC10459q;
import p911o0.AbstractC17792x;
import p911o0.C17767k0;
import p911o0.InterfaceC17763i0;

/* JADX INFO: renamed from: Lk.i */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5112i {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f16710a = 0;

    /* JADX WARN: Type inference failed for: r4v20, types: [Bm.k, kotlin.jvm.internal.n] */
    /* JADX INFO: renamed from: a */
    public static final void m5672a(InterfaceC10459q interfaceC10459q, C5119p c5119p, C5113j c5113j, C5106c c5106c, InterfaceC17763i0 interfaceC17763i0, EnumC5118o enumC5118o, InterfaceC1436k content, C6021p c6021p, int i10) {
        int i11;
        int i12;
        C5119p c5119p2;
        EnumC5118o enumC5118o2;
        InterfaceC17763i0 interfaceC17763i1;
        EnumC5477o enumC5477o;
        C5119p c5119p3;
        EnumC5118o enumC5118o3;
        InterfaceC17763i0 interfaceC17763i2;
        AbstractC16544l.m18094g(content, "content");
        c6021p.m6526U(-1347423246);
        if ((i10 & 14) == 0) {
            i11 = (c6021p.m6542f(interfaceC10459q) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= 16;
        }
        if ((i10 & 896) == 0) {
            i11 |= c6021p.m6542f(c5113j) ? 256 : 128;
        }
        if ((i10 & 7168) == 0) {
            i11 |= c6021p.m6542f(c5106c) ? 2048 : 1024;
        }
        int i13 = i11 | 221184;
        if ((3670016 & i10) == 0) {
            i13 |= c6021p.m6545h(content) ? 1048576 : 524288;
        }
        if ((2995931 & i13) == 599186 && c6021p.m6562y()) {
            c6021p.m6517L();
            c5119p3 = c5119p;
            interfaceC17763i2 = interfaceC17763i0;
            enumC5118o3 = enumC5118o;
        } else {
            c6021p.m6519N();
            int i14 = i10 & 1;
            C5975S c5975s = C6013l.f19514a;
            if (i14 == 0 || c6021p.m6561x()) {
                c6021p.m6525T(2086301451);
                C5116m c5116m = C5116m.f16717o0;
                c6021p.m6525T(2020884190);
                Object objM6514H = c6021p.m6514H();
                if (objM6514H == c5975s) {
                    objM6514H = new C5119p(c5116m);
                    c6021p.m6537c0(objM6514H);
                }
                C5119p c5119p4 = (C5119p) objM6514H;
                c6021p.m6553p(false);
                c6021p.m6553p(false);
                i12 = i13 & (-113);
                float f10 = 0;
                C17767k0 c17767k0 = new C17767k0(f10, f10, f10, f10);
                c5119p2 = c5119p4;
                enumC5118o2 = EnumC5118o.f16721Y;
                interfaceC17763i1 = c17767k0;
            } else {
                c6021p.m6517L();
                i12 = i13 & (-113);
                c5119p2 = c5119p;
                interfaceC17763i1 = interfaceC17763i0;
                enumC5118o2 = enumC5118o;
            }
            int i15 = i12;
            c6021p.m6554q();
            C5117n c5117n = new C5117n();
            content.invoke(c5117n);
            InterfaceC7537b density = (InterfaceC7537b) c6021p.m6548k(AbstractC0187M0.f704f);
            C16558z c16558z = new C16558z();
            C16558z c16558z2 = new C16558z();
            AbstractC17792x.m19523f(c5117n.f16720b, new C5111h(c16558z, c16558z2, 0));
            Integer numValueOf = Integer.valueOf(c16558z.f51287Y);
            Integer numValueOf2 = Integer.valueOf(c16558z2.f51287Y);
            int iIntValue = numValueOf.intValue();
            int iIntValue2 = numValueOf2.intValue();
            AbstractC16544l.m18094g(c5106c, "<this>");
            AbstractC16544l.m18094g(density, "density");
            if (!(c5106c instanceof C5106c)) {
                throw new C0644w();
            }
            ArrayList arrayList = new ArrayList(iIntValue);
            int i16 = 0;
            while (i16 < iIntValue) {
                arrayList.add(Float.valueOf(density.mo7864b0(((C7540e) c5106c.f16683a.invoke(Integer.valueOf(i16))).f23894Y)));
                i16++;
                iIntValue = iIntValue;
            }
            ArrayList arrayList2 = new ArrayList(iIntValue2);
            int i17 = 0;
            while (i17 < iIntValue2) {
                arrayList2.add(Float.valueOf(density.mo7864b0(((C7540e) c5106c.f16684b.invoke(Integer.valueOf(i17))).f23894Y)));
                i17++;
                iIntValue2 = iIntValue2;
            }
            C5115l c5115l = new C5115l(arrayList, arrayList2);
            c6021p.m6525T(-1357939145);
            Object objM6514H2 = c6021p.m6514H();
            if (objM6514H2 == c5975s) {
                objM6514H2 = C5997d.m6430Q(Float.valueOf(0.0f), C5975S.f19448r0);
                c6021p.m6537c0(objM6514H2);
            }
            InterfaceC5985X interfaceC5985X = (InterfaceC5985X) objM6514H2;
            c6021p.m6553p(false);
            c5119p2.getClass();
            c5119p2.f16724b = c5115l;
            AbstractC16544l.m18094g(c5113j, "<set-?>");
            c5119p2.f16725c = c5113j;
            AbstractC16544l.m18094g(enumC5118o2, "<this>");
            int iOrdinal = enumC5118o2.ordinal();
            if (iOrdinal == 0) {
                enumC5477o = EnumC5477o.f17884Y;
            } else if (iOrdinal == 1) {
                enumC5477o = EnumC5477o.f17885Z;
            } else {
                if (iOrdinal != 2) {
                    throw new C0644w();
                }
                enumC5477o = EnumC5477o.f17886o0;
            }
            EnumC5477o enumC5477o2 = enumC5477o;
            c6021p.m6525T(-1357938827);
            Object objM6514H3 = c6021p.m6514H();
            if (objM6514H3 == c5975s) {
                objM6514H3 = new C0248f0(interfaceC5985X, 26);
                c6021p.m6537c0(objM6514H3);
            }
            c6021p.m6553p(false);
            AbstractC8489H3.m9143a(AbstractC10868a.m11319e(interfaceC10459q, (InterfaceC1436k) objM6514H3), c5119p2.f16726d, interfaceC17763i1, enumC5477o2, new C1307e(interfaceC5985X, c5115l, c5117n, c5113j, 10), c6021p, (i15 >> 6) & 896);
            c5119p3 = c5119p2;
            enumC5118o3 = enumC5118o2;
            interfaceC17763i2 = interfaceC17763i1;
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C5110g(interfaceC10459q, c5119p3, c5113j, c5106c, interfaceC17763i2, enumC5118o3, content, i10);
        }
    }
}
