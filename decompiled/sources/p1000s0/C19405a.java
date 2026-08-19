package p1000s0;

import java.util.concurrent.CancellationException;
import p001A.C0042V0;
import p1001s1.InterfaceC19431a;
import p349O0.C5994b0;
import p492U1.C7550o;
import p523V9.AbstractC8226x0;
import p530Vi.AbstractC8301I;
import p759g1.C13800b;
import p860l0.EnumC16673F0;
import p972qm.InterfaceC18770c;

/* JADX INFO: renamed from: s0.a */
/* JADX INFO: loaded from: classes.dex */
public final class C19405a implements InterfaceC19431a {

    /* JADX INFO: renamed from: Y */
    public final C19408d f61482Y;

    /* JADX INFO: renamed from: Z */
    public final EnumC16673F0 f61483Z;

    public C19405a(C19408d c19408d, EnumC16673F0 enumC16673F0) {
        this.f61482Y = c19408d;
        this.f61483Z = enumC16673F0;
    }

    @Override // p1001s1.InterfaceC19431a
    /* JADX INFO: renamed from: K */
    public final long mo4038K(int i10, long j10) {
        if (AbstractC8226x0.m8860a(i10, 1)) {
            C19408d c19408d = this.f61482Y;
            if (Math.abs(((C5994b0) c19408d.f61440c.f207p0).m6409g()) > 1.0E-6d) {
                C0042V0 c0042v0 = c19408d.f61440c;
                float fM6409g = ((C5994b0) c0042v0.f207p0).m6409g() * c19408d.m20501m();
                float f10 = ((c19408d.m20499k().f61598b + c19408d.m20499k().f61599c) * (-Math.signum(((C5994b0) c0042v0.f207p0).m6409g()))) + fM6409g;
                if (((C5994b0) c0042v0.f207p0).m6409g() > 0.0f) {
                    f10 = fM6409g;
                    fM6409g = f10;
                }
                EnumC16673F0 enumC16673F0 = EnumC16673F0.f53402Z;
                EnumC16673F0 enumC16673F1 = this.f61483Z;
                float fM15307h = -c19408d.f61447j.mo5259e(-AbstractC8301I.m8920k(enumC16673F1 == enumC16673F0 ? C13800b.m15306g(j10) : C13800b.m15307h(j10), fM6409g, f10));
                float fM15306g = enumC16673F1 == enumC16673F0 ? fM15307h : C13800b.m15306g(j10);
                if (enumC16673F1 != EnumC16673F0.f53401Y) {
                    fM15307h = C13800b.m15307h(j10);
                }
                return C13800b.m15300a(fM15306g, fM15307h);
            }
        }
        return 0L;
    }

    @Override // p1001s1.InterfaceC19431a
    /* JADX INFO: renamed from: V */
    public final Object mo4039V(long j10, long j11, InterfaceC18770c interfaceC18770c) {
        return new C7550o(this.f61483Z == EnumC16673F0.f53401Y ? C7550o.m7901b(j11, 0.0f, 0.0f, 2) : C7550o.m7901b(j11, 0.0f, 0.0f, 1));
    }

    @Override // p1001s1.InterfaceC19431a
    /* JADX INFO: renamed from: p0 */
    public final Object mo4040p0(long j10, InterfaceC18770c interfaceC18770c) {
        return new C7550o(0L);
    }

    @Override // p1001s1.InterfaceC19431a
    /* JADX INFO: renamed from: x */
    public final long mo4041x(long j10, int i10, long j11) {
        if (!AbstractC8226x0.m8860a(i10, 2)) {
            return 0L;
        }
        if ((this.f61483Z == EnumC16673F0.f53402Z ? C13800b.m15306g(j11) : C13800b.m15307h(j11)) == 0.0f) {
            return 0L;
        }
        throw new CancellationException("Scroll cancelled");
    }
}
