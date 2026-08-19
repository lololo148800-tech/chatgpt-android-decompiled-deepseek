package bd;

import com.openai.design.modifier.AbstractC12221a;
import kotlin.jvm.internal.AbstractC16544l;
import p025An.AbstractC0575H;
import p049Bm.InterfaceC1439n;
import p1095x1.AbstractC21069X;
import p1095x1.InterfaceC21056J;
import p1095x1.InterfaceC21058L;
import p1095x1.InterfaceC21059M;
import p1140z1.AbstractC21668N;
import p1140z1.InterfaceC21718w;
import p349O0.C5975S;
import p349O0.C5997d;
import p349O0.C6002f0;
import p492U1.C7545j;
import p571X9.AbstractC9113C4;
import p571X9.AbstractC9388w4;
import p635a1.AbstractC10458p;
import p758g0.AbstractC13785r0;
import p758g0.C13756d;
import p758g0.InterfaceC13772l;
import p909nm.C17690x;

/* JADX INFO: renamed from: bd.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C11343d extends AbstractC10458p implements InterfaceC21718w {

    /* JADX INFO: renamed from: A0 */
    public InterfaceC1439n f34292A0;

    /* JADX INFO: renamed from: D0 */
    public boolean f34295D0;

    /* JADX INFO: renamed from: z0 */
    public InterfaceC13772l f34297z0;

    /* JADX INFO: renamed from: B0 */
    public long f34293B0 = AbstractC12221a.f37249a;

    /* JADX INFO: renamed from: C0 */
    public long f34294C0 = AbstractC9388w4.m9959b(0, 0, 15);

    /* JADX INFO: renamed from: E0 */
    public final C6002f0 f34296E0 = C5997d.m6430Q(null, C5975S.f19448r0);

    public C11343d(InterfaceC13772l interfaceC13772l, InterfaceC1439n interfaceC1439n) {
        this.f34297z0 = interfaceC13772l;
        this.f34292A0 = interfaceC1439n;
    }

    @Override // p635a1.AbstractC10458p
    /* JADX INFO: renamed from: C0 */
    public final void mo438C0() {
        this.f34293B0 = AbstractC12221a.f37249a;
        this.f34295D0 = false;
    }

    @Override // p635a1.AbstractC10458p
    /* JADX INFO: renamed from: E0 */
    public final void mo10929E0() {
        this.f34296E0.setValue(null);
    }

    @Override // p1140z1.InterfaceC21718w
    /* JADX INFO: renamed from: d */
    public final int mo2144d(AbstractC21668N abstractC21668N, InterfaceC21056J measurable, int i10) {
        AbstractC16544l.m18094g(measurable, "measurable");
        return measurable.mo21532o(i10);
    }

    @Override // p1140z1.InterfaceC21718w
    /* JADX INFO: renamed from: f */
    public final InterfaceC21058L mo2145f(InterfaceC21059M interfaceC21059M, InterfaceC21056J measurable, long j10) {
        AbstractC21069X abstractC21069XMo21533p;
        long jM9962e;
        AbstractC16544l.m18094g(measurable, "measurable");
        if (interfaceC21059M.mo19937Z()) {
            this.f34294C0 = j10;
            this.f34295D0 = true;
            abstractC21069XMo21533p = measurable.mo21533p(j10);
        } else {
            abstractC21069XMo21533p = measurable.mo21533p(this.f34295D0 ? this.f34294C0 : j10);
        }
        AbstractC21069X abstractC21069X = abstractC21069XMo21533p;
        long jM9643a = AbstractC9113C4.m9643a(abstractC21069X.f66981Y, abstractC21069X.f66982Z);
        if (interfaceC21059M.mo19937Z()) {
            this.f34293B0 = jM9643a;
            jM9962e = jM9643a;
        } else {
            long j11 = !C7545j.m7886a(this.f34293B0, AbstractC12221a.f37249a) ? this.f34293B0 : jM9643a;
            C6002f0 c6002f0 = this.f34296E0;
            C11340a c11340a = (C11340a) c6002f0.getValue();
            if (c11340a != null) {
                C13756d c13756d = c11340a.f34281a;
                boolean z6 = (C7545j.m7886a(j11, ((C7545j) c13756d.m15224e()).f23903a) || c13756d.m15225f()) ? false : true;
                if (!C7545j.m7886a(j11, ((C7545j) c13756d.f43413e.getValue()).f23903a) || z6) {
                    c11340a.f34282b = ((C7545j) c13756d.m15224e()).f23903a;
                    AbstractC0575H.m1156D(m10935y0(), null, null, new C11341b(c11340a, j11, this, null), 3);
                }
            } else {
                c11340a = new C11340a(new C13756d(new C7545j(j11), AbstractC13785r0.f43535h, new C7545j(AbstractC9113C4.m9643a(1, 1)), 8), j11);
            }
            c6002f0.setValue(c11340a);
            jM9962e = AbstractC9388w4.m9962e(j10, ((C7545j) c11340a.f34281a.m15224e()).f23903a);
        }
        int i10 = (int) (jM9962e & 4294967295L);
        return interfaceC21059M.mo19936R((int) (jM9643a >> 32), i10, C17690x.f56481Y, new C11342c(this, jM9643a, i10, interfaceC21059M, abstractC21069X));
    }

    @Override // p1140z1.InterfaceC21718w
    /* JADX INFO: renamed from: g */
    public final int mo2146g(AbstractC21668N abstractC21668N, InterfaceC21056J measurable, int i10) {
        AbstractC16544l.m18094g(measurable, "measurable");
        return measurable.mo21530b(i10);
    }

    @Override // p1140z1.InterfaceC21718w
    /* JADX INFO: renamed from: h */
    public final int mo2147h(AbstractC21668N abstractC21668N, InterfaceC21056J measurable, int i10) {
        AbstractC16544l.m18094g(measurable, "measurable");
        return measurable.mo21529G(i10);
    }

    @Override // p1140z1.InterfaceC21718w
    /* JADX INFO: renamed from: k */
    public final int mo2148k(AbstractC21668N abstractC21668N, InterfaceC21056J measurable, int i10) {
        AbstractC16544l.m18094g(measurable, "measurable");
        return measurable.mo21531l(i10);
    }
}
