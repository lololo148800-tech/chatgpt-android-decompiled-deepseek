package eg;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: eg.r */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C13395r {
    public static final C13394q Companion = new C13394q();

    /* JADX INFO: renamed from: a */
    public final String f42442a;

    /* JADX INFO: renamed from: b */
    public final String f42443b;

    /* JADX INFO: renamed from: c */
    public final String f42444c;

    /* JADX INFO: renamed from: d */
    public final String f42445d;

    public /* synthetic */ C13395r(int i10, String str, String str2, String str3, String str4) {
        if (15 != (i10 & 15)) {
            AbstractC11153a0.m12389l(i10, 15, C13393p.f42441a.getDescriptor());
            throw null;
        }
        this.f42442a = str;
        this.f42443b = str2;
        this.f42444c = str3;
        this.f42445d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13395r)) {
            return false;
        }
        C13395r c13395r = (C13395r) obj;
        return AbstractC16544l.m18089b(this.f42442a, c13395r.f42442a) && AbstractC16544l.m18089b(this.f42443b, c13395r.f42443b) && AbstractC16544l.m18089b(this.f42444c, c13395r.f42444c) && AbstractC16544l.m18089b(this.f42445d, c13395r.f42445d);
    }

    public final int hashCode() {
        int iHashCode = this.f42442a.hashCode() * 31;
        String str = this.f42443b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f42444c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f42445d;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return "█";
    }
}
