package p030B2;

import android.view.DisplayCutout;
import p1053v3.p1054lN.IGDwkYw;
import p817j$.util.Objects;

/* JADX INFO: renamed from: B2.k */
/* JADX INFO: loaded from: classes.dex */
public final class C0765k {

    /* JADX INFO: renamed from: a */
    public final DisplayCutout f2160a;

    public C0765k(DisplayCutout displayCutout) {
        this.f2160a = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0765k.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f2160a, ((C0765k) obj).f2160a);
    }

    public final int hashCode() {
        return this.f2160a.hashCode();
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f2160a + IGDwkYw.NcfbtHgadrxIh;
    }
}
