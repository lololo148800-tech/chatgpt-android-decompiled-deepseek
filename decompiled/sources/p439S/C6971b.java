package p439S;

import java.util.ArrayList;
import p414R.C6778l;

/* JADX INFO: renamed from: S.b */
/* JADX INFO: loaded from: classes.dex */
public final class C6971b {

    /* JADX INFO: renamed from: a */
    public final C6778l f22283a;

    /* JADX INFO: renamed from: b */
    public final C6778l f22284b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f22285c;

    public C6971b(C6778l c6778l, C6778l c6778l2, ArrayList arrayList) {
        if (c6778l == null) {
            throw new NullPointerException("Null primarySurfaceEdge");
        }
        this.f22283a = c6778l;
        if (c6778l2 == null) {
            throw new NullPointerException("Null secondarySurfaceEdge");
        }
        this.f22284b = c6778l2;
        this.f22285c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6971b)) {
            return false;
        }
        C6971b c6971b = (C6971b) obj;
        return this.f22283a.equals(c6971b.f22283a) && this.f22284b.equals(c6971b.f22284b) && this.f22285c.equals(c6971b.f22285c);
    }

    public final int hashCode() {
        return ((((this.f22283a.hashCode() ^ 1000003) * 1000003) ^ this.f22284b.hashCode()) * 1000003) ^ this.f22285c.hashCode();
    }

    public final String toString() {
        return "In{primarySurfaceEdge=" + this.f22283a + ", secondarySurfaceEdge=" + this.f22284b + ", outConfigs=" + this.f22285c + "}";
    }
}
