package p624Zg;

import java.util.Date;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: Zg.s */
/* JADX INFO: loaded from: classes3.dex */
public final class C10387s {

    /* JADX INFO: renamed from: a */
    public final String f30785a;

    /* JADX INFO: renamed from: b */
    public final boolean f30786b;

    /* JADX INFO: renamed from: c */
    public final boolean f30787c;

    /* JADX INFO: renamed from: d */
    public final Date f30788d;

    public C10387s(String str, boolean z6, boolean z10, Date latestPurchaseDate) {
        AbstractC16544l.m18094g(latestPurchaseDate, "latestPurchaseDate");
        this.f30785a = str;
        this.f30786b = z6;
        this.f30787c = z10;
        this.f30788d = latestPurchaseDate;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10387s)) {
            return false;
        }
        C10387s c10387s = (C10387s) obj;
        return AbstractC16544l.m18089b(this.f30785a, c10387s.f30785a) && this.f30786b == c10387s.f30786b && this.f30787c == c10387s.f30787c && AbstractC16544l.m18089b(this.f30788d, c10387s.f30788d);
    }

    public final int hashCode() {
        return this.f30788d.hashCode() + (((((this.f30785a.hashCode() * 31) + (this.f30786b ? 1231 : 1237)) * 31) + (this.f30787c ? 1231 : 1237)) * 31);
    }

    public final String toString() {
        return "█";
    }
}
