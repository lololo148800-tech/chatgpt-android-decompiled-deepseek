package p623Zf;

import kotlin.jvm.internal.AbstractC16544l;
import p324Mn.C5551u;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Zf.z */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C10330z {
    public static final C10329y Companion = new C10329y();

    /* JADX INFO: renamed from: a */
    public final String f30657a;

    /* JADX INFO: renamed from: b */
    public final C10307c f30658b;

    /* JADX INFO: renamed from: c */
    public final String f30659c;

    /* JADX INFO: renamed from: d */
    public final C5551u f30660d;

    /* JADX INFO: renamed from: e */
    public final C10327w f30661e;

    public C10330z(int i10, String str, C10307c c10307c, String str2, C5551u c5551u, C10327w c10327w) {
        if ((i10 & 1) == 0) {
            this.f30657a = null;
        } else {
            this.f30657a = str;
        }
        if ((i10 & 2) == 0) {
            this.f30658b = null;
        } else {
            this.f30658b = c10307c;
        }
        if ((i10 & 4) == 0) {
            this.f30659c = null;
        } else {
            this.f30659c = str2;
        }
        if ((i10 & 8) == 0) {
            this.f30660d = null;
        } else {
            this.f30660d = c5551u;
        }
        if ((i10 & 16) == 0) {
            this.f30661e = null;
        } else {
            this.f30661e = c10327w;
        }
    }

    /* JADX INFO: renamed from: a */
    public static C10330z m10884a(C10330z c10330z, String str, C10307c c10307c, String str2, C5551u c5551u, C10327w c10327w, int i10) {
        if ((i10 & 1) != 0) {
            str = c10330z.f30657a;
        }
        String str3 = str;
        if ((i10 & 2) != 0) {
            c10307c = c10330z.f30658b;
        }
        C10307c c10307c2 = c10307c;
        if ((i10 & 4) != 0) {
            str2 = c10330z.f30659c;
        }
        String str4 = str2;
        if ((i10 & 8) != 0) {
            c5551u = c10330z.f30660d;
        }
        C5551u c5551u2 = c5551u;
        if ((i10 & 16) != 0) {
            c10327w = c10330z.f30661e;
        }
        c10330z.getClass();
        return new C10330z(str3, c10307c2, str4, c5551u2, c10327w);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x002c  */
    public final boolean equals(Object obj) {
        boolean zM18089b;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10330z)) {
            return false;
        }
        C10330z c10330z = (C10330z) obj;
        if (!AbstractC16544l.m18089b(this.f30657a, c10330z.f30657a) || !AbstractC16544l.m18089b(this.f30658b, c10330z.f30658b)) {
            return false;
        }
        String str = this.f30659c;
        String str2 = c10330z.f30659c;
        if (str == null) {
            if (str2 == null) {
                zM18089b = true;
            } else {
                zM18089b = false;
            }
        } else if (str2 == null) {
            zM18089b = false;
        } else {
            zM18089b = AbstractC16544l.m18089b(str, str2);
        }
        return zM18089b && AbstractC16544l.m18089b(this.f30660d, c10330z.f30660d) && AbstractC16544l.m18089b(this.f30661e, c10330z.f30661e);
    }

    public final int hashCode() {
        String str = this.f30657a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        C10307c c10307c = this.f30658b;
        int iHashCode2 = (iHashCode + (c10307c == null ? 0 : c10307c.hashCode())) * 31;
        String str2 = this.f30659c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        C5551u c5551u = this.f30660d;
        int iHashCode4 = (iHashCode3 + (c5551u == null ? 0 : c5551u.f18004Y.hashCode())) * 31;
        C10327w c10327w = this.f30661e;
        return iHashCode4 + (c10327w != null ? c10327w.hashCode() : 0);
    }

    public final String toString() {
        return "█";
    }

    public C10330z(String str, C10307c c10307c, String str2, C5551u c5551u, C10327w c10327w) {
        this.f30657a = str;
        this.f30658b = c10307c;
        this.f30659c = str2;
        this.f30660d = c5551u;
        this.f30661e = c10327w;
    }
}
