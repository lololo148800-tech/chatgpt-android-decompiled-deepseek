package androidx.glance.appwidget.protobuf;

import com.google.protobuf.C12178o0;
import p030B2.AbstractC0754e0;
import p370P0.C6277D;

/* JADX INFO: renamed from: androidx.glance.appwidget.protobuf.a0 */
/* JADX INFO: loaded from: classes.dex */
public final class C11031a0 {
    /* JADX INFO: renamed from: a */
    public static C11029Z m11977a(Object obj) {
        AbstractC11059u abstractC11059u = (AbstractC11059u) obj;
        C11029Z c11029z = abstractC11059u.unknownFields;
        if (c11029z != C11029Z.f33279f) {
            return c11029z;
        }
        C11029Z c11029z2 = new C11029Z(0, new int[8], new Object[8], true);
        abstractC11059u.unknownFields = c11029z2;
        return c11029z2;
    }

    /* JADX INFO: renamed from: b */
    public static void m11978b(Object obj) {
        C11029Z c11029z = ((AbstractC11059u) obj).unknownFields;
        if (c11029z.f33284e) {
            c11029z.f33284e = false;
        }
    }

    /* JADX INFO: renamed from: c */
    public static boolean m11979c(int i10, C6277D c6277d, Object obj) throws C11005A, C12178o0 {
        int i11 = c6277d.f20382b;
        int i12 = i11 >>> 3;
        int i13 = i11 & 7;
        AbstractC0754e0 abstractC0754e0 = (AbstractC0754e0) c6277d.f20385e;
        if (i13 == 0) {
            c6277d.m6829s0(0);
            ((C11029Z) obj).m11974c(i12 << 3, Long.valueOf(abstractC0754e0.mo1629s()));
            return true;
        }
        if (i13 == 1) {
            c6277d.m6829s0(1);
            ((C11029Z) obj).m11974c((i12 << 3) | 1, Long.valueOf(abstractC0754e0.mo1626p()));
            return true;
        }
        if (i13 == 2) {
            ((C11029Z) obj).m11974c((i12 << 3) | 2, c6277d.m6818n());
            return true;
        }
        if (i13 != 3) {
            if (i13 == 4) {
                return false;
            }
            if (i13 != 5) {
                throw C11005A.m11844b();
            }
            c6277d.m6829s0(5);
            ((C11029Z) obj).m11974c(5 | (i12 << 3), Integer.valueOf(abstractC0754e0.mo1625o()));
            return true;
        }
        C11029Z c11029z = new C11029Z(0, new int[8], new Object[8], true);
        int i14 = i12 << 3;
        int i15 = i14 | 4;
        int i16 = i10 + 1;
        if (i16 >= 100) {
            throw new C11005A("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (c6277d.m6794b() != Integer.MAX_VALUE && m11979c(i16, c6277d, c11029z)) {
        }
        if (i15 != c6277d.f20382b) {
            throw new C11005A("Protocol message end-group tag did not match expected tag.");
        }
        if (c11029z.f33284e) {
            c11029z.f33284e = false;
        }
        ((C11029Z) obj).m11974c(i14 | 3, c11029z);
        return true;
    }
}
