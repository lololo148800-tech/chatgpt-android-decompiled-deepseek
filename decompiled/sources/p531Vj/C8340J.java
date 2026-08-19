package p531Vj;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: Vj.J */
/* JADX INFO: loaded from: classes3.dex */
public final class C8340J {

    /* JADX INFO: renamed from: a */
    public final C8365e0 f25996a;

    public C8340J(C8365e0 c8365e0) {
        this.f25996a = c8365e0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C8340J) && AbstractC16544l.m18089b(this.f25996a, ((C8340J) obj).f25996a);
    }

    public final int hashCode() {
        return this.f25996a.hashCode();
    }

    public final String toString() {
        return "Output(permissionState=" + this.f25996a + Separators.RPAREN;
    }
}
