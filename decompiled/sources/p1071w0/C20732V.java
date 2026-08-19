package p1071w0;

import kotlin.jvm.internal.AbstractC16544l;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p1095x1.AbstractC21069X;
import p1095x1.InterfaceC21056J;
import p1095x1.InterfaceC21058L;
import p1095x1.InterfaceC21059M;
import p1095x1.InterfaceC21102w;
import p1140z1.AbstractC21668N;
import p229J0.C4041e;
import p350O1.C6050H;
import p492U1.C7536a;
import p571X9.AbstractC9306j0;
import p635a1.InterfaceC10459q;
import p909nm.C17690x;

/* JADX INFO: renamed from: w0.V */
/* JADX INFO: loaded from: classes.dex */
public final class C20732V implements InterfaceC21102w {

    /* JADX INFO: renamed from: Y */
    public final C20706E0 f65735Y;

    /* JADX INFO: renamed from: Z */
    public final int f65736Z;

    /* JADX INFO: renamed from: o0 */
    public final C6050H f65737o0;

    /* JADX INFO: renamed from: p0 */
    public final InterfaceC1426a f65738p0;

    public C20732V(C20706E0 c20706e0, int i10, C6050H c6050h, InterfaceC1426a interfaceC1426a) {
        this.f65735Y = c20706e0;
        this.f65736Z = i10;
        this.f65737o0 = c6050h;
        this.f65738p0 = interfaceC1426a;
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
        if (!(obj instanceof C20732V)) {
            return false;
        }
        C20732V c20732v = (C20732V) obj;
        return AbstractC16544l.m18089b(this.f65735Y, c20732v.f65735Y) && this.f65736Z == c20732v.f65736Z && AbstractC16544l.m18089b(this.f65737o0, c20732v.f65737o0) && AbstractC16544l.m18089b(this.f65738p0, c20732v.f65738p0);
    }

    @Override // p1095x1.InterfaceC21102w
    /* JADX INFO: renamed from: f */
    public final InterfaceC21058L mo2447f(InterfaceC21059M interfaceC21059M, InterfaceC21056J interfaceC21056J, long j10) {
        AbstractC21069X abstractC21069XMo21533p = interfaceC21056J.mo21533p(interfaceC21056J.mo21532o(C7536a.m7853h(j10)) < C7536a.m7854i(j10) ? j10 : C7536a.m7847b(j10, 0, Integer.MAX_VALUE, 0, 0, 13));
        int iMin = Math.min(abstractC21069XMo21533p.f66981Y, C7536a.m7854i(j10));
        return interfaceC21059M.mo19936R(iMin, abstractC21069XMo21533p.f66982Z, C17690x.f56481Y, new C4041e(interfaceC21059M, (InterfaceC21102w) this, abstractC21069XMo21533p, iMin, 7));
    }

    @Override // p1095x1.InterfaceC21102w
    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int mo2448g(AbstractC21668N abstractC21668N, InterfaceC21056J interfaceC21056J, int i10) {
        return AbstractC20734X.m21231b(this, abstractC21668N, interfaceC21056J, i10);
    }

    @Override // p1095x1.InterfaceC21102w
    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int mo2449h(AbstractC21668N abstractC21668N, InterfaceC21056J interfaceC21056J, int i10) {
        return AbstractC20734X.m21239j(this, abstractC21668N, interfaceC21056J, i10);
    }

    public final int hashCode() {
        return this.f65738p0.hashCode() + ((this.f65737o0.hashCode() + (((this.f65735Y.hashCode() * 31) + this.f65736Z) * 31)) * 31);
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

    public final String toString() {
        return "HorizontalScrollLayoutModifier(scrollerPosition=" + this.f65735Y + ", cursorOffset=" + this.f65736Z + ", transformedText=" + this.f65737o0 + ", textLayoutResultProvider=" + this.f65738p0 + ')';
    }
}
