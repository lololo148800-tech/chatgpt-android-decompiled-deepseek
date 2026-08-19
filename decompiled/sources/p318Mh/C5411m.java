package p318Mh;

import java.util.List;
import p544W9.AbstractC8477F3;
import p909nm.AbstractC17681o;

/* JADX INFO: renamed from: Mh.m */
/* JADX INFO: loaded from: classes3.dex */
public final class C5411m extends AbstractC5395e {

    /* JADX INFO: renamed from: g */
    public static final C5411m f17686g = new C5411m("businesses-map");

    /* JADX INFO: renamed from: h */
    public static final C5370J0 f17687h;

    /* JADX INFO: renamed from: i */
    public static final C5370J0 f17688i;

    /* JADX INFO: renamed from: j */
    public static final List f17689j;

    static {
        C5370J0 c5370j0M9112b = AbstractC8477F3.m9112b();
        f17687h = c5370j0M9112b;
        C5370J0 c5370j0M9115e = AbstractC8477F3.m9115e();
        f17688i = c5370j0M9115e;
        f17689j = AbstractC17681o.m19382k(c5370j0M9112b, c5370j0M9115e);
    }

    @Override // p318Mh.AbstractC5362F0
    /* JADX INFO: renamed from: c */
    public final List mo5883c() {
        return f17689j;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof C5411m);
    }

    public final int hashCode() {
        return 1480958800;
    }

    public final String toString() {
        return "█";
    }
}
