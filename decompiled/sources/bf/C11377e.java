package bf;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: bf.e */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C11377e {
    public static final C11376d Companion = new C11376d();

    /* JADX INFO: renamed from: a */
    public final String f34381a;

    /* JADX INFO: renamed from: b */
    public final String f34382b;

    /* JADX INFO: renamed from: c */
    public final String f34383c;

    /* JADX INFO: renamed from: d */
    public final String f34384d;

    /* JADX INFO: renamed from: e */
    public final String f34385e;

    public C11377e(String id2, String str, String str2, String str3, String str4) {
        AbstractC16544l.m18094g(id2, "id");
        this.f34381a = id2;
        this.f34382b = str;
        this.f34383c = str2;
        this.f34384d = str3;
        this.f34385e = str4;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0021  */
    public final boolean equals(Object obj) {
        boolean zM18089b;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11377e)) {
            return false;
        }
        C11377e c11377e = (C11377e) obj;
        if (!AbstractC16544l.m18089b(this.f34381a, c11377e.f34381a)) {
            return false;
        }
        String str = this.f34382b;
        String str2 = c11377e.f34382b;
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
        return zM18089b && AbstractC16544l.m18089b(this.f34383c, c11377e.f34383c) && AbstractC16544l.m18089b(this.f34384d, c11377e.f34384d) && AbstractC16544l.m18089b(this.f34385e, c11377e.f34385e);
    }

    public final int hashCode() {
        int iHashCode = this.f34381a.hashCode() * 31;
        String str = this.f34382b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f34383c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f34384d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f34385e;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        return "█";
    }

    public C11377e(int i10, String str, String str2, String str3, String str4, String str5) {
        if (1 != (i10 & 1)) {
            AbstractC11153a0.m12389l(i10, 1, C11375c.f34380a.getDescriptor());
            throw null;
        }
        this.f34381a = str;
        if ((i10 & 2) == 0) {
            this.f34382b = null;
        } else {
            this.f34382b = str2;
        }
        if ((i10 & 4) == 0) {
            this.f34383c = null;
        } else {
            this.f34383c = str3;
        }
        if ((i10 & 8) == 0) {
            this.f34384d = null;
        } else {
            this.f34384d = str4;
        }
        if ((i10 & 16) == 0) {
            this.f34385e = null;
        } else {
            this.f34385e = str5;
        }
    }
}
