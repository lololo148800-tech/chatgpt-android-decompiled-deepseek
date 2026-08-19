package p318Mh;

import android.gov.nist.javax.sip.header.ParameterNames;
import java.util.List;
import p1155zi.C21966U1;
import p1155zi.C22011h0;
import p228J.AbstractC3812N;
import p544W9.AbstractC8477F3;
import p571X9.AbstractC9393x3;

/* JADX INFO: renamed from: Mh.C0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5356C0 extends AbstractC5395e {

    /* JADX INFO: renamed from: g */
    public static final C5356C0 f17585g = new C5356C0("view-shared-conversation/{sharedId}");

    /* JADX INFO: renamed from: h */
    public static final C5370J0 f17586h;

    /* JADX INFO: renamed from: i */
    public static final List f17587i;

    /* JADX INFO: renamed from: j */
    public static final C5403i f17588j;

    static {
        AbstractC8477F3.m9116f(ParameterNames.f31999ID, C22011h0.Companion.serializer());
        C5370J0 c5370j0M9117g = AbstractC8477F3.m9117g("sharedId", C21966U1.Companion.serializer(), null);
        f17586h = c5370j0M9117g;
        f17587i = AbstractC9393x3.m9974d(c5370j0M9117g);
        f17588j = new C5403i(2);
    }

    @Override // p318Mh.AbstractC5362F0
    /* JADX INFO: renamed from: b */
    public final AbstractC3812N mo5884b() {
        return f17588j;
    }

    @Override // p318Mh.AbstractC5362F0
    /* JADX INFO: renamed from: c */
    public final List mo5883c() {
        return f17587i;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof C5356C0);
    }

    public final int hashCode() {
        return 1620401675;
    }

    public final String toString() {
        return "█";
    }
}
