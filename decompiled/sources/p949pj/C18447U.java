package p949pj;

import android.gov.nist.core.Separators;
import android.graphics.Bitmap;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: pj.U */
/* JADX INFO: loaded from: classes3.dex */
public final class C18447U implements InterfaceC18449W {

    /* JADX INFO: renamed from: a */
    public final EnumC18448V f58861a;

    /* JADX INFO: renamed from: b */
    public final Bitmap f58862b;

    /* JADX INFO: renamed from: c */
    public final C18439L f58863c;

    /* JADX INFO: renamed from: d */
    public final AbstractC18481o f58864d;

    /* JADX INFO: renamed from: e */
    public final C18434G f58865e;

    /* JADX INFO: renamed from: f */
    public final C18440M f58866f;

    public C18447U(EnumC18448V side, Bitmap bitmap, C18439L c18439l, AbstractC18481o abstractC18481o, C18434G c18434g, C18440M c18440m) {
        AbstractC16544l.m18094g(side, "side");
        this.f58861a = side;
        this.f58862b = bitmap;
        this.f58863c = c18439l;
        this.f58864d = abstractC18481o;
        this.f58865e = c18434g;
        this.f58866f = c18440m;
    }

    @Override // p949pj.InterfaceC18449W
    /* JADX INFO: renamed from: a */
    public final C18440M mo19877a() {
        return this.f58866f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18447U)) {
            return false;
        }
        C18447U c18447u = (C18447U) obj;
        return this.f58861a == c18447u.f58861a && AbstractC16544l.m18089b(this.f58862b, c18447u.f58862b) && AbstractC16544l.m18089b(this.f58863c, c18447u.f58863c) && AbstractC16544l.m18089b(this.f58864d, c18447u.f58864d) && AbstractC16544l.m18089b(this.f58865e, c18447u.f58865e) && AbstractC16544l.m18089b(this.f58866f, c18447u.f58866f);
    }

    public final int hashCode() {
        int iHashCode = (this.f58862b.hashCode() + (this.f58861a.hashCode() * 31)) * 31;
        C18439L c18439l = this.f58863c;
        int iHashCode2 = (iHashCode + (c18439l == null ? 0 : c18439l.f58829Y.hashCode())) * 31;
        AbstractC18481o abstractC18481o = this.f58864d;
        int iHashCode3 = (iHashCode2 + (abstractC18481o == null ? 0 : abstractC18481o.hashCode())) * 31;
        C18434G c18434g = this.f58865e;
        int iHashCode4 = (iHashCode3 + (c18434g == null ? 0 : c18434g.hashCode())) * 31;
        C18440M c18440m = this.f58866f;
        return iHashCode4 + (c18440m != null ? c18440m.hashCode() : 0);
    }

    public final String toString() {
        return "ParsedIdSide(side=" + this.f58861a + ", bitmap=" + this.f58862b + ", metadata=" + this.f58863c + ", extractedBarcode=" + this.f58864d + ", extractedTexts=" + this.f58865e + ", imageLightCondition=" + this.f58866f + Separators.RPAREN;
    }
}
