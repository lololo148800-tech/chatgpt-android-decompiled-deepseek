package p025An;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.AbstractC16544l;
import p153Fn.C2931i;
import p153Fn.C2937o;

/* JADX INFO: renamed from: An.q0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0633q0 extends C2931i implements InterfaceC0595V, InterfaceC0617i0 {

    /* JADX INFO: renamed from: p0 */
    public C0641u0 f1882p0;

    @Override // p025An.InterfaceC0617i0
    /* JADX INFO: renamed from: a */
    public final boolean mo1220a() {
        return true;
    }

    @Override // p025An.InterfaceC0617i0
    /* JADX INFO: renamed from: c */
    public final C0645w0 mo1221c() {
        return null;
    }

    @Override // p025An.InterfaceC0595V
    public final void dispose() {
        C0641u0 c0641u0M1280i = m1280i();
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C0641u0.f1897Y;
            Object obj = atomicReferenceFieldUpdater.get(c0641u0M1280i);
            if (obj instanceof AbstractC0633q0) {
                if (obj != this) {
                    return;
                }
                C0597X c0597x = AbstractC0575H.f1805j;
                while (!atomicReferenceFieldUpdater.compareAndSet(c0641u0M1280i, obj, c0597x)) {
                    if (atomicReferenceFieldUpdater.get(c0641u0M1280i) != obj) {
                    }
                }
                return;
            }
            if (!(obj instanceof InterfaceC0617i0) || ((InterfaceC0617i0) obj).mo1221c() == null) {
                return;
            }
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C2931i.f8785Y;
                Object obj2 = atomicReferenceFieldUpdater2.get(this);
                if (obj2 instanceof C2937o) {
                    C2931i c2931i = ((C2937o) obj2).f8801a;
                    return;
                }
                if (obj2 == this) {
                    return;
                }
                AbstractC16544l.m18092e(obj2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
                C2931i c2931i2 = (C2931i) obj2;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = C2931i.f8787o0;
                C2937o c2937o = (C2937o) atomicReferenceFieldUpdater3.get(c2931i2);
                if (c2937o == null) {
                    c2937o = new C2937o(c2931i2);
                    atomicReferenceFieldUpdater3.set(c2931i2, c2937o);
                }
                do {
                    if (atomicReferenceFieldUpdater2.compareAndSet(this, obj2, c2937o)) {
                        c2931i2.m3750e();
                        return;
                    }
                } while (atomicReferenceFieldUpdater2.get(this) == obj2);
            }
        }
    }

    public InterfaceC0627n0 getParent() {
        return m1280i();
    }

    /* JADX INFO: renamed from: i */
    public final C0641u0 m1280i() {
        C0641u0 c0641u0 = this.f1882p0;
        if (c0641u0 != null) {
            return c0641u0;
        }
        AbstractC16544l.m18103p("job");
        throw null;
    }

    /* JADX INFO: renamed from: j */
    public abstract boolean mo1149j();

    /* JADX INFO: renamed from: k */
    public abstract void mo1150k(Throwable th2);

    @Override // p153Fn.C2931i
    public final String toString() {
        return getClass().getSimpleName() + '@' + AbstractC0575H.m1191t(this) + "[job@" + AbstractC0575H.m1191t(m1280i()) + ']';
    }
}
