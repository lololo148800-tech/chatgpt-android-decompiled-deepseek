package p172Gi;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Gi.g */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C3074g {
    public static final C3073f Companion = new C3073f();

    /* JADX INFO: renamed from: a */
    public final String f9273a;

    /* JADX INFO: renamed from: b */
    public final String f9274b;

    /* JADX INFO: renamed from: c */
    public final String f9275c;

    /* JADX INFO: renamed from: d */
    public final C3092y f9276d;

    public /* synthetic */ C3074g(int i10, String str, String str2, String str3, C3092y c3092y) {
        if (15 != (i10 & 15)) {
            AbstractC11153a0.m12389l(i10, 15, C3072e.f9272a.getDescriptor());
            throw null;
        }
        this.f9273a = str;
        this.f9274b = str2;
        this.f9275c = str3;
        this.f9276d = c3092y;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3074g)) {
            return false;
        }
        C3074g c3074g = (C3074g) obj;
        return AbstractC16544l.m18089b(this.f9273a, c3074g.f9273a) && AbstractC16544l.m18089b(this.f9274b, c3074g.f9274b) && AbstractC16544l.m18089b(this.f9275c, c3074g.f9275c) && AbstractC16544l.m18089b(this.f9276d, c3074g.f9276d);
    }

    public final int hashCode() {
        int iM527p = AbstractC0168G.m527p(this.f9273a.hashCode() * 31, 31, this.f9274b);
        String str = this.f9275c;
        return this.f9276d.hashCode() + ((iM527p + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "█";
    }
}
