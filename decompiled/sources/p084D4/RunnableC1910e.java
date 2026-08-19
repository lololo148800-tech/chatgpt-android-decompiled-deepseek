package p084D4;

import java.util.List;
import p301M.RunnableC5228j;

/* JADX INFO: renamed from: D4.e */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1910e implements Runnable {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ List f5582Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ List f5583Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ int f5584o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C1914g f5585p0;

    public RunnableC1910e(C1914g c1914g, List list, List list2, int i10) {
        this.f5585p0 = c1914g;
        this.f5582Y = list;
        this.f5583Z = list2;
        this.f5584o0 = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f5585p0.f5599c.execute(new RunnableC5228j(this, AbstractC1906c.m3016c(new C1908d(this)), false, 3));
    }
}
