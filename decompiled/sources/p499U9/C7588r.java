package p499U9;

import android.content.Context;
import java.util.ArrayList;
import p228J.AbstractC3812N;
import p501Ub.C7604f;
import p501Ub.C7607i;
import p522V8.C7836c;
import p523V9.C8200t6;
import p523V9.C8216v6;
import p523V9.C8232x6;
import p525Vb.C8258a;
import p543W8.C8440a;
import p544W9.C8502J4;
import p544W9.C8514L4;
import p544W9.C8520M4;
import p571X9.C9149I4;
import p571X9.C9155J4;
import p571X9.C9173M4;
import p593Y8.C9691r;
import p594Y9.C9764L4;
import p594Y9.C9770M4;
import p594Y9.C9788P4;

/* JADX INFO: renamed from: U9.r */
/* JADX INFO: loaded from: classes.dex */
public final class C7588r extends AbstractC3812N {

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ int f24010o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7588r(int i10) {
        super(4, (byte) 0);
        this.f24010o0 = i10;
    }

    @Override // p228J.AbstractC3812N
    /* JADX INFO: renamed from: s */
    public final Object mo4535s(Object obj) {
        switch (this.f24010o0) {
            case 0:
                C7604f c7604fM7950c = C7604f.m7950c();
                Context contextM7952b = C7604f.m7950c().m7952b();
                ArrayList arrayList = new ArrayList();
                ((C7585o) obj).getClass();
                C8258a c8258a = new C8258a();
                C8440a c8440a = C8440a.f26277e;
                C9691r.m10283b(contextM7952b);
                C9691r.m10282a().m10284c(c8440a);
                C8440a.f26276d.contains(new C7836c("json"));
                arrayList.add(c8258a);
                return new C7587q(c7604fM7950c.m7952b(), (C7607i) c7604fM7950c.m7951a(C7607i.class));
            case 1:
                C8200t6 c8200t6 = (C8200t6) obj;
                C7604f c7604fM7950c2 = C7604f.m7950c();
                return new C8232x6(c7604fM7950c2.m7952b(), (C7607i) c7604fM7950c2.m7951a(C7607i.class), new C8216v6(C7604f.m7950c().m7952b(), c8200t6), c8200t6.f25644a);
            case 2:
                C7604f c7604fM7950c3 = C7604f.m7950c();
                return new C8520M4(c7604fM7950c3.m7952b(), (C7607i) c7604fM7950c3.m7951a(C7607i.class), new C8514L4(C7604f.m7950c().m7952b(), (C8502J4) obj));
            case 3:
                C9149I4 c9149i4 = (C9149I4) obj;
                C7604f c7604fM7950c4 = C7604f.m7950c();
                return new C9173M4(c7604fM7950c4.m7952b(), (C7607i) c7604fM7950c4.m7951a(C7607i.class), new C9155J4(C7604f.m7950c().m7952b(), c9149i4), c9149i4.f27927a);
            default:
                C9764L4 c9764l4 = (C9764L4) obj;
                C7604f c7604fM7950c5 = C7604f.m7950c();
                return new C9788P4(c7604fM7950c5.m7952b(), (C7607i) c7604fM7950c5.m7951a(C7607i.class), new C9770M4(C7604f.m7950c().m7952b(), c9764l4), c9764l4.f29289a);
        }
    }
}
