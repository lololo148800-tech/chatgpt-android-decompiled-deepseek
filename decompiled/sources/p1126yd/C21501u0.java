package p1126yd;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: yd.u0 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C21501u0 {
    public static final C21499t0 Companion = new C21499t0();

    /* JADX INFO: renamed from: a */
    public final String f68118a;

    /* JADX INFO: renamed from: b */
    public final int f68119b;

    /* JADX INFO: renamed from: c */
    public final String f68120c;

    /* JADX INFO: renamed from: d */
    public final String f68121d;

    /* JADX INFO: renamed from: e */
    public final String f68122e;

    public /* synthetic */ C21501u0(int i10, String str, int i11, String str2, String str3, String str4) {
        if (31 != (i10 & 31)) {
            AbstractC11153a0.m12389l(i10, 31, C21497s0.f68111a.getDescriptor());
            throw null;
        }
        this.f68118a = str;
        this.f68119b = i11;
        this.f68120c = str2;
        this.f68121d = str3;
        this.f68122e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21501u0)) {
            return false;
        }
        C21501u0 c21501u0 = (C21501u0) obj;
        return AbstractC16544l.m18089b(this.f68118a, c21501u0.f68118a) && this.f68119b == c21501u0.f68119b && AbstractC16544l.m18089b(this.f68120c, c21501u0.f68120c) && AbstractC16544l.m18089b(this.f68121d, c21501u0.f68121d) && AbstractC16544l.m18089b(this.f68122e, c21501u0.f68122e);
    }

    public final int hashCode() {
        return this.f68122e.hashCode() + AbstractC0168G.m527p(AbstractC0168G.m527p(((this.f68118a.hashCode() * 31) + this.f68119b) * 31, 31, this.f68120c), 31, this.f68121d);
    }

    public final String toString() {
        return "█";
    }
}
