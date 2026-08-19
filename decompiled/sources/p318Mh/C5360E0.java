package p318Mh;

import java.util.List;
import p1155zi.EnumC21946N2;
import p544W9.AbstractC8477F3;
import p571X9.AbstractC9393x3;

/* JADX INFO: renamed from: Mh.E0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5360E0 extends AbstractC5362F0 {

    /* JADX INFO: renamed from: g */
    public static final C5360E0 f17592g = new C5360E0("voice-training/{trainingType}");

    /* JADX INFO: renamed from: h */
    public static final C5370J0 f17593h;

    /* JADX INFO: renamed from: i */
    public static final List f17594i;

    static {
        C5370J0 c5370j0M9117g = AbstractC8477F3.m9117g("trainingType", EnumC21946N2.Companion.serializer(), null);
        f17593h = c5370j0M9117g;
        f17594i = AbstractC9393x3.m9974d(c5370j0M9117g);
    }

    @Override // p318Mh.AbstractC5362F0
    /* JADX INFO: renamed from: c */
    public final List mo5883c() {
        return f17594i;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof C5360E0);
    }

    public final int hashCode() {
        return -772944530;
    }

    public final String toString() {
        return "█";
    }
}
