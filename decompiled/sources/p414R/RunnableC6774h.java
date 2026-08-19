package p414R;

import p544W9.AbstractC8577W2;

/* JADX INFO: renamed from: R.h */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC6774h implements Runnable {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f21749Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C6778l f21750Z;

    public /* synthetic */ RunnableC6774h(C6778l c6778l, int i10) {
        this.f21749Y = i10;
        this.f21750Z = c6778l;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f21749Y) {
            case 0:
                C6778l c6778l = this.f21750Z;
                c6778l.getClass();
                AbstractC8577W2.m9243e().execute(new RunnableC6774h(c6778l, 1));
                break;
            default:
                C6778l c6778l2 = this.f21750Z;
                if (!c6778l2.f21775n) {
                    c6778l2.m7226d();
                }
                break;
        }
    }
}
