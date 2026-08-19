package p919o8;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import p001A.AbstractC0010F;
import p003A1.AbstractC0168G;
import p775h2.AbstractC14376f;

/* JADX INFO: renamed from: o8.f0 */
/* JADX INFO: loaded from: classes.dex */
public final class C17969f0 {

    /* JADX INFO: renamed from: a */
    public final int f57351a;

    /* JADX INFO: renamed from: b */
    public final long f57352b;

    /* JADX INFO: renamed from: c */
    public final String f57353c;

    /* JADX INFO: renamed from: d */
    public final C17966e0 f57354d;

    public C17969f0(int i10, long j10, String str, C17966e0 c17966e0) {
        AbstractC14376f.m15825D(i10, "method");
        this.f57351a = i10;
        this.f57352b = j10;
        this.f57353c = str;
        this.f57354d = c17966e0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17969f0)) {
            return false;
        }
        C17969f0 c17969f0 = (C17969f0) obj;
        return this.f57351a == c17969f0.f57351a && this.f57352b == c17969f0.f57352b && this.f57353c.equals(c17969f0.f57353c) && AbstractC16544l.m18089b(this.f57354d, c17969f0.f57354d);
    }

    public final int hashCode() {
        int iM24h = AbstractC0010F.m24h(this.f57351a) * 31;
        long j10 = this.f57352b;
        int iM527p = AbstractC0168G.m527p((iM24h + ((int) (j10 ^ (j10 >>> 32)))) * 31, 31, this.f57353c);
        C17966e0 c17966e0 = this.f57354d;
        return iM527p + (c17966e0 == null ? 0 : c17966e0.hashCode());
    }

    public final String toString() {
        return "Resource(method=" + AbstractC17962d.m19618I(this.f57351a) + ", statusCode=" + this.f57352b + ", url=" + this.f57353c + ", provider=" + this.f57354d + Separators.RPAREN;
    }
}
