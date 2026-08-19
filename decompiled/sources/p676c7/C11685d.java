package p676c7;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import p001A.AbstractC0010F;
import p571X9.AbstractC9306j0;
import p775h2.AbstractC14376f;

/* JADX INFO: renamed from: c7.d */
/* JADX INFO: loaded from: classes.dex */
public final class C11685d {

    /* JADX INFO: renamed from: a */
    public final int f35439a;

    /* JADX INFO: renamed from: b */
    public final String f35440b;

    /* JADX INFO: renamed from: c */
    public final Long f35441c;

    /* JADX INFO: renamed from: d */
    public final Long f35442d;

    /* JADX INFO: renamed from: e */
    public final Long f35443e;

    /* JADX INFO: renamed from: f */
    public final Long f35444f;

    /* JADX INFO: renamed from: g */
    public final String f35445g;

    public C11685d(int i10, String str, Long l4, Long l10, Long l11, Long l12, String str2) {
        AbstractC14376f.m15825D(i10, "connectivity");
        this.f35439a = i10;
        this.f35440b = str;
        this.f35441c = l4;
        this.f35442d = l10;
        this.f35443e = l11;
        this.f35444f = l12;
        this.f35445g = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11685d)) {
            return false;
        }
        C11685d c11685d = (C11685d) obj;
        return this.f35439a == c11685d.f35439a && AbstractC16544l.m18089b(this.f35440b, c11685d.f35440b) && AbstractC16544l.m18089b(this.f35441c, c11685d.f35441c) && AbstractC16544l.m18089b(this.f35442d, c11685d.f35442d) && AbstractC16544l.m18089b(this.f35443e, c11685d.f35443e) && AbstractC16544l.m18089b(this.f35444f, c11685d.f35444f) && AbstractC16544l.m18089b(this.f35445g, c11685d.f35445g);
    }

    public final int hashCode() {
        int iM24h = AbstractC0010F.m24h(this.f35439a) * 31;
        String str = this.f35440b;
        int iHashCode = (iM24h + (str == null ? 0 : str.hashCode())) * 31;
        Long l4 = this.f35441c;
        int iHashCode2 = (iHashCode + (l4 == null ? 0 : l4.hashCode())) * 31;
        Long l10 = this.f35442d;
        int iHashCode3 = (iHashCode2 + (l10 == null ? 0 : l10.hashCode())) * 31;
        Long l11 = this.f35443e;
        int iHashCode4 = (iHashCode3 + (l11 == null ? 0 : l11.hashCode())) * 31;
        Long l12 = this.f35444f;
        int iHashCode5 = (iHashCode4 + (l12 == null ? 0 : l12.hashCode())) * 31;
        String str2 = this.f35445g;
        return iHashCode5 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("NetworkInfo(connectivity=");
        switch (this.f35439a) {
            case 1:
                str = "NETWORK_NOT_CONNECTED";
                break;
            case 2:
                str = "NETWORK_ETHERNET";
                break;
            case 3:
                str = "NETWORK_WIFI";
                break;
            case 4:
                str = "NETWORK_WIMAX";
                break;
            case 5:
                str = "NETWORK_BLUETOOTH";
                break;
            case 6:
                str = "NETWORK_2G";
                break;
            case 7:
                str = "NETWORK_3G";
                break;
            case 8:
                str = "NETWORK_4G";
                break;
            case 9:
                str = "NETWORK_5G";
                break;
            case 10:
                str = "NETWORK_MOBILE_OTHER";
                break;
            case 11:
                str = "NETWORK_CELLULAR";
                break;
            case 12:
                str = "NETWORK_OTHER";
                break;
            default:
                str = "null";
                break;
        }
        sb2.append(str);
        sb2.append(", carrierName=");
        sb2.append(this.f35440b);
        sb2.append(", carrierId=");
        sb2.append(this.f35441c);
        sb2.append(", upKbps=");
        sb2.append(this.f35442d);
        sb2.append(", downKbps=");
        sb2.append(this.f35443e);
        sb2.append(", strength=");
        sb2.append(this.f35444f);
        sb2.append(", cellularTechnology=");
        return AbstractC9306j0.m9891j(this.f35445g, Separators.RPAREN, sb2);
    }

    public /* synthetic */ C11685d(int i10, String str, Long l4, Long l10, Long l11, Long l12, String str2, int i11) {
        this((i11 & 1) != 0 ? 1 : i10, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? null : l4, (i11 & 8) != 0 ? null : l10, (i11 & 16) != 0 ? null : l11, (i11 & 32) != 0 ? null : l12, (i11 & 64) == 0 ? str2 : null);
    }
}
