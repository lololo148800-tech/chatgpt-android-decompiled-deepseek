package p636a2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.AbstractC16544l;
import mm.EnumC17307j;
import p001A.AbstractC0010F;
import p026Ao.C0681o;
import p1095x1.AbstractC21069X;
import p1095x1.AbstractC21076c;
import p1095x1.InterfaceC21056J;
import p1095x1.InterfaceC21059M;
import p437Rn.C6949g;
import p492U1.C7536a;
import p530Vi.AbstractC8301I;
import p571X9.AbstractC9227W;
import p571X9.AbstractC9388w4;
import p655b2.C11219c;
import p658b5.C11242m;
import p716e2.C13265b;
import p760g2.C13805b;
import p760g2.C13807d;
import p760g2.C13808e;
import p775h2.AbstractC14376f;
import p775h2.C14372b;
import p775h2.InterfaceC14373c;

/* JADX INFO: renamed from: a2.r */
/* JADX INFO: loaded from: classes.dex */
public final class C10481r implements InterfaceC14373c {

    /* JADX INFO: renamed from: a */
    public final C13808e f31045a;

    /* JADX INFO: renamed from: b */
    public final LinkedHashMap f31046b;

    /* JADX INFO: renamed from: c */
    public final LinkedHashMap f31047c;

    /* JADX INFO: renamed from: d */
    public final LinkedHashMap f31048d;

    /* JADX INFO: renamed from: e */
    public InterfaceC21059M f31049e;

    /* JADX INFO: renamed from: f */
    public final Object f31050f;

    /* JADX INFO: renamed from: g */
    public final int[] f31051g;

    /* JADX INFO: renamed from: h */
    public final int[] f31052h;

    public C10481r() {
        C13808e c13808e = new C13808e(0, 0);
        c13808e.f43711r0 = new ArrayList();
        c13808e.f43712s0 = new C11242m(c13808e);
        c13808e.f43713t0 = new C0681o(c13808e);
        c13808e.f43715v0 = null;
        c13808e.f43716w0 = false;
        c13808e.f43717x0 = new C11219c();
        c13808e.f43698A0 = 0;
        c13808e.f43699B0 = 0;
        c13808e.f43700C0 = new C13805b[4];
        c13808e.f43701D0 = new C13805b[4];
        c13808e.f43702E0 = 257;
        c13808e.f43703F0 = false;
        c13808e.f43704G0 = false;
        c13808e.f43705H0 = null;
        c13808e.f43706I0 = null;
        c13808e.f43707J0 = null;
        c13808e.f43708K0 = null;
        c13808e.f43709L0 = new HashSet();
        c13808e.f43710M0 = new C14372b();
        c13808e.f43715v0 = this;
        c13808e.f43713t0.f1988g = this;
        this.f31045a = c13808e;
        this.f31046b = new LinkedHashMap();
        this.f31047c = new LinkedHashMap();
        this.f31048d = new LinkedHashMap();
        this.f31050f = AbstractC9227W.m9799b(EnumC17307j.f55134Z, new C6949g(this, 18));
        this.f31051g = new int[2];
        this.f31052h = new int[2];
        new ArrayList();
    }

    /* JADX INFO: renamed from: d */
    public static void m10944d(int i10, int i11, int i12, int i13, boolean z6, boolean z10, int i14, int[] iArr) {
        String str;
        int iM24h = AbstractC0010F.m24h(i10);
        if (iM24h == 0) {
            iArr[0] = i11;
            iArr[1] = i11;
            return;
        }
        if (iM24h == 1) {
            iArr[0] = 0;
            iArr[1] = i14;
            return;
        }
        if (iM24h == 2) {
            boolean z11 = z10 || ((i13 == 1 || i13 == 2) && (i13 == 2 || i12 != 1 || z6));
            iArr[0] = z11 ? i11 : 0;
            if (!z11) {
                i11 = i14;
            }
            iArr[1] = i11;
            return;
        }
        if (iM24h == 3) {
            iArr[0] = i14;
            iArr[1] = i14;
            return;
        }
        if (i10 == 1) {
            str = "FIXED";
        } else if (i10 == 2) {
            str = "WRAP_CONTENT";
        } else if (i10 != 3) {
            str = i10 != 4 ? "null" : "MATCH_PARENT";
        } else {
            str = "MATCH_CONSTRAINT";
        }
        throw new IllegalStateException(str.concat(" is not supported").toString());
    }

    /* JADX WARN: Code duplicated, block: B:94:0x01cb  */
    @Override // p775h2.InterfaceC14373c
    /* JADX INFO: renamed from: b */
    public final void mo10946b(C13807d constraintWidget, C14372b measure) {
        Integer num;
        Integer num2;
        boolean z6;
        int iMo21547H;
        AbstractC16544l.m18094g(constraintWidget, "constraintWidget");
        AbstractC16544l.m18094g(measure, "measure");
        Object obj = constraintWidget.f43668g0;
        if (obj instanceof InterfaceC21056J) {
            LinkedHashMap linkedHashMap = this.f31047c;
            Integer[] numArr = (Integer[]) linkedHashMap.get(obj);
            int i10 = measure.f45067a;
            AbstractC14376f.m15829H(i10, "measure.horizontalBehavior");
            m10944d(i10, measure.f45069c, constraintWidget.f43690s, measure.f45076j, ((numArr != null && (num = numArr[1]) != null) ? num.intValue() : 0) == constraintWidget.m15383l(), constraintWidget.mo15336B(), C7536a.m7854i(m10947c().f31058f), this.f31051g);
            int i11 = measure.f45068b;
            AbstractC14376f.m15829H(i11, "measure.verticalBehavior");
            m10944d(i11, measure.f45070d, constraintWidget.f43691t, measure.f45076j, ((numArr != null && (num2 = numArr[0]) != null) ? num2.intValue() : 0) == constraintWidget.m15387r(), constraintWidget.mo15337C(), C7536a.m7853h(m10947c().f31058f), this.f31052h);
            int[] iArr = this.f31051g;
            int i12 = iArr[0];
            int i13 = iArr[1];
            int[] iArr2 = this.f31052h;
            long jM9958a = AbstractC9388w4.m9958a(i12, i13, iArr2[0], iArr2[1]);
            int i14 = measure.f45076j;
            LinkedHashMap linkedHashMap2 = this.f31046b;
            if (i14 == 1 || i14 == 2 || measure.f45067a != 3 || constraintWidget.f43690s != 0 || measure.f45068b != 3 || constraintWidget.f43691t != 0) {
                InterfaceC21056J interfaceC21056J = (InterfaceC21056J) obj;
                AbstractC21069X abstractC21069XMo21533p = interfaceC21056J.mo21533p(jM9958a);
                linkedHashMap2.put(obj, abstractC21069XMo21533p);
                constraintWidget.f43667g = false;
                Integer numValueOf = Integer.valueOf(abstractC21069XMo21533p.f66981Y);
                int i15 = constraintWidget.f43693v;
                Integer numValueOf2 = i15 > 0 ? Integer.valueOf(i15) : null;
                int i16 = constraintWidget.f43694w;
                int iIntValue = ((Number) AbstractC8301I.m8925p(numValueOf, numValueOf2, i16 > 0 ? Integer.valueOf(i16) : null)).intValue();
                Integer numValueOf3 = Integer.valueOf(abstractC21069XMo21533p.f66982Z);
                int i17 = constraintWidget.f43696y;
                Integer numValueOf4 = i17 > 0 ? Integer.valueOf(i17) : null;
                int i18 = constraintWidget.f43697z;
                int iIntValue2 = ((Number) AbstractC8301I.m8925p(numValueOf3, numValueOf4, i18 > 0 ? Integer.valueOf(i18) : null)).intValue();
                if (iIntValue != abstractC21069XMo21533p.f66981Y) {
                    jM9958a = AbstractC9388w4.m9958a(iIntValue, iIntValue, C7536a.m7855j(jM9958a), C7536a.m7853h(jM9958a));
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (iIntValue2 != abstractC21069XMo21533p.f66982Z) {
                    jM9958a = AbstractC9388w4.m9958a(C7536a.m7856k(jM9958a), C7536a.m7854i(jM9958a), iIntValue2, iIntValue2);
                    z6 = true;
                }
                if (z6) {
                    linkedHashMap2.put(obj, interfaceC21056J.mo21533p(jM9958a));
                    constraintWidget.f43667g = false;
                }
            }
            AbstractC21069X abstractC21069X = (AbstractC21069X) linkedHashMap2.get(obj);
            Integer numValueOf5 = abstractC21069X == null ? null : Integer.valueOf(abstractC21069X.f66981Y);
            measure.f45071e = numValueOf5 == null ? constraintWidget.m15387r() : numValueOf5.intValue();
            Integer numValueOf6 = abstractC21069X == null ? null : Integer.valueOf(abstractC21069X.f66982Z);
            measure.f45072f = numValueOf6 == null ? constraintWidget.m15383l() : numValueOf6.intValue();
            if (abstractC21069X != null) {
                C10482s c10482sM10947c = m10947c();
                c10482sM10947c.getClass();
                boolean z10 = c10482sM10947c.f31061i;
                LinkedHashSet linkedHashSet = c10482sM10947c.f31062j;
                if (z10) {
                    linkedHashSet.clear();
                    Iterator it = c10482sM10947c.f31060h.iterator();
                    while (it.hasNext()) {
                        C13265b c13265b = (C13265b) c10482sM10947c.f31053a.get(it.next());
                        C13807d c13807dMo14865d = c13265b == null ? null : c13265b.mo14865d();
                        if (c13807dMo14865d != null) {
                            linkedHashSet.add(c13807dMo14865d);
                        }
                    }
                    c10482sM10947c.f31061i = false;
                }
                if (linkedHashSet.contains(constraintWidget)) {
                    iMo21547H = abstractC21069X.mo21547H(AbstractC21076c.f66994a);
                } else {
                    iMo21547H = Integer.MIN_VALUE;
                }
            } else {
                iMo21547H = Integer.MIN_VALUE;
            }
            measure.f45074h = iMo21547H != Integer.MIN_VALUE;
            measure.f45073g = iMo21547H;
            Object obj2 = linkedHashMap.get(obj);
            Object obj3 = obj2;
            if (obj2 == null) {
                Integer[] numArr2 = {0, 0, Integer.MIN_VALUE};
                linkedHashMap.put(obj, numArr2);
                obj3 = numArr2;
            }
            Integer[] numArr3 = (Integer[]) obj3;
            numArr3[0] = Integer.valueOf(measure.f45071e);
            numArr3[1] = Integer.valueOf(measure.f45072f);
            numArr3[2] = Integer.valueOf(measure.f45073g);
            measure.f45075i = (measure.f45071e == measure.f45069c && measure.f45072f == measure.f45070d) ? false : true;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, mm.i] */
    /* JADX INFO: renamed from: c */
    public final C10482s m10947c() {
        return (C10482s) this.f31050f.getValue();
    }

    @Override // p775h2.InterfaceC14373c
    /* JADX INFO: renamed from: a */
    public final void mo10945a() {
    }
}
