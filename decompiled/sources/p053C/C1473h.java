package p053C;

import android.os.Build;

/* JADX INFO: renamed from: C.h */
/* JADX INFO: loaded from: classes.dex */
public final class C1473h {

    /* JADX INFO: renamed from: a */
    public final C1471f f3882a;

    public C1473h(C1471f c1471f) {
        this.f3882a = c1471f;
    }

    /* JADX INFO: renamed from: a */
    public static C1473h m2112a(Object obj) {
        if (obj == null) {
            return null;
        }
        return Build.VERSION.SDK_INT >= 31 ? new C1473h(new C1472g(obj)) : new C1473h(new C1471f(obj));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1473h)) {
            return false;
        }
        return this.f3882a.equals(((C1473h) obj).f3882a);
    }

    public final int hashCode() {
        return this.f3882a.hashCode();
    }

    public final String toString() {
        return this.f3882a.toString();
    }
}
