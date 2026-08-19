package p839jk;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.gov.nist.javax.sdp.fields.SDPKeywords;
import kotlin.jvm.internal.AbstractC16544l;
import p025An.C0644w;
import p544W9.AbstractC8548R3;
import p544W9.AbstractC8554S3;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: jk.w */
/* JADX INFO: loaded from: classes3.dex */
public final class C16266w extends AbstractC8548R3 {

    /* JADX INFO: renamed from: a */
    public final String f50395a;

    /* JADX INFO: renamed from: b */
    public final AbstractC8554S3 f50396b;

    public C16266w(String stepName, AbstractC8554S3 subPage) {
        AbstractC16544l.m18094g(stepName, "stepName");
        AbstractC16544l.m18094g(subPage, "subPage");
        this.f50395a = stepName;
        this.f50396b = subPage;
    }

    @Override // p544W9.AbstractC8548R3
    /* JADX INFO: renamed from: b */
    public final String mo9209b() {
        return this.f50395a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16266w)) {
            return false;
        }
        C16266w c16266w = (C16266w) obj;
        return AbstractC16544l.m18089b(this.f50395a, c16266w.f50395a) && AbstractC16544l.m18089b(this.f50396b, c16266w.f50396b);
    }

    public final int hashCode() {
        return this.f50396b.hashCode() + (this.f50395a.hashCode() * 31);
    }

    public final String toString() {
        String strM11052j;
        C16269z c16269z = C16269z.f50399a;
        AbstractC8554S3 abstractC8554S3 = this.f50396b;
        if (AbstractC16544l.m18089b(abstractC8554S3, c16269z)) {
            strM11052j = "finalize-video";
        } else if (AbstractC16544l.m18089b(abstractC8554S3, C16241B.f50366a)) {
            strM11052j = "pending";
        } else if (AbstractC16544l.m18089b(abstractC8554S3, C16242C.f50367a)) {
            strM11052j = SDPKeywords.PROMPT;
        } else if (abstractC8554S3 instanceof C16240A) {
            strM11052j = AbstractC10763a.m11052j(((C16240A) abstractC8554S3).f50365a, "/capture-lead-in-animation");
        } else {
            if (!(abstractC8554S3 instanceof C16243D)) {
                throw new C0644w();
            }
            strM11052j = AbstractC10763a.m11052j(((C16243D) abstractC8554S3).f50368a, "/capture");
        }
        return AbstractC9306j0.m9889h("/inquiry/selfie/", strM11052j);
    }
}
