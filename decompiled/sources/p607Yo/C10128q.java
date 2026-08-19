package p607Yo;

import p690cp.AbstractC12915a;
import p690cp.AbstractC12933s;
import p690cp.C12934t;
import p690cp.C12938x;
import p756fp.AbstractC13719a;

/* JADX INFO: renamed from: Yo.q */
/* JADX INFO: loaded from: classes2.dex */
public final class C10128q extends AbstractC13719a {

    /* JADX INFO: renamed from: a */
    public final C12934t f30028a = new C12934t();

    /* JADX INFO: renamed from: b */
    public final int f30029b;

    /* JADX INFO: renamed from: c */
    public boolean f30030c;

    public C10128q(int i10) {
        this.f30029b = i10;
    }

    @Override // p756fp.AbstractC13719a
    /* JADX INFO: renamed from: c */
    public final boolean mo10700c(AbstractC12915a abstractC12915a) {
        if (!this.f30030c) {
            return true;
        }
        AbstractC12915a abstractC12915a2 = (AbstractC12915a) this.f30028a.f41092a;
        if (!(abstractC12915a2 instanceof AbstractC12933s)) {
            return true;
        }
        ((AbstractC12933s) abstractC12915a2).f41091g = false;
        return true;
    }

    @Override // p756fp.AbstractC13719a
    /* JADX INFO: renamed from: f */
    public final AbstractC12915a mo7966f() {
        return this.f30028a;
    }

    @Override // p756fp.AbstractC13719a
    /* JADX INFO: renamed from: h */
    public final boolean mo10701h() {
        return true;
    }

    @Override // p756fp.AbstractC13719a
    /* JADX INFO: renamed from: j */
    public final C10112a mo7967j(C10119h c10119h) {
        if (c10119h.f29977i) {
            if (this.f30028a.f41093b == null) {
                return null;
            }
            AbstractC12915a abstractC12915aMo7966f = c10119h.m10709h().mo7966f();
            this.f30030c = (abstractC12915aMo7966f instanceof C12938x) || (abstractC12915aMo7966f instanceof C12934t);
            return C10112a.m10688a(c10119h.f29974f);
        }
        int i10 = c10119h.f29976h;
        int i11 = this.f30029b;
        if (i10 >= i11) {
            return new C10112a(-1, c10119h.f29972d + i11, false);
        }
        return null;
    }
}
