package p557Wl;

import com.google.android.datatransport.cct.NwaZ.lZYtIbClQJm;
import kotlin.jvm.internal.AbstractC16544l;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: Wl.l */
/* JADX INFO: loaded from: classes3.dex */
public final class C8956l {

    /* JADX INFO: renamed from: a */
    public final long f27380a;

    /* JADX INFO: renamed from: b */
    public final String f27381b;

    public C8956l(long j10, String config) {
        AbstractC16544l.m18094g(config, "config");
        this.f27380a = j10;
        this.f27381b = config;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8956l)) {
            return false;
        }
        C8956l c8956l = (C8956l) obj;
        return this.f27380a == c8956l.f27380a && AbstractC16544l.m18089b(this.f27381b, c8956l.f27381b);
    }

    public final int hashCode() {
        long j10 = this.f27380a;
        return this.f27381b.hashCode() + (((int) (j10 ^ (j10 >>> 32))) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SdpFmtp(payload=");
        sb2.append(this.f27380a);
        sb2.append(lZYtIbClQJm.QvzUgXQODZX);
        return AbstractC9306j0.m9892k(sb2, this.f27381b, ')');
    }
}
