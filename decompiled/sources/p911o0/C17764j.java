package p911o0;

import kotlin.jvm.internal.AbstractC16544l;
import p1095x1.InterfaceC21059M;
import p492U1.C7540e;
import p492U1.EnumC7546k;
import p492U1.InterfaceC7537b;

/* JADX INFO: renamed from: o0.j */
/* JADX INFO: loaded from: classes.dex */
public final class C17764j implements InterfaceC17762i {

    /* JADX INFO: renamed from: a */
    public final float f56712a;

    /* JADX INFO: renamed from: b */
    public final boolean f56713b;

    /* JADX INFO: renamed from: c */
    public final C17768l f56714c;

    /* JADX INFO: renamed from: d */
    public final float f56715d;

    public C17764j(float f10, boolean z6, C17768l c17768l) {
        this.f56712a = f10;
        this.f56713b = z6;
        this.f56714c = c17768l;
        this.f56715d = f10;
    }

    @Override // p911o0.InterfaceC17760h, p911o0.InterfaceC17766k
    /* JADX INFO: renamed from: a */
    public final float mo455a() {
        return this.f56715d;
    }

    @Override // p911o0.InterfaceC17766k
    /* JADX INFO: renamed from: b */
    public final void mo456b(int i10, InterfaceC21059M interfaceC21059M, int[] iArr, int[] iArr2) {
        mo457c(interfaceC21059M, i10, iArr, EnumC7546k.f23904Y, iArr2);
    }

    @Override // p911o0.InterfaceC17760h
    /* JADX INFO: renamed from: c */
    public final void mo457c(InterfaceC7537b interfaceC7537b, int i10, int[] iArr, EnumC7546k enumC7546k, int[] iArr2) {
        int i11;
        int i12;
        if (iArr.length == 0) {
            return;
        }
        int iMo7866k0 = interfaceC7537b.mo7866k0(this.f56712a);
        boolean z6 = this.f56713b && enumC7546k == EnumC7546k.f23905Z;
        C17756f c17756f = AbstractC17770m.f56724a;
        if (z6) {
            int length = iArr.length - 1;
            i11 = 0;
            i12 = 0;
            while (-1 < length) {
                int i13 = iArr[length];
                int iMin = Math.min(i11, i10 - i13);
                iArr2[length] = iMin;
                int iMin2 = Math.min(iMo7866k0, (i10 - iMin) - i13);
                int i14 = iArr2[length] + i13 + iMin2;
                length--;
                i12 = iMin2;
                i11 = i14;
            }
        } else {
            int length2 = iArr.length;
            int i15 = 0;
            i11 = 0;
            i12 = 0;
            int i16 = 0;
            while (i15 < length2) {
                int i17 = iArr[i15];
                int iMin3 = Math.min(i11, i10 - i17);
                iArr2[i16] = iMin3;
                int iMin4 = Math.min(iMo7866k0, (i10 - iMin3) - i17);
                int i18 = iArr2[i16] + i17 + iMin4;
                i15++;
                i16++;
                i12 = iMin4;
                i11 = i18;
            }
        }
        int i19 = i11 - i12;
        C17768l c17768l = this.f56714c;
        if (c17768l == null || i19 >= i10) {
            return;
        }
        int iIntValue = ((Number) c17768l.invoke(Integer.valueOf(i10 - i19), enumC7546k)).intValue();
        int length3 = iArr2.length;
        for (int i20 = 0; i20 < length3; i20++) {
            iArr2[i20] = iArr2[i20] + iIntValue;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17764j)) {
            return false;
        }
        C17764j c17764j = (C17764j) obj;
        return C7540e.m7873a(this.f56712a, c17764j.f56712a) && this.f56713b == c17764j.f56713b && AbstractC16544l.m18089b(this.f56714c, c17764j.f56714c);
    }

    public final int hashCode() {
        int iFloatToIntBits = ((Float.floatToIntBits(this.f56712a) * 31) + (this.f56713b ? 1231 : 1237)) * 31;
        C17768l c17768l = this.f56714c;
        return iFloatToIntBits + (c17768l == null ? 0 : c17768l.hashCode());
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f56713b ? "" : "Absolute");
        sb2.append("Arrangement#spacedAligned(");
        sb2.append((Object) C7540e.m7874b(this.f56712a));
        sb2.append(", ");
        sb2.append(this.f56714c);
        sb2.append(')');
        return sb2.toString();
    }
}
