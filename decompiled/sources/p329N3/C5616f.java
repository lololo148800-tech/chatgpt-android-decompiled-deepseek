package p329N3;

import android.content.Context;
import android.os.SystemClock;
import android.util.Pair;
import java.util.NoSuchElementException;
import java.util.concurrent.CopyOnWriteArraySet;
import p001A.C0042V0;
import p057C3.C1524B;
import p1016t3.AbstractC19754D;
import p1016t3.C19773X;
import p1016t3.C19787n;
import p1016t3.C19788o;
import p1073w3.AbstractC20800b;
import p1073w3.AbstractC20817s;
import p1073w3.C20813o;
import p1073w3.C20815q;
import p127El.ExecutorC2575a;
import p370P0.C6277D;
import p720e6.C13287b;

/* JADX INFO: renamed from: N3.f */
/* JADX INFO: loaded from: classes.dex */
public final class C5616f {

    /* JADX INFO: renamed from: m */
    public static final ExecutorC2575a f18177m = new ExecutorC2575a(2);

    /* JADX INFO: renamed from: a */
    public final C5615e f18178a;

    /* JADX INFO: renamed from: b */
    public final C5625o f18179b;

    /* JADX INFO: renamed from: c */
    public final C5630t f18180c;

    /* JADX INFO: renamed from: d */
    public final C5613c f18181d;

    /* JADX INFO: renamed from: e */
    public final C20813o f18182e;

    /* JADX INFO: renamed from: f */
    public final CopyOnWriteArraySet f18183f;

    /* JADX INFO: renamed from: g */
    public C19788o f18184g;

    /* JADX INFO: renamed from: h */
    public C1524B f18185h;

    /* JADX INFO: renamed from: i */
    public C20815q f18186i;

    /* JADX INFO: renamed from: j */
    public Pair f18187j;

    /* JADX INFO: renamed from: k */
    public int f18188k;

    /* JADX INFO: renamed from: l */
    public int f18189l;

    public C5616f(C0042V0 c0042v0) {
        C5615e c5615e = new C5615e(this, (Context) c0042v0.f205Z);
        this.f18178a = c5615e;
        C20813o c20813o = (C20813o) c0042v0.f209r0;
        this.f18182e = c20813o;
        C5625o c5625o = (C5625o) c0042v0.f206o0;
        this.f18179b = c5625o;
        c5625o.f18261k = c20813o;
        this.f18180c = new C5630t(new C13287b(this, 18), c5625o);
        C5613c c5613c = (C5613c) c0042v0.f208q0;
        AbstractC20800b.m21321i(c5613c);
        this.f18181d = c5613c;
        CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
        this.f18183f = copyOnWriteArraySet;
        this.f18189l = 0;
        copyOnWriteArraySet.add(c5615e);
    }

    /* JADX INFO: renamed from: a */
    public final void m6005a(long j10, long j11) {
        C5630t c5630t;
        C6277D c6277d;
        int i10;
        if (this.f18188k != 0 || (i10 = (c6277d = (c5630t = this.f18180c).f18291f).f20383c) == 0) {
            return;
        }
        if (i10 == 0) {
            throw new NoSuchElementException();
        }
        long j12 = ((long[]) c6277d.f20385e)[c6277d.f20382b];
        Long l4 = (Long) c5630t.f18290e.m5075G(j12);
        C5625o c5625o = c5630t.f18287b;
        if (l4 != null && l4.longValue() != c5630t.f18294i) {
            c5630t.f18294i = l4.longValue();
            c5625o.m6031c(2);
        }
        int iM6029a = c5630t.f18287b.m6029a(j12, j10, j11, c5630t.f18294i, false, c5630t.f18288c);
        C5616f c5616f = (C5616f) c5630t.f18286a.f42000Z;
        if (iM6029a != 0 && iM6029a != 1) {
            if (iM6029a != 2 && iM6029a != 3 && iM6029a != 4) {
                if (iM6029a != 5) {
                    throw new IllegalStateException(String.valueOf(iM6029a));
                }
                return;
            }
            c5630t.f18295j = j12;
            c6277d.m6823p0();
            for (C5615e c5615e : c5616f.f18183f) {
                c5615e.f18175i.execute(new RunnableC5614d(c5615e, c5615e.f18174h, 1));
            }
            AbstractC20800b.m21321i(null);
            throw null;
        }
        c5630t.f18295j = j12;
        long jM6823p0 = c6277d.m6823p0();
        C19773X c19773x = (C19773X) c5630t.f18289d.m5075G(jM6823p0);
        if (c19773x != null && !c19773x.equals(C19773X.f62650e) && !c19773x.equals(c5630t.f18293h)) {
            c5630t.f18293h = c19773x;
            C19787n c19787n = new C19787n();
            c19787n.f62720r = c19773x.f62651a;
            c19787n.f62721s = c19773x.f62652b;
            c19787n.f62714l = AbstractC19754D.m20711i("video/raw");
            c5616f.f18184g = new C19788o(c19787n);
            for (C5615e c5615e2 : c5616f.f18183f) {
                c5615e2.f18175i.execute(new RunnableC5614d(c5615e2, c5615e2.f18174h, c19773x));
            }
        }
        boolean z6 = c5625o.f18254d != 3;
        c5625o.f18254d = 3;
        c5625o.f18261k.getClass();
        c5625o.f18256f = AbstractC20817s.m21390D(SystemClock.elapsedRealtime());
        if (z6 && c5616f.f18187j != null) {
            for (C5615e c5615e3 : c5616f.f18183f) {
                c5615e3.f18175i.execute(new RunnableC5614d(c5615e3, c5615e3.f18174h, 2));
            }
        }
        if (c5616f.f18185h != null) {
            if (c5616f.f18184g == null) {
                new C19787n().m20746a();
            }
            C1524B c1524b = c5616f.f18185h;
            c5616f.f18182e.getClass();
            c1524b.m2227d(jM6823p0, System.nanoTime());
        }
        AbstractC20800b.m21321i(null);
        throw null;
    }
}
