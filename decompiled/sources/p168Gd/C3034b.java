package p168Gd;

import kotlin.jvm.internal.AbstractC16544l;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Gd.b */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g(with = C3036d.class)
public final class C3034b {
    public static final C3033a Companion = new C3033a();

    /* JADX INFO: renamed from: a */
    public final String f9128a;

    /* JADX INFO: renamed from: b */
    public final String f9129b;

    /* JADX INFO: renamed from: c */
    public final Integer f9130c;

    public C3034b(String id2, Integer num, String str) {
        AbstractC16544l.m18094g(id2, "id");
        this.f9128a = id2;
        this.f9129b = str;
        this.f9130c = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3034b)) {
            return false;
        }
        C3034b c3034b = (C3034b) obj;
        return AbstractC16544l.m18089b(this.f9128a, c3034b.f9128a) && AbstractC16544l.m18089b(this.f9129b, c3034b.f9129b) && AbstractC16544l.m18089b(this.f9130c, c3034b.f9130c);
    }

    public final int hashCode() {
        int iHashCode = this.f9128a.hashCode() * 31;
        String str = this.f9129b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.f9130c;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "█";
    }
}
