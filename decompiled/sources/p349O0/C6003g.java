package p349O0;

import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC16546n;
import p025An.C0624m;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p292Lg.C5034f;
import p334Na.AbstractC5695b;
import p523V9.AbstractC8154o0;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18774g;
import p972qm.InterfaceC18775h;
import p972qm.InterfaceC18776i;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: O0.g */
/* JADX INFO: loaded from: classes.dex */
public final class C6003g implements InterfaceC5977T {

    /* JADX INFO: renamed from: Y */
    public final AbstractC16546n f19488Y;

    /* JADX INFO: renamed from: o0 */
    public Throwable f19490o0;

    /* JADX INFO: renamed from: Z */
    public final Object f19489Z = new Object();

    /* JADX INFO: renamed from: p0 */
    public ArrayList f19491p0 = new ArrayList();

    /* JADX INFO: renamed from: q0 */
    public ArrayList f19492q0 = new ArrayList();

    /* JADX INFO: renamed from: r0 */
    public final C5999e f19493r0 = new C5999e(0);

    /* JADX WARN: Multi-variable type inference failed */
    public C6003g(InterfaceC1426a interfaceC1426a) {
        this.f19488Y = (AbstractC16546n) interfaceC1426a;
    }

    /* JADX INFO: renamed from: b */
    public static final void m6474b(C6003g c6003g, Throwable th2) {
        synchronized (c6003g.f19489Z) {
            try {
                if (c6003g.f19490o0 != null) {
                    return;
                }
                c6003g.f19490o0 = th2;
                ArrayList arrayList = c6003g.f19491p0;
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((C6001f) arrayList.get(i10)).f19485b.resumeWith(AbstractC9233X.m9806b(th2));
                }
                c6003g.f19491p0.clear();
                c6003g.f19493r0.set(0);
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m6475c(long j10) {
        Object objM9806b;
        synchronized (this.f19489Z) {
            try {
                ArrayList arrayList = this.f19491p0;
                this.f19491p0 = this.f19492q0;
                this.f19492q0 = arrayList;
                this.f19493r0.set(0);
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    C6001f c6001f = (C6001f) arrayList.get(i10);
                    c6001f.getClass();
                    try {
                        objM9806b = c6001f.f19484a.invoke(Long.valueOf(j10));
                    } catch (Throwable th2) {
                        objM9806b = AbstractC9233X.m9806b(th2);
                    }
                    c6001f.f19485b.resumeWith(objM9806b);
                }
                arrayList.clear();
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // p972qm.InterfaceC18776i
    public final Object fold(Object obj, InterfaceC1439n interfaceC1439n) {
        return interfaceC1439n.invoke(obj, this);
    }

    @Override // p972qm.InterfaceC18776i
    public final InterfaceC18774g get(InterfaceC18775h interfaceC18775h) {
        return AbstractC5695b.m6136c(this, interfaceC18775h);
    }

    @Override // p972qm.InterfaceC18774g
    public final InterfaceC18775h getKey() {
        return C5975S.f19444Z;
    }

    @Override // p972qm.InterfaceC18776i
    public final InterfaceC18776i minusKey(InterfaceC18775h interfaceC18775h) {
        return AbstractC5695b.m6137d(this, interfaceC18775h);
    }

    @Override // p972qm.InterfaceC18776i
    public final InterfaceC18776i plus(InterfaceC18776i interfaceC18776i) {
        return AbstractC5695b.m6138e(this, interfaceC18776i);
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [Bm.a, kotlin.jvm.internal.n] */
    @Override // p349O0.InterfaceC5977T
    /* JADX INFO: renamed from: v0 */
    public final Object mo876v0(InterfaceC1436k interfaceC1436k, AbstractC19687c abstractC19687c) {
        C0624m c0624m = new C0624m(1, AbstractC8154o0.m8714e(abstractC19687c));
        c0624m.m1262r();
        C6001f c6001f = new C6001f(c0624m, interfaceC1436k);
        synchronized (this.f19489Z) {
            Throwable th2 = this.f19490o0;
            if (th2 != null) {
                c0624m.resumeWith(AbstractC9233X.m9806b(th2));
            } else {
                boolean zIsEmpty = this.f19491p0.isEmpty();
                this.f19491p0.add(c6001f);
                if (zIsEmpty) {
                    this.f19493r0.set(1);
                }
                c0624m.m1264u(new C5034f(this, 8, c6001f));
                if (zIsEmpty) {
                    try {
                        this.f19488Y.invoke();
                    } catch (Throwable th3) {
                        m6474b(this, th3);
                    }
                }
            }
        }
        Object objM1261q = c0624m.m1261q();
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        return objM1261q;
    }
}
