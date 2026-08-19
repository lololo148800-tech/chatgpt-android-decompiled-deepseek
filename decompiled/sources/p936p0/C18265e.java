package p936p0;

import java.util.ArrayList;
import p013Ab.C0420b;
import p017Af.C0485p;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1440o;
import p406Qg.C6702M;
import p537W0.C8410b;
import p953q0.AbstractC18551I;

/* JADX INFO: renamed from: p0.e */
/* JADX INFO: loaded from: classes.dex */
public final class C18265e extends AbstractC18551I {

    /* JADX INFO: renamed from: b */
    public final C0420b f58229b = new C0420b(15, (byte) 0);

    /* JADX INFO: renamed from: c */
    public ArrayList f58230c;

    public C18265e(InterfaceC1436k interfaceC1436k) {
        interfaceC1436k.invoke(this);
    }

    @Override // p953q0.AbstractC18551I
    /* JADX INFO: renamed from: k */
    public final C0420b mo19801k() {
        return this.f58229b;
    }

    /* JADX INFO: renamed from: o */
    public final void m19802o(Object obj, Object obj2, InterfaceC1440o interfaceC1440o) {
        this.f58229b.m1047b(1, new C18264d(obj != null ? new C6702M(obj, 3) : null, new C6702M(obj2, 4), new C8410b(new C0485p(interfaceC1440o, 13), true, -1010194746)));
    }

    /* JADX INFO: renamed from: p */
    public final void m19803p(int i10, InterfaceC1436k interfaceC1436k, InterfaceC1436k interfaceC1436k2, C8410b c8410b) {
        this.f58229b.m1047b(i10, new C18264d(interfaceC1436k, interfaceC1436k2, c8410b));
    }
}
