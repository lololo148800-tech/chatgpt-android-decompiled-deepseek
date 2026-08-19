package p598Ye;

import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Ye.x */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C10053x {
    public static final C10052w Companion = new C10052w();

    /* JADX INFO: renamed from: a */
    public final boolean f29767a;

    /* JADX INFO: renamed from: b */
    public final boolean f29768b;

    /* JADX INFO: renamed from: c */
    public final boolean f29769c;

    /* JADX INFO: renamed from: d */
    public final boolean f29770d;

    /* JADX INFO: renamed from: e */
    public final boolean f29771e;

    /* JADX INFO: renamed from: f */
    public final boolean f29772f;

    public C10053x() {
        this.f29767a = true;
        this.f29768b = false;
        this.f29769c = false;
        this.f29770d = false;
        this.f29771e = false;
        this.f29772f = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10053x)) {
            return false;
        }
        C10053x c10053x = (C10053x) obj;
        return this.f29767a == c10053x.f29767a && this.f29768b == c10053x.f29768b && this.f29769c == c10053x.f29769c && this.f29770d == c10053x.f29770d && this.f29771e == c10053x.f29771e && this.f29772f == c10053x.f29772f;
    }

    public final int hashCode() {
        return ((((((((((this.f29767a ? 1231 : 1237) * 31) + (this.f29768b ? 1231 : 1237)) * 31) + (this.f29769c ? 1231 : 1237)) * 31) + (this.f29770d ? 1231 : 1237)) * 31) + (this.f29771e ? 1231 : 1237)) * 31) + (this.f29772f ? 1231 : 1237);
    }

    public final String toString() {
        return "█";
    }

    public /* synthetic */ C10053x(int i10, boolean z6, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        if ((i10 & 1) == 0) {
            this.f29767a = false;
        } else {
            this.f29767a = z6;
        }
        if ((i10 & 2) == 0) {
            this.f29768b = false;
        } else {
            this.f29768b = z10;
        }
        if ((i10 & 4) == 0) {
            this.f29769c = false;
        } else {
            this.f29769c = z11;
        }
        if ((i10 & 8) == 0) {
            this.f29770d = false;
        } else {
            this.f29770d = z12;
        }
        if ((i10 & 16) == 0) {
            this.f29771e = false;
        } else {
            this.f29771e = z13;
        }
        if ((i10 & 32) == 0) {
            this.f29772f = false;
        } else {
            this.f29772f = z14;
        }
    }
}
