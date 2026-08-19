package io.sentry.android.core;

import androidx.lifecycle.AbstractC11095d;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.InterfaceC11112u;
import io.sentry.C15109B;
import io.sentry.C15345d;
import io.sentry.EnumC15375i1;
import io.sentry.transport.C15481d;
import java.util.Timer;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import p239Ja.C4307j;

/* JADX INFO: renamed from: io.sentry.android.core.K */
/* JADX INFO: loaded from: classes3.dex */
public final class C15193K implements DefaultLifecycleObserver {

    /* JADX INFO: renamed from: Y */
    public final AtomicLong f47337Y;

    /* JADX INFO: renamed from: Z */
    public final AtomicBoolean f47338Z;

    /* JADX INFO: renamed from: o0 */
    public final long f47339o0;

    /* JADX INFO: renamed from: p0 */
    public C15192J f47340p0;

    /* JADX INFO: renamed from: q0 */
    public final Timer f47341q0;

    /* JADX INFO: renamed from: r0 */
    public final Object f47342r0;

    /* JADX INFO: renamed from: s0 */
    public final C15109B f47343s0;

    /* JADX INFO: renamed from: t0 */
    public final boolean f47344t0;

    /* JADX INFO: renamed from: u0 */
    public final boolean f47345u0;

    /* JADX INFO: renamed from: v0 */
    public final C15481d f47346v0;

    public C15193K(long j10, boolean z6, boolean z10) {
        C15109B c15109b = C15109B.f47017a;
        C15481d c15481d = C15481d.f48366a;
        this.f47337Y = new AtomicLong(0L);
        this.f47338Z = new AtomicBoolean(false);
        this.f47341q0 = new Timer(true);
        this.f47342r0 = new Object();
        this.f47339o0 = j10;
        this.f47344t0 = z6;
        this.f47345u0 = z10;
        this.f47343s0 = c15109b;
        this.f47346v0 = c15481d;
    }

    /* JADX INFO: renamed from: a */
    public final void m16394a(String str) {
        if (this.f47345u0) {
            C15345d c15345d = new C15345d();
            c15345d.f47907p0 = "navigation";
            c15345d.m16574b(str, "state");
            c15345d.f47909r0 = "app.lifecycle";
            c15345d.f47911t0 = EnumC15375i1.INFO;
            this.f47343s0.mo16248l(c15345d);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m16395b() {
        synchronized (this.f47342r0) {
            try {
                C15192J c15192j = this.f47340p0;
                if (c15192j != null) {
                    c15192j.cancel();
                    this.f47340p0 = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onCreate(InterfaceC11112u interfaceC11112u) {
        AbstractC11095d.m12153a(this, interfaceC11112u);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onDestroy(InterfaceC11112u interfaceC11112u) {
        AbstractC11095d.m12154b(this, interfaceC11112u);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onPause(InterfaceC11112u interfaceC11112u) {
        AbstractC11095d.m12155c(this, interfaceC11112u);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onResume(InterfaceC11112u interfaceC11112u) {
        AbstractC11095d.m12156d(this, interfaceC11112u);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStart(InterfaceC11112u interfaceC11112u) {
        m16395b();
        this.f47346v0.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        C4307j c4307j = new C4307j(this, 22);
        C15109B c15109b = this.f47343s0;
        c15109b.mo16253v(c4307j);
        AtomicLong atomicLong = this.f47337Y;
        long j10 = atomicLong.get();
        AtomicBoolean atomicBoolean = this.f47338Z;
        if (j10 == 0 || j10 + this.f47339o0 <= jCurrentTimeMillis) {
            if (this.f47344t0) {
                c15109b.mo16236C();
            }
            c15109b.mo16246j().getReplayController().start();
        } else if (!atomicBoolean.get()) {
            c15109b.mo16246j().getReplayController().mo16264a();
        }
        atomicBoolean.set(false);
        atomicLong.set(jCurrentTimeMillis);
        m16394a("foreground");
        C15183A.f47265b.m16360a(false);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(InterfaceC11112u interfaceC11112u) {
        this.f47346v0.getClass();
        this.f47337Y.set(System.currentTimeMillis());
        this.f47343s0.mo16246j().getReplayController().mo16265e();
        synchronized (this.f47342r0) {
            try {
                m16395b();
                if (this.f47341q0 != null) {
                    C15192J c15192j = new C15192J(this, 0);
                    this.f47340p0 = c15192j;
                    this.f47341q0.schedule(c15192j, this.f47339o0);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        C15183A.f47265b.m16360a(true);
        m16394a("background");
    }
}
