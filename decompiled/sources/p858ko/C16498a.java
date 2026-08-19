package p858ko;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import p001A.AbstractC0010F;
import p049Bm.InterfaceC1436k;
import p759g1.C13800b;

/* JADX INFO: renamed from: ko.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C16498a {

    /* JADX INFO: renamed from: a */
    public final long f51179a;

    /* JADX INFO: renamed from: b */
    public final long f51180b;

    public C16498a(long j10, long j11) {
        this.f51179a = j10;
        this.f51180b = j11;
    }

    /* JADX INFO: renamed from: a */
    public final C16498a m18062a(InterfaceC1436k interfaceC1436k) {
        long j10 = this.f51180b;
        long j11 = this.f51179a;
        return new C16498a(j11, C13800b.m15310k(((C13800b) interfaceC1436k.invoke(new C13800b(C13800b.m15311l(j11, j10)))).f43584a, j11));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16498a)) {
            return false;
        }
        C16498a c16498a = (C16498a) obj;
        return C13800b.m15303d(this.f51179a, c16498a.f51179a) && C13800b.m15303d(this.f51180b, c16498a.f51180b);
    }

    public final int hashCode() {
        return C13800b.m15308i(this.f51180b) + (C13800b.m15308i(this.f51179a) * 31);
    }

    public final String toString() {
        return AbstractC0010F.m20d("ContentOffset(baseOffset=", C13800b.m15313n(this.f51179a), ", userOffset=", AbstractC10763a.m11054l("UserOffset(value=", C13800b.m15313n(this.f51180b), Separators.RPAREN), Separators.RPAREN);
    }
}
