package androidx.datastore.preferences.protobuf;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.b0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC10950b0 {

    /* JADX INFO: renamed from: a */
    public static final Class f33014a;

    /* JADX INFO: renamed from: b */
    public static final C10966j0 f33015b;

    /* JADX INFO: renamed from: c */
    public static final C10966j0 f33016c;

    /* JADX INFO: renamed from: d */
    public static final C10966j0 f33017d;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            cls = null;
        }
        f33014a = cls;
        f33015b = m11525A(false);
        f33016c = m11525A(true);
        f33017d = new C10966j0();
    }

    /* JADX INFO: renamed from: A */
    public static C10966j0 m11525A(boolean z6) {
        Class<?> cls;
        try {
            cls = Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            return (C10966j0) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z6));
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* JADX INFO: renamed from: B */
    public static void m11526B(C10966j0 c10966j0, AbstractC10987u abstractC10987u, AbstractC10987u abstractC10987u2) {
        c10966j0.getClass();
        C10964i0 c10964i0 = abstractC10987u.unknownFields;
        C10964i0 c10964i1 = abstractC10987u2.unknownFields;
        if (!c10964i1.equals(C10964i0.f33059f)) {
            int i10 = c10964i0.f33060a + c10964i1.f33060a;
            int[] iArrCopyOf = Arrays.copyOf(c10964i0.f33061b, i10);
            System.arraycopy(c10964i1.f33061b, 0, iArrCopyOf, c10964i0.f33060a, c10964i1.f33060a);
            Object[] objArrCopyOf = Arrays.copyOf(c10964i0.f33062c, i10);
            System.arraycopy(c10964i1.f33062c, 0, objArrCopyOf, c10964i0.f33060a, c10964i1.f33060a);
            c10964i0 = new C10964i0(i10, iArrCopyOf, objArrCopyOf, true);
        }
        abstractC10987u.unknownFields = c10964i0;
    }

    /* JADX INFO: renamed from: C */
    public static boolean m11527C(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* JADX INFO: renamed from: D */
    public static void m11528D(int i10, List list, C10930I c10930i, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C10963i c10963i = (C10963i) c10930i.f32971a;
        int i11 = 0;
        if (!z6) {
            while (i11 < list.size()) {
                c10963i.m11643T(i10, ((Boolean) list.get(i11)).booleanValue());
                i11++;
            }
            return;
        }
        c10963i.m11654e0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Boolean) list.get(i13)).getClass();
            Logger logger = C10963i.f33052h;
            i12++;
        }
        c10963i.m11656g0(i12);
        while (i11 < list.size()) {
            c10963i.m11641R(((Boolean) list.get(i11)).booleanValue() ? (byte) 1 : (byte) 0);
            i11++;
        }
    }

    /* JADX INFO: renamed from: E */
    public static void m11529E(int i10, List list, C10930I c10930i) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c10930i.getClass();
        for (int i11 = 0; i11 < list.size(); i11++) {
            ((C10963i) c10930i.f32971a).m11644U(i10, (C10957f) list.get(i11));
        }
    }

    /* JADX INFO: renamed from: F */
    public static void m11530F(int i10, List list, C10930I c10930i, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C10963i c10963i = (C10963i) c10930i.f32971a;
        int i11 = 0;
        if (!z6) {
            while (i11 < list.size()) {
                double dDoubleValue = ((Double) list.get(i11)).doubleValue();
                c10963i.getClass();
                c10963i.m11648Y(i10, Double.doubleToRawLongBits(dDoubleValue));
                i11++;
            }
            return;
        }
        c10963i.m11654e0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Double) list.get(i13)).getClass();
            Logger logger = C10963i.f33052h;
            i12 += 8;
        }
        c10963i.m11656g0(i12);
        while (i11 < list.size()) {
            c10963i.m11649Z(Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
            i11++;
        }
    }

    /* JADX INFO: renamed from: G */
    public static void m11531G(int i10, List list, C10930I c10930i, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C10963i c10963i = (C10963i) c10930i.f32971a;
        int i11 = 0;
        if (!z6) {
            while (i11 < list.size()) {
                c10963i.m11650a0(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        c10963i.m11654e0(i10, 2);
        int iM11618C = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iM11618C += C10963i.m11618C(((Integer) list.get(i12)).intValue());
        }
        c10963i.m11656g0(iM11618C);
        while (i11 < list.size()) {
            c10963i.m11651b0(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    /* JADX INFO: renamed from: H */
    public static void m11532H(int i10, List list, C10930I c10930i, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C10963i c10963i = (C10963i) c10930i.f32971a;
        int i11 = 0;
        if (!z6) {
            while (i11 < list.size()) {
                c10963i.m11646W(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        c10963i.m11654e0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Integer) list.get(i13)).getClass();
            Logger logger = C10963i.f33052h;
            i12 += 4;
        }
        c10963i.m11656g0(i12);
        while (i11 < list.size()) {
            c10963i.m11647X(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    /* JADX INFO: renamed from: I */
    public static void m11533I(int i10, List list, C10930I c10930i, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C10963i c10963i = (C10963i) c10930i.f32971a;
        int i11 = 0;
        if (!z6) {
            while (i11 < list.size()) {
                c10963i.m11648Y(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        c10963i.m11654e0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Long) list.get(i13)).getClass();
            Logger logger = C10963i.f33052h;
            i12 += 8;
        }
        c10963i.m11656g0(i12);
        while (i11 < list.size()) {
            c10963i.m11649Z(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    /* JADX INFO: renamed from: J */
    public static void m11534J(int i10, List list, C10930I c10930i, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C10963i c10963i = (C10963i) c10930i.f32971a;
        int i11 = 0;
        if (!z6) {
            while (i11 < list.size()) {
                float fFloatValue = ((Float) list.get(i11)).floatValue();
                c10963i.getClass();
                c10963i.m11646W(i10, Float.floatToRawIntBits(fFloatValue));
                i11++;
            }
            return;
        }
        c10963i.m11654e0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Float) list.get(i13)).getClass();
            Logger logger = C10963i.f33052h;
            i12 += 4;
        }
        c10963i.m11656g0(i12);
        while (i11 < list.size()) {
            c10963i.m11647X(Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
            i11++;
        }
    }

    /* JADX INFO: renamed from: K */
    public static void m11535K(int i10, List list, C10930I c10930i, InterfaceC10948a0 interfaceC10948a0) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c10930i.getClass();
        for (int i11 = 0; i11 < list.size(); i11++) {
            c10930i.m11447h(i10, list.get(i11), interfaceC10948a0);
        }
    }

    /* JADX INFO: renamed from: L */
    public static void m11536L(int i10, List list, C10930I c10930i, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C10963i c10963i = (C10963i) c10930i.f32971a;
        int i11 = 0;
        if (!z6) {
            while (i11 < list.size()) {
                c10963i.m11650a0(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        c10963i.m11654e0(i10, 2);
        int iM11618C = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iM11618C += C10963i.m11618C(((Integer) list.get(i12)).intValue());
        }
        c10963i.m11656g0(iM11618C);
        while (i11 < list.size()) {
            c10963i.m11651b0(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    /* JADX INFO: renamed from: M */
    public static void m11537M(int i10, List list, C10930I c10930i, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C10963i c10963i = (C10963i) c10930i.f32971a;
        int i11 = 0;
        if (!z6) {
            while (i11 < list.size()) {
                c10963i.m11657h0(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        c10963i.m11654e0(i10, 2);
        int iM11630O = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iM11630O += C10963i.m11630O(((Long) list.get(i12)).longValue());
        }
        c10963i.m11656g0(iM11630O);
        while (i11 < list.size()) {
            c10963i.m11658i0(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    /* JADX INFO: renamed from: N */
    public static void m11538N(int i10, List list, C10930I c10930i, InterfaceC10948a0 interfaceC10948a0) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c10930i.getClass();
        for (int i11 = 0; i11 < list.size(); i11++) {
            c10930i.m11450k(i10, list.get(i11), interfaceC10948a0);
        }
    }

    /* JADX INFO: renamed from: O */
    public static void m11539O(int i10, List list, C10930I c10930i, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C10963i c10963i = (C10963i) c10930i.f32971a;
        int i11 = 0;
        if (!z6) {
            while (i11 < list.size()) {
                c10963i.m11646W(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        c10963i.m11654e0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Integer) list.get(i13)).getClass();
            Logger logger = C10963i.f33052h;
            i12 += 4;
        }
        c10963i.m11656g0(i12);
        while (i11 < list.size()) {
            c10963i.m11647X(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    /* JADX INFO: renamed from: P */
    public static void m11540P(int i10, List list, C10930I c10930i, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C10963i c10963i = (C10963i) c10930i.f32971a;
        int i11 = 0;
        if (!z6) {
            while (i11 < list.size()) {
                c10963i.m11648Y(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        c10963i.m11654e0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Long) list.get(i13)).getClass();
            Logger logger = C10963i.f33052h;
            i12 += 8;
        }
        c10963i.m11656g0(i12);
        while (i11 < list.size()) {
            c10963i.m11649Z(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    /* JADX INFO: renamed from: Q */
    public static void m11541Q(int i10, List list, C10930I c10930i, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C10963i c10963i = (C10963i) c10930i.f32971a;
        int i11 = 0;
        if (!z6) {
            while (i11 < list.size()) {
                int iIntValue = ((Integer) list.get(i11)).intValue();
                c10963i.m11655f0(i10, (iIntValue >> 31) ^ (iIntValue << 1));
                i11++;
            }
            return;
        }
        c10963i.m11654e0(i10, 2);
        int iM11628M = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            int iIntValue2 = ((Integer) list.get(i12)).intValue();
            iM11628M += C10963i.m11628M((iIntValue2 >> 31) ^ (iIntValue2 << 1));
        }
        c10963i.m11656g0(iM11628M);
        while (i11 < list.size()) {
            int iIntValue3 = ((Integer) list.get(i11)).intValue();
            c10963i.m11656g0((iIntValue3 >> 31) ^ (iIntValue3 << 1));
            i11++;
        }
    }

    /* JADX INFO: renamed from: R */
    public static void m11542R(int i10, List list, C10930I c10930i, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C10963i c10963i = (C10963i) c10930i.f32971a;
        int i11 = 0;
        if (!z6) {
            while (i11 < list.size()) {
                long jLongValue = ((Long) list.get(i11)).longValue();
                c10963i.m11657h0(i10, (jLongValue >> 63) ^ (jLongValue << 1));
                i11++;
            }
            return;
        }
        c10963i.m11654e0(i10, 2);
        int iM11630O = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            long jLongValue2 = ((Long) list.get(i12)).longValue();
            iM11630O += C10963i.m11630O((jLongValue2 >> 63) ^ (jLongValue2 << 1));
        }
        c10963i.m11656g0(iM11630O);
        while (i11 < list.size()) {
            long jLongValue3 = ((Long) list.get(i11)).longValue();
            c10963i.m11658i0((jLongValue3 >> 63) ^ (jLongValue3 << 1));
            i11++;
        }
    }

    /* JADX INFO: renamed from: S */
    public static void m11543S(int i10, List list, C10930I c10930i) throws C10961h {
        if (list == null || list.isEmpty()) {
            return;
        }
        c10930i.getClass();
        boolean z6 = list instanceof InterfaceC10924C;
        C10963i c10963i = (C10963i) c10930i.f32971a;
        int i11 = 0;
        if (!z6) {
            while (i11 < list.size()) {
                c10963i.m11652c0(i10, (String) list.get(i11));
                i11++;
            }
            return;
        }
        InterfaceC10924C interfaceC10924C = (InterfaceC10924C) list;
        while (i11 < list.size()) {
            Object objMo11432d = interfaceC10924C.mo11432d(i11);
            if (objMo11432d instanceof String) {
                c10963i.m11652c0(i10, (String) objMo11432d);
            } else {
                c10963i.m11644U(i10, (C10957f) objMo11432d);
            }
            i11++;
        }
    }

    /* JADX INFO: renamed from: T */
    public static void m11544T(int i10, List list, C10930I c10930i, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C10963i c10963i = (C10963i) c10930i.f32971a;
        int i11 = 0;
        if (!z6) {
            while (i11 < list.size()) {
                c10963i.m11655f0(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        c10963i.m11654e0(i10, 2);
        int iM11628M = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iM11628M += C10963i.m11628M(((Integer) list.get(i12)).intValue());
        }
        c10963i.m11656g0(iM11628M);
        while (i11 < list.size()) {
            c10963i.m11656g0(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    /* JADX INFO: renamed from: U */
    public static void m11545U(int i10, List list, C10930I c10930i, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C10963i c10963i = (C10963i) c10930i.f32971a;
        int i11 = 0;
        if (!z6) {
            while (i11 < list.size()) {
                c10963i.m11657h0(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        c10963i.m11654e0(i10, 2);
        int iM11630O = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iM11630O += C10963i.m11630O(((Long) list.get(i12)).longValue());
        }
        c10963i.m11656g0(iM11630O);
        while (i11 < list.size()) {
            c10963i.m11658i0(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m11546a(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return C10963i.m11631s(i10) * size;
    }

    /* JADX INFO: renamed from: b */
    public static int m11547b(List list) {
        return list.size();
    }

    /* JADX INFO: renamed from: c */
    public static int m11548c(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM11626K = C10963i.m11626K(i10) * size;
        for (int i11 = 0; i11 < list.size(); i11++) {
            iM11626K += C10963i.m11633u((C10957f) list.get(i11));
        }
        return iM11626K;
    }

    /* JADX INFO: renamed from: d */
    public static int m11549d(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C10963i.m11626K(i10) * size) + m11550e(list);
    }

    /* JADX INFO: renamed from: e */
    public static int m11550e(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC10989v) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iM11618C = 0;
        for (int i10 = 0; i10 < size; i10++) {
            iM11618C += C10963i.m11618C(((Integer) list.get(i10)).intValue());
        }
        return iM11618C;
    }

    /* JADX INFO: renamed from: f */
    public static int m11551f(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return C10963i.m11636x(i10) * size;
    }

    /* JADX INFO: renamed from: g */
    public static int m11552g(List list) {
        return list.size() * 4;
    }

    /* JADX INFO: renamed from: h */
    public static int m11553h(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return C10963i.m11637y(i10) * size;
    }

    /* JADX INFO: renamed from: i */
    public static int m11554i(List list) {
        return list.size() * 8;
    }

    /* JADX INFO: renamed from: j */
    public static int m11555j(int i10, List list, InterfaceC10948a0 interfaceC10948a0) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM11616A = 0;
        for (int i11 = 0; i11 < size; i11++) {
            iM11616A += C10963i.m11616A(i10, (AbstractC10947a) list.get(i11), interfaceC10948a0);
        }
        return iM11616A;
    }

    /* JADX INFO: renamed from: k */
    public static int m11556k(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C10963i.m11626K(i10) * size) + m11557l(list);
    }

    /* JADX INFO: renamed from: l */
    public static int m11557l(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC10989v) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iM11618C = 0;
        for (int i10 = 0; i10 < size; i10++) {
            iM11618C += C10963i.m11618C(((Integer) list.get(i10)).intValue());
        }
        return iM11618C;
    }

    /* JADX INFO: renamed from: m */
    public static int m11558m(int i10, List list) {
        if (list.size() == 0) {
            return 0;
        }
        return (C10963i.m11626K(i10) * list.size()) + m11559n(list);
    }

    /* JADX INFO: renamed from: n */
    public static int m11559n(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC10928G) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iM11630O = 0;
        for (int i10 = 0; i10 < size; i10++) {
            iM11630O += C10963i.m11630O(((Long) list.get(i10)).longValue());
        }
        return iM11630O;
    }

    /* JADX INFO: renamed from: o */
    public static int m11560o(int i10, Object obj, InterfaceC10948a0 interfaceC10948a0) {
        int iM11626K = C10963i.m11626K(i10);
        int iM11522b = ((AbstractC10947a) obj).m11522b(interfaceC10948a0);
        return C10963i.m11628M(iM11522b) + iM11522b + iM11626K;
    }

    /* JADX INFO: renamed from: p */
    public static int m11561p(int i10, List list, InterfaceC10948a0 interfaceC10948a0) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM11626K = C10963i.m11626K(i10) * size;
        for (int i11 = 0; i11 < size; i11++) {
            int iM11522b = ((AbstractC10947a) list.get(i11)).m11522b(interfaceC10948a0);
            iM11626K += C10963i.m11628M(iM11522b) + iM11522b;
        }
        return iM11626K;
    }

    /* JADX INFO: renamed from: q */
    public static int m11562q(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C10963i.m11626K(i10) * size) + m11563r(list);
    }

    /* JADX INFO: renamed from: r */
    public static int m11563r(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC10989v) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iM11628M = 0;
        for (int i10 = 0; i10 < size; i10++) {
            int iIntValue = ((Integer) list.get(i10)).intValue();
            iM11628M += C10963i.m11628M((iIntValue >> 31) ^ (iIntValue << 1));
        }
        return iM11628M;
    }

    /* JADX INFO: renamed from: s */
    public static int m11564s(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C10963i.m11626K(i10) * size) + m11565t(list);
    }

    /* JADX INFO: renamed from: t */
    public static int m11565t(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC10928G) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iM11630O = 0;
        for (int i10 = 0; i10 < size; i10++) {
            long jLongValue = ((Long) list.get(i10)).longValue();
            iM11630O += C10963i.m11630O((jLongValue >> 63) ^ (jLongValue << 1));
        }
        return iM11630O;
    }

    /* JADX INFO: renamed from: u */
    public static int m11566u(int i10, List list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        int iM11626K = C10963i.m11626K(i10) * size;
        if (list instanceof InterfaceC10924C) {
            InterfaceC10924C interfaceC10924C = (InterfaceC10924C) list;
            while (i11 < size) {
                Object objMo11432d = interfaceC10924C.mo11432d(i11);
                iM11626K = (objMo11432d instanceof C10957f ? C10963i.m11633u((C10957f) objMo11432d) : C10963i.m11625J((String) objMo11432d)) + iM11626K;
                i11++;
            }
        } else {
            while (i11 < size) {
                Object obj = list.get(i11);
                iM11626K = (obj instanceof C10957f ? C10963i.m11633u((C10957f) obj) : C10963i.m11625J((String) obj)) + iM11626K;
                i11++;
            }
        }
        return iM11626K;
    }

    /* JADX INFO: renamed from: v */
    public static int m11567v(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C10963i.m11626K(i10) * size) + m11568w(list);
    }

    /* JADX INFO: renamed from: w */
    public static int m11568w(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC10989v) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iM11628M = 0;
        for (int i10 = 0; i10 < size; i10++) {
            iM11628M += C10963i.m11628M(((Integer) list.get(i10)).intValue());
        }
        return iM11628M;
    }

    /* JADX INFO: renamed from: x */
    public static int m11569x(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C10963i.m11626K(i10) * size) + m11570y(list);
    }

    /* JADX INFO: renamed from: y */
    public static int m11570y(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC10928G) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iM11630O = 0;
        for (int i10 = 0; i10 < size; i10++) {
            iM11630O += C10963i.m11630O(((Long) list.get(i10)).longValue());
        }
        return iM11630O;
    }

    /* JADX INFO: renamed from: z */
    public static Object m11571z(int i10, List list, Object obj, C10966j0 c10966j0) {
        return obj;
    }
}
