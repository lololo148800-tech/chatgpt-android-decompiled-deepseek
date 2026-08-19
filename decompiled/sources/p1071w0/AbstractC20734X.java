package p1071w0;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p009A7.FlM.nkFZpTrMPpn;
import p025An.C0644w;
import p045Bj.C1313k;
import p1073w3.AbstractC20800b;
import p1095x1.C21091l;
import p1095x1.C21097r;
import p1095x1.InterfaceC21056J;
import p1095x1.InterfaceC21057K;
import p1095x1.InterfaceC21061O;
import p1095x1.InterfaceC21095p;
import p1095x1.InterfaceC21102w;
import p1098x5.C21122a;
import p1098x5.C21123b;
import p1098x5.C21127f;
import p1098x5.C21129h;
import p1111xl.C21296a;
import p1117y1.C21368h;
import p1117y1.InterfaceC21365e;
import p1140z1.AbstractC21668N;
import p1140z1.AbstractC21690f;
import p1140z1.AbstractC21706n;
import p1140z1.C21658D;
import p1140z1.C21703l0;
import p1140z1.InterfaceC21718w;
import p225Im.InterfaceC3756d;
import p225Im.InterfaceC3777y;
import p392Q0.C6546d;
import p409Qk.C6752c;
import p523V9.AbstractC7870D5;
import p523V9.AbstractC8111i5;
import p571X9.AbstractC9233X;
import p571X9.AbstractC9388w4;
import p635a1.AbstractC10458p;
import p754fl.AbstractC13695e;
import p754fl.C13693c;
import p792hl.C14535j;
import p857kl.C16438E;

/* JADX INFO: renamed from: w0.X */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC20734X {
    /* JADX INFO: renamed from: A */
    public static void m21224A(int i10, String str, String str2) {
        AbstractC20800b.m21332t(str2, str + i10);
    }

    /* JADX INFO: renamed from: B */
    public static void m21225B(int i10, HashMap map, String str, int i11, String str2) {
        map.put(str, Integer.valueOf(i10));
        map.put(str2, Integer.valueOf(i11));
    }

    /* JADX INFO: renamed from: C */
    public static void m21226C(InterfaceC3756d interfaceC3756d, InterfaceC3777y interfaceC3777y, C13693c c13693c) {
        c13693c.m15167b(new C21296a(interfaceC3756d, interfaceC3777y));
    }

    /* JADX INFO: renamed from: D */
    public static void m21227D(HashMap map, String str, Integer num, int i10, String str2) {
        map.put(str, num);
        map.put(str2, Integer.valueOf(i10));
    }

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ String m21228E(int i10) {
        if (i10 != 1) {
            return i10 != 2 ? "null" : "End";
        }
        return "Start";
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ String m21229F(int i10) {
        if (i10 == 1) {
            return "Measuring";
        }
        if (i10 == 2) {
            return "LookaheadMeasuring";
        }
        if (i10 == 3) {
            return "LayingOut";
        }
        if (i10 != 4) {
            return i10 != 5 ? "null" : "Idle";
        }
        return nkFZpTrMPpn.TskALLMI;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12, types: [a1.p] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9, types: [a1.p] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [Q0.d] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [Q0.d] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r8v0, types: [y1.e, z1.m] */
    /* JADX WARN: Type inference failed for: r8v5, types: [Bm.a, kotlin.jvm.internal.n] */
    /* JADX INFO: renamed from: a */
    public static Object m21230a(InterfaceC21365e interfaceC21365e, C21368h c21368h) {
        C1313k c1313k;
        AbstractC10458p abstractC10458p = ((AbstractC10458p) interfaceC21365e).f30960Y;
        boolean z6 = abstractC10458p.f30972y0;
        if (!z6) {
            AbstractC8111i5.m8591b("ModifierLocal accessed from an unattached node");
            throw null;
        }
        if (!z6) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        AbstractC10458p abstractC10458p2 = abstractC10458p.f30964q0;
        C21658D c21658dM22217v = AbstractC21690f.m22217v(interfaceC21365e);
        while (c21658dM22217v != null) {
            if ((((AbstractC10458p) c21658dM22217v.f68638I0.f3471f).f30963p0 & 32) != 0) {
                while (abstractC10458p2 != null) {
                    if ((abstractC10458p2.f30962o0 & 32) != 0) {
                        ?? M22201f = abstractC10458p2;
                        ?? c6546d = 0;
                        while (M22201f != 0) {
                            if (M22201f instanceof InterfaceC21365e) {
                                InterfaceC21365e interfaceC21365e2 = (InterfaceC21365e) M22201f;
                                if (interfaceC21365e2.mo15081S().mo8311b(c21368h)) {
                                    return interfaceC21365e2.mo15081S().mo8312c(c21368h);
                                }
                            } else if ((M22201f.f30962o0 & 32) != 0 && (M22201f instanceof AbstractC21706n)) {
                                AbstractC10458p abstractC10458p3 = ((AbstractC21706n) M22201f).f68881A0;
                                int i10 = 0;
                                M22201f = M22201f;
                                c6546d = c6546d;
                                while (abstractC10458p3 != null) {
                                    if ((abstractC10458p3.f30962o0 & 32) != 0) {
                                        i10++;
                                        if (i10 == 1) {
                                            c6546d = c6546d;
                                            M22201f = abstractC10458p3;
                                        } else {
                                            if (c6546d == 0) {
                                                c6546d = new C6546d(new AbstractC10458p[16]);
                                            }
                                            if (M22201f != 0) {
                                                c6546d.m7099c(M22201f);
                                                M22201f = 0;
                                            }
                                            c6546d.m7099c(abstractC10458p3);
                                        }
                                    }
                                    abstractC10458p3 = abstractC10458p3.f30965r0;
                                    M22201f = M22201f;
                                    c6546d = c6546d;
                                }
                                if (i10 == 1) {
                                }
                            }
                            M22201f = AbstractC21690f.m22201f(c6546d);
                        }
                    }
                    abstractC10458p2 = abstractC10458p2.f30964q0;
                }
            }
            c21658dM22217v = c21658dM22217v.m22009G();
            abstractC10458p2 = (c21658dM22217v == null || (c1313k = c21658dM22217v.f68638I0) == null) ? null : (C21703l0) c1313k.f3470e;
        }
        return c21368h.f67842a.invoke();
    }

    /* JADX INFO: renamed from: b */
    public static int m21231b(InterfaceC21102w interfaceC21102w, AbstractC21668N abstractC21668N, InterfaceC21056J interfaceC21056J, int i10) {
        int i11 = 2;
        return interfaceC21102w.mo2447f(new C21097r(abstractC21668N, abstractC21668N.getLayoutDirection()), new C21091l(interfaceC21056J, i11, i11, 1), AbstractC9388w4.m9959b(i10, 0, 13)).getHeight();
    }

    /* JADX INFO: renamed from: c */
    public static int m21232c(InterfaceC21057K interfaceC21057K, InterfaceC21095p interfaceC21095p, List list, int i10) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            int i12 = 2;
            arrayList.add(new C21091l((InterfaceC21056J) list.get(i11), i12, i12, 0));
        }
        return interfaceC21057K.mo1121c(new C21097r(interfaceC21095p, interfaceC21095p.getLayoutDirection()), arrayList, AbstractC9388w4.m9959b(i10, 0, 13)).getHeight();
    }

    /* JADX INFO: renamed from: d */
    public static int m21233d(InterfaceC21061O interfaceC21061O, InterfaceC21095p interfaceC21095p, ArrayList arrayList, int i10) {
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            List list = (List) arrayList.get(i11);
            ArrayList arrayList3 = new ArrayList(list.size());
            int size2 = list.size();
            for (int i12 = 0; i12 < size2; i12++) {
                int i13 = 2;
                arrayList3.add(new C21091l((InterfaceC21056J) list.get(i12), i13, i13, 0));
            }
            arrayList2.add(arrayList3);
        }
        return interfaceC21061O.mo4652c(new C21097r(interfaceC21095p, interfaceC21095p.getLayoutDirection()), arrayList2, AbstractC9388w4.m9959b(i10, 0, 13)).getHeight();
    }

    /* JADX INFO: renamed from: e */
    public static int m21234e(InterfaceC21718w interfaceC21718w, InterfaceC21095p interfaceC21095p, InterfaceC21056J interfaceC21056J, int i10) {
        int i11 = 2;
        return interfaceC21718w.mo2145f(new C21097r(interfaceC21095p, interfaceC21095p.getLayoutDirection()), new C21091l(interfaceC21056J, i11, i11, 2), AbstractC9388w4.m9959b(i10, 0, 13)).getHeight();
    }

    /* JADX INFO: renamed from: f */
    public static int m21235f(InterfaceC21102w interfaceC21102w, AbstractC21668N abstractC21668N, InterfaceC21056J interfaceC21056J, int i10) {
        return interfaceC21102w.mo2447f(new C21097r(abstractC21668N, abstractC21668N.getLayoutDirection()), new C21091l(interfaceC21056J, 2, 1, 1), AbstractC9388w4.m9959b(0, i10, 7)).getWidth();
    }

    /* JADX INFO: renamed from: g */
    public static int m21236g(InterfaceC21057K interfaceC21057K, InterfaceC21095p interfaceC21095p, List list, int i10) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(new C21091l((InterfaceC21056J) list.get(i11), 2, 1, 0));
        }
        return interfaceC21057K.mo1121c(new C21097r(interfaceC21095p, interfaceC21095p.getLayoutDirection()), arrayList, AbstractC9388w4.m9959b(0, i10, 7)).getWidth();
    }

    /* JADX INFO: renamed from: h */
    public static int m21237h(InterfaceC21061O interfaceC21061O, InterfaceC21095p interfaceC21095p, ArrayList arrayList, int i10) {
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            List list = (List) arrayList.get(i11);
            ArrayList arrayList3 = new ArrayList(list.size());
            int size2 = list.size();
            for (int i12 = 0; i12 < size2; i12++) {
                arrayList3.add(new C21091l((InterfaceC21056J) list.get(i12), 2, 1, 0));
            }
            arrayList2.add(arrayList3);
        }
        return interfaceC21061O.mo4652c(new C21097r(interfaceC21095p, interfaceC21095p.getLayoutDirection()), arrayList2, AbstractC9388w4.m9959b(0, i10, 7)).getWidth();
    }

    /* JADX INFO: renamed from: i */
    public static int m21238i(InterfaceC21718w interfaceC21718w, InterfaceC21095p interfaceC21095p, InterfaceC21056J interfaceC21056J, int i10) {
        return interfaceC21718w.mo2145f(new C21097r(interfaceC21095p, interfaceC21095p.getLayoutDirection()), new C21091l(interfaceC21056J, 2, 1, 2), AbstractC9388w4.m9959b(0, i10, 7)).getWidth();
    }

    /* JADX INFO: renamed from: j */
    public static int m21239j(InterfaceC21102w interfaceC21102w, AbstractC21668N abstractC21668N, InterfaceC21056J interfaceC21056J, int i10) {
        return interfaceC21102w.mo2447f(new C21097r(abstractC21668N, abstractC21668N.getLayoutDirection()), new C21091l(interfaceC21056J, 1, 2, 1), AbstractC9388w4.m9959b(i10, 0, 13)).getHeight();
    }

    /* JADX INFO: renamed from: k */
    public static int m21240k(InterfaceC21057K interfaceC21057K, InterfaceC21095p interfaceC21095p, List list, int i10) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(new C21091l((InterfaceC21056J) list.get(i11), 1, 2, 0));
        }
        return interfaceC21057K.mo1121c(new C21097r(interfaceC21095p, interfaceC21095p.getLayoutDirection()), arrayList, AbstractC9388w4.m9959b(i10, 0, 13)).getHeight();
    }

    /* JADX INFO: renamed from: l */
    public static int m21241l(InterfaceC21061O interfaceC21061O, InterfaceC21095p interfaceC21095p, ArrayList arrayList, int i10) {
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            List list = (List) arrayList.get(i11);
            ArrayList arrayList3 = new ArrayList(list.size());
            int size2 = list.size();
            for (int i12 = 0; i12 < size2; i12++) {
                arrayList3.add(new C21091l((InterfaceC21056J) list.get(i12), 1, 2, 0));
            }
            arrayList2.add(arrayList3);
        }
        return interfaceC21061O.mo4652c(new C21097r(interfaceC21095p, interfaceC21095p.getLayoutDirection()), arrayList2, AbstractC9388w4.m9959b(i10, 0, 13)).getHeight();
    }

    /* JADX INFO: renamed from: m */
    public static int m21242m(InterfaceC21718w interfaceC21718w, InterfaceC21095p interfaceC21095p, InterfaceC21056J interfaceC21056J, int i10) {
        return interfaceC21718w.mo2145f(new C21097r(interfaceC21095p, interfaceC21095p.getLayoutDirection()), new C21091l(interfaceC21056J, 1, 2, 2), AbstractC9388w4.m9959b(i10, 0, 13)).getHeight();
    }

    /* JADX INFO: renamed from: n */
    public static int m21243n(InterfaceC21102w interfaceC21102w, AbstractC21668N abstractC21668N, InterfaceC21056J interfaceC21056J, int i10) {
        int i11 = 1;
        return interfaceC21102w.mo2447f(new C21097r(abstractC21668N, abstractC21668N.getLayoutDirection()), new C21091l(interfaceC21056J, i11, i11, 1), AbstractC9388w4.m9959b(0, i10, 7)).getWidth();
    }

    /* JADX INFO: renamed from: o */
    public static int m21244o(InterfaceC21057K interfaceC21057K, InterfaceC21095p interfaceC21095p, List list, int i10) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            int i12 = 1;
            arrayList.add(new C21091l((InterfaceC21056J) list.get(i11), i12, i12, 0));
        }
        return interfaceC21057K.mo1121c(new C21097r(interfaceC21095p, interfaceC21095p.getLayoutDirection()), arrayList, AbstractC9388w4.m9959b(0, i10, 7)).getWidth();
    }

    /* JADX INFO: renamed from: p */
    public static int m21245p(InterfaceC21061O interfaceC21061O, InterfaceC21095p interfaceC21095p, ArrayList arrayList, int i10) {
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            List list = (List) arrayList.get(i11);
            ArrayList arrayList3 = new ArrayList(list.size());
            int size2 = list.size();
            for (int i12 = 0; i12 < size2; i12++) {
                int i13 = 1;
                arrayList3.add(new C21091l((InterfaceC21056J) list.get(i12), i13, i13, 0));
            }
            arrayList2.add(arrayList3);
        }
        return interfaceC21061O.mo4652c(new C21097r(interfaceC21095p, interfaceC21095p.getLayoutDirection()), arrayList2, AbstractC9388w4.m9959b(0, i10, 7)).getWidth();
    }

    /* JADX INFO: renamed from: q */
    public static int m21246q(InterfaceC21718w interfaceC21718w, InterfaceC21095p interfaceC21095p, InterfaceC21056J interfaceC21056J, int i10) {
        int i11 = 1;
        return interfaceC21718w.mo2145f(new C21097r(interfaceC21095p, interfaceC21095p.getLayoutDirection()), new C21091l(interfaceC21056J, i11, i11, 2), AbstractC9388w4.m9959b(0, i10, 7)).getWidth();
    }

    /* JADX INFO: renamed from: r */
    public static AbstractC7870D5 m21247r(int i10, int i11, int i12) {
        if (i10 == -2) {
            return C21123b.f67119b;
        }
        int i13 = i10 - i12;
        if (i13 > 0) {
            return new C21122a(i13);
        }
        int i14 = i11 - i12;
        if (i14 > 0) {
            return new C21122a(i14);
        }
        return null;
    }

    /* JADX INFO: renamed from: s */
    public static C21129h m21248s(C21127f c21127f) {
        int paddingRight;
        ViewGroup.LayoutParams layoutParams = c21127f.f67126Y.getLayoutParams();
        int i10 = layoutParams != null ? layoutParams.width : -1;
        ImageView imageView = c21127f.f67126Y;
        int width = imageView.getWidth();
        boolean z6 = c21127f.f67127Z;
        if (z6) {
            paddingRight = imageView.getPaddingRight() + imageView.getPaddingLeft();
        } else {
            paddingRight = 0;
        }
        AbstractC7870D5 abstractC7870D5M21247r = m21247r(i10, width, paddingRight);
        if (abstractC7870D5M21247r == null) {
            return null;
        }
        ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
        AbstractC7870D5 abstractC7870D5M21247r2 = m21247r(layoutParams2 != null ? layoutParams2.height : -1, imageView.getHeight(), z6 ? imageView.getPaddingBottom() + imageView.getPaddingTop() : 0);
        if (abstractC7870D5M21247r2 == null) {
            return null;
        }
        return new C21129h(abstractC7870D5M21247r, abstractC7870D5M21247r2);
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ boolean m21249t(int i10) {
        switch (i10) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                return false;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
                return true;
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
                return false;
            case 44:
            case 45:
            case 46:
            case 47:
            case LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER /* 48 */:
                return true;
            default:
                throw null;
        }
    }

    /* JADX INFO: renamed from: u */
    public static int m21250u(int i10, int i11, Map map) {
        return (map.hashCode() + i10) * i11;
    }

    /* JADX INFO: renamed from: v */
    public static int m21251v(Parcelable.Creator creator, Parcel parcel, ArrayList arrayList, int i10, int i11) {
        arrayList.add(creator.createFromParcel(parcel));
        return i10 + i11;
    }

    /* JADX INFO: renamed from: w */
    public static C0644w m21252w(Object obj) {
        AbstractC9233X.m9807c(obj);
        return new C0644w();
    }

    /* JADX INFO: renamed from: x */
    public static C13693c m21253x(String str) {
        C13693c c13693c = new C13693c();
        AbstractC13695e.m15172b(c13693c, str);
        return c13693c;
    }

    /* JADX INFO: renamed from: y */
    public static C14535j m21254y(C13693c c13693c, C16438E c16438e, C13693c c13693c2, C6752c c6752c) {
        c13693c.m15168c(c16438e);
        return new C14535j(c13693c2, c6752c);
    }

    /* JADX INFO: renamed from: z */
    public static String m21255z(int i10, String str, String str2) {
        StringBuilder sb2 = new StringBuilder(i10);
        sb2.append(str);
        String string = sb2.toString();
        AbstractC16544l.m18093f(string, str2);
        return string;
    }
}
