package p860l0;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: l0.a */
/* JADX INFO: loaded from: classes.dex */
public final class C16722a extends CancellationException {
    public C16722a() {
        super("Anchored drag finished");
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
