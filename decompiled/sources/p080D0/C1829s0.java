package p080D0;

import p003A1.AbstractC0168G;
import p049Bm.InterfaceC1436k;
import p692d0.AbstractC12975n;
import p692d0.C12985x;

/* JADX INFO: renamed from: D0.s0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1829s0 implements InterfaceC1784S {

    /* JADX INFO: renamed from: a */
    public final boolean f5272a;

    /* JADX INFO: renamed from: b */
    public final int f5273b;

    /* JADX INFO: renamed from: c */
    public final int f5274c;

    /* JADX INFO: renamed from: d */
    public final C1824q f5275d;

    /* JADX INFO: renamed from: e */
    public final C1820o f5276e;

    public C1829s0(boolean z6, int i10, int i11, C1824q c1824q, C1820o c1820o) {
        this.f5272a = z6;
        this.f5273b = i10;
        this.f5274c = i11;
        this.f5275d = c1824q;
        this.f5276e = c1820o;
    }

    @Override // p080D0.InterfaceC1784S
    /* JADX INFO: renamed from: a */
    public final boolean mo2573a() {
        return this.f5272a;
    }

    @Override // p080D0.InterfaceC1784S
    /* JADX INFO: renamed from: b */
    public final int mo2574b() {
        return 1;
    }

    @Override // p080D0.InterfaceC1784S
    /* JADX INFO: renamed from: c */
    public final C1820o mo2575c() {
        return this.f5276e;
    }

    @Override // p080D0.InterfaceC1784S
    /* JADX INFO: renamed from: d */
    public final C1824q mo2576d() {
        return this.f5275d;
    }

    @Override // p080D0.InterfaceC1784S
    /* JADX INFO: renamed from: e */
    public final C1820o mo2577e() {
        return this.f5276e;
    }

    @Override // p080D0.InterfaceC1784S
    /* JADX INFO: renamed from: f */
    public final boolean mo2578f(InterfaceC1784S interfaceC1784S) {
        if (this.f5275d != null && interfaceC1784S != null && (interfaceC1784S instanceof C1829s0)) {
            C1829s0 c1829s0 = (C1829s0) interfaceC1784S;
            if (this.f5273b == c1829s0.f5273b && this.f5274c == c1829s0.f5274c && this.f5272a == c1829s0.f5272a) {
                C1820o c1820o = this.f5276e;
                c1820o.getClass();
                C1820o c1820o2 = c1829s0.f5276e;
                if (c1820o.f5235a == c1820o2.f5235a && c1820o.f5237c == c1820o2.f5237c && c1820o.f5238d == c1820o2.f5238d) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // p080D0.InterfaceC1784S
    /* JADX INFO: renamed from: h */
    public final int mo2580h() {
        return this.f5274c;
    }

    @Override // p080D0.InterfaceC1784S
    /* JADX INFO: renamed from: i */
    public final C1820o mo2581i() {
        return this.f5276e;
    }

    @Override // p080D0.InterfaceC1784S
    /* JADX INFO: renamed from: j */
    public final int mo2582j() {
        int i10 = this.f5273b;
        int i11 = this.f5274c;
        if (i10 < i11) {
            return 2;
        }
        if (i10 > i11) {
            return 1;
        }
        return this.f5276e.m2647b();
    }

    @Override // p080D0.InterfaceC1784S
    /* JADX INFO: renamed from: k */
    public final C12985x mo2583k(C1824q c1824q) {
        boolean z6 = c1824q.f5259c;
        C1822p c1822p = c1824q.f5258b;
        C1822p c1822p2 = c1824q.f5257a;
        if ((!z6 && c1822p2.f5254b > c1822p.f5254b) || (z6 && c1822p2.f5254b <= c1822p.f5254b)) {
            c1824q = C1824q.m2653a(c1824q, null, null, !z6, 3);
        }
        long j10 = this.f5276e.f5235a;
        C12985x c12985x = AbstractC12975n.f41185a;
        C12985x c12985x2 = new C12985x();
        int iM14710c = c12985x2.m14710c(j10);
        c12985x2.f41222b[iM14710c] = j10;
        c12985x2.f41223c[iM14710c] = c1824q;
        return c12985x2;
    }

    @Override // p080D0.InterfaceC1784S
    /* JADX INFO: renamed from: l */
    public final C1820o mo2584l() {
        return this.f5276e;
    }

    @Override // p080D0.InterfaceC1784S
    /* JADX INFO: renamed from: m */
    public final int mo2585m() {
        return this.f5273b;
    }

    public final String toString() {
        return "SingleSelectionLayout(isStartHandle=" + this.f5272a + ", crossed=" + AbstractC0168G.m511F(mo2582j()) + ", info=\n\t" + this.f5276e + ')';
    }

    @Override // p080D0.InterfaceC1784S
    /* JADX INFO: renamed from: g */
    public final void mo2579g(InterfaceC1436k interfaceC1436k) {
    }
}
