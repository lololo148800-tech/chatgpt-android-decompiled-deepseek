package p1014t1;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: t1.b */
/* JADX INFO: loaded from: classes.dex */
public final class C19725b extends CancellationException {

    /* JADX INFO: renamed from: Y */
    public static final C19725b f62447Y = new C19725b();

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(AbstractC19736m.f62476c);
        return this;
    }
}
