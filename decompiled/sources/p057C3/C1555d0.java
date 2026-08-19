package p057C3;

import p1016t3.AbstractC19764N;
import p1016t3.C19762L;
import p1016t3.C19763M;
import p1016t3.C19775b;
import p1016t3.C19794u;
import p1016t3.C19797x;
import p232J3.AbstractC4242n;

/* JADX INFO: renamed from: C3.d0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1555d0 extends AbstractC4242n {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f4309c = 0;

    /* JADX INFO: renamed from: d */
    public final Object f4310d;

    public C1555d0(AbstractC19764N abstractC19764N, C19797x c19797x) {
        super(abstractC19764N);
        this.f4310d = c19797x;
    }

    @Override // p232J3.AbstractC4242n, p1016t3.AbstractC19764N
    /* JADX INFO: renamed from: f */
    public C19762L mo2410f(int i10, C19762L c19762l, boolean z6) {
        switch (this.f4309c) {
            case 0:
                AbstractC19764N abstractC19764N = this.f13864b;
                C19762L c19762lMo2410f = abstractC19764N.mo2410f(i10, c19762l, z6);
                if (abstractC19764N.mo2411m(c19762lMo2410f.f62579c, (C19763M) this.f4310d, 0L).m20722a()) {
                    c19762lMo2410f.m20721h(c19762l.f62577a, c19762l.f62578b, c19762l.f62579c, c19762l.f62580d, c19762l.f62581e, C19775b.f62661c, true);
                } else {
                    c19762lMo2410f.f62582f = true;
                }
                return c19762lMo2410f;
            default:
                return super.mo2410f(i10, c19762l, z6);
        }
    }

    @Override // p232J3.AbstractC4242n, p1016t3.AbstractC19764N
    /* JADX INFO: renamed from: m */
    public C19763M mo2411m(int i10, C19763M c19763m, long j10) {
        switch (this.f4309c) {
            case 1:
                super.mo2411m(i10, c19763m, j10);
                C19797x c19797x = (C19797x) this.f4310d;
                c19763m.f62588c = c19797x;
                C19794u c19794u = c19797x.f62786b;
                c19763m.getClass();
                return c19763m;
            default:
                return super.mo2411m(i10, c19763m, j10);
        }
    }

    public C1555d0(AbstractC19764N abstractC19764N) {
        super(abstractC19764N);
        this.f4310d = new C19763M();
    }
}
