package androidx.datastore.preferences.protobuf;

import p370P0.C6277D;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.j0 */
/* JADX INFO: loaded from: classes.dex */
public final class C10966j0 {
    /* JADX INFO: renamed from: a */
    public static boolean m11668a(Object obj, C6277D c6277d) throws C10997z {
        int iM6800e = c6277d.m6800e();
        int i10 = iM6800e >>> 3;
        int i11 = iM6800e & 7;
        if (i11 == 0) {
            ((C10964i0) obj).m11666c(i10 << 3, Long.valueOf(c6277d.m6779N()));
            return true;
        }
        if (i11 == 1) {
            ((C10964i0) obj).m11666c((i10 << 3) | 1, Long.valueOf(c6277d.m6768C()));
            return true;
        }
        if (i11 == 2) {
            ((C10964i0) obj).m11666c((i10 << 3) | 2, c6277d.m6816m());
            return true;
        }
        if (i11 != 3) {
            if (i11 == 4) {
                return false;
            }
            if (i11 != 5) {
                throw C10997z.m11727b();
            }
            ((C10964i0) obj).m11666c((i10 << 3) | 5, Integer.valueOf(c6277d.m6838z()));
            return true;
        }
        C10964i0 c10964i0M11664b = C10964i0.m11664b();
        int i12 = i10 << 3;
        int i13 = i12 | 4;
        while (c6277d.m6794b() != Integer.MAX_VALUE && m11668a(c10964i0M11664b, c6277d)) {
        }
        if (i13 != c6277d.m6800e()) {
            throw new C10997z("Protocol message end-group tag did not match expected tag.");
        }
        c10964i0M11664b.f33064e = false;
        ((C10964i0) obj).m11666c(i12 | 3, c10964i0M11664b);
        return true;
    }

    /* JADX INFO: renamed from: b */
    public static C10964i0 m11669b() {
        return C10964i0.m11664b();
    }
}
