package p318Mh;

import java.util.List;
import p1155zi.EnumC22040o1;
import p544W9.AbstractC8477F3;
import p571X9.AbstractC9393x3;

/* JADX INFO: renamed from: Mh.j0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5406j0 extends AbstractC5362F0 {

    /* JADX INFO: renamed from: g */
    public static final C5406j0 f17676g = new C5406j0("notification-task");

    /* JADX INFO: renamed from: h */
    public static final C5370J0 f17677h;

    /* JADX INFO: renamed from: i */
    public static final List f17678i;

    static {
        C5370J0 c5370j0M9117g = AbstractC8477F3.m9117g("notificationCategory", EnumC22040o1.Companion.serializer(), null);
        f17677h = c5370j0M9117g;
        f17678i = AbstractC9393x3.m9974d(c5370j0M9117g);
    }

    @Override // p318Mh.AbstractC5362F0
    /* JADX INFO: renamed from: c */
    public final List mo5883c() {
        return f17678i;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof C5406j0);
    }

    public final int hashCode() {
        return -811006255;
    }

    public final String toString() {
        return "█";
    }
}
