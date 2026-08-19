package p357Oa;

import p746fa.C13599h;

/* JADX INFO: renamed from: Oa.i */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractRunnableC6156i implements Runnable {

    /* JADX INFO: renamed from: Y */
    public final C13599h f20040Y;

    public AbstractRunnableC6156i() {
        this.f20040Y = null;
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo6140a();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            mo6140a();
        } catch (Exception e10) {
            C13599h c13599h = this.f20040Y;
            if (c13599h != null) {
                c13599h.m15115c(e10);
            }
        }
    }

    public AbstractRunnableC6156i(C13599h c13599h) {
        this.f20040Y = c13599h;
    }
}
