package p229J0;

import androidx.compose.p650ui.layout.AbstractC10868a;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC16544l;
import p049Bm.InterfaceC1439n;
import p1095x1.AbstractC21069X;
import p1095x1.InterfaceC21056J;
import p1095x1.InterfaceC21057K;
import p1095x1.InterfaceC21058L;
import p1095x1.InterfaceC21059M;
import p1095x1.InterfaceC21095p;
import p278L0.AbstractC4879i0;
import p492U1.C7536a;
import p571X9.AbstractC9388w4;
import p909nm.C17690x;
import p911o0.InterfaceC17763i0;
import p926of.yRae.sVDIzpC;

/* JADX INFO: renamed from: J0.o4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4106o4 implements InterfaceC21057K {

    /* JADX INFO: renamed from: a */
    public final boolean f13182a;

    /* JADX INFO: renamed from: b */
    public final float f13183b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC17763i0 f13184c;

    public C4106o4(boolean z6, float f10, InterfaceC17763i0 interfaceC17763i0) {
        this.f13182a = z6;
        this.f13183b = f10;
        this.f13184c = interfaceC17763i0;
    }

    /* JADX INFO: renamed from: g */
    public static int m4763g(List list, int i10, InterfaceC1439n interfaceC1439n) {
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
                    if (AbstractC16544l.m18089b(AbstractC4879i0.m5513e((InterfaceC21056J) obj4), "Prefix")) {
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
                    if (AbstractC16544l.m18089b(AbstractC4879i0.m5513e((InterfaceC21056J) obj5), "Suffix")) {
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
                    if (AbstractC16544l.m18089b(AbstractC4879i0.m5513e((InterfaceC21056J) obj6), "Leading")) {
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
                int iIntValue7 = interfaceC21056J6 != null ? ((Number) interfaceC1439n.invoke(interfaceC21056J6, Integer.valueOf(i10))).intValue() : 0;
                long j10 = AbstractC4879i0.f15899a;
                float f10 = AbstractC4094m4.f13114a;
                int i18 = iIntValue4 + iIntValue5;
                return Math.max(Math.max(iIntValue + i18, Math.max(iIntValue7 + i18, iIntValue2)) + iIntValue6 + iIntValue3, C7536a.m7856k(j10));
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // p1095x1.InterfaceC21057K
    /* JADX INFO: renamed from: a */
    public final int mo1119a(InterfaceC21095p interfaceC21095p, List list, int i10) {
        return m4764f(interfaceC21095p, list, i10, C3969Q0.f12387N0);
    }

    @Override // p1095x1.InterfaceC21057K
    /* JADX INFO: renamed from: b */
    public final int mo1120b(InterfaceC21095p interfaceC21095p, List list, int i10) {
        return m4764f(interfaceC21095p, list, i10, C3969Q0.f12389P0);
    }

    @Override // p1095x1.InterfaceC21057K
    /* JADX INFO: renamed from: d */
    public final int mo1122d(InterfaceC21095p interfaceC21095p, List list, int i10) {
        return m4763g(list, i10, C3969Q0.f12388O0);
    }

    @Override // p1095x1.InterfaceC21057K
    /* JADX INFO: renamed from: e */
    public final int mo1123e(InterfaceC21095p interfaceC21095p, List list, int i10) {
        return m4763g(list, i10, C3929I4.f12086o0);
    }

    /* JADX INFO: renamed from: f */
    public final int m4764f(InterfaceC21095p interfaceC21095p, List list, int i10, InterfaceC1439n interfaceC1439n) {
        Object obj;
        int iMo21532o;
        int iIntValue;
        Object obj2;
        int iIntValue2;
        Object obj3;
        Object obj4;
        int i11;
        Object obj5;
        int i12;
        Object obj6;
        Object obj7;
        int size = list.size();
        int i13 = 0;
        while (true) {
            if (i13 >= size) {
                obj = null;
                break;
            }
            obj = list.get(i13);
            if (AbstractC16544l.m18089b(AbstractC4879i0.m5513e((InterfaceC21056J) obj), "Leading")) {
                break;
            }
            i13++;
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
        int i14 = 0;
        while (true) {
            if (i14 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list.get(i14);
            if (AbstractC16544l.m18089b(AbstractC4879i0.m5513e((InterfaceC21056J) obj2), "Trailing")) {
                break;
            }
            i14++;
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
        int i15 = 0;
        while (true) {
            if (i15 >= size3) {
                obj3 = null;
                break;
            }
            obj3 = list.get(i15);
            if (AbstractC16544l.m18089b(AbstractC4879i0.m5513e((InterfaceC21056J) obj3), "Label")) {
                break;
            }
            i15++;
        }
        Object obj8 = (InterfaceC21056J) obj3;
        int iIntValue3 = obj8 != null ? ((Number) interfaceC1439n.invoke(obj8, Integer.valueOf(iMo21532o))).intValue() : 0;
        int size4 = list.size();
        int i16 = 0;
        while (true) {
            if (i16 >= size4) {
                obj4 = null;
                break;
            }
            obj4 = list.get(i16);
            if (AbstractC16544l.m18089b(AbstractC4879i0.m5513e((InterfaceC21056J) obj4), "Prefix")) {
                break;
            }
            i16++;
        }
        InterfaceC21056J interfaceC21056J3 = (InterfaceC21056J) obj4;
        if (interfaceC21056J3 != null) {
            int iIntValue4 = ((Number) interfaceC1439n.invoke(interfaceC21056J3, Integer.valueOf(iMo21532o))).intValue();
            int iMo21532o3 = interfaceC21056J3.mo21532o(Integer.MAX_VALUE);
            if (iMo21532o != Integer.MAX_VALUE) {
                iMo21532o -= iMo21532o3;
            }
            i11 = iIntValue4;
        } else {
            i11 = 0;
        }
        int size5 = list.size();
        int i17 = 0;
        while (true) {
            if (i17 >= size5) {
                obj5 = null;
                break;
            }
            obj5 = list.get(i17);
            if (AbstractC16544l.m18089b(AbstractC4879i0.m5513e((InterfaceC21056J) obj5), "Suffix")) {
                break;
            }
            i17++;
        }
        InterfaceC21056J interfaceC21056J4 = (InterfaceC21056J) obj5;
        if (interfaceC21056J4 != null) {
            int iIntValue5 = ((Number) interfaceC1439n.invoke(interfaceC21056J4, Integer.valueOf(iMo21532o))).intValue();
            int iMo21532o4 = interfaceC21056J4.mo21532o(Integer.MAX_VALUE);
            if (iMo21532o != Integer.MAX_VALUE) {
                iMo21532o -= iMo21532o4;
            }
            i12 = iIntValue5;
        } else {
            i12 = 0;
        }
        int size6 = list.size();
        for (int i18 = 0; i18 < size6; i18++) {
            Object obj9 = list.get(i18);
            if (AbstractC16544l.m18089b(AbstractC4879i0.m5513e((InterfaceC21056J) obj9), "TextField")) {
                int iIntValue6 = ((Number) interfaceC1439n.invoke(obj9, Integer.valueOf(iMo21532o))).intValue();
                int size7 = list.size();
                int i19 = 0;
                while (true) {
                    if (i19 >= size7) {
                        obj6 = null;
                        break;
                    }
                    obj6 = list.get(i19);
                    if (AbstractC16544l.m18089b(AbstractC4879i0.m5513e((InterfaceC21056J) obj6), "Hint")) {
                        break;
                    }
                    i19++;
                }
                Object obj10 = (InterfaceC21056J) obj6;
                int iIntValue7 = obj10 != null ? ((Number) interfaceC1439n.invoke(obj10, Integer.valueOf(iMo21532o))).intValue() : 0;
                int size8 = list.size();
                int i20 = 0;
                while (true) {
                    if (i20 >= size8) {
                        obj7 = null;
                        break;
                    }
                    Object obj11 = list.get(i20);
                    if (AbstractC16544l.m18089b(AbstractC4879i0.m5513e((InterfaceC21056J) obj11), "Supporting")) {
                        obj7 = obj11;
                        break;
                    }
                    i20++;
                }
                Object obj12 = (InterfaceC21056J) obj7;
                return AbstractC4094m4.m4755c(iIntValue6, iIntValue3, iIntValue, iIntValue2, i11, i12, iIntValue7, obj12 != null ? ((Number) interfaceC1439n.invoke(obj12, Integer.valueOf(i10))).intValue() : 0, this.f13183b, AbstractC4879i0.f15899a, interfaceC21095p.getDensity(), this.f13184c);
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
        Object obj5;
        Object obj6;
        Object obj7;
        List list2 = list;
        InterfaceC17763i0 interfaceC17763i0 = this.f13184c;
        int iMo7866k0 = interfaceC21059M.mo7866k0(interfaceC17763i0.mo19475d());
        int iMo7866k1 = interfaceC21059M.mo7866k0(interfaceC17763i0.mo19473b());
        long jM7847b = C7536a.m7847b(j10, 0, 0, 0, 0, 10);
        int size = list.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                obj = null;
                break;
            }
            obj = list2.get(i10);
            if (AbstractC16544l.m18089b(AbstractC10868a.m11315a((InterfaceC21056J) obj), "Leading")) {
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
            obj2 = list2.get(i11);
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
            obj3 = list2.get(i12);
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
            obj4 = list2.get(i13);
            if (AbstractC16544l.m18089b(AbstractC10868a.m11315a((InterfaceC21056J) obj4), sVDIzpC.ucXAotgc)) {
                break;
            }
            i13++;
        }
        InterfaceC21056J interfaceC21056J4 = (InterfaceC21056J) obj4;
        AbstractC21069X abstractC21069XMo21533p4 = interfaceC21056J4 != null ? interfaceC21056J4.mo21533p(AbstractC9388w4.m9970m(-iM5515g3, 0, 2, jM7847b)) : null;
        int iM5515g4 = AbstractC4879i0.m5515g(abstractC21069XMo21533p4) + iM5515g3;
        int iMax4 = Math.max(iMax3, AbstractC4879i0.m5514f(abstractC21069XMo21533p4));
        int i14 = -iM5515g4;
        long jM9969l = AbstractC9388w4.m9969l(jM7847b, i14, -iMo7866k1);
        int size5 = list.size();
        int i15 = 0;
        while (true) {
            if (i15 >= size5) {
                obj5 = null;
                break;
            }
            Object obj8 = list2.get(i15);
            int i16 = size5;
            if (AbstractC16544l.m18089b(AbstractC10868a.m11315a((InterfaceC21056J) obj8), "Label")) {
                obj5 = obj8;
                break;
            }
            i15++;
            size5 = i16;
        }
        InterfaceC21056J interfaceC21056J5 = (InterfaceC21056J) obj5;
        AbstractC21069X abstractC21069XMo21533p5 = interfaceC21056J5 != null ? interfaceC21056J5.mo21533p(jM9969l) : null;
        int size6 = list.size();
        int i17 = 0;
        while (true) {
            if (i17 >= size6) {
                obj6 = null;
                break;
            }
            obj6 = list2.get(i17);
            int i18 = size6;
            if (AbstractC16544l.m18089b(AbstractC10868a.m11315a((InterfaceC21056J) obj6), "Supporting")) {
                break;
            }
            i17++;
            size6 = i18;
        }
        InterfaceC21056J interfaceC21056J6 = (InterfaceC21056J) obj6;
        int iMo21529G = interfaceC21056J6 != null ? interfaceC21056J6.mo21529G(C7536a.m7856k(j10)) : 0;
        int iM5514f = AbstractC4879i0.m5514f(abstractC21069XMo21533p5) + iMo7866k0;
        long jM9969l2 = AbstractC9388w4.m9969l(C7536a.m7847b(j10, 0, 0, 0, 0, 11), i14, ((-iM5514f) - iMo7866k1) - iMo21529G);
        int size7 = list.size();
        int i19 = 0;
        while (i19 < size7) {
            int i20 = size7;
            InterfaceC21056J interfaceC21056J7 = (InterfaceC21056J) list2.get(i19);
            int i21 = i19;
            if (AbstractC16544l.m18089b(AbstractC10868a.m11315a(interfaceC21056J7), "TextField")) {
                AbstractC21069X abstractC21069XMo21533p6 = interfaceC21056J7.mo21533p(jM9969l2);
                long jM7847b2 = C7536a.m7847b(jM9969l2, 0, 0, 0, 0, 14);
                int size8 = list.size();
                int i22 = 0;
                while (true) {
                    if (i22 >= size8) {
                        obj7 = null;
                        break;
                    }
                    obj7 = list2.get(i22);
                    int i23 = size8;
                    if (AbstractC16544l.m18089b(AbstractC10868a.m11315a((InterfaceC21056J) obj7), "Hint")) {
                        break;
                    }
                    i22++;
                    list2 = list;
                    size8 = i23;
                }
                InterfaceC21056J interfaceC21056J8 = (InterfaceC21056J) obj7;
                AbstractC21069X abstractC21069XMo21533p7 = interfaceC21056J8 != null ? interfaceC21056J8.mo21533p(jM7847b2) : null;
                int iMax5 = Math.max(iMax4, Math.max(AbstractC4879i0.m5514f(abstractC21069XMo21533p6), AbstractC4879i0.m5514f(abstractC21069XMo21533p7)) + iM5514f + iMo7866k1);
                int iM5515g5 = AbstractC4879i0.m5515g(abstractC21069XMo21533p);
                int iM5515g6 = AbstractC4879i0.m5515g(abstractC21069XMo21533p2);
                int iM5515g7 = AbstractC4879i0.m5515g(abstractC21069XMo21533p3) + AbstractC4879i0.m5515g(abstractC21069XMo21533p4);
                int iMax6 = Math.max(Math.max(abstractC21069XMo21533p6.f66981Y + iM5515g7, Math.max(AbstractC4879i0.m5515g(abstractC21069XMo21533p7) + iM5515g7, AbstractC4879i0.m5515g(abstractC21069XMo21533p5))) + iM5515g5 + iM5515g6, C7536a.m7856k(j10));
                AbstractC21069X abstractC21069XMo21533p8 = interfaceC21056J6 != null ? interfaceC21056J6.mo21533p(C7536a.m7847b(AbstractC9388w4.m9970m(0, -iMax5, 1, jM7847b), 0, iMax6, 0, 0, 9)) : null;
                int iM5514f2 = AbstractC4879i0.m5514f(abstractC21069XMo21533p8);
                int iM4755c = AbstractC4094m4.m4755c(abstractC21069XMo21533p6.f66982Z, AbstractC4879i0.m5514f(abstractC21069XMo21533p5), AbstractC4879i0.m5514f(abstractC21069XMo21533p), AbstractC4879i0.m5514f(abstractC21069XMo21533p2), AbstractC4879i0.m5514f(abstractC21069XMo21533p3), AbstractC4879i0.m5514f(abstractC21069XMo21533p4), AbstractC4879i0.m5514f(abstractC21069XMo21533p7), AbstractC4879i0.m5514f(abstractC21069XMo21533p8), this.f13183b, j10, interfaceC21059M.getDensity(), this.f13184c);
                int i24 = iM4755c - iM5514f2;
                int size9 = list.size();
                int i25 = 0;
                while (i25 < size9) {
                    InterfaceC21056J interfaceC21056J9 = (InterfaceC21056J) list.get(i25);
                    int i26 = size9;
                    if (AbstractC16544l.m18089b(AbstractC10868a.m11315a(interfaceC21056J9), "Container")) {
                        return interfaceC21059M.mo19936R(iMax6, iM4755c, C17690x.f56481Y, new C4100n4(abstractC21069XMo21533p5, iMax6, iM4755c, abstractC21069XMo21533p6, abstractC21069XMo21533p7, abstractC21069XMo21533p, abstractC21069XMo21533p2, abstractC21069XMo21533p3, abstractC21069XMo21533p4, interfaceC21056J9.mo21533p(AbstractC9388w4.m9958a(iMax6 != Integer.MAX_VALUE ? iMax6 : 0, iMax6, i24 != Integer.MAX_VALUE ? i24 : 0, i24)), abstractC21069XMo21533p8, this, iMo7866k0, interfaceC21059M));
                    }
                    i25++;
                    size9 = i26;
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            list2 = list;
            i19 = i21 + 1;
            size7 = i20;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
