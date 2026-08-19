package p557Wl;

import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: Wl.k */
/* JADX INFO: loaded from: classes3.dex */
public final class C8955k {

    /* JADX INFO: renamed from: a */
    public final long f27375a;

    /* JADX INFO: renamed from: b */
    public final String f27376b;

    /* JADX INFO: renamed from: c */
    public final String f27377c;

    /* JADX INFO: renamed from: d */
    public final String f27378d;

    /* JADX INFO: renamed from: e */
    public final String f27379e;

    public C8955k(long j10, String str, String str2, String uri, String str3) {
        AbstractC16544l.m18094g(uri, "uri");
        this.f27375a = j10;
        this.f27376b = str;
        this.f27377c = str2;
        this.f27378d = uri;
        this.f27379e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8955k)) {
            return false;
        }
        C8955k c8955k = (C8955k) obj;
        return this.f27375a == c8955k.f27375a && AbstractC16544l.m18089b(this.f27376b, c8955k.f27376b) && AbstractC16544l.m18089b(this.f27377c, c8955k.f27377c) && AbstractC16544l.m18089b(this.f27378d, c8955k.f27378d) && AbstractC16544l.m18089b(this.f27379e, c8955k.f27379e);
    }

    public final int hashCode() {
        long j10 = this.f27375a;
        int i10 = ((int) (j10 ^ (j10 >>> 32))) * 31;
        String str = this.f27376b;
        int iHashCode = (i10 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f27377c;
        int iM527p = AbstractC0168G.m527p((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f27378d);
        String str3 = this.f27379e;
        return iM527p + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SdpExt(value=");
        sb2.append(this.f27375a);
        sb2.append(", direction=");
        sb2.append(this.f27376b);
        sb2.append(", encryptUri=");
        sb2.append(this.f27377c);
        sb2.append(", uri=");
        sb2.append(this.f27378d);
        sb2.append(", config=");
        return AbstractC9306j0.m9892k(sb2, this.f27379e, ')');
    }
}
