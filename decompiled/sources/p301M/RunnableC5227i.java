package p301M;

import p610Z1.C10142i;

/* JADX INFO: renamed from: M.i */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC5227i implements Runnable {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f16972Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C10142i f16973Z;

    public /* synthetic */ RunnableC5227i(C10142i c10142i, int i10) {
        this.f16972Y = i10;
        this.f16973Z = c10142i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16972Y) {
            case 0:
                this.f16973Z.m10747a(null);
                break;
            default:
                this.f16973Z.m10748b(new Exception("Failed to snapshot: OpenGLRenderer not ready."));
                break;
        }
    }
}
