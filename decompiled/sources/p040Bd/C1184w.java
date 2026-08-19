package p040Bd;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Bd.w */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C1184w {
    public static final C1178v Companion = new C1178v();

    /* JADX INFO: renamed from: a */
    public final String f3131a;

    /* JADX INFO: renamed from: b */
    public final String f3132b;

    /* JADX INFO: renamed from: c */
    public final String f3133c;

    /* JADX INFO: renamed from: d */
    public final String f3134d;

    public /* synthetic */ C1184w(int i10, String str, String str2, String str3, String str4) {
        if (15 != (i10 & 15)) {
            AbstractC11153a0.m12389l(i10, 15, C1172u.f3121a.getDescriptor());
            throw null;
        }
        this.f3131a = str;
        this.f3132b = str2;
        this.f3133c = str3;
        this.f3134d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1184w)) {
            return false;
        }
        C1184w c1184w = (C1184w) obj;
        return AbstractC16544l.m18089b(this.f3131a, c1184w.f3131a) && AbstractC16544l.m18089b(this.f3132b, c1184w.f3132b) && AbstractC16544l.m18089b(this.f3133c, c1184w.f3133c) && AbstractC16544l.m18089b(this.f3134d, c1184w.f3134d);
    }

    public final int hashCode() {
        return this.f3134d.hashCode() + AbstractC0168G.m527p(AbstractC0168G.m527p(this.f3131a.hashCode() * 31, 31, this.f3132b), 31, this.f3133c);
    }

    public final String toString() {
        return "█";
    }
}
