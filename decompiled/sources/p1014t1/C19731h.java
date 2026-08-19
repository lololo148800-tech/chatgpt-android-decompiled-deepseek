package p1014t1;

import java.util.concurrent.CancellationException;
import p003A1.AbstractC0168G;

/* JADX INFO: renamed from: t1.h */
/* JADX INFO: loaded from: classes.dex */
public final class C19731h extends CancellationException {
    public C19731h(long j10) {
        super(AbstractC0168G.m533v("Timed out waiting for ", j10, " ms"));
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(AbstractC19736m.f62476c);
        return this;
    }
}
