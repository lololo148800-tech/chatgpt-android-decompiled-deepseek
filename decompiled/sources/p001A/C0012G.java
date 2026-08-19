package p001A;

import android.os.SystemClock;
import com.statsig.androidsdk.ErrorBoundaryKt;
import java.util.Date;

/* JADX INFO: renamed from: A.G */
/* JADX INFO: loaded from: classes.dex */
public final class C0012G {

    /* JADX INFO: renamed from: a */
    public final long f49a;

    /* JADX INFO: renamed from: b */
    public long f50b;

    /* JADX INFO: renamed from: c */
    public final Object f51c;

    public C0012G(long j10, long j11, Date date) {
        this.f49a = j10;
        this.f50b = j11;
        this.f51c = date;
    }

    /* JADX INFO: renamed from: a */
    public int m29a() {
        if (!((C0016I) this.f51c).m54c()) {
            return 700;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (this.f50b == -1) {
            this.f50b = jUptimeMillis;
        }
        long j10 = jUptimeMillis - this.f50b;
        if (j10 <= 120000) {
            return 1000;
        }
        return j10 <= 300000 ? 2000 : 4000;
    }

    /* JADX INFO: renamed from: b */
    public int m30b() {
        boolean zM54c = ((C0016I) this.f51c).m54c();
        long j10 = this.f49a;
        if (!zM54c) {
            return j10 > 0 ? Math.min((int) j10, ErrorBoundaryKt.SAMPLING_RATE) : ErrorBoundaryKt.SAMPLING_RATE;
        }
        if (j10 > 0) {
            return Math.min((int) j10, 1800000);
        }
        return 1800000;
    }

    public C0012G(C0016I c0016i, long j10) {
        this.f51c = c0016i;
        this.f50b = -1L;
        this.f49a = j10;
    }
}
