package p040Bd;

import kotlin.jvm.internal.AbstractC16544l;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Bd.s1 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C1162s1 {
    public static final C1156r1 Companion = new C1156r1();

    /* JADX INFO: renamed from: a */
    public final C1147p4 f3085a;

    /* JADX INFO: renamed from: b */
    public final C1147p4 f3086b;

    /* JADX INFO: renamed from: c */
    public final C1147p4 f3087c;

    public /* synthetic */ C1162s1(int i10, C1147p4 c1147p4, C1147p4 c1147p5, C1147p4 c1147p6) {
        if ((i10 & 1) == 0) {
            this.f3085a = null;
        } else {
            this.f3085a = c1147p4;
        }
        if ((i10 & 2) == 0) {
            this.f3086b = null;
        } else {
            this.f3086b = c1147p5;
        }
        if ((i10 & 4) == 0) {
            this.f3087c = null;
        } else {
            this.f3087c = c1147p6;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1162s1)) {
            return false;
        }
        C1162s1 c1162s1 = (C1162s1) obj;
        return AbstractC16544l.m18089b(this.f3085a, c1162s1.f3085a) && AbstractC16544l.m18089b(this.f3086b, c1162s1.f3086b) && AbstractC16544l.m18089b(this.f3087c, c1162s1.f3087c);
    }

    public final int hashCode() {
        C1147p4 c1147p4 = this.f3085a;
        int iHashCode = (c1147p4 == null ? 0 : c1147p4.hashCode()) * 31;
        C1147p4 c1147p5 = this.f3086b;
        int iHashCode2 = (iHashCode + (c1147p5 == null ? 0 : c1147p5.hashCode())) * 31;
        C1147p4 c1147p6 = this.f3087c;
        return iHashCode2 + (c1147p6 != null ? c1147p6.hashCode() : 0);
    }

    public final String toString() {
        return "█";
    }
}
