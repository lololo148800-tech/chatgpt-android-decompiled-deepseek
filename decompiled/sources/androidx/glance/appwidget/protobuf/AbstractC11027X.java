package androidx.glance.appwidget.protobuf;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

/* JADX INFO: renamed from: androidx.glance.appwidget.protobuf.X */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC11027X {

    /* JADX INFO: renamed from: a */
    public static final Class f33276a;

    /* JADX INFO: renamed from: b */
    public static final C11031a0 f33277b;

    /* JADX INFO: renamed from: c */
    public static final C11031a0 f33278c;

    static {
        Class<?> cls;
        Class<?> cls2;
        C11023T c11023t = C11023T.f33266c;
        C11031a0 c11031a0 = null;
        try {
            cls = Class.forName("androidx.glance.appwidget.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f33276a = cls;
        try {
            C11023T c11023t2 = C11023T.f33266c;
            try {
                cls2 = Class.forName("androidx.glance.appwidget.protobuf.UnknownFieldSetSchema");
            } catch (Throwable unused2) {
                cls2 = null;
            }
            if (cls2 != null) {
                c11031a0 = (C11031a0) cls2.getConstructor(null).newInstance(null);
            }
        } catch (Throwable unused3) {
        }
        f33277b = c11031a0;
        f33278c = new C11031a0();
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
    /* JADX INFO: renamed from: A */
    public static void m11926A(C11031a0 c11031a0, Object obj, Object obj2) {
        c11031a0.getClass();
        AbstractC11059u abstractC11059u = (AbstractC11059u) obj;
        C11029Z c11029z = abstractC11059u.unknownFields;
        C11029Z c11029z2 = ((AbstractC11059u) obj2).unknownFields;
        C11029Z c11029z3 = C11029Z.f33279f;
        if (!c11029z3.equals(c11029z2)) {
            if (c11029z3.equals(c11029z)) {
                int i10 = c11029z.f33280a + c11029z2.f33280a;
                int[] iArrCopyOf = Arrays.copyOf(c11029z.f33281b, i10);
                System.arraycopy(c11029z2.f33281b, 0, iArrCopyOf, c11029z.f33280a, c11029z2.f33280a);
                Object[] objArrCopyOf = Arrays.copyOf(c11029z.f33282c, i10);
                System.arraycopy(c11029z2.f33282c, 0, objArrCopyOf, c11029z.f33280a, c11029z2.f33280a);
                c11029z = new C11029Z(i10, iArrCopyOf, objArrCopyOf, true);
            } else {
                c11029z.getClass();
                if (!c11029z2.equals(c11029z3)) {
                    if (!c11029z.f33284e) {
                        throw new UnsupportedOperationException();
                    }
                    int i11 = c11029z.f33280a + c11029z2.f33280a;
                    c11029z.m11972a(i11);
                    System.arraycopy(c11029z2.f33281b, 0, c11029z.f33281b, c11029z.f33280a, c11029z2.f33280a);
                    System.arraycopy(c11029z2.f33282c, 0, c11029z.f33282c, c11029z.f33280a, c11029z2.f33280a);
                    c11029z.f33280a = i11;
                }
            }
        }
        abstractC11059u.unknownFields = c11029z;
    }

    /* JADX INFO: renamed from: B */
    public static boolean m11927B(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* JADX INFO: renamed from: C */
    public static void m11928C(int i10, List list, C11012H c11012h, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c11012h.getClass();
        if (list instanceof AbstractC11036d) {
            throw new ClassCastException();
        }
        C11048j c11048j = (C11048j) c11012h.f33240a;
        int i11 = 0;
        if (!z6) {
            while (i11 < list.size()) {
                c11048j.m12070I(i10, ((Boolean) list.get(i11)).booleanValue());
                i11++;
            }
            return;
        }
        c11048j.m12079R(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Boolean) list.get(i13)).getClass();
            Logger logger = C11048j.f33321f;
            i12++;
        }
        c11048j.m12081T(i12);
        while (i11 < list.size()) {
            byte b = ((Boolean) list.get(i11)).booleanValue() ? (byte) 1 : (byte) 0;
            if (c11048j.f33326d == c11048j.f33325c) {
                c11048j.m12067F();
            }
            int i14 = c11048j.f33326d;
            c11048j.f33326d = i14 + 1;
            c11048j.f33324b[i14] = b;
            i11++;
        }
    }

    /* JADX INFO: renamed from: D */
    public static void m11929D(int i10, List list, C11012H c11012h) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c11012h.getClass();
        for (int i11 = 0; i11 < list.size(); i11++) {
            ((C11048j) c11012h.f33240a).m12071J(i10, (C11042g) list.get(i11));
        }
    }

    /* JADX INFO: renamed from: E */
    public static void m11930E(int i10, List list, C11012H c11012h, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c11012h.getClass();
        if (list instanceof AbstractC11049k) {
            throw new ClassCastException();
        }
        C11048j c11048j = (C11048j) c11012h.f33240a;
        int i11 = 0;
        if (!z6) {
            while (i11 < list.size()) {
                double dDoubleValue = ((Double) list.get(i11)).doubleValue();
                c11048j.getClass();
                c11048j.m12074M(i10, Double.doubleToRawLongBits(dDoubleValue));
                i11++;
            }
            return;
        }
        c11048j.m12079R(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Double) list.get(i13)).getClass();
            Logger logger = C11048j.f33321f;
            i12 += 8;
        }
        c11048j.m12081T(i12);
        while (i11 < list.size()) {
            c11048j.m12075N(Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
            i11++;
        }
    }

    /* JADX INFO: renamed from: F */
    public static void m11931F(int i10, List list, C11012H c11012h, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c11012h.getClass();
        if (list instanceof AbstractC11060v) {
            throw new ClassCastException();
        }
        C11048j c11048j = (C11048j) c11012h.f33240a;
        int i11 = 0;
        if (!z6) {
            while (i11 < list.size()) {
                c11048j.m12076O(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        c11048j.m12079R(i10, 2);
        int iM12049E = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iM12049E += C11048j.m12049E(((Integer) list.get(i12)).intValue());
        }
        c11048j.m12081T(iM12049E);
        while (i11 < list.size()) {
            c11048j.m12077P(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    /* JADX INFO: renamed from: G */
    public static void m11932G(int i10, List list, C11012H c11012h, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c11012h.getClass();
        if (list instanceof AbstractC11060v) {
            throw new ClassCastException();
        }
        C11048j c11048j = (C11048j) c11012h.f33240a;
        int i11 = 0;
        if (!z6) {
            while (i11 < list.size()) {
                c11048j.m12072K(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        c11048j.m12079R(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Integer) list.get(i13)).getClass();
            Logger logger = C11048j.f33321f;
            i12 += 4;
        }
        c11048j.m12081T(i12);
        while (i11 < list.size()) {
            c11048j.m12073L(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    /* JADX INFO: renamed from: H */
    public static void m11933H(int i10, List list, C11012H c11012h, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c11012h.getClass();
        if (list instanceof AbstractC11010F) {
            throw new ClassCastException();
        }
        C11048j c11048j = (C11048j) c11012h.f33240a;
        int i11 = 0;
        if (!z6) {
            while (i11 < list.size()) {
                c11048j.m12074M(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        c11048j.m12079R(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Long) list.get(i13)).getClass();
            Logger logger = C11048j.f33321f;
            i12 += 8;
        }
        c11048j.m12081T(i12);
        while (i11 < list.size()) {
            c11048j.m12075N(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    /* JADX INFO: renamed from: I */
    public static void m11934I(int i10, List list, C11012H c11012h, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c11012h.getClass();
        if (list instanceof AbstractC11055q) {
            throw new ClassCastException();
        }
        C11048j c11048j = (C11048j) c11012h.f33240a;
        int i11 = 0;
        if (!z6) {
            while (i11 < list.size()) {
                float fFloatValue = ((Float) list.get(i11)).floatValue();
                c11048j.getClass();
                c11048j.m12072K(i10, Float.floatToRawIntBits(fFloatValue));
                i11++;
            }
            return;
        }
        c11048j.m12079R(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Float) list.get(i13)).getClass();
            Logger logger = C11048j.f33321f;
            i12 += 4;
        }
        c11048j.m12081T(i12);
        while (i11 < list.size()) {
            c11048j.m12073L(Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
            i11++;
        }
    }

    /* JADX INFO: renamed from: J */
    public static void m11935J(int i10, List list, C11012H c11012h, InterfaceC11026W interfaceC11026W) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c11012h.getClass();
        for (int i11 = 0; i11 < list.size(); i11++) {
            c11012h.m11860h(i10, list.get(i11), interfaceC11026W);
        }
    }

    /* JADX INFO: renamed from: K */
    public static void m11936K(int i10, List list, C11012H c11012h, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c11012h.getClass();
        if (list instanceof AbstractC11060v) {
            throw new ClassCastException();
        }
        C11048j c11048j = (C11048j) c11012h.f33240a;
        int i11 = 0;
        if (!z6) {
            while (i11 < list.size()) {
                c11048j.m12076O(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        c11048j.m12079R(i10, 2);
        int iM12049E = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iM12049E += C11048j.m12049E(((Integer) list.get(i12)).intValue());
        }
        c11048j.m12081T(iM12049E);
        while (i11 < list.size()) {
            c11048j.m12077P(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    /* JADX INFO: renamed from: L */
    public static void m11937L(int i10, List list, C11012H c11012h, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c11012h.getClass();
        if (list instanceof AbstractC11010F) {
            throw new ClassCastException();
        }
        C11048j c11048j = (C11048j) c11012h.f33240a;
        int i11 = 0;
        if (!z6) {
            while (i11 < list.size()) {
                c11048j.m12082U(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        c11048j.m12079R(i10, 2);
        int iM12049E = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iM12049E += C11048j.m12049E(((Long) list.get(i12)).longValue());
        }
        c11048j.m12081T(iM12049E);
        while (i11 < list.size()) {
            c11048j.m12083V(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    /* JADX INFO: renamed from: M */
    public static void m11938M(int i10, List list, C11012H c11012h, InterfaceC11026W interfaceC11026W) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c11012h.getClass();
        for (int i11 = 0; i11 < list.size(); i11++) {
            c11012h.m11863k(i10, list.get(i11), interfaceC11026W);
        }
    }

    /* JADX INFO: renamed from: N */
    public static void m11939N(int i10, List list, C11012H c11012h, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c11012h.getClass();
        if (list instanceof AbstractC11060v) {
            throw new ClassCastException();
        }
        C11048j c11048j = (C11048j) c11012h.f33240a;
        int i11 = 0;
        if (!z6) {
            while (i11 < list.size()) {
                c11048j.m12072K(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        c11048j.m12079R(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Integer) list.get(i13)).getClass();
            Logger logger = C11048j.f33321f;
            i12 += 4;
        }
        c11048j.m12081T(i12);
        while (i11 < list.size()) {
            c11048j.m12073L(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    /* JADX INFO: renamed from: O */
    public static void m11940O(int i10, List list, C11012H c11012h, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c11012h.getClass();
        if (list instanceof AbstractC11010F) {
            throw new ClassCastException();
        }
        C11048j c11048j = (C11048j) c11012h.f33240a;
        int i11 = 0;
        if (!z6) {
            while (i11 < list.size()) {
                c11048j.m12074M(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        c11048j.m12079R(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Long) list.get(i13)).getClass();
            Logger logger = C11048j.f33321f;
            i12 += 8;
        }
        c11048j.m12081T(i12);
        while (i11 < list.size()) {
            c11048j.m12075N(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    /* JADX INFO: renamed from: P */
    public static void m11941P(int i10, List list, C11012H c11012h, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c11012h.getClass();
        if (list instanceof AbstractC11060v) {
            throw new ClassCastException();
        }
        C11048j c11048j = (C11048j) c11012h.f33240a;
        int i11 = 0;
        if (!z6) {
            while (i11 < list.size()) {
                int iIntValue = ((Integer) list.get(i11)).intValue();
                c11048j.m12080S(i10, (iIntValue >> 31) ^ (iIntValue << 1));
                i11++;
            }
            return;
        }
        c11048j.m12079R(i10, 2);
        int iM12047C = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            int iIntValue2 = ((Integer) list.get(i12)).intValue();
            iM12047C += C11048j.m12047C((iIntValue2 >> 31) ^ (iIntValue2 << 1));
        }
        c11048j.m12081T(iM12047C);
        while (i11 < list.size()) {
            int iIntValue3 = ((Integer) list.get(i11)).intValue();
            c11048j.m12081T((iIntValue3 >> 31) ^ (iIntValue3 << 1));
            i11++;
        }
    }

    /* JADX INFO: renamed from: Q */
    public static void m11942Q(int i10, List list, C11012H c11012h, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c11012h.getClass();
        if (list instanceof AbstractC11010F) {
            throw new ClassCastException();
        }
        C11048j c11048j = (C11048j) c11012h.f33240a;
        int i11 = 0;
        if (!z6) {
            while (i11 < list.size()) {
                long jLongValue = ((Long) list.get(i11)).longValue();
                c11048j.m12082U(i10, (jLongValue >> 63) ^ (jLongValue << 1));
                i11++;
            }
            return;
        }
        c11048j.m12079R(i10, 2);
        int iM12049E = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            long jLongValue2 = ((Long) list.get(i12)).longValue();
            iM12049E += C11048j.m12049E((jLongValue2 >> 63) ^ (jLongValue2 << 1));
        }
        c11048j.m12081T(iM12049E);
        while (i11 < list.size()) {
            long jLongValue3 = ((Long) list.get(i11)).longValue();
            c11048j.m12083V((jLongValue3 >> 63) ^ (jLongValue3 << 1));
            i11++;
        }
    }

    /* JADX INFO: renamed from: R */
    public static void m11943R(int i10, List list, C11012H c11012h) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c11012h.getClass();
        boolean z6 = list instanceof InterfaceC11007C;
        C11048j c11048j = (C11048j) c11012h.f33240a;
        int i11 = 0;
        if (!z6) {
            while (i11 < list.size()) {
                c11048j.m12078Q(i10, (String) list.get(i11));
                i11++;
            }
            return;
        }
        InterfaceC11007C interfaceC11007C = (InterfaceC11007C) list;
        while (i11 < list.size()) {
            Object objM11848g = interfaceC11007C.m11848g();
            if (objM11848g instanceof String) {
                c11048j.m12078Q(i10, (String) objM11848g);
            } else {
                c11048j.m12071J(i10, (C11042g) objM11848g);
            }
            i11++;
        }
    }

    /* JADX INFO: renamed from: S */
    public static void m11944S(int i10, List list, C11012H c11012h, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c11012h.getClass();
        if (list instanceof AbstractC11060v) {
            throw new ClassCastException();
        }
        C11048j c11048j = (C11048j) c11012h.f33240a;
        int i11 = 0;
        if (!z6) {
            while (i11 < list.size()) {
                c11048j.m12080S(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        c11048j.m12079R(i10, 2);
        int iM12047C = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iM12047C += C11048j.m12047C(((Integer) list.get(i12)).intValue());
        }
        c11048j.m12081T(iM12047C);
        while (i11 < list.size()) {
            c11048j.m12081T(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    /* JADX INFO: renamed from: T */
    public static void m11945T(int i10, List list, C11012H c11012h, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c11012h.getClass();
        if (list instanceof AbstractC11010F) {
            throw new ClassCastException();
        }
        C11048j c11048j = (C11048j) c11012h.f33240a;
        int i11 = 0;
        if (!z6) {
            while (i11 < list.size()) {
                c11048j.m12082U(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        c11048j.m12079R(i10, 2);
        int iM12049E = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iM12049E += C11048j.m12049E(((Long) list.get(i12)).longValue());
        }
        c11048j.m12081T(iM12049E);
        while (i11 < list.size()) {
            c11048j.m12083V(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m11946a(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return C11048j.m12050j(i10) * size;
    }

    /* JADX INFO: renamed from: b */
    public static int m11947b(List list) {
        return list.size();
    }

    /* JADX INFO: renamed from: c */
    public static int m11948c(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM12045A = C11048j.m12045A(i10) * size;
        for (int i11 = 0; i11 < list.size(); i11++) {
            iM12045A += C11048j.m12052l((C11042g) list.get(i11));
        }
        return iM12045A;
    }

    /* JADX INFO: renamed from: d */
    public static int m11949d(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C11048j.m12045A(i10) * size) + m11950e(list);
    }

    /* JADX INFO: renamed from: e */
    public static int m11950e(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC11060v) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iM12049E = 0;
        for (int i10 = 0; i10 < size; i10++) {
            iM12049E += C11048j.m12049E(((Integer) list.get(i10)).intValue());
        }
        return iM12049E;
    }

    /* JADX INFO: renamed from: f */
    public static int m11951f(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return C11048j.m12055o(i10) * size;
    }

    /* JADX INFO: renamed from: g */
    public static int m11952g(List list) {
        return list.size() * 4;
    }

    /* JADX INFO: renamed from: h */
    public static int m11953h(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return C11048j.m12056p(i10) * size;
    }

    /* JADX INFO: renamed from: i */
    public static int m11954i(List list) {
        return list.size() * 8;
    }

    /* JADX INFO: renamed from: j */
    public static int m11955j(int i10, List list, InterfaceC11026W interfaceC11026W) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM12058r = 0;
        for (int i11 = 0; i11 < size; i11++) {
            iM12058r += C11048j.m12058r(i10, (AbstractC11030a) list.get(i11), interfaceC11026W);
        }
        return iM12058r;
    }

    /* JADX INFO: renamed from: k */
    public static int m11956k(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C11048j.m12045A(i10) * size) + m11957l(list);
    }

    /* JADX INFO: renamed from: l */
    public static int m11957l(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC11060v) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iM12049E = 0;
        for (int i10 = 0; i10 < size; i10++) {
            iM12049E += C11048j.m12049E(((Integer) list.get(i10)).intValue());
        }
        return iM12049E;
    }

    /* JADX INFO: renamed from: m */
    public static int m11958m(int i10, List list) {
        if (list.size() == 0) {
            return 0;
        }
        return (C11048j.m12045A(i10) * list.size()) + m11959n(list);
    }

    /* JADX INFO: renamed from: n */
    public static int m11959n(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC11010F) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iM12049E = 0;
        for (int i10 = 0; i10 < size; i10++) {
            iM12049E += C11048j.m12049E(((Long) list.get(i10)).longValue());
        }
        return iM12049E;
    }

    /* JADX INFO: renamed from: o */
    public static int m11960o(int i10, Object obj, InterfaceC11026W interfaceC11026W) {
        int iM12045A = C11048j.m12045A(i10);
        int iMo11976a = ((AbstractC11030a) obj).mo11976a(interfaceC11026W);
        return C11048j.m12047C(iMo11976a) + iMo11976a + iM12045A;
    }

    /* JADX INFO: renamed from: p */
    public static int m11961p(int i10, List list, InterfaceC11026W interfaceC11026W) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM12045A = C11048j.m12045A(i10) * size;
        for (int i11 = 0; i11 < size; i11++) {
            int iMo11976a = ((AbstractC11030a) list.get(i11)).mo11976a(interfaceC11026W);
            iM12045A += C11048j.m12047C(iMo11976a) + iMo11976a;
        }
        return iM12045A;
    }

    /* JADX INFO: renamed from: q */
    public static int m11962q(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C11048j.m12045A(i10) * size) + m11963r(list);
    }

    /* JADX INFO: renamed from: r */
    public static int m11963r(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC11060v) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iM12047C = 0;
        for (int i10 = 0; i10 < size; i10++) {
            int iIntValue = ((Integer) list.get(i10)).intValue();
            iM12047C += C11048j.m12047C((iIntValue >> 31) ^ (iIntValue << 1));
        }
        return iM12047C;
    }

    /* JADX INFO: renamed from: s */
    public static int m11964s(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C11048j.m12045A(i10) * size) + m11965t(list);
    }

    /* JADX INFO: renamed from: t */
    public static int m11965t(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC11010F) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iM12049E = 0;
        for (int i10 = 0; i10 < size; i10++) {
            long jLongValue = ((Long) list.get(i10)).longValue();
            iM12049E += C11048j.m12049E((jLongValue >> 63) ^ (jLongValue << 1));
        }
        return iM12049E;
    }

    /* JADX INFO: renamed from: u */
    public static int m11966u(int i10, List list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        int iM12045A = C11048j.m12045A(i10) * size;
        if (list instanceof InterfaceC11007C) {
            InterfaceC11007C interfaceC11007C = (InterfaceC11007C) list;
            while (i11 < size) {
                Object objM11848g = interfaceC11007C.m11848g();
                iM12045A = (objM11848g instanceof C11042g ? C11048j.m12052l((C11042g) objM11848g) : C11048j.m12066z((String) objM11848g)) + iM12045A;
                i11++;
            }
        } else {
            while (i11 < size) {
                Object obj = list.get(i11);
                iM12045A = (obj instanceof C11042g ? C11048j.m12052l((C11042g) obj) : C11048j.m12066z((String) obj)) + iM12045A;
                i11++;
            }
        }
        return iM12045A;
    }

    /* JADX INFO: renamed from: v */
    public static int m11967v(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C11048j.m12045A(i10) * size) + m11968w(list);
    }

    /* JADX INFO: renamed from: w */
    public static int m11968w(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC11060v) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iM12047C = 0;
        for (int i10 = 0; i10 < size; i10++) {
            iM12047C += C11048j.m12047C(((Integer) list.get(i10)).intValue());
        }
        return iM12047C;
    }

    /* JADX INFO: renamed from: x */
    public static int m11969x(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C11048j.m12045A(i10) * size) + m11970y(list);
    }

    /* JADX INFO: renamed from: y */
    public static int m11970y(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC11010F) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iM12049E = 0;
        for (int i10 = 0; i10 < size; i10++) {
            iM12049E += C11048j.m12049E(((Long) list.get(i10)).longValue());
        }
        return iM12049E;
    }

    /* JADX INFO: renamed from: z */
    public static Object m11971z(Object obj, int i10, InterfaceC11062x interfaceC11062x, Object obj2, C11031a0 c11031a0) {
        return obj2;
    }
}
