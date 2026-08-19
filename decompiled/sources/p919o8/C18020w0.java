package p919o8;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import p001A.AbstractC0010F;
import p571X9.AbstractC9306j0;
import p775h2.AbstractC14376f;

/* JADX INFO: renamed from: o8.w0 */
/* JADX INFO: loaded from: classes.dex */
public final class C18020w0 {

    /* JADX INFO: renamed from: a */
    public final int f57523a;

    /* JADX INFO: renamed from: b */
    public final String f57524b;

    /* JADX INFO: renamed from: c */
    public final String f57525c;

    /* JADX INFO: renamed from: d */
    public final String f57526d;

    /* JADX INFO: renamed from: e */
    public final String f57527e;

    public C18020w0(int i10, String str, String str2, String str3, String str4) {
        AbstractC14376f.m15825D(i10, "type");
        this.f57523a = i10;
        this.f57524b = str;
        this.f57525c = str2;
        this.f57526d = str3;
        this.f57527e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18020w0)) {
            return false;
        }
        C18020w0 c18020w0 = (C18020w0) obj;
        return this.f57523a == c18020w0.f57523a && AbstractC16544l.m18089b(this.f57524b, c18020w0.f57524b) && AbstractC16544l.m18089b(this.f57525c, c18020w0.f57525c) && AbstractC16544l.m18089b(this.f57526d, c18020w0.f57526d) && AbstractC16544l.m18089b(this.f57527e, c18020w0.f57527e);
    }

    public final int hashCode() {
        int iM24h = AbstractC0010F.m24h(this.f57523a) * 31;
        String str = this.f57524b;
        int iHashCode = (iM24h + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f57525c;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f57526d;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f57527e;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Device(type=");
        sb2.append(AbstractC17962d.m19622M(this.f57523a));
        sb2.append(", name=");
        sb2.append(this.f57524b);
        sb2.append(", model=");
        sb2.append(this.f57525c);
        sb2.append(", brand=");
        sb2.append(this.f57526d);
        sb2.append(", architecture=");
        return AbstractC9306j0.m9891j(this.f57527e, Separators.RPAREN, sb2);
    }
}
