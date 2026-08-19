package p318Mh;

import java.util.List;
import p1155zi.EnumC21974X0;
import p544W9.AbstractC8477F3;
import p571X9.AbstractC9393x3;

/* JADX INFO: renamed from: Mh.M */
/* JADX INFO: loaded from: classes3.dex */
public final class C5374M extends AbstractC5362F0 {

    /* JADX INFO: renamed from: g */
    public static final C5374M f17623g = new C5374M("feature-interstitial/{feature}");

    /* JADX INFO: renamed from: h */
    public static final C5370J0 f17624h;

    /* JADX INFO: renamed from: i */
    public static final List f17625i;

    static {
        C5370J0 c5370j0M9117g = AbstractC8477F3.m9117g("feature", EnumC21974X0.Companion.serializer(), null);
        f17624h = c5370j0M9117g;
        f17625i = AbstractC9393x3.m9974d(c5370j0M9117g);
    }

    @Override // p318Mh.AbstractC5362F0
    /* JADX INFO: renamed from: c */
    public final List mo5883c() {
        return f17625i;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof C5374M);
    }

    public final int hashCode() {
        return 1767427332;
    }

    public final String toString() {
        return "█";
    }
}
