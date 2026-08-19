package p001A;

import p178H.C3150i0;

/* JADX INFO: renamed from: A.X0 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0046X0 implements Runnable {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f217Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C3150i0 f218Z;

    public /* synthetic */ RunnableC0046X0(C3150i0 c3150i0, int i10) {
        this.f217Y = i10;
        this.f218Z = c3150i0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f217Y) {
            case 0:
                this.f218Z.m3987a();
                break;
            case 1:
                this.f218Z.m3987a();
                break;
            default:
                C3150i0 c3150i0 = this.f218Z;
                if (c3150i0 != null) {
                    c3150i0.m3987a();
                }
                break;
        }
    }
}
