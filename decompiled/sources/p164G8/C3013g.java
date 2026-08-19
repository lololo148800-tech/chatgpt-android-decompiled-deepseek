package p164G8;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p1021t8.C19813d;
import p817j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: G8.g */
/* JADX INFO: loaded from: classes.dex */
public final class C3013g extends LinkedList {

    /* JADX INFO: renamed from: w0 */
    public static final AtomicReference f9080w0 = new AtomicReference();

    /* JADX INFO: renamed from: Y */
    public final C19813d f9081Y;

    /* JADX INFO: renamed from: Z */
    public final BigInteger f9082Z;

    /* JADX INFO: renamed from: q0 */
    public final ReferenceQueue f9085q0 = new ReferenceQueue();

    /* JADX INFO: renamed from: r0 */
    public final Set f9086r0 = Collections.newSetFromMap(new ConcurrentHashMap());

    /* JADX INFO: renamed from: s0 */
    public final AtomicInteger f9087s0 = new AtomicInteger(0);

    /* JADX INFO: renamed from: t0 */
    public final AtomicInteger f9088t0 = new AtomicInteger(0);

    /* JADX INFO: renamed from: u0 */
    public final AtomicReference f9089u0 = new AtomicReference();

    /* JADX INFO: renamed from: v0 */
    public final AtomicBoolean f9090v0 = new AtomicBoolean(false);

    /* JADX INFO: renamed from: o0 */
    public final long f9083o0 = TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());

    /* JADX INFO: renamed from: p0 */
    public final long f9084p0 = System.nanoTime();

    public C3013g(C19813d c19813d, BigInteger bigInteger) {
        this.f9081Y = c19813d;
        this.f9082Z = bigInteger;
        RunnableC3011e runnableC3011e = (RunnableC3011e) f9080w0.get();
        if (runnableC3011e != null) {
            runnableC3011e.f9078Y.add(this);
        }
    }

    @Override // java.util.LinkedList, java.util.Deque
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final void addFirst(C3007a c3007a) {
        synchronized (this) {
            super.addFirst(c3007a);
        }
        this.f9088t0.incrementAndGet();
    }

    /* JADX INFO: renamed from: i */
    public final void m3856i() {
        if (this.f9087s0.decrementAndGet() == 0) {
            m3859q();
            return;
        }
        if (this.f9081Y.f9071t0 <= 0 || this.f9088t0.get() <= this.f9081Y.f9071t0) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f9088t0.get() > this.f9081Y.f9071t0) {
                    C3007a c3007aM3858p = m3858p();
                    ArrayList arrayList = new ArrayList(this.f9088t0.get());
                    Iterator<E> it = iterator();
                    while (it.hasNext()) {
                        C3007a c3007a = (C3007a) it.next();
                        if (c3007a != c3007aM3858p) {
                            arrayList.add(c3007a);
                            this.f9088t0.decrementAndGet();
                            it.remove();
                        }
                    }
                    this.f9081Y.m3852e(arrayList);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m3857j(C3007a c3007a, boolean z6) {
        C3008b c3008b;
        BigInteger bigInteger = this.f9082Z;
        if (bigInteger == null || (c3008b = c3007a.f9032a) == null || !bigInteger.equals(c3008b.f9041d)) {
            return;
        }
        synchronized (c3007a) {
            try {
                if (c3007a.f9036e == null) {
                    return;
                }
                this.f9086r0.remove(c3007a.f9036e);
                c3007a.f9036e.clear();
                c3007a.f9036e = null;
                if (z6) {
                    m3856i();
                } else {
                    this.f9087s0.decrementAndGet();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public final C3007a m3858p() {
        WeakReference weakReference = (WeakReference) this.f9089u0.get();
        if (weakReference == null) {
            return null;
        }
        return (C3007a) weakReference.get();
    }

    /* JADX INFO: renamed from: q */
    public final synchronized void m3859q() {
        if (this.f9090v0.compareAndSet(false, true)) {
            RunnableC3011e runnableC3011e = (RunnableC3011e) f9080w0.get();
            if (runnableC3011e != null) {
                runnableC3011e.f9078Y.remove(this);
            }
            if (!isEmpty()) {
                this.f9081Y.m3852e(this);
            }
        }
    }

    @Override // java.util.LinkedList, java.util.AbstractCollection, java.util.Collection, java.util.List, java.util.Deque
    public final int size() {
        return this.f9088t0.get();
    }
}
