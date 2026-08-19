package p758g0;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: g0.u0 */
/* JADX INFO: loaded from: classes.dex */
public final class C13791u0 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC13728D f43558a;

    /* JADX INFO: renamed from: b */
    public AbstractC13784r f43559b;

    /* JADX INFO: renamed from: c */
    public AbstractC13784r f43560c;

    /* JADX INFO: renamed from: d */
    public AbstractC13784r f43561d;

    /* JADX INFO: renamed from: e */
    public final float f43562e;

    public C13791u0(InterfaceC13728D interfaceC13728D) {
        this.f43558a = interfaceC13728D;
        this.f43562e = interfaceC13728D.mo4032h();
    }

    /* JADX INFO: renamed from: a */
    public final AbstractC13784r m15295a(long j10, AbstractC13784r abstractC13784r, AbstractC13784r abstractC13784r2) {
        if (this.f43560c == null) {
            this.f43560c = abstractC13784r.mo15285c();
        }
        AbstractC13784r abstractC13784r3 = this.f43560c;
        if (abstractC13784r3 == null) {
            AbstractC16544l.m18103p("velocityVector");
            throw null;
        }
        int iMo15284b = abstractC13784r3.mo15284b();
        for (int i10 = 0; i10 < iMo15284b; i10++) {
            AbstractC13784r abstractC13784r4 = this.f43560c;
            if (abstractC13784r4 == null) {
                AbstractC16544l.m18103p("velocityVector");
                throw null;
            }
            abstractC13784r.getClass();
            abstractC13784r4.mo15287e(i10, this.f43558a.mo4033q(abstractC13784r2.mo15283a(i10), j10));
        }
        AbstractC13784r abstractC13784r5 = this.f43560c;
        if (abstractC13784r5 != null) {
            return abstractC13784r5;
        }
        AbstractC16544l.m18103p("velocityVector");
        throw null;
    }
}
