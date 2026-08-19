package p774h1;

import kotlin.jvm.internal.AbstractC16544l;
import p228J.AbstractC3794B0;
import p492U1.EnumC7546k;
import p492U1.InterfaceC7537b;

/* JADX INFO: renamed from: h1.N */
/* JADX INFO: loaded from: classes.dex */
public final class C14336N implements InterfaceC7537b {

    /* JADX INFO: renamed from: A0 */
    public InterfaceC14339Q f44977A0;

    /* JADX INFO: renamed from: B0 */
    public boolean f44978B0;

    /* JADX INFO: renamed from: C0 */
    public int f44979C0;

    /* JADX INFO: renamed from: D0 */
    public long f44980D0;

    /* JADX INFO: renamed from: E0 */
    public InterfaceC7537b f44981E0;

    /* JADX INFO: renamed from: F0 */
    public EnumC7546k f44982F0;

    /* JADX INFO: renamed from: G0 */
    public AbstractC14332J f44983G0;

    /* JADX INFO: renamed from: Y */
    public int f44984Y;

    /* JADX INFO: renamed from: Z */
    public float f44985Z;

    /* JADX INFO: renamed from: o0 */
    public float f44986o0;

    /* JADX INFO: renamed from: p0 */
    public float f44987p0;

    /* JADX INFO: renamed from: q0 */
    public float f44988q0;

    /* JADX INFO: renamed from: r0 */
    public float f44989r0;

    /* JADX INFO: renamed from: s0 */
    public float f44990s0;

    /* JADX INFO: renamed from: t0 */
    public long f44991t0;

    /* JADX INFO: renamed from: u0 */
    public long f44992u0;

    /* JADX INFO: renamed from: v0 */
    public float f44993v0;

    /* JADX INFO: renamed from: w0 */
    public float f44994w0;

    /* JADX INFO: renamed from: x0 */
    public float f44995x0;

    /* JADX INFO: renamed from: y0 */
    public float f44996y0;

    /* JADX INFO: renamed from: z0 */
    public long f44997z0;

    @Override // p492U1.InterfaceC7537b
    /* JADX INFO: renamed from: F */
    public final long mo7859F(int i10) {
        return m15663q(mo7861O(i10));
    }

    @Override // p492U1.InterfaceC7537b
    /* JADX INFO: renamed from: J */
    public final long mo7860J(float f10) {
        return m15663q(mo7862P(f10));
    }

    @Override // p492U1.InterfaceC7537b
    /* JADX INFO: renamed from: O */
    public final float mo7861O(int i10) {
        return i10 / getDensity();
    }

    @Override // p492U1.InterfaceC7537b
    /* JADX INFO: renamed from: P */
    public final float mo7862P(float f10) {
        return f10 / getDensity();
    }

    @Override // p492U1.InterfaceC7537b
    /* JADX INFO: renamed from: X */
    public final float mo7863X() {
        return this.f44981E0.mo7863X();
    }

    /* JADX INFO: renamed from: a */
    public final void m15649a(float f10) {
        if (this.f44987p0 == f10) {
            return;
        }
        this.f44984Y |= 4;
        this.f44987p0 = f10;
    }

    /* JADX INFO: renamed from: b */
    public final void m15650b(long j10) {
        if (C14365u.m15775c(this.f44991t0, j10)) {
            return;
        }
        this.f44984Y |= 64;
        this.f44991t0 = j10;
    }

    @Override // p492U1.InterfaceC7537b
    /* JADX INFO: renamed from: b0 */
    public final float mo7864b0(float f10) {
        return getDensity() * f10;
    }

    /* JADX INFO: renamed from: c */
    public final void m15651c(boolean z6) {
        if (this.f44978B0 != z6) {
            this.f44984Y |= 16384;
            this.f44978B0 = z6;
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m15652d(float f10) {
        if (this.f44993v0 == f10) {
            return;
        }
        this.f44984Y |= 256;
        this.f44993v0 = f10;
    }

    /* JADX INFO: renamed from: e */
    public final void m15653e(float f10) {
        if (this.f44994w0 == f10) {
            return;
        }
        this.f44984Y |= 512;
        this.f44994w0 = f10;
    }

    /* JADX INFO: renamed from: f */
    public final void m15654f(float f10) {
        if (this.f44995x0 == f10) {
            return;
        }
        this.f44984Y |= 1024;
        this.f44995x0 = f10;
    }

    /* JADX INFO: renamed from: g */
    public final void m15655g(float f10) {
        if (this.f44985Z == f10) {
            return;
        }
        this.f44984Y |= 1;
        this.f44985Z = f10;
    }

    @Override // p492U1.InterfaceC7537b
    public final float getDensity() {
        return this.f44981E0.getDensity();
    }

    /* JADX INFO: renamed from: h */
    public final void m15656h(float f10) {
        if (this.f44986o0 == f10) {
            return;
        }
        this.f44984Y |= 2;
        this.f44986o0 = f10;
    }

    @Override // p492U1.InterfaceC7537b
    /* JADX INFO: renamed from: i0 */
    public final int mo7865i0(long j10) {
        return Math.round(mo7869t0(j10));
    }

    /* JADX INFO: renamed from: j */
    public final void m15657j(float f10) {
        if (this.f44990s0 == f10) {
            return;
        }
        this.f44984Y |= 32;
        this.f44990s0 = f10;
    }

    /* JADX INFO: renamed from: k */
    public final void m15658k(InterfaceC14339Q interfaceC14339Q) {
        if (AbstractC16544l.m18089b(this.f44977A0, interfaceC14339Q)) {
            return;
        }
        this.f44984Y |= 8192;
        this.f44977A0 = interfaceC14339Q;
    }

    @Override // p492U1.InterfaceC7537b
    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ int mo7866k0(float f10) {
        return AbstractC3794B0.m4485j(this, f10);
    }

    /* JADX INFO: renamed from: l */
    public final void m15659l(long j10) {
        if (C14365u.m15775c(this.f44992u0, j10)) {
            return;
        }
        this.f44984Y |= 128;
        this.f44992u0 = j10;
    }

    /* JADX INFO: renamed from: n */
    public final void m15660n(long j10) {
        if (C14343V.m15667a(this.f44997z0, j10)) {
            return;
        }
        this.f44984Y |= 4096;
        this.f44997z0 = j10;
    }

    /* JADX INFO: renamed from: o */
    public final void m15661o(float f10) {
        if (this.f44988q0 == f10) {
            return;
        }
        this.f44984Y |= 8;
        this.f44988q0 = f10;
    }

    /* JADX INFO: renamed from: p */
    public final void m15662p(float f10) {
        if (this.f44989r0 == f10) {
            return;
        }
        this.f44984Y |= 16;
        this.f44989r0 = f10;
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ long m15663q(float f10) {
        return AbstractC3794B0.m4490o(this, f10);
    }

    @Override // p492U1.InterfaceC7537b
    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ long mo7867r0(long j10) {
        return AbstractC3794B0.m4489n(j10, this);
    }

    @Override // p492U1.InterfaceC7537b
    /* JADX INFO: renamed from: s */
    public final /* synthetic */ long mo7868s(long j10) {
        return AbstractC3794B0.m4487l(j10, this);
    }

    @Override // p492U1.InterfaceC7537b
    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ float mo7869t0(long j10) {
        return AbstractC3794B0.m4488m(j10, this);
    }

    @Override // p492U1.InterfaceC7537b
    /* JADX INFO: renamed from: w */
    public final /* synthetic */ float mo7870w(long j10) {
        return AbstractC3794B0.m4486k(j10, this);
    }
}
