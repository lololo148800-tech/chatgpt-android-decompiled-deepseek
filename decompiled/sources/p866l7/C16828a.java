package p866l7;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import com.openai.feature.onboarding.p683mU.YladLSetV;
import p001A.AbstractC0010F;
import p775h2.AbstractC14376f;

/* JADX INFO: renamed from: l7.a */
/* JADX INFO: loaded from: classes.dex */
public final class C16828a {

    /* JADX INFO: renamed from: a */
    public final int f54000a;

    /* JADX INFO: renamed from: b */
    public final int f54001b;

    /* JADX INFO: renamed from: c */
    public final long f54002c;

    /* JADX INFO: renamed from: d */
    public final long f54003d;

    /* JADX INFO: renamed from: e */
    public final long f54004e;

    public C16828a(int i10, int i11) {
        AbstractC14376f.m15825D(i10, "frequency");
        this.f54000a = i10;
        this.f54001b = i11;
        long jM15853s = AbstractC14376f.m15853s(i10);
        this.f54002c = jM15853s;
        this.f54003d = ((long) 10) * jM15853s;
        this.f54004e = ((long) 5) * jM15853s;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16828a)) {
            return false;
        }
        C16828a c16828a = (C16828a) obj;
        return this.f54000a == c16828a.f54000a && this.f54001b == c16828a.f54001b;
    }

    public final int hashCode() {
        return (AbstractC0010F.m24h(this.f54000a) * 31) + this.f54001b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(YladLSetV.ahqfH);
        sb2.append(AbstractC14376f.m15832K(this.f54000a));
        sb2.append(", maxBatchesPerUploadJob=");
        return AbstractC10763a.m11056n(sb2, this.f54001b, Separators.RPAREN);
    }
}
