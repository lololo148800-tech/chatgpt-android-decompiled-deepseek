package p758g0;

import com.google.protobuf.AbstractC12107L1;
import kotlin.jvm.internal.AbstractC16544l;
import p049Bm.InterfaceC1436k;
import p530Vi.AbstractC8301I;

/* JADX INFO: renamed from: g0.w */
/* JADX INFO: loaded from: classes.dex */
public final class C13794w implements InterfaceC13766i {

    /* JADX INFO: renamed from: a */
    public final C13791u0 f43572a;

    /* JADX INFO: renamed from: b */
    public final C13783q0 f43573b;

    /* JADX INFO: renamed from: c */
    public final Object f43574c;

    /* JADX INFO: renamed from: d */
    public final AbstractC13784r f43575d;

    /* JADX INFO: renamed from: e */
    public final AbstractC13784r f43576e;

    /* JADX INFO: renamed from: f */
    public final AbstractC13784r f43577f;

    /* JADX INFO: renamed from: g */
    public final Object f43578g;

    /* JADX INFO: renamed from: h */
    public final long f43579h;

    public C13794w(C13796x c13796x, C13783q0 c13783q0, Object obj, AbstractC13784r abstractC13784r) {
        C13791u0 c13791u0 = new C13791u0(c13796x.f43581a);
        this.f43572a = c13791u0;
        this.f43573b = c13783q0;
        this.f43574c = obj;
        AbstractC13784r abstractC13784r2 = (AbstractC13784r) c13783q0.f43526a.invoke(obj);
        this.f43575d = abstractC13784r2;
        this.f43576e = AbstractC13758e.m15247l(abstractC13784r);
        if (c13791u0.f43561d == null) {
            c13791u0.f43561d = abstractC13784r2.mo15285c();
        }
        AbstractC13784r abstractC13784r3 = c13791u0.f43561d;
        if (abstractC13784r3 == null) {
            AbstractC16544l.m18103p("targetVector");
            throw null;
        }
        int iMo15284b = abstractC13784r3.mo15284b();
        for (int i10 = 0; i10 < iMo15284b; i10++) {
            AbstractC13784r abstractC13784r4 = c13791u0.f43561d;
            if (abstractC13784r4 == null) {
                AbstractC16544l.m18103p("targetVector");
                throw null;
            }
            abstractC13784r4.mo15287e(i10, c13791u0.f43558a.mo4029F(abstractC13784r2.mo15283a(i10), abstractC13784r.mo15283a(i10)));
        }
        AbstractC13784r abstractC13784r5 = c13791u0.f43561d;
        if (abstractC13784r5 == null) {
            AbstractC16544l.m18103p("targetVector");
            throw null;
        }
        this.f43578g = c13783q0.f43527b.invoke(abstractC13784r5);
        if (c13791u0.f43560c == null) {
            c13791u0.f43560c = abstractC13784r2.mo15285c();
        }
        AbstractC13784r abstractC13784r6 = c13791u0.f43560c;
        if (abstractC13784r6 == null) {
            AbstractC16544l.m18103p("velocityVector");
            throw null;
        }
        int iMo15284b2 = abstractC13784r6.mo15284b();
        long jMax = 0;
        for (int i11 = 0; i11 < iMo15284b2; i11++) {
            abstractC13784r2.getClass();
            jMax = Math.max(jMax, c13791u0.f43558a.mo4028B(abstractC13784r.mo15283a(i11)));
        }
        this.f43579h = jMax;
        AbstractC13784r abstractC13784rM15247l = AbstractC13758e.m15247l(this.f43572a.m15295a(jMax, this.f43575d, abstractC13784r));
        this.f43577f = abstractC13784rM15247l;
        int iMo15284b3 = abstractC13784rM15247l.mo15284b();
        for (int i12 = 0; i12 < iMo15284b3; i12++) {
            AbstractC13784r abstractC13784r7 = this.f43577f;
            float fMo15283a = abstractC13784r7.mo15283a(i12);
            float f10 = this.f43572a.f43562e;
            abstractC13784r7.mo15287e(i12, AbstractC8301I.m8920k(fMo15283a, -f10, f10));
        }
    }

    @Override // p758g0.InterfaceC13766i
    /* JADX INFO: renamed from: d */
    public final boolean mo15229d() {
        return false;
    }

    @Override // p758g0.InterfaceC13766i
    /* JADX INFO: renamed from: e */
    public final long mo15230e() {
        return this.f43579h;
    }

    @Override // p758g0.InterfaceC13766i
    /* JADX INFO: renamed from: f */
    public final C13783q0 mo15231f() {
        return this.f43573b;
    }

    @Override // p758g0.InterfaceC13766i
    /* JADX INFO: renamed from: g */
    public final AbstractC13784r mo15232g(long j10) {
        if (AbstractC12107L1.m13810a(this, j10)) {
            return this.f43577f;
        }
        return this.f43572a.m15295a(j10, this.f43575d, this.f43576e);
    }

    @Override // p758g0.InterfaceC13766i
    /* JADX INFO: renamed from: h */
    public final /* synthetic */ boolean mo15233h(long j10) {
        return AbstractC12107L1.m13810a(this, j10);
    }

    @Override // p758g0.InterfaceC13766i
    /* JADX INFO: renamed from: i */
    public final Object mo15234i(long j10) {
        if (AbstractC12107L1.m13810a(this, j10)) {
            return this.f43578g;
        }
        InterfaceC1436k interfaceC1436k = this.f43573b.f43527b;
        C13791u0 c13791u0 = this.f43572a;
        AbstractC13784r abstractC13784r = c13791u0.f43559b;
        AbstractC13784r abstractC13784r2 = this.f43575d;
        if (abstractC13784r == null) {
            c13791u0.f43559b = abstractC13784r2.mo15285c();
        }
        AbstractC13784r abstractC13784r3 = c13791u0.f43559b;
        if (abstractC13784r3 == null) {
            AbstractC16544l.m18103p("valueVector");
            throw null;
        }
        int iMo15284b = abstractC13784r3.mo15284b();
        for (int i10 = 0; i10 < iMo15284b; i10++) {
            AbstractC13784r abstractC13784r4 = c13791u0.f43559b;
            if (abstractC13784r4 == null) {
                AbstractC16544l.m18103p("valueVector");
                throw null;
            }
            abstractC13784r4.mo15287e(i10, c13791u0.f43558a.mo4034s(abstractC13784r2.mo15283a(i10), this.f43576e.mo15283a(i10), j10));
        }
        AbstractC13784r abstractC13784r5 = c13791u0.f43559b;
        if (abstractC13784r5 != null) {
            return interfaceC1436k.invoke(abstractC13784r5);
        }
        AbstractC16544l.m18103p("valueVector");
        throw null;
    }

    @Override // p758g0.InterfaceC13766i
    /* JADX INFO: renamed from: j */
    public final Object mo15235j() {
        return this.f43578g;
    }
}
