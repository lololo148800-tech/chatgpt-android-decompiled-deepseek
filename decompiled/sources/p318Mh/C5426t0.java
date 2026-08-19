package p318Mh;

import java.util.List;
import p1155zi.EnumC22080y1;
import p228J.AbstractC3812N;
import p544W9.AbstractC8477F3;
import p909nm.AbstractC17681o;

/* JADX INFO: renamed from: Mh.t0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5426t0 extends AbstractC5362F0 {

    /* JADX INFO: renamed from: g */
    public static final C5426t0 f17732g = new C5426t0("subscription");

    /* JADX INFO: renamed from: h */
    public static final C5370J0 f17733h;

    /* JADX INFO: renamed from: i */
    public static final C5370J0 f17734i;

    /* JADX INFO: renamed from: j */
    public static final List f17735j;

    /* JADX INFO: renamed from: k */
    public static final C5403i f17736k;

    static {
        C5370J0 c5370j0M9117g = AbstractC8477F3.m9117g("offeringType", EnumC22080y1.Companion.serializer(), EnumC22080y1.f69795p0);
        f17733h = c5370j0M9117g;
        C5370J0 c5370j0M9117g2 = AbstractC8477F3.m9117g("entryPoint", EnumC5424s0.Companion.serializer(), EnumC5424s0.DeepLink);
        f17734i = c5370j0M9117g2;
        f17735j = AbstractC17681o.m19382k(c5370j0M9117g, c5370j0M9117g2);
        f17736k = new C5403i(1);
    }

    @Override // p318Mh.AbstractC5362F0
    /* JADX INFO: renamed from: b */
    public final AbstractC3812N mo5884b() {
        return f17736k;
    }

    @Override // p318Mh.AbstractC5362F0
    /* JADX INFO: renamed from: c */
    public final List mo5883c() {
        return f17735j;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof C5426t0);
    }

    public final int hashCode() {
        return 91379611;
    }

    public final String toString() {
        return "█";
    }
}
