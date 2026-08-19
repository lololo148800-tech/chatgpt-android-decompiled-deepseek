package p040Bd;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p324Mn.C5551u;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Bd.F0 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C0918F0 {
    public static final C0912E0 Companion = new C0912E0();

    /* JADX INFO: renamed from: a */
    public final String f2649a;

    /* JADX INFO: renamed from: b */
    public final String f2650b;

    /* JADX INFO: renamed from: c */
    public final String f2651c;

    /* JADX INFO: renamed from: d */
    public final String f2652d;

    /* JADX INFO: renamed from: e */
    public final C5551u f2653e;

    public /* synthetic */ C0918F0(int i10, C5551u c5551u, String str, String str2, String str3, String str4) {
        if (3 != (i10 & 3)) {
            AbstractC11153a0.m12389l(i10, 3, C0906D0.f2639a.getDescriptor());
            throw null;
        }
        this.f2649a = str;
        this.f2650b = str2;
        if ((i10 & 4) == 0) {
            this.f2651c = null;
        } else {
            this.f2651c = str3;
        }
        if ((i10 & 8) == 0) {
            this.f2652d = null;
        } else {
            this.f2652d = str4;
        }
        if ((i10 & 16) == 0) {
            this.f2653e = null;
        } else {
            this.f2653e = c5551u;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0918F0)) {
            return false;
        }
        C0918F0 c0918f0 = (C0918F0) obj;
        return AbstractC16544l.m18089b(this.f2649a, c0918f0.f2649a) && AbstractC16544l.m18089b(this.f2650b, c0918f0.f2650b) && AbstractC16544l.m18089b(this.f2651c, c0918f0.f2651c) && AbstractC16544l.m18089b(this.f2652d, c0918f0.f2652d) && AbstractC16544l.m18089b(this.f2653e, c0918f0.f2653e);
    }

    public final int hashCode() {
        int iM527p = AbstractC0168G.m527p(this.f2649a.hashCode() * 31, 31, this.f2650b);
        String str = this.f2651c;
        int iHashCode = (iM527p + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f2652d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        C5551u c5551u = this.f2653e;
        return iHashCode2 + (c5551u != null ? c5551u.f18004Y.hashCode() : 0);
    }

    public final String toString() {
        return "█";
    }
}
