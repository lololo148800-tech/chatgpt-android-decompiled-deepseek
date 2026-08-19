package p129En;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: En.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C2590a extends CancellationException {

    /* JADX INFO: renamed from: Y */
    public final transient Object f8031Y;

    public C2590a(Object obj) {
        super("Flow was aborted, no more elements needed");
        this.f8031Y = obj;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
