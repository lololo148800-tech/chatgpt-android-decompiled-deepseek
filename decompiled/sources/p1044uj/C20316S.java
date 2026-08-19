package p1044uj;

import android.gov.nist.core.Separators;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.PendingPageTextPosition;
import com.withpersona.sdk2.inquiry.network.dto.styling.StepStyles;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;

/* JADX INFO: renamed from: uj.S */
/* JADX INFO: loaded from: classes3.dex */
public final class C20316S {

    /* JADX INFO: renamed from: a */
    public final String f64203a;

    /* JADX INFO: renamed from: b */
    public final String f64204b;

    /* JADX INFO: renamed from: c */
    public final String f64205c;

    /* JADX INFO: renamed from: d */
    public final String f64206d;

    /* JADX INFO: renamed from: e */
    public final String f64207e;

    /* JADX INFO: renamed from: f */
    public final String f64208f;

    /* JADX INFO: renamed from: g */
    public final String f64209g;

    /* JADX INFO: renamed from: h */
    public final String f64210h;

    /* JADX INFO: renamed from: i */
    public final String f64211i;

    /* JADX INFO: renamed from: j */
    public final String f64212j;

    /* JADX INFO: renamed from: k */
    public final String f64213k;

    /* JADX INFO: renamed from: l */
    public final String f64214l;

    /* JADX INFO: renamed from: m */
    public final String f64215m;

    /* JADX INFO: renamed from: n */
    public final EnumC20325a0 f64216n;

    /* JADX INFO: renamed from: o */
    public final C20362t f64217o;

    /* JADX INFO: renamed from: p */
    public final int f64218p;

    /* JADX INFO: renamed from: q */
    public final boolean f64219q;

    /* JADX INFO: renamed from: r */
    public final boolean f64220r;

    /* JADX INFO: renamed from: s */
    public final String f64221s;

    /* JADX INFO: renamed from: t */
    public final String f64222t;

    /* JADX INFO: renamed from: u */
    public final String f64223u;

    /* JADX INFO: renamed from: v */
    public final String f64224v;

    /* JADX INFO: renamed from: w */
    public final StepStyles.DocumentStepStyle f64225w;

    /* JADX INFO: renamed from: x */
    public final NextStep.Document.AssetConfig f64226x;

    /* JADX INFO: renamed from: y */
    public final PendingPageTextPosition f64227y;

    public C20316S(String sessionToken, String inquiryId, String fromStep, String fromComponent, String str, String str2, String str3, String str4, String str5, String str6, String fieldKeyDocument, String kind, String str7, EnumC20325a0 enumC20325a0, C20362t pages, int i10, boolean z6, boolean z10, String str8, String str9, String str10, String str11, StepStyles.DocumentStepStyle documentStepStyle, NextStep.Document.AssetConfig assetConfig, PendingPageTextPosition pendingPageTextVerticalPosition) {
        AbstractC16544l.m18094g(sessionToken, "sessionToken");
        AbstractC16544l.m18094g(inquiryId, "inquiryId");
        AbstractC16544l.m18094g(fromStep, "fromStep");
        AbstractC16544l.m18094g(fromComponent, "fromComponent");
        AbstractC16544l.m18094g(fieldKeyDocument, "fieldKeyDocument");
        AbstractC16544l.m18094g(kind, "kind");
        AbstractC16544l.m18094g(pages, "pages");
        AbstractC16544l.m18094g(pendingPageTextVerticalPosition, "pendingPageTextVerticalPosition");
        this.f64203a = sessionToken;
        this.f64204b = inquiryId;
        this.f64205c = fromStep;
        this.f64206d = fromComponent;
        this.f64207e = str;
        this.f64208f = str2;
        this.f64209g = str3;
        this.f64210h = str4;
        this.f64211i = str5;
        this.f64212j = str6;
        this.f64213k = fieldKeyDocument;
        this.f64214l = kind;
        this.f64215m = str7;
        this.f64216n = enumC20325a0;
        this.f64217o = pages;
        this.f64218p = i10;
        this.f64219q = z6;
        this.f64220r = z10;
        this.f64221s = str8;
        this.f64222t = str9;
        this.f64223u = str10;
        this.f64224v = str11;
        this.f64225w = documentStepStyle;
        this.f64226x = assetConfig;
        this.f64227y = pendingPageTextVerticalPosition;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20316S)) {
            return false;
        }
        C20316S c20316s = (C20316S) obj;
        return AbstractC16544l.m18089b(this.f64203a, c20316s.f64203a) && AbstractC16544l.m18089b(this.f64204b, c20316s.f64204b) && AbstractC16544l.m18089b(this.f64205c, c20316s.f64205c) && AbstractC16544l.m18089b(this.f64206d, c20316s.f64206d) && AbstractC16544l.m18089b(this.f64207e, c20316s.f64207e) && AbstractC16544l.m18089b(this.f64208f, c20316s.f64208f) && AbstractC16544l.m18089b(this.f64209g, c20316s.f64209g) && AbstractC16544l.m18089b(this.f64210h, c20316s.f64210h) && AbstractC16544l.m18089b(this.f64211i, c20316s.f64211i) && AbstractC16544l.m18089b(this.f64212j, c20316s.f64212j) && AbstractC16544l.m18089b(this.f64213k, c20316s.f64213k) && AbstractC16544l.m18089b(this.f64214l, c20316s.f64214l) && AbstractC16544l.m18089b(this.f64215m, c20316s.f64215m) && this.f64216n == c20316s.f64216n && AbstractC16544l.m18089b(this.f64217o, c20316s.f64217o) && this.f64218p == c20316s.f64218p && this.f64219q == c20316s.f64219q && this.f64220r == c20316s.f64220r && AbstractC16544l.m18089b(this.f64221s, c20316s.f64221s) && AbstractC16544l.m18089b(this.f64222t, c20316s.f64222t) && AbstractC16544l.m18089b(this.f64223u, c20316s.f64223u) && AbstractC16544l.m18089b(this.f64224v, c20316s.f64224v) && AbstractC16544l.m18089b(this.f64225w, c20316s.f64225w) && AbstractC16544l.m18089b(this.f64226x, c20316s.f64226x) && this.f64227y == c20316s.f64227y;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v29, types: [int] */
    /* JADX WARN: Type inference failed for: r3v47 */
    /* JADX WARN: Type inference failed for: r4v1, types: [int] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    public final int hashCode() {
        int iM527p = AbstractC0168G.m527p(AbstractC0168G.m527p(AbstractC0168G.m527p(this.f64203a.hashCode() * 31, 31, this.f64204b), 31, this.f64205c), 31, this.f64206d);
        String str = this.f64207e;
        int iHashCode = (iM527p + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f64208f;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f64209g;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f64210h;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f64211i;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f64212j;
        int iM527p2 = AbstractC0168G.m527p(AbstractC0168G.m527p((iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31, 31, this.f64213k), 31, this.f64214l);
        String str7 = this.f64215m;
        int iHashCode6 = (((this.f64217o.hashCode() + ((this.f64216n.hashCode() + ((iM527p2 + (str7 == null ? 0 : str7.hashCode())) * 31)) * 31)) * 31) + this.f64218p) * 31;
        boolean z6 = this.f64219q;
        ?? r6 = z6;
        if (z6) {
            r6 = 1;
        }
        int i10 = (iHashCode6 + r6) * 31;
        boolean z10 = this.f64220r;
        int i11 = (i10 + (z10 ? 1 : z10)) * 31;
        String str8 = this.f64221s;
        int iHashCode7 = (i11 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.f64222t;
        int iHashCode8 = (iHashCode7 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.f64223u;
        int iHashCode9 = (iHashCode8 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.f64224v;
        int iHashCode10 = (iHashCode9 + (str11 == null ? 0 : str11.hashCode())) * 31;
        StepStyles.DocumentStepStyle documentStepStyle = this.f64225w;
        return this.f64227y.hashCode() + ((this.f64226x.hashCode() + ((iHashCode10 + (documentStepStyle != null ? documentStepStyle.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        return "Input(sessionToken=" + this.f64203a + ", inquiryId=" + this.f64204b + ", fromStep=" + this.f64205c + ", fromComponent=" + this.f64206d + ", promptTitle=" + this.f64207e + ", promptDescription=" + this.f64208f + ", disclaimer=" + this.f64209g + ", submitButtonText=" + this.f64210h + ", pendingTitle=" + this.f64211i + ", pendingDescription=" + this.f64212j + ", fieldKeyDocument=" + this.f64213k + ", kind=" + this.f64214l + ", documentId=" + this.f64215m + ", startPage=" + this.f64216n + ", pages=" + this.f64217o + ", documentFileLimit=" + this.f64218p + ", backStepEnabled=" + this.f64219q + ", cancelButtonEnabled=" + this.f64220r + ", permissionsTitle=" + this.f64221s + ", permissionsRationale=" + this.f64222t + ", permissionsModalPositiveButton=" + this.f64223u + ", permissionsModalNegativeButton=" + this.f64224v + ", styles=" + this.f64225w + ", assetConfig=" + this.f64226x + ", pendingPageTextVerticalPosition=" + this.f64227y + Separators.RPAREN;
    }
}
