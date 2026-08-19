package p1044uj;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: uj.C */
/* JADX INFO: loaded from: classes3.dex */
public final class C20301C extends AbstractC20302D {

    /* JADX INFO: renamed from: a */
    public final String f64181a;

    /* JADX INFO: renamed from: b */
    public final String f64182b;

    /* JADX INFO: renamed from: c */
    public final C20338h f64183c;

    /* JADX INFO: renamed from: d */
    public final String f64184d;

    public C20301C(String remoteUrl, String str, C20338h document, String str2) {
        AbstractC16544l.m18094g(remoteUrl, "remoteUrl");
        AbstractC16544l.m18094g(document, "document");
        this.f64181a = remoteUrl;
        this.f64182b = str;
        this.f64183c = document;
        this.f64184d = str2;
    }

    @Override // p1044uj.AbstractC20302D
    /* JADX INFO: renamed from: a */
    public final AbstractC20340i mo21031a() {
        return this.f64183c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20301C)) {
            return false;
        }
        C20301C c20301c = (C20301C) obj;
        return AbstractC16544l.m18089b(this.f64181a, c20301c.f64181a) && AbstractC16544l.m18089b(this.f64182b, c20301c.f64182b) && AbstractC16544l.m18089b(this.f64183c, c20301c.f64183c) && AbstractC16544l.m18089b(this.f64184d, c20301c.f64184d);
    }

    public final int hashCode() {
        int iHashCode = this.f64181a.hashCode() * 31;
        String str = this.f64182b;
        int iHashCode2 = (this.f64183c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        String str2 = this.f64184d;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Remote(remoteUrl=");
        sb2.append(this.f64181a);
        sb2.append(", filename=");
        sb2.append(this.f64182b);
        sb2.append(", document=");
        sb2.append(this.f64183c);
        sb2.append(", mimeType=");
        return AbstractC9306j0.m9891j(this.f64184d, Separators.RPAREN, sb2);
    }
}
