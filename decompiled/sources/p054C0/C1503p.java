package p054C0;

import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p228J.AbstractC3794B0;

/* JADX INFO: renamed from: C0.p */
/* JADX INFO: loaded from: classes.dex */
public final class C1503p {

    /* JADX INFO: renamed from: a */
    public final String f4002a;

    /* JADX INFO: renamed from: b */
    public String f4003b;

    /* JADX INFO: renamed from: c */
    public boolean f4004c = false;

    /* JADX INFO: renamed from: d */
    public C1492e f4005d = null;

    public C1503p(String str, String str2) {
        this.f4002a = str;
        this.f4003b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1503p)) {
            return false;
        }
        C1503p c1503p = (C1503p) obj;
        return AbstractC16544l.m18089b(this.f4002a, c1503p.f4002a) && AbstractC16544l.m18089b(this.f4003b, c1503p.f4003b) && this.f4004c == c1503p.f4004c && AbstractC16544l.m18089b(this.f4005d, c1503p.f4005d);
    }

    public final int hashCode() {
        int iM527p = (AbstractC0168G.m527p(this.f4002a.hashCode() * 31, 31, this.f4003b) + (this.f4004c ? 1231 : 1237)) * 31;
        C1492e c1492e = this.f4005d;
        return iM527p + (c1492e == null ? 0 : c1492e.hashCode());
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TextSubstitution(layoutCache=");
        sb2.append(this.f4005d);
        sb2.append(", isShowingSubstitution=");
        return AbstractC3794B0.m4499x(sb2, this.f4004c, ')');
    }
}
