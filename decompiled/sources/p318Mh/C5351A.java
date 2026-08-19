package p318Mh;

import java.util.List;
import p1155zi.EnumC22055s0;
import p544W9.AbstractC8477F3;
import p571X9.AbstractC9393x3;

/* JADX INFO: renamed from: Mh.A */
/* JADX INFO: loaded from: classes3.dex */
public final class C5351A extends AbstractC5362F0 {

    /* JADX INFO: renamed from: g */
    public static final C5351A f17575g = new C5351A("custom-instructions/{instruction}");

    /* JADX INFO: renamed from: h */
    public static final C5370J0 f17576h;

    /* JADX INFO: renamed from: i */
    public static final List f17577i;

    static {
        C5370J0 c5370j0M9117g = AbstractC8477F3.m9117g("instruction", EnumC22055s0.Companion.serializer(), null);
        f17576h = c5370j0M9117g;
        f17577i = AbstractC9393x3.m9974d(c5370j0M9117g);
    }

    @Override // p318Mh.AbstractC5362F0
    /* JADX INFO: renamed from: c */
    public final List mo5883c() {
        return f17577i;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof C5351A);
    }

    public final int hashCode() {
        return 1051096030;
    }

    public final String toString() {
        return "█";
    }
}
