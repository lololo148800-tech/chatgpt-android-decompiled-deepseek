package p025An;

import kotlin.jvm.internal.AbstractC16529F;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import mm.C17312o;
import p049Bm.InterfaceC1439n;
import p153Fn.AbstractC2923a;
import p523V9.AbstractC8048a6;
import p523V9.AbstractC8154o0;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p972qm.InterfaceC18776i;
import p996rm.EnumC19250a;
import sm.AbstractC19685a;

/* JADX INFO: renamed from: An.a */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0600a extends C0641u0 implements InterfaceC18770c, InterfaceC0571F {

    /* JADX INFO: renamed from: o0 */
    public final InterfaceC18776i f1833o0;

    public AbstractC0600a(InterfaceC18776i interfaceC18776i, boolean z6, boolean z10) {
        super(z10);
        if (z6) {
            m1294K((InterfaceC0627n0) interfaceC18776i.get(C0625m0.f1875Y));
        }
        this.f1833o0 = interfaceC18776i.plus(this);
    }

    @Override // p025An.C0641u0
    /* JADX INFO: renamed from: J */
    public final void mo1222J(C0644w c0644w) {
        AbstractC0575H.m1194w(this.f1833o0, c0644w);
    }

    @Override // p025An.C0641u0
    /* JADX INFO: renamed from: Y */
    public final void mo1223Y(Object obj) {
        if (!(obj instanceof C0642v)) {
            mo1225h0(obj);
        } else {
            C0642v c0642v = (C0642v) obj;
            mo1224g0(c0642v.f1900a, C0642v.f1899b.get(c0642v) == 1);
        }
    }

    @Override // p972qm.InterfaceC18770c
    public final InterfaceC18776i getContext() {
        return this.f1833o0;
    }

    @Override // p025An.InterfaceC0571F
    public final InterfaceC18776i getCoroutineContext() {
        return this.f1833o0;
    }

    /* JADX INFO: renamed from: i0 */
    public final void m1226i0(EnumC0573G enumC0573G, AbstractC0600a abstractC0600a, InterfaceC1439n interfaceC1439n) {
        Object objInvoke;
        int iOrdinal = enumC0573G.ordinal();
        C17296C c17296c = C17296C.f55119a;
        if (iOrdinal == 0) {
            try {
                AbstractC2923a.m3736j(c17296c, AbstractC8154o0.m8714e(AbstractC8154o0.m8710a(interfaceC1439n, abstractC0600a, this)));
                return;
            } catch (Throwable th2) {
                AbstractC8048a6.m8438b(this, th2);
                throw null;
            }
        }
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                AbstractC16544l.m18094g(interfaceC1439n, "<this>");
                AbstractC8154o0.m8714e(AbstractC8154o0.m8710a(interfaceC1439n, abstractC0600a, this)).resumeWith(c17296c);
                return;
            }
            if (iOrdinal != 3) {
                throw new C0644w();
            }
            try {
                InterfaceC18776i interfaceC18776i = this.f1833o0;
                Object objM3742p = AbstractC2923a.m3742p(interfaceC18776i, null);
                try {
                    if (interfaceC1439n instanceof AbstractC19685a) {
                        AbstractC16529F.m18081e(2, interfaceC1439n);
                        objInvoke = interfaceC1439n.invoke(abstractC0600a, this);
                    } else {
                        objInvoke = AbstractC8154o0.m8715f(interfaceC1439n, abstractC0600a, this);
                    }
                    AbstractC2923a.m3735i(interfaceC18776i, objM3742p);
                    if (objInvoke != EnumC19250a.f61036Y) {
                        resumeWith(objInvoke);
                    }
                } catch (Throwable th3) {
                    AbstractC2923a.m3735i(interfaceC18776i, objM3742p);
                    throw th3;
                }
            } catch (Throwable th4) {
                th = th4;
                if (th instanceof C0589O) {
                    th = ((C0589O) th).f1820Y;
                }
                resumeWith(AbstractC9233X.m9806b(th));
            }
        }
    }

    @Override // p972qm.InterfaceC18770c
    public final void resumeWith(Object obj) {
        Throwable thM18979a = C17312o.m18979a(obj);
        if (thM18979a != null) {
            obj = new C0642v(thM18979a, false);
        }
        Object objM1299Q = m1299Q(obj);
        if (objM1299Q == AbstractC0575H.f1800e) {
            return;
        }
        mo1210s(objM1299Q);
    }

    @Override // p025An.C0641u0
    /* JADX INFO: renamed from: y */
    public final String mo1227y() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    /* JADX INFO: renamed from: h0 */
    public void mo1225h0(Object obj) {
    }

    /* JADX INFO: renamed from: g0 */
    public void mo1224g0(Throwable th2, boolean z6) {
    }
}
