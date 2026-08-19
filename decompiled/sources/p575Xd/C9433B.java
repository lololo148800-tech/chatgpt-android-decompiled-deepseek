package p575Xd;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Xd.B */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C9433B {
    public static final C9432A Companion = new C9432A();

    /* JADX INFO: renamed from: a */
    public final String f28415a;

    /* JADX INFO: renamed from: b */
    public final String f28416b;

    /* JADX INFO: renamed from: c */
    public final String f28417c;

    public C9433B(int i10, String str, String str2, String str3) {
        if (1 != (i10 & 1)) {
            AbstractC11153a0.m12389l(i10, 1, C9467z.f28491a.getDescriptor());
            throw null;
        }
        this.f28415a = str;
        if ((i10 & 2) == 0) {
            this.f28416b = null;
        } else {
            this.f28416b = str2;
        }
        if ((i10 & 4) == 0) {
            this.f28417c = null;
        } else {
            this.f28417c = str3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0021  */
    public final boolean equals(Object obj) {
        boolean zM18089b;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9433B)) {
            return false;
        }
        C9433B c9433b = (C9433B) obj;
        if (!AbstractC16544l.m18089b(this.f28415a, c9433b.f28415a)) {
            return false;
        }
        String str = this.f28416b;
        String str2 = c9433b.f28416b;
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
        return zM18089b && AbstractC16544l.m18089b(this.f28417c, c9433b.f28417c);
    }

    public final int hashCode() {
        String str = this.f28415a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f28416b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f28417c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return "█";
    }

    public C9433B(String str, String str2, String str3) {
        this.f28415a = str;
        this.f28416b = str2;
        this.f28417c = str3;
    }
}
