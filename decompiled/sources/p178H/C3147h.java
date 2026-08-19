package p178H;

import p414R.C6779m;

/* JADX INFO: renamed from: H.h */
/* JADX INFO: loaded from: classes.dex */
public final class C3147h {

    /* JADX INFO: renamed from: a */
    public final C6779m f9471a;

    public C3147h(C6779m c6779m) {
        if (c6779m == null) {
            throw new NullPointerException("Null surfaceOutput");
        }
        this.f9471a = c6779m;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3147h)) {
            return false;
        }
        C3147h c3147h = (C3147h) obj;
        c3147h.getClass();
        return this.f9471a.equals(c3147h.f9471a);
    }

    public final int hashCode() {
        return this.f9471a.hashCode() ^ (-721379959);
    }

    public final String toString() {
        return "Event{eventCode=0, surfaceOutput=" + this.f9471a + "}";
    }
}
