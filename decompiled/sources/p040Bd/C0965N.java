package p040Bd;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p324Mn.C5551u;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Bd.N */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C0965N {
    public static final C0959M Companion = new C0959M();

    /* JADX INFO: renamed from: a */
    public final String f2738a;

    /* JADX INFO: renamed from: b */
    public final String f2739b;

    /* JADX INFO: renamed from: c */
    public final String f2740c;

    /* JADX INFO: renamed from: d */
    public final C5551u f2741d;

    public /* synthetic */ C0965N(int i10, String str, String str2, String str3, C5551u c5551u) {
        if (15 != (i10 & 15)) {
            AbstractC11153a0.m12389l(i10, 15, C0953L.f2712a.getDescriptor());
            throw null;
        }
        this.f2738a = str;
        this.f2739b = str2;
        this.f2740c = str3;
        this.f2741d = c5551u;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0965N)) {
            return false;
        }
        C0965N c0965n = (C0965N) obj;
        return AbstractC16544l.m18089b(this.f2738a, c0965n.f2738a) && AbstractC16544l.m18089b(this.f2739b, c0965n.f2739b) && AbstractC16544l.m18089b(this.f2740c, c0965n.f2740c) && AbstractC16544l.m18089b(this.f2741d, c0965n.f2741d);
    }

    public final int hashCode() {
        return this.f2741d.f18004Y.hashCode() + AbstractC0168G.m527p(AbstractC0168G.m527p(this.f2738a.hashCode() * 31, 31, this.f2739b), 31, this.f2740c);
    }

    public final String toString() {
        return "█";
    }
}
