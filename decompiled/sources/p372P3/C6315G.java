package p372P3;

import java.util.Arrays;

/* JADX INFO: renamed from: P3.G */
/* JADX INFO: loaded from: classes.dex */
public final class C6315G {

    /* JADX INFO: renamed from: a */
    public final int f20453a;

    /* JADX INFO: renamed from: b */
    public final byte[] f20454b;

    /* JADX INFO: renamed from: c */
    public final int f20455c;

    /* JADX INFO: renamed from: d */
    public final int f20456d;

    public C6315G(int i10, int i11, int i12, byte[] bArr) {
        this.f20453a = i10;
        this.f20454b = bArr;
        this.f20455c = i11;
        this.f20456d = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C6315G.class != obj.getClass()) {
            return false;
        }
        C6315G c6315g = (C6315G) obj;
        return this.f20453a == c6315g.f20453a && this.f20455c == c6315g.f20455c && this.f20456d == c6315g.f20456d && Arrays.equals(this.f20454b, c6315g.f20454b);
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f20454b) + (this.f20453a * 31)) * 31) + this.f20455c) * 31) + this.f20456d;
    }
}
