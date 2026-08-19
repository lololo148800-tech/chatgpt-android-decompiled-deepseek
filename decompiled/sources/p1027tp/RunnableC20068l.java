package p1027tp;

import java.io.IOException;
import p658b5.C11241l;

/* JADX INFO: renamed from: tp.l */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC20068l implements Runnable {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f63556Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C11241l f63557Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC20062f f63558o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ Object f63559p0;

    public /* synthetic */ RunnableC20068l(C11241l c11241l, InterfaceC20062f interfaceC20062f, Object obj, int i10) {
        this.f63556Y = i10;
        this.f63557Z = c11241l;
        this.f63558o0 = interfaceC20062f;
        this.f63559p0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f63556Y) {
            case 0:
                this.f63558o0.mo3626s((C20069m) this.f63557Z.f34017Z, (Throwable) this.f63559p0);
                break;
            default:
                C20069m c20069m = (C20069m) this.f63557Z.f34017Z;
                boolean zMo20895m = c20069m.f63561Z.mo20895m();
                InterfaceC20062f interfaceC20062f = this.f63558o0;
                if (!zMo20895m) {
                    interfaceC20062f.mo3627v(c20069m, (C20048M) this.f63559p0);
                } else {
                    interfaceC20062f.mo3626s(c20069m, new IOException("Canceled"));
                }
                break;
        }
    }
}
