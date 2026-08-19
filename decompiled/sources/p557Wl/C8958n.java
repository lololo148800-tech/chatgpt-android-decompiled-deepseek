package p557Wl;

import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: Wl.n */
/* JADX INFO: loaded from: classes3.dex */
public final class C8958n {

    /* JADX INFO: renamed from: a */
    public final long f27383a;

    /* JADX INFO: renamed from: b */
    public final String f27384b;

    /* JADX INFO: renamed from: c */
    public final Long f27385c;

    /* JADX INFO: renamed from: d */
    public final String f27386d;

    public C8958n(long j10, String codec, Long l4, String str) {
        AbstractC16544l.m18094g(codec, "codec");
        this.f27383a = j10;
        this.f27384b = codec;
        this.f27385c = l4;
        this.f27386d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8958n)) {
            return false;
        }
        C8958n c8958n = (C8958n) obj;
        return this.f27383a == c8958n.f27383a && AbstractC16544l.m18089b(this.f27384b, c8958n.f27384b) && AbstractC16544l.m18089b(this.f27385c, c8958n.f27385c) && AbstractC16544l.m18089b(this.f27386d, c8958n.f27386d);
    }

    public final int hashCode() {
        long j10 = this.f27383a;
        int iM527p = AbstractC0168G.m527p(((int) (j10 ^ (j10 >>> 32))) * 31, 31, this.f27384b);
        Long l4 = this.f27385c;
        int iHashCode = (iM527p + (l4 == null ? 0 : l4.hashCode())) * 31;
        String str = this.f27386d;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SdpRtp(payload=");
        sb2.append(this.f27383a);
        sb2.append(", codec=");
        sb2.append(this.f27384b);
        sb2.append(", rate=");
        sb2.append(this.f27385c);
        sb2.append(", encoding=");
        return AbstractC9306j0.m9892k(sb2, this.f27386d, ')');
    }
}
