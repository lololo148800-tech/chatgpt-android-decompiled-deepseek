package com.google.protobuf;

import java.util.AbstractList;
import java.util.List;
import java.util.logging.Logger;

/* JADX INFO: renamed from: com.google.protobuf.a1 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC12137a1 {

    /* JADX INFO: renamed from: a */
    public static final Class f37010a;

    /* JADX INFO: renamed from: b */
    public static final C12185q1 f37011b;

    /* JADX INFO: renamed from: c */
    public static final C12185q1 f37012c;

    /* JADX INFO: renamed from: d */
    public static final C12185q1 f37013d;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            cls = null;
        }
        f37010a = cls;
        f37011b = m13881B(false);
        f37012c = m13881B(true);
        f37013d = new C12185q1();
    }

    /* JADX INFO: renamed from: B */
    public static C12185q1 m13881B(boolean z6) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            return (C12185q1) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z6));
        } catch (Throwable unused2) {
            return null;
        }
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
    /* JADX INFO: renamed from: C */
    public static void m13882C(C12185q1 c12185q1, Object obj, Object obj2) {
        c12185q1.getClass();
        AbstractC12133Z abstractC12133Z = (AbstractC12133Z) obj;
        C12182p1 c12182p1M14067e = abstractC12133Z.unknownFields;
        C12182p1 c12182p1 = ((AbstractC12133Z) obj2).unknownFields;
        C12182p1 c12182p2 = C12182p1.f37068f;
        if (!c12182p2.equals(c12182p1)) {
            if (c12182p2.equals(c12182p1M14067e)) {
                c12182p1M14067e = C12182p1.m14067e(c12182p1M14067e, c12182p1);
            } else {
                c12182p1M14067e.getClass();
                if (!c12182p1.equals(c12182p2)) {
                    c12182p1M14067e.m14068a();
                    int i10 = c12182p1M14067e.f37069a + c12182p1.f37069a;
                    c12182p1M14067e.m14069b(i10);
                    System.arraycopy(c12182p1.f37070b, 0, c12182p1M14067e.f37070b, c12182p1M14067e.f37069a, c12182p1.f37069a);
                    System.arraycopy(c12182p1.f37071c, 0, c12182p1M14067e.f37071c, c12182p1M14067e.f37069a, c12182p1.f37069a);
                    c12182p1M14067e.f37069a = i10;
                }
            }
        }
        abstractC12133Z.unknownFields = c12182p1M14067e;
    }

    /* JADX INFO: renamed from: D */
    public static boolean m13883D(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* JADX INFO: renamed from: E */
    public static void m13884E(int i10, List list, C12211z0 c12211z0, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC12195u abstractC12195u = (AbstractC12195u) c12211z0.f37131a;
        int i11 = 0;
        if (!z6) {
            while (i11 < list.size()) {
                abstractC12195u.mo14092A0(i10, ((Boolean) list.get(i11)).booleanValue());
                i11++;
            }
            return;
        }
        abstractC12195u.mo14108Q0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Boolean) list.get(i13)).getClass();
            Logger logger = AbstractC12195u.f37108d;
            i12++;
        }
        abstractC12195u.mo14110S0(i12);
        while (i11 < list.size()) {
            abstractC12195u.mo14115z0(((Boolean) list.get(i11)).booleanValue() ? (byte) 1 : (byte) 0);
            i11++;
        }
    }

    /* JADX INFO: renamed from: F */
    public static void m13885F(int i10, List list, C12211z0 c12211z0) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c12211z0.getClass();
        for (int i11 = 0; i11 < list.size(); i11++) {
            ((AbstractC12195u) c12211z0.f37131a).mo14094C0(i10, (AbstractC12171m) list.get(i11));
        }
    }

    /* JADX INFO: renamed from: G */
    public static void m13886G(int i10, List list, C12211z0 c12211z0, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC12195u abstractC12195u = (AbstractC12195u) c12211z0.f37131a;
        int i11 = 0;
        if (!z6) {
            while (i11 < list.size()) {
                double dDoubleValue = ((Double) list.get(i11)).doubleValue();
                abstractC12195u.getClass();
                abstractC12195u.mo14098G0(i10, Double.doubleToRawLongBits(dDoubleValue));
                i11++;
            }
            return;
        }
        abstractC12195u.mo14108Q0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Double) list.get(i13)).getClass();
            Logger logger = AbstractC12195u.f37108d;
            i12 += 8;
        }
        abstractC12195u.mo14110S0(i12);
        while (i11 < list.size()) {
            abstractC12195u.mo14099H0(Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
            i11++;
        }
    }

    /* JADX INFO: renamed from: H */
    public static void m13887H(int i10, List list, C12211z0 c12211z0, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC12195u abstractC12195u = (AbstractC12195u) c12211z0.f37131a;
        int i11 = 0;
        if (!z6) {
            while (i11 < list.size()) {
                abstractC12195u.mo14100I0(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        abstractC12195u.mo14108Q0(i10, 2);
        int iM14138l0 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iM14138l0 += AbstractC12195u.m14138l0(((Integer) list.get(i12)).intValue());
        }
        abstractC12195u.mo14110S0(iM14138l0);
        while (i11 < list.size()) {
            abstractC12195u.mo14101J0(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    /* JADX INFO: renamed from: I */
    public static void m13888I(int i10, List list, C12211z0 c12211z0, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC12195u abstractC12195u = (AbstractC12195u) c12211z0.f37131a;
        int i11 = 0;
        if (!z6) {
            while (i11 < list.size()) {
                abstractC12195u.mo14096E0(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        abstractC12195u.mo14108Q0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Integer) list.get(i13)).getClass();
            Logger logger = AbstractC12195u.f37108d;
            i12 += 4;
        }
        abstractC12195u.mo14110S0(i12);
        while (i11 < list.size()) {
            abstractC12195u.mo14097F0(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    /* JADX INFO: renamed from: J */
    public static void m13889J(int i10, List list, C12211z0 c12211z0, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC12195u abstractC12195u = (AbstractC12195u) c12211z0.f37131a;
        int i11 = 0;
        if (!z6) {
            while (i11 < list.size()) {
                abstractC12195u.mo14098G0(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        abstractC12195u.mo14108Q0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Long) list.get(i13)).getClass();
            Logger logger = AbstractC12195u.f37108d;
            i12 += 8;
        }
        abstractC12195u.mo14110S0(i12);
        while (i11 < list.size()) {
            abstractC12195u.mo14099H0(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    /* JADX INFO: renamed from: K */
    public static void m13890K(int i10, List list, C12211z0 c12211z0, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC12195u abstractC12195u = (AbstractC12195u) c12211z0.f37131a;
        int i11 = 0;
        if (!z6) {
            while (i11 < list.size()) {
                float fFloatValue = ((Float) list.get(i11)).floatValue();
                abstractC12195u.getClass();
                abstractC12195u.mo14096E0(i10, Float.floatToRawIntBits(fFloatValue));
                i11++;
            }
            return;
        }
        abstractC12195u.mo14108Q0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Float) list.get(i13)).getClass();
            Logger logger = AbstractC12195u.f37108d;
            i12 += 4;
        }
        abstractC12195u.mo14110S0(i12);
        while (i11 < list.size()) {
            abstractC12195u.mo14097F0(Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
            i11++;
        }
    }

    /* JADX INFO: renamed from: L */
    public static void m13891L(int i10, List list, C12211z0 c12211z0, InterfaceC12134Z0 interfaceC12134Z0) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c12211z0.getClass();
        for (int i11 = 0; i11 < list.size(); i11++) {
            c12211z0.m14207h(i10, list.get(i11), interfaceC12134Z0);
        }
    }

    /* JADX INFO: renamed from: M */
    public static void m13892M(int i10, List list, C12211z0 c12211z0, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC12195u abstractC12195u = (AbstractC12195u) c12211z0.f37131a;
        int i11 = 0;
        if (!z6) {
            while (i11 < list.size()) {
                abstractC12195u.mo14100I0(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        abstractC12195u.mo14108Q0(i10, 2);
        int iM14138l0 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iM14138l0 += AbstractC12195u.m14138l0(((Integer) list.get(i12)).intValue());
        }
        abstractC12195u.mo14110S0(iM14138l0);
        while (i11 < list.size()) {
            abstractC12195u.mo14101J0(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    /* JADX INFO: renamed from: N */
    public static void m13893N(int i10, List list, C12211z0 c12211z0, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC12195u abstractC12195u = (AbstractC12195u) c12211z0.f37131a;
        int i11 = 0;
        if (!z6) {
            while (i11 < list.size()) {
                abstractC12195u.mo14111T0(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        abstractC12195u.mo14108Q0(i10, 2);
        int iM14150x0 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iM14150x0 += AbstractC12195u.m14150x0(((Long) list.get(i12)).longValue());
        }
        abstractC12195u.mo14110S0(iM14150x0);
        while (i11 < list.size()) {
            abstractC12195u.mo14112U0(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    /* JADX INFO: renamed from: O */
    public static void m13894O(int i10, List list, C12211z0 c12211z0, InterfaceC12134Z0 interfaceC12134Z0) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c12211z0.getClass();
        for (int i11 = 0; i11 < list.size(); i11++) {
            c12211z0.m14210k(i10, list.get(i11), interfaceC12134Z0);
        }
    }

    /* JADX INFO: renamed from: P */
    public static void m13895P(int i10, List list, C12211z0 c12211z0, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC12195u abstractC12195u = (AbstractC12195u) c12211z0.f37131a;
        int i11 = 0;
        if (!z6) {
            while (i11 < list.size()) {
                abstractC12195u.mo14096E0(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        abstractC12195u.mo14108Q0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Integer) list.get(i13)).getClass();
            Logger logger = AbstractC12195u.f37108d;
            i12 += 4;
        }
        abstractC12195u.mo14110S0(i12);
        while (i11 < list.size()) {
            abstractC12195u.mo14097F0(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    /* JADX INFO: renamed from: Q */
    public static void m13896Q(int i10, List list, C12211z0 c12211z0, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC12195u abstractC12195u = (AbstractC12195u) c12211z0.f37131a;
        int i11 = 0;
        if (!z6) {
            while (i11 < list.size()) {
                abstractC12195u.mo14098G0(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        abstractC12195u.mo14108Q0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Long) list.get(i13)).getClass();
            Logger logger = AbstractC12195u.f37108d;
            i12 += 8;
        }
        abstractC12195u.mo14110S0(i12);
        while (i11 < list.size()) {
            abstractC12195u.mo14099H0(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    /* JADX INFO: renamed from: R */
    public static void m13897R(int i10, List list, C12211z0 c12211z0, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC12195u abstractC12195u = (AbstractC12195u) c12211z0.f37131a;
        int i11 = 0;
        if (!z6) {
            while (i11 < list.size()) {
                int iIntValue = ((Integer) list.get(i11)).intValue();
                abstractC12195u.mo14109R0(i10, (iIntValue >> 31) ^ (iIntValue << 1));
                i11++;
            }
            return;
        }
        abstractC12195u.mo14108Q0(i10, 2);
        int iM14148v0 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            int iIntValue2 = ((Integer) list.get(i12)).intValue();
            iM14148v0 += AbstractC12195u.m14148v0((iIntValue2 >> 31) ^ (iIntValue2 << 1));
        }
        abstractC12195u.mo14110S0(iM14148v0);
        while (i11 < list.size()) {
            int iIntValue3 = ((Integer) list.get(i11)).intValue();
            abstractC12195u.mo14110S0((iIntValue3 >> 31) ^ (iIntValue3 << 1));
            i11++;
        }
    }

    /* JADX INFO: renamed from: S */
    public static void m13898S(int i10, List list, C12211z0 c12211z0, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC12195u abstractC12195u = (AbstractC12195u) c12211z0.f37131a;
        int i11 = 0;
        if (!z6) {
            while (i11 < list.size()) {
                long jLongValue = ((Long) list.get(i11)).longValue();
                abstractC12195u.mo14111T0(i10, (jLongValue >> 63) ^ (jLongValue << 1));
                i11++;
            }
            return;
        }
        abstractC12195u.mo14108Q0(i10, 2);
        int iM14150x0 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            long jLongValue2 = ((Long) list.get(i12)).longValue();
            iM14150x0 += AbstractC12195u.m14150x0((jLongValue2 >> 63) ^ (jLongValue2 << 1));
        }
        abstractC12195u.mo14110S0(iM14150x0);
        while (i11 < list.size()) {
            long jLongValue3 = ((Long) list.get(i11)).longValue();
            abstractC12195u.mo14112U0((jLongValue3 >> 63) ^ (jLongValue3 << 1));
            i11++;
        }
    }

    /* JADX INFO: renamed from: T */
    public static void m13899T(int i10, List list, C12211z0 c12211z0) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c12211z0.getClass();
        boolean z6 = list instanceof InterfaceC12190s0;
        AbstractC12195u abstractC12195u = (AbstractC12195u) c12211z0.f37131a;
        int i11 = 0;
        if (!z6) {
            while (i11 < list.size()) {
                abstractC12195u.mo14106O0(i10, (String) list.get(i11));
                i11++;
            }
            return;
        }
        InterfaceC12190s0 interfaceC12190s0 = (InterfaceC12190s0) list;
        while (i11 < list.size()) {
            Object objMo14090d = interfaceC12190s0.mo14090d(i11);
            if (objMo14090d instanceof String) {
                abstractC12195u.mo14106O0(i10, (String) objMo14090d);
            } else {
                abstractC12195u.mo14094C0(i10, (AbstractC12171m) objMo14090d);
            }
            i11++;
        }
    }

    /* JADX INFO: renamed from: U */
    public static void m13900U(int i10, List list, C12211z0 c12211z0, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC12195u abstractC12195u = (AbstractC12195u) c12211z0.f37131a;
        int i11 = 0;
        if (!z6) {
            while (i11 < list.size()) {
                abstractC12195u.mo14109R0(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        abstractC12195u.mo14108Q0(i10, 2);
        int iM14148v0 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iM14148v0 += AbstractC12195u.m14148v0(((Integer) list.get(i12)).intValue());
        }
        abstractC12195u.mo14110S0(iM14148v0);
        while (i11 < list.size()) {
            abstractC12195u.mo14110S0(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    /* JADX INFO: renamed from: V */
    public static void m13901V(int i10, List list, C12211z0 c12211z0, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC12195u abstractC12195u = (AbstractC12195u) c12211z0.f37131a;
        int i11 = 0;
        if (!z6) {
            while (i11 < list.size()) {
                abstractC12195u.mo14111T0(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        abstractC12195u.mo14108Q0(i10, 2);
        int iM14150x0 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iM14150x0 += AbstractC12195u.m14150x0(((Long) list.get(i12)).longValue());
        }
        abstractC12195u.mo14110S0(iM14150x0);
        while (i11 < list.size()) {
            abstractC12195u.mo14112U0(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m13902a(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return AbstractC12195u.m14128b0(i10) * size;
    }

    /* JADX INFO: renamed from: b */
    public static int m13903b(List list) {
        return list.size();
    }

    /* JADX INFO: renamed from: c */
    public static int m13904c(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM14146t0 = AbstractC12195u.m14146t0(i10) * size;
        for (int i11 = 0; i11 < list.size(); i11++) {
            iM14146t0 += AbstractC12195u.m14130d0((AbstractC12171m) list.get(i11));
        }
        return iM14146t0;
    }

    /* JADX INFO: renamed from: d */
    public static int m13905d(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (AbstractC12195u.m14146t0(i10) * size) + m13906e(list);
    }

    /* JADX INFO: renamed from: e */
    public static int m13906e(List list) {
        int iM14138l0;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C12142c0) {
            C12142c0 c12142c0 = (C12142c0) list;
            iM14138l0 = 0;
            while (i10 < size) {
                iM14138l0 += AbstractC12195u.m14138l0(c12142c0.m13940p(i10));
                i10++;
            }
        } else {
            iM14138l0 = 0;
            while (i10 < size) {
                iM14138l0 += AbstractC12195u.m14138l0(((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
        return iM14138l0;
    }

    /* JADX INFO: renamed from: f */
    public static int m13907f(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return AbstractC12195u.m14133g0(i10) * size;
    }

    /* JADX INFO: renamed from: g */
    public static int m13908g(List list) {
        return list.size() * 4;
    }

    /* JADX INFO: renamed from: h */
    public static int m13909h(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return AbstractC12195u.m14134h0(i10) * size;
    }

    /* JADX INFO: renamed from: i */
    public static int m13910i(List list) {
        return list.size() * 8;
    }

    /* JADX INFO: renamed from: j */
    public static int m13911j(int i10, List list, InterfaceC12134Z0 interfaceC12134Z0) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM14136j0 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            iM14136j0 += AbstractC12195u.m14136j0(i10, (InterfaceC12091G0) list.get(i11), interfaceC12134Z0);
        }
        return iM14136j0;
    }

    /* JADX INFO: renamed from: k */
    public static int m13912k(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (AbstractC12195u.m14146t0(i10) * size) + m13913l(list);
    }

    /* JADX INFO: renamed from: l */
    public static int m13913l(List list) {
        int iM14138l0;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C12142c0) {
            C12142c0 c12142c0 = (C12142c0) list;
            iM14138l0 = 0;
            while (i10 < size) {
                iM14138l0 += AbstractC12195u.m14138l0(c12142c0.m13940p(i10));
                i10++;
            }
        } else {
            iM14138l0 = 0;
            while (i10 < size) {
                iM14138l0 += AbstractC12195u.m14138l0(((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
        return iM14138l0;
    }

    /* JADX INFO: renamed from: m */
    public static int m13914m(int i10, List list) {
        if (list.size() == 0) {
            return 0;
        }
        return (AbstractC12195u.m14146t0(i10) * list.size()) + m13915n(list);
    }

    /* JADX INFO: renamed from: n */
    public static int m13915n(List list) {
        int iM14150x0;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C12205x0) {
            C12205x0 c12205x0 = (C12205x0) list;
            iM14150x0 = 0;
            while (i10 < size) {
                c12205x0.m14168m(i10);
                iM14150x0 += AbstractC12195u.m14150x0(c12205x0.f37118Z[i10]);
                i10++;
            }
        } else {
            iM14150x0 = 0;
            while (i10 < size) {
                iM14150x0 += AbstractC12195u.m14150x0(((Long) list.get(i10)).longValue());
                i10++;
            }
        }
        return iM14150x0;
    }

    /* JADX INFO: renamed from: o */
    public static int m13916o(int i10, Object obj, InterfaceC12134Z0 interfaceC12134Z0) {
        int iM14146t0 = AbstractC12195u.m14146t0(i10);
        int serializedSize = ((AbstractC12138b) ((InterfaceC12091G0) obj)).getSerializedSize(interfaceC12134Z0);
        return AbstractC12195u.m14148v0(serializedSize) + serializedSize + iM14146t0;
    }

    /* JADX INFO: renamed from: p */
    public static int m13917p(int i10, List list, InterfaceC12134Z0 interfaceC12134Z0) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM14146t0 = AbstractC12195u.m14146t0(i10) * size;
        for (int i11 = 0; i11 < size; i11++) {
            int serializedSize = ((AbstractC12138b) ((InterfaceC12091G0) list.get(i11))).getSerializedSize(interfaceC12134Z0);
            iM14146t0 += AbstractC12195u.m14148v0(serializedSize) + serializedSize;
        }
        return iM14146t0;
    }

    /* JADX INFO: renamed from: q */
    public static int m13918q(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (AbstractC12195u.m14146t0(i10) * size) + m13919r(list);
    }

    /* JADX INFO: renamed from: r */
    public static int m13919r(List list) {
        int iM14148v0;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C12142c0) {
            C12142c0 c12142c0 = (C12142c0) list;
            iM14148v0 = 0;
            while (i10 < size) {
                int iM13940p = c12142c0.m13940p(i10);
                iM14148v0 += AbstractC12195u.m14148v0((iM13940p >> 31) ^ (iM13940p << 1));
                i10++;
            }
        } else {
            iM14148v0 = 0;
            while (i10 < size) {
                int iIntValue = ((Integer) list.get(i10)).intValue();
                iM14148v0 += AbstractC12195u.m14148v0((iIntValue >> 31) ^ (iIntValue << 1));
                i10++;
            }
        }
        return iM14148v0;
    }

    /* JADX INFO: renamed from: s */
    public static int m13920s(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (AbstractC12195u.m14146t0(i10) * size) + m13921t(list);
    }

    /* JADX INFO: renamed from: t */
    public static int m13921t(List list) {
        int iM14150x0;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C12205x0) {
            C12205x0 c12205x0 = (C12205x0) list;
            iM14150x0 = 0;
            while (i10 < size) {
                c12205x0.m14168m(i10);
                long j10 = c12205x0.f37118Z[i10];
                iM14150x0 += AbstractC12195u.m14150x0((j10 >> 63) ^ (j10 << 1));
                i10++;
            }
        } else {
            iM14150x0 = 0;
            while (i10 < size) {
                long jLongValue = ((Long) list.get(i10)).longValue();
                iM14150x0 += AbstractC12195u.m14150x0((jLongValue >> 63) ^ (jLongValue << 1));
                i10++;
            }
        }
        return iM14150x0;
    }

    /* JADX INFO: renamed from: u */
    public static int m13922u(int i10, List list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        int iM14146t0 = AbstractC12195u.m14146t0(i10) * size;
        if (list instanceof InterfaceC12190s0) {
            InterfaceC12190s0 interfaceC12190s0 = (InterfaceC12190s0) list;
            while (i11 < size) {
                Object objMo14090d = interfaceC12190s0.mo14090d(i11);
                iM14146t0 = (objMo14090d instanceof AbstractC12171m ? AbstractC12195u.m14130d0((AbstractC12171m) objMo14090d) : AbstractC12195u.m14145s0((String) objMo14090d)) + iM14146t0;
                i11++;
            }
        } else {
            while (i11 < size) {
                Object obj = list.get(i11);
                iM14146t0 = (obj instanceof AbstractC12171m ? AbstractC12195u.m14130d0((AbstractC12171m) obj) : AbstractC12195u.m14145s0((String) obj)) + iM14146t0;
                i11++;
            }
        }
        return iM14146t0;
    }

    /* JADX INFO: renamed from: v */
    public static int m13923v(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (AbstractC12195u.m14146t0(i10) * size) + m13924w(list);
    }

    /* JADX INFO: renamed from: w */
    public static int m13924w(List list) {
        int iM14148v0;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C12142c0) {
            C12142c0 c12142c0 = (C12142c0) list;
            iM14148v0 = 0;
            while (i10 < size) {
                iM14148v0 += AbstractC12195u.m14148v0(c12142c0.m13940p(i10));
                i10++;
            }
        } else {
            iM14148v0 = 0;
            while (i10 < size) {
                iM14148v0 += AbstractC12195u.m14148v0(((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
        return iM14148v0;
    }

    /* JADX INFO: renamed from: x */
    public static int m13925x(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (AbstractC12195u.m14146t0(i10) * size) + m13926y(list);
    }

    /* JADX INFO: renamed from: y */
    public static int m13926y(List list) {
        int iM14150x0;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C12205x0) {
            C12205x0 c12205x0 = (C12205x0) list;
            iM14150x0 = 0;
            while (i10 < size) {
                c12205x0.m14168m(i10);
                iM14150x0 += AbstractC12195u.m14150x0(c12205x0.f37118Z[i10]);
                i10++;
            }
        } else {
            iM14150x0 = 0;
            while (i10 < size) {
                iM14150x0 += AbstractC12195u.m14150x0(((Long) list.get(i10)).longValue());
                i10++;
            }
        }
        return iM14150x0;
    }

    /* JADX INFO: renamed from: z */
    public static Object m13927z(Object obj, int i10, AbstractList abstractList, InterfaceC12154g0 interfaceC12154g0, Object obj2, C12185q1 c12185q1) {
        if (interfaceC12154g0 == null) {
            return obj2;
        }
        int size = abstractList.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            Integer num = (Integer) abstractList.get(i12);
            int iIntValue = num.intValue();
            if (interfaceC12154g0.findValueByNumber(iIntValue) != null) {
                if (i12 != i11) {
                    abstractList.set(i11, num);
                }
                i11++;
            } else {
                if (obj2 == null) {
                    c12185q1.getClass();
                    obj2 = C12185q1.m14080a(obj);
                }
                c12185q1.getClass();
                ((C12182p1) obj2).m14072f(i10 << 3, Long.valueOf(iIntValue));
            }
        }
        if (i11 != size) {
            abstractList.subList(i11, size).clear();
        }
        return obj2;
    }

    /* JADX INFO: renamed from: A */
    public static Object m13880A(Object obj, int i10, List list, Object obj2, C12185q1 c12185q1) {
        return obj2;
    }
}
