package p919o8;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import p001A.AbstractC0010F;
import p009A7.FlM.nkFZpTrMPpn;
import p571X9.AbstractC9306j0;
import p775h2.AbstractC14376f;

/* JADX INFO: renamed from: o8.s */
/* JADX INFO: loaded from: classes.dex */
public final class C18007s {

    /* JADX INFO: renamed from: a */
    public final int f57489a;

    /* JADX INFO: renamed from: b */
    public final String f57490b;

    /* JADX INFO: renamed from: c */
    public final String f57491c;

    /* JADX INFO: renamed from: d */
    public final String f57492d;

    /* JADX INFO: renamed from: e */
    public final String f57493e;

    public C18007s(int i10, String str, String str2, String str3, String str4) {
        AbstractC14376f.m15825D(i10, "type");
        this.f57489a = i10;
        this.f57490b = str;
        this.f57491c = str2;
        this.f57492d = str3;
        this.f57493e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18007s)) {
            return false;
        }
        C18007s c18007s = (C18007s) obj;
        return this.f57489a == c18007s.f57489a && AbstractC16544l.m18089b(this.f57490b, c18007s.f57490b) && AbstractC16544l.m18089b(this.f57491c, c18007s.f57491c) && AbstractC16544l.m18089b(this.f57492d, c18007s.f57492d) && AbstractC16544l.m18089b(this.f57493e, c18007s.f57493e);
    }

    public final int hashCode() {
        int iM24h = AbstractC0010F.m24h(this.f57489a) * 31;
        String str = this.f57490b;
        int iHashCode = (iM24h + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f57491c;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f57492d;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f57493e;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Device(type=");
        sb2.append(AbstractC17962d.m19634Y(this.f57489a));
        sb2.append(nkFZpTrMPpn.NHFmVOM);
        sb2.append(this.f57490b);
        sb2.append(", model=");
        sb2.append(this.f57491c);
        sb2.append(", brand=");
        sb2.append(this.f57492d);
        sb2.append(", architecture=");
        return AbstractC9306j0.m9891j(this.f57493e, Separators.RPAREN, sb2);
    }
}
