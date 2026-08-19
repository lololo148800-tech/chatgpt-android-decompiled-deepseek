package p919o8;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: o8.N */
/* JADX INFO: loaded from: classes.dex */
public final class C17918N {

    /* JADX INFO: renamed from: a */
    public final Number f57120a;

    /* JADX INFO: renamed from: b */
    public final Number f57121b;

    public C17918N(Float f10) {
        this.f57120a = f10;
        this.f57121b = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17918N)) {
            return false;
        }
        C17918N c17918n = (C17918N) obj;
        return AbstractC16544l.m18089b(this.f57120a, c17918n.f57120a) && AbstractC16544l.m18089b(this.f57121b, c17918n.f57121b);
    }

    public final int hashCode() {
        int iHashCode = this.f57120a.hashCode() * 31;
        Number number = this.f57121b;
        return iHashCode + (number == null ? 0 : number.hashCode());
    }

    public final String toString() {
        return "Configuration(sessionSampleRate=" + this.f57120a + ", sessionReplaySampleRate=" + this.f57121b + Separators.RPAREN;
    }

    public C17918N(Number number, Number number2) {
        this.f57120a = number;
        this.f57121b = number2;
    }
}
