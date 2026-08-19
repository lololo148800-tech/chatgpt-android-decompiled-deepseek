package p153Fn;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import mm.C17312o;
import p025An.AbstractC0563B;
import p025An.AbstractC0570E0;
import p025An.AbstractC0575H;
import p025An.AbstractC0591Q;
import p025An.AbstractC0607d0;
import p025An.C0642v;
import p972qm.InterfaceC18770c;
import p972qm.InterfaceC18776i;
import sm.AbstractC19687c;
import sm.InterfaceC19688d;

/* JADX INFO: renamed from: Fn.f */
/* JADX INFO: loaded from: classes2.dex */
public final class C2928f extends AbstractC0591Q implements InterfaceC19688d, InterfaceC18770c {

    /* JADX INFO: renamed from: t0 */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f8772t0 = AtomicReferenceFieldUpdater.newUpdater(C2928f.class, Object.class, "_reusableCancellableContinuation$volatile");
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;

    /* JADX INFO: renamed from: p0 */
    public final AbstractC0563B f8773p0;

    /* JADX INFO: renamed from: q0 */
    public final AbstractC19687c f8774q0;

    /* JADX INFO: renamed from: r0 */
    public Object f8775r0;

    /* JADX INFO: renamed from: s0 */
    public final Object f8776s0;

    public C2928f(AbstractC0563B abstractC0563B, AbstractC19687c abstractC19687c) {
        super(-1);
        this.f8773p0 = abstractC0563B;
        this.f8774q0 = abstractC19687c;
        this.f8775r0 = AbstractC2923a.f8761b;
        this.f8776s0 = AbstractC2923a.m3741o(abstractC19687c.getContext());
    }

    @Override // sm.InterfaceC19688d
    public final InterfaceC19688d getCallerFrame() {
        return this.f8774q0;
    }

    @Override // p972qm.InterfaceC18770c
    public final InterfaceC18776i getContext() {
        return this.f8774q0.getContext();
    }

    @Override // p025An.AbstractC0591Q
    /* JADX INFO: renamed from: i */
    public final Object mo1219i() {
        Object obj = this.f8775r0;
        this.f8775r0 = AbstractC2923a.f8761b;
        return obj;
    }

    @Override // p972qm.InterfaceC18770c
    public final void resumeWith(Object obj) {
        Throwable thM18979a = C17312o.m18979a(obj);
        Object c0642v = thM18979a == null ? obj : new C0642v(thM18979a, false);
        AbstractC19687c abstractC19687c = this.f8774q0;
        InterfaceC18776i context = abstractC19687c.getContext();
        AbstractC0563B abstractC0563B = this.f8773p0;
        if (AbstractC2923a.m3738l(abstractC0563B, context)) {
            this.f8775r0 = c0642v;
            this.f1822o0 = 0;
            AbstractC2923a.m3737k(abstractC0563B, abstractC19687c.getContext(), this);
            return;
        }
        AbstractC0607d0 abstractC0607d0M1147a = AbstractC0570E0.m1147a();
        if (abstractC0607d0M1147a.m1241d1()) {
            this.f8775r0 = c0642v;
            this.f1822o0 = 0;
            abstractC0607d0M1147a.m1239a1(this);
            return;
        }
        abstractC0607d0M1147a.m1240c1(true);
        try {
            InterfaceC18776i context2 = abstractC19687c.getContext();
            Object objM3742p = AbstractC2923a.m3742p(context2, this.f8776s0);
            try {
                abstractC19687c.resumeWith(obj);
                AbstractC2923a.m3735i(context2, objM3742p);
                while (abstractC0607d0M1147a.m1242f1()) {
                }
            } catch (Throwable th2) {
                AbstractC2923a.m3735i(context2, objM3742p);
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                m1218g(th3);
            } finally {
                abstractC0607d0M1147a.m1238Z0(true);
            }
        }
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.f8773p0 + ", " + AbstractC0575H.m1164L(this.f8774q0) + ']';
    }

    @Override // p025An.AbstractC0591Q
    /* JADX INFO: renamed from: d */
    public final InterfaceC18770c mo1215d() {
        return this;
    }
}
