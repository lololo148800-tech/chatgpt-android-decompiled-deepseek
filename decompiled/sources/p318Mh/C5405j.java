package p318Mh;

import java.util.List;
import p1143z4.AbstractC21767I;
import p228J.AbstractC3812N;
import p571X9.AbstractC9393x3;

/* JADX INFO: renamed from: Mh.j */
/* JADX INFO: loaded from: classes3.dex */
public final class C5405j extends AbstractC5362F0 {

    /* JADX INFO: renamed from: g */
    public static final C5405j f17672g = new C5405j("aip/{functionId}");

    /* JADX INFO: renamed from: h */
    public static final C5370J0 f17673h;

    /* JADX INFO: renamed from: i */
    public static final List f17674i;

    /* JADX INFO: renamed from: j */
    public static final C5403i f17675j;

    static {
        C5370J0 c5370j0 = new C5370J0("functionId", AbstractC21767I.f69048j, true, null);
        f17673h = c5370j0;
        f17674i = AbstractC9393x3.m9974d(c5370j0);
        f17675j = new C5403i(0);
    }

    @Override // p318Mh.AbstractC5362F0
    /* JADX INFO: renamed from: b */
    public final AbstractC3812N mo5884b() {
        return f17675j;
    }

    @Override // p318Mh.AbstractC5362F0
    /* JADX INFO: renamed from: c */
    public final List mo5883c() {
        return f17674i;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof C5405j);
    }

    public final int hashCode() {
        return 1976639405;
    }

    public final String toString() {
        return "█";
    }
}
