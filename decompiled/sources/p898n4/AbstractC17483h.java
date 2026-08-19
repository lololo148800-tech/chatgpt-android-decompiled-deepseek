package p898n4;

import io.sentry.util.C15504i;
import java.util.ArrayDeque;
import java.util.PriorityQueue;
import p1073w3.AbstractC20800b;
import p1073w3.AbstractC20817s;
import p594Y9.C9895g4;
import p885m4.C17156f;
import p885m4.C17160j;
import p885m4.InterfaceC17158h;

/* JADX INFO: renamed from: n4.h */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC17483h implements InterfaceC17158h {

    /* JADX INFO: renamed from: a */
    public final ArrayDeque f55933a = new ArrayDeque();

    /* JADX INFO: renamed from: b */
    public final ArrayDeque f55934b;

    /* JADX INFO: renamed from: c */
    public final PriorityQueue f55935c;

    /* JADX INFO: renamed from: d */
    public C17482g f55936d;

    /* JADX INFO: renamed from: e */
    public long f55937e;

    /* JADX INFO: renamed from: f */
    public long f55938f;

    /* JADX INFO: renamed from: g */
    public long f55939g;

    public AbstractC17483h() {
        for (int i10 = 0; i10 < 10; i10++) {
            this.f55933a.add(new C17482g(1));
        }
        this.f55934b = new ArrayDeque();
        for (int i11 = 0; i11 < 2; i11++) {
            ArrayDeque arrayDeque = this.f55934b;
            C15504i c15504i = new C15504i(this, 7);
            C17156f c17156f = new C17156f();
            c17156f.f54830t0 = c15504i;
            arrayDeque.add(c17156f);
        }
        this.f55935c = new PriorityQueue();
        this.f55939g = -9223372036854775807L;
    }

    @Override // p031B3.InterfaceC0800d
    /* JADX INFO: renamed from: a */
    public final void mo1830a(C17160j c17160j) {
        AbstractC20800b.m21316d(c17160j == this.f55936d);
        C17482g c17482g = (C17482g) c17160j;
        long j10 = this.f55939g;
        if (j10 == -9223372036854775807L || c17482g.f2228s0 >= j10) {
            long j11 = this.f55938f;
            this.f55938f = 1 + j11;
            c17482g.f55932w0 = j11;
            this.f55935c.add(c17482g);
        } else {
            c17482g.mo1834n();
            this.f55933a.add(c17482g);
        }
        this.f55936d = null;
    }

    @Override // p031B3.InterfaceC0800d
    /* JADX INFO: renamed from: b */
    public final void mo1831b(long j10) {
        this.f55939g = j10;
    }

    @Override // p885m4.InterfaceC17158h
    /* JADX INFO: renamed from: c */
    public final void mo3815c(long j10) {
        this.f55937e = j10;
    }

    @Override // p031B3.InterfaceC0800d
    /* JADX INFO: renamed from: e */
    public final Object mo1833e() {
        AbstractC20800b.m21320h(this.f55936d == null);
        ArrayDeque arrayDeque = this.f55933a;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        C17482g c17482g = (C17482g) arrayDeque.pollFirst();
        this.f55936d = c17482g;
        return c17482g;
    }

    /* JADX INFO: renamed from: f */
    public abstract C9895g4 mo19179f();

    @Override // p031B3.InterfaceC0800d
    public void flush() {
        ArrayDeque arrayDeque;
        this.f55938f = 0L;
        this.f55937e = 0L;
        while (true) {
            PriorityQueue priorityQueue = this.f55935c;
            boolean zIsEmpty = priorityQueue.isEmpty();
            arrayDeque = this.f55933a;
            if (zIsEmpty) {
                break;
            }
            C17482g c17482g = (C17482g) priorityQueue.poll();
            int i10 = AbstractC20817s.f66106a;
            c17482g.mo1834n();
            arrayDeque.add(c17482g);
        }
        C17482g c17482g2 = this.f55936d;
        if (c17482g2 != null) {
            c17482g2.mo1834n();
            arrayDeque.add(c17482g2);
            this.f55936d = null;
        }
    }

    /* JADX INFO: renamed from: g */
    public abstract void mo19180g(C17482g c17482g);

    @Override // p031B3.InterfaceC0800d
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public C17156f mo1832d() {
        ArrayDeque arrayDeque = this.f55934b;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        while (true) {
            PriorityQueue priorityQueue = this.f55935c;
            if (!priorityQueue.isEmpty()) {
                C17482g c17482g = (C17482g) priorityQueue.peek();
                int i10 = AbstractC20817s.f66106a;
                if (c17482g.f2228s0 > this.f55937e) {
                    break;
                }
                C17482g c17482g2 = (C17482g) priorityQueue.poll();
                boolean zM1824d = c17482g2.m1824d(4);
                ArrayDeque arrayDeque2 = this.f55933a;
                if (zM1824d) {
                    C17156f c17156f = (C17156f) arrayDeque.pollFirst();
                    c17156f.m1823a(4);
                    c17482g2.mo1834n();
                    arrayDeque2.add(c17482g2);
                    return c17156f;
                }
                mo19180g(c17482g2);
                if (mo19182i()) {
                    C9895g4 c9895g4Mo19179f = mo19179f();
                    C17156f c17156f2 = (C17156f) arrayDeque.pollFirst();
                    long j10 = c17482g2.f2228s0;
                    c17156f2.f2231o0 = j10;
                    c17156f2.f54827q0 = c9895g4Mo19179f;
                    c17156f2.f54828r0 = j10;
                    c17482g2.mo1834n();
                    arrayDeque2.add(c17482g2);
                    return c17156f2;
                }
                c17482g2.mo1834n();
                arrayDeque2.add(c17482g2);
            } else {
                break;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: i */
    public abstract boolean mo19182i();

    @Override // p031B3.InterfaceC0800d
    public void release() {
    }
}
