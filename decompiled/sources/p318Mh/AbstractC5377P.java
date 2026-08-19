package p318Mh;

import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p292Lg.C5034f;
import p544W9.AbstractC8477F3;
import p571X9.AbstractC9393x3;

/* JADX INFO: renamed from: Mh.P */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5377P extends AbstractC5362F0 {

    /* JADX INFO: renamed from: g */
    public final C5370J0 f17628g;

    /* JADX INFO: renamed from: h */
    public final List f17629h;

    public AbstractC5377P(String str) {
        super(str.concat("/{id}"));
        C5370J0 c5370j0M9113c = AbstractC8477F3.m9113c();
        this.f17628g = c5370j0M9113c;
        this.f17629h = AbstractC9393x3.m9974d(c5370j0M9113c);
    }

    @Override // p318Mh.AbstractC5362F0
    /* JADX INFO: renamed from: c */
    public final List mo5883c() {
        return this.f17629h;
    }

    /* JADX INFO: renamed from: d */
    public final String m5898d(String gizmoId) {
        AbstractC16544l.m18094g(gizmoId, "gizmoId");
        return m5885a(new C5034f(this, 2, gizmoId));
    }
}
