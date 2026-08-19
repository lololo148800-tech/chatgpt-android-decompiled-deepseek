package p148Fi;

import kotlin.jvm.internal.AbstractC16544l;
import p1155zi.C22025k2;
import p1155zi.C22057s2;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Fi.x */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C2861x {
    public static final C2859w Companion = new C2859w();

    /* JADX INFO: renamed from: a */
    public final String f8629a;

    /* JADX INFO: renamed from: b */
    public final C22057s2 f8630b;

    /* JADX INFO: renamed from: c */
    public final C22025k2 f8631c;

    public /* synthetic */ C2861x(int i10, String str, C22057s2 c22057s2, C22025k2 c22025k2) {
        if ((i10 & 1) == 0) {
            this.f8629a = null;
        } else {
            this.f8629a = str;
        }
        if ((i10 & 2) == 0) {
            this.f8630b = null;
        } else {
            this.f8630b = c22057s2;
        }
        if ((i10 & 4) == 0) {
            this.f8631c = null;
        } else {
            this.f8631c = c22025k2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2861x)) {
            return false;
        }
        C2861x c2861x = (C2861x) obj;
        return AbstractC16544l.m18089b(this.f8629a, c2861x.f8629a) && AbstractC16544l.m18089b(this.f8630b, c2861x.f8630b) && AbstractC16544l.m18089b(this.f8631c, c2861x.f8631c);
    }

    public final int hashCode() {
        String str = this.f8629a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        C22057s2 c22057s2 = this.f8630b;
        int iHashCode2 = (iHashCode + (c22057s2 == null ? 0 : c22057s2.hashCode())) * 31;
        C22025k2 c22025k2 = this.f8631c;
        return iHashCode2 + (c22025k2 != null ? c22025k2.hashCode() : 0);
    }

    public final String toString() {
        return "█";
    }
}
