package p919o8;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: o8.L */
/* JADX INFO: loaded from: classes.dex */
public final class C17912L {

    /* JADX INFO: renamed from: a */
    public final String f57110a;

    /* JADX INFO: renamed from: b */
    public final String f57111b;

    public C17912L(String str, String str2) {
        this.f57110a = str;
        this.f57111b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17912L)) {
            return false;
        }
        C17912L c17912l = (C17912L) obj;
        return AbstractC16544l.m18089b(this.f57110a, c17912l.f57110a) && AbstractC16544l.m18089b(this.f57111b, c17912l.f57111b);
    }

    public final int hashCode() {
        String str = this.f57110a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f57111b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Cellular(technology=");
        sb2.append(this.f57110a);
        sb2.append(", carrierName=");
        return AbstractC9306j0.m9891j(this.f57111b, Separators.RPAREN, sb2);
    }
}
