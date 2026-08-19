package com.google.protobuf;

import androidx.glance.appwidget.protobuf.C11064z;
import p370P0.C6277D;

/* JADX INFO: renamed from: com.google.protobuf.q1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12185q1 {
    /* JADX INFO: renamed from: a */
    public static C12182p1 m14080a(Object obj) {
        AbstractC12133Z abstractC12133Z = (AbstractC12133Z) obj;
        C12182p1 c12182p1 = abstractC12133Z.unknownFields;
        if (c12182p1 != C12182p1.f37068f) {
            return c12182p1;
        }
        C12182p1 c12182p2 = new C12182p1();
        abstractC12133Z.unknownFields = c12182p2;
        return c12182p2;
    }

    /* JADX INFO: renamed from: b */
    public static void m14081b(Object obj) {
        ((AbstractC12133Z) obj).unknownFields.f37073e = false;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m14082c(Object obj, C6277D c6277d) throws C12181p0, C11064z {
        int i10 = c6277d.f20382b;
        int i11 = i10 >>> 3;
        int i12 = i10 & 7;
        AbstractC12186r abstractC12186r = (AbstractC12186r) c6277d.f20385e;
        if (i12 == 0) {
            c6277d.m6829s0(0);
            ((C12182p1) obj).m14072f(i11 << 3, Long.valueOf(abstractC12186r.mo14044u()));
            return true;
        }
        if (i12 == 1) {
            c6277d.m6829s0(1);
            ((C12182p1) obj).m14072f((i11 << 3) | 1, Long.valueOf(abstractC12186r.mo14040q()));
            return true;
        }
        if (i12 == 2) {
            ((C12182p1) obj).m14072f((i11 << 3) | 2, c6277d.m6820o());
            return true;
        }
        if (i12 != 3) {
            if (i12 == 4) {
                return false;
            }
            if (i12 != 5) {
                throw C12181p0.m14062c();
            }
            c6277d.m6829s0(5);
            ((C12182p1) obj).m14072f((i11 << 3) | 5, Integer.valueOf(abstractC12186r.mo14039p()));
            return true;
        }
        C12182p1 c12182p1 = new C12182p1();
        int i13 = i11 << 3;
        int i14 = i13 | 4;
        while (c6277d.m6794b() != Integer.MAX_VALUE && m14082c(c12182p1, c6277d)) {
        }
        if (i14 != c6277d.f20382b) {
            throw new C12181p0("Protocol message end-group tag did not match expected tag.");
        }
        c12182p1.f37073e = false;
        ((C12182p1) obj).m14072f(i13 | 3, c12182p1);
        return true;
    }

    /* JADX INFO: renamed from: d */
    public static void m14083d(Object obj, Object obj2) {
        ((AbstractC12133Z) obj).unknownFields = (C12182p1) obj2;
    }
}
