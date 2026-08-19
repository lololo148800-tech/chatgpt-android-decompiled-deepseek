package p523V9;

import android.content.Context;
import android.os.SystemClock;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import p084D4.C1918i;
import p1022t9.C19820e;
import p1060v9.C20490h;
import p1060v9.C20493k;
import p1060v9.C20494l;
import p1102x9.C21158b;

/* JADX INFO: renamed from: V9.y6 */
/* JADX INFO: loaded from: classes.dex */
public final class C8240y6 {

    /* JADX INFO: renamed from: a */
    public final C21158b f25716a;

    /* JADX INFO: renamed from: b */
    public final AtomicLong f25717b;

    public C8240y6(Context context, int i10) {
        switch (i10) {
            case 1:
                this.f25717b = new AtomicLong(-1L);
                this.f25716a = new C21158b(context, null, C21158b.f67233k, new C20494l("mlkit:vision"), C19820e.f62871c);
                break;
            default:
                this.f25717b = new AtomicLong(-1L);
                this.f25716a = new C21158b(context, null, C21158b.f67233k, new C20494l("mlkit:vision"), C19820e.f62871c);
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m8887a(int i10, int i11, long j10, long j11) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f25717b.get() != -1 && jElapsedRealtime - this.f25717b.get() <= TimeUnit.MINUTES.toMillis(30L)) {
            return;
        }
        this.f25716a.m21593c(new C20493k(0, Arrays.asList(new C20490h(i10, i11, 0, j10, j11, null, null, 0, -1)))).m15124c(new C1918i(this, jElapsedRealtime, 6));
    }
}
