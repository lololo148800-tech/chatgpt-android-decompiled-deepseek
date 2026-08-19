package p010A8;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: A8.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0399b {

    /* JADX INFO: renamed from: a */
    public final C0405h f1324a;

    /* JADX INFO: renamed from: b */
    public final String f1325b;

    /* JADX INFO: renamed from: c */
    public final String f1326c;

    /* JADX INFO: renamed from: d */
    public final String f1327d;

    /* JADX INFO: renamed from: e */
    public final String f1328e;

    public C0399b(C0405h c0405h, String str, String str2, String str3, String str4) {
        this.f1324a = c0405h;
        this.f1325b = str;
        this.f1326c = str2;
        this.f1327d = str3;
        this.f1328e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0399b)) {
            return false;
        }
        C0399b c0399b = (C0399b) obj;
        return AbstractC16544l.m18089b(this.f1324a, c0399b.f1324a) && AbstractC16544l.m18089b(this.f1325b, c0399b.f1325b) && AbstractC16544l.m18089b(this.f1326c, c0399b.f1326c) && AbstractC16544l.m18089b(this.f1327d, c0399b.f1327d) && AbstractC16544l.m18089b(this.f1328e, c0399b.f1328e);
    }

    public final int hashCode() {
        C0405h c0405h = this.f1324a;
        int iHashCode = (c0405h == null ? 0 : c0405h.hashCode()) * 31;
        String str = this.f1325b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f1326c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f1327d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f1328e;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Client(simCarrier=");
        sb2.append(this.f1324a);
        sb2.append(", signalStrength=");
        sb2.append(this.f1325b);
        sb2.append(", downlinkKbps=");
        sb2.append(this.f1326c);
        sb2.append(", uplinkKbps=");
        sb2.append(this.f1327d);
        sb2.append(", connectivity=");
        return AbstractC9306j0.m9891j(this.f1328e, Separators.RPAREN, sb2);
    }
}
