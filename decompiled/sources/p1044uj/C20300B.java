package p1044uj;

import android.gov.nist.core.Separators;
import java.io.File;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: uj.B */
/* JADX INFO: loaded from: classes3.dex */
public final class C20300B extends AbstractC20302D {

    /* JADX INFO: renamed from: a */
    public final File f64178a;

    /* JADX INFO: renamed from: b */
    public final C20336g f64179b;

    /* JADX INFO: renamed from: c */
    public final String f64180c;

    public C20300B(File file, C20336g document, String str) {
        AbstractC16544l.m18094g(document, "document");
        this.f64178a = file;
        this.f64179b = document;
        this.f64180c = str;
    }

    @Override // p1044uj.AbstractC20302D
    /* JADX INFO: renamed from: a */
    public final AbstractC20340i mo21031a() {
        return this.f64179b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20300B)) {
            return false;
        }
        C20300B c20300b = (C20300B) obj;
        return AbstractC16544l.m18089b(this.f64178a, c20300b.f64178a) && AbstractC16544l.m18089b(this.f64179b, c20300b.f64179b) && AbstractC16544l.m18089b(this.f64180c, c20300b.f64180c);
    }

    public final int hashCode() {
        int iM527p = AbstractC0168G.m527p(this.f64178a.hashCode() * 31, 31, this.f64179b.f64301Y);
        String str = this.f64180c;
        return iM527p + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Local(file=");
        sb2.append(this.f64178a);
        sb2.append(", document=");
        sb2.append(this.f64179b);
        sb2.append(", mimeType=");
        return AbstractC9306j0.m9891j(this.f64180c, Separators.RPAREN, sb2);
    }
}
