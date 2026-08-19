package p414R;

import p610Z1.C10142i;
import p610Z1.C10145l;

/* JADX INFO: renamed from: R.i */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC6775i implements Runnable {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f21751Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C6777k f21752Z;

    public /* synthetic */ RunnableC6775i(C6777k c6777k, int i10) {
        this.f21751Y = i10;
        this.f21752Z = c6777k;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f21751Y) {
            case 0:
                this.f21752Z.mo4507a();
                break;
            case 1:
                this.f21752Z.m4508b();
                break;
            default:
                C6777k c6777k = this.f21752Z;
                C6779m c6779m = c6777k.f21761r;
                if (c6779m != null) {
                    c6779m.m7230k();
                }
                if (c6777k.f21760q == null) {
                    C10142i c10142i = c6777k.f21759p;
                    c10142i.f30067d = true;
                    C10145l c10145l = c10142i.f30065b;
                    if (c10145l != null && c10145l.f30070Z.cancel(true)) {
                        c10142i.f30064a = null;
                        c10142i.f30065b = null;
                        c10142i.f30066c = null;
                        break;
                    }
                }
                break;
        }
    }
}
