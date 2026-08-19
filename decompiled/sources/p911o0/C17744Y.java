package p911o0;

import kotlin.jvm.internal.AbstractC16544l;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p1071w0.AbstractC20734X;
import p1095x1.AbstractC21069X;
import p1095x1.InterfaceC21056J;
import p1095x1.InterfaceC21058L;
import p1095x1.InterfaceC21059M;
import p1095x1.InterfaceC21102w;
import p1117y1.C21368h;
import p1117y1.InterfaceC21363c;
import p1117y1.InterfaceC21366f;
import p1117y1.InterfaceC21367g;
import p1140z1.AbstractC21668N;
import p229J0.C3974R1;
import p349O0.C5975S;
import p349O0.C5997d;
import p349O0.C6002f0;
import p571X9.AbstractC9306j0;
import p571X9.AbstractC9388w4;
import p635a1.InterfaceC10459q;
import p909nm.C17690x;

/* JADX INFO: renamed from: o0.Y */
/* JADX INFO: loaded from: classes.dex */
public final class C17744Y implements InterfaceC21102w, InterfaceC21363c, InterfaceC21366f {

    /* JADX INFO: renamed from: Y */
    public final InterfaceC17716A0 f56660Y;

    /* JADX INFO: renamed from: Z */
    public final C6002f0 f56661Z;

    /* JADX INFO: renamed from: o0 */
    public final C6002f0 f56662o0;

    public C17744Y(InterfaceC17716A0 interfaceC17716A0) {
        this.f56660Y = interfaceC17716A0;
        C5975S c5975s = C5975S.f19448r0;
        this.f56661Z = C5997d.m6430Q(interfaceC17716A0, c5975s);
        this.f56662o0 = C5997d.m6430Q(interfaceC17716A0, c5975s);
    }

    @Override // p635a1.InterfaceC10459q
    /* JADX INFO: renamed from: G */
    public final boolean mo426G(InterfaceC1436k interfaceC1436k) {
        return ((Boolean) interfaceC1436k.invoke(this)).booleanValue();
    }

    @Override // p635a1.InterfaceC10459q
    /* JADX INFO: renamed from: M */
    public final /* synthetic */ InterfaceC10459q mo428M(InterfaceC10459q interfaceC10459q) {
        return AbstractC9306j0.m9882a(this, interfaceC10459q);
    }

    @Override // p1095x1.InterfaceC21102w
    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int mo2446d(AbstractC21668N abstractC21668N, InterfaceC21056J interfaceC21056J, int i10) {
        return AbstractC20734X.m21235f(this, abstractC21668N, interfaceC21056J, i10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C17744Y) {
            return AbstractC16544l.m18089b(((C17744Y) obj).f56660Y, this.f56660Y);
        }
        return false;
    }

    @Override // p1095x1.InterfaceC21102w
    /* JADX INFO: renamed from: f */
    public final InterfaceC21058L mo2447f(InterfaceC21059M interfaceC21059M, InterfaceC21056J interfaceC21056J, long j10) {
        C6002f0 c6002f0 = this.f56661Z;
        int iMo5505a = ((InterfaceC17716A0) c6002f0.getValue()).mo5505a(interfaceC21059M, interfaceC21059M.getLayoutDirection());
        int iMo5508d = ((InterfaceC17716A0) c6002f0.getValue()).mo5508d(interfaceC21059M);
        int iMo5506b = ((InterfaceC17716A0) c6002f0.getValue()).mo5506b(interfaceC21059M, interfaceC21059M.getLayoutDirection()) + iMo5505a;
        int iMo5507c = ((InterfaceC17716A0) c6002f0.getValue()).mo5507c(interfaceC21059M) + iMo5508d;
        AbstractC21069X abstractC21069XMo21533p = interfaceC21056J.mo21533p(AbstractC9388w4.m9969l(j10, -iMo5506b, -iMo5507c));
        return interfaceC21059M.mo19936R(AbstractC9388w4.m9965h(abstractC21069XMo21533p.f66981Y + iMo5506b, j10), AbstractC9388w4.m9964g(abstractC21069XMo21533p.f66982Z + iMo5507c, j10), C17690x.f56481Y, new C3974R1(abstractC21069XMo21533p, iMo5505a, iMo5508d, 2));
    }

    @Override // p1095x1.InterfaceC21102w
    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int mo2448g(AbstractC21668N abstractC21668N, InterfaceC21056J interfaceC21056J, int i10) {
        return AbstractC20734X.m21231b(this, abstractC21668N, interfaceC21056J, i10);
    }

    @Override // p1117y1.InterfaceC21366f
    public final C21368h getKey() {
        return AbstractC17724E0.f56585a;
    }

    @Override // p1117y1.InterfaceC21366f
    public final Object getValue() {
        return (InterfaceC17716A0) this.f56662o0.getValue();
    }

    @Override // p1095x1.InterfaceC21102w
    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int mo2449h(AbstractC21668N abstractC21668N, InterfaceC21056J interfaceC21056J, int i10) {
        return AbstractC20734X.m21239j(this, abstractC21668N, interfaceC21056J, i10);
    }

    public final int hashCode() {
        return this.f56660Y.hashCode();
    }

    @Override // p635a1.InterfaceC10459q
    /* JADX INFO: renamed from: j */
    public final Object mo431j(Object obj, InterfaceC1439n interfaceC1439n) {
        return interfaceC1439n.invoke(obj, this);
    }

    @Override // p1095x1.InterfaceC21102w
    /* JADX INFO: renamed from: k */
    public final /* synthetic */ int mo2450k(AbstractC21668N abstractC21668N, InterfaceC21056J interfaceC21056J, int i10) {
        return AbstractC20734X.m21243n(this, abstractC21668N, interfaceC21056J, i10);
    }

    @Override // p1117y1.InterfaceC21363c
    /* JADX INFO: renamed from: p */
    public final void mo19471p(InterfaceC21367g interfaceC21367g) {
        InterfaceC17716A0 interfaceC17716A0 = (InterfaceC17716A0) interfaceC21367g.mo15082a(AbstractC17724E0.f56585a);
        InterfaceC17716A0 interfaceC17716A1 = this.f56660Y;
        this.f56661Z.setValue(new C17721D(interfaceC17716A1, interfaceC17716A0));
        this.f56662o0.setValue(new C17791w0(interfaceC17716A0, interfaceC17716A1));
    }
}
