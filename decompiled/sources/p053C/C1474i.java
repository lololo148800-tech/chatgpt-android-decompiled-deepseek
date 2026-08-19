package p053C;

import android.os.Build;
import android.view.Surface;

/* JADX INFO: renamed from: C.i */
/* JADX INFO: loaded from: classes.dex */
public final class C1474i {

    /* JADX INFO: renamed from: a */
    public final C1483r f3883a;

    public C1474i(int i10, Surface surface) {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 33) {
            this.f3883a = new C1481p(i10, surface);
            return;
        }
        if (i11 >= 28) {
            this.f3883a = new C1480o(i10, surface);
            return;
        }
        if (i11 >= 26) {
            this.f3883a = new C1478m(i10, surface);
        } else if (i11 >= 24) {
            this.f3883a = new C1476k(i10, surface);
        } else {
            this.f3883a = new C1483r(surface);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1474i)) {
            return false;
        }
        return this.f3883a.equals(((C1474i) obj).f3883a);
    }

    public final int hashCode() {
        return this.f3883a.hashCode();
    }

    public C1474i(C1476k c1476k) {
        this.f3883a = c1476k;
    }
}
