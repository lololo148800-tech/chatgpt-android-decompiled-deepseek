package p492U1;

import com.google.protobuf.AbstractC12107L1;
import p228J.AbstractC3794B0;

/* JADX INFO: renamed from: U1.c */
/* JADX INFO: loaded from: classes.dex */
public final class C7538c implements InterfaceC7537b {

    /* JADX INFO: renamed from: Y */
    public final float f23889Y;

    /* JADX INFO: renamed from: Z */
    public final float f23890Z;

    public C7538c(float f10, float f11) {
        this.f23889Y = f10;
        this.f23890Z = f11;
    }

    @Override // p492U1.InterfaceC7537b
    /* JADX INFO: renamed from: F */
    public final long mo7859F(int i10) {
        return m7871a(mo7861O(i10));
    }

    @Override // p492U1.InterfaceC7537b
    /* JADX INFO: renamed from: J */
    public final long mo7860J(float f10) {
        return m7871a(mo7862P(f10));
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
        return this.f23890Z;
    }

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ long m7871a(float f10) {
        return AbstractC3794B0.m4490o(this, f10);
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
        if (!(obj instanceof C7538c)) {
            return false;
        }
        C7538c c7538c = (C7538c) obj;
        return Float.compare(this.f23889Y, c7538c.f23889Y) == 0 && Float.compare(this.f23890Z, c7538c.f23890Z) == 0;
    }

    @Override // p492U1.InterfaceC7537b
    public final float getDensity() {
        return this.f23889Y;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f23890Z) + (Float.floatToIntBits(this.f23889Y) * 31);
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

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DensityImpl(density=");
        sb2.append(this.f23889Y);
        sb2.append(", fontScale=");
        return AbstractC12107L1.m13825p(sb2, this.f23890Z, ')');
    }

    @Override // p492U1.InterfaceC7537b
    /* JADX INFO: renamed from: w */
    public final /* synthetic */ float mo7870w(long j10) {
        return AbstractC3794B0.m4486k(j10, this);
    }
}
