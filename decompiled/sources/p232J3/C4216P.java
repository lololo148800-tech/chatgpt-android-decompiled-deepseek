package p232J3;

import android.os.Looper;
import java.util.concurrent.ExecutorService;
import p001A.C0072l;
import p003A1.RunnableC0153B;
import p083D3.C1875m;
import p1016t3.AbstractC19764N;
import p1016t3.C19794u;
import p1016t3.C19797x;
import p1073w3.AbstractC20800b;
import p1073w3.AbstractC20817s;
import p1142z3.InterfaceC21730C;
import p1142z3.InterfaceC21739g;
import p1142z3.InterfaceC21740h;
import p133F3.C2658d;
import p133F3.InterfaceC2661g;
import p140Fa.C2685e;
import p305M3.C5285e;
import p305M3.C5292l;
import p305M3.HandlerC5290j;
import p310M9.C5311e;
import p372P3.InterfaceC6336r;
import p477Tb.C7296c;

/* JADX INFO: renamed from: J3.P */
/* JADX INFO: loaded from: classes.dex */
public final class C4216P extends AbstractC4226a {

    /* JADX INFO: renamed from: h */
    public final InterfaceC21739g f13745h;

    /* JADX INFO: renamed from: i */
    public final C0072l f13746i;

    /* JADX INFO: renamed from: j */
    public final InterfaceC2661g f13747j;

    /* JADX INFO: renamed from: k */
    public final C2685e f13748k;

    /* JADX INFO: renamed from: l */
    public final int f13749l;

    /* JADX INFO: renamed from: m */
    public boolean f13750m = true;

    /* JADX INFO: renamed from: n */
    public long f13751n = -9223372036854775807L;

    /* JADX INFO: renamed from: o */
    public boolean f13752o;

    /* JADX INFO: renamed from: p */
    public boolean f13753p;

    /* JADX INFO: renamed from: q */
    public InterfaceC21730C f13754q;

    /* JADX INFO: renamed from: r */
    public C19797x f13755r;

    public C4216P(C19797x c19797x, InterfaceC21739g interfaceC21739g, C0072l c0072l, InterfaceC2661g interfaceC2661g, C2685e c2685e, int i10) {
        this.f13755r = c19797x;
        this.f13745h = interfaceC21739g;
        this.f13746i = c0072l;
        this.f13747j = interfaceC2661g;
        this.f13748k = c2685e;
        this.f13749l = i10;
    }

    @Override // p232J3.AbstractC4226a
    /* JADX INFO: renamed from: a */
    public final InterfaceC4251w mo4929a(C4253y c4253y, C5285e c5285e, long j10) {
        InterfaceC21740h interfaceC21740hMo12896c = this.f13745h.mo12896c();
        InterfaceC21730C interfaceC21730C = this.f13754q;
        if (interfaceC21730C != null) {
            interfaceC21740hMo12896c.mo927c(interfaceC21730C);
        }
        C19794u c19794u = mo4930g().f62786b;
        c19794u.getClass();
        AbstractC20800b.m21321i(this.f13813g);
        C5311e c5311e = new C5311e((InterfaceC6336r) this.f13746i.f310Z);
        int i10 = 0;
        C2658d c2658d = new C2658d(this.f13810d.f8170c, i10, c4253y);
        C2658d c2658d2 = new C2658d(this.f13809c.f8170c, i10, c4253y);
        long jM21390D = AbstractC20817s.m21390D(c19794u.f62783e);
        return new C4213M(c19794u.f62779a, interfaceC21740hMo12896c, c5311e, this.f13747j, c2658d, this.f13748k, c2658d2, this, c5285e, this.f13749l, jM21390D);
    }

    @Override // p232J3.AbstractC4226a
    /* JADX INFO: renamed from: g */
    public final synchronized C19797x mo4930g() {
        return this.f13755r;
    }

    @Override // p232J3.AbstractC4226a
    /* JADX INFO: renamed from: k */
    public final void mo4932k(InterfaceC21730C interfaceC21730C) {
        this.f13754q = interfaceC21730C;
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        C1875m c1875m = this.f13813g;
        AbstractC20800b.m21321i(c1875m);
        InterfaceC2661g interfaceC2661g = this.f13747j;
        interfaceC2661g.mo3637h(looperMyLooper, c1875m);
        interfaceC2661g.mo3634a();
        m4961s();
    }

    @Override // p232J3.AbstractC4226a
    /* JADX INFO: renamed from: m */
    public final void mo4933m(InterfaceC4251w interfaceC4251w) {
        C4213M c4213m = (C4213M) interfaceC4251w;
        if (c4213m.f13708H0) {
            for (C4219T c4219t : c4213m.f13705E0) {
                c4219t.m4975h();
                C7296c c7296c = c4219t.f13774h;
                if (c7296c != null) {
                    c7296c.m7754F(c4219t.f13771e);
                    c4219t.f13774h = null;
                    c4219t.f13773g = null;
                }
            }
        }
        C5292l c5292l = c4213m.f13736w0;
        HandlerC5290j handlerC5290j = c5292l.f17445b;
        if (handlerC5290j != null) {
            handlerC5290j.m5831a(true);
        }
        RunnableC0153B runnableC0153B = new RunnableC0153B(c4213m, 10);
        ExecutorService executorService = c5292l.f17444a;
        executorService.execute(runnableC0153B);
        executorService.shutdown();
        c4213m.f13702B0.removeCallbacksAndMessages(null);
        c4213m.f13703C0 = null;
        c4213m.f13726Y0 = true;
    }

    @Override // p232J3.AbstractC4226a
    /* JADX INFO: renamed from: o */
    public final void mo4934o() {
        this.f13747j.release();
    }

    @Override // p232J3.AbstractC4226a
    /* JADX INFO: renamed from: r */
    public final synchronized void mo4935r(C19797x c19797x) {
        this.f13755r = c19797x;
    }

    /* JADX INFO: renamed from: s */
    public final void m4961s() {
        AbstractC19764N c4223x = new C4223X(this.f13751n, this.f13752o, this.f13753p, mo4930g());
        if (this.f13750m) {
            c4223x = new C4214N(c4223x);
        }
        m4995l(c4223x);
    }

    /* JADX INFO: renamed from: t */
    public final void m4962t(long j10, boolean z6, boolean z10) {
        if (j10 == -9223372036854775807L) {
            j10 = this.f13751n;
        }
        if (!this.f13750m && this.f13751n == j10 && this.f13752o == z6 && this.f13753p == z10) {
            return;
        }
        this.f13751n = j10;
        this.f13752o = z6;
        this.f13753p = z10;
        this.f13750m = false;
        m4961s();
    }

    @Override // p232J3.AbstractC4226a
    /* JADX INFO: renamed from: i */
    public final void mo4931i() {
    }
}
