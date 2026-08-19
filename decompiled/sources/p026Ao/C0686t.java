package p026Ao;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: Ao.t */
/* JADX INFO: loaded from: classes2.dex */
public final class C0686t extends C0665N {

    /* JADX INFO: renamed from: e */
    public C0665N f1996e;

    public C0686t(C0665N delegate) {
        AbstractC16544l.m18094g(delegate, "delegate");
        this.f1996e = delegate;
    }

    @Override // p026Ao.C0665N
    /* JADX INFO: renamed from: a */
    public final C0665N mo1390a() {
        return this.f1996e.mo1390a();
    }

    @Override // p026Ao.C0665N
    /* JADX INFO: renamed from: b */
    public final C0665N mo1391b() {
        return this.f1996e.mo1391b();
    }

    @Override // p026Ao.C0665N
    /* JADX INFO: renamed from: c */
    public final long mo1392c() {
        return this.f1996e.mo1392c();
    }

    @Override // p026Ao.C0665N
    /* JADX INFO: renamed from: d */
    public final C0665N mo1387d(long j10) {
        return this.f1996e.mo1387d(j10);
    }

    @Override // p026Ao.C0665N
    /* JADX INFO: renamed from: e */
    public final boolean mo1393e() {
        return this.f1996e.mo1393e();
    }

    @Override // p026Ao.C0665N
    /* JADX INFO: renamed from: f */
    public final void mo1388f() throws InterruptedIOException {
        this.f1996e.mo1388f();
    }

    @Override // p026Ao.C0665N
    /* JADX INFO: renamed from: g */
    public final C0665N mo1389g(long j10, TimeUnit unit) {
        AbstractC16544l.m18094g(unit, "unit");
        return this.f1996e.mo1389g(j10, unit);
    }

    @Override // p026Ao.C0665N
    /* JADX INFO: renamed from: h */
    public final long mo1394h() {
        return this.f1996e.mo1394h();
    }
}
