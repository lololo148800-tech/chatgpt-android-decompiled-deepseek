package p077Cn;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.AbstractC16529F;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p001A.AbstractC0010F;
import p003A1.C0289t;
import p025An.AbstractC0575H;
import p025An.C0622l;
import p025An.C0624m;
import p025An.C0644w;
import p025An.InterfaceC0586M0;
import p025An.InterfaceC0620k;
import p049Bm.InterfaceC1436k;
import p1113xn.AbstractC21322p;
import p117Eb.C2391u;
import p129En.C2610u;
import p153Fn.AbstractC2923a;
import p153Fn.AbstractC2924b;
import p153Fn.AbstractC2940r;
import p153Fn.AbstractC2941s;
import p153Fn.C2942t;
import p226In.C3785g;
import p226In.EnumC3789k;
import p226In.InterfaceC3786h;
import p437Rn.InterfaceC6948f;
import p523V9.AbstractC8154o0;
import p571X9.AbstractC9221V;
import p571X9.AbstractC9233X;
import p909nm.AbstractC17681o;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sj.hJY.CsqksqyPE;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: Cn.k */
/* JADX INFO: loaded from: classes2.dex */
public class C1743k implements InterfaceC1747o {

    /* JADX INFO: renamed from: p0 */
    public static final /* synthetic */ AtomicLongFieldUpdater f4984p0 = AtomicLongFieldUpdater.newUpdater(C1743k.class, "sendersAndCloseStatus$volatile");

    /* JADX INFO: renamed from: q0 */
    public static final /* synthetic */ AtomicLongFieldUpdater f4985q0 = AtomicLongFieldUpdater.newUpdater(C1743k.class, "receivers$volatile");

    /* JADX INFO: renamed from: r0 */
    public static final /* synthetic */ AtomicLongFieldUpdater f4986r0 = AtomicLongFieldUpdater.newUpdater(C1743k.class, "bufferEnd$volatile");

    /* JADX INFO: renamed from: s0 */
    public static final /* synthetic */ AtomicLongFieldUpdater f4987s0 = AtomicLongFieldUpdater.newUpdater(C1743k.class, "completedExpandBuffersAndPauseFlag$volatile");

    /* JADX INFO: renamed from: t0 */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f4988t0 = AtomicReferenceFieldUpdater.newUpdater(C1743k.class, Object.class, "sendSegment$volatile");

    /* JADX INFO: renamed from: u0 */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f4989u0 = AtomicReferenceFieldUpdater.newUpdater(C1743k.class, Object.class, "receiveSegment$volatile");

    /* JADX INFO: renamed from: v0 */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f4990v0 = AtomicReferenceFieldUpdater.newUpdater(C1743k.class, Object.class, "bufferEndSegment$volatile");

    /* JADX INFO: renamed from: w0 */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f4991w0 = AtomicReferenceFieldUpdater.newUpdater(C1743k.class, Object.class, "_closeCause$volatile");

    /* JADX INFO: renamed from: x0 */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f4992x0 = AtomicReferenceFieldUpdater.newUpdater(C1743k.class, Object.class, "closeHandler$volatile");

    /* JADX INFO: renamed from: Y */
    public final int f4993Y;

    /* JADX INFO: renamed from: Z */
    public final InterfaceC1436k f4994Z;
    private volatile /* synthetic */ Object _closeCause$volatile;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;

    /* JADX INFO: renamed from: o0 */
    public final C0622l f4995o0;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;

    public C1743k(int i10, InterfaceC1436k interfaceC1436k) {
        this.f4993Y = i10;
        this.f4994Z = interfaceC1436k;
        if (i10 < 0) {
            throw new IllegalArgumentException(AbstractC0010F.m19c(i10, "Invalid channel capacity: ", ", should be >=0").toString());
        }
        C1751s c1751s = AbstractC1745m.f4997a;
        this.bufferEnd$volatile = i10 != 0 ? i10 != Integer.MAX_VALUE ? i10 : Long.MAX_VALUE : 0L;
        this.completedExpandBuffersAndPauseFlag$volatile = f4986r0.get(this);
        C1751s c1751s2 = new C1751s(0L, null, this, 3);
        this.sendSegment$volatile = c1751s2;
        this.receiveSegment$volatile = c1751s2;
        if (m2537F()) {
            c1751s2 = AbstractC1745m.f4997a;
            AbstractC16544l.m18092e(c1751s2, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
        }
        this.bufferEndSegment$volatile = c1751s2;
        this.f4995o0 = interfaceC1436k != null ? new C0622l(this, 1) : null;
        this._closeCause$volatile = AbstractC1745m.f5015s;
    }

    /* JADX INFO: renamed from: B */
    public static void m2527B(C1743k c1743k) {
        c1743k.getClass();
        AtomicLongFieldUpdater atomicLongFieldUpdater = f4987s0;
        if ((atomicLongFieldUpdater.addAndGet(c1743k, 1L) & 4611686018427387904L) != 0) {
            while ((atomicLongFieldUpdater.get(c1743k) & 4611686018427387904L) != 0) {
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: I */
    public static Object m2528I(C1743k c1743k, AbstractC19687c abstractC19687c) {
        C1741i c1741i;
        Object objM2540J;
        if (abstractC19687c instanceof C1741i) {
            c1741i = (C1741i) abstractC19687c;
            int i10 = c1741i.f4980o0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c1741i.f4980o0 = i10 - Integer.MIN_VALUE;
            } else {
                c1741i = new C1741i(c1743k, abstractC19687c);
            }
        } else {
            c1741i = new C1741i(c1743k, abstractC19687c);
        }
        C1741i c1741i2 = c1741i;
        Object obj = c1741i2.f4978Y;
        Object obj2 = EnumC19250a.f61036Y;
        int i11 = c1741i2.f4980o0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(obj);
            C1751s c1751s = (C1751s) f4989u0.get(c1743k);
            while (!c1743k.mo2515d()) {
                long andIncrement = f4985q0.getAndIncrement(c1743k);
                long j10 = AbstractC1745m.f4998b;
                long j11 = andIncrement / j10;
                int i12 = (int) (andIncrement % j10);
                if (c1751s.f8804o0 != j11) {
                    C1751s c1751sM2554w = c1743k.m2554w(j11, c1751s);
                    if (c1751sM2554w == null) {
                        continue;
                    } else {
                        c1751s = c1751sM2554w;
                    }
                }
                Object objM2544N = c1743k.m2544N(c1751s, i12, andIncrement, null);
                if (objM2544N == AbstractC1745m.f5009m) {
                    throw new IllegalStateException("unexpected");
                }
                if (objM2544N == AbstractC1745m.f5011o) {
                    if (andIncrement < c1743k.m2533A()) {
                        c1751s.m3743a();
                    }
                } else {
                    if (objM2544N != AbstractC1745m.f5010n) {
                        c1751s.m3743a();
                        return objM2544N;
                    }
                    c1741i2.f4980o0 = 1;
                    objM2540J = c1743k.m2540J(c1751s, i12, andIncrement, c1741i2);
                    if (objM2540J == obj2) {
                        return obj2;
                    }
                }
            }
            return new C1748p(c1743k.m2555x());
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9233X.m9807c(obj);
        objM2540J = ((C1750r) obj).f5021a;
        return objM2540J;
    }

    /* JADX INFO: renamed from: a */
    public static final C1751s m2529a(C1743k c1743k, long j10, C1751s c1751s) {
        Object objM3730d;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j11;
        long j12;
        c1743k.getClass();
        C1751s c1751s2 = AbstractC1745m.f4997a;
        C1744l c1744l = C1744l.f4996Y;
        loop0: while (true) {
            objM3730d = AbstractC2923a.m3730d(c1751s, j10, c1744l);
            if (!AbstractC2923a.m3733g(objM3730d)) {
                AbstractC2940r abstractC2940rM3731e = AbstractC2923a.m3731e(objM3730d);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4988t0;
                    AbstractC2940r abstractC2940r = (AbstractC2940r) atomicReferenceFieldUpdater.get(c1743k);
                    if (abstractC2940r.f8804o0 >= abstractC2940rM3731e.f8804o0) {
                        break loop0;
                    }
                    if (!abstractC2940rM3731e.m3766j()) {
                        break;
                    }
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(c1743k, abstractC2940r, abstractC2940rM3731e)) {
                            if (!abstractC2940r.m3764f()) {
                                break loop0;
                            }
                            abstractC2940r.m3746e();
                            break loop0;
                        }
                    } while (atomicReferenceFieldUpdater.get(c1743k) == abstractC2940r);
                    if (abstractC2940rM3731e.m3764f()) {
                        abstractC2940rM3731e.m3746e();
                    }
                }
            } else {
                break;
            }
        }
        boolean zM3733g = AbstractC2923a.m3733g(objM3730d);
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = f4985q0;
        if (zM3733g) {
            c1743k.m2535D();
            if (c1751s.f8804o0 * ((long) AbstractC1745m.f4998b) >= atomicLongFieldUpdater2.get(c1743k)) {
                return null;
            }
            c1751s.m3743a();
            return null;
        }
        C1751s c1751s3 = (C1751s) AbstractC2923a.m3731e(objM3730d);
        long j13 = c1751s3.f8804o0;
        if (j13 <= j10) {
            return c1751s3;
        }
        long j14 = ((long) AbstractC1745m.f4998b) * j13;
        do {
            atomicLongFieldUpdater = f4984p0;
            j11 = atomicLongFieldUpdater.get(c1743k);
            j12 = 1152921504606846975L & j11;
            if (j12 >= j14) {
                break;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(c1743k, j11, j12 + (((long) ((int) (j11 >> 60))) << 60)));
        if (j13 * ((long) AbstractC1745m.f4998b) >= atomicLongFieldUpdater2.get(c1743k)) {
            return null;
        }
        c1751s3.m3743a();
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static final void m2530b(C1743k c1743k, Object obj, C0624m c0624m) {
        InterfaceC1436k interfaceC1436k = c1743k.f4994Z;
        if (interfaceC1436k != null) {
            AbstractC2923a.m3727a(interfaceC1436k, obj, c0624m.f1874q0);
        }
        c0624m.resumeWith(AbstractC9233X.m9806b(c1743k.m2557z()));
    }

    /* JADX INFO: renamed from: h */
    public static final void m2531h(C1743k c1743k, InterfaceC3786h interfaceC3786h) {
        c1743k.getClass();
        C1751s c1751s = (C1751s) f4989u0.get(c1743k);
        while (!c1743k.mo2515d()) {
            long andIncrement = f4985q0.getAndIncrement(c1743k);
            long j10 = AbstractC1745m.f4998b;
            long j11 = andIncrement / j10;
            int i10 = (int) (andIncrement % j10);
            if (c1751s.f8804o0 != j11) {
                C1751s c1751sM2554w = c1743k.m2554w(j11, c1751s);
                if (c1751sM2554w == null) {
                    continue;
                } else {
                    c1751s = c1751sM2554w;
                }
            }
            Object objM2544N = c1743k.m2544N(c1751s, i10, andIncrement, interfaceC3786h);
            if (objM2544N == AbstractC1745m.f5009m) {
                InterfaceC0586M0 interfaceC0586M0 = interfaceC3786h instanceof InterfaceC0586M0 ? (InterfaceC0586M0) interfaceC3786h : null;
                if (interfaceC0586M0 != null) {
                    interfaceC0586M0.mo1212a(c1751s, i10);
                    return;
                }
                return;
            }
            if (objM2544N != AbstractC1745m.f5011o) {
                if (objM2544N == AbstractC1745m.f5010n) {
                    throw new IllegalStateException("unexpected");
                }
                c1751s.m3743a();
                ((C3785g) interfaceC3786h).f11441q0 = objM2544N;
                return;
            }
            if (andIncrement < c1743k.m2533A()) {
                c1751s.m3743a();
            }
        }
        ((C3785g) interfaceC3786h).f11441q0 = AbstractC1745m.f5008l;
    }

    /* JADX INFO: renamed from: k */
    public static final int m2532k(C1743k c1743k, C1751s c1751s, int i10, Object obj, long j10, Object obj2, boolean z6) {
        c1743k.getClass();
        c1751s.m2566n(i10, obj);
        if (z6) {
            return c1743k.m2545O(c1751s, i10, obj, j10, obj2, z6);
        }
        Object objM2564l = c1751s.m2564l(i10);
        if (objM2564l == null) {
            if (c1743k.m2549r(j10)) {
                if (c1751s.m2563k(null, i10, AbstractC1745m.f5000d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (c1751s.m2563k(null, i10, obj2)) {
                    return 2;
                }
            }
        } else if (objM2564l instanceof InterfaceC0586M0) {
            c1751s.m2566n(i10, null);
            if (c1743k.m2542L(objM2564l, obj)) {
                c1751s.m2567o(i10, AbstractC1745m.f5005i);
                return 0;
            }
            C2942t c2942t = AbstractC1745m.f5007k;
            if (c1751s.f5023r0.getAndSet((i10 * 2) + 1, c2942t) != c2942t) {
                c1751s.m2565m(i10, true);
            }
            return 5;
        }
        return c1743k.m2545O(c1751s, i10, obj, j10, obj2, z6);
    }

    /* JADX INFO: renamed from: A */
    public final long m2533A() {
        return f4984p0.get(this) & 1152921504606846975L;
    }

    /* JADX INFO: renamed from: C */
    public final boolean m2534C(long j10, boolean z6) {
        int i10 = (int) (j10 >> 60);
        if (i10 == 0 || i10 == 1) {
            return false;
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = f4985q0;
        if (i10 == 2) {
            m2551t(j10 & 1152921504606846975L);
            if (z6) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4989u0;
                    C1751s c1751sM2554w = (C1751s) atomicReferenceFieldUpdater.get(this);
                    long j11 = atomicLongFieldUpdater.get(this);
                    if (m2533A() <= j11) {
                        break;
                    }
                    long j12 = AbstractC1745m.f4998b;
                    long j13 = j11 / j12;
                    if (c1751sM2554w.f8804o0 != j13 && (c1751sM2554w = m2554w(j13, c1751sM2554w)) == null) {
                        if (((C1751s) atomicReferenceFieldUpdater.get(this)).f8804o0 < j13) {
                            break;
                        }
                    } else {
                        c1751sM2554w.m3743a();
                        int i11 = (int) (j11 % j12);
                        while (true) {
                            Object objM2564l = c1751sM2554w.m2564l(i11);
                            if (objM2564l != null && objM2564l != AbstractC1745m.f5001e) {
                                if (objM2564l != AbstractC1745m.f5000d) {
                                    if (objM2564l != AbstractC1745m.f5006j && objM2564l != AbstractC1745m.f5008l && objM2564l != AbstractC1745m.f5005i && objM2564l != AbstractC1745m.f5004h) {
                                        if (objM2564l != AbstractC1745m.f5003g) {
                                            if (objM2564l == AbstractC1745m.f5002f || j11 != atomicLongFieldUpdater.get(this)) {
                                                break;
                                                break;
                                            }
                                            return false;
                                        }
                                        return false;
                                    }
                                    break;
                                    break;
                                    break;
                                    break;
                                }
                                return false;
                            }
                            if (c1751sM2554w.m2563k(objM2564l, i11, AbstractC1745m.f5004h)) {
                                m2553v();
                                break;
                            }
                        }
                        f4985q0.compareAndSet(this, j11, j11 + 1);
                    }
                }
            }
        } else {
            if (i10 != 3) {
                throw new IllegalStateException(AbstractC10763a.m11048f(i10, "unexpected close status: ").toString());
            }
            C1751s c1751sM2551t = m2551t(j10 & 1152921504606846975L);
            C0644w c0644wM3728b = null;
            Object objM3734h = null;
            loop0: do {
                for (int i12 = AbstractC1745m.f4998b - 1; -1 < i12; i12--) {
                    long j14 = (c1751sM2551t.f8804o0 * ((long) AbstractC1745m.f4998b)) + ((long) i12);
                    while (true) {
                        Object objM2564l2 = c1751sM2551t.m2564l(i12);
                        if (objM2564l2 == AbstractC1745m.f5005i) {
                            break loop0;
                        }
                        C2942t c2942t = AbstractC1745m.f5000d;
                        AtomicReferenceArray atomicReferenceArray = c1751sM2551t.f5023r0;
                        InterfaceC1436k interfaceC1436k = this.f4994Z;
                        if (objM2564l2 != c2942t) {
                            if (objM2564l2 != AbstractC1745m.f5001e && objM2564l2 != null) {
                                if (!(objM2564l2 instanceof InterfaceC0586M0) && !(objM2564l2 instanceof C1732D)) {
                                    C2942t c2942t2 = AbstractC1745m.f5003g;
                                    if (objM2564l2 == c2942t2 || objM2564l2 == AbstractC1745m.f5002f) {
                                        break loop0;
                                    }
                                    if (objM2564l2 != c2942t2) {
                                        break;
                                    }
                                } else {
                                    if (j14 < atomicLongFieldUpdater.get(this)) {
                                        break loop0;
                                    }
                                    InterfaceC0586M0 interfaceC0586M0 = objM2564l2 instanceof C1732D ? ((C1732D) objM2564l2).f4960a : (InterfaceC0586M0) objM2564l2;
                                    if (c1751sM2551t.m2563k(objM2564l2, i12, AbstractC1745m.f5008l)) {
                                        if (interfaceC1436k != null) {
                                            c0644wM3728b = AbstractC2923a.m3728b(interfaceC1436k, atomicReferenceArray.get(i12 * 2), c0644wM3728b);
                                        }
                                        objM3734h = AbstractC2923a.m3734h(objM3734h, interfaceC0586M0);
                                        c1751sM2551t.m2566n(i12, null);
                                        c1751sM2551t.m3765i();
                                        break;
                                    }
                                }
                            } else if (c1751sM2551t.m2563k(objM2564l2, i12, AbstractC1745m.f5008l)) {
                                c1751sM2551t.m3765i();
                                break;
                            }
                        } else {
                            if (j14 < atomicLongFieldUpdater.get(this)) {
                                break loop0;
                            }
                            if (c1751sM2551t.m2563k(objM2564l2, i12, AbstractC1745m.f5008l)) {
                                if (interfaceC1436k != null) {
                                    c0644wM3728b = AbstractC2923a.m3728b(interfaceC1436k, atomicReferenceArray.get(i12 * 2), c0644wM3728b);
                                }
                                c1751sM2551t.m2566n(i12, null);
                                c1751sM2551t.m3765i();
                                break;
                            }
                        }
                    }
                }
                c1751sM2551t = (C1751s) ((AbstractC2924b) AbstractC2924b.f8768Z.get(c1751sM2551t));
            } while (c1751sM2551t != null);
            if (objM3734h != null) {
                if (objM3734h instanceof ArrayList) {
                    ArrayList arrayList = (ArrayList) objM3734h;
                    for (int size = arrayList.size() - 1; -1 < size; size--) {
                        m2541K((InterfaceC0586M0) arrayList.get(size), false);
                    }
                } else {
                    m2541K((InterfaceC0586M0) objM3734h, false);
                }
            }
            if (c0644wM3728b != null) {
                throw c0644wM3728b;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: D */
    public final boolean m2535D() {
        return m2534C(f4984p0.get(this), false);
    }

    /* JADX INFO: renamed from: E */
    public boolean mo2536E() {
        return false;
    }

    /* JADX INFO: renamed from: F */
    public final boolean m2537F() {
        long j10 = f4986r0.get(this);
        return j10 == 0 || j10 == Long.MAX_VALUE;
    }

    /* JADX INFO: renamed from: G */
    public final void m2538G(long j10, C1751s c1751s) {
        C1751s c1751s2;
        C1751s c1751s3;
        while (c1751s.f8804o0 < j10 && (c1751s3 = (C1751s) c1751s.m3744c()) != null) {
            c1751s = c1751s3;
        }
        while (true) {
            if (!c1751s.mo3745d() || (c1751s2 = (C1751s) c1751s.m3744c()) == null) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4990v0;
                    AbstractC2940r abstractC2940r = (AbstractC2940r) atomicReferenceFieldUpdater.get(this);
                    if (abstractC2940r.f8804o0 >= c1751s.f8804o0) {
                        return;
                    }
                    if (!c1751s.m3766j()) {
                        break;
                    }
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, abstractC2940r, c1751s)) {
                            if (abstractC2940r.m3764f()) {
                                abstractC2940r.m3746e();
                                return;
                            }
                            return;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == abstractC2940r);
                    if (c1751s.m3764f()) {
                        c1751s.m3746e();
                    }
                }
            } else {
                c1751s = c1751s2;
            }
        }
    }

    /* JADX INFO: renamed from: H */
    public final Object m2539H(Object obj, InterfaceC18770c interfaceC18770c) {
        C0644w c0644wM3728b;
        C0624m c0624m = new C0624m(1, AbstractC8154o0.m8714e(interfaceC18770c));
        c0624m.m1262r();
        InterfaceC1436k interfaceC1436k = this.f4994Z;
        if (interfaceC1436k == null || (c0644wM3728b = AbstractC2923a.m3728b(interfaceC1436k, obj, null)) == null) {
            c0624m.resumeWith(AbstractC9233X.m9806b(m2557z()));
        } else {
            AbstractC9221V.m9789a(c0644wM3728b, m2557z());
            c0624m.resumeWith(AbstractC9233X.m9806b(c0644wM3728b));
        }
        Object objM1261q = c0624m.m1261q();
        return objM1261q == EnumC19250a.f61036Y ? objM1261q : C17296C.f55119a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: J */
    public final Object m2540J(C1751s c1751s, int i10, long j10, AbstractC19687c abstractC19687c) {
        C1742j c1742j;
        C1750r c1750r;
        if (abstractC19687c instanceof C1742j) {
            c1742j = (C1742j) abstractC19687c;
            int i11 = c1742j.f4983o0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c1742j.f4983o0 = i11 - Integer.MIN_VALUE;
            } else {
                c1742j = new C1742j(this, abstractC19687c);
            }
        } else {
            c1742j = new C1742j(this, abstractC19687c);
        }
        Object objM1261q = c1742j.f4981Y;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i12 = c1742j.f4983o0;
        if (i12 == 0) {
            AbstractC9233X.m9807c(objM1261q);
            c1742j.f4983o0 = 1;
            C0624m c0624mM1193v = AbstractC0575H.m1193v(AbstractC8154o0.m8714e(c1742j));
            try {
                C1729A c1729a = new C1729A(c0624mM1193v);
                Object objM2544N = m2544N(c1751s, i10, j10, c1729a);
                if (objM2544N != AbstractC1745m.f5009m) {
                    Object obj = AbstractC1745m.f5011o;
                    C0289t c0289tM2548n = null;
                    InterfaceC1436k interfaceC1436k = this.f4994Z;
                    if (objM2544N == obj) {
                        if (j10 < m2533A()) {
                            c1751s.m3743a();
                        }
                        C1751s c1751s2 = (C1751s) f4989u0.get(this);
                        while (true) {
                            if (mo2515d()) {
                                c0624mM1193v.resumeWith(new C1750r(new C1748p(m2555x())));
                                break;
                            }
                            long andIncrement = f4985q0.getAndIncrement(this);
                            long j11 = AbstractC1745m.f4998b;
                            long j12 = andIncrement / j11;
                            int i13 = (int) (andIncrement % j11);
                            if (c1751s2.f8804o0 != j12) {
                                C1751s c1751sM2554w = m2554w(j12, c1751s2);
                                if (c1751sM2554w != null) {
                                    c1751s2 = c1751sM2554w;
                                }
                            }
                            Object objM2544N2 = m2544N(c1751s2, i13, andIncrement, c1729a);
                            if (objM2544N2 == AbstractC1745m.f5009m) {
                                c1729a.mo1212a(c1751s2, i13);
                                break;
                            }
                            if (objM2544N2 == AbstractC1745m.f5011o) {
                                if (andIncrement < m2533A()) {
                                    c1751s2.m3743a();
                                }
                            } else {
                                if (objM2544N2 == AbstractC1745m.f5010n) {
                                    throw new IllegalStateException("unexpected");
                                }
                                c1751s2.m3743a();
                                c1750r = new C1750r(objM2544N2);
                                if (interfaceC1436k != null) {
                                    c0289tM2548n = m2548n();
                                }
                            }
                        }
                    } else {
                        c1751s.m3743a();
                        c1750r = new C1750r(objM2544N);
                        if (interfaceC1436k != null) {
                            c0289tM2548n = m2548n();
                        }
                    }
                    c0624mM1193v.mo1246n(c1750r, c0289tM2548n);
                    break;
                }
                c1729a.mo1212a(c1751s, i10);
                objM1261q = c0624mM1193v.m1261q();
                EnumC19250a enumC19250a2 = EnumC19250a.f61036Y;
                if (objM1261q == enumC19250a) {
                    return enumC19250a;
                }
            } catch (Throwable th2) {
                c0624mM1193v.m1250A();
                throw th2;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(objM1261q);
        }
        return ((C1750r) objM1261q).f5021a;
    }

    /* JADX INFO: renamed from: K */
    public final void m2541K(InterfaceC0586M0 interfaceC0586M0, boolean z6) {
        if (interfaceC0586M0 instanceof InterfaceC0620k) {
            ((InterfaceC18770c) interfaceC0586M0).resumeWith(AbstractC9233X.m9806b(z6 ? m2556y() : m2557z()));
            return;
        }
        if (interfaceC0586M0 instanceof C1729A) {
            ((C1729A) interfaceC0586M0).f4959Y.resumeWith(new C1750r(new C1748p(m2555x())));
            return;
        }
        if (!(interfaceC0586M0 instanceof C1736d)) {
            if (interfaceC0586M0 instanceof InterfaceC3786h) {
                ((C3785g) ((InterfaceC3786h) interfaceC0586M0)).m4459h(this, AbstractC1745m.f5008l);
                return;
            } else {
                throw new IllegalStateException(("Unexpected waiter: " + interfaceC0586M0).toString());
            }
        }
        C1736d c1736d = (C1736d) interfaceC0586M0;
        C0624m c0624m = c1736d.f4972Z;
        AbstractC16544l.m18091d(c0624m);
        c1736d.f4972Z = null;
        c1736d.f4971Y = AbstractC1745m.f5008l;
        Throwable thM2555x = c1736d.f4973o0.m2555x();
        if (thM2555x == null) {
            c0624m.resumeWith(Boolean.FALSE);
        } else {
            c0624m.resumeWith(AbstractC9233X.m9806b(thM2555x));
        }
    }

    /* JADX INFO: renamed from: L */
    public final boolean m2542L(Object obj, Object obj2) {
        if (obj instanceof InterfaceC3786h) {
            return ((C3785g) ((InterfaceC3786h) obj)).m4459h(this, obj2) == 0;
        }
        boolean z6 = obj instanceof C1729A;
        InterfaceC1436k interfaceC1436k = this.f4994Z;
        if (z6) {
            AbstractC16544l.m18092e(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.ReceiveCatching<E of kotlinx.coroutines.channels.BufferedChannel>");
            return AbstractC1745m.m2558a(((C1729A) obj).f4959Y, new C1750r(obj2), interfaceC1436k != null ? m2548n() : null);
        }
        if (!(obj instanceof C1736d)) {
            if (obj instanceof InterfaceC0620k) {
                AbstractC16544l.m18092e(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
                return AbstractC1745m.m2558a((InterfaceC0620k) obj, obj2, interfaceC1436k != null ? m2547m() : null);
            }
            throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
        }
        AbstractC16544l.m18092e(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>");
        C1736d c1736d = (C1736d) obj;
        C0624m c0624m = c1736d.f4972Z;
        AbstractC16544l.m18091d(c0624m);
        c1736d.f4972Z = null;
        c1736d.f4971Y = obj2;
        Boolean bool = Boolean.TRUE;
        InterfaceC1436k interfaceC1436k2 = c1736d.f4973o0.f4994Z;
        return AbstractC1745m.m2558a(c0624m, bool, interfaceC1436k2 != null ? new C1734b(interfaceC1436k2, 0, obj2) : null);
    }

    /* JADX INFO: renamed from: M */
    public final boolean m2543M(Object obj, C1751s c1751s, int i10) {
        EnumC3789k enumC3789k;
        boolean z6 = obj instanceof InterfaceC0620k;
        C17296C c17296c = C17296C.f55119a;
        if (z6) {
            AbstractC16544l.m18092e(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            return AbstractC1745m.m2558a((InterfaceC0620k) obj, c17296c, null);
        }
        if (!(obj instanceof InterfaceC3786h)) {
            throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
        }
        AbstractC16544l.m18092e(obj, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>");
        int iM4459h = ((C3785g) obj).m4459h(this, c17296c);
        if (iM4459h == 0) {
            enumC3789k = EnumC3789k.f11448Y;
        } else if (iM4459h == 1) {
            enumC3789k = EnumC3789k.f11449Z;
        } else if (iM4459h == 2) {
            enumC3789k = EnumC3789k.f11450o0;
        } else {
            if (iM4459h != 3) {
                throw new IllegalStateException(("Unexpected internal result: " + iM4459h).toString());
            }
            enumC3789k = EnumC3789k.f11451p0;
        }
        if (enumC3789k == EnumC3789k.f11449Z) {
            c1751s.m2566n(i10, null);
        }
        return enumC3789k == EnumC3789k.f11448Y;
    }

    /* JADX INFO: renamed from: N */
    public final Object m2544N(C1751s c1751s, int i10, long j10, Object obj) {
        Object objM2564l = c1751s.m2564l(i10);
        AtomicReferenceArray atomicReferenceArray = c1751s.f5023r0;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f4984p0;
        if (objM2564l == null) {
            if (j10 >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return AbstractC1745m.f5010n;
                }
                if (c1751s.m2563k(objM2564l, i10, obj)) {
                    m2553v();
                    return AbstractC1745m.f5009m;
                }
            }
        } else if (objM2564l == AbstractC1745m.f5000d && c1751s.m2563k(objM2564l, i10, AbstractC1745m.f5005i)) {
            m2553v();
            Object obj2 = atomicReferenceArray.get(i10 * 2);
            c1751s.m2566n(i10, null);
            return obj2;
        }
        while (true) {
            Object objM2564l2 = c1751s.m2564l(i10);
            if (objM2564l2 == null || objM2564l2 == AbstractC1745m.f5001e) {
                if (j10 < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                    if (c1751s.m2563k(objM2564l2, i10, AbstractC1745m.f5004h)) {
                        m2553v();
                        return AbstractC1745m.f5011o;
                    }
                } else {
                    if (obj == null) {
                        return AbstractC1745m.f5010n;
                    }
                    if (c1751s.m2563k(objM2564l2, i10, obj)) {
                        m2553v();
                        return AbstractC1745m.f5009m;
                    }
                }
            } else if (objM2564l2 != AbstractC1745m.f5000d) {
                C2942t c2942t = AbstractC1745m.f5006j;
                if (objM2564l2 == c2942t) {
                    return AbstractC1745m.f5011o;
                }
                if (objM2564l2 == AbstractC1745m.f5004h) {
                    return AbstractC1745m.f5011o;
                }
                if (objM2564l2 == AbstractC1745m.f5008l) {
                    m2553v();
                    return AbstractC1745m.f5011o;
                }
                if (objM2564l2 != AbstractC1745m.f5003g && c1751s.m2563k(objM2564l2, i10, AbstractC1745m.f5002f)) {
                    boolean z6 = objM2564l2 instanceof C1732D;
                    if (z6) {
                        objM2564l2 = ((C1732D) objM2564l2).f4960a;
                    }
                    if (m2543M(objM2564l2, c1751s, i10)) {
                        c1751s.m2567o(i10, AbstractC1745m.f5005i);
                        m2553v();
                        Object obj3 = atomicReferenceArray.get(i10 * 2);
                        c1751s.m2566n(i10, null);
                        return obj3;
                    }
                    c1751s.m2567o(i10, c2942t);
                    c1751s.m3765i();
                    if (z6) {
                        m2553v();
                    }
                    return AbstractC1745m.f5011o;
                }
            } else if (c1751s.m2563k(objM2564l2, i10, AbstractC1745m.f5005i)) {
                m2553v();
                Object obj4 = atomicReferenceArray.get(i10 * 2);
                c1751s.m2566n(i10, null);
                return obj4;
            }
        }
    }

    /* JADX INFO: renamed from: O */
    public final int m2545O(C1751s c1751s, int i10, Object obj, long j10, Object obj2, boolean z6) {
        while (true) {
            Object objM2564l = c1751s.m2564l(i10);
            if (objM2564l == null) {
                if (!m2549r(j10) || z6) {
                    if (z6) {
                        if (c1751s.m2563k(null, i10, AbstractC1745m.f5006j)) {
                            c1751s.m3765i();
                            return 4;
                        }
                    } else {
                        if (obj2 == null) {
                            return 3;
                        }
                        if (c1751s.m2563k(null, i10, obj2)) {
                            return 2;
                        }
                    }
                } else if (c1751s.m2563k(null, i10, AbstractC1745m.f5000d)) {
                    return 1;
                }
            } else {
                if (objM2564l != AbstractC1745m.f5001e) {
                    C2942t c2942t = AbstractC1745m.f5007k;
                    if (objM2564l == c2942t) {
                        c1751s.m2566n(i10, null);
                        return 5;
                    }
                    if (objM2564l == AbstractC1745m.f5004h) {
                        c1751s.m2566n(i10, null);
                        return 5;
                    }
                    if (objM2564l == AbstractC1745m.f5008l) {
                        c1751s.m2566n(i10, null);
                        m2535D();
                        return 4;
                    }
                    c1751s.m2566n(i10, null);
                    if (objM2564l instanceof C1732D) {
                        objM2564l = ((C1732D) objM2564l).f4960a;
                    }
                    if (m2542L(objM2564l, obj)) {
                        c1751s.m2567o(i10, AbstractC1745m.f5005i);
                        return 0;
                    }
                    if (c1751s.f5023r0.getAndSet((i10 * 2) + 1, c2942t) == c2942t) {
                        return 5;
                    }
                    c1751s.m2565m(i10, true);
                    return 5;
                }
                if (c1751s.m2563k(objM2564l, i10, AbstractC1745m.f5000d)) {
                    return 1;
                }
            }
        }
    }

    /* JADX INFO: renamed from: P */
    public final void m2546P(long j10) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j11;
        long j12;
        if (m2537F()) {
            return;
        }
        do {
            atomicLongFieldUpdater = f4986r0;
        } while (atomicLongFieldUpdater.get(this) <= j10);
        int i10 = AbstractC1745m.f4999c;
        int i11 = 0;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f4987s0;
            if (i11 >= i10) {
                do {
                    j11 = atomicLongFieldUpdater2.get(this);
                } while (!atomicLongFieldUpdater2.compareAndSet(this, j11, 4611686018427387904L + (j11 & 4611686018427387903L)));
                while (true) {
                    long j13 = atomicLongFieldUpdater.get(this);
                    long j14 = atomicLongFieldUpdater2.get(this);
                    long j15 = j14 & 4611686018427387903L;
                    boolean z6 = (j14 & 4611686018427387904L) != 0;
                    if (j13 == j15 && j13 == atomicLongFieldUpdater.get(this)) {
                        break;
                    } else if (!z6) {
                        atomicLongFieldUpdater2.compareAndSet(this, j14, j15 + 4611686018427387904L);
                    }
                }
                do {
                    j12 = atomicLongFieldUpdater2.get(this);
                } while (!atomicLongFieldUpdater2.compareAndSet(this, j12, j12 & 4611686018427387903L));
                return;
            }
            long j16 = atomicLongFieldUpdater.get(this);
            if (j16 == (atomicLongFieldUpdater2.get(this) & 4611686018427387903L) && j16 == atomicLongFieldUpdater.get(this)) {
                return;
            } else {
                i11++;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v2, types: [An.m] */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r16v0, types: [Cn.k, java.lang.Object] */
    @Override // p077Cn.InterfaceC1730B
    /* JADX INFO: renamed from: c */
    public final Object mo2514c(InterfaceC18770c interfaceC18770c) throws Throwable {
        C1751s c1751s;
        ?? r13;
        C0624m c0624m;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4989u0;
        C1751s c1751s2 = (C1751s) atomicReferenceFieldUpdater.get(this);
        while (!mo2515d()) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f4985q0;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j10 = AbstractC1745m.f4998b;
            long j11 = andIncrement / j10;
            int i10 = (int) (andIncrement % j10);
            if (c1751s2.f8804o0 != j11) {
                C1751s c1751sM2554w = m2554w(j11, c1751s2);
                if (c1751sM2554w == null) {
                    continue;
                } else {
                    c1751s = c1751sM2554w;
                }
            } else {
                c1751s = c1751s2;
            }
            Object objM2544N = m2544N(c1751s, i10, andIncrement, null);
            C2942t c2942t = AbstractC1745m.f5009m;
            if (objM2544N == c2942t) {
                throw new IllegalStateException("unexpected");
            }
            C2942t c2942t2 = AbstractC1745m.f5011o;
            if (objM2544N == c2942t2) {
                if (andIncrement < m2533A()) {
                    c1751s.m3743a();
                }
                c1751s2 = c1751s;
            } else {
                if (objM2544N != AbstractC1745m.f5010n) {
                    c1751s.m3743a();
                    return objM2544N;
                }
                C0624m c0624mM1193v = AbstractC0575H.m1193v(AbstractC8154o0.m8714e(interfaceC18770c));
                try {
                    Object objM2544N2 = m2544N(c1751s, i10, andIncrement, c0624mM1193v);
                    try {
                        if (objM2544N2 != c2942t) {
                            c0624m = c0624mM1193v;
                            C0289t c0289tM2547m = null;
                            InterfaceC1436k interfaceC1436k = this.f4994Z;
                            if (objM2544N2 == c2942t2) {
                                if (andIncrement < m2533A()) {
                                    c1751s.m3743a();
                                }
                                C1751s c1751s3 = (C1751s) atomicReferenceFieldUpdater.get(this);
                                while (true) {
                                    if (mo2515d()) {
                                        c0624m.resumeWith(AbstractC9233X.m9806b(m2556y()));
                                        break;
                                    }
                                    long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(this);
                                    long j12 = AbstractC1745m.f4998b;
                                    long j13 = andIncrement2 / j12;
                                    int i11 = (int) (andIncrement2 % j12);
                                    if (c1751s3.f8804o0 != j13) {
                                        C1751s c1751sM2554w2 = m2554w(j13, c1751s3);
                                        if (c1751sM2554w2 != null) {
                                            c1751s3 = c1751sM2554w2;
                                        }
                                    }
                                    InterfaceC1436k interfaceC1436k2 = interfaceC1436k;
                                    objM2544N2 = m2544N(c1751s3, i11, andIncrement2, c0624m);
                                    if (objM2544N2 == AbstractC1745m.f5009m) {
                                        c0624m.mo1212a(c1751s3, i11);
                                        break;
                                    }
                                    if (objM2544N2 == AbstractC1745m.f5011o) {
                                        if (andIncrement2 < m2533A()) {
                                            c1751s3.m3743a();
                                        }
                                        interfaceC1436k = interfaceC1436k2;
                                    } else {
                                        if (objM2544N2 == AbstractC1745m.f5010n) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        c1751s3.m3743a();
                                        if (interfaceC1436k2 != null) {
                                            c0289tM2547m = m2547m();
                                        }
                                    }
                                }
                            } else {
                                c1751s.m3743a();
                                if (interfaceC1436k != null) {
                                    c0289tM2547m = m2547m();
                                }
                            }
                            c0624m.mo1246n(objM2544N2, c0289tM2547m);
                            break;
                        }
                        c0624m = c0624mM1193v;
                        c0624m.mo1212a(c1751s, i10);
                        Object objM1261q = c0624m.m1261q();
                        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
                        return objM1261q;
                    } catch (Throwable th2) {
                        th = th2;
                        r13 = c2942t;
                        r13.m1250A();
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    r13 = c0624mM1193v;
                }
            }
        }
        Throwable thM2556y = m2556y();
        int i12 = AbstractC2941s.f8805a;
        throw thM2556y;
    }

    @Override // p077Cn.InterfaceC1730B
    /* JADX INFO: renamed from: d */
    public final boolean mo2515d() {
        return m2534C(f4984p0.get(this), true);
    }

    @Override // p077Cn.InterfaceC1730B
    /* JADX INFO: renamed from: e */
    public final void mo2516e(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        m2550s(cancellationException, true);
    }

    @Override // p077Cn.InterfaceC1730B
    /* JADX INFO: renamed from: f */
    public final C2391u mo2517f() {
        C1737e c1737e = C1737e.f4974Y;
        AbstractC16529F.m18081e(3, c1737e);
        C1738f c1738f = C1738f.f4975Y;
        AbstractC16529F.m18081e(3, c1738f);
        return new C2391u(this, c1737e, c1738f, this.f4995o0);
    }

    @Override // p077Cn.InterfaceC1730B
    /* JADX INFO: renamed from: g */
    public final C2391u mo2518g() {
        C1739g c1739g = C1739g.f4976Y;
        AbstractC16529F.m18081e(3, c1739g);
        C1740h c1740h = C1740h.f4977Y;
        AbstractC16529F.m18081e(3, c1740h);
        return new C2391u(this, c1739g, c1740h, this.f4995o0);
    }

    @Override // p077Cn.InterfaceC1730B
    /* JADX INFO: renamed from: i */
    public final Object mo2519i() {
        C1751s c1751s;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f4985q0;
        long j10 = atomicLongFieldUpdater.get(this);
        long j11 = f4984p0.get(this);
        if (m2534C(j11, true)) {
            return new C1748p(m2555x());
        }
        long j12 = j11 & 1152921504606846975L;
        Object obj = C1750r.f5020b;
        if (j10 >= j12) {
            return obj;
        }
        Object obj2 = AbstractC1745m.f5007k;
        C1751s c1751s2 = (C1751s) f4989u0.get(this);
        while (!mo2515d()) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j13 = AbstractC1745m.f4998b;
            long j14 = andIncrement / j13;
            int i10 = (int) (andIncrement % j13);
            if (c1751s2.f8804o0 != j14) {
                C1751s c1751sM2554w = m2554w(j14, c1751s2);
                if (c1751sM2554w == null) {
                    continue;
                } else {
                    c1751s = c1751sM2554w;
                }
            } else {
                c1751s = c1751s2;
            }
            Object objM2544N = m2544N(c1751s, i10, andIncrement, obj2);
            if (objM2544N == AbstractC1745m.f5009m) {
                InterfaceC0586M0 interfaceC0586M0 = obj2 instanceof InterfaceC0586M0 ? (InterfaceC0586M0) obj2 : null;
                if (interfaceC0586M0 != null) {
                    interfaceC0586M0.mo1212a(c1751s, i10);
                }
                m2546P(andIncrement);
                c1751s.m3765i();
            } else if (objM2544N == AbstractC1745m.f5011o) {
                if (andIncrement < m2533A()) {
                    c1751s.m3743a();
                }
                c1751s2 = c1751s;
            } else {
                if (objM2544N == AbstractC1745m.f5010n) {
                    throw new IllegalStateException("unexpected");
                }
                c1751s.m3743a();
                obj = objM2544N;
            }
            return obj;
        }
        return new C1748p(m2555x());
    }

    @Override // p077Cn.InterfaceC1730B
    public final C1736d iterator() {
        return new C1736d(this);
    }

    @Override // p077Cn.InterfaceC1731C
    /* JADX INFO: renamed from: j */
    public final void mo2521j(InterfaceC1436k interfaceC1436k) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = f4992x0;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, interfaceC1436k)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            C2942t c2942t = AbstractC1745m.f5013q;
            if (obj != c2942t) {
                if (obj == AbstractC1745m.f5014r) {
                    throw new IllegalStateException("Another handler was already registered and successfully invoked");
                }
                throw new IllegalStateException(("Another handler is already registered: " + obj).toString());
            }
            C2942t c2942t2 = AbstractC1745m.f5014r;
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, c2942t, c2942t2)) {
                    interfaceC1436k.invoke(m2555x());
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(this) == c2942t);
        }
    }

    @Override // p077Cn.InterfaceC1731C
    /* JADX INFO: renamed from: l */
    public final boolean mo2522l(Throwable th2) {
        return m2550s(th2, false);
    }

    /* JADX INFO: renamed from: m */
    public final C0289t m2547m() {
        return new C0289t(3, this, C1743k.class, "onCancellationImplDoNotCall", "onCancellationImplDoNotCall(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", 0, 1);
    }

    /* JADX INFO: renamed from: n */
    public final C0289t m2548n() {
        return new C0289t(3, this, C1743k.class, "onCancellationChannelResultImplDoNotCall", "onCancellationChannelResultImplDoNotCall-5_sEAP8(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", 0, 2);
    }

    /* JADX WARN: Code duplicated, block: B:104:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:150:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [An.m] */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v41 */
    /* JADX WARN: Type inference failed for: r1v9 */
    @Override // p077Cn.InterfaceC1731C
    /* JADX INFO: renamed from: o */
    public Object mo2523o(Object obj, InterfaceC18770c interfaceC18770c) throws Throwable {
        C1751s c1751s;
        Object objM2539H;
        ?? r6;
        C0624m c0624m;
        EnumC19250a enumC19250a;
        C1751s c1751s2;
        C0624m c0624m2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4988t0;
        C1751s c1751s3 = (C1751s) atomicReferenceFieldUpdater.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f4984p0;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j10 = andIncrement & 1152921504606846975L;
            boolean zM2534C = m2534C(andIncrement, false);
            int i10 = AbstractC1745m.f4998b;
            long j11 = i10;
            long j12 = j10 / j11;
            int i11 = (int) (j10 % j11);
            long j13 = c1751s3.f8804o0;
            C17296C c17296c = C17296C.f55119a;
            if (j13 != j12) {
                C1751s c1751sM2529a = m2529a(this, j12, c1751s3);
                if (c1751sM2529a != null) {
                    c1751s = c1751sM2529a;
                } else if (zM2534C) {
                    objM2539H = m2539H(obj, interfaceC18770c);
                    if (objM2539H == EnumC19250a.f61036Y) {
                        break;
                    }
                    return c17296c;
                }
            } else {
                c1751s = c1751s3;
            }
            C17296C c17296c2 = c17296c;
            C1751s c1751s4 = c1751s;
            int iM2532k = m2532k(this, c1751s, i11, obj, j10, null, zM2534C);
            if (iM2532k == 0) {
                c1751s4.m3743a();
                return c17296c2;
            }
            if (iM2532k != 1) {
                if (iM2532k == 2) {
                    if (!zM2534C) {
                        return c17296c2;
                    }
                    c1751s4.m3765i();
                    objM2539H = m2539H(obj, interfaceC18770c);
                    if (objM2539H == EnumC19250a.f61036Y) {
                        break;
                    }
                    return c17296c2;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater2 = f4985q0;
                if (iM2532k == 3) {
                    C0624m c0624mM1193v = AbstractC0575H.m1193v(AbstractC8154o0.m8714e(interfaceC18770c));
                    try {
                        int iM2532k2 = m2532k(this, c1751s4, i11, obj, j10, c0624mM1193v, false);
                        try {
                            if (iM2532k2 != 0) {
                                if (iM2532k2 == 1) {
                                    c0624m = c0624mM1193v;
                                    c17296c2 = c17296c2;
                                    c0624m.resumeWith(c17296c2);
                                } else if (iM2532k2 == 2) {
                                    c0624m = c0624mM1193v;
                                    c17296c2 = c17296c2;
                                    c0624m.mo1212a(c1751s4, i11 + i10);
                                } else {
                                    if (iM2532k2 != 4) {
                                        if (iM2532k2 != 5) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        c1751s4.m3743a();
                                        C1751s c1751s5 = (C1751s) atomicReferenceFieldUpdater.get(this);
                                        while (true) {
                                            long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(this);
                                            long j14 = andIncrement2 & 1152921504606846975L;
                                            boolean zM2534C2 = m2534C(andIncrement2, false);
                                            int i12 = AbstractC1745m.f4998b;
                                            long j15 = i12;
                                            long j16 = j14 / j15;
                                            int i13 = (int) (j14 % j15);
                                            if (c1751s5.f8804o0 != j16) {
                                                try {
                                                    C1751s c1751sM2529a2 = m2529a(this, j16, c1751s5);
                                                    if (c1751sM2529a2 != null) {
                                                        c1751s2 = c1751sM2529a2;
                                                    } else if (zM2534C2) {
                                                        c0624m2 = c0624mM1193v;
                                                        try {
                                                            m2530b(this, obj, c0624m2);
                                                            c0624m = c0624m2;
                                                            c17296c2 = c17296c2;
                                                        } catch (Throwable th2) {
                                                            th = th2;
                                                            r6 = c0624m2;
                                                            r6.m1250A();
                                                            throw th;
                                                        }
                                                    }
                                                } catch (Throwable th3) {
                                                    th = th3;
                                                    c0624m2 = c0624mM1193v;
                                                }
                                            } else {
                                                c1751s2 = c1751s5;
                                            }
                                            c0624mM1193v = c0624mM1193v;
                                            C1751s c1751s6 = c1751s2;
                                            int iM2532k3 = m2532k(this, c1751s2, i13, obj, j14, c0624mM1193v, zM2534C2);
                                            if (iM2532k3 == 0) {
                                                c0624m = c0624mM1193v;
                                                c1751s6.m3743a();
                                            } else if (iM2532k3 != 1) {
                                                if (iM2532k3 == 2) {
                                                    c0624m = c0624mM1193v;
                                                    if (zM2534C2) {
                                                        c1751s6.m3765i();
                                                    } else {
                                                        c0624m.mo1212a(c1751s6, i13 + i12);
                                                    }
                                                    c17296c2 = c17296c2;
                                                } else {
                                                    if (iM2532k3 == 3) {
                                                        throw new IllegalStateException("unexpected");
                                                    }
                                                    if (iM2532k3 != 4) {
                                                        if (iM2532k3 == 5) {
                                                            c1751s6.m3743a();
                                                        }
                                                        c1751s5 = c1751s6;
                                                    } else {
                                                        if (j14 < atomicLongFieldUpdater2.get(this)) {
                                                            c1751s6.m3743a();
                                                        }
                                                        c0624m = c0624mM1193v;
                                                    }
                                                }
                                                m2530b(this, obj, c0624m);
                                                c17296c2 = c17296c2;
                                            } else {
                                                c0624m = c0624mM1193v;
                                                c17296c2 = c17296c2;
                                                c0624m.resumeWith(c17296c2);
                                            }
                                        }
                                        r6.m1250A();
                                        throw th;
                                    }
                                    c0624m = c0624mM1193v;
                                    c17296c2 = c17296c2;
                                    if (j10 < atomicLongFieldUpdater2.get(this)) {
                                        c1751s4.m3743a();
                                    }
                                    m2530b(this, obj, c0624m);
                                }
                                objM2539H = c0624m.m1261q();
                                enumC19250a = EnumC19250a.f61036Y;
                                if (objM2539H != enumC19250a) {
                                    objM2539H = c17296c2;
                                }
                                if (objM2539H != enumC19250a) {
                                    break;
                                }
                                return c17296c2;
                            }
                            c0624m = c0624mM1193v;
                            c1751s4.m3743a();
                            c0624m.resumeWith(c17296c2);
                            objM2539H = c0624m.m1261q();
                            enumC19250a = EnumC19250a.f61036Y;
                            if (objM2539H != enumC19250a) {
                                objM2539H = c17296c2;
                            }
                            if (objM2539H != enumC19250a) {
                                break;
                            }
                            return c17296c2;
                        } catch (Throwable th4) {
                            th = th4;
                            r6 = iM2532k2;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        r6 = c0624mM1193v;
                    }
                } else if (iM2532k != 4) {
                    if (iM2532k == 5) {
                        c1751s4.m3743a();
                    }
                    c1751s3 = c1751s4;
                } else {
                    if (j10 < atomicLongFieldUpdater2.get(this)) {
                        c1751s4.m3743a();
                    }
                    Object objM2539H2 = m2539H(obj, interfaceC18770c);
                    if (objM2539H2 == EnumC19250a.f61036Y) {
                        return objM2539H2;
                    }
                }
            }
            return c17296c2;
        }
        return objM2539H;
    }

    @Override // p077Cn.InterfaceC1730B
    /* JADX INFO: renamed from: q */
    public final Object mo2520q(C2610u c2610u) {
        return m2528I(this, c2610u);
    }

    /* JADX INFO: renamed from: r */
    public final boolean m2549r(long j10) {
        return j10 < f4986r0.get(this) || j10 < f4985q0.get(this) + ((long) this.f4993Y);
    }

    /* JADX INFO: renamed from: s */
    public final boolean m2550s(Throwable th2, boolean z6) {
        boolean z10;
        long j10;
        long j11;
        long j12;
        Object obj;
        long j13;
        long j14;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f4984p0;
        if (z6) {
            do {
                j14 = atomicLongFieldUpdater.get(this);
                if (((int) (j14 >> 60)) != 0) {
                    break;
                }
                C1751s c1751s = AbstractC1745m.f4997a;
            } while (!atomicLongFieldUpdater.compareAndSet(this, j14, (((long) 1) << 60) + (j14 & 1152921504606846975L)));
        }
        C2942t c2942t = AbstractC1745m.f5015s;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4991w0;
            if (atomicReferenceFieldUpdater.compareAndSet(this, c2942t, th2)) {
                z10 = true;
                break;
            }
            if (atomicReferenceFieldUpdater.get(this) != c2942t) {
                z10 = false;
                break;
            }
        }
        if (z6) {
            do {
                j13 = atomicLongFieldUpdater.get(this);
            } while (!atomicLongFieldUpdater.compareAndSet(this, j13, (((long) 3) << 60) + (j13 & 1152921504606846975L)));
        } else {
            do {
                j10 = atomicLongFieldUpdater.get(this);
                int i10 = (int) (j10 >> 60);
                if (i10 == 0) {
                    j11 = j10 & 1152921504606846975L;
                    j12 = 2;
                } else {
                    if (i10 != 1) {
                        break;
                    }
                    j11 = j10 & 1152921504606846975L;
                    j12 = 3;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(this, j10, (j12 << 60) + j11));
        }
        m2535D();
        if (z10) {
            loop3: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f4992x0;
                obj = atomicReferenceFieldUpdater2.get(this);
                C2942t c2942t2 = obj == null ? AbstractC1745m.f5013q : AbstractC1745m.f5014r;
                do {
                    if (atomicReferenceFieldUpdater2.compareAndSet(this, obj, c2942t2)) {
                        break loop3;
                    }
                } while (atomicReferenceFieldUpdater2.get(this) == obj);
            }
            if (obj != null) {
                AbstractC16529F.m18081e(1, obj);
                ((InterfaceC1436k) obj).invoke(m2555x());
            }
        }
        return z10;
    }

    /* JADX INFO: renamed from: t */
    public final C1751s m2551t(long j10) {
        Object objM3734h;
        long j11;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Object obj = f4990v0.get(this);
        C1751s c1751s = (C1751s) f4988t0.get(this);
        if (c1751s.f8804o0 > ((C1751s) obj).f8804o0) {
            obj = c1751s;
        }
        C1751s c1751s2 = (C1751s) f4989u0.get(this);
        if (c1751s2.f8804o0 > ((C1751s) obj).f8804o0) {
            obj = c1751s2;
        }
        AbstractC2924b abstractC2924b = (AbstractC2924b) obj;
        loop0: while (true) {
            abstractC2924b.getClass();
            Object obj2 = AbstractC2924b.f8767Y.get(abstractC2924b);
            C2942t c2942t = AbstractC2923a.f8760a;
            objM3734h = null;
            if (obj2 == c2942t) {
                break;
            }
            AbstractC2924b abstractC2924b2 = (AbstractC2924b) obj2;
            if (abstractC2924b2 == null) {
                do {
                    atomicReferenceFieldUpdater = AbstractC2924b.f8767Y;
                    if (atomicReferenceFieldUpdater.compareAndSet(abstractC2924b, null, c2942t)) {
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(abstractC2924b) == null);
            } else {
                abstractC2924b = abstractC2924b2;
            }
        }
        C1751s c1751s3 = (C1751s) abstractC2924b;
        if (mo2536E()) {
            C1751s c1751s4 = c1751s3;
            loop2: while (true) {
                int i10 = AbstractC1745m.f4998b - 1;
                while (true) {
                    if (-1 < i10) {
                        j11 = (c1751s4.f8804o0 * ((long) AbstractC1745m.f4998b)) + ((long) i10);
                        if (j11 >= f4985q0.get(this)) {
                            while (true) {
                                Object objM2564l = c1751s4.m2564l(i10);
                                if (objM2564l != null && objM2564l != AbstractC1745m.f5001e) {
                                    if (objM2564l != AbstractC1745m.f5000d) {
                                        break;
                                    }
                                    break loop2;
                                }
                                if (c1751s4.m2563k(objM2564l, i10, AbstractC1745m.f5008l)) {
                                    c1751s4.m3765i();
                                    break;
                                }
                            }
                            i10--;
                        }
                    } else {
                        c1751s4 = (C1751s) ((AbstractC2924b) AbstractC2924b.f8768Z.get(c1751s4));
                        if (c1751s4 == null) {
                        }
                    }
                    j11 = -1;
                    break;
                }
            }
            if (j11 != -1) {
                m2552u(j11);
            }
        }
        loop5: for (C1751s c1751s5 = c1751s3; c1751s5 != null; c1751s5 = (C1751s) ((AbstractC2924b) AbstractC2924b.f8768Z.get(c1751s5))) {
            for (int i11 = AbstractC1745m.f4998b - 1; -1 < i11; i11--) {
                if ((c1751s5.f8804o0 * ((long) AbstractC1745m.f4998b)) + ((long) i11) < j10) {
                    break loop5;
                }
                while (true) {
                    Object objM2564l2 = c1751s5.m2564l(i11);
                    if (objM2564l2 != null && objM2564l2 != AbstractC1745m.f5001e) {
                        if (!(objM2564l2 instanceof C1732D)) {
                            if (!(objM2564l2 instanceof InterfaceC0586M0)) {
                                break;
                            }
                            if (c1751s5.m2563k(objM2564l2, i11, AbstractC1745m.f5008l)) {
                                objM3734h = AbstractC2923a.m3734h(objM3734h, objM2564l2);
                                c1751s5.m2565m(i11, true);
                                break;
                            }
                        } else {
                            if (c1751s5.m2563k(objM2564l2, i11, AbstractC1745m.f5008l)) {
                                objM3734h = AbstractC2923a.m3734h(objM3734h, ((C1732D) objM2564l2).f4960a);
                                c1751s5.m2565m(i11, true);
                                break;
                            }
                        }
                    } else {
                        if (c1751s5.m2563k(objM2564l2, i11, AbstractC1745m.f5008l)) {
                            c1751s5.m3765i();
                            break;
                        }
                    }
                }
            }
        }
        if (objM3734h != null) {
            if (objM3734h instanceof ArrayList) {
                ArrayList arrayList = (ArrayList) objM3734h;
                for (int size = arrayList.size() - 1; -1 < size; size--) {
                    m2541K((InterfaceC0586M0) arrayList.get(size), true);
                }
            } else {
                m2541K((InterfaceC0586M0) objM3734h, true);
            }
        }
        return c1751s3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        String string;
        StringBuilder sb2 = new StringBuilder();
        int i10 = (int) (f4984p0.get(this) >> 60);
        if (i10 == 2) {
            sb2.append("closed,");
        } else if (i10 == 3) {
            sb2.append("cancelled,");
        }
        sb2.append("capacity=" + this.f4993Y + ',');
        sb2.append("data=[");
        int i11 = 0;
        List listM19382k = AbstractC17681o.m19382k(f4989u0.get(this), f4988t0.get(this), f4990v0.get(this));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM19382k) {
            if (((C1751s) obj) != AbstractC1745m.f4997a) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it.next();
        if (it.hasNext()) {
            long j10 = ((C1751s) next).f8804o0;
            do {
                Object next2 = it.next();
                long j11 = ((C1751s) next2).f8804o0;
                if (j10 > j11) {
                    next = next2;
                    j10 = j11;
                }
            } while (it.hasNext());
        }
        C1751s c1751s = (C1751s) next;
        long j12 = f4985q0.get(this);
        long jM2533A = m2533A();
        loop2: while (true) {
            int i12 = AbstractC1745m.f4998b;
            for (int i13 = i11; i13 < i12; i13++) {
                long j13 = (c1751s.f8804o0 * ((long) AbstractC1745m.f4998b)) + ((long) i13);
                if (j13 >= jM2533A && j13 >= j12) {
                    break loop2;
                }
                Object objM2564l = c1751s.m2564l(i13);
                Object obj2 = c1751s.f5023r0.get(i13 * 2);
                if (objM2564l instanceof InterfaceC0620k) {
                    string = (j13 >= j12 || j13 < jM2533A) ? (j13 >= jM2533A || j13 < j12) ? "cont" : "send" : "receive";
                } else if (objM2564l instanceof InterfaceC3786h) {
                    string = (j13 >= j12 || j13 < jM2533A) ? (j13 >= jM2533A || j13 < j12) ? "select" : "onSend" : "onReceive";
                } else if (objM2564l instanceof C1729A) {
                    string = "receiveCatching";
                } else if (objM2564l instanceof C1732D) {
                    string = "EB(" + objM2564l + ')';
                } else if (AbstractC16544l.m18089b(objM2564l, AbstractC1745m.f5002f) || AbstractC16544l.m18089b(objM2564l, AbstractC1745m.f5003g)) {
                    string = "resuming_sender";
                } else {
                    if (objM2564l != null && !objM2564l.equals(AbstractC1745m.f5001e) && !objM2564l.equals(AbstractC1745m.f5005i) && !objM2564l.equals(AbstractC1745m.f5004h) && !objM2564l.equals(AbstractC1745m.f5007k) && !objM2564l.equals(AbstractC1745m.f5006j) && !objM2564l.equals(AbstractC1745m.f5008l)) {
                        string = objM2564l.toString();
                    }
                }
                if (obj2 != null) {
                    sb2.append(Separators.LPAREN + string + ',' + obj2 + "),");
                } else {
                    sb2.append(string + ',');
                }
            }
            c1751s = (C1751s) c1751s.m3744c();
            if (c1751s == null) {
                break;
            }
            i11 = 0;
        }
        if (AbstractC21322p.m21682P(sb2) == ',') {
            AbstractC16544l.m18093f(sb2.deleteCharAt(sb2.length() - 1), "deleteCharAt(...)");
        }
        sb2.append("]");
        return sb2.toString();
    }

    /* JADX INFO: renamed from: u */
    public final void m2552u(long j10) {
        C0644w c0644wM3728b;
        C1751s c1751s = (C1751s) f4989u0.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f4985q0;
            long j11 = atomicLongFieldUpdater.get(this);
            if (j10 < Math.max(((long) this.f4993Y) + j11, f4986r0.get(this))) {
                return;
            }
            if (atomicLongFieldUpdater.compareAndSet(this, j11, j11 + 1)) {
                long j12 = AbstractC1745m.f4998b;
                long j13 = j11 / j12;
                int i10 = (int) (j11 % j12);
                if (c1751s.f8804o0 != j13) {
                    C1751s c1751sM2554w = m2554w(j13, c1751s);
                    if (c1751sM2554w == null) {
                        continue;
                    } else {
                        c1751s = c1751sM2554w;
                    }
                }
                Object objM2544N = m2544N(c1751s, i10, j11, null);
                if (objM2544N != AbstractC1745m.f5011o) {
                    c1751s.m3743a();
                    InterfaceC1436k interfaceC1436k = this.f4994Z;
                    if (interfaceC1436k != null && (c0644wM3728b = AbstractC2923a.m3728b(interfaceC1436k, objM2544N, null)) != null) {
                        throw c0644wM3728b;
                    }
                } else if (j11 < m2533A()) {
                    c1751s.m3743a();
                }
            }
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m2553v() {
        Object objM3730d;
        if (m2537F()) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4990v0;
        C1751s c1751s = (C1751s) atomicReferenceFieldUpdater.get(this);
        while (true) {
            long andIncrement = f4986r0.getAndIncrement(this);
            long j10 = andIncrement / ((long) AbstractC1745m.f4998b);
            if (m2533A() <= andIncrement) {
                if (c1751s.f8804o0 < j10 && c1751s.m3744c() != null) {
                    m2538G(j10, c1751s);
                }
                m2527B(this);
                return;
            }
            if (c1751s.f8804o0 != j10) {
                C1744l c1744l = C1744l.f4996Y;
                while (true) {
                    objM3730d = AbstractC2923a.m3730d(c1751s, j10, c1744l);
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
                C1751s c1751s2 = null;
                if (AbstractC2923a.m3733g(objM3730d)) {
                    m2535D();
                    m2538G(j10, c1751s);
                    m2527B(this);
                } else {
                    C1751s c1751s3 = (C1751s) AbstractC2923a.m3731e(objM3730d);
                    long j11 = c1751s3.f8804o0;
                    if (j11 > j10) {
                        long j12 = j11 * ((long) AbstractC1745m.f4998b);
                        if (f4986r0.compareAndSet(this, andIncrement + 1, j12)) {
                            AtomicLongFieldUpdater atomicLongFieldUpdater = f4987s0;
                            if ((atomicLongFieldUpdater.addAndGet(this, j12 - andIncrement) & 4611686018427387904L) != 0) {
                                while ((atomicLongFieldUpdater.get(this) & 4611686018427387904L) != 0) {
                                }
                            }
                        } else {
                            m2527B(this);
                        }
                    } else {
                        c1751s2 = c1751s3;
                    }
                }
                if (c1751s2 == null) {
                    continue;
                } else {
                    c1751s = c1751s2;
                }
            }
            int i10 = (int) (andIncrement % ((long) AbstractC1745m.f4998b));
            Object objM2564l = c1751s.m2564l(i10);
            boolean z6 = objM2564l instanceof InterfaceC0586M0;
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f4985q0;
            if (!z6 || andIncrement < atomicLongFieldUpdater2.get(this) || !c1751s.m2563k(objM2564l, i10, AbstractC1745m.f5003g)) {
                while (true) {
                    Object objM2564l2 = c1751s.m2564l(i10);
                    if (objM2564l2 instanceof InterfaceC0586M0) {
                        if (andIncrement < atomicLongFieldUpdater2.get(this)) {
                            if (c1751s.m2563k(objM2564l2, i10, new C1732D((InterfaceC0586M0) objM2564l2))) {
                                m2527B(this);
                                return;
                            }
                        } else if (c1751s.m2563k(objM2564l2, i10, AbstractC1745m.f5003g)) {
                            if (!m2543M(objM2564l2, c1751s, i10)) {
                                c1751s.m2567o(i10, AbstractC1745m.f5006j);
                                c1751s.m3765i();
                                break;
                            } else {
                                c1751s.m2567o(i10, AbstractC1745m.f5000d);
                                m2527B(this);
                                return;
                            }
                        }
                    } else {
                        if (objM2564l2 == AbstractC1745m.f5006j) {
                            break;
                        }
                        if (objM2564l2 == null) {
                            if (c1751s.m2563k(objM2564l2, i10, AbstractC1745m.f5001e)) {
                                m2527B(this);
                                return;
                            }
                        } else if (objM2564l2 == AbstractC1745m.f5000d || objM2564l2 == AbstractC1745m.f5004h || objM2564l2 == AbstractC1745m.f5005i || objM2564l2 == AbstractC1745m.f5007k || objM2564l2 == AbstractC1745m.f5008l) {
                            m2527B(this);
                            return;
                        } else if (objM2564l2 != AbstractC1745m.f5002f) {
                            throw new IllegalStateException(("Unexpected cell state: " + objM2564l2).toString());
                        }
                    }
                }
                m2527B(this);
            } else if (m2543M(objM2564l, c1751s, i10)) {
                c1751s.m2567o(i10, AbstractC1745m.f5000d);
                m2527B(this);
                return;
            } else {
                c1751s.m2567o(i10, AbstractC1745m.f5006j);
                c1751s.m3765i();
                m2527B(this);
            }
        }
    }

    /* JADX INFO: renamed from: w */
    public final C1751s m2554w(long j10, C1751s c1751s) {
        Object objM3730d;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j11;
        C1751s c1751s2 = AbstractC1745m.f4997a;
        C1744l c1744l = C1744l.f4996Y;
        loop0: while (true) {
            objM3730d = AbstractC2923a.m3730d(c1751s, j10, c1744l);
            if (!AbstractC2923a.m3733g(objM3730d)) {
                AbstractC2940r abstractC2940rM3731e = AbstractC2923a.m3731e(objM3730d);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4989u0;
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
        if (AbstractC2923a.m3733g(objM3730d)) {
            m2535D();
            if (c1751s.f8804o0 * ((long) AbstractC1745m.f4998b) >= m2533A()) {
                return null;
            }
            c1751s.m3743a();
            return null;
        }
        C1751s c1751s3 = (C1751s) AbstractC2923a.m3731e(objM3730d);
        boolean zM2537F = m2537F();
        long j12 = c1751s3.f8804o0;
        if (!zM2537F && j10 <= f4986r0.get(this) / ((long) AbstractC1745m.f4998b)) {
            loop3: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f4990v0;
                AbstractC2940r abstractC2940r2 = (AbstractC2940r) atomicReferenceFieldUpdater2.get(this);
                if (abstractC2940r2.f8804o0 >= j12 || !c1751s3.m3766j()) {
                    break;
                }
                do {
                    if (atomicReferenceFieldUpdater2.compareAndSet(this, abstractC2940r2, c1751s3)) {
                        if (!abstractC2940r2.m3764f()) {
                            break loop3;
                        }
                        abstractC2940r2.m3746e();
                        break loop3;
                    }
                } while (atomicReferenceFieldUpdater2.get(this) == abstractC2940r2);
                if (c1751s3.m3764f()) {
                    c1751s3.m3746e();
                }
            }
        }
        if (j12 <= j10) {
            return c1751s3;
        }
        long j13 = ((long) AbstractC1745m.f4998b) * j12;
        do {
            atomicLongFieldUpdater = f4985q0;
            j11 = atomicLongFieldUpdater.get(this);
            if (j11 >= j13) {
                break;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j11, j13));
        if (j12 * ((long) AbstractC1745m.f4998b) >= m2533A()) {
            return null;
        }
        c1751s3.m3743a();
        return null;
    }

    /* JADX INFO: renamed from: x */
    public final Throwable m2555x() {
        return (Throwable) f4991w0.get(this);
    }

    /* JADX INFO: renamed from: y */
    public final Throwable m2556y() {
        Throwable thM2555x = m2555x();
        return thM2555x == null ? new C1752t("Channel was closed") : thM2555x;
    }

    /* JADX INFO: renamed from: z */
    public final Throwable m2557z() {
        Throwable thM2555x = m2555x();
        return thM2555x == null ? new C1753u("Channel was closed") : thM2555x;
    }

    @Override // p077Cn.InterfaceC1731C
    /* JADX INFO: renamed from: p */
    public Object mo2524p(Object obj) {
        C1751s c1751s;
        C1751s c1751s2;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f4984p0;
        long j10 = atomicLongFieldUpdater.get(this);
        boolean z6 = m2534C(j10, false) ? false : !m2549r(j10 & 1152921504606846975L);
        C1749q c1749q = C1750r.f5020b;
        if (z6) {
            return c1749q;
        }
        InterfaceC6948f interfaceC6948f = AbstractC1745m.f5006j;
        C1751s c1751s3 = (C1751s) f4988t0.get(this);
        while (true) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j11 = andIncrement & 1152921504606846975L;
            boolean zM2534C = m2534C(andIncrement, false);
            int i10 = AbstractC1745m.f4998b;
            long j12 = i10;
            long j13 = j11 / j12;
            int i11 = (int) (j11 % j12);
            if (c1751s3.f8804o0 != j13) {
                C1751s c1751sM2529a = m2529a(this, j13, c1751s3);
                if (c1751sM2529a != null) {
                    c1751s = c1751sM2529a;
                } else if (zM2534C) {
                    return new C1748p(m2557z());
                }
            } else {
                c1751s = c1751s3;
            }
            C1751s c1751s4 = c1751s;
            int iM2532k = m2532k(this, c1751s, i11, obj, j11, interfaceC6948f, zM2534C);
            C17296C c17296c = C17296C.f55119a;
            if (iM2532k == 0) {
                c1751s4.m3743a();
            } else if (iM2532k != 1) {
                if (iM2532k == 2) {
                    if (zM2534C) {
                        c1751s4.m3765i();
                        return new C1748p(m2557z());
                    }
                    InterfaceC0586M0 interfaceC0586M0 = interfaceC6948f instanceof InterfaceC0586M0 ? (InterfaceC0586M0) interfaceC6948f : null;
                    if (interfaceC0586M0 != null) {
                        c1751s2 = c1751s4;
                        interfaceC0586M0.mo1212a(c1751s2, i11 + i10);
                    } else {
                        c1751s2 = c1751s4;
                    }
                    c1751s2.m3765i();
                    return c1749q;
                }
                if (iM2532k == 3) {
                    throw new IllegalStateException(CsqksqyPE.CaozSfFhP);
                }
                if (iM2532k == 4) {
                    if (j11 < f4985q0.get(this)) {
                        c1751s4.m3743a();
                    }
                    return new C1748p(m2557z());
                }
                if (iM2532k == 5) {
                    c1751s4.m3743a();
                }
                c1751s3 = c1751s4;
            }
            return c17296c;
        }
    }
}
