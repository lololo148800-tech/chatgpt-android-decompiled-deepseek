package p229J0;

import java.util.ArrayList;
import java.util.List;
import p049Bm.InterfaceC1439n;
import p1095x1.AbstractC21069X;
import p1095x1.AbstractC21076c;
import p1095x1.InterfaceC21056J;
import p1095x1.InterfaceC21058L;
import p1095x1.InterfaceC21059M;
import p1095x1.InterfaceC21061O;
import p1095x1.InterfaceC21095p;
import p278L0.AbstractC4879i0;
import p492U1.C7536a;
import p571X9.AbstractC9119D4;
import p571X9.AbstractC9388w4;
import p909nm.AbstractC17680n;
import p909nm.C17690x;

/* JADX INFO: renamed from: J0.L1 */
/* JADX INFO: loaded from: classes.dex */
public final class C3944L1 implements InterfaceC21061O {
    /* JADX INFO: renamed from: f */
    public static int m4648f(InterfaceC21095p interfaceC21095p, ArrayList arrayList, int i10, InterfaceC1439n interfaceC1439n) {
        int iIntValue;
        int iIntValue2;
        List list = (List) arrayList.get(0);
        int i11 = 1;
        List list2 = (List) arrayList.get(1);
        List list3 = (List) arrayList.get(2);
        List list4 = (List) arrayList.get(3);
        List list5 = (List) arrayList.get(4);
        int iMo7866k0 = i10 == Integer.MAX_VALUE ? i10 : i10 - interfaceC21095p.mo7866k0(AbstractC3914G1.f12014c + AbstractC3914G1.f12015d);
        InterfaceC21056J interfaceC21056J = (InterfaceC21056J) AbstractC17680n.m19343S(list4);
        if (interfaceC21056J != null) {
            iIntValue = ((Number) interfaceC1439n.invoke(interfaceC21056J, Integer.valueOf(iMo7866k0))).intValue();
            int iMo21532o = interfaceC21056J.mo21532o(Integer.MAX_VALUE);
            if (iMo7866k0 != Integer.MAX_VALUE) {
                iMo7866k0 -= iMo21532o;
            }
        } else {
            iIntValue = 0;
        }
        InterfaceC21056J interfaceC21056J2 = (InterfaceC21056J) AbstractC17680n.m19343S(list5);
        if (interfaceC21056J2 != null) {
            iIntValue2 = ((Number) interfaceC1439n.invoke(interfaceC21056J2, Integer.valueOf(iMo7866k0))).intValue();
            int iMo21532o2 = interfaceC21056J2.mo21532o(Integer.MAX_VALUE);
            if (iMo7866k0 != Integer.MAX_VALUE) {
                iMo7866k0 -= iMo21532o2;
            }
        } else {
            iIntValue2 = 0;
        }
        Object obj = (InterfaceC21056J) AbstractC17680n.m19343S(list2);
        int iIntValue3 = obj != null ? ((Number) interfaceC1439n.invoke(obj, Integer.valueOf(iMo7866k0))).intValue() : 0;
        Object obj2 = (InterfaceC21056J) AbstractC17680n.m19343S(list3);
        int iIntValue4 = obj2 != null ? ((Number) interfaceC1439n.invoke(obj2, Integer.valueOf(iMo7866k0))).intValue() : 0;
        boolean z6 = iIntValue4 > interfaceC21095p.mo7865i0(AbstractC9119D4.m9650c(30));
        boolean z10 = iIntValue3 > 0;
        boolean z11 = iIntValue4 > 0;
        if ((z10 && z11) || z6) {
            i11 = 3;
        } else if (z10 || z11) {
            i11 = 2;
        }
        Object obj3 = (InterfaceC21056J) AbstractC17680n.m19343S(list);
        return AbstractC3914G1.m4614d(interfaceC21095p, iIntValue, iIntValue2, obj3 != null ? ((Number) interfaceC1439n.invoke(obj3, Integer.valueOf(i10))).intValue() : 0, iIntValue3, iIntValue4, i11, interfaceC21095p.mo7866k0((i11 == 3 ? AbstractC3914G1.f12013b : AbstractC3914G1.f12012a) * 2), AbstractC9388w4.m9959b(0, 0, 15));
    }

    /* JADX INFO: renamed from: g */
    public static int m4649g(InterfaceC21095p interfaceC21095p, ArrayList arrayList, int i10, InterfaceC1439n interfaceC1439n) {
        List list = (List) arrayList.get(0);
        List list2 = (List) arrayList.get(1);
        List list3 = (List) arrayList.get(2);
        List list4 = (List) arrayList.get(3);
        List list5 = (List) arrayList.get(4);
        InterfaceC21056J interfaceC21056J = (InterfaceC21056J) AbstractC17680n.m19343S(list4);
        int iIntValue = interfaceC21056J != null ? ((Number) interfaceC1439n.invoke(interfaceC21056J, Integer.valueOf(i10))).intValue() : 0;
        InterfaceC21056J interfaceC21056J2 = (InterfaceC21056J) AbstractC17680n.m19343S(list5);
        int iIntValue2 = interfaceC21056J2 != null ? ((Number) interfaceC1439n.invoke(interfaceC21056J2, Integer.valueOf(i10))).intValue() : 0;
        InterfaceC21056J interfaceC21056J3 = (InterfaceC21056J) AbstractC17680n.m19343S(list);
        int iIntValue3 = interfaceC21056J3 != null ? ((Number) interfaceC1439n.invoke(interfaceC21056J3, Integer.valueOf(i10))).intValue() : 0;
        InterfaceC21056J interfaceC21056J4 = (InterfaceC21056J) AbstractC17680n.m19343S(list2);
        int iIntValue4 = interfaceC21056J4 != null ? ((Number) interfaceC1439n.invoke(interfaceC21056J4, Integer.valueOf(i10))).intValue() : 0;
        InterfaceC21056J interfaceC21056J5 = (InterfaceC21056J) AbstractC17680n.m19343S(list3);
        int iIntValue5 = interfaceC21056J5 != null ? ((Number) interfaceC1439n.invoke(interfaceC21056J5, Integer.valueOf(i10))).intValue() : 0;
        int iMo7866k0 = interfaceC21095p.mo7866k0(AbstractC3914G1.f12014c + AbstractC3914G1.f12015d);
        long jM9959b = AbstractC9388w4.m9959b(0, 0, 15);
        if (C7536a.m7850e(jM9959b)) {
            return C7536a.m7854i(jM9959b);
        }
        return iMo7866k0 + iIntValue + Math.max(iIntValue3, Math.max(iIntValue4, iIntValue5)) + iIntValue2;
    }

    @Override // p1095x1.InterfaceC21061O
    /* JADX INFO: renamed from: a */
    public final int mo4650a(InterfaceC21095p interfaceC21095p, List list, int i10) {
        return m4648f(interfaceC21095p, (ArrayList) list, i10, C3920H1.f12055Y);
    }

    @Override // p1095x1.InterfaceC21061O
    /* JADX INFO: renamed from: b */
    public final int mo4651b(InterfaceC21095p interfaceC21095p, List list, int i10) {
        return m4648f(interfaceC21095p, (ArrayList) list, i10, C3932J1.f12098Y);
    }

    @Override // p1095x1.InterfaceC21061O
    /* JADX INFO: renamed from: c */
    public final InterfaceC21058L mo4652c(InterfaceC21059M interfaceC21059M, List list, long j10) {
        int i10;
        int i11;
        int iMax;
        ArrayList arrayList = (ArrayList) list;
        List list2 = (List) arrayList.get(0);
        List list3 = (List) arrayList.get(1);
        List list4 = (List) arrayList.get(2);
        List list5 = (List) arrayList.get(3);
        List list6 = (List) arrayList.get(4);
        long jM7847b = C7536a.m7847b(j10, 0, 0, 0, 0, 10);
        float f10 = AbstractC3914G1.f12014c;
        float f11 = AbstractC3914G1.f12015d;
        int iMo7866k0 = interfaceC21059M.mo7866k0(f10 + f11);
        InterfaceC21056J interfaceC21056J = (InterfaceC21056J) AbstractC17680n.m19343S(list5);
        int iMo21531l = interfaceC21056J != null ? interfaceC21056J.mo21531l(C7536a.m7853h(j10)) : 0;
        InterfaceC21056J interfaceC21056J2 = (InterfaceC21056J) AbstractC17680n.m19343S(list6);
        int iMo21531l2 = interfaceC21056J2 != null ? interfaceC21056J2.mo21531l(C7536a.m7853h(j10)) : 0;
        int iM7854i = C7536a.m7854i(jM7847b);
        int i12 = iMo21531l + iMo21531l2 + iMo7866k0;
        if (iM7854i != Integer.MAX_VALUE) {
            iM7854i -= i12;
        }
        InterfaceC21056J interfaceC21056J3 = (InterfaceC21056J) AbstractC17680n.m19343S(list4);
        float f12 = 2;
        long jM9969l = AbstractC9388w4.m9969l(jM7847b, -iMo7866k0, -interfaceC21059M.mo7866k0(((((AbstractC17680n.m19343S(list3) != null) && (AbstractC17680n.m19343S(list4) != null)) || ((interfaceC21056J3 != null ? interfaceC21056J3.mo21529G(iM7854i) : 0) > interfaceC21059M.mo7865i0(AbstractC9119D4.m9650c(30)))) ? AbstractC3914G1.f12013b : AbstractC3914G1.f12012a) * f12));
        InterfaceC21056J interfaceC21056J4 = (InterfaceC21056J) AbstractC17680n.m19343S(list5);
        AbstractC21069X abstractC21069XMo21533p = interfaceC21056J4 != null ? interfaceC21056J4.mo21533p(jM9969l) : null;
        int iM5515g = AbstractC4879i0.m5515g(abstractC21069XMo21533p);
        InterfaceC21056J interfaceC21056J5 = (InterfaceC21056J) AbstractC17680n.m19343S(list6);
        AbstractC21069X abstractC21069XMo21533p2 = interfaceC21056J5 != null ? interfaceC21056J5.mo21533p(AbstractC9388w4.m9970m(-iM5515g, 0, 2, jM9969l)) : null;
        int iM5515g2 = AbstractC4879i0.m5515g(abstractC21069XMo21533p2) + iM5515g;
        InterfaceC21056J interfaceC21056J6 = (InterfaceC21056J) AbstractC17680n.m19343S(list2);
        AbstractC21069X abstractC21069XMo21533p3 = interfaceC21056J6 != null ? interfaceC21056J6.mo21533p(AbstractC9388w4.m9970m(-iM5515g2, 0, 2, jM9969l)) : null;
        int iM5514f = AbstractC4879i0.m5514f(abstractC21069XMo21533p3);
        InterfaceC21056J interfaceC21056J7 = (InterfaceC21056J) AbstractC17680n.m19343S(list4);
        AbstractC21069X abstractC21069XMo21533p4 = interfaceC21056J7 != null ? interfaceC21056J7.mo21533p(AbstractC9388w4.m9969l(jM9969l, -iM5515g2, -iM5514f)) : null;
        int iM5514f2 = AbstractC4879i0.m5514f(abstractC21069XMo21533p4) + iM5514f;
        boolean z6 = (abstractC21069XMo21533p4 == null || abstractC21069XMo21533p4.mo21547H(AbstractC21076c.f66994a) == abstractC21069XMo21533p4.mo21547H(AbstractC21076c.f66995b)) ? false : true;
        InterfaceC21056J interfaceC21056J8 = (InterfaceC21056J) AbstractC17680n.m19343S(list3);
        AbstractC21069X abstractC21069XMo21533p5 = interfaceC21056J8 != null ? interfaceC21056J8.mo21533p(AbstractC9388w4.m9969l(jM9969l, -iM5515g2, -iM5514f2)) : null;
        boolean z10 = abstractC21069XMo21533p5 != null;
        boolean z11 = abstractC21069XMo21533p4 != null;
        if ((z10 && z11) || z6) {
            i11 = 3;
            i10 = 3;
        } else if (z10 || z11) {
            i10 = 2;
            i11 = 3;
        } else {
            i11 = 3;
            i10 = 1;
        }
        float f13 = i10 == i11 ? AbstractC3914G1.f12013b : AbstractC3914G1.f12012a;
        float f14 = f12 * f13;
        int iM5515g3 = AbstractC4879i0.m5515g(abstractC21069XMo21533p);
        int iM5515g4 = AbstractC4879i0.m5515g(abstractC21069XMo21533p2);
        int iM5515g5 = AbstractC4879i0.m5515g(abstractC21069XMo21533p3);
        int iM5515g6 = AbstractC4879i0.m5515g(abstractC21069XMo21533p5);
        int iM5515g7 = AbstractC4879i0.m5515g(abstractC21069XMo21533p4);
        if (C7536a.m7850e(j10)) {
            iMax = C7536a.m7854i(j10);
        } else {
            iMax = iMo7866k0 + iM5515g3 + Math.max(iM5515g5, Math.max(iM5515g6, iM5515g7)) + iM5515g4;
        }
        int i13 = iMax;
        int iM4614d = AbstractC3914G1.m4614d(interfaceC21059M, AbstractC4879i0.m5514f(abstractC21069XMo21533p), AbstractC4879i0.m5514f(abstractC21069XMo21533p2), AbstractC4879i0.m5514f(abstractC21069XMo21533p3), AbstractC4879i0.m5514f(abstractC21069XMo21533p5), AbstractC4879i0.m5514f(abstractC21069XMo21533p4), i10, interfaceC21059M.mo7866k0(f14), j10);
        return interfaceC21059M.mo19936R(i13, iM4614d, C17690x.f56481Y, new C3908F1(abstractC21069XMo21533p, abstractC21069XMo21533p2, interfaceC21059M.mo7866k0(f10), i10 == 3, interfaceC21059M.mo7866k0(f13), abstractC21069XMo21533p3, abstractC21069XMo21533p5, abstractC21069XMo21533p4, iM4614d, i13, interfaceC21059M.mo7866k0(f11)));
    }

    @Override // p1095x1.InterfaceC21061O
    /* JADX INFO: renamed from: d */
    public final int mo4653d(InterfaceC21095p interfaceC21095p, List list, int i10) {
        return m4649g(interfaceC21095p, (ArrayList) list, i10, C3926I1.f12078Y);
    }

    @Override // p1095x1.InterfaceC21061O
    /* JADX INFO: renamed from: e */
    public final int mo4654e(InterfaceC21095p interfaceC21095p, List list, int i10) {
        return m4649g(interfaceC21095p, (ArrayList) list, i10, C3938K1.f12137Y);
    }
}
