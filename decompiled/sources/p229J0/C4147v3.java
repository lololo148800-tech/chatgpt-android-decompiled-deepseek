package p229J0;

import p049Bm.InterfaceC1436k;
import p1001s1.InterfaceC19431a;
import p349O0.C5994b0;
import p492U1.C7550o;
import p523V9.AbstractC8088f6;
import p523V9.AbstractC8226x0;
import p658b5.C11246q;
import p759g1.C13800b;
import p972qm.InterfaceC18770c;

/* JADX INFO: renamed from: J0.v3 */
/* JADX INFO: loaded from: classes.dex */
public final class C4147v3 implements InterfaceC19431a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C3880A3 f13432Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC1436k f13433Z;

    public C4147v3(C3880A3 c3880a3, InterfaceC1436k interfaceC1436k) {
        this.f13432Y = c3880a3;
        this.f13433Z = interfaceC1436k;
    }

    @Override // p1001s1.InterfaceC19431a
    /* JADX INFO: renamed from: K */
    public final long mo4038K(int i10, long j10) {
        float fM15307h = C13800b.m15307h(j10);
        if (fM15307h >= 0.0f || !AbstractC8226x0.m8860a(i10, 1)) {
            return 0L;
        }
        C11246q c11246q = this.f13432Y.f11737c;
        float fM12652v = c11246q.m12652v(fM15307h);
        C5994b0 c5994b0 = (C5994b0) c11246q.f34073j;
        float fM6409g = Float.isNaN(c5994b0.m6409g()) ? 0.0f : c5994b0.m6409g();
        c5994b0.m6410h(fM12652v);
        return AbstractC8088f6.m8536b(0.0f, fM12652v - fM6409g);
    }

    @Override // p1001s1.InterfaceC19431a
    /* JADX INFO: renamed from: V */
    public final Object mo4039V(long j10, long j11, InterfaceC18770c interfaceC18770c) {
        this.f13433Z.invoke(new Float(C7550o.m7903d(j11)));
        return new C7550o(j11);
    }

    @Override // p1001s1.InterfaceC19431a
    /* JADX INFO: renamed from: p0 */
    public final Object mo4040p0(long j10, InterfaceC18770c interfaceC18770c) {
        float fM7903d = C7550o.m7903d(j10);
        C3880A3 c3880a3 = this.f13432Y;
        float fM12653w = c3880a3.f11737c.m12653w();
        float fM5501c = c3880a3.f11737c.m12638h().m5501c();
        if (fM7903d >= 0.0f || fM12653w <= fM5501c) {
            j10 = 0;
        } else {
            this.f13433Z.invoke(new Float(fM7903d));
        }
        return new C7550o(j10);
    }

    @Override // p1001s1.InterfaceC19431a
    /* JADX INFO: renamed from: x */
    public final long mo4041x(long j10, int i10, long j11) {
        if (!AbstractC8226x0.m8860a(i10, 1)) {
            return 0L;
        }
        C11246q c11246q = this.f13432Y.f11737c;
        float fM12652v = c11246q.m12652v(C13800b.m15307h(j11));
        C5994b0 c5994b0 = (C5994b0) c11246q.f34073j;
        float fM6409g = Float.isNaN(c5994b0.m6409g()) ? 0.0f : c5994b0.m6409g();
        c5994b0.m6410h(fM12652v);
        return AbstractC8088f6.m8536b(0.0f, fM12652v - fM6409g);
    }
}
