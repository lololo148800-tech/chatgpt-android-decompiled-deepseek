package p624Zg;

import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p1155zi.EnumC22080y1;

/* JADX INFO: renamed from: Zg.l0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10379l0 extends AbstractC10381m0 {

    /* JADX INFO: renamed from: a */
    public final List f30752a;

    /* JADX INFO: renamed from: b */
    public final boolean f30753b;

    /* JADX INFO: renamed from: c */
    public final String f30754c;

    /* JADX INFO: renamed from: d */
    public final Integer f30755d;

    /* JADX INFO: renamed from: e */
    public final EnumC22080y1 f30756e;

    public C10379l0(List packages, boolean z6, String str, Integer num, EnumC22080y1 offeringType) {
        AbstractC16544l.m18094g(packages, "packages");
        AbstractC16544l.m18094g(offeringType, "offeringType");
        this.f30752a = packages;
        this.f30753b = z6;
        this.f30754c = str;
        this.f30755d = num;
        this.f30756e = offeringType;
    }

    /* JADX INFO: renamed from: f */
    public static C10379l0 m10893f(C10379l0 c10379l0, String str, Integer num, int i10) {
        List packages = c10379l0.f30752a;
        boolean z6 = c10379l0.f30753b;
        if ((i10 & 4) != 0) {
            str = c10379l0.f30754c;
        }
        String str2 = str;
        if ((i10 & 8) != 0) {
            num = c10379l0.f30755d;
        }
        EnumC22080y1 offeringType = c10379l0.f30756e;
        c10379l0.getClass();
        AbstractC16544l.m18094g(packages, "packages");
        AbstractC16544l.m18094g(offeringType, "offeringType");
        return new C10379l0(packages, z6, str2, num, offeringType);
    }

    @Override // p624Zg.AbstractC10381m0
    /* JADX INFO: renamed from: e */
    public final EnumC22080y1 mo10891e() {
        return this.f30756e;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0028  */
    public final boolean equals(Object obj) {
        boolean zM18089b;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10379l0)) {
            return false;
        }
        C10379l0 c10379l0 = (C10379l0) obj;
        if (!AbstractC16544l.m18089b(this.f30752a, c10379l0.f30752a) || this.f30753b != c10379l0.f30753b) {
            return false;
        }
        String str = this.f30754c;
        String str2 = c10379l0.f30754c;
        if (str == null) {
            if (str2 == null) {
                zM18089b = true;
            } else {
                zM18089b = false;
            }
        } else if (str2 == null) {
            zM18089b = false;
        } else {
            zM18089b = AbstractC16544l.m18089b(str, str2);
        }
        return zM18089b && AbstractC16544l.m18089b(this.f30755d, c10379l0.f30755d) && this.f30756e == c10379l0.f30756e;
    }

    public final int hashCode() {
        int iHashCode = ((this.f30752a.hashCode() * 31) + (this.f30753b ? 1231 : 1237)) * 31;
        String str = this.f30754c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.f30755d;
        return this.f30756e.hashCode() + ((iHashCode2 + (num != null ? num.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "█";
    }
}
