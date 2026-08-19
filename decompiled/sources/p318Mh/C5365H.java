package p318Mh;

import java.util.List;
import p1155zi.EnumC21896B0;
import p544W9.AbstractC8477F3;
import p571X9.AbstractC9393x3;

/* JADX INFO: renamed from: Mh.H */
/* JADX INFO: loaded from: classes3.dex */
public final class C5365H extends AbstractC5362F0 {

    /* JADX INFO: renamed from: g */
    public static final C5365H f17604g = new C5365H("disclosure/{type}");

    /* JADX INFO: renamed from: h */
    public static final C5370J0 f17605h;

    /* JADX INFO: renamed from: i */
    public static final List f17606i;

    static {
        C5370J0 c5370j0M9117g = AbstractC8477F3.m9117g("type", EnumC21896B0.Companion.serializer(), null);
        f17605h = c5370j0M9117g;
        f17606i = AbstractC9393x3.m9974d(c5370j0M9117g);
    }

    @Override // p318Mh.AbstractC5362F0
    /* JADX INFO: renamed from: c */
    public final List mo5883c() {
        return f17606i;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof C5365H);
    }

    public final int hashCode() {
        return -1896550421;
    }

    public final String toString() {
        return "█";
    }
}
