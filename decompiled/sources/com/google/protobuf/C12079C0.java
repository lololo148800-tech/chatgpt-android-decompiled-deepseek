package com.google.protobuf;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import java.util.Map;
import p658b5.C11238i;

/* JADX INFO: renamed from: com.google.protobuf.C0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12079C0 {
    /* JADX INFO: renamed from: a */
    public static C11238i m13727a(Object obj) {
        return ((C12073A0) obj).f36865a;
    }

    /* JADX INFO: renamed from: b */
    public static C12076B0 m13728b(Object obj) {
        return (C12076B0) obj;
    }

    /* JADX INFO: renamed from: c */
    public static int m13729c(Object obj, int i10, Object obj2) {
        C12076B0 c12076b0 = (C12076B0) obj;
        C12073A0 c12073a0 = (C12073A0) obj2;
        int iM11040A = 0;
        if (!c12076b0.isEmpty()) {
            for (Map.Entry entry : c12076b0.entrySet()) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                c12073a0.getClass();
                int iM14146t0 = AbstractC12195u.m14146t0(i10);
                C11238i c11238i = c12073a0.f36865a;
                int iM13836c = C12110N.m13836c((EnumC12101J1) c11238i.f34010o0, 2, value) + C12110N.m13836c((EnumC12101J1) c11238i.f34008Y, 1, key);
                iM11040A = AbstractC10763a.m11040A(iM13836c, iM13836c, iM14146t0, iM11040A);
            }
        }
        return iM11040A;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m13730d(Object obj) {
        return !((C12076B0) obj).f36869Y;
    }

    /* JADX INFO: renamed from: e */
    public static C12076B0 m13731e(Object obj, Object obj2) {
        C12076B0 c12076b0M13719c = (C12076B0) obj;
        C12076B0 c12076b0 = (C12076B0) obj2;
        if (!c12076b0.isEmpty()) {
            if (!c12076b0M13719c.f36869Y) {
                c12076b0M13719c = c12076b0M13719c.m13719c();
            }
            c12076b0M13719c.m13718b();
            if (!c12076b0.isEmpty()) {
                c12076b0M13719c.putAll(c12076b0);
            }
        }
        return c12076b0M13719c;
    }

    /* JADX INFO: renamed from: f */
    public static C12076B0 m13732f() {
        return C12076B0.f36868Z.m13719c();
    }

    /* JADX INFO: renamed from: g */
    public static void m13733g(Object obj) {
        ((C12076B0) obj).f36869Y = false;
    }
}
