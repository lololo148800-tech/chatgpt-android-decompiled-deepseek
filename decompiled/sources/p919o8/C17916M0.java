package p919o8;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: o8.M0 */
/* JADX INFO: loaded from: classes.dex */
public final class C17916M0 {

    /* JADX INFO: renamed from: a */
    public final Number f57116a;

    /* JADX INFO: renamed from: b */
    public final Number f57117b;

    public C17916M0(Number number, Number number2) {
        this.f57116a = number;
        this.f57117b = number2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17916M0)) {
            return false;
        }
        C17916M0 c17916m0 = (C17916M0) obj;
        return AbstractC16544l.m18089b(this.f57116a, c17916m0.f57116a) && AbstractC16544l.m18089b(this.f57117b, c17916m0.f57117b);
    }

    public final int hashCode() {
        int iHashCode = this.f57116a.hashCode() * 31;
        Number number = this.f57117b;
        return iHashCode + (number == null ? 0 : number.hashCode());
    }

    public final String toString() {
        return "Configuration(sessionSampleRate=" + this.f57116a + ", sessionReplaySampleRate=" + this.f57117b + Separators.RPAREN;
    }
}
