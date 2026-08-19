package p050Bn;

import mm.C17296C;
import p025An.C0624m;

/* JADX INFO: renamed from: Bn.g */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC1453g implements Runnable {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f3822Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C0624m f3823Z;

    public /* synthetic */ RunnableC1453g(C0624m c0624m, int i10) {
        this.f3822Y = i10;
        this.f3823Z = c0624m;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3822Y) {
            case 0:
                AbstractC1454h.m2055a(this.f3823Z);
                break;
            default:
                this.f3823Z.resumeWith(C17296C.f55119a);
                break;
        }
    }
}
