package com.google.android.gms.internal.play_billing;

import java.util.Arrays;
import java.util.List;
import p232J3.C4206F;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.J1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC11883J1 {

    /* JADX INFO: renamed from: a */
    public static final C11961h1 f36151a;

    static {
        C11871F1 c11871f1 = C11871F1.f36125c;
        f36151a = new C11961h1(1);
    }

    /* JADX INFO: renamed from: A */
    public static void m13274A(int i10, List list, C12021w1 c12021w1, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c12021w1.getClass();
        if (list instanceof AbstractC12017v1) {
            throw new ClassCastException();
        }
        C11933a1 c11933a1 = (C11933a1) c12021w1.f36344a;
        int i11 = 0;
        if (!z6) {
            while (i11 < list.size()) {
                c11933a1.m13399i0(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        c11933a1.m13396f0(i10, 2);
        int iM13382V = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iM13382V += C11933a1.m13382V(((Long) list.get(i12)).longValue());
        }
        c11933a1.m13398h0(iM13382V);
        while (i11 < list.size()) {
            c11933a1.m13400j0(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    /* JADX INFO: renamed from: B */
    public static void m13275B(int i10, List list, C12021w1 c12021w1, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c12021w1.getClass();
        boolean z10 = list instanceof C11973k1;
        int i11 = 0;
        C11933a1 c11933a1 = (C11933a1) c12021w1.f36344a;
        if (!z10) {
            if (!z6) {
                while (i11 < list.size()) {
                    c11933a1.m13389Y(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            c11933a1.m13396f0(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Integer) list.get(i13)).getClass();
                i12 += 4;
            }
            c11933a1.m13398h0(i12);
            while (i11 < list.size()) {
                c11933a1.m13390Z(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        C11973k1 c11973k1 = (C11973k1) list;
        if (!z6) {
            while (i11 < c11973k1.f36287o0) {
                c11933a1.m13389Y(i10, c11973k1.m13486m(i11));
                i11++;
            }
            return;
        }
        c11933a1.m13396f0(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < c11973k1.f36287o0; i15++) {
            c11973k1.m13486m(i15);
            i14 += 4;
        }
        c11933a1.m13398h0(i14);
        while (i11 < c11973k1.f36287o0) {
            c11933a1.m13390Z(c11973k1.m13486m(i11));
            i11++;
        }
    }

    /* JADX INFO: renamed from: C */
    public static void m13276C(int i10, List list, C12021w1 c12021w1, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c12021w1.getClass();
        if (list instanceof AbstractC12017v1) {
            throw new ClassCastException();
        }
        C11933a1 c11933a1 = (C11933a1) c12021w1.f36344a;
        int i11 = 0;
        if (!z6) {
            while (i11 < list.size()) {
                c11933a1.m13391a0(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        c11933a1.m13396f0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Long) list.get(i13)).getClass();
            i12 += 8;
        }
        c11933a1.m13398h0(i12);
        while (i11 < list.size()) {
            c11933a1.m13392b0(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m13277a(int i10, List list, C12021w1 c12021w1, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c12021w1.getClass();
        boolean z10 = list instanceof C11973k1;
        int i11 = 0;
        C11933a1 c11933a1 = (C11933a1) c12021w1.f36344a;
        if (!z10) {
            if (!z6) {
                while (i11 < list.size()) {
                    int iIntValue = ((Integer) list.get(i11)).intValue();
                    c11933a1.m13397g0(i10, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                    i11++;
                }
                return;
            }
            c11933a1.m13396f0(i10, 2);
            int iM13386n0 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                int iIntValue2 = ((Integer) list.get(i12)).intValue();
                iM13386n0 += C11933a1.m13386n0((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
            }
            c11933a1.m13398h0(iM13386n0);
            while (i11 < list.size()) {
                int iIntValue3 = ((Integer) list.get(i11)).intValue();
                c11933a1.m13398h0((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                i11++;
            }
            return;
        }
        C11973k1 c11973k1 = (C11973k1) list;
        if (!z6) {
            while (i11 < c11973k1.f36287o0) {
                int iM13486m = c11973k1.m13486m(i11);
                c11933a1.m13397g0(i10, (iM13486m >> 31) ^ (iM13486m + iM13486m));
                i11++;
            }
            return;
        }
        c11933a1.m13396f0(i10, 2);
        int iM13386n1 = 0;
        for (int i13 = 0; i13 < c11973k1.f36287o0; i13++) {
            int iM13486m2 = c11973k1.m13486m(i13);
            iM13386n1 += C11933a1.m13386n0((iM13486m2 >> 31) ^ (iM13486m2 + iM13486m2));
        }
        c11933a1.m13398h0(iM13386n1);
        while (i11 < c11973k1.f36287o0) {
            int iM13486m3 = c11973k1.m13486m(i11);
            c11933a1.m13398h0((iM13486m3 >> 31) ^ (iM13486m3 + iM13486m3));
            i11++;
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m13278b(int i10, List list, C12021w1 c12021w1, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c12021w1.getClass();
        if (list instanceof AbstractC12017v1) {
            throw new ClassCastException();
        }
        C11933a1 c11933a1 = (C11933a1) c12021w1.f36344a;
        int i11 = 0;
        if (!z6) {
            while (i11 < list.size()) {
                long jLongValue = ((Long) list.get(i11)).longValue();
                c11933a1.m13399i0(i10, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                i11++;
            }
            return;
        }
        c11933a1.m13396f0(i10, 2);
        int iM13382V = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            long jLongValue2 = ((Long) list.get(i12)).longValue();
            iM13382V += C11933a1.m13382V((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
        }
        c11933a1.m13398h0(iM13382V);
        while (i11 < list.size()) {
            long jLongValue3 = ((Long) list.get(i11)).longValue();
            c11933a1.m13400j0((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
            i11++;
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m13279c(int i10, List list, C12021w1 c12021w1, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c12021w1.getClass();
        boolean z10 = list instanceof C11973k1;
        int i11 = 0;
        C11933a1 c11933a1 = (C11933a1) c12021w1.f36344a;
        if (!z10) {
            if (!z6) {
                while (i11 < list.size()) {
                    c11933a1.m13397g0(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            c11933a1.m13396f0(i10, 2);
            int iM13386n0 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iM13386n0 += C11933a1.m13386n0(((Integer) list.get(i12)).intValue());
            }
            c11933a1.m13398h0(iM13386n0);
            while (i11 < list.size()) {
                c11933a1.m13398h0(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        C11973k1 c11973k1 = (C11973k1) list;
        if (!z6) {
            while (i11 < c11973k1.f36287o0) {
                c11933a1.m13397g0(i10, c11973k1.m13486m(i11));
                i11++;
            }
            return;
        }
        c11933a1.m13396f0(i10, 2);
        int iM13386n1 = 0;
        for (int i13 = 0; i13 < c11973k1.f36287o0; i13++) {
            iM13386n1 += C11933a1.m13386n0(c11973k1.m13486m(i13));
        }
        c11933a1.m13398h0(iM13386n1);
        while (i11 < c11973k1.f36287o0) {
            c11933a1.m13398h0(c11973k1.m13486m(i11));
            i11++;
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m13280d(int i10, List list, C12021w1 c12021w1, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c12021w1.getClass();
        if (list instanceof AbstractC12017v1) {
            throw new ClassCastException();
        }
        C11933a1 c11933a1 = (C11933a1) c12021w1.f36344a;
        int i11 = 0;
        if (!z6) {
            while (i11 < list.size()) {
                c11933a1.m13399i0(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        c11933a1.m13396f0(i10, 2);
        int iM13382V = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iM13382V += C11933a1.m13382V(((Long) list.get(i12)).longValue());
        }
        c11933a1.m13398h0(iM13382V);
        while (i11 < list.size()) {
            c11933a1.m13400j0(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    /* JADX INFO: renamed from: e */
    public static boolean m13281e(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public static int m13282f(List list) {
        int iM13382V;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C11973k1) {
            C11973k1 c11973k1 = (C11973k1) list;
            iM13382V = 0;
            while (i10 < size) {
                iM13382V += C11933a1.m13382V(c11973k1.m13486m(i10));
                i10++;
            }
        } else {
            iM13382V = 0;
            while (i10 < size) {
                iM13382V += C11933a1.m13382V(((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
        return iM13382V;
    }

    /* JADX INFO: renamed from: g */
    public static int m13283g(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C11933a1.m13386n0(i10 << 3) + 4) * size;
    }

    /* JADX INFO: renamed from: h */
    public static int m13284h(List list) {
        return list.size() * 4;
    }

    /* JADX INFO: renamed from: i */
    public static int m13285i(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C11933a1.m13386n0(i10 << 3) + 8) * size;
    }

    /* JADX INFO: renamed from: j */
    public static int m13286j(List list) {
        return list.size() * 8;
    }

    /* JADX INFO: renamed from: k */
    public static int m13287k(List list) {
        int iM13382V;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C11973k1) {
            C11973k1 c11973k1 = (C11973k1) list;
            iM13382V = 0;
            while (i10 < size) {
                iM13382V += C11933a1.m13382V(c11973k1.m13486m(i10));
                i10++;
            }
        } else {
            iM13382V = 0;
            while (i10 < size) {
                iM13382V += C11933a1.m13382V(((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
        return iM13382V;
    }

    /* JADX INFO: renamed from: l */
    public static int m13288l(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC12017v1) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iM13382V = 0;
        for (int i10 = 0; i10 < size; i10++) {
            iM13382V += C11933a1.m13382V(((Long) list.get(i10)).longValue());
        }
        return iM13382V;
    }

    /* JADX INFO: renamed from: m */
    public static int m13289m(int i10, Object obj, InterfaceC11880I1 interfaceC11880I1) {
        return C11933a1.m13384l0((AbstractC11908S0) obj, interfaceC11880I1) + C11933a1.m13386n0(i10 << 3);
    }

    /* JADX INFO: renamed from: n */
    public static int m13290n(List list) {
        int iM13386n0;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C11973k1) {
            C11973k1 c11973k1 = (C11973k1) list;
            iM13386n0 = 0;
            while (i10 < size) {
                int iM13486m = c11973k1.m13486m(i10);
                iM13386n0 += C11933a1.m13386n0((iM13486m >> 31) ^ (iM13486m + iM13486m));
                i10++;
            }
        } else {
            iM13386n0 = 0;
            while (i10 < size) {
                int iIntValue = ((Integer) list.get(i10)).intValue();
                iM13386n0 += C11933a1.m13386n0((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i10++;
            }
        }
        return iM13386n0;
    }

    /* JADX INFO: renamed from: o */
    public static int m13291o(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC12017v1) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iM13382V = 0;
        for (int i10 = 0; i10 < size; i10++) {
            long jLongValue = ((Long) list.get(i10)).longValue();
            iM13382V += C11933a1.m13382V((jLongValue >> 63) ^ (jLongValue + jLongValue));
        }
        return iM13382V;
    }

    /* JADX INFO: renamed from: p */
    public static int m13292p(List list) {
        int iM13386n0;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C11973k1) {
            C11973k1 c11973k1 = (C11973k1) list;
            iM13386n0 = 0;
            while (i10 < size) {
                iM13386n0 += C11933a1.m13386n0(c11973k1.m13486m(i10));
                i10++;
            }
        } else {
            iM13386n0 = 0;
            while (i10 < size) {
                iM13386n0 += C11933a1.m13386n0(((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
        return iM13386n0;
    }

    /* JADX INFO: renamed from: q */
    public static int m13293q(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC12017v1) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iM13382V = 0;
        for (int i10 = 0; i10 < size; i10++) {
            iM13382V += C11933a1.m13382V(((Long) list.get(i10)).longValue());
        }
        return iM13382V;
    }

    /* JADX INFO: renamed from: r */
    public static Object m13294r(int i10, Object obj, Object obj2, int i11) {
        AbstractC11969j1 abstractC11969j1;
        C11892M1 c11892m1;
        Object obj3 = obj2;
        if (obj2 == null && (c11892m1 = (abstractC11969j1 = (AbstractC11969j1) obj).zzc) == C11892M1.f36161f) {
            obj3 = c11892m1;
            C11892M1 c11892m1M13307b = C11892M1.m13307b();
            abstractC11969j1.zzc = c11892m1M13307b;
            obj3 = c11892m1M13307b;
        }
        obj3 = c11892m1;
        ((C11892M1) obj3).m13309c(i10 << 3, Long.valueOf(i11));
        return obj3;
    }

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
    /* JADX INFO: renamed from: s */
    public static void m13295s(Object obj, Object obj2) {
        AbstractC11969j1 abstractC11969j1 = (AbstractC11969j1) obj;
        C11892M1 c11892m1 = abstractC11969j1.zzc;
        C11892M1 c11892m2 = ((AbstractC11969j1) obj2).zzc;
        C11892M1 c11892m3 = C11892M1.f36161f;
        if (!c11892m3.equals(c11892m2)) {
            if (c11892m3.equals(c11892m1)) {
                int i10 = c11892m1.f36162a + c11892m2.f36162a;
                int[] iArrCopyOf = Arrays.copyOf(c11892m1.f36163b, i10);
                System.arraycopy(c11892m2.f36163b, 0, iArrCopyOf, c11892m1.f36162a, c11892m2.f36162a);
                Object[] objArrCopyOf = Arrays.copyOf(c11892m1.f36164c, i10);
                System.arraycopy(c11892m2.f36164c, 0, objArrCopyOf, c11892m1.f36162a, c11892m2.f36162a);
                c11892m1 = new C11892M1(i10, iArrCopyOf, objArrCopyOf, true);
            } else {
                c11892m1.getClass();
                if (!c11892m2.equals(c11892m3)) {
                    if (!c11892m1.f36166e) {
                        throw new UnsupportedOperationException();
                    }
                    int i11 = c11892m1.f36162a + c11892m2.f36162a;
                    c11892m1.m13311e(i11);
                    System.arraycopy(c11892m2.f36163b, 0, c11892m1.f36163b, c11892m1.f36162a, c11892m2.f36162a);
                    System.arraycopy(c11892m2.f36164c, 0, c11892m1.f36164c, c11892m1.f36162a, c11892m2.f36162a);
                    c11892m1.f36162a = i11;
                }
            }
        }
        abstractC11969j1.zzc = c11892m1;
    }

    /* JADX INFO: renamed from: t */
    public static void m13296t(int i10, List list, C12021w1 c12021w1, boolean z6) {
        IndexOutOfBoundsException indexOutOfBoundsException;
        IndexOutOfBoundsException indexOutOfBoundsException2;
        if (list == null || list.isEmpty()) {
            return;
        }
        c12021w1.getClass();
        if (list instanceof AbstractC11923X0) {
            throw new ClassCastException();
        }
        C11933a1 c11933a1 = (C11933a1) c12021w1.f36344a;
        int i11 = 0;
        if (!z6) {
            while (i11 < list.size()) {
                byte bBooleanValue = ((Boolean) list.get(i11)).booleanValue();
                c11933a1.m13398h0(i10 << 3);
                int i12 = c11933a1.f36237q0;
                try {
                    int i13 = i12 + 1;
                    try {
                        c11933a1.f36235o0[i12] = bBooleanValue;
                        c11933a1.f36237q0 = i13;
                        i11++;
                    } catch (IndexOutOfBoundsException e10) {
                        indexOutOfBoundsException = e10;
                        i12 = i13;
                        throw new C4206F(i12, c11933a1.f36236p0, 1, indexOutOfBoundsException);
                    }
                } catch (IndexOutOfBoundsException e11) {
                    indexOutOfBoundsException = e11;
                }
            }
            return;
        }
        c11933a1.m13396f0(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < list.size(); i15++) {
            ((Boolean) list.get(i15)).getClass();
            i14++;
        }
        c11933a1.m13398h0(i14);
        while (i11 < list.size()) {
            byte bBooleanValue2 = ((Boolean) list.get(i11)).booleanValue();
            int i16 = c11933a1.f36237q0;
            try {
                int i17 = i16 + 1;
                try {
                    c11933a1.f36235o0[i16] = bBooleanValue2;
                    c11933a1.f36237q0 = i17;
                    i11++;
                } catch (IndexOutOfBoundsException e12) {
                    indexOutOfBoundsException2 = e12;
                    i16 = i17;
                    throw new C4206F(i16, c11933a1.f36236p0, 1, indexOutOfBoundsException2);
                }
            } catch (IndexOutOfBoundsException e13) {
                indexOutOfBoundsException2 = e13;
            }
        }
    }

    /* JADX INFO: renamed from: u */
    public static void m13297u(int i10, List list, C12021w1 c12021w1, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c12021w1.getClass();
        if (list instanceof AbstractC11937b1) {
            throw new ClassCastException();
        }
        C11933a1 c11933a1 = (C11933a1) c12021w1.f36344a;
        int i11 = 0;
        if (!z6) {
            while (i11 < list.size()) {
                c11933a1.m13391a0(i10, Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
                i11++;
            }
            return;
        }
        c11933a1.m13396f0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Double) list.get(i13)).getClass();
            i12 += 8;
        }
        c11933a1.m13398h0(i12);
        while (i11 < list.size()) {
            c11933a1.m13392b0(Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
            i11++;
        }
    }

    /* JADX INFO: renamed from: v */
    public static void m13298v(int i10, List list, C12021w1 c12021w1, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c12021w1.getClass();
        boolean z10 = list instanceof C11973k1;
        int i11 = 0;
        C11933a1 c11933a1 = (C11933a1) c12021w1.f36344a;
        if (!z10) {
            if (!z6) {
                while (i11 < list.size()) {
                    c11933a1.m13393c0(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            c11933a1.m13396f0(i10, 2);
            int iM13382V = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iM13382V += C11933a1.m13382V(((Integer) list.get(i12)).intValue());
            }
            c11933a1.m13398h0(iM13382V);
            while (i11 < list.size()) {
                c11933a1.m13394d0(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        C11973k1 c11973k1 = (C11973k1) list;
        if (!z6) {
            while (i11 < c11973k1.f36287o0) {
                c11933a1.m13393c0(i10, c11973k1.m13486m(i11));
                i11++;
            }
            return;
        }
        c11933a1.m13396f0(i10, 2);
        int iM13382V2 = 0;
        for (int i13 = 0; i13 < c11973k1.f36287o0; i13++) {
            iM13382V2 += C11933a1.m13382V(c11973k1.m13486m(i13));
        }
        c11933a1.m13398h0(iM13382V2);
        while (i11 < c11973k1.f36287o0) {
            c11933a1.m13394d0(c11973k1.m13486m(i11));
            i11++;
        }
    }

    /* JADX INFO: renamed from: w */
    public static void m13299w(int i10, List list, C12021w1 c12021w1, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c12021w1.getClass();
        boolean z10 = list instanceof C11973k1;
        int i11 = 0;
        C11933a1 c11933a1 = (C11933a1) c12021w1.f36344a;
        if (!z10) {
            if (!z6) {
                while (i11 < list.size()) {
                    c11933a1.m13389Y(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            c11933a1.m13396f0(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Integer) list.get(i13)).getClass();
                i12 += 4;
            }
            c11933a1.m13398h0(i12);
            while (i11 < list.size()) {
                c11933a1.m13390Z(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        C11973k1 c11973k1 = (C11973k1) list;
        if (!z6) {
            while (i11 < c11973k1.f36287o0) {
                c11933a1.m13389Y(i10, c11973k1.m13486m(i11));
                i11++;
            }
            return;
        }
        c11933a1.m13396f0(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < c11973k1.f36287o0; i15++) {
            c11973k1.m13486m(i15);
            i14 += 4;
        }
        c11933a1.m13398h0(i14);
        while (i11 < c11973k1.f36287o0) {
            c11933a1.m13390Z(c11973k1.m13486m(i11));
            i11++;
        }
    }

    /* JADX INFO: renamed from: x */
    public static void m13300x(int i10, List list, C12021w1 c12021w1, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c12021w1.getClass();
        if (list instanceof AbstractC12017v1) {
            throw new ClassCastException();
        }
        C11933a1 c11933a1 = (C11933a1) c12021w1.f36344a;
        int i11 = 0;
        if (!z6) {
            while (i11 < list.size()) {
                c11933a1.m13391a0(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        c11933a1.m13396f0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Long) list.get(i13)).getClass();
            i12 += 8;
        }
        c11933a1.m13398h0(i12);
        while (i11 < list.size()) {
            c11933a1.m13392b0(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    /* JADX INFO: renamed from: y */
    public static void m13301y(int i10, List list, C12021w1 c12021w1, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c12021w1.getClass();
        if (list instanceof AbstractC11953f1) {
            throw new ClassCastException();
        }
        C11933a1 c11933a1 = (C11933a1) c12021w1.f36344a;
        int i11 = 0;
        if (!z6) {
            while (i11 < list.size()) {
                c11933a1.m13389Y(i10, Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
                i11++;
            }
            return;
        }
        c11933a1.m13396f0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Float) list.get(i13)).getClass();
            i12 += 4;
        }
        c11933a1.m13398h0(i12);
        while (i11 < list.size()) {
            c11933a1.m13390Z(Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
            i11++;
        }
    }

    /* JADX INFO: renamed from: z */
    public static void m13302z(int i10, List list, C12021w1 c12021w1, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c12021w1.getClass();
        boolean z10 = list instanceof C11973k1;
        int i11 = 0;
        C11933a1 c11933a1 = (C11933a1) c12021w1.f36344a;
        if (!z10) {
            if (!z6) {
                while (i11 < list.size()) {
                    c11933a1.m13393c0(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            c11933a1.m13396f0(i10, 2);
            int iM13382V = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iM13382V += C11933a1.m13382V(((Integer) list.get(i12)).intValue());
            }
            c11933a1.m13398h0(iM13382V);
            while (i11 < list.size()) {
                c11933a1.m13394d0(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        C11973k1 c11973k1 = (C11973k1) list;
        if (!z6) {
            while (i11 < c11973k1.f36287o0) {
                c11933a1.m13393c0(i10, c11973k1.m13486m(i11));
                i11++;
            }
            return;
        }
        c11933a1.m13396f0(i10, 2);
        int iM13382V2 = 0;
        for (int i13 = 0; i13 < c11973k1.f36287o0; i13++) {
            iM13382V2 += C11933a1.m13382V(c11973k1.m13486m(i13));
        }
        c11933a1.m13398h0(iM13382V2);
        while (i11 < c11973k1.f36287o0) {
            c11933a1.m13394d0(c11973k1.m13486m(i11));
            i11++;
        }
    }
}
