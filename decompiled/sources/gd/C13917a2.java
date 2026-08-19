package gd;

import kotlin.jvm.internal.AbstractC16526C;

/* JADX INFO: renamed from: gd.a2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C13917a2 extends AbstractC13910Y1 {

    /* JADX INFO: renamed from: d */
    public static final C13917a2 f43969d;

    static {
        EnumC13884P1 enumC13884P1 = EnumC13884P1.GrowthByDevice;
        AbstractC16526C.f51263a.mo5693b(Integer.TYPE);
        f43969d = new C13917a2(Integer.MAX_VALUE, enumC13884P1, "no_auth_rate_limit_count");
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof C13917a2);
    }

    public final int hashCode() {
        return 1323755393;
    }

    public final String toString() {
        return "█";
    }
}
