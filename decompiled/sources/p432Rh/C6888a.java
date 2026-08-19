package p432Rh;

import p086D6.C1970n;
import p1034u6.C20129g;
import p1034u6.C20140r;
import p103Dn.C2219z0;
import p364Oh.C6233g;
import p364Oh.C6240n;
import p364Oh.InterfaceC6247u;
import p571X9.AbstractC9138H;
import p658b5.C11241l;
import p900n6.C17507d;
import p917o6.C17851d;
import p917o6.InterfaceC17842J;
import p917o6.InterfaceC17846N;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: Rh.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C6888a {

    /* JADX INFO: renamed from: a */
    public final C17507d f22080a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC6247u f22081b;

    public C6888a(C17507d c17507d, InterfaceC6247u interfaceC6247u) {
        this.f22080a = c17507d;
        this.f22081b = interfaceC6247u;
    }

    /* JADX INFO: renamed from: a */
    public final Object m7285a(InterfaceC17846N interfaceC17846N, AbstractC19687c abstractC19687c) {
        return AbstractC9138H.m9684c(this, new C6233g(this, interfaceC17846N, null), abstractC19687c);
    }

    /* JADX INFO: renamed from: b */
    public final C1970n m7286b(InterfaceC17846N interfaceC17846N, C6240n c6240n) {
        C11241l c11241l = new C11241l(this.f22080a, (InterfaceC17842J) interfaceC17846N);
        C20129g c20129g = new C20129g(c6240n);
        C17851d c17851d = (C17851d) c11241l.f34017Z;
        c17851d.f56913c = c17851d.f56913c.mo4139b(c20129g);
        return new C1970n(new C2219z0(new C20140r(c11241l, null)), 14, this);
    }
}
