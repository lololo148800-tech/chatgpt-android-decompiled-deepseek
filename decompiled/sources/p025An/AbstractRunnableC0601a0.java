package p025An;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p153Fn.C2942t;
import p153Fn.C2944v;

/* JADX INFO: renamed from: An.a0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractRunnableC0601a0 implements Runnable, Comparable, InterfaceC0595V {

    /* JADX INFO: renamed from: Y */
    public long f1834Y;

    /* JADX INFO: renamed from: Z */
    public int f1835Z = -1;
    private volatile Object _heap;

    public AbstractRunnableC0601a0(long j10) {
        this.f1834Y = j10;
    }

    /* JADX INFO: renamed from: a */
    public final C2944v m1228a() {
        Object obj = this._heap;
        if (obj instanceof C2944v) {
            return (C2944v) obj;
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final int m1229c(long j10, C0603b0 c0603b0, AbstractC0605c0 abstractC0605c0) {
        synchronized (this) {
            if (this._heap == AbstractC0575H.f1797b) {
                return 2;
            }
            synchronized (c0603b0) {
                try {
                    AbstractRunnableC0601a0[] abstractRunnableC0601a0Arr = c0603b0.f8810a;
                    AbstractRunnableC0601a0 abstractRunnableC0601a0 = abstractRunnableC0601a0Arr != null ? abstractRunnableC0601a0Arr[0] : null;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = AbstractC0605c0.f1842r0;
                    abstractC0605c0.getClass();
                    if (AbstractC0605c0.f1844t0.get(abstractC0605c0) == 1) {
                        return 1;
                    }
                    if (abstractRunnableC0601a0 == null) {
                        c0603b0.f1837c = j10;
                    } else {
                        long j11 = abstractRunnableC0601a0.f1834Y;
                        if (j11 - j10 < 0) {
                            j10 = j11;
                        }
                        if (j10 - c0603b0.f1837c > 0) {
                            c0603b0.f1837c = j10;
                        }
                    }
                    long j12 = this.f1834Y;
                    long j13 = c0603b0.f1837c;
                    if (j12 - j13 < 0) {
                        this.f1834Y = j13;
                    }
                    c0603b0.m3767a(this);
                    return 0;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j10 = this.f1834Y - ((AbstractRunnableC0601a0) obj).f1834Y;
        if (j10 > 0) {
            return 1;
        }
        return j10 < 0 ? -1 : 0;
    }

    /* JADX INFO: renamed from: d */
    public final void m1230d(C0603b0 c0603b0) {
        if (this._heap == AbstractC0575H.f1797b) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this._heap = c0603b0;
    }

    @Override // p025An.InterfaceC0595V
    public final void dispose() {
        synchronized (this) {
            try {
                Object obj = this._heap;
                C2942t c2942t = AbstractC0575H.f1797b;
                if (obj == c2942t) {
                    return;
                }
                C0603b0 c0603b0 = obj instanceof C0603b0 ? (C0603b0) obj : null;
                if (c0603b0 != null) {
                    c0603b0.m3768b(this);
                }
                this._heap = c2942t;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public String toString() {
        return "Delayed[nanos=" + this.f1834Y + ']';
    }
}
