package p748fc;

import android.content.Context;
import ec.InterfaceC13365g;
import p057C3.C1565j;
import p1009s9.C19503f;
import p110E4.C2307e;
import p228J.AbstractC3812N;
import p501Ub.C7604f;
import p594Y9.AbstractC9799R4;
import p594Y9.C9788P4;
import p768gc.C13836a;

/* JADX INFO: renamed from: fc.g */
/* JADX INFO: loaded from: classes.dex */
public final class C13615g extends AbstractC3812N {

    /* JADX INFO: renamed from: o0 */
    public final C7604f f43005o0;

    public C13615g(C7604f c7604f) {
        super(4, (byte) 0);
        this.f43005o0 = c7604f;
    }

    @Override // p228J.AbstractC3812N
    /* JADX INFO: renamed from: s */
    public final Object mo4535s(Object obj) {
        C13836a c13836a = (C13836a) ((InterfaceC13365g) obj);
        C9788P4 c9788p4M10422d = AbstractC9799R4.m10422d(c13836a.m15475b());
        Context contextM7952b = this.f43005o0.m7952b();
        C19503f.f61952b.getClass();
        return new C13610b(c9788p4M10422d, (C19503f.m20600a(contextM7952b) >= 204700000 || c13836a.m15474a()) ? new C1565j(contextM7952b, c13836a, c9788p4M10422d) : new C2307e(contextM7952b), c13836a);
    }
}
