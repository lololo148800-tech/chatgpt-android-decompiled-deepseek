package p038Ba;

import android.os.SystemClock;

/* JADX INFO: renamed from: Ba.b */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0852b implements Runnable {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f2365Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ AbstractC0854d f2366Z;

    public /* synthetic */ RunnableC0852b(AbstractC0854d abstractC0854d, int i10) {
        this.f2365Y = i10;
        this.f2366Z = abstractC0854d;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2365Y) {
            case 0:
                AbstractC0854d abstractC0854d = this.f2366Z;
                if (abstractC0854d.f2373r0 > 0) {
                    SystemClock.uptimeMillis();
                }
                abstractC0854d.setVisibility(0);
                break;
            default:
                AbstractC0854d abstractC0854d2 = this.f2366Z;
                ((AbstractC0863m) abstractC0854d2.getCurrentDrawable()).m1925c(false, false, true);
                if ((abstractC0854d2.getProgressDrawable() == null || !abstractC0854d2.getProgressDrawable().isVisible()) && (abstractC0854d2.getIndeterminateDrawable() == null || !abstractC0854d2.getIndeterminateDrawable().isVisible())) {
                    abstractC0854d2.setVisibility(4);
                }
                abstractC0854d2.getClass();
                break;
        }
    }
}
