package p040Bd;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import p324Mn.C5551u;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Bd.L4 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C0958L4 {
    public static final C0952K4 Companion = new C0952K4();

    /* JADX INFO: renamed from: a */
    public final C5551u f2720a;

    /* JADX INFO: renamed from: b */
    public final String f2721b;

    /* JADX INFO: renamed from: c */
    public final boolean f2722c;

    /* JADX INFO: renamed from: d */
    public final C0976O4 f2723d;

    /* JADX INFO: renamed from: e */
    public final C0976O4 f2724e;

    public /* synthetic */ C0958L4(int i10, C5551u c5551u, String str, boolean z6, C0976O4 c0976o4, C0976O4 c0976o5) {
        if (25 != (i10 & 25)) {
            AbstractC11153a0.m12389l(i10, 25, C0946J4.f2710a.getDescriptor());
            throw null;
        }
        this.f2720a = c5551u;
        if ((i10 & 2) == 0) {
            this.f2721b = null;
        } else {
            this.f2721b = str;
        }
        if ((i10 & 4) == 0) {
            this.f2722c = false;
        } else {
            this.f2722c = z6;
        }
        this.f2723d = c0976o4;
        this.f2724e = c0976o5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0958L4)) {
            return false;
        }
        C0958L4 c0958l4 = (C0958L4) obj;
        return AbstractC16544l.m18089b(this.f2720a, c0958l4.f2720a) && AbstractC16544l.m18089b(this.f2721b, c0958l4.f2721b) && this.f2722c == c0958l4.f2722c && AbstractC16544l.m18089b(this.f2723d, c0958l4.f2723d) && AbstractC16544l.m18089b(this.f2724e, c0958l4.f2724e);
    }

    public final int hashCode() {
        int iHashCode = this.f2720a.f18004Y.hashCode() * 31;
        String str = this.f2721b;
        return this.f2724e.hashCode() + ((this.f2723d.hashCode() + ((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + (this.f2722c ? 1231 : 1237)) * 31)) * 31);
    }

    public final String toString() {
        return "█";
    }
}
