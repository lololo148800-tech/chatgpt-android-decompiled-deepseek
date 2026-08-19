package p1016t3;

import p784hb.C14437f;
import p911o0.AbstractC17792x;

/* JADX INFO: renamed from: t3.e */
/* JADX INFO: loaded from: classes.dex */
public final class C19778e {

    /* JADX INFO: renamed from: d */
    public static final C19778e f62665d = new C19778e(0, 1);

    /* JADX INFO: renamed from: a */
    public final int f62666a;

    /* JADX INFO: renamed from: b */
    public final int f62667b;

    /* JADX INFO: renamed from: c */
    public C14437f f62668c;

    static {
        AbstractC17792x.m19540w(0, 1, 2, 3, 4);
    }

    public C19778e(int i10, int i11) {
        this.f62666a = i10;
        this.f62667b = i11;
    }

    /* JADX INFO: renamed from: a */
    public final C14437f m20736a() {
        if (this.f62668c == null) {
            this.f62668c = new C14437f(this);
        }
        return this.f62668c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C19778e.class != obj.getClass()) {
            return false;
        }
        C19778e c19778e = (C19778e) obj;
        return this.f62666a == c19778e.f62666a && this.f62667b == c19778e.f62667b;
    }

    public final int hashCode() {
        return (((((527 + this.f62666a) * 961) + this.f62667b) * 31) + 1) * 31;
    }
}
