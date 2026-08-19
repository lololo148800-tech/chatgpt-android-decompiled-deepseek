package p923oc;

import android.gov.nist.core.Separators;

/* JADX INFO: renamed from: oc.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C18046b extends AbstractC18048d {

    /* JADX INFO: renamed from: a */
    public final char f57596a;

    public C18046b(char c9) {
        this.f57596a = c9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C18046b) && this.f57596a == ((C18046b) obj).f57596a;
    }

    public final int hashCode() {
        return this.f57596a;
    }

    public final String toString() {
        return "AstBulletList(bulletMarker=" + this.f57596a + Separators.RPAREN;
    }
}
