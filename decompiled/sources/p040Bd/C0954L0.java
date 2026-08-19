package p040Bd;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Bd.L0 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C0954L0 {
    public static final C0948K0 Companion = new C0948K0();

    /* JADX INFO: renamed from: a */
    public final String f2713a;

    /* JADX INFO: renamed from: b */
    public final String f2714b;

    /* JADX INFO: renamed from: c */
    public final String f2715c;

    /* JADX INFO: renamed from: d */
    public final String f2716d;

    public /* synthetic */ C0954L0(int i10, String str, String str2, String str3, String str4) {
        if (7 != (i10 & 7)) {
            AbstractC11153a0.m12389l(i10, 7, C0942J0.f2706a.getDescriptor());
            throw null;
        }
        this.f2713a = str;
        this.f2714b = str2;
        this.f2715c = str3;
        if ((i10 & 8) == 0) {
            this.f2716d = null;
        } else {
            this.f2716d = str4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0954L0)) {
            return false;
        }
        C0954L0 c0954l0 = (C0954L0) obj;
        return AbstractC16544l.m18089b(this.f2713a, c0954l0.f2713a) && AbstractC16544l.m18089b(this.f2714b, c0954l0.f2714b) && AbstractC16544l.m18089b(this.f2715c, c0954l0.f2715c) && AbstractC16544l.m18089b(this.f2716d, c0954l0.f2716d);
    }

    public final int hashCode() {
        int iM527p = AbstractC0168G.m527p(AbstractC0168G.m527p(this.f2713a.hashCode() * 31, 31, this.f2714b), 31, this.f2715c);
        String str = this.f2716d;
        return iM527p + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "█";
    }
}
