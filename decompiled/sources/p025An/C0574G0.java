package p025An;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: An.G0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0574G0 extends CancellationException implements InterfaceC0648y {

    /* JADX INFO: renamed from: Y */
    public final transient RunnableC0576H0 f1795Y;

    public C0574G0(String str, RunnableC0576H0 runnableC0576H0) {
        super(str);
        this.f1795Y = runnableC0576H0;
    }

    @Override // p025An.InterfaceC0648y
    /* JADX INFO: renamed from: a */
    public final Throwable mo1152a() {
        String message = getMessage();
        if (message == null) {
            message = "";
        }
        C0574G0 c0574g0 = new C0574G0(message, this.f1795Y);
        c0574g0.initCause(this);
        return c0574g0;
    }
}
