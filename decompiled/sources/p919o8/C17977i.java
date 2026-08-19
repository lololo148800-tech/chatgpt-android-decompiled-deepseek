package p919o8;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: o8.i */
/* JADX INFO: loaded from: classes.dex */
public final class C17977i {

    /* JADX INFO: renamed from: a */
    public final Number f57383a;

    /* JADX INFO: renamed from: b */
    public final Number f57384b;

    public C17977i(Float f10) {
        this.f57383a = f10;
        this.f57384b = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17977i)) {
            return false;
        }
        C17977i c17977i = (C17977i) obj;
        return AbstractC16544l.m18089b(this.f57383a, c17977i.f57383a) && AbstractC16544l.m18089b(this.f57384b, c17977i.f57384b);
    }

    public final int hashCode() {
        int iHashCode = this.f57383a.hashCode() * 31;
        Number number = this.f57384b;
        return iHashCode + (number == null ? 0 : number.hashCode());
    }

    public final String toString() {
        return "Configuration(sessionSampleRate=" + this.f57383a + ", sessionReplaySampleRate=" + this.f57384b + Separators.RPAREN;
    }

    public C17977i(Number number, Number number2) {
        this.f57383a = number;
        this.f57384b = number2;
    }
}
