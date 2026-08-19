package p1137yp;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;

/* JADX INFO: renamed from: yp.d */
/* JADX INFO: loaded from: classes2.dex */
public final class C21566d {

    /* JADX INFO: renamed from: a */
    public final String f68291a;

    /* JADX INFO: renamed from: b */
    public final String f68292b;

    /* JADX INFO: renamed from: c */
    public final List f68293c;

    public C21566d(String str, String str2, List list) {
        this.f68291a = str;
        this.f68292b = str2;
        this.f68293c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21566d)) {
            return false;
        }
        C21566d c21566d = (C21566d) obj;
        return AbstractC16544l.m18089b(this.f68291a, c21566d.f68291a) && AbstractC16544l.m18089b(this.f68292b, c21566d.f68292b) && AbstractC16544l.m18089b(this.f68293c, c21566d.f68293c);
    }

    public final int hashCode() {
        return this.f68293c.hashCode() + AbstractC0168G.m527p(this.f68291a.hashCode() * 31, 31, this.f68292b);
    }

    public final String toString() {
        return "MatchArguments(text=" + this.f68291a + ", regexPattern=" + this.f68292b + ", regexOptions=" + this.f68293c + Separators.RPAREN;
    }
}
