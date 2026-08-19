package p919o8;

import android.gov.nist.core.Separators;
import com.google.protobuf.AbstractC12107L1;
import kotlin.jvm.internal.AbstractC16544l;
import p001A.AbstractC0010F;
import p003A1.AbstractC0168G;
import p775h2.AbstractC14376f;

/* JADX INFO: renamed from: o8.f1 */
/* JADX INFO: loaded from: classes.dex */
public final class C17970f1 {

    /* JADX INFO: renamed from: a */
    public final String f57355a;

    /* JADX INFO: renamed from: b */
    public final int f57356b;

    /* JADX INFO: renamed from: c */
    public final int f57357c;

    /* JADX INFO: renamed from: d */
    public final String f57358d;

    /* JADX INFO: renamed from: e */
    public final Long f57359e;

    /* JADX INFO: renamed from: f */
    public final Long f57360f;

    /* JADX INFO: renamed from: g */
    public final Long f57361g;

    /* JADX INFO: renamed from: h */
    public final C17967e1 f57362h;

    /* JADX INFO: renamed from: i */
    public final C17945W0 f57363i;

    /* JADX INFO: renamed from: j */
    public final C17919N0 f57364j;

    /* JADX INFO: renamed from: k */
    public final C17982j1 f57365k;

    /* JADX INFO: renamed from: l */
    public final C17950Y0 f57366l;

    /* JADX INFO: renamed from: m */
    public final C17948X0 f57367m;

    /* JADX INFO: renamed from: n */
    public final C17964d1 f57368n;

    /* JADX INFO: renamed from: o */
    public final C17952Z0 f57369o;

    public C17970f1(String str, int i10, int i11, String str2, Long l4, Long l10, Long l11, C17967e1 c17967e1, C17945W0 c17945w0, C17919N0 c17919n0, C17982j1 c17982j1, C17950Y0 c17950y0, C17948X0 c17948x0, C17964d1 c17964d1, C17952Z0 c17952z0) {
        AbstractC14376f.m15825D(i10, "type");
        this.f57355a = str;
        this.f57356b = i10;
        this.f57357c = i11;
        this.f57358d = str2;
        this.f57359e = l4;
        this.f57360f = l10;
        this.f57361g = l11;
        this.f57362h = c17967e1;
        this.f57363i = c17945w0;
        this.f57364j = c17919n0;
        this.f57365k = c17982j1;
        this.f57366l = c17950y0;
        this.f57367m = c17948x0;
        this.f57368n = c17964d1;
        this.f57369o = c17952z0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17970f1)) {
            return false;
        }
        C17970f1 c17970f1 = (C17970f1) obj;
        return AbstractC16544l.m18089b(this.f57355a, c17970f1.f57355a) && this.f57356b == c17970f1.f57356b && this.f57357c == c17970f1.f57357c && AbstractC16544l.m18089b(this.f57358d, c17970f1.f57358d) && AbstractC16544l.m18089b(this.f57359e, c17970f1.f57359e) && AbstractC16544l.m18089b(this.f57360f, c17970f1.f57360f) && AbstractC16544l.m18089b(this.f57361g, c17970f1.f57361g) && AbstractC16544l.m18089b(this.f57362h, c17970f1.f57362h) && AbstractC16544l.m18089b(this.f57363i, c17970f1.f57363i) && AbstractC16544l.m18089b(this.f57364j, c17970f1.f57364j) && AbstractC16544l.m18089b(this.f57365k, c17970f1.f57365k) && AbstractC16544l.m18089b(this.f57366l, c17970f1.f57366l) && AbstractC16544l.m18089b(this.f57367m, c17970f1.f57367m) && AbstractC16544l.m18089b(this.f57368n, c17970f1.f57368n) && AbstractC16544l.m18089b(this.f57369o, c17970f1.f57369o);
    }

    public final int hashCode() {
        String str = this.f57355a;
        int iM13820k = AbstractC12107L1.m13820k(this.f57356b, (str == null ? 0 : str.hashCode()) * 31, 31);
        int i10 = this.f57357c;
        int iM527p = AbstractC0168G.m527p((iM13820k + (i10 == 0 ? 0 : AbstractC0010F.m24h(i10))) * 31, 31, this.f57358d);
        Long l4 = this.f57359e;
        int iHashCode = (iM527p + (l4 == null ? 0 : l4.hashCode())) * 31;
        Long l10 = this.f57360f;
        int iHashCode2 = (iHashCode + (l10 == null ? 0 : l10.hashCode())) * 31;
        Long l11 = this.f57361g;
        int iHashCode3 = (iHashCode2 + (l11 == null ? 0 : l11.hashCode())) * 31;
        C17967e1 c17967e1 = this.f57362h;
        int iHashCode4 = (iHashCode3 + (c17967e1 == null ? 0 : c17967e1.hashCode())) * 31;
        C17945W0 c17945w0 = this.f57363i;
        int iHashCode5 = (iHashCode4 + (c17945w0 == null ? 0 : c17945w0.hashCode())) * 31;
        C17919N0 c17919n0 = this.f57364j;
        int iHashCode6 = (iHashCode5 + (c17919n0 == null ? 0 : c17919n0.hashCode())) * 31;
        C17982j1 c17982j1 = this.f57365k;
        int iHashCode7 = (iHashCode6 + (c17982j1 == null ? 0 : c17982j1.hashCode())) * 31;
        C17950Y0 c17950y0 = this.f57366l;
        int iHashCode8 = (iHashCode7 + (c17950y0 == null ? 0 : c17950y0.hashCode())) * 31;
        C17948X0 c17948x0 = this.f57367m;
        int iHashCode9 = (iHashCode8 + (c17948x0 == null ? 0 : c17948x0.hashCode())) * 31;
        C17964d1 c17964d1 = this.f57368n;
        int iHashCode10 = (iHashCode9 + (c17964d1 == null ? 0 : c17964d1.hashCode())) * 31;
        C17952Z0 c17952z0 = this.f57369o;
        return iHashCode10 + (c17952z0 != null ? c17952z0.hashCode() : 0);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("Resource(id=");
        sb2.append(this.f57355a);
        sb2.append(", type=");
        switch (this.f57356b) {
            case 1:
                str = "DOCUMENT";
                break;
            case 2:
                str = "XHR";
                break;
            case 3:
                str = "BEACON";
                break;
            case 4:
                str = "FETCH";
                break;
            case 5:
                str = "CSS";
                break;
            case 6:
                str = "JS";
                break;
            case 7:
                str = "IMAGE";
                break;
            case 8:
                str = "FONT";
                break;
            case 9:
                str = "MEDIA";
                break;
            case 10:
                str = "OTHER";
                break;
            case 11:
                str = "NATIVE";
                break;
            default:
                str = "null";
                break;
        }
        sb2.append(str);
        sb2.append(", method=");
        sb2.append(AbstractC17962d.m19630U(this.f57357c));
        sb2.append(", url=");
        sb2.append(this.f57358d);
        sb2.append(", statusCode=");
        sb2.append(this.f57359e);
        sb2.append(", duration=");
        sb2.append(this.f57360f);
        sb2.append(", size=");
        sb2.append(this.f57361g);
        sb2.append(", redirect=");
        sb2.append(this.f57362h);
        sb2.append(", dns=");
        sb2.append(this.f57363i);
        sb2.append(", connect=");
        sb2.append(this.f57364j);
        sb2.append(", ssl=");
        sb2.append(this.f57365k);
        sb2.append(", firstByte=");
        sb2.append(this.f57366l);
        sb2.append(", download=");
        sb2.append(this.f57367m);
        sb2.append(", provider=");
        sb2.append(this.f57368n);
        sb2.append(", graphql=");
        sb2.append(this.f57369o);
        sb2.append(Separators.RPAREN);
        return sb2.toString();
    }
}
