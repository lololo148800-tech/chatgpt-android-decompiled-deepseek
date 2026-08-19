package p228J;

import java.util.ArrayList;
import java.util.Collections;
import p001A.C0100z;
import p178H.C3179x;
import p239Ja.C4307j;
import p277L.ExecutorC4828a;
import p283L5.AbstractC4941g;
import p301M.AbstractC5229k;
import p301M.C5222d;
import p301M.C5225g;
import p301M.C5233o;
import p544W9.AbstractC8577W2;
import p747fb.InterfaceFutureC13608b;

/* JADX INFO: renamed from: J.n0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3851n0 extends AbstractC3812N {

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ int f11645o0 = 0;

    /* JADX INFO: renamed from: p0 */
    public final Object f11646p0;

    public C3851n0(InterfaceC3864u interfaceC3864u) {
        super(interfaceC3864u, 0);
        this.f11646p0 = interfaceC3864u;
    }

    @Override // p228J.AbstractC3812N, p228J.InterfaceC3864u
    /* JADX INFO: renamed from: c */
    public InterfaceFutureC13608b mo299c(boolean z6) {
        switch (this.f11645o0) {
            case 0:
                return ((InterfaceC3864u) this.f11646p0).mo299c(z6);
            default:
                return super.mo299c(z6);
        }
    }

    @Override // p228J.AbstractC3812N, p228J.InterfaceC3864u
    /* JADX INFO: renamed from: f */
    public InterfaceFutureC13608b mo302f(C3179x c3179x) {
        switch (this.f11645o0) {
            case 0:
                return ((InterfaceC3864u) this.f11646p0).mo302f(c3179x);
            default:
                return super.mo302f(c3179x);
        }
    }

    @Override // p228J.AbstractC3812N, p228J.InterfaceC3864u
    /* JADX INFO: renamed from: g */
    public InterfaceFutureC13608b mo303g(float f10) {
        switch (this.f11645o0) {
            case 0:
                return ((InterfaceC3864u) this.f11646p0).mo303g(f10);
            default:
                return super.mo303g(f10);
        }
    }

    @Override // p228J.AbstractC3812N, p228J.InterfaceC3864u
    /* JADX INFO: renamed from: o */
    public InterfaceFutureC13608b mo308o(ArrayList arrayList, int i10, int i11) {
        switch (this.f11645o0) {
            case 1:
                AbstractC4941g.m5554M("Only support one capture config.", arrayList.size() == 1);
                InterfaceFutureC13608b interfaceFutureC13608bMo310q = ((InterfaceC3864u) this.f11539Z).mo310q(i10, i11);
                C5222d c5222dM5765c = C5222d.m5765c(interfaceFutureC13608bMo310q);
                C5225g c5225g = new C5225g(interfaceFutureC13608bMo310q, 2);
                ExecutorC4828a executorC4828aM9240b = AbstractC8577W2.m9240b();
                c5222dM5765c.getClass();
                return new C5233o(new ArrayList(Collections.singletonList(AbstractC5229k.m5782f(AbstractC5229k.m5782f(AbstractC5229k.m5782f(c5222dM5765c, c5225g, executorC4828aM9240b), new C0100z(this, 20, arrayList), AbstractC8577W2.m9240b()), new C5225g(interfaceFutureC13608bMo310q, 3), AbstractC8577W2.m9240b()))), true, AbstractC8577W2.m9240b());
            default:
                return super.mo308o(arrayList, i10, i11);
        }
    }

    public C3851n0(InterfaceC3864u interfaceC3864u, C4307j c4307j) {
        super(interfaceC3864u, 0);
        this.f11646p0 = c4307j;
    }
}
