package p572Xa;

import io.sentry.internal.debugmeta.C15384c;
import p425Ra.AbstractC6835h;
import p746fa.C13599h;

/* JADX INFO: renamed from: Xa.w */
/* JADX INFO: loaded from: classes.dex */
public final class C9429w extends AbstractRunnableC9428v {

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C13599h f28408Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ AbstractC6835h f28409o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C9408b f28410p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9429w(C9408b c9408b, C13599h c13599h, C13599h c13599h2, AbstractC6835h abstractC6835h) {
        super(c13599h);
        this.f28408Z = c13599h2;
        this.f28409o0 = abstractC6835h;
        this.f28410p0 = c9408b;
    }

    @Override // p572Xa.AbstractRunnableC9428v
    /* JADX INFO: renamed from: b */
    public final void mo7271b() {
        synchronized (this.f28410p0.f28372f) {
            try {
                C9408b c9408b = this.f28410p0;
                C13599h c13599h = this.f28408Z;
                c9408b.f28371e.add(c13599h);
                c13599h.f42961a.m15122a(new C15384c(c9408b, 17, c13599h));
                if (this.f28410p0.f28378l.getAndIncrement() > 0) {
                    this.f28410p0.f28368b.m10000b("Already connected to the service.", new Object[0]);
                }
                C9408b.m9984b(this.f28410p0, this.f28409o0);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
