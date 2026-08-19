package p275Kn;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import mm.C17296C;
import p025An.AbstractC0575H;
import p025An.C0622l;
import p025An.C0624m;
import p025An.InterfaceC0586M0;
import p025An.InterfaceC0620k;
import p153Fn.AbstractC2923a;
import p153Fn.AbstractC2940r;
import p153Fn.C2942t;
import p226In.C3785g;
import p226In.InterfaceC3786h;
import p523V9.AbstractC8154o0;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: Kn.h */
/* JADX INFO: loaded from: classes2.dex */
public class C4821h {

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f15701c = AtomicReferenceFieldUpdater.newUpdater(C4821h.class, Object.class, "head$volatile");

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ AtomicLongFieldUpdater f15702d = AtomicLongFieldUpdater.newUpdater(C4821h.class, "deqIdx$volatile");

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f15703e = AtomicReferenceFieldUpdater.newUpdater(C4821h.class, Object.class, "tail$volatile");

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ AtomicLongFieldUpdater f15704f = AtomicLongFieldUpdater.newUpdater(C4821h.class, "enqIdx$volatile");

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f15705g = AtomicIntegerFieldUpdater.newUpdater(C4821h.class, "_availablePermits$volatile");
    private volatile /* synthetic */ int _availablePermits$volatile;

    /* JADX INFO: renamed from: a */
    public final int f15706a;

    /* JADX INFO: renamed from: b */
    public final C0622l f15707b;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    public C4821h(int i10, int i11) {
        this.f15706a = i10;
        if (i10 <= 0) {
            throw new IllegalArgumentException(AbstractC10763a.m11048f(i10, "Semaphore should have at least 1 permit, but had ").toString());
        }
        if (i11 < 0 || i11 > i10) {
            throw new IllegalArgumentException(AbstractC10763a.m11048f(i10, "The number of acquired permits should be in 0..").toString());
        }
        C4824k c4824k = new C4824k(0L, null, 2);
        this.head$volatile = c4824k;
        this.tail$volatile = c4824k;
        this._availablePermits$volatile = i10 - i11;
        this.f15707b = new C0622l(this, 2);
    }

    /* JADX INFO: renamed from: a */
    public final Object m5452a(AbstractC19687c abstractC19687c) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int andDecrement;
        int i10;
        do {
            atomicIntegerFieldUpdater = f15705g;
            andDecrement = atomicIntegerFieldUpdater.getAndDecrement(this);
            i10 = this.f15706a;
        } while (andDecrement > i10);
        C17296C c17296c = C17296C.f55119a;
        if (andDecrement > 0) {
            return c17296c;
        }
        C0624m c0624mM1193v = AbstractC0575H.m1193v(AbstractC8154o0.m8714e(abstractC19687c));
        try {
            if (!m5453b(c0624mM1193v)) {
                while (true) {
                    int andDecrement2 = atomicIntegerFieldUpdater.getAndDecrement(this);
                    if (andDecrement2 <= i10) {
                        if (andDecrement2 > 0) {
                            c0624mM1193v.mo1246n(c17296c, this.f15707b);
                            break;
                        }
                        if (m5453b(c0624mM1193v)) {
                            break;
                        }
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

    /* JADX INFO: renamed from: b */
    public final boolean m5453b(InterfaceC0586M0 interfaceC0586M0) {
        Object objM3730d;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15703e;
        C4824k c4824k = (C4824k) atomicReferenceFieldUpdater.get(this);
        long andIncrement = f15704f.getAndIncrement(this);
        C4819f c4819f = C4819f.f15699Y;
        long j10 = andIncrement / ((long) AbstractC4823j.f15713f);
        loop0: while (true) {
            objM3730d = AbstractC2923a.m3730d(c4824k, j10, c4819f);
            if (!AbstractC2923a.m3733g(objM3730d)) {
                AbstractC2940r abstractC2940rM3731e = AbstractC2923a.m3731e(objM3730d);
                while (true) {
                    AbstractC2940r abstractC2940r = (AbstractC2940r) atomicReferenceFieldUpdater.get(this);
                    if (abstractC2940r.f8804o0 >= abstractC2940rM3731e.f8804o0) {
                        break loop0;
                    }
                    if (!abstractC2940rM3731e.m3766j()) {
                        break;
                    }
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, abstractC2940r, abstractC2940rM3731e)) {
                            if (!abstractC2940r.m3764f()) {
                                break loop0;
                            }
                            abstractC2940r.m3746e();
                            break loop0;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == abstractC2940r);
                    if (abstractC2940rM3731e.m3764f()) {
                        abstractC2940rM3731e.m3746e();
                    }
                }
            } else {
                break;
            }
        }
        C4824k c4824k2 = (C4824k) AbstractC2923a.m3731e(objM3730d);
        int i10 = (int) (andIncrement % ((long) AbstractC4823j.f15713f));
        AtomicReferenceArray atomicReferenceArray = c4824k2.f15714q0;
        while (!atomicReferenceArray.compareAndSet(i10, null, interfaceC0586M0)) {
            if (atomicReferenceArray.get(i10) != null) {
                C2942t c2942t = AbstractC4823j.f15709b;
                C2942t c2942t2 = AbstractC4823j.f15710c;
                while (!atomicReferenceArray.compareAndSet(i10, c2942t, c2942t2)) {
                    if (atomicReferenceArray.get(i10) != c2942t) {
                        return false;
                    }
                }
                boolean z6 = interfaceC0586M0 instanceof InterfaceC0620k;
                C17296C c17296c = C17296C.f55119a;
                if (z6) {
                    ((InterfaceC0620k) interfaceC0586M0).mo1246n(c17296c, this.f15707b);
                } else {
                    if (!(interfaceC0586M0 instanceof InterfaceC3786h)) {
                        throw new IllegalStateException(("unexpected: " + interfaceC0586M0).toString());
                    }
                    ((C3785g) ((InterfaceC3786h) interfaceC0586M0)).f11441q0 = c17296c;
                }
                return true;
            }
        }
        interfaceC0586M0.mo1212a(c4824k2, i10);
        return true;
    }

    /* JADX INFO: renamed from: c */
    public final void m5454c() {
        int i10;
        Object objM3730d;
        boolean z6;
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f15705g;
            int andIncrement = atomicIntegerFieldUpdater.getAndIncrement(this);
            int i11 = this.f15706a;
            if (andIncrement >= i11) {
                do {
                    i10 = atomicIntegerFieldUpdater.get(this);
                    if (i10 <= i11) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, i11));
                throw new IllegalStateException(("The number of released permits cannot be greater than " + i11).toString());
            }
            if (andIncrement >= 0) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15701c;
            C4824k c4824k = (C4824k) atomicReferenceFieldUpdater.get(this);
            long andIncrement2 = f15702d.getAndIncrement(this);
            long j10 = andIncrement2 / ((long) AbstractC4823j.f15713f);
            C4820g c4820g = C4820g.f15700Y;
            while (true) {
                objM3730d = AbstractC2923a.m3730d(c4824k, j10, c4820g);
                if (!AbstractC2923a.m3733g(objM3730d)) {
                    AbstractC2940r abstractC2940rM3731e = AbstractC2923a.m3731e(objM3730d);
                    while (true) {
                        AbstractC2940r abstractC2940r = (AbstractC2940r) atomicReferenceFieldUpdater.get(this);
                        if (abstractC2940r.f8804o0 >= abstractC2940rM3731e.f8804o0) {
                            break;
                        }
                        if (!abstractC2940rM3731e.m3766j()) {
                            break;
                        }
                        do {
                            if (atomicReferenceFieldUpdater.compareAndSet(this, abstractC2940r, abstractC2940rM3731e)) {
                                if (!abstractC2940r.m3764f()) {
                                    break;
                                }
                                abstractC2940r.m3746e();
                                break;
                            }
                        } while (atomicReferenceFieldUpdater.get(this) == abstractC2940r);
                        if (abstractC2940rM3731e.m3764f()) {
                            abstractC2940rM3731e.m3746e();
                        }
                    }
                } else {
                    break;
                }
            }
            C4824k c4824k2 = (C4824k) AbstractC2923a.m3731e(objM3730d);
            c4824k2.m3743a();
            z6 = false;
            if (c4824k2.f8804o0 <= j10) {
                int i12 = (int) (andIncrement2 % ((long) AbstractC4823j.f15713f));
                C2942t c2942t = AbstractC4823j.f15709b;
                AtomicReferenceArray atomicReferenceArray = c4824k2.f15714q0;
                Object andSet = atomicReferenceArray.getAndSet(i12, c2942t);
                if (andSet == null) {
                    int i13 = AbstractC4823j.f15708a;
                    int i14 = 0;
                    while (true) {
                        if (i14 >= i13) {
                            C2942t c2942t2 = AbstractC4823j.f15709b;
                            C2942t c2942t3 = AbstractC4823j.f15711d;
                            do {
                                if (atomicReferenceArray.compareAndSet(i12, c2942t2, c2942t3)) {
                                    z6 = true;
                                    break;
                                }
                            } while (atomicReferenceArray.get(i12) == c2942t2);
                            z6 = !z6;
                            break;
                        }
                        if (atomicReferenceArray.get(i12) == AbstractC4823j.f15710c) {
                            z6 = true;
                            break;
                        }
                        i14++;
                    }
                } else if (andSet != AbstractC4823j.f15712e) {
                    boolean z10 = andSet instanceof InterfaceC0620k;
                    C17296C c17296c = C17296C.f55119a;
                    if (z10) {
                        InterfaceC0620k interfaceC0620k = (InterfaceC0620k) andSet;
                        C2942t c2942tMo1245h = interfaceC0620k.mo1245h(c17296c, this.f15707b);
                        if (c2942tMo1245h != null) {
                            interfaceC0620k.mo1247t(c2942tMo1245h);
                            z6 = true;
                            break;
                            break;
                        }
                    } else {
                        if (!(andSet instanceof InterfaceC3786h)) {
                            throw new IllegalStateException(("unexpected: " + andSet).toString());
                        }
                        if (((C3785g) ((InterfaceC3786h) andSet)).m4459h(this, c17296c) == 0) {
                            z6 = true;
                            break;
                            break;
                        }
                    }
                }
            }
        } while (!z6);
    }
}
