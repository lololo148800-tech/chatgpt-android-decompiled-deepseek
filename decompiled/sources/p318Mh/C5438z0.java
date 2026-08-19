package p318Mh;

import java.util.List;
import p544W9.AbstractC8477F3;
import p909nm.AbstractC17681o;

/* JADX INFO: renamed from: Mh.z0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5438z0 extends AbstractC5395e {

    /* JADX INFO: renamed from: g */
    public static final C5438z0 f17777g = new C5438z0("variants-in-stream");

    /* JADX INFO: renamed from: h */
    public static final C5370J0 f17778h;

    /* JADX INFO: renamed from: i */
    public static final List f17779i;

    static {
        C5370J0 c5370j0M9112b = AbstractC8477F3.m9112b();
        f17778h = c5370j0M9112b;
        f17779i = AbstractC17681o.m19382k(c5370j0M9112b, AbstractC8477F3.m9111a(EnumC5368I0.f17610o0));
    }

    @Override // p318Mh.AbstractC5362F0
    /* JADX INFO: renamed from: c */
    public final List mo5883c() {
        return f17779i;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof C5438z0);
    }

    public final int hashCode() {
        return -1734719617;
    }

    public final String toString() {
        return "█";
    }
}
