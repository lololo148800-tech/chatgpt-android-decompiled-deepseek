package p041Be;

import kotlin.jvm.internal.AbstractC16544l;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Be.c */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C1231c {
    public static final C1230b Companion = new C1230b();

    /* JADX INFO: renamed from: a */
    public final String f3242a;

    /* JADX INFO: renamed from: b */
    public final String f3243b;

    /* JADX INFO: renamed from: c */
    public final String f3244c;

    public C1231c(int i10, String str, String str2, String str3) {
        if ((i10 & 1) == 0) {
            this.f3242a = null;
        } else {
            this.f3242a = str;
        }
        if ((i10 & 2) == 0) {
            this.f3243b = null;
        } else {
            this.f3243b = str2;
        }
        if ((i10 & 4) == 0) {
            this.f3244c = null;
        } else {
            this.f3244c = str3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0021  */
    public final boolean equals(Object obj) {
        boolean zM18089b;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1231c)) {
            return false;
        }
        C1231c c1231c = (C1231c) obj;
        if (!AbstractC16544l.m18089b(this.f3242a, c1231c.f3242a)) {
            return false;
        }
        String str = this.f3243b;
        String str2 = c1231c.f3243b;
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
        return zM18089b && AbstractC16544l.m18089b(this.f3244c, c1231c.f3244c);
    }

    public final int hashCode() {
        String str = this.f3242a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f3243b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f3244c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return "█";
    }

    public C1231c(String str, String str2, String str3) {
        this.f3242a = str;
        this.f3243b = str2;
        this.f3244c = str3;
    }
}
