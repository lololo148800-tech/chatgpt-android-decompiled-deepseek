package p994rk;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: rk.o0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C19199o0 {

    /* JADX INFO: renamed from: a */
    public final String f60923a;

    /* JADX INFO: renamed from: b */
    public final String f60924b;

    public C19199o0(String str, String str2) {
        this.f60923a = str;
        this.f60924b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19199o0)) {
            return false;
        }
        C19199o0 c19199o0 = (C19199o0) obj;
        return AbstractC16544l.m18089b(this.f60923a, c19199o0.f60923a) && AbstractC16544l.m18089b(this.f60924b, c19199o0.f60924b);
    }

    public final int hashCode() {
        return this.f60924b.hashCode() + (this.f60923a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IdOption(idType=");
        sb2.append(this.f60923a);
        sb2.append(", name=");
        return AbstractC9306j0.m9891j(this.f60924b, Separators.RPAREN, sb2);
    }
}
