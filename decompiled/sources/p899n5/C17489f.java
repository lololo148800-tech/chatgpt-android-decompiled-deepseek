package p899n5;

import android.graphics.drawable.BitmapDrawable;

/* JADX INFO: renamed from: n5.f */
/* JADX INFO: loaded from: classes.dex */
public final class C17489f {

    /* JADX INFO: renamed from: a */
    public final BitmapDrawable f55956a;

    /* JADX INFO: renamed from: b */
    public final boolean f55957b;

    public C17489f(BitmapDrawable bitmapDrawable, boolean z6) {
        this.f55956a = bitmapDrawable;
        this.f55957b = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C17489f) {
            C17489f c17489f = (C17489f) obj;
            if (this.f55956a.equals(c17489f.f55956a) && this.f55957b == c17489f.f55957b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f55956a.hashCode() * 31) + (this.f55957b ? 1231 : 1237);
    }
}
