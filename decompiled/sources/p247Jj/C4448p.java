package p247Jj;

import android.gov.nist.core.Separators;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: Jj.p */
/* JADX INFO: loaded from: classes3.dex */
public final class C4448p extends AbstractC4450q {

    /* JADX INFO: renamed from: a */
    public final String f14484a;

    /* JADX INFO: renamed from: b */
    public final NextStep f14485b;

    public C4448p(String inquiryId, NextStep nextStep) {
        AbstractC16544l.m18094g(inquiryId, "inquiryId");
        AbstractC16544l.m18094g(nextStep, "nextStep");
        this.f14484a = inquiryId;
        this.f14485b = nextStep;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4448p)) {
            return false;
        }
        C4448p c4448p = (C4448p) obj;
        return AbstractC16544l.m18089b(this.f14484a, c4448p.f14484a) && AbstractC16544l.m18089b(this.f14485b, c4448p.f14485b);
    }

    public final int hashCode() {
        return this.f14485b.hashCode() + (this.f14484a.hashCode() * 31);
    }

    public final String toString() {
        return "Success(inquiryId=" + this.f14484a + ", nextStep=" + this.f14485b + Separators.RPAREN;
    }
}
