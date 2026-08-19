package p492U1;

import com.google.protobuf.AbstractC12107L1;
import kotlin.jvm.internal.AbstractC16544l;
import p160G5.p161rK.TVCuK;
import p228J.AbstractC3794B0;
import p516V1.InterfaceC7737a;
import p571X9.AbstractC9119D4;

/* JADX INFO: renamed from: U1.d */
/* JADX INFO: loaded from: classes.dex */
public final class C7539d implements InterfaceC7537b {

    /* JADX INFO: renamed from: Y */
    public final float f23891Y;

    /* JADX INFO: renamed from: Z */
    public final float f23892Z;

    /* JADX INFO: renamed from: o0 */
    public final InterfaceC7737a f23893o0;

    public C7539d(float f10, float f11, InterfaceC7737a interfaceC7737a) {
        this.f23891Y = f10;
        this.f23892Z = f11;
        this.f23893o0 = interfaceC7737a;
    }

    @Override // p492U1.InterfaceC7537b
    /* JADX INFO: renamed from: F */
    public final long mo7859F(int i10) {
        return m7872a(mo7861O(i10));
    }

    @Override // p492U1.InterfaceC7537b
    /* JADX INFO: renamed from: J */
    public final long mo7860J(float f10) {
        return m7872a(mo7862P(f10));
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
        return this.f23892Z;
    }

    /* JADX INFO: renamed from: a */
    public final long m7872a(float f10) {
        return AbstractC9119D4.m9652e(this.f23893o0.mo7891a(f10), 4294967296L);
    }

    @Override // p492U1.InterfaceC7537b
    /* JADX INFO: renamed from: b0 */
    public final float mo7864b0(float f10) {
        return getDensity() * f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7539d)) {
            return false;
        }
        C7539d c7539d = (C7539d) obj;
        return Float.compare(this.f23891Y, c7539d.f23891Y) == 0 && Float.compare(this.f23892Z, c7539d.f23892Z) == 0 && AbstractC16544l.m18089b(this.f23893o0, c7539d.f23893o0);
    }

    @Override // p492U1.InterfaceC7537b
    public final float getDensity() {
        return this.f23891Y;
    }

    public final int hashCode() {
        return this.f23893o0.hashCode() + AbstractC12107L1.m13819j(this.f23892Z, Float.floatToIntBits(this.f23891Y) * 31, 31);
    }

    @Override // p492U1.InterfaceC7537b
    /* JADX INFO: renamed from: i0 */
    public final int mo7865i0(long j10) {
        return Math.round(mo7869t0(j10));
    }

    @Override // p492U1.InterfaceC7537b
    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ int mo7866k0(float f10) {
        return AbstractC3794B0.m4485j(this, f10);
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
    public final float mo7870w(long j10) {
        if (C7549n.m7898a(C7548m.m7894b(j10), 4294967296L)) {
            return this.f23893o0.mo7892b(C7548m.m7895c(j10));
        }
        throw new IllegalStateException("Only Sp can convert to Px");
    }

    public final String toString() {
        return TVCuK.uge + this.f23891Y + ", fontScale=" + this.f23892Z + ", converter=" + this.f23893o0 + ')';
    }
}
