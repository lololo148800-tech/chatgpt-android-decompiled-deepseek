package p1139z0;

import p1095x1.InterfaceC21059M;
import p328N1.InterfaceC5598n;
import p492U1.C7536a;
import p492U1.EnumC7546k;

/* JADX INFO: renamed from: z0.v0 */
/* JADX INFO: loaded from: classes.dex */
public final class C21646v0 {

    /* JADX INFO: renamed from: g */
    public static final C21596T f68589g = new C21596T(1);

    /* JADX INFO: renamed from: a */
    public final InterfaceC21059M f68590a;

    /* JADX INFO: renamed from: b */
    public final EnumC7546k f68591b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC5598n f68592c;

    /* JADX INFO: renamed from: d */
    public final long f68593d;

    /* JADX INFO: renamed from: e */
    public final float f68594e;

    /* JADX INFO: renamed from: f */
    public final float f68595f;

    public C21646v0(InterfaceC21059M interfaceC21059M, EnumC7546k enumC7546k, InterfaceC5598n interfaceC5598n, long j10) {
        this.f68590a = interfaceC21059M;
        this.f68591b = enumC7546k;
        this.f68592c = interfaceC5598n;
        this.f68593d = j10;
        this.f68594e = interfaceC21059M.getDensity();
        this.f68595f = interfaceC21059M.mo7863X();
    }

    public final String toString() {
        return "MeasureInputs(density=" + this.f68590a + ", densityValue=" + this.f68594e + ", fontScale=" + this.f68595f + ", layoutDirection=" + this.f68591b + ", fontFamilyResolver=" + this.f68592c + ", constraints=" + ((Object) C7536a.m7858m(this.f68593d)) + ')';
    }
}
