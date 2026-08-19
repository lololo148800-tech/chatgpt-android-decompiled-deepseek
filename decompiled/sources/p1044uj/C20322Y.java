package p1044uj;

import android.gov.nist.core.Separators;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.PendingPageTextPosition;
import com.withpersona.sdk2.inquiry.network.dto.styling.StepStyles;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: uj.Y */
/* JADX INFO: loaded from: classes3.dex */
public final class C20322Y extends AbstractC20358r {

    /* JADX INFO: renamed from: b */
    public final String f64232b;

    /* JADX INFO: renamed from: c */
    public final String f64233c;

    /* JADX INFO: renamed from: d */
    public final C20347l0 f64234d;

    /* JADX INFO: renamed from: e */
    public final StepStyles.DocumentStepStyle f64235e;

    /* JADX INFO: renamed from: f */
    public final NextStep.Document.AssetConfig.PendingPage f64236f;

    /* JADX INFO: renamed from: g */
    public final PendingPageTextPosition f64237g;

    public C20322Y(String str, String str2, C20347l0 c20347l0, StepStyles.DocumentStepStyle documentStepStyle, NextStep.Document.AssetConfig.PendingPage pendingPage, PendingPageTextPosition pendingPageTextVerticalPosition) {
        AbstractC16544l.m18094g(pendingPageTextVerticalPosition, "pendingPageTextVerticalPosition");
        this.f64232b = str;
        this.f64233c = str2;
        this.f64234d = c20347l0;
        this.f64235e = documentStepStyle;
        this.f64236f = pendingPage;
        this.f64237g = pendingPageTextVerticalPosition;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20322Y)) {
            return false;
        }
        C20322Y c20322y = (C20322Y) obj;
        return AbstractC16544l.m18089b(this.f64232b, c20322y.f64232b) && AbstractC16544l.m18089b(this.f64233c, c20322y.f64233c) && this.f64234d.equals(c20322y.f64234d) && AbstractC16544l.m18089b(this.f64235e, c20322y.f64235e) && AbstractC16544l.m18089b(this.f64236f, c20322y.f64236f) && this.f64237g == c20322y.f64237g;
    }

    public final int hashCode() {
        String str = this.f64232b;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f64233c;
        int iHashCode2 = (this.f64234d.hashCode() + ((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        StepStyles.DocumentStepStyle documentStepStyle = this.f64235e;
        int iHashCode3 = (iHashCode2 + (documentStepStyle == null ? 0 : documentStepStyle.hashCode())) * 31;
        NextStep.Document.AssetConfig.PendingPage pendingPage = this.f64236f;
        return this.f64237g.hashCode() + ((iHashCode3 + (pendingPage != null ? pendingPage.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "LoadingAnimation(title=" + this.f64232b + ", prompt=" + this.f64233c + ", onCancel=" + this.f64234d + ", styles=" + this.f64235e + ", assetConfig=" + this.f64236f + ", pendingPageTextVerticalPosition=" + this.f64237g + Separators.RPAREN;
    }
}
