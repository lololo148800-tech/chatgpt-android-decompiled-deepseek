package p229J0;

import mm.C17321x;
import p774h1.C14365u;
import p775h2.AbstractC14376f;

/* JADX INFO: renamed from: J0.O1 */
/* JADX INFO: loaded from: classes.dex */
public final class C3960O1 {

    /* JADX INFO: renamed from: a */
    public final long f12304a;

    /* JADX INFO: renamed from: b */
    public final long f12305b;

    /* JADX INFO: renamed from: c */
    public final long f12306c;

    /* JADX INFO: renamed from: d */
    public final long f12307d;

    /* JADX INFO: renamed from: e */
    public final long f12308e;

    /* JADX INFO: renamed from: f */
    public final long f12309f;

    public C3960O1(long j10, long j11, long j12, long j13, long j14, long j15) {
        this.f12304a = j10;
        this.f12305b = j11;
        this.f12306c = j12;
        this.f12307d = j13;
        this.f12308e = j14;
        this.f12309f = j15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C3960O1)) {
            return false;
        }
        C3960O1 c3960o1 = (C3960O1) obj;
        return C14365u.m15775c(this.f12304a, c3960o1.f12304a) && C14365u.m15775c(this.f12305b, c3960o1.f12305b) && C14365u.m15775c(this.f12306c, c3960o1.f12306c) && C14365u.m15775c(this.f12307d, c3960o1.f12307d) && C14365u.m15775c(this.f12308e, c3960o1.f12308e) && C14365u.m15775c(this.f12309f, c3960o1.f12309f);
    }

    public final int hashCode() {
        int i10 = C14365u.f45061k;
        return C17321x.m18981a(this.f12309f) + AbstractC14376f.m15857w(this.f12308e, AbstractC14376f.m15857w(this.f12307d, AbstractC14376f.m15857w(this.f12306c, AbstractC14376f.m15857w(this.f12305b, C17321x.m18981a(this.f12304a) * 31, 31), 31), 31), 31);
    }
}
