package p229J0;

import mm.C17321x;
import p774h1.C14365u;
import p775h2.AbstractC14376f;

/* JADX INFO: renamed from: J0.F4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3911F4 {

    /* JADX INFO: renamed from: a */
    public final long f11995a;

    /* JADX INFO: renamed from: b */
    public final long f11996b;

    /* JADX INFO: renamed from: c */
    public final long f11997c;

    /* JADX INFO: renamed from: d */
    public final long f11998d;

    /* JADX INFO: renamed from: e */
    public final long f11999e;

    public C3911F4(long j10, long j11, long j12, long j13, long j14) {
        this.f11995a = j10;
        this.f11996b = j11;
        this.f11997c = j12;
        this.f11998d = j13;
        this.f11999e = j14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C3911F4)) {
            return false;
        }
        C3911F4 c3911f4 = (C3911F4) obj;
        return C14365u.m15775c(this.f11995a, c3911f4.f11995a) && C14365u.m15775c(this.f11996b, c3911f4.f11996b) && C14365u.m15775c(this.f11997c, c3911f4.f11997c) && C14365u.m15775c(this.f11998d, c3911f4.f11998d) && C14365u.m15775c(this.f11999e, c3911f4.f11999e);
    }

    public final int hashCode() {
        int i10 = C14365u.f45061k;
        return C17321x.m18981a(this.f11999e) + AbstractC14376f.m15857w(this.f11998d, AbstractC14376f.m15857w(this.f11997c, AbstractC14376f.m15857w(this.f11996b, C17321x.m18981a(this.f11995a) * 31, 31), 31), 31);
    }
}
