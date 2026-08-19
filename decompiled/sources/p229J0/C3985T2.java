package p229J0;

import mm.C17321x;
import p774h1.C14365u;
import p775h2.AbstractC14376f;

/* JADX INFO: renamed from: J0.T2 */
/* JADX INFO: loaded from: classes.dex */
public final class C3985T2 {

    /* JADX INFO: renamed from: a */
    public final long f12489a;

    /* JADX INFO: renamed from: b */
    public final long f12490b;

    /* JADX INFO: renamed from: c */
    public final long f12491c;

    /* JADX INFO: renamed from: d */
    public final long f12492d;

    public C3985T2(long j10, long j11, long j12, long j13) {
        this.f12489a = j10;
        this.f12490b = j11;
        this.f12491c = j12;
        this.f12492d = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C3985T2)) {
            return false;
        }
        C3985T2 c3985t2 = (C3985T2) obj;
        return C14365u.m15775c(this.f12489a, c3985t2.f12489a) && C14365u.m15775c(this.f12490b, c3985t2.f12490b) && C14365u.m15775c(this.f12491c, c3985t2.f12491c) && C14365u.m15775c(this.f12492d, c3985t2.f12492d);
    }

    public final int hashCode() {
        int i10 = C14365u.f45061k;
        return C17321x.m18981a(this.f12492d) + AbstractC14376f.m15857w(this.f12491c, AbstractC14376f.m15857w(this.f12490b, C17321x.m18981a(this.f12489a) * 31, 31), 31);
    }
}
