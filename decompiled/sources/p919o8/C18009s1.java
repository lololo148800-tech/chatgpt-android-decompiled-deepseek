package p919o8;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: o8.s1 */
/* JADX INFO: loaded from: classes.dex */
public final class C18009s1 {

    /* JADX INFO: renamed from: a */
    public final Number f57495a;

    /* JADX INFO: renamed from: b */
    public final Number f57496b;

    /* JADX INFO: renamed from: c */
    public final Boolean f57497c;

    public C18009s1(Number number, Number number2, Boolean bool) {
        this.f57495a = number;
        this.f57496b = number2;
        this.f57497c = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18009s1)) {
            return false;
        }
        C18009s1 c18009s1 = (C18009s1) obj;
        return AbstractC16544l.m18089b(this.f57495a, c18009s1.f57495a) && AbstractC16544l.m18089b(this.f57496b, c18009s1.f57496b) && AbstractC16544l.m18089b(this.f57497c, c18009s1.f57497c);
    }

    public final int hashCode() {
        int iHashCode = this.f57495a.hashCode() * 31;
        Number number = this.f57496b;
        int iHashCode2 = (iHashCode + (number == null ? 0 : number.hashCode())) * 31;
        Boolean bool = this.f57497c;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "Configuration(sessionSampleRate=" + this.f57495a + ", sessionReplaySampleRate=" + this.f57496b + ", startSessionReplayRecordingManually=" + this.f57497c + Separators.RPAREN;
    }
}
