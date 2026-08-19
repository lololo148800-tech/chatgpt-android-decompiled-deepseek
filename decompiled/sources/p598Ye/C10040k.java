package p598Ye;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Ye.k */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C10040k {
    public static final C10039j Companion = new C10039j();

    /* JADX INFO: renamed from: a */
    public final String f29741a;

    /* JADX INFO: renamed from: b */
    public final String f29742b;

    /* JADX INFO: renamed from: c */
    public final String f29743c;

    /* JADX INFO: renamed from: d */
    public final String f29744d;

    /* JADX INFO: renamed from: e */
    public final String f29745e;

    public C10040k(String id2, String str, String str2, String str3, String str4) {
        AbstractC16544l.m18094g(id2, "id");
        this.f29741a = id2;
        this.f29742b = str;
        this.f29743c = str2;
        this.f29744d = str3;
        this.f29745e = str4;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x002c  */
    public final boolean equals(Object obj) {
        boolean zM18089b;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10040k)) {
            return false;
        }
        C10040k c10040k = (C10040k) obj;
        if (!AbstractC16544l.m18089b(this.f29741a, c10040k.f29741a) || !AbstractC16544l.m18089b(this.f29742b, c10040k.f29742b)) {
            return false;
        }
        String str = this.f29743c;
        String str2 = c10040k.f29743c;
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
        return zM18089b && AbstractC16544l.m18089b(this.f29744d, c10040k.f29744d) && AbstractC16544l.m18089b(this.f29745e, c10040k.f29745e);
    }

    public final int hashCode() {
        int iHashCode = this.f29741a.hashCode() * 31;
        String str = this.f29742b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f29743c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f29744d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f29745e;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        return "█";
    }

    public C10040k(int i10, String str, String str2, String str3, String str4, String str5) {
        if (31 != (i10 & 31)) {
            AbstractC11153a0.m12389l(i10, 31, C10038i.f29740a.getDescriptor());
            throw null;
        }
        this.f29741a = str;
        this.f29742b = str2;
        this.f29743c = str3;
        this.f29744d = str4;
        this.f29745e = str5;
    }
}
