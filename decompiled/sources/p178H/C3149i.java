package p178H;

import android.view.Surface;

/* JADX INFO: renamed from: H.i */
/* JADX INFO: loaded from: classes.dex */
public final class C3149i extends AbstractC3166q0 {

    /* JADX INFO: renamed from: a */
    public final int f9473a;

    /* JADX INFO: renamed from: b */
    public final Surface f9474b;

    public C3149i(int i10, Surface surface) {
        this.f9473a = i10;
        if (surface == null) {
            throw new NullPointerException("Null surface");
        }
        this.f9474b = surface;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC3166q0)) {
            return false;
        }
        C3149i c3149i = (C3149i) ((AbstractC3166q0) obj);
        return this.f9473a == c3149i.f9473a && this.f9474b.equals(c3149i.f9474b);
    }

    public final int hashCode() {
        return this.f9474b.hashCode() ^ ((this.f9473a ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "Result{resultCode=" + this.f9473a + ", surface=" + this.f9474b + "}";
    }
}
