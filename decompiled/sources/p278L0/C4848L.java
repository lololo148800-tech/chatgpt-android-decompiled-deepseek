package p278L0;

import kotlin.jvm.internal.AbstractC16544l;
import mm.C17309l;
import p002A0.C0146w;
import p049Bm.InterfaceC1439n;
import p1071w0.AbstractC20734X;
import p1095x1.AbstractC21069X;
import p1095x1.InterfaceC21056J;
import p1095x1.InterfaceC21058L;
import p1095x1.InterfaceC21059M;
import p1140z1.AbstractC21668N;
import p1140z1.InterfaceC21718w;
import p273Kl.C4714D;
import p275Kn.C4816c;
import p349O0.C6002f0;
import p492U1.C7536a;
import p492U1.C7545j;
import p571X9.AbstractC9113C4;
import p635a1.AbstractC10458p;
import p658b5.C11246q;
import p860l0.EnumC16673F0;
import p909nm.C17690x;

/* JADX INFO: renamed from: L0.L */
/* JADX INFO: loaded from: classes.dex */
public final class C4848L extends AbstractC10458p implements InterfaceC21718w {

    /* JADX INFO: renamed from: A0 */
    public InterfaceC1439n f15779A0;

    /* JADX INFO: renamed from: B0 */
    public EnumC16673F0 f15780B0;

    /* JADX INFO: renamed from: C0 */
    public boolean f15781C0;

    /* JADX INFO: renamed from: z0 */
    public C11246q f15782z0;

    @Override // p635a1.AbstractC10458p
    /* JADX INFO: renamed from: D0 */
    public final void mo4226D0() {
        this.f15781C0 = false;
    }

    @Override // p1140z1.InterfaceC21718w
    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int mo2144d(AbstractC21668N abstractC21668N, InterfaceC21056J interfaceC21056J, int i10) {
        return AbstractC20734X.m21238i(this, abstractC21668N, interfaceC21056J, i10);
    }

    @Override // p1140z1.InterfaceC21718w
    /* JADX INFO: renamed from: f */
    public final InterfaceC21058L mo2145f(InterfaceC21059M interfaceC21059M, InterfaceC21056J interfaceC21056J, long j10) {
        AbstractC21069X abstractC21069XMo21533p = interfaceC21056J.mo21533p(j10);
        if (!interfaceC21059M.mo19937Z() || !this.f15781C0) {
            C17309l c17309l = (C17309l) this.f15779A0.invoke(new C7545j(AbstractC9113C4.m9643a(abstractC21069XMo21533p.f66981Y, abstractC21069XMo21533p.f66982Z)), new C7536a(j10));
            C11246q c11246q = this.f15782z0;
            C4855T c4855t = (C4855T) c17309l.f55136Y;
            if (!AbstractC16544l.m18089b(c11246q.m12638h(), c4855t)) {
                ((C6002f0) c11246q.f34076m).setValue(c4855t);
                Object obj = c17309l.f55137Z;
                C4714D c4714d = new C4714D(c11246q, 4, obj);
                C4816c c4816c = ((C4854S) c11246q.f34068e).f15814b;
                boolean zM5449f = c4816c.m5449f(null);
                if (zM5449f) {
                    try {
                        c4714d.invoke();
                        c4816c.m5450g(null);
                    } catch (Throwable th2) {
                        c4816c.m5450g(null);
                        throw th2;
                    }
                }
                if (!zM5449f) {
                    c11246q.m12625A(obj);
                }
            }
        }
        this.f15781C0 = interfaceC21059M.mo19937Z() || this.f15781C0;
        return interfaceC21059M.mo19936R(abstractC21069XMo21533p.f66981Y, abstractC21069XMo21533p.f66982Z, C17690x.f56481Y, new C0146w(interfaceC21059M, this, abstractC21069XMo21533p, 26));
    }

    @Override // p1140z1.InterfaceC21718w
    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int mo2146g(AbstractC21668N abstractC21668N, InterfaceC21056J interfaceC21056J, int i10) {
        return AbstractC20734X.m21234e(this, abstractC21668N, interfaceC21056J, i10);
    }

    @Override // p1140z1.InterfaceC21718w
    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int mo2147h(AbstractC21668N abstractC21668N, InterfaceC21056J interfaceC21056J, int i10) {
        return AbstractC20734X.m21242m(this, abstractC21668N, interfaceC21056J, i10);
    }

    @Override // p1140z1.InterfaceC21718w
    /* JADX INFO: renamed from: k */
    public final /* synthetic */ int mo2148k(AbstractC21668N abstractC21668N, InterfaceC21056J interfaceC21056J, int i10) {
        return AbstractC20734X.m21246q(this, abstractC21668N, interfaceC21056J, i10);
    }
}
