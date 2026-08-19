package vc;

import android.javax.sip.C10808o;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p1139z0.C21585H;
import p594Y9.C9895g4;
import p867l8.C16831c;
import p935p.RunnableC18260f;

/* JADX INFO: renamed from: vc.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C20520d {

    /* JADX INFO: renamed from: a */
    public final AtomicReference f65137a = new AtomicReference(EnumC20518b.f65132Y);

    /* JADX INFO: renamed from: b */
    public final AtomicLong f65138b = new AtomicLong(0);

    /* JADX INFO: renamed from: c */
    public final ExecutorService f65139c = Executors.newSingleThreadExecutor(ThreadFactoryC20519c.f65136a);

    /* JADX INFO: renamed from: d */
    public final C9895g4 f65140d;

    /* JADX INFO: renamed from: e */
    public final C21585H f65141e;

    /* JADX INFO: renamed from: f */
    public final C10808o f65142f;

    /* JADX INFO: renamed from: g */
    public final List f65143g;

    /* JADX INFO: renamed from: h */
    public final long f65144h;

    /* JADX INFO: renamed from: i */
    public final long f65145i;

    /* JADX INFO: renamed from: j */
    public final long f65146j;

    /* JADX INFO: renamed from: k */
    public final long f65147k;

    public C20520d(C9895g4 c9895g4, C16831c c16831c, C21585H c21585h, C10808o c10808o, List list, long j10, long j11, long j12, long j13) {
        this.f65140d = c9895g4;
        this.f65141e = c21585h;
        this.f65142f = c10808o;
        this.f65143g = list;
        this.f65144h = j10;
        this.f65145i = j11;
        this.f65146j = j12;
        this.f65147k = j13;
    }

    /* JADX INFO: renamed from: a */
    public final void m21185a() {
        if (((EnumC20518b) this.f65137a.get()) == EnumC20518b.f65134o0) {
            throw new IllegalStateException("Service already shutdown");
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m21186b() {
        m21185a();
        if (((EnumC20518b) this.f65137a.get()) != EnumC20518b.f65133Z) {
            this.f65139c.submit(new RunnableC18260f(this, 10));
        }
    }
}
