package p1008s8;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: s8.e */
/* JADX INFO: loaded from: classes.dex */
public final class C19476e {

    /* JADX INFO: renamed from: a */
    public final String f61870a;

    /* JADX INFO: renamed from: b */
    public final String f61871b;

    /* JADX INFO: renamed from: c */
    public final String f61872c;

    public C19476e(String str, String str2, String str3) {
        this.f61870a = str;
        this.f61871b = str2;
        this.f61872c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19476e)) {
            return false;
        }
        C19476e c19476e = (C19476e) obj;
        return AbstractC16544l.m18089b(this.f61870a, c19476e.f61870a) && AbstractC16544l.m18089b(this.f61871b, c19476e.f61871b) && AbstractC16544l.m18089b(this.f61872c, c19476e.f61872c);
    }

    public final int hashCode() {
        String str = this.f61870a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f61871b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f61872c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Os(build=");
        sb2.append(this.f61870a);
        sb2.append(", name=");
        sb2.append(this.f61871b);
        sb2.append(", version=");
        return AbstractC9306j0.m9891j(this.f61872c, Separators.RPAREN, sb2);
    }
}
