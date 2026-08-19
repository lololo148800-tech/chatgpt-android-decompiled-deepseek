package p040Bd;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Bd.c1 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C1058c1 {
    public static final C1051b1 Companion = new C1051b1();

    /* JADX INFO: renamed from: a */
    public final String f2892a;

    /* JADX INFO: renamed from: b */
    public final String f2893b;

    /* JADX INFO: renamed from: c */
    public final C1162s1 f2894c;

    /* JADX INFO: renamed from: d */
    public final String f2895d;

    public /* synthetic */ C1058c1(int i10, String str, String str2, C1162s1 c1162s1, String str3) {
        if (3 != (i10 & 3)) {
            AbstractC11153a0.m12389l(i10, 3, C1044a1.f2869a.getDescriptor());
            throw null;
        }
        this.f2892a = str;
        this.f2893b = str2;
        if ((i10 & 4) == 0) {
            this.f2894c = null;
        } else {
            this.f2894c = c1162s1;
        }
        if ((i10 & 8) == 0) {
            this.f2895d = null;
        } else {
            this.f2895d = str3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1058c1)) {
            return false;
        }
        C1058c1 c1058c1 = (C1058c1) obj;
        return AbstractC16544l.m18089b(this.f2892a, c1058c1.f2892a) && AbstractC16544l.m18089b(this.f2893b, c1058c1.f2893b) && AbstractC16544l.m18089b(this.f2894c, c1058c1.f2894c) && AbstractC16544l.m18089b(this.f2895d, c1058c1.f2895d);
    }

    public final int hashCode() {
        int iM527p = AbstractC0168G.m527p(this.f2892a.hashCode() * 31, 31, this.f2893b);
        C1162s1 c1162s1 = this.f2894c;
        int iHashCode = (iM527p + (c1162s1 == null ? 0 : c1162s1.hashCode())) * 31;
        String str = this.f2895d;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "█";
    }
}
