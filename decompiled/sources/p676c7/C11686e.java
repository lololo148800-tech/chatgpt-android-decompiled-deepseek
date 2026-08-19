package p676c7;

import android.gov.nist.core.Separators;

/* JADX INFO: renamed from: c7.e */
/* JADX INFO: loaded from: classes.dex */
public final class C11686e {

    /* JADX INFO: renamed from: a */
    public final boolean f35446a;

    public C11686e(boolean z6) {
        this.f35446a = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C11686e) && this.f35446a == ((C11686e) obj).f35446a;
    }

    public final int hashCode() {
        return this.f35446a ? 1231 : 1237;
    }

    public final String toString() {
        return "ProcessInfo(isMainProcess=" + this.f35446a + Separators.RPAREN;
    }
}
