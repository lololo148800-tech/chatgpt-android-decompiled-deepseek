package p229J0;

import androidx.compose.p650ui.layout.AbstractC10868a;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC16544l;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p1095x1.AbstractC21069X;
import p1095x1.InterfaceC21056J;
import p1095x1.InterfaceC21057K;
import p1095x1.InterfaceC21058L;
import p1095x1.InterfaceC21059M;
import p1095x1.InterfaceC21095p;
import p278L0.AbstractC4879i0;
import p492U1.C7536a;
import p523V9.AbstractC8112i6;
import p571X9.AbstractC9388w4;
import p594Y9.AbstractC9930m3;
import p759g1.C13803e;
import p861l1.xapn.suYVq;
import p909nm.C17690x;
import p911o0.InterfaceC17763i0;

/* JADX INFO: renamed from: J0.K2 */
/* JADX INFO: loaded from: classes.dex */
public final class C3939K2 implements InterfaceC21057K {

    /* JADX INFO: renamed from: a */
    public final InterfaceC1436k f12138a;

    /* JADX INFO: renamed from: b */
    public final boolean f12139b;

    /* JADX INFO: renamed from: c */
    public final float f12140c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC17763i0 f12141d;

    public C3939K2(InterfaceC1436k interfaceC1436k, boolean z6, float f10, InterfaceC17763i0 interfaceC17763i0) {
        this.f12138a = interfaceC1436k;
        this.f12139b = z6;
        this.f12140c = f10;
        this.f12141d = interfaceC17763i0;
    }

    @Override // p1095x1.InterfaceC21057K
    /* JADX INFO: renamed from: a */
    public final int mo1119a(InterfaceC21095p interfaceC21095p, List list, int i10) {
        return m4637f(interfaceC21095p, list, i10, C3969Q0.f12382I0);
    }

    @Override // p1095x1.InterfaceC21057K
    /* JADX INFO: renamed from: b */
    public final int mo1120b(InterfaceC21095p interfaceC21095p, List list, int i10) {
        return m4637f(interfaceC21095p, list, i10, C3969Q0.f12384K0);
    }

    @Override // p1095x1.InterfaceC21057K
    /* JADX INFO: renamed from: d */
    public final int mo1122d(InterfaceC21095p interfaceC21095p, List list, int i10) {
        return m4638g(interfaceC21095p, list, i10, C3969Q0.f12383J0);
    }

    @Override // p1095x1.InterfaceC21057K
    /* JADX INFO: renamed from: e */
    public final int mo1123e(InterfaceC21095p interfaceC21095p, List list, int i10) {
        return m4638g(interfaceC21095p, list, i10, C3969Q0.f12385L0);
    }

    /* JADX INFO: renamed from: f */
    public final int m4637f(InterfaceC21095p interfaceC21095p, List list, int i10, InterfaceC1439n interfaceC1439n) {
        Object obj;
        int iMo21532o;
        int iIntValue;
        Object obj2;
        int iIntValue2;
        Object obj3;
        Object obj4;
        int iIntValue3;
        Object obj5;
        int i11;
        Object obj6;
        Object obj7;
        int size = list.size();
        int i12 = 0;
        while (true) {
            if (i12 >= size) {
                obj = null;
                break;
            }
            obj = list.get(i12);
            if (AbstractC16544l.m18089b(AbstractC4879i0.m5513e((InterfaceC21056J) obj), "Leading")) {
                break;
            }
            i12++;
        }
        InterfaceC21056J interfaceC21056J = (InterfaceC21056J) obj;
        if (interfaceC21056J != null) {
            iMo21532o = i10 == Integer.MAX_VALUE ? i10 : i10 - interfaceC21056J.mo21532o(Integer.MAX_VALUE);
            iIntValue = ((Number) interfaceC1439n.invoke(interfaceC21056J, Integer.valueOf(i10))).intValue();
        } else {
            iMo21532o = i10;
            iIntValue = 0;
        }
        int size2 = list.size();
        int i13 = 0;
        while (true) {
            if (i13 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list.get(i13);
            if (AbstractC16544l.m18089b(AbstractC4879i0.m5513e((InterfaceC21056J) obj2), "Trailing")) {
                break;
            }
            i13++;
        }
        InterfaceC21056J interfaceC21056J2 = (InterfaceC21056J) obj2;
        if (interfaceC21056J2 != null) {
            int iMo21532o2 = interfaceC21056J2.mo21532o(Integer.MAX_VALUE);
            if (iMo21532o != Integer.MAX_VALUE) {
                iMo21532o -= iMo21532o2;
            }
            iIntValue2 = ((Number) interfaceC1439n.invoke(interfaceC21056J2, Integer.valueOf(i10))).intValue();
        } else {
            iIntValue2 = 0;
        }
        int size3 = list.size();
        int i14 = 0;
        while (true) {
            if (i14 >= size3) {
                obj3 = null;
                break;
            }
            obj3 = list.get(i14);
            if (AbstractC16544l.m18089b(AbstractC4879i0.m5513e((InterfaceC21056J) obj3), "Label")) {
                break;
            }
            i14++;
        }
        Object obj8 = (InterfaceC21056J) obj3;
        int iIntValue4 = obj8 != null ? ((Number) interfaceC1439n.invoke(obj8, Integer.valueOf(AbstractC9930m3.m10590d(this.f12140c, iMo21532o, i10)))).intValue() : 0;
        int size4 = list.size();
        int i15 = 0;
        while (true) {
            if (i15 >= size4) {
                obj4 = null;
                break;
            }
            obj4 = list.get(i15);
            if (AbstractC16544l.m18089b(AbstractC4879i0.m5513e((InterfaceC21056J) obj4), "Prefix")) {
                break;
            }
            i15++;
        }
        InterfaceC21056J interfaceC21056J3 = (InterfaceC21056J) obj4;
        if (interfaceC21056J3 != null) {
            iIntValue3 = ((Number) interfaceC1439n.invoke(interfaceC21056J3, Integer.valueOf(iMo21532o))).intValue();
            int iMo21532o3 = interfaceC21056J3.mo21532o(Integer.MAX_VALUE);
            if (iMo21532o != Integer.MAX_VALUE) {
                iMo21532o -= iMo21532o3;
            }
        } else {
            iIntValue3 = 0;
        }
        int size5 = list.size();
        int i16 = 0;
        while (true) {
            if (i16 >= size5) {
                obj5 = null;
                break;
            }
            obj5 = list.get(i16);
            if (AbstractC16544l.m18089b(AbstractC4879i0.m5513e((InterfaceC21056J) obj5), "Suffix")) {
                break;
            }
            i16++;
        }
        InterfaceC21056J interfaceC21056J4 = (InterfaceC21056J) obj5;
        if (interfaceC21056J4 != null) {
            int iIntValue5 = ((Number) interfaceC1439n.invoke(interfaceC21056J4, Integer.valueOf(iMo21532o))).intValue();
            int iMo21532o4 = interfaceC21056J4.mo21532o(Integer.MAX_VALUE);
            if (iMo21532o != Integer.MAX_VALUE) {
                iMo21532o -= iMo21532o4;
            }
            i11 = iIntValue5;
        } else {
            i11 = 0;
        }
        int size6 = list.size();
        for (int i17 = 0; i17 < size6; i17++) {
            Object obj9 = list.get(i17);
            if (AbstractC16544l.m18089b(AbstractC4879i0.m5513e((InterfaceC21056J) obj9), "TextField")) {
                int iIntValue6 = ((Number) interfaceC1439n.invoke(obj9, Integer.valueOf(iMo21532o))).intValue();
                int size7 = list.size();
                int i18 = 0;
                while (true) {
                    if (i18 >= size7) {
                        obj6 = null;
                        break;
                    }
                    obj6 = list.get(i18);
                    if (AbstractC16544l.m18089b(AbstractC4879i0.m5513e((InterfaceC21056J) obj6), "Hint")) {
                        break;
                    }
                    i18++;
                }
                Object obj10 = (InterfaceC21056J) obj6;
                int iIntValue7 = obj10 != null ? ((Number) interfaceC1439n.invoke(obj10, Integer.valueOf(iMo21532o))).intValue() : 0;
                int size8 = list.size();
                int i19 = 0;
                while (true) {
                    if (i19 >= size8) {
                        obj7 = null;
                        break;
                    }
                    Object obj11 = list.get(i19);
                    if (AbstractC16544l.m18089b(AbstractC4879i0.m5513e((InterfaceC21056J) obj11), "Supporting")) {
                        obj7 = obj11;
                        break;
                    }
                    i19++;
                }
                Object obj12 = (InterfaceC21056J) obj7;
                return AbstractC3927I2.m4631d(iIntValue, iIntValue2, iIntValue3, i11, iIntValue6, iIntValue4, iIntValue7, obj12 != null ? ((Number) interfaceC1439n.invoke(obj12, Integer.valueOf(i10))).intValue() : 0, this.f12140c, AbstractC4879i0.f15899a, interfaceC21095p.getDensity(), this.f12141d);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    /* JADX INFO: renamed from: g */
    public final int m4638g(InterfaceC21095p interfaceC21095p, List list, int i10, InterfaceC1439n interfaceC1439n) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            Object obj7 = list.get(i11);
            if (AbstractC16544l.m18089b(AbstractC4879i0.m5513e((InterfaceC21056J) obj7), "TextField")) {
                int iIntValue = ((Number) interfaceC1439n.invoke(obj7, Integer.valueOf(i10))).intValue();
                int size2 = list.size();
                int i12 = 0;
                while (true) {
                    obj = null;
                    if (i12 >= size2) {
                        obj2 = null;
                        break;
                    }
                    obj2 = list.get(i12);
                    if (AbstractC16544l.m18089b(AbstractC4879i0.m5513e((InterfaceC21056J) obj2), "Label")) {
                        break;
                    }
                    i12++;
                }
                InterfaceC21056J interfaceC21056J = (InterfaceC21056J) obj2;
                int iIntValue2 = interfaceC21056J != null ? ((Number) interfaceC1439n.invoke(interfaceC21056J, Integer.valueOf(i10))).intValue() : 0;
                int size3 = list.size();
                int i13 = 0;
                while (true) {
                    if (i13 >= size3) {
                        obj3 = null;
                        break;
                    }
                    obj3 = list.get(i13);
                    if (AbstractC16544l.m18089b(AbstractC4879i0.m5513e((InterfaceC21056J) obj3), "Trailing")) {
                        break;
                    }
                    i13++;
                }
                InterfaceC21056J interfaceC21056J2 = (InterfaceC21056J) obj3;
                int iIntValue3 = interfaceC21056J2 != null ? ((Number) interfaceC1439n.invoke(interfaceC21056J2, Integer.valueOf(i10))).intValue() : 0;
                int size4 = list.size();
                int i14 = 0;
                while (true) {
                    if (i14 >= size4) {
                        obj4 = null;
                        break;
                    }
                    obj4 = list.get(i14);
                    if (AbstractC16544l.m18089b(AbstractC4879i0.m5513e((InterfaceC21056J) obj4), "Leading")) {
                        break;
                    }
                    i14++;
                }
                InterfaceC21056J interfaceC21056J3 = (InterfaceC21056J) obj4;
                int iIntValue4 = interfaceC21056J3 != null ? ((Number) interfaceC1439n.invoke(interfaceC21056J3, Integer.valueOf(i10))).intValue() : 0;
                int size5 = list.size();
                int i15 = 0;
                while (true) {
                    if (i15 >= size5) {
                        obj5 = null;
                        break;
                    }
                    obj5 = list.get(i15);
                    if (AbstractC16544l.m18089b(AbstractC4879i0.m5513e((InterfaceC21056J) obj5), "Prefix")) {
                        break;
                    }
                    i15++;
                }
                InterfaceC21056J interfaceC21056J4 = (InterfaceC21056J) obj5;
                int iIntValue5 = interfaceC21056J4 != null ? ((Number) interfaceC1439n.invoke(interfaceC21056J4, Integer.valueOf(i10))).intValue() : 0;
                int size6 = list.size();
                int i16 = 0;
                while (true) {
                    if (i16 >= size6) {
                        obj6 = null;
                        break;
                    }
                    obj6 = list.get(i16);
                    if (AbstractC16544l.m18089b(AbstractC4879i0.m5513e((InterfaceC21056J) obj6), "Suffix")) {
                        break;
                    }
                    i16++;
                }
                InterfaceC21056J interfaceC21056J5 = (InterfaceC21056J) obj6;
                int iIntValue6 = interfaceC21056J5 != null ? ((Number) interfaceC1439n.invoke(interfaceC21056J5, Integer.valueOf(i10))).intValue() : 0;
                int size7 = list.size();
                for (int i17 = 0; i17 < size7; i17++) {
                    Object obj8 = list.get(i17);
                    if (AbstractC16544l.m18089b(AbstractC4879i0.m5513e((InterfaceC21056J) obj8), "Hint")) {
                        obj = obj8;
                        break;
                    }
                }
                InterfaceC21056J interfaceC21056J6 = (InterfaceC21056J) obj;
                return AbstractC3927I2.m4632e(iIntValue4, iIntValue3, iIntValue5, iIntValue6, iIntValue, iIntValue2, interfaceC21056J6 != null ? ((Number) interfaceC1439n.invoke(interfaceC21056J6, Integer.valueOf(i10))).intValue() : 0, this.f12140c, AbstractC4879i0.f15899a, interfaceC21095p.getDensity(), this.f12141d);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // p1095x1.InterfaceC21057K
    /* JADX INFO: renamed from: c */
    public final InterfaceC21058L mo1121c(InterfaceC21059M interfaceC21059M, List list, long j10) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        AbstractC21069X abstractC21069X;
        Object obj5;
        Object obj6;
        Object obj7;
        InterfaceC17763i0 interfaceC17763i0 = this.f12141d;
        int iMo7866k0 = interfaceC21059M.mo7866k0(interfaceC17763i0.mo19473b());
        long jM7847b = C7536a.m7847b(j10, 0, 0, 0, 0, 10);
        int size = list.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                obj = null;
                break;
            }
            obj = list.get(i10);
            if (AbstractC16544l.m18089b(AbstractC10868a.m11315a((InterfaceC21056J) obj), suYVq.kpWNyPOjp)) {
                break;
            }
            i10++;
        }
        InterfaceC21056J interfaceC21056J = (InterfaceC21056J) obj;
        AbstractC21069X abstractC21069XMo21533p = interfaceC21056J != null ? interfaceC21056J.mo21533p(jM7847b) : null;
        int iM5515g = AbstractC4879i0.m5515g(abstractC21069XMo21533p);
        int iMax = Math.max(0, AbstractC4879i0.m5514f(abstractC21069XMo21533p));
        int size2 = list.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list.get(i11);
            if (AbstractC16544l.m18089b(AbstractC10868a.m11315a((InterfaceC21056J) obj2), "Trailing")) {
                break;
            }
            i11++;
        }
        InterfaceC21056J interfaceC21056J2 = (InterfaceC21056J) obj2;
        AbstractC21069X abstractC21069XMo21533p2 = interfaceC21056J2 != null ? interfaceC21056J2.mo21533p(AbstractC9388w4.m9970m(-iM5515g, 0, 2, jM7847b)) : null;
        int iM5515g2 = AbstractC4879i0.m5515g(abstractC21069XMo21533p2) + iM5515g;
        int iMax2 = Math.max(iMax, AbstractC4879i0.m5514f(abstractC21069XMo21533p2));
        int size3 = list.size();
        int i12 = 0;
        while (true) {
            if (i12 >= size3) {
                obj3 = null;
                break;
            }
            obj3 = list.get(i12);
            if (AbstractC16544l.m18089b(AbstractC10868a.m11315a((InterfaceC21056J) obj3), "Prefix")) {
                break;
            }
            i12++;
        }
        InterfaceC21056J interfaceC21056J3 = (InterfaceC21056J) obj3;
        AbstractC21069X abstractC21069XMo21533p3 = interfaceC21056J3 != null ? interfaceC21056J3.mo21533p(AbstractC9388w4.m9970m(-iM5515g2, 0, 2, jM7847b)) : null;
        int iM5515g3 = AbstractC4879i0.m5515g(abstractC21069XMo21533p3) + iM5515g2;
        int iMax3 = Math.max(iMax2, AbstractC4879i0.m5514f(abstractC21069XMo21533p3));
        int size4 = list.size();
        int i13 = 0;
        while (true) {
            if (i13 >= size4) {
                obj4 = null;
                break;
            }
            obj4 = list.get(i13);
            int i14 = size4;
            if (AbstractC16544l.m18089b(AbstractC10868a.m11315a((InterfaceC21056J) obj4), "Suffix")) {
                break;
            }
            i13++;
            size4 = i14;
        }
        InterfaceC21056J interfaceC21056J4 = (InterfaceC21056J) obj4;
        AbstractC21069X abstractC21069XMo21533p4 = interfaceC21056J4 != null ? interfaceC21056J4.mo21533p(AbstractC9388w4.m9970m(-iM5515g3, 0, 2, jM7847b)) : null;
        int iM5515g4 = AbstractC4879i0.m5515g(abstractC21069XMo21533p4) + iM5515g3;
        int iMax4 = Math.max(iMax3, AbstractC4879i0.m5514f(abstractC21069XMo21533p4));
        InterfaceC21059M interfaceC21059M2 = interfaceC21059M;
        int iMo7866k1 = interfaceC21059M2.mo7866k0(interfaceC17763i0.mo19472a(interfaceC21059M.getLayoutDirection())) + interfaceC21059M2.mo7866k0(interfaceC17763i0.mo19474c(interfaceC21059M.getLayoutDirection()));
        int i15 = -iM5515g4;
        C3939K2 c3939k2 = this;
        int iM10590d = AbstractC9930m3.m10590d(c3939k2.f12140c, i15 - iMo7866k1, -iMo7866k1);
        int i16 = -iMo7866k0;
        AbstractC21069X abstractC21069X2 = abstractC21069XMo21533p4;
        long jM9969l = AbstractC9388w4.m9969l(jM7847b, iM10590d, i16);
        int size5 = list.size();
        int i17 = 0;
        while (true) {
            if (i17 >= size5) {
                abstractC21069X = abstractC21069X2;
                obj5 = null;
                break;
            }
            obj5 = list.get(i17);
            int i18 = size5;
            abstractC21069X = abstractC21069X2;
            if (AbstractC16544l.m18089b(AbstractC10868a.m11315a((InterfaceC21056J) obj5), "Label")) {
                break;
            }
            i17++;
            abstractC21069X2 = abstractC21069X;
            size5 = i18;
        }
        InterfaceC21056J interfaceC21056J5 = (InterfaceC21056J) obj5;
        AbstractC21069X abstractC21069XMo21533p5 = interfaceC21056J5 != null ? interfaceC21056J5.mo21533p(jM9969l) : null;
        c3939k2.f12138a.invoke(new C13803e(abstractC21069XMo21533p5 != null ? AbstractC8112i6.m8603a(abstractC21069XMo21533p5.f66981Y, abstractC21069XMo21533p5.f66982Z) : 0L));
        int size6 = list.size();
        int i19 = 0;
        while (true) {
            if (i19 >= size6) {
                obj6 = null;
                break;
            }
            obj6 = list.get(i19);
            int i20 = size6;
            if (AbstractC16544l.m18089b(AbstractC10868a.m11315a((InterfaceC21056J) obj6), "Supporting")) {
                break;
            }
            i19++;
            size6 = i20;
        }
        InterfaceC21056J interfaceC21056J6 = (InterfaceC21056J) obj6;
        int iMo21529G = interfaceC21056J6 != null ? interfaceC21056J6.mo21529G(C7536a.m7856k(j10)) : 0;
        int iMax5 = Math.max(AbstractC4879i0.m5514f(abstractC21069XMo21533p5) / 2, interfaceC21059M2.mo7866k0(interfaceC17763i0.mo19475d()));
        long jM7847b2 = C7536a.m7847b(AbstractC9388w4.m9969l(j10, i15, (i16 - iMax5) - iMo21529G), 0, 0, 0, 0, 11);
        int size7 = list.size();
        int i21 = 0;
        while (i21 < size7) {
            int i22 = size7;
            InterfaceC21056J interfaceC21056J7 = (InterfaceC21056J) list.get(i21);
            int i23 = i21;
            if (AbstractC16544l.m18089b(AbstractC10868a.m11315a(interfaceC21056J7), "TextField")) {
                AbstractC21069X abstractC21069XMo21533p6 = interfaceC21056J7.mo21533p(jM7847b2);
                long jM7847b3 = C7536a.m7847b(jM7847b2, 0, 0, 0, 0, 14);
                int size8 = list.size();
                int i24 = 0;
                while (true) {
                    if (i24 >= size8) {
                        obj7 = null;
                        break;
                    }
                    obj7 = list.get(i24);
                    int i25 = size8;
                    if (AbstractC16544l.m18089b(AbstractC10868a.m11315a((InterfaceC21056J) obj7), "Hint")) {
                        break;
                    }
                    i24++;
                    size8 = i25;
                }
                InterfaceC21056J interfaceC21056J8 = (InterfaceC21056J) obj7;
                AbstractC21069X abstractC21069XMo21533p7 = interfaceC21056J8 != null ? interfaceC21056J8.mo21533p(jM7847b3) : null;
                int iMax6 = Math.max(iMax4, Math.max(AbstractC4879i0.m5514f(abstractC21069XMo21533p6), AbstractC4879i0.m5514f(abstractC21069XMo21533p7)) + iMax5 + iMo7866k0);
                int iM4632e = AbstractC3927I2.m4632e(AbstractC4879i0.m5515g(abstractC21069XMo21533p), AbstractC4879i0.m5515g(abstractC21069XMo21533p2), AbstractC4879i0.m5515g(abstractC21069XMo21533p3), AbstractC4879i0.m5515g(abstractC21069X), abstractC21069XMo21533p6.f66981Y, AbstractC4879i0.m5515g(abstractC21069XMo21533p5), AbstractC4879i0.m5515g(abstractC21069XMo21533p7), c3939k2.f12140c, j10, interfaceC21059M.getDensity(), c3939k2.f12141d);
                AbstractC21069X abstractC21069XMo21533p8 = interfaceC21056J6 != null ? interfaceC21056J6.mo21533p(C7536a.m7847b(AbstractC9388w4.m9970m(0, -iMax6, 1, jM7847b), 0, iM4632e, 0, 0, 9)) : null;
                int iM5514f = AbstractC4879i0.m5514f(abstractC21069XMo21533p8);
                int iM4631d = AbstractC3927I2.m4631d(AbstractC4879i0.m5514f(abstractC21069XMo21533p), AbstractC4879i0.m5514f(abstractC21069XMo21533p2), AbstractC4879i0.m5514f(abstractC21069XMo21533p3), AbstractC4879i0.m5514f(abstractC21069X), abstractC21069XMo21533p6.f66982Z, AbstractC4879i0.m5514f(abstractC21069XMo21533p5), AbstractC4879i0.m5514f(abstractC21069XMo21533p7), AbstractC4879i0.m5514f(abstractC21069XMo21533p8), c3939k2.f12140c, j10, interfaceC21059M.getDensity(), c3939k2.f12141d);
                int i26 = iM4631d - iM5514f;
                int size9 = list.size();
                for (int i27 = 0; i27 < size9; i27++) {
                    InterfaceC21056J interfaceC21056J9 = (InterfaceC21056J) list.get(i27);
                    if (AbstractC16544l.m18089b(AbstractC10868a.m11315a(interfaceC21056J9), "Container")) {
                        return interfaceC21059M.mo19936R(iM4632e, iM4631d, C17690x.f56481Y, new C3933J2(iM4631d, iM4632e, abstractC21069XMo21533p, abstractC21069XMo21533p2, abstractC21069XMo21533p3, abstractC21069X, abstractC21069XMo21533p6, abstractC21069XMo21533p5, abstractC21069XMo21533p7, interfaceC21056J9.mo21533p(AbstractC9388w4.m9958a(iM4632e != Integer.MAX_VALUE ? iM4632e : 0, iM4632e, i26 != Integer.MAX_VALUE ? i26 : 0, i26)), abstractC21069XMo21533p8, this, interfaceC21059M));
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            i21 = i23 + 1;
            size7 = i22;
            c3939k2 = this;
            interfaceC21059M2 = interfaceC21059M2;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
