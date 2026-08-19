package p736f0;

import androidx.compose.animation.AbstractC10832b;
import p025An.AbstractC0575H;
import p049Bm.InterfaceC1439n;
import p1095x1.AbstractC21069X;
import p1095x1.InterfaceC21056J;
import p1095x1.InterfaceC21058L;
import p1095x1.InterfaceC21059M;
import p349O0.C5975S;
import p349O0.C5997d;
import p349O0.C6002f0;
import p492U1.C7545j;
import p571X9.AbstractC9113C4;
import p571X9.AbstractC9388w4;
import p758g0.AbstractC13785r0;
import p758g0.C13756d;
import p758g0.InterfaceC13772l;
import p909nm.C17690x;

/* JADX INFO: renamed from: f0.P */
/* JADX INFO: loaded from: classes.dex */
public final class C13478P extends AbstractC13472J {

    /* JADX INFO: renamed from: A0 */
    public InterfaceC13772l f42649A0;

    /* JADX INFO: renamed from: B0 */
    public InterfaceC1439n f42650B0;

    /* JADX INFO: renamed from: C0 */
    public long f42651C0;

    /* JADX INFO: renamed from: D0 */
    public long f42652D0;

    /* JADX INFO: renamed from: E0 */
    public boolean f42653E0;

    /* JADX INFO: renamed from: F0 */
    public final C6002f0 f42654F0;

    public C13478P(InterfaceC13772l interfaceC13772l, InterfaceC1439n interfaceC1439n) {
        super(0);
        this.f42649A0 = interfaceC13772l;
        this.f42650B0 = interfaceC1439n;
        this.f42651C0 = AbstractC10832b.f32376a;
        this.f42652D0 = AbstractC9388w4.m9959b(0, 0, 15);
        this.f42654F0 = C5997d.m6430Q(null, C5975S.f19448r0);
    }

    @Override // p635a1.AbstractC10458p
    /* JADX INFO: renamed from: C0 */
    public final void mo438C0() {
        this.f42651C0 = AbstractC10832b.f32376a;
        this.f42653E0 = false;
    }

    @Override // p635a1.AbstractC10458p
    /* JADX INFO: renamed from: E0 */
    public final void mo10929E0() {
        this.f42654F0.setValue(null);
    }

    @Override // p736f0.AbstractC13472J, p1140z1.InterfaceC21718w
    /* JADX INFO: renamed from: f */
    public final InterfaceC21058L mo2145f(InterfaceC21059M interfaceC21059M, InterfaceC21056J interfaceC21056J, long j10) {
        AbstractC21069X abstractC21069XMo21533p;
        long jM9962e;
        if (interfaceC21059M.mo19937Z()) {
            this.f42652D0 = j10;
            this.f42653E0 = true;
            abstractC21069XMo21533p = interfaceC21056J.mo21533p(j10);
        } else {
            abstractC21069XMo21533p = interfaceC21056J.mo21533p(this.f42653E0 ? this.f42652D0 : j10);
        }
        AbstractC21069X abstractC21069X = abstractC21069XMo21533p;
        long jM9643a = AbstractC9113C4.m9643a(abstractC21069X.f66981Y, abstractC21069X.f66982Z);
        if (interfaceC21059M.mo19937Z()) {
            this.f42651C0 = jM9643a;
            jM9962e = jM9643a;
        } else {
            long j11 = !C7545j.m7886a(this.f42651C0, AbstractC10832b.f32376a) ? this.f42651C0 : jM9643a;
            C6002f0 c6002f0 = this.f42654F0;
            C13475M c13475m = (C13475M) c6002f0.getValue();
            if (c13475m != null) {
                C13756d c13756d = c13475m.f42637a;
                boolean z6 = (C7545j.m7886a(j11, ((C7545j) c13756d.m15224e()).f23903a) || c13756d.m15225f()) ? false : true;
                if (!C7545j.m7886a(j11, ((C7545j) c13756d.f43413e.getValue()).f23903a) || z6) {
                    c13475m.f42638b = ((C7545j) c13756d.m15224e()).f23903a;
                    AbstractC0575H.m1156D(m10935y0(), null, null, new C13476N(c13475m, j11, this, null), 3);
                }
            } else {
                c13475m = new C13475M(new C13756d(new C7545j(j11), AbstractC13785r0.f43535h, new C7545j(AbstractC9113C4.m9643a(1, 1)), 8), j11);
            }
            c6002f0.setValue(c13475m);
            jM9962e = AbstractC9388w4.m9962e(j10, ((C7545j) c13475m.f42637a.m15224e()).f23903a);
        }
        int i10 = (int) (jM9962e >> 32);
        int i11 = (int) (jM9962e & 4294967295L);
        return interfaceC21059M.mo19936R(i10, i11, C17690x.f56481Y, new C13477O(this, jM9643a, i10, i11, interfaceC21059M, abstractC21069X));
    }
}
