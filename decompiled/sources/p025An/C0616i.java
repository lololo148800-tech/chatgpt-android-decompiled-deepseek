package p025An;

import java.util.concurrent.ScheduledFuture;
import p049Bm.InterfaceC1436k;

/* JADX INFO: renamed from: An.i */
/* JADX INFO: loaded from: classes2.dex */
public final class C0616i implements InterfaceC0618j {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f1861Y;

    /* JADX INFO: renamed from: Z */
    public final Object f1862Z;

    public /* synthetic */ C0616i(Object obj, int i10) {
        this.f1861Y = i10;
        this.f1862Z = obj;
    }

    @Override // p025An.InterfaceC0618j
    /* JADX INFO: renamed from: b */
    public final void mo1237b(Throwable th2) {
        switch (this.f1861Y) {
            case 0:
                ((ScheduledFuture) this.f1862Z).cancel(false);
                break;
            case 1:
                ((InterfaceC1436k) this.f1862Z).invoke(th2);
                break;
            default:
                ((InterfaceC0595V) this.f1862Z).dispose();
                break;
        }
    }

    public final String toString() {
        switch (this.f1861Y) {
            case 0:
                return "CancelFutureOnCancel[" + ((ScheduledFuture) this.f1862Z) + ']';
            case 1:
                return "CancelHandler.UserSupplied[" + ((InterfaceC1436k) this.f1862Z).getClass().getSimpleName() + '@' + AbstractC0575H.m1191t(this) + ']';
            default:
                return "DisposeOnCancel[" + ((InterfaceC0595V) this.f1862Z) + ']';
        }
    }
}
