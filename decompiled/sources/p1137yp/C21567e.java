package p1137yp;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: yp.e */
/* JADX INFO: loaded from: classes2.dex */
public final class C21567e {

    /* JADX INFO: renamed from: a */
    public final String f68294a;

    /* JADX INFO: renamed from: b */
    public final String f68295b;

    /* JADX INFO: renamed from: c */
    public final String f68296c;

    public C21567e(String str, String str2, String str3) {
        this.f68294a = str;
        this.f68295b = str2;
        this.f68296c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21567e)) {
            return false;
        }
        C21567e c21567e = (C21567e) obj;
        return AbstractC16544l.m18089b(this.f68294a, c21567e.f68294a) && AbstractC16544l.m18089b(this.f68295b, c21567e.f68295b) && AbstractC16544l.m18089b(this.f68296c, c21567e.f68296c);
    }

    public final int hashCode() {
        return this.f68296c.hashCode() + AbstractC0168G.m527p(this.f68294a.hashCode() * 31, 31, this.f68295b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ReplaceData(replaceCandidate=");
        sb2.append(this.f68294a);
        sb2.append(", oldString=");
        sb2.append(this.f68295b);
        sb2.append(", newString=");
        return AbstractC9306j0.m9891j(this.f68296c, Separators.RPAREN, sb2);
    }
}
