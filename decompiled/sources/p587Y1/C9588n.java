package p587Y1;

import com.google.protobuf.AbstractC12107L1;

/* JADX INFO: renamed from: Y1.n */
/* JADX INFO: loaded from: classes.dex */
public final class C9588n {

    /* JADX INFO: renamed from: a */
    public final boolean f28849a;

    /* JADX INFO: renamed from: b */
    public final boolean f28850b;

    /* JADX INFO: renamed from: c */
    public final int f28851c;

    /* JADX INFO: renamed from: d */
    public final boolean f28852d;

    /* JADX INFO: renamed from: e */
    public final boolean f28853e;

    public C9588n(int i10, boolean z6, boolean z10, boolean z11, boolean z12) {
        this.f28849a = z6;
        this.f28850b = z10;
        this.f28851c = i10;
        this.f28852d = z11;
        this.f28853e = z12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9588n)) {
            return false;
        }
        C9588n c9588n = (C9588n) obj;
        return this.f28849a == c9588n.f28849a && this.f28850b == c9588n.f28850b && this.f28851c == c9588n.f28851c && this.f28852d == c9588n.f28852d && this.f28853e == c9588n.f28853e;
    }

    public final int hashCode() {
        return ((AbstractC12107L1.m13820k(this.f28851c, (((this.f28849a ? 1231 : 1237) * 31) + (this.f28850b ? 1231 : 1237)) * 31, 31) + (this.f28852d ? 1231 : 1237)) * 31) + (this.f28853e ? 1231 : 1237);
    }

    public /* synthetic */ C9588n(int i10) {
        this(1, true, true, (i10 & 8) != 0, false);
    }

    public /* synthetic */ C9588n(int i10, boolean z6, boolean z10) {
        this((i10 & 1) != 0 ? true : z6, true, (i10 & 4) != 0 ? true : z10);
    }

    public C9588n(boolean z6, boolean z10, boolean z11) {
        this(1, z6, z10, z11, true);
    }
}
