package p919o8;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: o8.p0 */
/* JADX INFO: loaded from: classes.dex */
public final class C17999p0 {

    /* JADX INFO: renamed from: a */
    public final Number f57472a;

    /* JADX INFO: renamed from: b */
    public final Number f57473b;

    public C17999p0(Number number, Number number2) {
        this.f57472a = number;
        this.f57473b = number2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17999p0)) {
            return false;
        }
        C17999p0 c17999p0 = (C17999p0) obj;
        return AbstractC16544l.m18089b(this.f57472a, c17999p0.f57472a) && AbstractC16544l.m18089b(this.f57473b, c17999p0.f57473b);
    }

    public final int hashCode() {
        int iHashCode = this.f57472a.hashCode() * 31;
        Number number = this.f57473b;
        return iHashCode + (number == null ? 0 : number.hashCode());
    }

    public final String toString() {
        return "Configuration(sessionSampleRate=" + this.f57472a + ", sessionReplaySampleRate=" + this.f57473b + Separators.RPAREN;
    }
}
