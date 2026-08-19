package androidx.lifecycle;

/* JADX INFO: renamed from: androidx.lifecycle.Z */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC11090Z implements Runnable {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f33456Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ AbstractC11105n f33457Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C11092a0 f33458o0;

    public /* synthetic */ RunnableC11090Z(AbstractC11105n abstractC11105n, C11092a0 c11092a0, int i10) {
        this.f33456Y = i10;
        this.f33457Z = abstractC11105n;
        this.f33458o0 = c11092a0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f33456Y) {
            case 0:
                this.f33457Z.mo7808c(this.f33458o0);
                break;
            default:
                this.f33457Z.mo7806a(this.f33458o0);
                break;
        }
    }
}
