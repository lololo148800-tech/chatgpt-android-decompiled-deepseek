package p318Mh;

import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p017Af.C0491v;
import p544W9.AbstractC8477F3;
import p571X9.AbstractC9393x3;

/* JADX INFO: renamed from: Mh.U */
/* JADX INFO: loaded from: classes3.dex */
public final class C5381U extends AbstractC5395e {

    /* JADX INFO: renamed from: g */
    public static final C5381U f17633g = new C5381U("conversation/image");

    /* JADX INFO: renamed from: h */
    public static final C5370J0 f17634h;

    /* JADX INFO: renamed from: i */
    public static final List f17635i;

    static {
        C5370J0 c5370j0M9112b = AbstractC8477F3.m9112b();
        f17634h = c5370j0M9112b;
        f17635i = AbstractC9393x3.m9974d(c5370j0M9112b);
    }

    @Override // p318Mh.AbstractC5362F0
    /* JADX INFO: renamed from: c */
    public final List mo5883c() {
        return f17635i;
    }

    /* JADX INFO: renamed from: d */
    public final String m5899d(String conversationId) {
        AbstractC16544l.m18094g(conversationId, "conversationId");
        return m5885a(new C0491v(conversationId, 24));
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof C5381U);
    }

    public final int hashCode() {
        return 2139699022;
    }

    public final String toString() {
        return "█";
    }
}
