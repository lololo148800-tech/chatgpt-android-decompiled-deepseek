package p229J0;

import mm.C17321x;
import p774h1.C14365u;
import p775h2.AbstractC14376f;

/* JADX INFO: renamed from: J0.w1 */
/* JADX INFO: loaded from: classes.dex */
public final class C4151w1 {

    /* JADX INFO: renamed from: a */
    public final long f13447a;

    /* JADX INFO: renamed from: b */
    public final long f13448b;

    /* JADX INFO: renamed from: c */
    public final long f13449c;

    /* JADX INFO: renamed from: d */
    public final long f13450d;

    public C4151w1(long j10, long j11, long j12, long j13) {
        this.f13447a = j10;
        this.f13448b = j11;
        this.f13449c = j12;
        this.f13450d = j13;
    }

    /* JADX INFO: renamed from: a */
    public final C4151w1 m4779a(long j10, long j11, long j12, long j13) {
        return new C4151w1(j10 != 16 ? j10 : this.f13447a, j11 != 16 ? j11 : this.f13448b, j12 != 16 ? j12 : this.f13449c, j13 != 16 ? j13 : this.f13450d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C4151w1)) {
            return false;
        }
        C4151w1 c4151w1 = (C4151w1) obj;
        return C14365u.m15775c(this.f13447a, c4151w1.f13447a) && C14365u.m15775c(this.f13448b, c4151w1.f13448b) && C14365u.m15775c(this.f13449c, c4151w1.f13449c) && C14365u.m15775c(this.f13450d, c4151w1.f13450d);
    }

    public final int hashCode() {
        int i10 = C14365u.f45061k;
        return C17321x.m18981a(this.f13450d) + AbstractC14376f.m15857w(this.f13449c, AbstractC14376f.m15857w(this.f13448b, C17321x.m18981a(this.f13447a) * 31, 31), 31);
    }
}
