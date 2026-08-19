package ge;

import kotlin.jvm.internal.AbstractC16544l;
import ve.C20584h;

/* JADX INFO: renamed from: ge.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C14076g {

    /* JADX INFO: renamed from: a */
    public final boolean f44299a;

    /* JADX INFO: renamed from: b */
    public final C20584h f44300b;

    /* JADX INFO: renamed from: c */
    public final C20584h f44301c;

    /* JADX INFO: renamed from: d */
    public final boolean f44302d;

    /* JADX INFO: renamed from: e */
    public final boolean f44303e;

    public /* synthetic */ C14076g(boolean z6, int i10) {
        this((i10 & 1) != 0 ? false : z6, null, null, true, false);
    }

    /* JADX INFO: renamed from: a */
    public static C14076g m15485a(C14076g c14076g, C20584h c20584h, C20584h c20584h2, boolean z6, boolean z10, int i10) {
        boolean z11 = c14076g.f44299a;
        if ((i10 & 2) != 0) {
            c20584h = c14076g.f44300b;
        }
        C20584h c20584h3 = c20584h;
        if ((i10 & 4) != 0) {
            c20584h2 = c14076g.f44301c;
        }
        C20584h c20584h4 = c20584h2;
        if ((i10 & 8) != 0) {
            z6 = c14076g.f44302d;
        }
        boolean z12 = z6;
        if ((i10 & 16) != 0) {
            z10 = c14076g.f44303e;
        }
        c14076g.getClass();
        return new C14076g(z11, c20584h3, c20584h4, z12, z10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14076g)) {
            return false;
        }
        C14076g c14076g = (C14076g) obj;
        return this.f44299a == c14076g.f44299a && AbstractC16544l.m18089b(this.f44300b, c14076g.f44300b) && AbstractC16544l.m18089b(this.f44301c, c14076g.f44301c) && this.f44302d == c14076g.f44302d && this.f44303e == c14076g.f44303e;
    }

    public final int hashCode() {
        int i10 = (this.f44299a ? 1231 : 1237) * 31;
        C20584h c20584h = this.f44300b;
        int iHashCode = (i10 + (c20584h == null ? 0 : c20584h.hashCode())) * 31;
        C20584h c20584h2 = this.f44301c;
        return ((((iHashCode + (c20584h2 != null ? c20584h2.hashCode() : 0)) * 31) + (this.f44302d ? 1231 : 1237)) * 31) + (this.f44303e ? 1231 : 1237);
    }

    public final String toString() {
        return "█";
    }

    public C14076g(boolean z6, C20584h c20584h, C20584h c20584h2, boolean z10, boolean z11) {
        this.f44299a = z6;
        this.f44300b = c20584h;
        this.f44301c = c20584h2;
        this.f44302d = z10;
        this.f44303e = z11;
    }
}
