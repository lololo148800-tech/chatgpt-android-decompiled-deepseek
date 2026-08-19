package p148Fi;

import kotlin.jvm.internal.AbstractC16544l;
import p1155zi.C22025k2;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Fi.k0 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C2834k0 {
    public static final C2831j0 Companion = new C2831j0();

    /* JADX INFO: renamed from: a */
    public final C2825h0 f8571a;

    /* JADX INFO: renamed from: b */
    public final C2825h0 f8572b;

    /* JADX INFO: renamed from: c */
    public final C2825h0 f8573c;

    public /* synthetic */ C2834k0(int i10, C2825h0 c2825h0, C2825h0 c2825h1, C2825h0 c2825h2) {
        if ((i10 & 1) == 0) {
            this.f8571a = null;
        } else {
            this.f8571a = c2825h0;
        }
        if ((i10 & 2) == 0) {
            this.f8572b = null;
        } else {
            this.f8572b = c2825h1;
        }
        if ((i10 & 4) == 0) {
            this.f8573c = null;
        } else {
            this.f8573c = c2825h2;
        }
    }

    /* JADX INFO: renamed from: a */
    public final C22025k2 m3714a() {
        C2861x c2861x;
        C2861x c2861x2;
        C22025k2 c22025k2;
        C2825h0 c2825h0 = this.f8572b;
        if (c2825h0 != null && (c2861x2 = c2825h0.f8564b) != null && (c22025k2 = c2861x2.f8631c) != null) {
            return c22025k2;
        }
        C2825h0 c2825h1 = this.f8571a;
        if (c2825h1 == null || (c2861x = c2825h1.f8564b) == null) {
            return null;
        }
        return c2861x.f8631c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2834k0)) {
            return false;
        }
        C2834k0 c2834k0 = (C2834k0) obj;
        return AbstractC16544l.m18089b(this.f8571a, c2834k0.f8571a) && AbstractC16544l.m18089b(this.f8572b, c2834k0.f8572b) && AbstractC16544l.m18089b(this.f8573c, c2834k0.f8573c);
    }

    public final int hashCode() {
        C2825h0 c2825h0 = this.f8571a;
        int iHashCode = (c2825h0 == null ? 0 : c2825h0.hashCode()) * 31;
        C2825h0 c2825h1 = this.f8572b;
        int iHashCode2 = (iHashCode + (c2825h1 == null ? 0 : c2825h1.hashCode())) * 31;
        C2825h0 c2825h2 = this.f8573c;
        return iHashCode2 + (c2825h2 != null ? c2825h2.hashCode() : 0);
    }

    public final String toString() {
        return "█";
    }
}
