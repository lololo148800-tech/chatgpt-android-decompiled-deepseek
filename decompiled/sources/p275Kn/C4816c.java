package p275Kn;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import mm.C17296C;
import p025An.AbstractC0575H;
import p025An.C0624m;
import p153Fn.C2942t;
import p523V9.AbstractC8154o0;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;

/* JADX INFO: renamed from: Kn.c */
/* JADX INFO: loaded from: classes2.dex */
public final class C4816c extends C4821h implements InterfaceC4814a {

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f15697h = AtomicReferenceFieldUpdater.newUpdater(C4816c.class, Object.class, "owner$volatile");
    private volatile /* synthetic */ Object owner$volatile;

    public C4816c(boolean z6) {
        super(1, z6 ? 1 : 0);
        this.owner$volatile = z6 ? null : AbstractC4817d.f15698a;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m5447d() {
        return Math.max(C4821h.f15705g.get(this), 0) == 0;
    }

    /* JADX INFO: renamed from: e */
    public final Object m5448e(Object obj, InterfaceC18770c interfaceC18770c) {
        boolean zM5449f = m5449f(obj);
        C17296C c17296c = C17296C.f55119a;
        if (zM5449f) {
            return c17296c;
        }
        C0624m c0624mM1193v = AbstractC0575H.m1193v(AbstractC8154o0.m8714e(interfaceC18770c));
        try {
            C4815b c4815b = new C4815b(this, c0624mM1193v, obj);
            while (true) {
                int andDecrement = C4821h.f15705g.getAndDecrement(this);
                if (andDecrement <= this.f15706a) {
                    if (andDecrement > 0) {
                        c4815b.mo1246n(c17296c, this.f15707b);
                        break;
                    }
                    if (m5453b(c4815b)) {
                        break;
                    }
                }
            }
            Object objM1261q = c0624mM1193v.m1261q();
            EnumC19250a enumC19250a = EnumC19250a.f61036Y;
            if (objM1261q != enumC19250a) {
                objM1261q = c17296c;
            }
            return objM1261q == enumC19250a ? objM1261q : c17296c;
        } catch (Throwable th2) {
            c0624mM1193v.m1250A();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: f */
    public final boolean m5449f(Object obj) {
        int i10;
        char c9;
        char c10;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C4821h.f15705g;
            int i11 = atomicIntegerFieldUpdater.get(this);
            int i12 = this.f15706a;
            if (i11 > i12) {
                do {
                    i10 = atomicIntegerFieldUpdater.get(this);
                    if (i10 <= i12) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, i12));
            } else {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15697h;
                if (i11 <= 0) {
                    if (obj != null) {
                        while (true) {
                            if (!m5447d()) {
                                c10 = 0;
                                break;
                            }
                            Object obj2 = atomicReferenceFieldUpdater.get(this);
                            if (obj2 != AbstractC4817d.f15698a) {
                                if (obj2 != obj) {
                                    c10 = 2;
                                    break;
                                }
                                c10 = 1;
                                break;
                            }
                        }
                        if (c10 == 1) {
                            c9 = 2;
                            break;
                        }
                        if (c10 != 2) {
                        }
                    }
                    c9 = 1;
                    break;
                }
                if (atomicIntegerFieldUpdater.compareAndSet(this, i11, i11 - 1)) {
                    atomicReferenceFieldUpdater.set(this, obj);
                    c9 = 0;
                    break;
                }
            }
        }
        if (c9 == 0) {
            return true;
        }
        if (c9 == 1) {
            return false;
        }
        if (c9 != 2) {
            throw new IllegalStateException("unexpected");
        }
        throw new IllegalStateException(("This mutex is already locked by the specified owner: " + obj).toString());
    }

    /* JADX INFO: renamed from: g */
    public final void m5450g(Object obj) {
        while (m5447d()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15697h;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            C2942t c2942t = AbstractC4817d.f15698a;
            if (obj2 != c2942t) {
                if (obj2 != obj && obj != null) {
                    throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
                }
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, c2942t)) {
                        m5454c();
                        return;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == obj2);
            }
        }
        throw new IllegalStateException("This mutex is not locked");
    }

    public final String toString() {
        return "Mutex@" + AbstractC0575H.m1191t(this) + "[isLocked=" + m5447d() + ",owner=" + f15697h.get(this) + ']';
    }
}
