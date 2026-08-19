package p1044uj;

import android.gov.nist.core.Separators;
import com.withpersona.sdk2.inquiry.network.dto.styling.StepStyles;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import mk.C17280a;
import p775h2.AbstractC14376f;
import p864l5.InterfaceC16818e;

/* JADX INFO: renamed from: uj.Z */
/* JADX INFO: loaded from: classes3.dex */
public final class C20323Z extends AbstractC20358r {

    /* JADX INFO: renamed from: b */
    public final InterfaceC16818e f64238b;

    /* JADX INFO: renamed from: c */
    public final String f64239c;

    /* JADX INFO: renamed from: d */
    public final String f64240d;

    /* JADX INFO: renamed from: e */
    public final String f64241e;

    /* JADX INFO: renamed from: f */
    public final String f64242f;

    /* JADX INFO: renamed from: g */
    public final List f64243g;

    /* JADX INFO: renamed from: h */
    public final C17280a f64244h;

    /* JADX INFO: renamed from: i */
    public final C20347l0 f64245i;

    /* JADX INFO: renamed from: j */
    public final C20347l0 f64246j;

    /* JADX INFO: renamed from: k */
    public final C20347l0 f64247k;

    /* JADX INFO: renamed from: l */
    public final C20347l0 f64248l;

    /* JADX INFO: renamed from: m */
    public final C20339h0 f64249m;

    /* JADX INFO: renamed from: n */
    public final C20347l0 f64250n;

    /* JADX INFO: renamed from: o */
    public final C20347l0 f64251o;

    /* JADX INFO: renamed from: p */
    public final C20347l0 f64252p;

    /* JADX INFO: renamed from: q */
    public final boolean f64253q;

    /* JADX INFO: renamed from: r */
    public final boolean f64254r;

    /* JADX INFO: renamed from: s */
    public final boolean f64255s;

    /* JADX INFO: renamed from: t */
    public final String f64256t;

    /* JADX INFO: renamed from: u */
    public final C20347l0 f64257u;

    /* JADX INFO: renamed from: v */
    public final StepStyles.DocumentStepStyle f64258v;

    public C20323Z(InterfaceC16818e imageLoader, String str, String str2, String str3, String str4, List documents, C17280a navigationState, C20347l0 c20347l0, C20347l0 c20347l1, C20347l0 c20347l2, C20347l0 c20347l3, C20339h0 c20339h0, C20347l0 c20347l4, C20347l0 c20347l5, C20347l0 c20347l6, boolean z6, boolean z10, boolean z11, String str5, C20347l0 c20347l7, StepStyles.DocumentStepStyle documentStepStyle) {
        AbstractC16544l.m18094g(imageLoader, "imageLoader");
        AbstractC16544l.m18094g(documents, "documents");
        AbstractC16544l.m18094g(navigationState, "navigationState");
        this.f64238b = imageLoader;
        this.f64239c = str;
        this.f64240d = str2;
        this.f64241e = str3;
        this.f64242f = str4;
        this.f64243g = documents;
        this.f64244h = navigationState;
        this.f64245i = c20347l0;
        this.f64246j = c20347l1;
        this.f64247k = c20347l2;
        this.f64248l = c20347l3;
        this.f64249m = c20339h0;
        this.f64250n = c20347l4;
        this.f64251o = c20347l5;
        this.f64252p = c20347l6;
        this.f64253q = z6;
        this.f64254r = z10;
        this.f64255s = z11;
        this.f64256t = str5;
        this.f64257u = c20347l7;
        this.f64258v = documentStepStyle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20323Z)) {
            return false;
        }
        C20323Z c20323z = (C20323Z) obj;
        return AbstractC16544l.m18089b(this.f64238b, c20323z.f64238b) && AbstractC16544l.m18089b(this.f64239c, c20323z.f64239c) && AbstractC16544l.m18089b(this.f64240d, c20323z.f64240d) && AbstractC16544l.m18089b(this.f64241e, c20323z.f64241e) && AbstractC16544l.m18089b(this.f64242f, c20323z.f64242f) && AbstractC16544l.m18089b(this.f64243g, c20323z.f64243g) && AbstractC16544l.m18089b(this.f64244h, c20323z.f64244h) && this.f64245i.equals(c20323z.f64245i) && this.f64246j.equals(c20323z.f64246j) && this.f64247k.equals(c20323z.f64247k) && this.f64248l.equals(c20323z.f64248l) && this.f64249m.equals(c20323z.f64249m) && this.f64250n.equals(c20323z.f64250n) && this.f64251o.equals(c20323z.f64251o) && this.f64252p.equals(c20323z.f64252p) && this.f64253q == c20323z.f64253q && this.f64254r == c20323z.f64254r && this.f64255s == c20323z.f64255s && AbstractC16544l.m18089b(this.f64256t, c20323z.f64256t) && this.f64257u.equals(c20323z.f64257u) && AbstractC16544l.m18089b(this.f64258v, c20323z.f64258v);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29, types: [int] */
    /* JADX WARN: Type inference failed for: r0v39 */
    /* JADX WARN: Type inference failed for: r4v1, types: [int] */
    /* JADX WARN: Type inference failed for: r4v3, types: [int] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    public final int hashCode() {
        int iHashCode = this.f64238b.hashCode() * 31;
        String str = this.f64239c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f64240d;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f64241e;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f64242f;
        int iHashCode5 = (this.f64252p.hashCode() + ((this.f64251o.hashCode() + ((this.f64250n.hashCode() + ((this.f64249m.hashCode() + ((this.f64248l.hashCode() + ((this.f64247k.hashCode() + ((this.f64246j.hashCode() + ((this.f64245i.hashCode() + ((this.f64244h.hashCode() + AbstractC14376f.m15858x(this.f64243g, (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31, 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        boolean z6 = this.f64253q;
        ?? r6 = z6;
        if (z6) {
            r6 = 1;
        }
        int i10 = (iHashCode5 + r6) * 31;
        boolean z10 = this.f64254r;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        int i11 = (i10 + r10) * 31;
        boolean z11 = this.f64255s;
        int i12 = (i11 + (z11 ? 1 : z11)) * 31;
        String str5 = this.f64256t;
        int iHashCode6 = (this.f64257u.hashCode() + ((i12 + (str5 == null ? 0 : str5.hashCode())) * 31)) * 31;
        StepStyles.DocumentStepStyle documentStepStyle = this.f64258v;
        return iHashCode6 + (documentStepStyle != null ? documentStepStyle.hashCode() : 0);
    }

    public final String toString() {
        return "ReviewCaptures(imageLoader=" + this.f64238b + ", title=" + this.f64239c + ", prompt=" + this.f64240d + ", disclaimer=" + this.f64241e + ", submitButtonText=" + this.f64242f + ", documents=" + this.f64243g + ", navigationState=" + this.f64244h + ", openSelectFile=" + this.f64245i + ", selectFromPhotoLibrary=" + this.f64246j + ", openCamera=" + this.f64247k + ", openUploadOptions=" + this.f64248l + ", onRemove=" + this.f64249m + ", onSubmit=" + this.f64250n + ", onCancel=" + this.f64251o + ", onBack=" + this.f64252p + ", disabled=" + this.f64253q + ", addButtonEnabled=" + this.f64254r + ", submitButtonEnabled=" + this.f64255s + ", error=" + this.f64256t + ", onErrorDismissed=" + this.f64257u + ", styles=" + this.f64258v + Separators.RPAREN;
    }
}
