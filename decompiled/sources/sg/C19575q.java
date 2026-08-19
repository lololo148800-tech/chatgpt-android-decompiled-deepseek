package sg;

import kotlin.jvm.internal.AbstractC16544l;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: sg.q */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C19575q {
    public static final C19574p Companion = new C19574p();

    /* JADX INFO: renamed from: a */
    public final String f62162a;

    /* JADX INFO: renamed from: b */
    public final String f62163b;

    /* JADX INFO: renamed from: c */
    public final String f62164c;

    public C19575q(int i10, String str, String str2, String str3) {
        if ((i10 & 1) == 0) {
            this.f62162a = null;
        } else {
            this.f62162a = str;
        }
        if ((i10 & 2) == 0) {
            this.f62163b = null;
        } else {
            this.f62163b = str2;
        }
        if ((i10 & 4) == 0) {
            this.f62164c = null;
        } else {
            this.f62164c = str3;
        }
    }

    /* JADX INFO: renamed from: a */
    public static C19575q m20626a(C19575q c19575q, int i10) {
        return new C19575q((i10 & 1) != 0 ? c19575q.f62162a : null, (i10 & 2) != 0 ? c19575q.f62163b : null, (i10 & 4) != 0 ? c19575q.f62164c : null);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0016  */
    /* JADX WARN: Code duplicated, block: B:22:0x002c  */
    /* JADX WARN: Code duplicated, block: B:32:0x0042  */
    public final boolean equals(Object obj) {
        boolean zM18089b;
        boolean zM18089b2;
        boolean zM18089b3;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19575q)) {
            return false;
        }
        C19575q c19575q = (C19575q) obj;
        String str = c19575q.f62162a;
        String str2 = this.f62162a;
        if (str2 == null) {
            if (str == null) {
                zM18089b = true;
            } else {
                zM18089b = false;
            }
        } else if (str == null) {
            zM18089b = false;
        } else {
            zM18089b = AbstractC16544l.m18089b(str2, str);
        }
        if (!zM18089b) {
            return false;
        }
        String str3 = this.f62163b;
        String str4 = c19575q.f62163b;
        if (str3 == null) {
            if (str4 == null) {
                zM18089b2 = true;
            } else {
                zM18089b2 = false;
            }
        } else if (str4 == null) {
            zM18089b2 = false;
        } else {
            zM18089b2 = AbstractC16544l.m18089b(str3, str4);
        }
        if (!zM18089b2) {
            return false;
        }
        String str5 = this.f62164c;
        String str6 = c19575q.f62164c;
        if (str5 == null) {
            if (str6 == null) {
                zM18089b3 = true;
            } else {
                zM18089b3 = false;
            }
        } else if (str6 == null) {
            zM18089b3 = false;
        } else {
            zM18089b3 = AbstractC16544l.m18089b(str5, str6);
        }
        return zM18089b3;
    }

    public final int hashCode() {
        String str = this.f62162a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f62163b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f62164c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return "█";
    }

    public C19575q(String str, String str2, String str3) {
        this.f62162a = str;
        this.f62163b = str2;
        this.f62164c = str3;
    }

    public /* synthetic */ C19575q(String str, String str2, String str3, int i10) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3);
    }
}
