package com.google.protobuf;

import java.nio.charset.Charset;

/* JADX INFO: renamed from: com.google.protobuf.z0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12211z0 {

    /* JADX INFO: renamed from: b */
    public static final C12119S f37130b = new C12119S(1);

    /* JADX INFO: renamed from: a */
    public final Object f37131a;

    public C12211z0(AbstractC12195u abstractC12195u) {
        AbstractC12175n0.m14013a(abstractC12195u, "output");
        this.f37131a = abstractC12195u;
        abstractC12195u.f37110c = this;
    }

    /* JADX INFO: renamed from: a */
    public void m14200a(int i10, boolean z6) {
        ((AbstractC12195u) this.f37131a).mo14092A0(i10, z6);
    }

    /* JADX INFO: renamed from: b */
    public void m14201b(int i10, AbstractC12171m abstractC12171m) {
        ((AbstractC12195u) this.f37131a).mo14094C0(i10, abstractC12171m);
    }

    /* JADX INFO: renamed from: c */
    public void m14202c(int i10, double d10) {
        AbstractC12195u abstractC12195u = (AbstractC12195u) this.f37131a;
        abstractC12195u.getClass();
        abstractC12195u.mo14098G0(i10, Double.doubleToRawLongBits(d10));
    }

    /* JADX INFO: renamed from: d */
    public void m14203d(int i10, int i11) {
        ((AbstractC12195u) this.f37131a).mo14100I0(i10, i11);
    }

    /* JADX INFO: renamed from: e */
    public void m14204e(int i10, int i11) {
        ((AbstractC12195u) this.f37131a).mo14096E0(i10, i11);
    }

    /* JADX INFO: renamed from: f */
    public void m14205f(int i10, long j10) {
        ((AbstractC12195u) this.f37131a).mo14098G0(i10, j10);
    }

    /* JADX INFO: renamed from: g */
    public void m14206g(int i10, float f10) {
        AbstractC12195u abstractC12195u = (AbstractC12195u) this.f37131a;
        abstractC12195u.getClass();
        abstractC12195u.mo14096E0(i10, Float.floatToRawIntBits(f10));
    }

    /* JADX INFO: renamed from: h */
    public void m14207h(int i10, Object obj, InterfaceC12134Z0 interfaceC12134Z0) {
        AbstractC12195u abstractC12195u = (AbstractC12195u) this.f37131a;
        abstractC12195u.mo14108Q0(i10, 3);
        interfaceC12134Z0.mo13791e((InterfaceC12091G0) obj, abstractC12195u.f37110c);
        abstractC12195u.mo14108Q0(i10, 4);
    }

    /* JADX INFO: renamed from: i */
    public void m14208i(int i10, int i11) {
        ((AbstractC12195u) this.f37131a).mo14100I0(i10, i11);
    }

    /* JADX INFO: renamed from: j */
    public void m14209j(int i10, long j10) {
        ((AbstractC12195u) this.f37131a).mo14111T0(i10, j10);
    }

    /* JADX INFO: renamed from: k */
    public void m14210k(int i10, Object obj, InterfaceC12134Z0 interfaceC12134Z0) {
        ((AbstractC12195u) this.f37131a).mo14102K0(i10, (InterfaceC12091G0) obj, interfaceC12134Z0);
    }

    /* JADX INFO: renamed from: l */
    public void m14211l(int i10, int i11) {
        ((AbstractC12195u) this.f37131a).mo14096E0(i10, i11);
    }

    /* JADX INFO: renamed from: m */
    public void m14212m(int i10, long j10) {
        ((AbstractC12195u) this.f37131a).mo14098G0(i10, j10);
    }

    /* JADX INFO: renamed from: n */
    public void m14213n(int i10, int i11) {
        ((AbstractC12195u) this.f37131a).mo14109R0(i10, (i11 >> 31) ^ (i11 << 1));
    }

    /* JADX INFO: renamed from: o */
    public void m14214o(int i10, long j10) {
        ((AbstractC12195u) this.f37131a).mo14111T0(i10, (j10 >> 63) ^ (j10 << 1));
    }

    /* JADX INFO: renamed from: p */
    public void m14215p(int i10, int i11) {
        ((AbstractC12195u) this.f37131a).mo14109R0(i10, i11);
    }

    /* JADX INFO: renamed from: q */
    public void m14216q(int i10, long j10) {
        ((AbstractC12195u) this.f37131a).mo14111T0(i10, j10);
    }

    public C12211z0() {
        InterfaceC12085E0 interfaceC12085E0;
        try {
            interfaceC12085E0 = (InterfaceC12085E0) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            interfaceC12085E0 = f37130b;
        }
        InterfaceC12085E0[] interfaceC12085E0Arr = {C12119S.f36978b, interfaceC12085E0};
        C12208y0 c12208y0 = new C12208y0();
        c12208y0.f37121a = interfaceC12085E0Arr;
        Charset charset = AbstractC12175n0.f37050a;
        this.f37131a = c12208y0;
    }
}
