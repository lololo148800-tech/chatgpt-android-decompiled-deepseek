package p247Jj;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import lk.C17062e;

/* JADX INFO: renamed from: Jj.j */
/* JADX INFO: loaded from: classes3.dex */
public final class C4436j extends AbstractC4438k {

    /* JADX INFO: renamed from: a */
    public final String f14445a;

    /* JADX INFO: renamed from: b */
    public final C17062e f14446b;

    public C4436j(String sessionToken, C17062e inquirySessionConfig) {
        AbstractC16544l.m18094g(sessionToken, "sessionToken");
        AbstractC16544l.m18094g(inquirySessionConfig, "inquirySessionConfig");
        this.f14445a = sessionToken;
        this.f14446b = inquirySessionConfig;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4436j)) {
            return false;
        }
        C4436j c4436j = (C4436j) obj;
        return AbstractC16544l.m18089b(this.f14445a, c4436j.f14445a) && AbstractC16544l.m18089b(this.f14446b, c4436j.f14446b);
    }

    public final int hashCode() {
        return this.f14446b.hashCode() + (this.f14445a.hashCode() * 31);
    }

    public final String toString() {
        return "Success(sessionToken=" + this.f14445a + ", inquirySessionConfig=" + this.f14446b + Separators.RPAREN;
    }
}
