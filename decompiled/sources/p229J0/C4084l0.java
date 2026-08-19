package p229J0;

import mm.C17321x;
import p774h1.C14365u;
import p775h2.AbstractC14376f;

/* JADX INFO: renamed from: J0.l0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4084l0 {

    /* JADX INFO: renamed from: a */
    public final long f13049a;

    /* JADX INFO: renamed from: b */
    public final long f13050b;

    /* JADX INFO: renamed from: c */
    public final long f13051c;

    /* JADX INFO: renamed from: d */
    public final long f13052d;

    public C4084l0(long j10, long j11, long j12, long j13) {
        this.f13049a = j10;
        this.f13050b = j11;
        this.f13051c = j12;
        this.f13052d = j13;
    }

    /* JADX INFO: renamed from: a */
    public static C4084l0 m4752a(C4084l0 c4084l0, long j10) {
        if (j10 == 16) {
            j10 = c4084l0.f13049a;
        }
        return new C4084l0(j10, c4084l0.f13050b, c4084l0.f13051c, c4084l0.f13052d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C4084l0)) {
            return false;
        }
        C4084l0 c4084l0 = (C4084l0) obj;
        return C14365u.m15775c(this.f13049a, c4084l0.f13049a) && C14365u.m15775c(this.f13050b, c4084l0.f13050b) && C14365u.m15775c(this.f13051c, c4084l0.f13051c) && C14365u.m15775c(this.f13052d, c4084l0.f13052d);
    }

    public final int hashCode() {
        int i10 = C14365u.f45061k;
        return C17321x.m18981a(this.f13052d) + AbstractC14376f.m15857w(this.f13051c, AbstractC14376f.m15857w(this.f13050b, C17321x.m18981a(this.f13049a) * 31, 31), 31);
    }
}
