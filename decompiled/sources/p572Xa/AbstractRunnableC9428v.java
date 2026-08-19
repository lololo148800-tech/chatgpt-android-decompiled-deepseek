package p572Xa;

import p746fa.C13599h;

/* JADX INFO: renamed from: Xa.v */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractRunnableC9428v implements Runnable {

    /* JADX INFO: renamed from: Y */
    public final C13599h f28407Y;

    public AbstractRunnableC9428v() {
        this.f28407Y = null;
    }

    /* JADX INFO: renamed from: a */
    public void mo7276a(Exception exc) {
        C13599h c13599h = this.f28407Y;
        if (c13599h != null) {
            c13599h.m15115c(exc);
        }
    }

    /* JADX INFO: renamed from: b */
    public abstract void mo7271b();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            mo7271b();
        } catch (Exception e10) {
            mo7276a(e10);
        }
    }

    public AbstractRunnableC9428v(C13599h c13599h) {
        this.f28407Y = c13599h;
    }
}
