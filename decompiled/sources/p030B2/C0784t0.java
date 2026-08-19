package p030B2;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import p817j$.util.Objects;

/* JADX INFO: renamed from: B2.t0 */
/* JADX INFO: loaded from: classes.dex */
public class C0784t0 extends C0782s0 {
    public C0784t0(C0794y0 c0794y0, WindowInsets windowInsets) {
        super(c0794y0, windowInsets);
    }

    @Override // p030B2.C0790w0
    /* JADX INFO: renamed from: a */
    public C0794y0 mo1774a() {
        return C0794y0.m1812g(null, this.f2186c.consumeDisplayCutout());
    }

    @Override // p030B2.C0790w0
    /* JADX INFO: renamed from: e */
    public C0765k mo1775e() {
        DisplayCutout displayCutout = this.f2186c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new C0765k(displayCutout);
    }

    @Override // p030B2.AbstractC0780r0, p030B2.C0790w0
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0784t0)) {
            return false;
        }
        C0784t0 c0784t0 = (C0784t0) obj;
        return Objects.equals(this.f2186c, c0784t0.f2186c) && Objects.equals(this.f2190g, c0784t0.f2190g);
    }

    @Override // p030B2.C0790w0
    public int hashCode() {
        return this.f2186c.hashCode();
    }
}
