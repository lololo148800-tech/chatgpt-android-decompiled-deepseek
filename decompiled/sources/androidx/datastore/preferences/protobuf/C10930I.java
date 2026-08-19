package androidx.datastore.preferences.protobuf;

import java.nio.charset.Charset;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.I */
/* JADX INFO: loaded from: classes.dex */
public final class C10930I {

    /* JADX INFO: renamed from: b */
    public static final C10981r f32970b = new C10981r(1);

    /* JADX INFO: renamed from: a */
    public final Object f32971a;

    public C10930I(C10963i c10963i) {
        AbstractC10993x.m11723a(c10963i, "output");
        this.f32971a = c10963i;
        c10963i.f33054c = this;
    }

    /* JADX INFO: renamed from: a */
    public void m11440a(int i10, boolean z6) {
        ((C10963i) this.f32971a).m11643T(i10, z6);
    }

    /* JADX INFO: renamed from: b */
    public void m11441b(int i10, C10957f c10957f) {
        ((C10963i) this.f32971a).m11644U(i10, c10957f);
    }

    /* JADX INFO: renamed from: c */
    public void m11442c(int i10, double d10) {
        C10963i c10963i = (C10963i) this.f32971a;
        c10963i.getClass();
        c10963i.m11648Y(i10, Double.doubleToRawLongBits(d10));
    }

    /* JADX INFO: renamed from: d */
    public void m11443d(int i10, int i11) {
        ((C10963i) this.f32971a).m11650a0(i10, i11);
    }

    /* JADX INFO: renamed from: e */
    public void m11444e(int i10, int i11) {
        ((C10963i) this.f32971a).m11646W(i10, i11);
    }

    /* JADX INFO: renamed from: f */
    public void m11445f(int i10, long j10) {
        ((C10963i) this.f32971a).m11648Y(i10, j10);
    }

    /* JADX INFO: renamed from: g */
    public void m11446g(int i10, float f10) {
        C10963i c10963i = (C10963i) this.f32971a;
        c10963i.getClass();
        c10963i.m11646W(i10, Float.floatToRawIntBits(f10));
    }

    /* JADX INFO: renamed from: h */
    public void m11447h(int i10, Object obj, InterfaceC10948a0 interfaceC10948a0) {
        C10963i c10963i = (C10963i) this.f32971a;
        c10963i.m11654e0(i10, 3);
        interfaceC10948a0.mo11496d((AbstractC10947a) obj, c10963i.f33054c);
        c10963i.m11654e0(i10, 4);
    }

    /* JADX INFO: renamed from: i */
    public void m11448i(int i10, int i11) {
        ((C10963i) this.f32971a).m11650a0(i10, i11);
    }

    /* JADX INFO: renamed from: j */
    public void m11449j(int i10, long j10) {
        ((C10963i) this.f32971a).m11657h0(i10, j10);
    }

    /* JADX INFO: renamed from: k */
    public void m11450k(int i10, Object obj, InterfaceC10948a0 interfaceC10948a0) {
        C10963i c10963i = (C10963i) this.f32971a;
        AbstractC10947a abstractC10947a = (AbstractC10947a) obj;
        c10963i.m11654e0(i10, 2);
        c10963i.m11656g0(abstractC10947a.m11522b(interfaceC10948a0));
        interfaceC10948a0.mo11496d(abstractC10947a, c10963i.f33054c);
    }

    /* JADX INFO: renamed from: l */
    public void m11451l(int i10, int i11) {
        ((C10963i) this.f32971a).m11646W(i10, i11);
    }

    /* JADX INFO: renamed from: m */
    public void m11452m(int i10, long j10) {
        ((C10963i) this.f32971a).m11648Y(i10, j10);
    }

    /* JADX INFO: renamed from: n */
    public void m11453n(int i10, int i11) {
        ((C10963i) this.f32971a).m11655f0(i10, (i11 >> 31) ^ (i11 << 1));
    }

    /* JADX INFO: renamed from: o */
    public void m11454o(int i10, long j10) {
        ((C10963i) this.f32971a).m11657h0(i10, (j10 >> 63) ^ (j10 << 1));
    }

    /* JADX INFO: renamed from: p */
    public void m11455p(int i10, int i11) {
        ((C10963i) this.f32971a).m11655f0(i10, i11);
    }

    /* JADX INFO: renamed from: q */
    public void m11456q(int i10, long j10) {
        ((C10963i) this.f32971a).m11657h0(i10, j10);
    }

    public C10930I() {
        InterfaceC10936O interfaceC10936O;
        try {
            interfaceC10936O = (InterfaceC10936O) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            interfaceC10936O = f32970b;
        }
        InterfaceC10936O[] interfaceC10936OArr = {C10981r.f33084b, interfaceC10936O};
        C10929H c10929h = new C10929H();
        c10929h.f32969a = interfaceC10936OArr;
        Charset charset = AbstractC10993x.f33099a;
        this.f32971a = c10929h;
    }
}
