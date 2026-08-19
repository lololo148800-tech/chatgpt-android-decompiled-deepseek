package p697d5;

import p747fb.InterfaceFutureC13608b;

/* JADX INFO: renamed from: d5.j */
/* JADX INFO: loaded from: classes.dex */
public final class C13027j extends AbstractC13025h {
    /* JADX INFO: renamed from: k */
    public final boolean m14769k(Object obj) {
        if (obj == null) {
            obj = AbstractC13025h.f41325s0;
        }
        if (!AbstractC13025h.f41324r0.mo8217c(this, null, obj)) {
            return false;
        }
        AbstractC13025h.m14761d(this);
        return true;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m14770l(Throwable th2) {
        if (!AbstractC13025h.f41324r0.mo8217c(this, null, new C13019b(th2))) {
            return false;
        }
        AbstractC13025h.m14761d(this);
        return true;
    }

    /* JADX INFO: renamed from: m */
    public final boolean m14771m(InterfaceFutureC13608b interfaceFutureC13608b) {
        C13019b c13019b;
        interfaceFutureC13608b.getClass();
        Object obj = this.f41326Y;
        if (obj == null) {
            if (interfaceFutureC13608b.isDone()) {
                if (!AbstractC13025h.f41324r0.mo8217c(this, null, AbstractC13025h.m14764g(interfaceFutureC13608b))) {
                    return false;
                }
                AbstractC13025h.m14761d(this);
            } else {
                RunnableC13022e runnableC13022e = new RunnableC13022e(this, interfaceFutureC13608b);
                if (AbstractC13025h.f41324r0.mo8217c(this, null, runnableC13022e)) {
                    try {
                        interfaceFutureC13608b.mo5766a(runnableC13022e, EnumC13026i.f41329Y);
                    } catch (Throwable th2) {
                        try {
                            c13019b = new C13019b(th2);
                        } catch (Throwable unused) {
                            c13019b = C13019b.f41306b;
                        }
                        AbstractC13025h.f41324r0.mo8217c(this, runnableC13022e, c13019b);
                    }
                } else {
                    obj = this.f41326Y;
                }
            }
            return true;
        }
        if (!(obj instanceof C13018a)) {
            return false;
        }
        interfaceFutureC13608b.cancel(((C13018a) obj).f41304a);
        return false;
    }
}
