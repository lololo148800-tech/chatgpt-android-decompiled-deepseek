package p849k7;

import android.gov.nist.javax.sip.header.SIPHeaderNames;
import java.util.concurrent.Delayed;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: k7.k */
/* JADX INFO: loaded from: classes.dex */
public final class ScheduledFutureC16358k implements ScheduledFuture {
    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z6) {
        return false;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Delayed delayed) {
        return 0;
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws ExecutionException {
        throw new ExecutionException(SIPHeaderNames.UNSUPPORTED, new UnsupportedOperationException());
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return 0L;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j10, TimeUnit timeUnit) throws ExecutionException {
        throw new ExecutionException(SIPHeaderNames.UNSUPPORTED, new UnsupportedOperationException());
    }
}
