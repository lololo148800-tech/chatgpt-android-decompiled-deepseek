package p524Va;

import p500Ua.C7595d;
import p658b5.C11234e;
import p746fa.C13599h;

/* JADX INFO: renamed from: Va.f */
/* JADX INFO: loaded from: classes.dex */
public final class C8254f extends AbstractRunnableC8253e {

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C13599h f25737Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C7595d f25738o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C8256h f25739p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8254f(C8256h c8256h, C13599h c13599h, C13599h c13599h2, C7595d c7595d) {
        super(c13599h);
        this.f25737Z = c13599h2;
        this.f25738o0 = c7595d;
        this.f25739p0 = c8256h;
    }

    @Override // p524Va.AbstractRunnableC8253e
    /* JADX INFO: renamed from: a */
    public final void mo7946a() {
        synchronized (this.f25739p0.f25748f) {
            try {
                C8256h c8256h = this.f25739p0;
                C13599h c13599h = this.f25737Z;
                c8256h.f25747e.add(c13599h);
                c13599h.f42961a.m15122a(new C11234e(c8256h, 16, c13599h));
                if (this.f25739p0.f25753k.getAndIncrement() > 0) {
                    this.f25739p0.f25744b.m5360c("Already connected to the service.", new Object[0]);
                }
                C8256h.m8891b(this.f25739p0, this.f25738o0);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
