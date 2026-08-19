package p501Ub;

import android.content.Context;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import p038Ba.AbstractC0865o;
import p401Qb.C6584a;
import p444S4.C7002h;
import p523V9.AbstractC7873E0;
import p594Y9.C9895g4;
import p639a5.C10502a;
import p658b5.C11245p;
import p674c5.C11661n;
import p697d5.C13018a;
import p697d5.C13027j;
import p746fa.C13599h;
import p746fa.C13606o;
import p960q9.C18655i;

/* JADX INFO: renamed from: Ub.p */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC7614p implements Runnable {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f24066Y = 0;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Object f24067Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Object f24068o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ Object f24069p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ Object f24070q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ Object f24071r0;

    public /* synthetic */ RunnableC7614p(AbstractC0865o abstractC0865o, C9895g4 c9895g4, C18655i c18655i, Callable callable, C13599h c13599h) {
        this.f24067Z = abstractC0865o;
        this.f24068o0 = c9895g4;
        this.f24069p0 = c18655i;
        this.f24070q0 = callable;
        this.f24071r0 = c13599h;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f24066Y) {
            case 0:
                Callable callable = (Callable) this.f24070q0;
                C13599h c13599h = (C13599h) this.f24071r0;
                AbstractC0865o abstractC0865o = (AbstractC0865o) this.f24067Z;
                abstractC0865o.getClass();
                C13606o c13606o = (C13606o) ((C9895g4) this.f24068o0).f29409Y;
                boolean zM15131j = c13606o.m15131j();
                C18655i c18655i = (C18655i) this.f24069p0;
                if (zM15131j) {
                    c18655i.m20028h();
                    return;
                }
                AtomicBoolean atomicBoolean = (AtomicBoolean) abstractC0865o.f2433c;
                try {
                    try {
                        if (!atomicBoolean.get()) {
                            abstractC0865o.mo1937j();
                            atomicBoolean.set(true);
                        }
                        if (c13606o.m15131j()) {
                            c18655i.m20028h();
                            return;
                        }
                        Object objCall = callable.call();
                        if (c13606o.m15131j()) {
                            c18655i.m20028h();
                            return;
                        } else {
                            c13599h.m15114b(objCall);
                            return;
                        }
                    } catch (RuntimeException e10) {
                        throw new C6584a(13, e10, "Internal error has occurred when executing ML Kit tasks");
                    }
                } catch (Exception e11) {
                    if (c13606o.m15131j()) {
                        c18655i.m20028h();
                        return;
                    } else {
                        c13599h.m15113a(e11);
                        return;
                    }
                }
            default:
                try {
                    if (!(((C13027j) this.f24067Z).f41326Y instanceof C13018a)) {
                        String string = ((UUID) this.f24068o0).toString();
                        C11245p c11245pM12646p = ((C11661n) this.f24071r0).f35318c.m12646p(string);
                        if (c11245pM12646p == null || c11245pM12646p.f34042b.m7415a()) {
                            throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                        }
                        ((C11661n) this.f24071r0).f35317b.m7648i(string, (C7002h) this.f24069p0);
                        ((Context) this.f24070q0).startService(C10502a.m10959a((Context) this.f24070q0, AbstractC7873E0.m8151b(c11245pM12646p), (C7002h) this.f24069p0));
                    }
                    ((C13027j) this.f24067Z).m14769k(null);
                    return;
                } catch (Throwable th2) {
                    ((C13027j) this.f24067Z).m14770l(th2);
                    return;
                }
        }
    }

    public RunnableC7614p(C11661n c11661n, C13027j c13027j, UUID uuid, C7002h c7002h, Context context) {
        this.f24071r0 = c11661n;
        this.f24067Z = c13027j;
        this.f24068o0 = uuid;
        this.f24069p0 = c7002h;
        this.f24070q0 = context;
    }
}
