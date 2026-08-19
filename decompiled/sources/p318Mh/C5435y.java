package p318Mh;

import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p006A4.C0353n;
import p1143z4.AbstractC21767I;
import p544W9.AbstractC8477F3;
import p909nm.AbstractC17681o;

/* JADX INFO: renamed from: Mh.y */
/* JADX INFO: loaded from: classes3.dex */
public final class C5435y extends AbstractC5395e {

    /* JADX INFO: renamed from: g */
    public static final C5435y f17770g = new C5435y("conversation/spreadsheet");

    /* JADX INFO: renamed from: h */
    public static final C5370J0 f17771h;

    /* JADX INFO: renamed from: i */
    public static final C5370J0 f17772i;

    /* JADX INFO: renamed from: j */
    public static final C5370J0 f17773j;

    /* JADX INFO: renamed from: k */
    public static final List f17774k;

    static {
        C5370J0 c5370j0M9112b = AbstractC8477F3.m9112b();
        f17771h = c5370j0M9112b;
        C5370J0 c5370j0 = new C5370J0("fileId", AbstractC21767I.f69048j, true, null);
        f17772i = c5370j0;
        C5370J0 c5370j1 = new C5370J0("selectionAllowed", AbstractC21767I.f69046h, true, null);
        f17773j = c5370j1;
        f17774k = AbstractC17681o.m19382k(c5370j0M9112b, c5370j0, c5370j1);
    }

    @Override // p318Mh.AbstractC5362F0
    /* JADX INFO: renamed from: c */
    public final List mo5883c() {
        return f17774k;
    }

    /* JADX INFO: renamed from: d */
    public final String m5904d(String conversationId, String fileId, boolean z6) {
        AbstractC16544l.m18094g(conversationId, "conversationId");
        AbstractC16544l.m18094g(fileId, "fileId");
        return m5885a(new C0353n(conversationId, fileId, z6));
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof C5435y);
    }

    public final int hashCode() {
        return 2051993099;
    }

    public final String toString() {
        return "█";
    }
}
