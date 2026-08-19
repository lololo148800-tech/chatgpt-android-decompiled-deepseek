package sh;

import kotlin.jvm.internal.AbstractC16544l;
import p1107xh.EnumC21212B;

/* JADX INFO: renamed from: sh.f0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C19621f0 {

    /* JADX INFO: renamed from: a */
    public final String f62246a;

    /* JADX INFO: renamed from: b */
    public final EnumC21212B f62247b;

    /* JADX INFO: renamed from: c */
    public final C19615c0 f62248c;

    public C19621f0(String str, EnumC21212B enumC21212B, C19615c0 c19615c0) {
        this.f62246a = str;
        this.f62247b = enumC21212B;
        this.f62248c = c19615c0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19621f0)) {
            return false;
        }
        C19621f0 c19621f0 = (C19621f0) obj;
        return AbstractC16544l.m18089b(this.f62246a, c19621f0.f62246a) && this.f62247b == c19621f0.f62247b && AbstractC16544l.m18089b(this.f62248c, c19621f0.f62248c);
    }

    public final int hashCode() {
        int iHashCode = this.f62246a.hashCode() * 31;
        EnumC21212B enumC21212B = this.f62247b;
        int iHashCode2 = (iHashCode + (enumC21212B == null ? 0 : enumC21212B.hashCode())) * 31;
        C19615c0 c19615c0 = this.f62248c;
        return iHashCode2 + (c19615c0 != null ? c19615c0.hashCode() : 0);
    }

    public final String toString() {
        return "█";
    }
}
