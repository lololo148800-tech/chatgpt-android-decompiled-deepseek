package p736f0;

import androidx.compose.animation.AbstractC10832b;
import p049Bm.InterfaceC1426a;
import p054C0.C1501n;
import p1095x1.AbstractC21069X;
import p1095x1.InterfaceC21056J;
import p1095x1.InterfaceC21058L;
import p1095x1.InterfaceC21059M;
import p482Tg.C7448e;
import p492U1.C7543h;
import p492U1.C7545j;
import p492U1.EnumC7546k;
import p571X9.AbstractC9113C4;
import p571X9.AbstractC9388w4;
import p635a1.C10444b;
import p635a1.InterfaceC10446d;
import p758g0.C13759e0;
import p758g0.C13761f0;
import p758g0.C13771k0;
import p774h1.C14343V;
import p909nm.C17690x;

/* JADX INFO: renamed from: f0.D */
/* JADX INFO: loaded from: classes.dex */
public final class C13466D extends AbstractC13472J {

    /* JADX INFO: renamed from: A0 */
    public C13771k0 f42609A0;

    /* JADX INFO: renamed from: B0 */
    public C13761f0 f42610B0;

    /* JADX INFO: renamed from: C0 */
    public C13761f0 f42611C0;

    /* JADX INFO: renamed from: D0 */
    public C13761f0 f42612D0;

    /* JADX INFO: renamed from: E0 */
    public C13467E f42613E0;

    /* JADX INFO: renamed from: F0 */
    public C13468F f42614F0;

    /* JADX INFO: renamed from: G0 */
    public InterfaceC1426a f42615G0;

    /* JADX INFO: renamed from: H0 */
    public C13505w f42616H0;

    /* JADX INFO: renamed from: I0 */
    public long f42617I0;

    /* JADX INFO: renamed from: J0 */
    public InterfaceC10446d f42618J0;

    /* JADX INFO: renamed from: K0 */
    public final C13465C f42619K0;

    /* JADX INFO: renamed from: L0 */
    public final C13465C f42620L0;

    public C13466D(C13771k0 c13771k0, C13761f0 c13761f0, C13761f0 c13761f1, C13761f0 c13761f2, C13467E c13467e, C13468F c13468f, InterfaceC1426a interfaceC1426a, C13505w c13505w) {
        super(0);
        this.f42609A0 = c13771k0;
        this.f42610B0 = c13761f0;
        this.f42611C0 = c13761f1;
        this.f42612D0 = c13761f2;
        this.f42613E0 = c13467e;
        this.f42614F0 = c13468f;
        this.f42615G0 = interfaceC1426a;
        this.f42616H0 = c13505w;
        this.f42617I0 = AbstractC10832b.f32376a;
        AbstractC9388w4.m9959b(0, 0, 15);
        this.f42619K0 = new C13465C(this, 0);
        this.f42620L0 = new C13465C(this, 1);
    }

    @Override // p635a1.AbstractC10458p
    /* JADX INFO: renamed from: C0 */
    public final void mo438C0() {
        this.f42617I0 = AbstractC10832b.f32376a;
    }

    /* JADX INFO: renamed from: M0 */
    public final InterfaceC10446d m14994M0() {
        InterfaceC10446d interfaceC10446d;
        if (this.f42609A0.m15275f().mo15005b(EnumC13504v.f42754Y, EnumC13504v.f42755Z)) {
            C13501s c13501s = this.f42613E0.f42622a.f42662c;
            if (c13501s == null || (interfaceC10446d = c13501s.f42744a) == null) {
                C13501s c13501s2 = this.f42614F0.f42625a.f42662c;
                if (c13501s2 != null) {
                    return c13501s2.f42744a;
                }
                return null;
            }
        } else {
            C13501s c13501s3 = this.f42614F0.f42625a.f42662c;
            if (c13501s3 == null || (interfaceC10446d = c13501s3.f42744a) == null) {
                C13501s c13501s4 = this.f42613E0.f42622a.f42662c;
                if (c13501s4 != null) {
                    return c13501s4.f42744a;
                }
                return null;
            }
        }
        return interfaceC10446d;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00b9  */
    @Override // p736f0.AbstractC13472J, p1140z1.InterfaceC21718w
    /* JADX INFO: renamed from: f */
    public final InterfaceC21058L mo2145f(InterfaceC21059M interfaceC21059M, InterfaceC21056J interfaceC21056J, long j10) {
        C14343V c14343v;
        C13759e0 c13759e0M15259a;
        long j11;
        long jMo10925a;
        if (this.f42609A0.m15272c() == this.f42609A0.f43492d.getValue()) {
            this.f42618J0 = null;
        } else if (this.f42618J0 == null) {
            InterfaceC10446d interfaceC10446dM14994M0 = m14994M0();
            if (interfaceC10446dM14994M0 == null) {
                interfaceC10446dM14994M0 = C10444b.f30934Y;
            }
            this.f42618J0 = interfaceC10446dM14994M0;
        }
        boolean zMo19937Z = interfaceC21059M.mo19937Z();
        C17690x c17690x = C17690x.f56481Y;
        if (zMo19937Z) {
            AbstractC21069X abstractC21069XMo21533p = interfaceC21056J.mo21533p(j10);
            long jM9643a = AbstractC9113C4.m9643a(abstractC21069XMo21533p.f66981Y, abstractC21069XMo21533p.f66982Z);
            this.f42617I0 = jM9643a;
            return interfaceC21059M.mo19936R((int) (jM9643a >> 32), (int) (4294967295L & jM9643a), c17690x, new C1501n(abstractC21069XMo21533p, 5));
        }
        if (!((Boolean) this.f42615G0.invoke()).booleanValue()) {
            AbstractC21069X abstractC21069XMo21533p2 = interfaceC21056J.mo21533p(j10);
            return interfaceC21059M.mo19936R(abstractC21069XMo21533p2.f66981Y, abstractC21069XMo21533p2.f66982Z, c17690x, new C1501n(abstractC21069XMo21533p2, 6));
        }
        C13505w c13505w = this.f42616H0;
        C13761f0 c13761f0 = c13505w.f42758a;
        C13467E c13467e = c13505w.f42761d;
        C13468F c13468f = c13505w.f42762e;
        C13759e0 c13759e0M15259a2 = c13761f0 != null ? c13761f0.m15259a(new C13506x(c13467e, c13468f, 0), new C13506x(c13467e, c13468f, 1)) : null;
        C13761f0 c13761f1 = c13505w.f42759b;
        C13759e0 c13759e0M15259a3 = c13761f1 != null ? c13761f1.m15259a(new C13506x(c13467e, c13468f, 2), new C13506x(c13467e, c13468f, 3)) : null;
        Object objM15272c = c13505w.f42760c.m15272c();
        EnumC13504v enumC13504v = EnumC13504v.f42754Y;
        C13482U c13482u = c13467e.f42622a;
        if (objM15272c == enumC13504v) {
            C13473K c13473k = c13482u.f42663d;
            if (c13473k != null) {
                c14343v = new C14343V(c13473k.f42634b);
            } else {
                C13473K c13473k2 = c13468f.f42625a.f42663d;
                if (c13473k2 != null) {
                    c14343v = new C14343V(c13473k2.f42634b);
                } else {
                    c14343v = null;
                }
            }
        } else {
            C13473K c13473k3 = c13468f.f42625a.f42663d;
            if (c13473k3 != null) {
                c14343v = new C14343V(c13473k3.f42634b);
            } else {
                C13473K c13473k4 = c13482u.f42663d;
                if (c13473k4 != null) {
                    c14343v = new C14343V(c13473k4.f42634b);
                } else {
                    c14343v = null;
                }
            }
        }
        C13761f0 c13761f2 = c13505w.f42763f;
        C7448e c7448e = new C7448e(c13759e0M15259a2, c13759e0M15259a3, c13761f2 != null ? c13761f2.m15259a(C13485c.f42692z0, new C7448e(c14343v, c13467e, c13468f, 20)) : null, 19);
        AbstractC21069X abstractC21069XMo21533p3 = interfaceC21056J.mo21533p(j10);
        long jM9643a2 = AbstractC9113C4.m9643a(abstractC21069XMo21533p3.f66981Y, abstractC21069XMo21533p3.f66982Z);
        long j12 = !C7545j.m7886a(this.f42617I0, AbstractC10832b.f32376a) ? this.f42617I0 : jM9643a2;
        C13761f0 c13761f3 = this.f42610B0;
        if (c13761f3 != null) {
            c13759e0M15259a = c13761f3.m15259a(this.f42619K0, new C13464B(this, j12, 0));
        } else {
            c13759e0M15259a = null;
        }
        if (c13759e0M15259a != null) {
            jM9643a2 = ((C7545j) c13759e0M15259a.getValue()).f23903a;
        }
        long jM9962e = AbstractC9388w4.m9962e(j10, jM9643a2);
        C13761f0 c13761f4 = this.f42611C0;
        long j13 = c13761f4 != null ? ((C7543h) c13761f4.m15259a(C13485c.f42679K0, new C13464B(this, j12, 1)).getValue()).f23897a : 0L;
        C13761f0 c13761f5 = this.f42612D0;
        if (c13761f5 != null) {
            j11 = ((C7543h) c13761f5.m15259a(this.f42620L0, new C13464B(this, j12, 2)).getValue()).f23897a;
        } else {
            j11 = 0;
        }
        InterfaceC10446d interfaceC10446d = this.f42618J0;
        if (interfaceC10446d != null) {
            jMo10925a = interfaceC10446d.mo10925a(j12, jM9962e, EnumC7546k.f23904Y);
        } else {
            jMo10925a = 0;
        }
        return interfaceC21059M.mo19936R((int) (jM9962e >> 32), (int) (4294967295L & jM9962e), c17690x, new C13463A(abstractC21069XMo21533p3, C7543h.m7882d(jMo10925a, j11), j13, c7448e, 0));
    }
}
