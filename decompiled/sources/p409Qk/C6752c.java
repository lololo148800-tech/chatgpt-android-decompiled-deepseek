package p409Qk;

import il.AbstractC15037b;
import java.io.Closeable;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.internal.AbstractC16544l;
import p008A6.C0383c;
import p008A6.C0386f;
import p025An.C0625m0;
import p025An.C0631p0;
import p025An.InterfaceC0571F;
import p025An.InterfaceC0627n0;
import p041Be.C1217J;
import p049Bm.InterfaceC1436k;
import p059C5.C1592j;
import p071Ch.C1661A;
import p434Rk.C6911c;
import p509Uk.C7713f;
import p556Wk.AbstractC8887A;
import p556Wk.AbstractC8889C;
import p556Wk.AbstractC8895I;
import p556Wk.AbstractC8899M;
import p556Wk.AbstractC8900N;
import p556Wk.AbstractC8918d;
import p556Wk.AbstractC8929k;
import p556Wk.AbstractC8936r;
import p556Wk.C8905T;
import p571X9.AbstractC9233X;
import p582Xk.C9526c;
import p754fl.C13693c;
import p754fl.C13696f;
import p784hb.C14438g;
import p792hl.C14526a;
import p909nm.AbstractC17680n;
import p972qm.InterfaceC18770c;
import p972qm.InterfaceC18776i;
import p996rm.EnumC19250a;
import sl.C19666a;
import sl.C19675j;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: Qk.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C6752c implements InterfaceC0571F, Closeable {

    /* JADX INFO: renamed from: y0 */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f21665y0 = AtomicIntegerFieldUpdater.newUpdater(C6752c.class, "closed");

    /* JADX INFO: renamed from: Y */
    public final C7713f f21666Y;

    /* JADX INFO: renamed from: Z */
    public final C6754e f21667Z;
    private volatile /* synthetic */ int closed = 0;

    /* JADX INFO: renamed from: o0 */
    public final boolean f21668o0;

    /* JADX INFO: renamed from: p0 */
    public final C0631p0 f21669p0;

    /* JADX INFO: renamed from: q0 */
    public final InterfaceC18776i f21670q0;

    /* JADX INFO: renamed from: r0 */
    public final C13696f f21671r0;

    /* JADX INFO: renamed from: s0 */
    public final C14526a f21672s0;

    /* JADX INFO: renamed from: t0 */
    public final C13696f f21673t0;

    /* JADX INFO: renamed from: u0 */
    public final C14526a f21674u0;

    /* JADX INFO: renamed from: v0 */
    public final C19675j f21675v0;

    /* JADX INFO: renamed from: w0 */
    public final C14438g f21676w0;

    /* JADX INFO: renamed from: x0 */
    public final C6754e f21677x0;

    public C6752c(C7713f c7713f, C6754e c6754e, boolean z6) {
        int i10 = 3;
        int i11 = 7;
        this.f21666Y = c7713f;
        this.f21667Z = c6754e;
        C0631p0 c0631p0 = new C0631p0((InterfaceC0627n0) c7713f.f24306s0.get(C0625m0.f1875Y));
        this.f21669p0 = c0631p0;
        this.f21670q0 = c7713f.f24306s0.plus(c0631p0);
        this.f21671r0 = new C13696f(0);
        this.f21672s0 = new C14526a(1);
        C13696f c13696f = new C13696f(1);
        this.f21673t0 = c13696f;
        this.f21674u0 = new C14526a(0);
        this.f21675v0 = new C19675j();
        this.f21676w0 = new C14438g(3);
        C6754e c6754e2 = new C6754e();
        this.f21677x0 = c6754e2;
        if (this.f21668o0) {
            c0631p0.mo1271H0(new C6750a(this));
        }
        InterfaceC18770c interfaceC18770c = null;
        c13696f.m21471f(C13696f.f43217o, new C1661A(this, c7713f, interfaceC18770c, i10));
        c13696f.m21471f(C13696f.f43218p, new C1592j(this, interfaceC18770c, 9));
        c6754e2.m7190a(AbstractC8900N.f27242b, new C0383c(i11));
        c6754e2.m7190a(AbstractC8918d.f27289c, new C0383c(i11));
        c6754e2.m7190a(AbstractC8936r.f27329c, new C0383c(i11));
        if (c6754e.f21686f) {
            c6754e2.f21683c.put("DefaultTransformers", new C0383c(6));
        }
        c6754e2.m7190a(C8905T.f27254b, new C0383c(i11));
        C9526c c9526c = AbstractC8887A.f27205b;
        c6754e2.m7190a(c9526c, new C0383c(i11));
        if (c6754e.f21685e) {
            c6754e2.m7190a(AbstractC8899M.f27240d, new C0383c(i11));
        }
        c6754e2.m7191b(c6754e);
        if (c6754e.f21686f) {
            c6754e2.m7190a(AbstractC8895I.f27224b, new C0383c(i11));
        }
        C19666a c19666a = AbstractC8929k.f27305a;
        c6754e2.m7190a(c9526c, new C0386f(c6754e2, 13));
        Iterator it = c6754e2.f21681a.values().iterator();
        while (it.hasNext()) {
            ((InterfaceC1436k) it.next()).invoke(this);
        }
        Iterator it2 = c6754e2.f21683c.values().iterator();
        while (it2.hasNext()) {
            ((InterfaceC1436k) it2.next()).invoke(this);
        }
        this.f21672s0.m21471f(C14526a.f45782j, new C1217J(this, interfaceC18770c, i10));
        this.f21668o0 = z6;
    }

    /* JADX INFO: renamed from: a */
    public final C6752c m7188a(InterfaceC1436k interfaceC1436k) {
        C6754e c6754e = new C6754e();
        c6754e.m7191b(this.f21667Z);
        interfaceC1436k.invoke(c6754e);
        return new C6752c(this.f21666Y, c6754e, this.f21668o0);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (f21665y0.compareAndSet(this, 0, 1)) {
            C19675j c19675j = (C19675j) this.f21675v0.m20649c(AbstractC8889C.f27207a);
            for (C19666a c19666a : AbstractC17680n.m19322C0(c19675j.m20650d().keySet())) {
                AbstractC16544l.m18092e(c19666a, "null cannot be cast to non-null type io.ktor.util.AttributeKey<kotlin.Any>");
                Object objM20649c = c19675j.m20649c(c19666a);
                if (objM20649c instanceof Closeable) {
                    ((Closeable) objM20649c).close();
                }
            }
            this.f21669p0.m1279g0();
            if (this.f21668o0) {
                this.f21666Y.close();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: e */
    public final Object m7189e(C13693c c13693c, AbstractC19687c abstractC19687c) {
        C6751b c6751b;
        if (abstractC19687c instanceof C6751b) {
            c6751b = (C6751b) abstractC19687c;
            int i10 = c6751b.f21664o0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c6751b.f21664o0 = i10 - Integer.MIN_VALUE;
            } else {
                c6751b = new C6751b(this, abstractC19687c);
            }
        } else {
            c6751b = new C6751b(this, abstractC19687c);
        }
        Object objM21467a = c6751b.f21662Y;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c6751b.f21664o0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(objM21467a);
            this.f21676w0.m15966f(AbstractC15037b.f46752a);
            Object obj = c13693c.f43198d;
            c6751b.f21664o0 = 1;
            objM21467a = this.f21671r0.m21467a(c13693c, obj, c6751b);
            if (objM21467a == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(objM21467a);
        }
        AbstractC16544l.m18092e(objM21467a, "null cannot be cast to non-null type io.ktor.client.call.HttpClientCall");
        return (C6911c) objM21467a;
    }

    @Override // p025An.InterfaceC0571F
    public final InterfaceC18776i getCoroutineContext() {
        return this.f21670q0;
    }

    public final String toString() {
        return "HttpClient[" + this.f21666Y + ']';
    }
}
