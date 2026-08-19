package p025An;

import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.AbstractC16544l;
import p024Am.C0560a;
import p153Fn.AbstractC2923a;
import p153Fn.C2928f;
import p201Hn.AbstractRunnableC3520i;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p972qm.InterfaceC18776i;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: An.Q */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0591Q extends AbstractRunnableC3520i {

    /* JADX INFO: renamed from: o0 */
    public int f1822o0;

    public AbstractC0591Q(int i10) {
        super(0L, false);
        this.f1822o0 = i10;
    }

    /* JADX INFO: renamed from: d */
    public abstract InterfaceC18770c mo1215d();

    /* JADX INFO: renamed from: e */
    public Throwable mo1216e(Object obj) {
        C0642v c0642v = obj instanceof C0642v ? (C0642v) obj : null;
        if (c0642v != null) {
            return c0642v.f1900a;
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public final void m1218g(Throwable th2) {
        AbstractC0575H.m1194w(mo1215d().getContext(), new C0560a("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th2));
    }

    /* JADX INFO: renamed from: i */
    public abstract Object mo1219i();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            InterfaceC18770c interfaceC18770cMo1215d = mo1215d();
            AbstractC16544l.m18092e(interfaceC18770cMo1215d, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            C2928f c2928f = (C2928f) interfaceC18770cMo1215d;
            AbstractC19687c abstractC19687c = c2928f.f8774q0;
            Object obj = c2928f.f8776s0;
            InterfaceC18776i context = abstractC19687c.getContext();
            Object objM3742p = AbstractC2923a.m3742p(context, obj);
            InterfaceC0627n0 interfaceC0627n0 = null;
            C0582K0 c0582k0M1167O = objM3742p != AbstractC2923a.f8763d ? AbstractC0575H.m1167O(abstractC19687c, context, objM3742p) : null;
            try {
                InterfaceC18776i context2 = abstractC19687c.getContext();
                Object objMo1219i = mo1219i();
                Throwable thMo1216e = mo1216e(objMo1219i);
                if (thMo1216e == null && AbstractC0575H.m1153A(this.f1822o0)) {
                    interfaceC0627n0 = (InterfaceC0627n0) context2.get(C0625m0.f1875Y);
                }
                if (interfaceC0627n0 != null && !interfaceC0627n0.mo1274a()) {
                    CancellationException cancellationExceptionMo1273T = interfaceC0627n0.mo1273T();
                    mo1214c(cancellationExceptionMo1273T);
                    abstractC19687c.resumeWith(AbstractC9233X.m9806b(cancellationExceptionMo1273T));
                } else if (thMo1216e != null) {
                    abstractC19687c.resumeWith(AbstractC9233X.m9806b(thMo1216e));
                } else {
                    abstractC19687c.resumeWith(mo1217f(objMo1219i));
                }
            } finally {
                if (c0582k0M1167O == null || c0582k0M1167O.m1207l0()) {
                    AbstractC2923a.m3735i(context, objM3742p);
                }
            }
        } catch (C0589O e10) {
            AbstractC0575H.m1194w(mo1215d().getContext(), e10.f1820Y);
        } catch (Throwable th2) {
            m1218g(th2);
        }
    }

    /* JADX INFO: renamed from: c */
    public void mo1214c(CancellationException cancellationException) {
    }

    /* JADX INFO: renamed from: f */
    public Object mo1217f(Object obj) {
        return obj;
    }
}
