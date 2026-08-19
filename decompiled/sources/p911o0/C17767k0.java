package p911o0;

import com.google.protobuf.AbstractC12107L1;
import p492U1.C7540e;
import p492U1.EnumC7546k;

/* JADX INFO: renamed from: o0.k0 */
/* JADX INFO: loaded from: classes.dex */
public final class C17767k0 implements InterfaceC17763i0 {

    /* JADX INFO: renamed from: a */
    public final float f56718a;

    /* JADX INFO: renamed from: b */
    public final float f56719b;

    /* JADX INFO: renamed from: c */
    public final float f56720c;

    /* JADX INFO: renamed from: d */
    public final float f56721d;

    public C17767k0(float f10, float f11, float f12, float f13) {
        this.f56718a = f10;
        this.f56719b = f11;
        this.f56720c = f12;
        this.f56721d = f13;
        if (f10 < 0.0f) {
            throw new IllegalArgumentException("Start padding must be non-negative");
        }
        if (f11 < 0.0f) {
            throw new IllegalArgumentException("Top padding must be non-negative");
        }
        if (f12 < 0.0f) {
            throw new IllegalArgumentException("End padding must be non-negative");
        }
        if (f13 < 0.0f) {
            throw new IllegalArgumentException("Bottom padding must be non-negative");
        }
    }

    @Override // p911o0.InterfaceC17763i0
    /* JADX INFO: renamed from: a */
    public final float mo19472a(EnumC7546k enumC7546k) {
        return enumC7546k == EnumC7546k.f23904Y ? this.f56720c : this.f56718a;
    }

    @Override // p911o0.InterfaceC17763i0
    /* JADX INFO: renamed from: b */
    public final float mo19473b() {
        return this.f56721d;
    }

    @Override // p911o0.InterfaceC17763i0
    /* JADX INFO: renamed from: c */
    public final float mo19474c(EnumC7546k enumC7546k) {
        return enumC7546k == EnumC7546k.f23904Y ? this.f56718a : this.f56720c;
    }

    @Override // p911o0.InterfaceC17763i0
    /* JADX INFO: renamed from: d */
    public final float mo19475d() {
        return this.f56719b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C17767k0)) {
            return false;
        }
        C17767k0 c17767k0 = (C17767k0) obj;
        return C7540e.m7873a(this.f56718a, c17767k0.f56718a) && C7540e.m7873a(this.f56719b, c17767k0.f56719b) && C7540e.m7873a(this.f56720c, c17767k0.f56720c) && C7540e.m7873a(this.f56721d, c17767k0.f56721d);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f56721d) + AbstractC12107L1.m13819j(this.f56720c, AbstractC12107L1.m13819j(this.f56719b, Float.floatToIntBits(this.f56718a) * 31, 31), 31);
    }

    public final String toString() {
        return "PaddingValues(start=" + ((Object) C7540e.m7874b(this.f56718a)) + ", top=" + ((Object) C7540e.m7874b(this.f56719b)) + ", end=" + ((Object) C7540e.m7874b(this.f56720c)) + ", bottom=" + ((Object) C7540e.m7874b(this.f56721d)) + ')';
    }
}
