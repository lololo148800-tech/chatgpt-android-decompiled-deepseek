package p077Cn;

import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.jvm.internal.AbstractC16544l;
import p025An.InterfaceC0586M0;
import p049Bm.InterfaceC1436k;
import p153Fn.AbstractC2923a;
import p153Fn.AbstractC2940r;
import p153Fn.C2942t;
import p972qm.InterfaceC18776i;

/* JADX INFO: renamed from: Cn.s */
/* JADX INFO: loaded from: classes2.dex */
public final class C1751s extends AbstractC2940r {

    /* JADX INFO: renamed from: q0 */
    public final C1743k f5022q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ AtomicReferenceArray f5023r0;

    public C1751s(long j10, C1751s c1751s, C1743k c1743k, int i10) {
        super(j10, c1751s, i10);
        this.f5022q0 = c1743k;
        this.f5023r0 = new AtomicReferenceArray(AbstractC1745m.f4998b * 2);
    }

    @Override // p153Fn.AbstractC2940r
    /* JADX INFO: renamed from: g */
    public final int mo2561g() {
        return AbstractC1745m.f4998b;
    }

    @Override // p153Fn.AbstractC2940r
    /* JADX INFO: renamed from: h */
    public final void mo2562h(int i10, InterfaceC18776i interfaceC18776i) {
        C1743k c1743k;
        int i11 = AbstractC1745m.f4998b;
        boolean z6 = i10 >= i11;
        if (z6) {
            i10 -= i11;
        }
        Object obj = this.f5023r0.get(i10 * 2);
        while (true) {
            Object objM2564l = m2564l(i10);
            boolean z10 = objM2564l instanceof InterfaceC0586M0;
            c1743k = this.f5022q0;
            if (z10 || (objM2564l instanceof C1732D)) {
                if (m2563k(objM2564l, i10, z6 ? AbstractC1745m.f5006j : AbstractC1745m.f5007k)) {
                    m2566n(i10, null);
                    m2565m(i10, !z6);
                    if (z6) {
                        AbstractC16544l.m18091d(c1743k);
                        InterfaceC1436k interfaceC1436k = c1743k.f4994Z;
                        if (interfaceC1436k != null) {
                            AbstractC2923a.m3727a(interfaceC1436k, obj, interfaceC18776i);
                            return;
                        }
                        return;
                    }
                    return;
                }
            } else {
                if (objM2564l == AbstractC1745m.f5006j || objM2564l == AbstractC1745m.f5007k) {
                    break;
                }
                if (objM2564l != AbstractC1745m.f5003g && objM2564l != AbstractC1745m.f5002f) {
                    if (objM2564l == AbstractC1745m.f5005i || objM2564l == AbstractC1745m.f5000d || objM2564l == AbstractC1745m.f5008l) {
                        return;
                    }
                    throw new IllegalStateException(("unexpected state: " + objM2564l).toString());
                }
            }
        }
        m2566n(i10, null);
        if (z6) {
            AbstractC16544l.m18091d(c1743k);
            InterfaceC1436k interfaceC1436k2 = c1743k.f4994Z;
            if (interfaceC1436k2 != null) {
                AbstractC2923a.m3727a(interfaceC1436k2, obj, interfaceC18776i);
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final boolean m2563k(Object obj, int i10, Object obj2) {
        AtomicReferenceArray atomicReferenceArray = this.f5023r0;
        int i11 = (i10 * 2) + 1;
        while (!atomicReferenceArray.compareAndSet(i11, obj, obj2)) {
            if (atomicReferenceArray.get(i11) != obj) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: l */
    public final Object m2564l(int i10) {
        return this.f5023r0.get((i10 * 2) + 1);
    }

    /* JADX INFO: renamed from: m */
    public final void m2565m(int i10, boolean z6) {
        if (z6) {
            C1743k c1743k = this.f5022q0;
            AbstractC16544l.m18091d(c1743k);
            c1743k.m2546P((this.f8804o0 * ((long) AbstractC1745m.f4998b)) + ((long) i10));
        }
        m3765i();
    }

    /* JADX INFO: renamed from: n */
    public final void m2566n(int i10, Object obj) {
        this.f5023r0.set(i10 * 2, obj);
    }

    /* JADX INFO: renamed from: o */
    public final void m2567o(int i10, C2942t c2942t) {
        this.f5023r0.set((i10 * 2) + 1, c2942t);
    }
}
