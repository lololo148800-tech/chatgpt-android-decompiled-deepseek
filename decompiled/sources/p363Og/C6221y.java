package p363Og;

import kotlin.jvm.internal.AbstractC16544l;
import p098Di.InterfaceC2062k;
import ve.C20584h;

/* JADX INFO: renamed from: Og.y */
/* JADX INFO: loaded from: classes3.dex */
public final class C6221y implements InterfaceC2062k {

    /* JADX INFO: renamed from: a */
    public final boolean f20249a;

    /* JADX INFO: renamed from: b */
    public final boolean f20250b;

    /* JADX INFO: renamed from: c */
    public final boolean f20251c;

    /* JADX INFO: renamed from: d */
    public final C20584h f20252d;

    /* JADX INFO: renamed from: e */
    public final boolean f20253e;

    public C6221y(boolean z6, boolean z10, boolean z11, C20584h c20584h, boolean z12) {
        this.f20249a = z6;
        this.f20250b = z10;
        this.f20251c = z11;
        this.f20252d = c20584h;
        this.f20253e = z12;
    }

    /* JADX INFO: renamed from: e */
    public static C6221y m6733e(C6221y c6221y, boolean z6, boolean z10, C20584h c20584h, boolean z11, int i10) {
        if ((i10 & 1) != 0) {
            z6 = c6221y.f20249a;
        }
        boolean z12 = z6;
        if ((i10 & 2) != 0) {
            z10 = c6221y.f20250b;
        }
        boolean z13 = z10;
        boolean z14 = (i10 & 4) != 0 ? c6221y.f20251c : false;
        if ((i10 & 8) != 0) {
            c20584h = c6221y.f20252d;
        }
        C20584h c20584h2 = c20584h;
        if ((i10 & 16) != 0) {
            z11 = c6221y.f20253e;
        }
        c6221y.getClass();
        return new C6221y(z12, z13, z14, c20584h2, z11);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6221y)) {
            return false;
        }
        C6221y c6221y = (C6221y) obj;
        return this.f20249a == c6221y.f20249a && this.f20250b == c6221y.f20250b && this.f20251c == c6221y.f20251c && AbstractC16544l.m18089b(this.f20252d, c6221y.f20252d) && this.f20253e == c6221y.f20253e;
    }

    public final int hashCode() {
        int i10 = (((((this.f20249a ? 1231 : 1237) * 31) + (this.f20250b ? 1231 : 1237)) * 31) + (this.f20251c ? 1231 : 1237)) * 31;
        C20584h c20584h = this.f20252d;
        return ((i10 + (c20584h == null ? 0 : c20584h.hashCode())) * 31) + (this.f20253e ? 1231 : 1237);
    }

    public final String toString() {
        return "█";
    }
}
