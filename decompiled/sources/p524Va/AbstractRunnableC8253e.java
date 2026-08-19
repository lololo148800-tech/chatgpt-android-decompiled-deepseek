package p524Va;

import p746fa.C13599h;

/* JADX INFO: renamed from: Va.e */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractRunnableC8253e implements Runnable {

    /* JADX INFO: renamed from: Y */
    public final C13599h f25736Y;

    public AbstractRunnableC8253e() {
        this.f25736Y = null;
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo7946a();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            mo7946a();
        } catch (Exception e10) {
            C13599h c13599h = this.f25736Y;
            if (c13599h != null) {
                c13599h.m15115c(e10);
            }
        }
    }

    public AbstractRunnableC8253e(C13599h c13599h) {
        this.f25736Y = c13599h;
    }
}
