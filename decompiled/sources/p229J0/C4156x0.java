package p229J0;

import mm.C17321x;
import p774h1.C14365u;
import p775h2.AbstractC14376f;

/* JADX INFO: renamed from: J0.x0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4156x0 {

    /* JADX INFO: renamed from: a */
    public final long f13465a;

    /* JADX INFO: renamed from: b */
    public final long f13466b;

    /* JADX INFO: renamed from: c */
    public final long f13467c;

    /* JADX INFO: renamed from: d */
    public final long f13468d;

    /* JADX INFO: renamed from: e */
    public final long f13469e;

    /* JADX INFO: renamed from: f */
    public final long f13470f;

    /* JADX INFO: renamed from: g */
    public final long f13471g;

    /* JADX INFO: renamed from: h */
    public final long f13472h;

    public C4156x0(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17) {
        this.f13465a = j10;
        this.f13466b = j11;
        this.f13467c = j12;
        this.f13468d = j13;
        this.f13469e = j14;
        this.f13470f = j15;
        this.f13471g = j16;
        this.f13472h = j17;
    }

    /* JADX INFO: renamed from: a */
    public final C4156x0 m4786a(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17) {
        return new C4156x0(j10 != 16 ? j10 : this.f13465a, j11 != 16 ? j11 : this.f13466b, j12 != 16 ? j12 : this.f13467c, j13 != 16 ? j13 : this.f13468d, j14 != 16 ? j14 : this.f13469e, j15 != 16 ? j15 : this.f13470f, j16 != 16 ? j16 : this.f13471g, j17 != 16 ? j17 : this.f13472h);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C4156x0)) {
            return false;
        }
        C4156x0 c4156x0 = (C4156x0) obj;
        return C14365u.m15775c(this.f13465a, c4156x0.f13465a) && C14365u.m15775c(this.f13466b, c4156x0.f13466b) && C14365u.m15775c(this.f13467c, c4156x0.f13467c) && C14365u.m15775c(this.f13468d, c4156x0.f13468d) && C14365u.m15775c(this.f13469e, c4156x0.f13469e) && C14365u.m15775c(this.f13470f, c4156x0.f13470f) && C14365u.m15775c(this.f13471g, c4156x0.f13471g) && C14365u.m15775c(this.f13472h, c4156x0.f13472h);
    }

    public final int hashCode() {
        int i10 = C14365u.f45061k;
        return C17321x.m18981a(this.f13472h) + AbstractC14376f.m15857w(this.f13471g, AbstractC14376f.m15857w(this.f13470f, AbstractC14376f.m15857w(this.f13469e, AbstractC14376f.m15857w(this.f13468d, AbstractC14376f.m15857w(this.f13467c, AbstractC14376f.m15857w(this.f13466b, C17321x.m18981a(this.f13465a) * 31, 31), 31), 31), 31), 31), 31);
    }
}
