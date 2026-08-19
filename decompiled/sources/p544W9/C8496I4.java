package p544W9;

import android.os.SystemClock;
import java.io.Closeable;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: renamed from: W9.I4 */
/* JADX INFO: loaded from: classes.dex */
public class C8496I4 implements Closeable {

    /* JADX INFO: renamed from: r0 */
    public static final HashMap f26315r0 = new HashMap();

    /* JADX INFO: renamed from: Y */
    public int f26316Y;

    /* JADX INFO: renamed from: Z */
    public long f26317Z;

    /* JADX INFO: renamed from: o0 */
    public long f26318o0;

    /* JADX INFO: renamed from: p0 */
    public long f26319p0 = 2147483647L;

    /* JADX INFO: renamed from: q0 */
    public long f26320q0 = -2147483648L;

    public C8496I4(String str) {
    }

    /* JADX INFO: renamed from: a */
    public void mo9147a() {
        this.f26317Z = SystemClock.elapsedRealtimeNanos() / 1000;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        long j10 = this.f26317Z;
        if (j10 == 0) {
            throw new IllegalStateException("Did you forget to call start()?");
        }
        mo9149k(j10);
    }

    /* JADX INFO: renamed from: e */
    public void mo9148e(long j10) {
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos() / 1000;
        long j11 = this.f26318o0;
        if (j11 != 0 && jElapsedRealtimeNanos - j11 >= 1000000) {
            this.f26316Y = 0;
            this.f26317Z = 0L;
            this.f26319p0 = 2147483647L;
            this.f26320q0 = -2147483648L;
        }
        this.f26318o0 = jElapsedRealtimeNanos;
        this.f26316Y++;
        this.f26319p0 = Math.min(this.f26319p0, j10);
        this.f26320q0 = Math.max(this.f26320q0, j10);
        if (this.f26316Y % 50 == 0) {
            Locale locale = Locale.US;
            C8544Q4.m9205b();
        }
        if (this.f26316Y % 500 == 0) {
            this.f26316Y = 0;
            this.f26317Z = 0L;
            this.f26319p0 = 2147483647L;
            this.f26320q0 = -2147483648L;
        }
    }

    /* JADX INFO: renamed from: k */
    public void mo9149k(long j10) {
        mo9148e((SystemClock.elapsedRealtimeNanos() / 1000) - j10);
    }
}
