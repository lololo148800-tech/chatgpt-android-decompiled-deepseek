package p1095x1;

import java.util.Map;
import p049Bm.InterfaceC1436k;
import p492U1.EnumC7546k;
import p523V9.AbstractC8111i5;

/* JADX INFO: renamed from: x1.r */
/* JADX INFO: loaded from: classes.dex */
public final class C21097r implements InterfaceC21059M, InterfaceC21095p {

    /* JADX INFO: renamed from: Y */
    public final EnumC7546k f67026Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC21095p f67027Z;

    public C21097r(InterfaceC21095p interfaceC21095p, EnumC7546k enumC7546k) {
        this.f67026Y = enumC7546k;
        this.f67027Z = interfaceC21095p;
    }

    @Override // p492U1.InterfaceC7537b
    /* JADX INFO: renamed from: F */
    public final long mo7859F(int i10) {
        return this.f67027Z.mo7859F(i10);
    }

    @Override // p492U1.InterfaceC7537b
    /* JADX INFO: renamed from: J */
    public final long mo7860J(float f10) {
        return this.f67027Z.mo7860J(f10);
    }

    @Override // p492U1.InterfaceC7537b
    /* JADX INFO: renamed from: O */
    public final float mo7861O(int i10) {
        return this.f67027Z.mo7861O(i10);
    }

    @Override // p492U1.InterfaceC7537b
    /* JADX INFO: renamed from: P */
    public final float mo7862P(float f10) {
        return this.f67027Z.mo7862P(f10);
    }

    @Override // p1095x1.InterfaceC21059M
    /* JADX INFO: renamed from: R */
    public final InterfaceC21058L mo19936R(int i10, int i11, Map map, InterfaceC1436k interfaceC1436k) {
        if (i10 < 0) {
            i10 = 0;
        }
        if (i11 < 0) {
            i11 = 0;
        }
        if ((i10 & (-16777216)) == 0 && ((-16777216) & i11) == 0) {
            return new C21096q(i10, i11, map);
        }
        AbstractC8111i5.m8592c("Size(" + i10 + " x " + i11 + ") is out of range. Each dimension must be between 0 and 16777215.");
        throw null;
    }

    @Override // p492U1.InterfaceC7537b
    /* JADX INFO: renamed from: X */
    public final float mo7863X() {
        return this.f67027Z.mo7863X();
    }

    @Override // p1095x1.InterfaceC21095p
    /* JADX INFO: renamed from: Z */
    public final boolean mo19937Z() {
        return this.f67027Z.mo19937Z();
    }

    @Override // p492U1.InterfaceC7537b
    /* JADX INFO: renamed from: b0 */
    public final float mo7864b0(float f10) {
        return this.f67027Z.mo7864b0(f10);
    }

    @Override // p492U1.InterfaceC7537b
    public final float getDensity() {
        return this.f67027Z.getDensity();
    }

    @Override // p1095x1.InterfaceC21095p
    public final EnumC7546k getLayoutDirection() {
        return this.f67026Y;
    }

    @Override // p492U1.InterfaceC7537b
    /* JADX INFO: renamed from: i0 */
    public final int mo7865i0(long j10) {
        return this.f67027Z.mo7865i0(j10);
    }

    @Override // p492U1.InterfaceC7537b
    /* JADX INFO: renamed from: k0 */
    public final int mo7866k0(float f10) {
        return this.f67027Z.mo7866k0(f10);
    }

    @Override // p492U1.InterfaceC7537b
    /* JADX INFO: renamed from: r0 */
    public final long mo7867r0(long j10) {
        return this.f67027Z.mo7867r0(j10);
    }

    @Override // p492U1.InterfaceC7537b
    /* JADX INFO: renamed from: s */
    public final long mo7868s(long j10) {
        return this.f67027Z.mo7868s(j10);
    }

    @Override // p492U1.InterfaceC7537b
    /* JADX INFO: renamed from: t0 */
    public final float mo7869t0(long j10) {
        return this.f67027Z.mo7869t0(j10);
    }

    @Override // p492U1.InterfaceC7537b
    /* JADX INFO: renamed from: w */
    public final float mo7870w(long j10) {
        return this.f67027Z.mo7870w(j10);
    }
}
