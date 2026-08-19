package io.sentry;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import p111E5.CallableC2341y;

/* JADX INFO: renamed from: io.sentry.z */
/* JADX INFO: loaded from: classes3.dex */
public final class C15525z {

    /* JADX INFO: renamed from: g */
    public static final long f48477g = TimeUnit.HOURS.toMillis(5);

    /* JADX INFO: renamed from: h */
    public static final long f48478h = TimeUnit.SECONDS.toMillis(1);

    /* JADX INFO: renamed from: i */
    public static C15525z f48479i;

    /* JADX INFO: renamed from: a */
    public final long f48480a;

    /* JADX INFO: renamed from: b */
    public volatile String f48481b;

    /* JADX INFO: renamed from: c */
    public volatile long f48482c;

    /* JADX INFO: renamed from: d */
    public final AtomicBoolean f48483d;

    /* JADX INFO: renamed from: e */
    public final CallableC15519x f48484e;

    /* JADX INFO: renamed from: f */
    public final ExecutorService f48485f;

    public C15525z() {
        CallableC15519x callableC15519x = new CallableC15519x(0);
        this.f48483d = new AtomicBoolean(false);
        this.f48485f = Executors.newSingleThreadExecutor(new ThreadFactoryC15522y(0));
        this.f48480a = f48477g;
        this.f48484e = callableC15519x;
        m16732a();
    }

    /* JADX INFO: renamed from: a */
    public final void m16732a() {
        try {
            this.f48485f.submit(new CallableC2341y(this, 3)).get(f48478h, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            this.f48482c = TimeUnit.SECONDS.toMillis(1L) + System.currentTimeMillis();
        } catch (RuntimeException | ExecutionException | TimeoutException unused2) {
            this.f48482c = TimeUnit.SECONDS.toMillis(1L) + System.currentTimeMillis();
        }
    }
}
