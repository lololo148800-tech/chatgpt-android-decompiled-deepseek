package p422R7;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: R7.a */
/* JADX INFO: loaded from: classes.dex */
public final class C6816a {

    /* JADX INFO: renamed from: a */
    public final C6822g f21866a;

    /* JADX INFO: renamed from: b */
    public final String f21867b;

    /* JADX INFO: renamed from: c */
    public final String f21868c;

    /* JADX INFO: renamed from: d */
    public final String f21869d;

    /* JADX INFO: renamed from: e */
    public final String f21870e;

    public C6816a(C6822g c6822g, String str, String str2, String str3, String connectivity) {
        AbstractC16544l.m18094g(connectivity, "connectivity");
        this.f21866a = c6822g;
        this.f21867b = str;
        this.f21868c = str2;
        this.f21869d = str3;
        this.f21870e = connectivity;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6816a)) {
            return false;
        }
        C6816a c6816a = (C6816a) obj;
        return AbstractC16544l.m18089b(this.f21866a, c6816a.f21866a) && AbstractC16544l.m18089b(this.f21867b, c6816a.f21867b) && AbstractC16544l.m18089b(this.f21868c, c6816a.f21868c) && AbstractC16544l.m18089b(this.f21869d, c6816a.f21869d) && AbstractC16544l.m18089b(this.f21870e, c6816a.f21870e);
    }

    public final int hashCode() {
        C6822g c6822g = this.f21866a;
        int iHashCode = (c6822g == null ? 0 : c6822g.hashCode()) * 31;
        String str = this.f21867b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f21868c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f21869d;
        return this.f21870e.hashCode() + ((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Client(simCarrier=");
        sb2.append(this.f21866a);
        sb2.append(", signalStrength=");
        sb2.append(this.f21867b);
        sb2.append(", downlinkKbps=");
        sb2.append(this.f21868c);
        sb2.append(", uplinkKbps=");
        sb2.append(this.f21869d);
        sb2.append(", connectivity=");
        return AbstractC9306j0.m9891j(this.f21870e, Separators.RPAREN, sb2);
    }
}
