package p587Y1;

import p349O0.C6037x;

/* JADX INFO: renamed from: Y1.v */
/* JADX INFO: loaded from: classes.dex */
public final class C9596v {

    /* JADX INFO: renamed from: a */
    public final int f28883a;

    /* JADX INFO: renamed from: b */
    public final boolean f28884b;

    /* JADX INFO: renamed from: c */
    public final boolean f28885c;

    /* JADX INFO: renamed from: d */
    public final boolean f28886d;

    /* JADX INFO: renamed from: e */
    public final boolean f28887e;

    public C9596v(boolean z6, int i10) {
        this((i10 & 1) != 0 ? false : z6, true, true, 1, true, true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9596v)) {
            return false;
        }
        C9596v c9596v = (C9596v) obj;
        return this.f28883a == c9596v.f28883a && this.f28884b == c9596v.f28884b && this.f28885c == c9596v.f28885c && this.f28886d == c9596v.f28886d && this.f28887e == c9596v.f28887e;
    }

    public final int hashCode() {
        return (((((((((this.f28883a * 31) + (this.f28884b ? 1231 : 1237)) * 31) + (this.f28885c ? 1231 : 1237)) * 31) + (this.f28886d ? 1231 : 1237)) * 31) + (this.f28887e ? 1231 : 1237)) * 31) + 1237;
    }

    public C9596v(boolean z6, boolean z10, boolean z11, int i10, boolean z12, boolean z13) {
        C6037x c6037x = AbstractC9582h.f28839a;
        int i11 = !z6 ? 262152 : 262144;
        i11 = i10 == 2 ? i11 | 8192 : i11;
        i11 = z13 ? i11 : i11 | 512;
        boolean z14 = i10 == 1;
        this.f28883a = i11;
        this.f28884b = z14;
        this.f28885c = z10;
        this.f28886d = z11;
        this.f28887e = z12;
    }
}
