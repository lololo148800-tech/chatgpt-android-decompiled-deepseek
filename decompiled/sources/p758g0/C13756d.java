package p758g0;

import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p349O0.C5975S;
import p349O0.C5997d;
import p349O0.C6002f0;
import p530Vi.AbstractC8301I;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: g0.d */
/* JADX INFO: loaded from: classes.dex */
public final class C13756d {

    /* JADX INFO: renamed from: a */
    public final C13783q0 f43409a;

    /* JADX INFO: renamed from: b */
    public final Object f43410b;

    /* JADX INFO: renamed from: c */
    public final C13774m f43411c;

    /* JADX INFO: renamed from: d */
    public final C6002f0 f43412d;

    /* JADX INFO: renamed from: e */
    public final C6002f0 f43413e;

    /* JADX INFO: renamed from: f */
    public Float f43414f;

    /* JADX INFO: renamed from: g */
    public final C13743T f43415g;

    /* JADX INFO: renamed from: h */
    public final C13746W f43416h;

    /* JADX INFO: renamed from: i */
    public final AbstractC13784r f43417i;

    /* JADX INFO: renamed from: j */
    public final AbstractC13784r f43418j;

    /* JADX INFO: renamed from: k */
    public AbstractC13784r f43419k;

    /* JADX INFO: renamed from: l */
    public AbstractC13784r f43420l;

    public C13756d(Object obj, C13783q0 c13783q0, Object obj2) {
        this.f43409a = c13783q0;
        this.f43410b = obj2;
        C13774m c13774m = new C13774m(c13783q0, obj, null, 60);
        this.f43411c = c13774m;
        Boolean bool = Boolean.FALSE;
        C5975S c5975s = C5975S.f19448r0;
        this.f43412d = C5997d.m6430Q(bool, c5975s);
        this.f43413e = C5997d.m6430Q(obj, c5975s);
        this.f43415g = new C13743T();
        this.f43416h = new C13746W(obj2);
        AbstractC13784r abstractC13784r = c13774m.f43503o0;
        boolean z6 = abstractC13784r instanceof C13776n;
        AbstractC13784r abstractC13784r2 = z6 ? AbstractC13758e.f43434e : abstractC13784r instanceof C13778o ? AbstractC13758e.f43435f : abstractC13784r instanceof C13780p ? AbstractC13758e.f43436g : AbstractC13758e.f43437h;
        this.f43417i = abstractC13784r2;
        AbstractC13784r abstractC13784r3 = z6 ? AbstractC13758e.f43430a : abstractC13784r instanceof C13778o ? AbstractC13758e.f43431b : abstractC13784r instanceof C13780p ? AbstractC13758e.f43432c : AbstractC13758e.f43433d;
        this.f43418j = abstractC13784r3;
        this.f43419k = abstractC13784r2;
        this.f43420l = abstractC13784r3;
    }

    /* JADX INFO: renamed from: a */
    public static final void m15220a(C13756d c13756d) {
        C13774m c13774m = c13756d.f43411c;
        c13774m.f43503o0.mo15286d();
        c13774m.f43504p0 = Long.MIN_VALUE;
        c13756d.f43412d.setValue(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: b */
    public static Object m15221b(C13756d c13756d, Float f10, C13796x c13796x, AbstractC19694j abstractC19694j) {
        Object objM15224e = c13756d.m15224e();
        C13783q0 c13783q0 = c13756d.f43409a;
        return C13743T.m15218a(c13756d.f43415g, new C13750a(c13756d, f10, new C13794w(c13796x, c13783q0, objM15224e, (AbstractC13784r) c13783q0.f43526a.invoke(f10)), c13756d.f43411c.f43504p0, null, null), abstractC19694j);
    }

    /* JADX INFO: renamed from: c */
    public static Object m15222c(C13756d c13756d, Object obj, InterfaceC13772l interfaceC13772l, InterfaceC1436k interfaceC1436k, InterfaceC18770c interfaceC18770c, int i10) {
        if ((i10 & 2) != 0) {
            interfaceC13772l = c13756d.f43416h;
        }
        InterfaceC13772l interfaceC13772l2 = interfaceC13772l;
        Object objInvoke = c13756d.f43409a.f43527b.invoke(c13756d.f43411c.f43503o0);
        if ((i10 & 8) != 0) {
            interfaceC1436k = null;
        }
        Object objM15224e = c13756d.m15224e();
        C13783q0 c13783q0 = c13756d.f43409a;
        return C13743T.m15218a(c13756d.f43415g, new C13750a(c13756d, objInvoke, new C13757d0(interfaceC13772l2, c13783q0, objM15224e, obj, (AbstractC13784r) c13783q0.f43526a.invoke(objInvoke)), c13756d.f43411c.f43504p0, interfaceC1436k, null), interfaceC18770c);
    }

    /* JADX INFO: renamed from: d */
    public final Object m15223d(Object obj) {
        if (AbstractC16544l.m18089b(this.f43419k, this.f43417i) && AbstractC16544l.m18089b(this.f43420l, this.f43418j)) {
            return obj;
        }
        C13783q0 c13783q0 = this.f43409a;
        AbstractC13784r abstractC13784r = (AbstractC13784r) c13783q0.f43526a.invoke(obj);
        int iMo15284b = abstractC13784r.mo15284b();
        boolean z6 = false;
        for (int i10 = 0; i10 < iMo15284b; i10++) {
            if (abstractC13784r.mo15283a(i10) < this.f43419k.mo15283a(i10) || abstractC13784r.mo15283a(i10) > this.f43420l.mo15283a(i10)) {
                abstractC13784r.mo15287e(i10, AbstractC8301I.m8920k(abstractC13784r.mo15283a(i10), this.f43419k.mo15283a(i10), this.f43420l.mo15283a(i10)));
                z6 = true;
            }
        }
        return z6 ? c13783q0.f43527b.invoke(abstractC13784r) : obj;
    }

    /* JADX INFO: renamed from: e */
    public final Object m15224e() {
        return this.f43411c.f43502Z.getValue();
    }

    /* JADX INFO: renamed from: f */
    public final boolean m15225f() {
        return ((Boolean) this.f43412d.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: g */
    public final Object m15226g(Object obj, InterfaceC18770c interfaceC18770c) {
        Object objM15218a = C13743T.m15218a(this.f43415g, new C13752b(this, obj, null), interfaceC18770c);
        return objM15218a == EnumC19250a.f61036Y ? objM15218a : C17296C.f55119a;
    }

    /* JADX INFO: renamed from: h */
    public final Object m15227h(AbstractC19694j abstractC19694j) {
        Object objM15218a = C13743T.m15218a(this.f43415g, new C13754c(this, null), abstractC19694j);
        return objM15218a == EnumC19250a.f61036Y ? objM15218a : C17296C.f55119a;
    }

    /* JADX INFO: renamed from: i */
    public final void m15228i(Float f10, Float f11) {
        C13783q0 c13783q0 = this.f43409a;
        AbstractC13784r abstractC13784r = (AbstractC13784r) c13783q0.f43526a.invoke(f10);
        if (abstractC13784r == null) {
            abstractC13784r = this.f43417i;
        }
        AbstractC13784r abstractC13784r2 = (AbstractC13784r) c13783q0.f43526a.invoke(f11);
        if (abstractC13784r2 == null) {
            abstractC13784r2 = this.f43418j;
        }
        int iMo15284b = abstractC13784r.mo15284b();
        for (int i10 = 0; i10 < iMo15284b; i10++) {
            if (abstractC13784r.mo15283a(i10) > abstractC13784r2.mo15283a(i10)) {
                throw new IllegalStateException("Lower bound must be no greater than upper bound on *all* dimensions. The provided lower bound: " + abstractC13784r + " is greater than upper bound " + abstractC13784r2 + " on index " + i10);
            }
        }
        this.f43419k = abstractC13784r;
        this.f43420l = abstractC13784r2;
        this.f43414f = f11;
        if (m15225f()) {
            return;
        }
        Object objM15223d = m15223d(m15224e());
        if (AbstractC16544l.m18089b(objM15223d, m15224e())) {
            return;
        }
        this.f43411c.f43502Z.setValue(objM15223d);
    }

    public /* synthetic */ C13756d(Object obj, C13783q0 c13783q0, Object obj2, int i10) {
        this(obj, c13783q0, (i10 & 4) != 0 ? null : obj2);
    }
}
