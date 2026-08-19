package p164G8;

import hm.InterfaceC14537b;
import hm.InterfaceC14538c;
import java.lang.ref.WeakReference;
import java.math.BigInteger;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p817j$.util.DesugarCollections;

/* JADX INFO: renamed from: G8.a */
/* JADX INFO: loaded from: classes.dex */
public final class C3007a implements InterfaceC14537b {

    /* JADX INFO: renamed from: a */
    public final C3008b f9032a;

    /* JADX INFO: renamed from: c */
    public final long f9034c;

    /* JADX INFO: renamed from: e */
    public volatile WeakReference f9036e;

    /* JADX INFO: renamed from: d */
    public final AtomicLong f9035d = new AtomicLong();

    /* JADX INFO: renamed from: b */
    public final long f9033b = TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis());

    public C3007a(C3008b c3008b) {
        this.f9032a = c3008b;
        C3013g c3013g = c3008b.f9039b;
        c3013g.getClass();
        this.f9034c = Math.max(0L, System.nanoTime() - c3013g.f9084p0) + c3013g.f9083o0;
        C3013g c3013g2 = c3008b.f9039b;
        BigInteger bigInteger = c3013g2.f9082Z;
        if (bigInteger == null || !bigInteger.equals(c3008b.f9041d)) {
            return;
        }
        AtomicReference atomicReference = c3013g2.f9089u0;
        WeakReference weakReference = new WeakReference(this);
        while (!atomicReference.compareAndSet(null, weakReference) && atomicReference.get() == null) {
        }
        synchronized (this) {
            try {
                if (this.f9036e == null) {
                    this.f9036e = new WeakReference(this, c3013g2.f9085q0);
                    c3013g2.f9086r0.add(this.f9036e);
                    c3013g2.f9087s0.incrementAndGet();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // hm.InterfaceC14537b
    /* JADX INFO: renamed from: a */
    public final InterfaceC14537b mo3831a(String str, String str2) {
        this.f9032a.m3845h(str, str2);
        return this;
    }

    @Override // hm.InterfaceC14537b
    /* JADX INFO: renamed from: b */
    public final void mo3832b() {
        long j10 = this.f9034c;
        if (j10 <= 0) {
            m3836f(TimeUnit.MICROSECONDS.toNanos(TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis()) - this.f9033b));
        } else {
            C3013g c3013g = this.f9032a.f9039b;
            c3013g.getClass();
            m3836f((Math.max(0L, System.nanoTime() - c3013g.f9084p0) + c3013g.f9083o0) - j10);
        }
    }

    @Override // hm.InterfaceC14537b
    /* JADX INFO: renamed from: c */
    public final InterfaceC14538c mo3833c() {
        return this.f9032a;
    }

    @Override // hm.InterfaceC14537b
    /* JADX INFO: renamed from: d */
    public final InterfaceC14537b mo3834d(Integer num) {
        this.f9032a.m3845h("http.status_code", num);
        return this;
    }

    @Override // hm.InterfaceC14537b
    /* JADX INFO: renamed from: e */
    public final InterfaceC14537b mo3835e() {
        this.f9032a.m3845h("span.kind", "client");
        return this;
    }

    /* JADX INFO: renamed from: f */
    public final void m3836f(long j10) {
        C3008b c3008b;
        if (this.f9035d.compareAndSet(0L, Math.max(1L, j10))) {
            C3013g c3013g = this.f9032a.f9039b;
            synchronized (c3013g) {
                try {
                    if (this.f9035d.get() == 0) {
                        return;
                    }
                    BigInteger bigInteger = c3013g.f9082Z;
                    if (bigInteger != null && (c3008b = this.f9032a) != null) {
                        if (bigInteger.equals(c3008b.f9041d)) {
                            if (!c3013g.f9090v0.get()) {
                                c3013g.addFirst(this);
                            }
                            c3013g.m3857j(this, true);
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final Map m3837g() {
        Map mapUnmodifiableMap;
        C3008b c3008b = this.f9032a;
        synchronized (c3008b) {
            mapUnmodifiableMap = DesugarCollections.unmodifiableMap(c3008b.f9044g);
        }
        return mapUnmodifiableMap;
    }

    public final String toString() {
        return this.f9032a.toString() + ", duration_ns=" + this.f9035d;
    }
}
