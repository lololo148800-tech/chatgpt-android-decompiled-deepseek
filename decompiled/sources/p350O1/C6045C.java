package p350O1;

import kotlin.jvm.internal.AbstractC16544l;
import p1139z0.C21585H;
import p204I1.C3581L;
import p204I1.C3590f;
import p544W9.AbstractC8676n;
import p562X0.AbstractC9020o;

/* JADX INFO: renamed from: O1.C */
/* JADX INFO: loaded from: classes.dex */
public final class C6045C {

    /* JADX INFO: renamed from: d */
    public static final C21585H f19681d;

    /* JADX INFO: renamed from: a */
    public final C3590f f19682a;

    /* JADX INFO: renamed from: b */
    public final long f19683b;

    /* JADX INFO: renamed from: c */
    public final C3581L f19684c;

    static {
        C6044B c6044b = C6044B.f19680Y;
        C6055d c6055d = C6055d.f19715p0;
        C21585H c21585h = AbstractC9020o.f27518a;
        f19681d = new C21585H(c6044b, 10, c6055d);
    }

    public C6045C(C3590f c3590f, long j10, C3581L c3581l) {
        this.f19682a = c3590f;
        this.f19683b = AbstractC8676n.m9366c(c3590f.f10934Y.length(), j10);
        this.f19684c = c3581l != null ? new C3581L(AbstractC8676n.m9366c(c3590f.f10934Y.length(), c3581l.f10908a)) : null;
    }

    /* JADX INFO: renamed from: a */
    public static C6045C m6612a(C6045C c6045c, C3590f c3590f, long j10, int i10) {
        if ((i10 & 1) != 0) {
            c3590f = c6045c.f19682a;
        }
        if ((i10 & 2) != 0) {
            j10 = c6045c.f19683b;
        }
        C3581L c3581l = (i10 & 4) != 0 ? c6045c.f19684c : null;
        c6045c.getClass();
        return new C6045C(c3590f, j10, c3581l);
    }

    /* JADX INFO: renamed from: b */
    public static C6045C m6613b(C6045C c6045c, String str, long j10, int i10) {
        if ((i10 & 2) != 0) {
            j10 = c6045c.f19683b;
        }
        C3581L c3581l = c6045c.f19684c;
        c6045c.getClass();
        return new C6045C(new C3590f(6, str, null), j10, c3581l);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6045C)) {
            return false;
        }
        C6045C c6045c = (C6045C) obj;
        return C3581L.m4266b(this.f19683b, c6045c.f19683b) && AbstractC16544l.m18089b(this.f19684c, c6045c.f19684c) && AbstractC16544l.m18089b(this.f19682a, c6045c.f19682a);
    }

    public final int hashCode() {
        int i10;
        int iHashCode = this.f19682a.hashCode() * 31;
        int i11 = C3581L.f10907c;
        long j10 = this.f19683b;
        int i12 = (((int) (j10 ^ (j10 >>> 32))) + iHashCode) * 31;
        C3581L c3581l = this.f19684c;
        if (c3581l != null) {
            long j11 = c3581l.f10908a;
            i10 = (int) ((j11 >>> 32) ^ j11);
        } else {
            i10 = 0;
        }
        return i12 + i10;
    }

    public final String toString() {
        return "TextFieldValue(text='" + ((Object) this.f19682a) + "', selection=" + ((Object) C3581L.m4272h(this.f19683b)) + ", composition=" + this.f19684c + ')';
    }

    public C6045C(long j10, String str, int i10) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? C3581L.f10906b : j10, (C3581L) null);
    }

    public C6045C(String str, long j10, C3581L c3581l) {
        this(new C3590f(6, str, null), j10, c3581l);
    }
}
