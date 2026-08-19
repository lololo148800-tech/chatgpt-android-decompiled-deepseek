package p025An;

import java.util.concurrent.ScheduledFuture;

/* JADX INFO: renamed from: An.U */
/* JADX INFO: loaded from: classes2.dex */
public final class C0594U implements InterfaceC0595V {

    /* JADX INFO: renamed from: Y */
    public final ScheduledFuture f1826Y;

    public C0594U(ScheduledFuture scheduledFuture) {
        this.f1826Y = scheduledFuture;
    }

    @Override // p025An.InterfaceC0595V
    public final void dispose() {
        this.f1826Y.cancel(false);
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.f1826Y + ']';
    }
}
