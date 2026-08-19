package p350O1;

import p138F8.vJO.vRJidSveZHcTw;

/* JADX INFO: renamed from: O1.p */
/* JADX INFO: loaded from: classes.dex */
public final class C6067p {

    /* JADX INFO: renamed from: a */
    public final int f19763a;

    /* JADX INFO: renamed from: a */
    public static final boolean m6643a(int i10, int i11) {
        return i10 == i11;
    }

    /* JADX INFO: renamed from: b */
    public static String m6644b(int i10) {
        if (m6643a(i10, 0)) {
            return "Unspecified";
        }
        if (m6643a(i10, 1)) {
            return "Text";
        }
        if (m6643a(i10, 2)) {
            return "Ascii";
        }
        if (m6643a(i10, 3)) {
            return "Number";
        }
        if (m6643a(i10, 4)) {
            return "Phone";
        }
        if (m6643a(i10, 5)) {
            return vRJidSveZHcTw.sxViFA;
        }
        if (m6643a(i10, 6)) {
            return "Email";
        }
        if (m6643a(i10, 7)) {
            return "Password";
        }
        if (m6643a(i10, 8)) {
            return "NumberPassword";
        }
        return m6643a(i10, 9) ? "Decimal" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C6067p) {
            return this.f19763a == ((C6067p) obj).f19763a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f19763a;
    }

    public final String toString() {
        return m6644b(this.f19763a);
    }
}
