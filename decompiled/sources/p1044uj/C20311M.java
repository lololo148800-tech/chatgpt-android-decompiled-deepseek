package p1044uj;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: uj.M */
/* JADX INFO: loaded from: classes3.dex */
public final class C20311M extends AbstractC20358r {

    /* JADX INFO: renamed from: b */
    public final C20338h f64198b;

    public C20311M(C20338h document) {
        AbstractC16544l.m18094g(document, "document");
        this.f64198b = document;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C20311M) && AbstractC16544l.m18089b(this.f64198b, ((C20311M) obj).f64198b);
    }

    public final int hashCode() {
        return this.f64198b.hashCode();
    }

    public final String toString() {
        return "RemoveDocument(document=" + this.f64198b + Separators.RPAREN;
    }
}
