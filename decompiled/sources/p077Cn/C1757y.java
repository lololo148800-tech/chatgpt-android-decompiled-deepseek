package p077Cn;

import java.util.concurrent.CancellationException;
import p025An.AbstractC0575H;
import p025An.AbstractC0600a;
import p025An.C0629o0;
import p049Bm.InterfaceC1436k;
import p117Eb.C2391u;
import p129En.C2610u;
import p972qm.InterfaceC18770c;
import p972qm.InterfaceC18776i;
import p996rm.EnumC19250a;

/* JADX INFO: renamed from: Cn.y */
/* JADX INFO: loaded from: classes2.dex */
public final class C1757y extends AbstractC0600a implements InterfaceC1758z, InterfaceC1747o {

    /* JADX INFO: renamed from: p0 */
    public final C1743k f5030p0;

    public C1757y(InterfaceC18776i interfaceC18776i, C1743k c1743k, boolean z6, boolean z10) {
        super(interfaceC18776i, z6, z10);
        this.f5030p0 = c1743k;
    }

    @Override // p077Cn.InterfaceC1730B
    /* JADX INFO: renamed from: c */
    public final Object mo2514c(InterfaceC18770c interfaceC18770c) {
        return this.f5030p0.mo2514c(interfaceC18770c);
    }

    @Override // p077Cn.InterfaceC1730B
    /* JADX INFO: renamed from: d */
    public final boolean mo2515d() {
        return this.f5030p0.mo2515d();
    }

    @Override // p025An.C0641u0, p025An.InterfaceC0627n0
    /* JADX INFO: renamed from: e */
    public final void mo1275e(CancellationException cancellationException) {
        if (isCancelled()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new C0629o0(mo1227y(), null, this);
        }
        mo1311w(cancellationException);
    }

    @Override // p077Cn.InterfaceC1730B
    /* JADX INFO: renamed from: f */
    public final C2391u mo2517f() {
        return this.f5030p0.mo2517f();
    }

    @Override // p077Cn.InterfaceC1730B
    /* JADX INFO: renamed from: g */
    public final C2391u mo2518g() {
        return this.f5030p0.mo2518g();
    }

    @Override // p025An.AbstractC0600a
    /* JADX INFO: renamed from: g0 */
    public final void mo1224g0(Throwable th2, boolean z6) {
        if (this.f5030p0.m2550s(th2, false) || z6) {
            return;
        }
        AbstractC0575H.m1194w(this.f1833o0, th2);
    }

    @Override // p025An.AbstractC0600a
    /* JADX INFO: renamed from: h0 */
    public final void mo1225h0(Object obj) {
        this.f5030p0.mo2522l(null);
    }

    @Override // p077Cn.InterfaceC1730B
    /* JADX INFO: renamed from: i */
    public final Object mo2519i() {
        return this.f5030p0.mo2519i();
    }

    @Override // p077Cn.InterfaceC1730B
    public final C1736d iterator() {
        C1743k c1743k = this.f5030p0;
        c1743k.getClass();
        return new C1736d(c1743k);
    }

    @Override // p077Cn.InterfaceC1731C
    /* JADX INFO: renamed from: j */
    public final void mo2521j(InterfaceC1436k interfaceC1436k) {
        this.f5030p0.mo2521j(interfaceC1436k);
    }

    @Override // p077Cn.InterfaceC1731C
    /* JADX INFO: renamed from: l */
    public boolean mo2522l(Throwable th2) {
        return this.f5030p0.m2550s(th2, false);
    }

    @Override // p077Cn.InterfaceC1731C
    /* JADX INFO: renamed from: o */
    public Object mo2523o(Object obj, InterfaceC18770c interfaceC18770c) {
        return this.f5030p0.mo2523o(obj, interfaceC18770c);
    }

    @Override // p077Cn.InterfaceC1731C
    /* JADX INFO: renamed from: p */
    public Object mo2524p(Object obj) {
        return this.f5030p0.mo2524p(obj);
    }

    @Override // p077Cn.InterfaceC1730B
    /* JADX INFO: renamed from: q */
    public final Object mo2520q(C2610u c2610u) {
        C1743k c1743k = this.f5030p0;
        c1743k.getClass();
        Object objM2528I = C1743k.m2528I(c1743k, c2610u);
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        return objM2528I;
    }

    @Override // p025An.C0641u0
    /* JADX INFO: renamed from: w */
    public final void mo1311w(CancellationException cancellationException) {
        this.f5030p0.m2550s(cancellationException, true);
        m1310v(cancellationException);
    }
}
