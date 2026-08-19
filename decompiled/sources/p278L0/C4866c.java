package p278L0;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: L0.c */
/* JADX INFO: loaded from: classes.dex */
public final class C4866c extends CancellationException {
    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
