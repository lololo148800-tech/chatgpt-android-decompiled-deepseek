package p153Fn;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.AbstractC16544l;
import p025An.AbstractC0575H;
import p124Ei.C2502d1;

/* JADX INFO: renamed from: Fn.i */
/* JADX INFO: loaded from: classes2.dex */
public class C2931i {

    /* JADX INFO: renamed from: Y */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f8785Y = AtomicReferenceFieldUpdater.newUpdater(C2931i.class, Object.class, "_next$volatile");

    /* JADX INFO: renamed from: Z */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f8786Z = AtomicReferenceFieldUpdater.newUpdater(C2931i.class, Object.class, "_prev$volatile");

    /* JADX INFO: renamed from: o0 */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f8787o0 = AtomicReferenceFieldUpdater.newUpdater(C2931i.class, Object.class, "_removedRef$volatile");
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    /* JADX INFO: renamed from: d */
    public final boolean m3749d(C2931i c2931i, int i10) {
        while (true) {
            C2931i c2931iM3750e = m3750e();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8786Z;
            if (c2931iM3750e == null) {
                Object obj = atomicReferenceFieldUpdater.get(this);
                while (true) {
                    c2931iM3750e = (C2931i) obj;
                    if (!c2931iM3750e.mo1313h()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(c2931iM3750e);
                }
            }
            if (c2931iM3750e instanceof C2930h) {
                return (((C2930h) c2931iM3750e).f8784p0 & i10) == 0 && c2931iM3750e.m3749d(c2931i, i10);
            }
            atomicReferenceFieldUpdater.set(c2931i, c2931iM3750e);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f8785Y;
            atomicReferenceFieldUpdater2.set(c2931i, this);
            do {
                if (atomicReferenceFieldUpdater2.compareAndSet(c2931iM3750e, this, c2931i)) {
                    c2931i.m3751f(this);
                    return true;
                }
            } while (atomicReferenceFieldUpdater2.get(c2931iM3750e) == this);
        }
    }

    /* JADX INFO: renamed from: e */
    public final C2931i m3750e() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Object obj;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f8786Z;
            C2931i c2931i = (C2931i) atomicReferenceFieldUpdater2.get(this);
            C2931i c2931i2 = c2931i;
            while (true) {
                C2931i c2931i3 = null;
                while (true) {
                    atomicReferenceFieldUpdater = f8785Y;
                    obj = atomicReferenceFieldUpdater.get(c2931i2);
                    if (obj == this) {
                        if (c2931i == c2931i2) {
                            return c2931i2;
                        }
                        while (!atomicReferenceFieldUpdater2.compareAndSet(this, c2931i, c2931i2)) {
                            if (atomicReferenceFieldUpdater2.get(this) != c2931i) {
                                break;
                            }
                        }
                        return c2931i2;
                    }
                    if (mo1313h()) {
                        return null;
                    }
                    if (!(obj instanceof C2937o)) {
                        AbstractC16544l.m18092e(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
                        c2931i3 = c2931i2;
                        c2931i2 = (C2931i) obj;
                    } else {
                        if (c2931i3 != null) {
                            break;
                        }
                        c2931i2 = (C2931i) atomicReferenceFieldUpdater2.get(c2931i2);
                    }
                }
                C2931i c2931i4 = ((C2937o) obj).f8801a;
                while (!atomicReferenceFieldUpdater.compareAndSet(c2931i3, c2931i2, c2931i4)) {
                    if (atomicReferenceFieldUpdater.get(c2931i3) != c2931i2) {
                        break;
                    }
                }
                c2931i2 = c2931i3;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m3751f(C2931i c2931i) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8786Z;
            C2931i c2931i2 = (C2931i) atomicReferenceFieldUpdater.get(c2931i);
            if (f8785Y.get(this) != c2931i) {
                return;
            }
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(c2931i, c2931i2, this)) {
                    if (mo1313h()) {
                        c2931i.m3750e();
                        return;
                    }
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(c2931i) == c2931i2);
        }
    }

    /* JADX INFO: renamed from: g */
    public final C2931i m3752g() {
        C2931i c2931i;
        Object obj = f8785Y.get(this);
        C2937o c2937o = obj instanceof C2937o ? (C2937o) obj : null;
        if (c2937o != null && (c2931i = c2937o.f8801a) != null) {
            return c2931i;
        }
        AbstractC16544l.m18092e(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        return (C2931i) obj;
    }

    /* JADX INFO: renamed from: h */
    public boolean mo1313h() {
        return f8785Y.get(this) instanceof C2937o;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        int i10 = 1;
        sb2.append(new C2502d1(1, i10, AbstractC0575H.class, this, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;"));
        sb2.append('@');
        sb2.append(AbstractC0575H.m1191t(this));
        return sb2.toString();
    }
}
