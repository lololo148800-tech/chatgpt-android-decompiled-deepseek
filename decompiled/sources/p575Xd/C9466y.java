package p575Xd;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Xd.y */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C9466y {
    public static final C9465x Companion = new C9465x();

    /* JADX INFO: renamed from: a */
    public final String f28487a;

    /* JADX INFO: renamed from: b */
    public final String f28488b;

    /* JADX INFO: renamed from: c */
    public final String f28489c;

    /* JADX INFO: renamed from: d */
    public final String f28490d;

    public C9466y(int i10, String str, String str2, String str3, String str4) {
        if (15 != (i10 & 15)) {
            AbstractC11153a0.m12389l(i10, 15, C9464w.f28486a.getDescriptor());
            throw null;
        }
        this.f28487a = str;
        this.f28488b = str2;
        this.f28489c = str3;
        this.f28490d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9466y)) {
            return false;
        }
        C9466y c9466y = (C9466y) obj;
        return AbstractC16544l.m18089b(this.f28487a, c9466y.f28487a) && AbstractC16544l.m18089b(this.f28488b, c9466y.f28488b) && AbstractC16544l.m18089b(this.f28489c, c9466y.f28489c) && AbstractC16544l.m18089b(this.f28490d, c9466y.f28490d);
    }

    public final int hashCode() {
        String str = this.f28487a;
        int iM527p = AbstractC0168G.m527p((str == null ? 0 : str.hashCode()) * 31, 31, this.f28488b);
        String str2 = this.f28489c;
        int iHashCode = (iM527p + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f28490d;
        return iHashCode + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return "█";
    }

    public C9466y(String str, String str2, String str3, String str4) {
        this.f28487a = str;
        this.f28488b = str2;
        this.f28489c = str3;
        this.f28490d = str4;
    }
}
