package p026Ao;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: Ao.N */
/* JADX INFO: loaded from: classes2.dex */
public class C0665N {

    /* JADX INFO: renamed from: d */
    public static final C0664M f1937d = new C0664M();

    /* JADX INFO: renamed from: a */
    public boolean f1938a;

    /* JADX INFO: renamed from: b */
    public long f1939b;

    /* JADX INFO: renamed from: c */
    public long f1940c;

    /* JADX INFO: renamed from: a */
    public C0665N mo1390a() {
        this.f1938a = false;
        return this;
    }

    /* JADX INFO: renamed from: b */
    public C0665N mo1391b() {
        this.f1940c = 0L;
        return this;
    }

    /* JADX INFO: renamed from: c */
    public long mo1392c() {
        if (this.f1938a) {
            return this.f1939b;
        }
        throw new IllegalStateException("No deadline");
    }

    /* JADX INFO: renamed from: d */
    public C0665N mo1387d(long j10) {
        this.f1938a = true;
        this.f1939b = j10;
        return this;
    }

    /* JADX INFO: renamed from: e */
    public boolean mo1393e() {
        return this.f1938a;
    }

    /* JADX INFO: renamed from: f */
    public void mo1388f() throws InterruptedIOException {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        if (this.f1938a && this.f1939b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    /* JADX INFO: renamed from: g */
    public C0665N mo1389g(long j10, TimeUnit unit) {
        AbstractC16544l.m18094g(unit, "unit");
        if (j10 < 0) {
            throw new IllegalArgumentException(AbstractC10763a.m11049g(j10, "timeout < 0: ").toString());
        }
        this.f1940c = unit.toNanos(j10);
        return this;
    }

    /* JADX INFO: renamed from: h */
    public long mo1394h() {
        return this.f1940c;
    }
}
