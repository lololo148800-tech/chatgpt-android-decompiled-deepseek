package p1044uj;

import android.gov.nist.core.Separators;

/* JADX INFO: renamed from: uj.A */
/* JADX INFO: loaded from: classes3.dex */
public final class C20299A extends AbstractC20303E {

    /* JADX INFO: renamed from: a */
    public final boolean f64177a;

    public C20299A(boolean z6) {
        this.f64177a = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C20299A) && this.f64177a == ((C20299A) obj).f64177a;
    }

    public final int hashCode() {
        boolean z6 = this.f64177a;
        if (z6) {
            return 1;
        }
        return z6 ? 1 : 0;
    }

    public final String toString() {
        return "AddButtonItem(isEnabled=" + this.f64177a + Separators.RPAREN;
    }
}
