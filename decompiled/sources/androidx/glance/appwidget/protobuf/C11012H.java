package androidx.glance.appwidget.protobuf;

import java.nio.charset.Charset;

/* JADX INFO: renamed from: androidx.glance.appwidget.protobuf.H */
/* JADX INFO: loaded from: classes.dex */
public final class C11012H {

    /* JADX INFO: renamed from: b */
    public static final C11056r f33239b = new C11056r(1);

    /* JADX INFO: renamed from: a */
    public final Object f33240a;

    public C11012H(C11048j c11048j) {
        Charset charset = AbstractC11063y.f33343a;
        this.f33240a = c11048j;
        c11048j.f33323a = this;
    }

    /* JADX INFO: renamed from: a */
    public void m11853a(int i10, boolean z6) {
        ((C11048j) this.f33240a).m12070I(i10, z6);
    }

    /* JADX INFO: renamed from: b */
    public void m11854b(int i10, C11042g c11042g) {
        ((C11048j) this.f33240a).m12071J(i10, c11042g);
    }

    /* JADX INFO: renamed from: c */
    public void m11855c(int i10, double d10) {
        C11048j c11048j = (C11048j) this.f33240a;
        c11048j.getClass();
        c11048j.m12074M(i10, Double.doubleToRawLongBits(d10));
    }

    /* JADX INFO: renamed from: d */
    public void m11856d(int i10, int i11) {
        ((C11048j) this.f33240a).m12076O(i10, i11);
    }

    /* JADX INFO: renamed from: e */
    public void m11857e(int i10, int i11) {
        ((C11048j) this.f33240a).m12072K(i10, i11);
    }

    /* JADX INFO: renamed from: f */
    public void m11858f(int i10, long j10) {
        ((C11048j) this.f33240a).m12074M(i10, j10);
    }

    /* JADX INFO: renamed from: g */
    public void m11859g(int i10, float f10) {
        C11048j c11048j = (C11048j) this.f33240a;
        c11048j.getClass();
        c11048j.m12072K(i10, Float.floatToRawIntBits(f10));
    }

    /* JADX INFO: renamed from: h */
    public void m11860h(int i10, Object obj, InterfaceC11026W interfaceC11026W) {
        C11048j c11048j = (C11048j) this.f33240a;
        c11048j.m12079R(i10, 3);
        interfaceC11026W.mo11905i((AbstractC11030a) obj, c11048j.f33323a);
        c11048j.m12079R(i10, 4);
    }

    /* JADX INFO: renamed from: i */
    public void m11861i(int i10, int i11) {
        ((C11048j) this.f33240a).m12076O(i10, i11);
    }

    /* JADX INFO: renamed from: j */
    public void m11862j(int i10, long j10) {
        ((C11048j) this.f33240a).m12082U(i10, j10);
    }

    /* JADX INFO: renamed from: k */
    public void m11863k(int i10, Object obj, InterfaceC11026W interfaceC11026W) {
        C11048j c11048j = (C11048j) this.f33240a;
        AbstractC11030a abstractC11030a = (AbstractC11030a) obj;
        c11048j.m12079R(i10, 2);
        c11048j.m12081T(abstractC11030a.mo11976a(interfaceC11026W));
        interfaceC11026W.mo11905i(abstractC11030a, c11048j.f33323a);
    }

    /* JADX INFO: renamed from: l */
    public void m11864l(int i10, int i11) {
        ((C11048j) this.f33240a).m12072K(i10, i11);
    }

    /* JADX INFO: renamed from: m */
    public void m11865m(int i10, long j10) {
        ((C11048j) this.f33240a).m12074M(i10, j10);
    }

    /* JADX INFO: renamed from: n */
    public void m11866n(int i10, int i11) {
        ((C11048j) this.f33240a).m12080S(i10, (i11 >> 31) ^ (i11 << 1));
    }

    /* JADX INFO: renamed from: o */
    public void m11867o(int i10, long j10) {
        ((C11048j) this.f33240a).m12082U(i10, (j10 >> 63) ^ (j10 << 1));
    }

    /* JADX INFO: renamed from: p */
    public void m11868p(int i10, int i11) {
        ((C11048j) this.f33240a).m12080S(i10, i11);
    }

    /* JADX INFO: renamed from: q */
    public void m11869q(int i10, long j10) {
        ((C11048j) this.f33240a).m12082U(i10, j10);
    }

    public C11012H() {
        C11023T c11023t = C11023T.f33266c;
        InterfaceC11016L interfaceC11016L = f33239b;
        try {
            interfaceC11016L = (InterfaceC11016L) Class.forName("androidx.glance.appwidget.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
        }
        InterfaceC11016L[] interfaceC11016LArr = {C11056r.f33339b, interfaceC11016L};
        C11011G c11011g = new C11011G();
        c11011g.f33238a = interfaceC11016LArr;
        Charset charset = AbstractC11063y.f33343a;
        this.f33240a = c11011g;
    }
}
