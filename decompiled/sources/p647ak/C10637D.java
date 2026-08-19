package p647ak;

import android.gov.nist.core.Separators;

/* JADX INFO: renamed from: ak.D */
/* JADX INFO: loaded from: classes3.dex */
public final class C10637D extends AbstractC10641F {

    /* JADX INFO: renamed from: a */
    public final EnumC10647I f31561a;

    public C10637D(EnumC10647I enumC10647I) {
        this.f31561a = enumC10647I;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C10637D) && this.f31561a == ((C10637D) obj).f31561a;
    }

    public final int hashCode() {
        return this.f31561a.hashCode();
    }

    public final String toString() {
        return "Error(error=" + this.f31561a + Separators.RPAREN;
    }
}
