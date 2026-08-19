package p232J3;

import android.util.Pair;
import p057C3.C1555d0;
import p1016t3.AbstractC19764N;
import p1016t3.C19762L;
import p1016t3.C19763M;
import p1016t3.C19797x;
import p1073w3.AbstractC20800b;
import p305M3.C5285e;

/* JADX INFO: renamed from: J3.t */
/* JADX INFO: loaded from: classes.dex */
public final class C4248t extends AbstractC4231c0 {

    /* JADX INFO: renamed from: l */
    public final boolean f13883l;

    /* JADX INFO: renamed from: m */
    public final C19763M f13884m;

    /* JADX INFO: renamed from: n */
    public final C19762L f13885n;

    /* JADX INFO: renamed from: o */
    public C4246r f13886o;

    /* JADX INFO: renamed from: p */
    public C4245q f13887p;

    /* JADX INFO: renamed from: q */
    public boolean f13888q;

    /* JADX INFO: renamed from: r */
    public boolean f13889r;

    /* JADX INFO: renamed from: s */
    public boolean f13890s;

    public C4248t(AbstractC4226a abstractC4226a, boolean z6) {
        super(abstractC4226a);
        this.f13883l = z6 && abstractC4226a.mo4993h();
        this.f13884m = new C19763M();
        this.f13885n = new C19762L();
        AbstractC19764N abstractC19764NMo4992f = abstractC4226a.mo4992f();
        if (abstractC19764NMo4992f == null) {
            this.f13886o = new C4246r(new C4247s(abstractC4226a.mo4930g()), C19763M.f62584p, C4246r.f13879e);
        } else {
            this.f13886o = new C4246r(abstractC19764NMo4992f, null, null);
            this.f13890s = true;
        }
    }

    @Override // p232J3.AbstractC4231c0
    /* JADX INFO: renamed from: A */
    public final void mo5001A() {
        if (this.f13883l) {
            return;
        }
        this.f13888q = true;
        m5006z();
    }

    @Override // p232J3.AbstractC4226a
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public final C4245q mo4929a(C4253y c4253y, C5285e c5285e, long j10) {
        C4245q c4245q = new C4245q(c4253y, c5285e, j10);
        AbstractC20800b.m21320h(c4245q.f13875p0 == null);
        c4245q.f13875p0 = this.f13828k;
        if (this.f13889r) {
            Object obj = this.f13886o.f13881d;
            Object obj2 = c4253y.f13895a;
            if (obj != null && obj2.equals(C4246r.f13879e)) {
                obj2 = this.f13886o.f13881d;
            }
            c4245q.m5011n(c4253y.m5016a(obj2));
        } else {
            this.f13887p = c4245q;
            if (!this.f13888q) {
                this.f13888q = true;
                m5006z();
            }
        }
        return c4245q;
    }

    /* JADX INFO: renamed from: C */
    public final boolean m5013C(long j10) {
        C4245q c4245q = this.f13887p;
        int iMo2413b = this.f13886o.mo2413b(c4245q.f13872Y.f13895a);
        if (iMo2413b == -1) {
            return false;
        }
        C4246r c4246r = this.f13886o;
        C19762L c19762l = this.f13885n;
        c4246r.mo2410f(iMo2413b, c19762l, false);
        long j11 = c19762l.f62580d;
        if (j11 != -9223372036854775807L && j10 >= j11) {
            j10 = Math.max(0L, j11 - 1);
        }
        c4245q.f13878s0 = j10;
        return true;
    }

    @Override // p232J3.AbstractC4226a
    /* JADX INFO: renamed from: m */
    public final void mo4933m(InterfaceC4251w interfaceC4251w) {
        C4245q c4245q = (C4245q) interfaceC4251w;
        if (c4245q.f13876q0 != null) {
            AbstractC4226a abstractC4226a = c4245q.f13875p0;
            abstractC4226a.getClass();
            abstractC4226a.mo4933m(c4245q.f13876q0);
        }
        if (interfaceC4251w == this.f13887p) {
            this.f13887p = null;
        }
    }

    @Override // p232J3.AbstractC4237i, p232J3.AbstractC4226a
    /* JADX INFO: renamed from: o */
    public final void mo4934o() {
        this.f13889r = false;
        this.f13888q = false;
        super.mo4934o();
    }

    @Override // p232J3.AbstractC4231c0, p232J3.AbstractC4226a
    /* JADX INFO: renamed from: r */
    public final void mo4935r(C19797x c19797x) {
        if (this.f13890s) {
            C4246r c4246r = this.f13886o;
            this.f13886o = new C4246r(new C1555d0(this.f13886o.f13864b, c19797x), c4246r.f13880c, c4246r.f13881d);
        } else {
            this.f13886o = new C4246r(new C4247s(c19797x), C19763M.f62584p, C4246r.f13879e);
        }
        this.f13828k.mo4935r(c19797x);
    }

    @Override // p232J3.AbstractC4231c0
    /* JADX INFO: renamed from: x */
    public final C4253y mo5004x(C4253y c4253y) {
        Object obj = c4253y.f13895a;
        Object obj2 = this.f13886o.f13881d;
        if (obj2 != null && obj2.equals(obj)) {
            obj = C4246r.f13879e;
        }
        return c4253y.m5016a(obj);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x006d  */
    /* JADX WARN: Code duplicated, block: B:37:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:39:? A[RETURN, SYNTHETIC] */
    @Override // p232J3.AbstractC4231c0
    /* JADX INFO: renamed from: y */
    public final void mo5005y(AbstractC19764N abstractC19764N) {
        long j10;
        C4246r c4246r;
        C4253y c4253yM5016a;
        C4246r c4246r2;
        if (this.f13889r) {
            C4246r c4246r3 = this.f13886o;
            this.f13886o = new C4246r(abstractC19764N, c4246r3.f13880c, c4246r3.f13881d);
            C4245q c4245q = this.f13887p;
            if (c4245q != null) {
                m5013C(c4245q.f13878s0);
            }
        } else {
            if (!abstractC19764N.m20728p()) {
                C19763M c19763m = this.f13884m;
                abstractC19764N.m20727n(0, c19763m);
                long j11 = c19763m.f62596k;
                Object obj = c19763m.f62586a;
                C4245q c4245q2 = this.f13887p;
                if (c4245q2 != null) {
                    C4246r c4246r4 = this.f13886o;
                    Object obj2 = c4245q2.f13872Y.f13895a;
                    C19762L c19762l = this.f13885n;
                    c4246r4.mo2416g(obj2, c19762l);
                    long j12 = c19762l.f62581e + c4245q2.f13873Z;
                    this.f13886o.mo2411m(0, c19763m, 0L);
                    if (j12 != c19763m.f62596k) {
                        j10 = j12;
                    } else {
                        j10 = j11;
                    }
                } else {
                    j10 = j11;
                }
                Pair pairM20725i = abstractC19764N.m20725i(this.f13884m, this.f13885n, 0, j10);
                Object obj3 = pairM20725i.first;
                long jLongValue = ((Long) pairM20725i.second).longValue();
                if (this.f13890s) {
                    C4246r c4246r5 = this.f13886o;
                    c4246r = new C4246r(abstractC19764N, c4246r5.f13880c, c4246r5.f13881d);
                } else {
                    c4246r = new C4246r(abstractC19764N, obj, obj3);
                }
                this.f13886o = c4246r;
                C4245q c4245q3 = this.f13887p;
                if (c4245q3 != null && m5013C(jLongValue)) {
                    C4253y c4253y = c4245q3.f13872Y;
                    Object obj4 = this.f13886o.f13881d;
                    Object obj5 = c4253y.f13895a;
                    if (obj4 != null && obj5.equals(C4246r.f13879e)) {
                        obj5 = this.f13886o.f13881d;
                    }
                    c4253yM5016a = c4253y.m5016a(obj5);
                }
                this.f13890s = true;
                this.f13889r = true;
                m4995l(this.f13886o);
                if (c4253yM5016a != null) {
                    C4245q c4245q4 = this.f13887p;
                    c4245q4.getClass();
                    c4245q4.m5011n(c4253yM5016a);
                }
            }
            if (this.f13890s) {
                C4246r c4246r6 = this.f13886o;
                c4246r2 = new C4246r(abstractC19764N, c4246r6.f13880c, c4246r6.f13881d);
            } else {
                c4246r2 = new C4246r(abstractC19764N, C19763M.f62584p, C4246r.f13879e);
            }
            this.f13886o = c4246r2;
        }
        c4253yM5016a = null;
        this.f13890s = true;
        this.f13889r = true;
        m4995l(this.f13886o);
        if (c4253yM5016a != null) {
            C4245q c4245q5 = this.f13887p;
            c4245q5.getClass();
            c4245q5.m5011n(c4253yM5016a);
        }
    }

    @Override // p232J3.AbstractC4237i, p232J3.AbstractC4226a
    /* JADX INFO: renamed from: i */
    public final void mo4931i() {
    }
}
