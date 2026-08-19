package p919o8;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import p001A.AbstractC0010F;
import p571X9.AbstractC9306j0;
import p775h2.AbstractC14376f;

/* JADX INFO: renamed from: o8.B1 */
/* JADX INFO: loaded from: classes.dex */
public final class C17884B1 {

    /* JADX INFO: renamed from: a */
    public final int f56995a;

    /* JADX INFO: renamed from: b */
    public final String f56996b;

    /* JADX INFO: renamed from: c */
    public final String f56997c;

    /* JADX INFO: renamed from: d */
    public final String f56998d;

    /* JADX INFO: renamed from: e */
    public final String f56999e;

    public C17884B1(int i10, String str, String str2, String str3, String str4) {
        AbstractC14376f.m15825D(i10, "type");
        this.f56995a = i10;
        this.f56996b = str;
        this.f56997c = str2;
        this.f56998d = str3;
        this.f56999e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17884B1)) {
            return false;
        }
        C17884B1 c17884b1 = (C17884B1) obj;
        return this.f56995a == c17884b1.f56995a && AbstractC16544l.m18089b(this.f56996b, c17884b1.f56996b) && AbstractC16544l.m18089b(this.f56997c, c17884b1.f56997c) && AbstractC16544l.m18089b(this.f56998d, c17884b1.f56998d) && AbstractC16544l.m18089b(this.f56999e, c17884b1.f56999e);
    }

    public final int hashCode() {
        int iM24h = AbstractC0010F.m24h(this.f56995a) * 31;
        String str = this.f56996b;
        int iHashCode = (iM24h + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f56997c;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f56998d;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f56999e;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("Device(type=");
        switch (this.f56995a) {
            case 1:
                str = "MOBILE";
                break;
            case 2:
                str = "DESKTOP";
                break;
            case 3:
                str = "TABLET";
                break;
            case 4:
                str = "TV";
                break;
            case 5:
                str = "GAMING_CONSOLE";
                break;
            case 6:
                str = "BOT";
                break;
            case 7:
                str = "OTHER";
                break;
            default:
                str = "null";
                break;
        }
        sb2.append(str);
        sb2.append(", name=");
        sb2.append(this.f56996b);
        sb2.append(", model=");
        sb2.append(this.f56997c);
        sb2.append(", brand=");
        sb2.append(this.f56998d);
        sb2.append(", architecture=");
        return AbstractC9306j0.m9891j(this.f56999e, Separators.RPAREN, sb2);
    }
}
