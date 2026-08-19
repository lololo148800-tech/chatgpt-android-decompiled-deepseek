package p773h0;

import android.view.View;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p025An.AbstractC0575H;
import p049Bm.InterfaceC1436k;
import p077Cn.C1743k;
import p1140z1.AbstractC21678Y;
import p1140z1.AbstractC21690f;
import p1140z1.C21660F;
import p1140z1.InterfaceC21681a0;
import p1140z1.InterfaceC21701k0;
import p1140z1.InterfaceC21708o;
import p1140z1.InterfaceC21710p;
import p156G1.C2963j;
import p349O0.C5944C;
import p349O0.C5975S;
import p349O0.C5997d;
import p349O0.C6002f0;
import p492U1.C7542g;
import p492U1.C7545j;
import p492U1.InterfaceC7537b;
import p523V9.AbstractC8017W3;
import p523V9.AbstractC8088f6;
import p571X9.AbstractC9113C4;
import p635a1.AbstractC10458p;
import p759g1.C13800b;

/* JADX INFO: renamed from: h0.e0 */
/* JADX INFO: loaded from: classes.dex */
public final class C14280e0 extends AbstractC10458p implements InterfaceC21710p, InterfaceC21708o, InterfaceC21701k0, InterfaceC21681a0 {

    /* JADX INFO: renamed from: A0 */
    public InterfaceC1436k f44798A0;

    /* JADX INFO: renamed from: B0 */
    public InterfaceC1436k f44799B0;

    /* JADX INFO: renamed from: C0 */
    public float f44800C0;

    /* JADX INFO: renamed from: D0 */
    public boolean f44801D0;

    /* JADX INFO: renamed from: E0 */
    public long f44802E0;

    /* JADX INFO: renamed from: F0 */
    public float f44803F0;

    /* JADX INFO: renamed from: G0 */
    public float f44804G0;

    /* JADX INFO: renamed from: H0 */
    public boolean f44805H0;

    /* JADX INFO: renamed from: I0 */
    public InterfaceC14304q0 f44806I0;

    /* JADX INFO: renamed from: J0 */
    public View f44807J0;

    /* JADX INFO: renamed from: K0 */
    public InterfaceC7537b f44808K0;

    /* JADX INFO: renamed from: L0 */
    public InterfaceC14302p0 f44809L0;

    /* JADX INFO: renamed from: N0 */
    public C5944C f44811N0;

    /* JADX INFO: renamed from: P0 */
    public C7545j f44813P0;

    /* JADX INFO: renamed from: Q0 */
    public C1743k f44814Q0;

    /* JADX INFO: renamed from: z0 */
    public AbstractC16546n f44815z0;

    /* JADX INFO: renamed from: M0 */
    public final C6002f0 f44810M0 = C5997d.m6430Q(null, C5975S.f19445o0);

    /* JADX INFO: renamed from: O0 */
    public long f44812O0 = 9205357640488583168L;

    /* JADX WARN: Multi-variable type inference failed */
    public C14280e0(InterfaceC1436k interfaceC1436k, InterfaceC1436k interfaceC1436k2, InterfaceC1436k interfaceC1436k3, float f10, boolean z6, long j10, float f11, float f12, boolean z10, InterfaceC14304q0 interfaceC14304q0) {
        this.f44815z0 = (AbstractC16546n) interfaceC1436k;
        this.f44798A0 = interfaceC1436k2;
        this.f44799B0 = interfaceC1436k3;
        this.f44800C0 = f10;
        this.f44801D0 = z6;
        this.f44802E0 = j10;
        this.f44803F0 = f11;
        this.f44804G0 = f12;
        this.f44805H0 = z10;
        this.f44806I0 = interfaceC14304q0;
    }

    @Override // p1140z1.InterfaceC21701k0
    /* JADX INFO: renamed from: B */
    public final void mo424B(C2963j c2963j) {
        c2963j.m3787m(AbstractC14282f0.f44819a, new C14276c0(this, 1));
    }

    @Override // p635a1.AbstractC10458p
    /* JADX INFO: renamed from: C0 */
    public final void mo438C0() {
        mo2488j0();
        this.f44814Q0 = AbstractC8017W3.m8337a(0, 7, null);
        AbstractC0575H.m1156D(m10935y0(), null, null, new C14278d0(this, null), 3);
    }

    @Override // p635a1.AbstractC10458p
    /* JADX INFO: renamed from: D0 */
    public final void mo4226D0() {
        InterfaceC14302p0 interfaceC14302p0 = this.f44809L0;
        if (interfaceC14302p0 != null) {
            ((C14306r0) interfaceC14302p0).m15597b();
        }
        this.f44809L0 = null;
    }

    @Override // p1140z1.InterfaceC21701k0
    /* JADX INFO: renamed from: E */
    public final /* synthetic */ boolean mo425E() {
        return false;
    }

    /* JADX INFO: renamed from: K0 */
    public final long m15567K0() {
        if (this.f44811N0 == null) {
            this.f44811N0 = C5997d.m6421H(new C14276c0(this, 0));
        }
        C5944C c5944c = this.f44811N0;
        if (c5944c != null) {
            return ((C13800b) c5944c.getValue()).f43584a;
        }
        return 9205357640488583168L;
    }

    @Override // p1140z1.InterfaceC21708o
    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void mo427L() {
    }

    /* JADX INFO: renamed from: L0 */
    public final void m15568L0() {
        InterfaceC14302p0 interfaceC14302p0 = this.f44809L0;
        if (interfaceC14302p0 != null) {
            ((C14306r0) interfaceC14302p0).m15597b();
        }
        View viewM22219x = this.f44807J0;
        if (viewM22219x == null) {
            viewM22219x = AbstractC21690f.m22219x(this);
        }
        View view = viewM22219x;
        this.f44807J0 = view;
        InterfaceC7537b interfaceC7537b = this.f44808K0;
        if (interfaceC7537b == null) {
            interfaceC7537b = AbstractC21690f.m22217v(this).f68633D0;
        }
        InterfaceC7537b interfaceC7537b2 = interfaceC7537b;
        this.f44808K0 = interfaceC7537b2;
        this.f44809L0 = this.f44806I0.mo15596b(view, this.f44801D0, this.f44802E0, this.f44803F0, this.f44804G0, this.f44805H0, interfaceC7537b2, this.f44800C0);
        m15570N0();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [Bm.k, kotlin.jvm.internal.n] */
    /* JADX INFO: renamed from: M0 */
    public final void m15569M0() {
        InterfaceC7537b interfaceC7537b = this.f44808K0;
        if (interfaceC7537b == null) {
            interfaceC7537b = AbstractC21690f.m22217v(this).f68633D0;
            this.f44808K0 = interfaceC7537b;
        }
        long j10 = ((C13800b) this.f44815z0.invoke(interfaceC7537b)).f43584a;
        long jM15311l = 9205357640488583168L;
        if (!AbstractC8088f6.m8538d(j10) || !AbstractC8088f6.m8538d(m15567K0())) {
            this.f44812O0 = 9205357640488583168L;
            InterfaceC14302p0 interfaceC14302p0 = this.f44809L0;
            if (interfaceC14302p0 != null) {
                ((C14306r0) interfaceC14302p0).m15597b();
                return;
            }
            return;
        }
        this.f44812O0 = C13800b.m15311l(m15567K0(), j10);
        InterfaceC1436k interfaceC1436k = this.f44798A0;
        if (interfaceC1436k != null) {
            long j11 = ((C13800b) interfaceC1436k.invoke(interfaceC7537b)).f43584a;
            C13800b c13800b = new C13800b(j11);
            if (!AbstractC8088f6.m8538d(j11)) {
                c13800b = null;
            }
            if (c13800b != null) {
                jM15311l = C13800b.m15311l(m15567K0(), c13800b.f43584a);
            }
        }
        long j12 = jM15311l;
        if (this.f44809L0 == null) {
            m15568L0();
        }
        InterfaceC14302p0 interfaceC14302p1 = this.f44809L0;
        if (interfaceC14302p1 != null) {
            interfaceC14302p1.mo15594a(this.f44800C0, this.f44812O0, j12);
        }
        m15570N0();
    }

    /* JADX INFO: renamed from: N0 */
    public final void m15570N0() {
        InterfaceC7537b interfaceC7537b;
        InterfaceC14302p0 interfaceC14302p0 = this.f44809L0;
        if (interfaceC14302p0 == null || (interfaceC7537b = this.f44808K0) == null) {
            return;
        }
        C14306r0 c14306r0 = (C14306r0) interfaceC14302p0;
        long jM15598c = c14306r0.m15598c();
        C7545j c7545j = this.f44813P0;
        if ((c7545j instanceof C7545j) && jM15598c == c7545j.f23903a) {
            return;
        }
        InterfaceC1436k interfaceC1436k = this.f44799B0;
        if (interfaceC1436k != null) {
            interfaceC1436k.invoke(new C7542g(interfaceC7537b.mo7868s(AbstractC9113C4.m9645c(c14306r0.m15598c()))));
        }
        this.f44813P0 = new C7545j(c14306r0.m15598c());
    }

    @Override // p1140z1.InterfaceC21710p
    /* JADX INFO: renamed from: c */
    public final void mo2143c(AbstractC21678Y abstractC21678Y) {
        this.f44810M0.setValue(abstractC21678Y);
    }

    @Override // p1140z1.InterfaceC21708o
    /* JADX INFO: renamed from: e */
    public final void mo430e(C21660F c21660f) {
        c21660f.m22080a();
        C1743k c1743k = this.f44814Q0;
        if (c1743k != null) {
            c1743k.mo2524p(C17296C.f55119a);
        }
    }

    @Override // p1140z1.InterfaceC21681a0
    /* JADX INFO: renamed from: j0 */
    public final void mo2488j0() {
        AbstractC21690f.m22214s(this, new C14276c0(this, 2));
    }

    @Override // p1140z1.InterfaceC21701k0
    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ boolean mo432u0() {
        return false;
    }
}
