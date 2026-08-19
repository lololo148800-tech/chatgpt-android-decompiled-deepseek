package p153Fn;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: Fn.l */
/* JADX INFO: loaded from: classes2.dex */
public final class C2934l {

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f8790e = AtomicReferenceFieldUpdater.newUpdater(C2934l.class, Object.class, "_next$volatile");

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ AtomicLongFieldUpdater f8791f = AtomicLongFieldUpdater.newUpdater(C2934l.class, "_state$volatile");

    /* JADX INFO: renamed from: g */
    public static final C2942t f8792g = new C2942t("REMOVE_FROZEN", 0);
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;

    /* JADX INFO: renamed from: a */
    public final int f8793a;

    /* JADX INFO: renamed from: b */
    public final boolean f8794b;

    /* JADX INFO: renamed from: c */
    public final int f8795c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ AtomicReferenceArray f8796d;

    public C2934l(int i10, boolean z6) {
        this.f8793a = i10;
        this.f8794b = z6;
        int i11 = i10 - 1;
        this.f8795c = i11;
        this.f8796d = new AtomicReferenceArray(i10);
        if (i11 > 1073741823) {
            throw new IllegalStateException("Check failed.");
        }
        if ((i10 & i11) != 0) {
            throw new IllegalStateException("Check failed.");
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m3757a(Runnable runnable) {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f8791f;
            long j10 = atomicLongFieldUpdater.get(this);
            if ((3458764513820540928L & j10) != 0) {
                return (j10 & 2305843009213693952L) != 0 ? 2 : 1;
            }
            int i10 = (int) (1073741823 & j10);
            int i11 = (int) ((1152921503533105152L & j10) >> 30);
            int i12 = this.f8795c;
            if (((i11 + 2) & i12) == (i10 & i12)) {
                return 1;
            }
            AtomicReferenceArray atomicReferenceArray = this.f8796d;
            if (!this.f8794b && atomicReferenceArray.get(i11 & i12) != null) {
                int i13 = this.f8793a;
                if (i13 < 1024 || ((i11 - i10) & 1073741823) > (i13 >> 1)) {
                    return 1;
                }
            } else if (atomicLongFieldUpdater.compareAndSet(this, j10, ((-1152921503533105153L) & j10) | (((long) ((i11 + 1) & 1073741823)) << 30))) {
                atomicReferenceArray.set(i11 & i12, runnable);
                C2934l c2934lM3759c = this;
                while ((atomicLongFieldUpdater.get(c2934lM3759c) & 1152921504606846976L) != 0) {
                    c2934lM3759c = c2934lM3759c.m3759c();
                    AtomicReferenceArray atomicReferenceArray2 = c2934lM3759c.f8796d;
                    int i14 = c2934lM3759c.f8795c & i11;
                    Object obj = atomicReferenceArray2.get(i14);
                    if ((obj instanceof C2933k) && ((C2933k) obj).f8789a == i11) {
                        atomicReferenceArray2.set(i14, runnable);
                    } else {
                        c2934lM3759c = null;
                    }
                    if (c2934lM3759c == null) {
                        return 0;
                    }
                }
                return 0;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m3758b() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j10;
        do {
            atomicLongFieldUpdater = f8791f;
            j10 = atomicLongFieldUpdater.get(this);
            if ((j10 & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j10) != 0) {
                return false;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j10, 2305843009213693952L | j10));
        return true;
    }

    /* JADX INFO: renamed from: c */
    public final C2934l m3759c() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j10;
        while (true) {
            atomicLongFieldUpdater = f8791f;
            j10 = atomicLongFieldUpdater.get(this);
            if ((j10 & 1152921504606846976L) != 0) {
                break;
            }
            long j11 = j10 | 1152921504606846976L;
            if (atomicLongFieldUpdater.compareAndSet(this, j10, j11)) {
                j10 = j11;
                break;
            }
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8790e;
            C2934l c2934l = (C2934l) atomicReferenceFieldUpdater.get(this);
            if (c2934l != null) {
                return c2934l;
            }
            C2934l c2934l2 = new C2934l(this.f8793a * 2, this.f8794b);
            int i10 = (int) (1073741823 & j10);
            int i11 = (int) ((1152921503533105152L & j10) >> 30);
            while (true) {
                int i12 = this.f8795c;
                int i13 = i10 & i12;
                if (i13 == (i12 & i11)) {
                    break;
                }
                Object c2933k = this.f8796d.get(i13);
                if (c2933k == null) {
                    c2933k = new C2933k(i10);
                }
                c2934l2.f8796d.set(c2934l2.f8795c & i10, c2933k);
                i10++;
            }
            atomicLongFieldUpdater.set(c2934l2, (-1152921504606846977L) & j10);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, c2934l2) && atomicReferenceFieldUpdater.get(this) == null) {
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final Object m3760d() {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f8791f;
            long j10 = atomicLongFieldUpdater.get(this);
            if ((j10 & 1152921504606846976L) != 0) {
                return f8792g;
            }
            int i10 = (int) (j10 & 1073741823);
            int i11 = this.f8795c;
            int i12 = i10 & i11;
            if ((((int) ((1152921503533105152L & j10) >> 30)) & i11) == i12) {
                return null;
            }
            AtomicReferenceArray atomicReferenceArray = this.f8796d;
            Object obj = atomicReferenceArray.get(i12);
            boolean z6 = this.f8794b;
            if (obj == null) {
                if (z6) {
                    return null;
                }
            } else {
                if (obj instanceof C2933k) {
                    return null;
                }
                long j11 = (i10 + 1) & 1073741823;
                if (atomicLongFieldUpdater.compareAndSet(this, j10, (j10 & (-1073741824)) | j11)) {
                    atomicReferenceArray.set(i12, null);
                    return obj;
                }
                if (z6) {
                    C2934l c2934lM3759c = this;
                    while (true) {
                        AtomicLongFieldUpdater atomicLongFieldUpdater2 = f8791f;
                        long j12 = atomicLongFieldUpdater2.get(c2934lM3759c);
                        int i13 = (int) (j12 & 1073741823);
                        if ((j12 & 1152921504606846976L) != 0) {
                            c2934lM3759c = c2934lM3759c.m3759c();
                        } else {
                            if (atomicLongFieldUpdater2.compareAndSet(c2934lM3759c, j12, (j12 & (-1073741824)) | j11)) {
                                c2934lM3759c.f8796d.set(c2934lM3759c.f8795c & i13, null);
                                c2934lM3759c = null;
                            } else {
                                continue;
                            }
                        }
                        if (c2934lM3759c == null) {
                            return obj;
                        }
                    }
                }
            }
        }
    }
}
