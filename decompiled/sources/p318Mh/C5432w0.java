package p318Mh;

import java.util.List;
import p544W9.AbstractC8477F3;
import p909nm.AbstractC17681o;

/* JADX INFO: renamed from: Mh.w0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5432w0 extends AbstractC5395e {

    /* JADX INFO: renamed from: g */
    public static final C5432w0 f17762g = new C5432w0("text-selection/{messageId}");

    /* JADX INFO: renamed from: h */
    public static final C5370J0 f17763h;

    /* JADX INFO: renamed from: i */
    public static final C5370J0 f17764i;

    /* JADX INFO: renamed from: j */
    public static final List f17765j;

    static {
        C5370J0 c5370j0M9112b = AbstractC8477F3.m9112b();
        f17763h = c5370j0M9112b;
        C5370J0 c5370j0M9115e = AbstractC8477F3.m9115e();
        f17764i = c5370j0M9115e;
        f17765j = AbstractC17681o.m19382k(c5370j0M9112b, c5370j0M9115e);
    }

    @Override // p318Mh.AbstractC5362F0
    /* JADX INFO: renamed from: c */
    public final List mo5883c() {
        return f17765j;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof C5432w0);
    }

    public final int hashCode() {
        return -595681247;
    }

    public final String toString() {
        return "█";
    }
}
