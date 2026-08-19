package eg;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: eg.f */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C13383f {
    public static final C13382e Companion = new C13382e();

    /* JADX INFO: renamed from: a */
    public final String f42421a;

    /* JADX INFO: renamed from: b */
    public final String f42422b;

    /* JADX INFO: renamed from: c */
    public final String f42423c;

    /* JADX INFO: renamed from: d */
    public final String f42424d;

    public /* synthetic */ C13383f(int i10, String str, String str2, String str3, String str4) {
        if (15 != (i10 & 15)) {
            AbstractC11153a0.m12389l(i10, 15, C13381d.f42420a.getDescriptor());
            throw null;
        }
        this.f42421a = str;
        this.f42422b = str2;
        this.f42423c = str3;
        this.f42424d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13383f)) {
            return false;
        }
        C13383f c13383f = (C13383f) obj;
        return AbstractC16544l.m18089b(this.f42421a, c13383f.f42421a) && AbstractC16544l.m18089b(this.f42422b, c13383f.f42422b) && AbstractC16544l.m18089b(this.f42423c, c13383f.f42423c) && AbstractC16544l.m18089b(this.f42424d, c13383f.f42424d);
    }

    public final int hashCode() {
        int iM527p = AbstractC0168G.m527p(this.f42421a.hashCode() * 31, 31, this.f42422b);
        String str = this.f42423c;
        int iHashCode = (iM527p + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f42424d;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "█";
    }
}
