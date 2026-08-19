package p129En;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: En.q */
/* JADX INFO: loaded from: classes2.dex */
public final class C2606q extends CancellationException {
    public C2606q() {
        super("Child of the scoped flow was cancelled");
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
