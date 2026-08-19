package p010A8;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: A8.h */
/* JADX INFO: loaded from: classes.dex */
public final class C0405h {

    /* JADX INFO: renamed from: a */
    public final String f1346a;

    /* JADX INFO: renamed from: b */
    public final String f1347b;

    public C0405h(String str, String str2) {
        this.f1346a = str;
        this.f1347b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0405h)) {
            return false;
        }
        C0405h c0405h = (C0405h) obj;
        return AbstractC16544l.m18089b(this.f1346a, c0405h.f1346a) && AbstractC16544l.m18089b(this.f1347b, c0405h.f1347b);
    }

    public final int hashCode() {
        String str = this.f1346a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f1347b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SimCarrier(id=");
        sb2.append(this.f1346a);
        sb2.append(", name=");
        return AbstractC9306j0.m9891j(this.f1347b, Separators.RPAREN, sb2);
    }
}
