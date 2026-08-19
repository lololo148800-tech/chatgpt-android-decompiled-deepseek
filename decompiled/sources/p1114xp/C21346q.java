package p1114xp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16529F;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16525B;
import mm.C17296C;
import p025An.AbstractC0563B;
import p025An.AbstractC0575H;
import p025An.C0564B0;
import p025An.C0569E;
import p025An.C0611f0;
import p049Bm.InterfaceC1439n;
import p153Fn.C2925c;
import p225Im.InterfaceC3756d;
import p315Me.Myis.CxcULo;
import p571X9.AbstractC9233X;
import p571X9.AbstractC9393x3;
import p909nm.AbstractC17680n;
import p972qm.InterfaceC18776i;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;
import sm.InterfaceC19693i;

/* JADX INFO: renamed from: xp.q */
/* JADX INFO: loaded from: classes2.dex */
public final class C21346q {

    /* JADX INFO: renamed from: a */
    public final ArrayList f67807a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f67808b;

    /* JADX INFO: renamed from: c */
    public final C2925c f67809c = AbstractC0575H.m1174c(AbstractC0575H.m1176e());

    /* JADX INFO: renamed from: d */
    public final InterfaceC18776i f67810d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC18776i f67811e;

    public C21346q() {
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        AbstractC16544l.m18093f(executorServiceNewSingleThreadExecutor, "Executors.newSingleThreadExecutor()");
        this.f67810d = new C0611f0(executorServiceNewSingleThreadExecutor).plus(new C0569E("state.sync.sovran.com"));
        ExecutorService executorServiceNewSingleThreadExecutor2 = Executors.newSingleThreadExecutor();
        AbstractC16544l.m18093f(executorServiceNewSingleThreadExecutor2, "Executors.newSingleThreadExecutor()");
        this.f67811e = new C0611f0(executorServiceNewSingleThreadExecutor2).plus(new C0569E("state.update.sovran.com"));
        this.f67807a = new ArrayList();
        this.f67808b = new ArrayList();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m21739a(InterfaceC3756d interfaceC3756d, AbstractC19687c abstractC19687c) {
        C21336g c21336g;
        if (abstractC19687c instanceof C21336g) {
            c21336g = (C21336g) abstractC19687c;
            int i10 = c21336g.f67773Z;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c21336g.f67773Z = i10 - Integer.MIN_VALUE;
            } else {
                c21336g = new C21336g(this, abstractC19687c);
            }
        } else {
            c21336g = new C21336g(this, abstractC19687c);
        }
        Object objM21743e = c21336g.f67772Y;
        Object obj = EnumC19250a.f61036Y;
        int i11 = c21336g.f67773Z;
        if (i11 == 0) {
            AbstractC9233X.m9807c(objM21743e);
            c21336g.f67773Z = 1;
            objM21743e = m21743e(interfaceC3756d, c21336g);
            if (objM21743e == obj) {
                return obj;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(objM21743e);
        }
        List list = (List) objM21743e;
        if (list.isEmpty()) {
            return null;
        }
        InterfaceC21331b interfaceC21331b = ((C21332c) list.get(0)).f67763a;
        if (interfaceC21331b instanceof InterfaceC21331b) {
            return interfaceC21331b;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [Bm.n] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX INFO: renamed from: c */
    public final Object m21741c(List list, InterfaceC21331b interfaceC21331b, AbstractC19687c abstractC19687c) {
        C2925c c2925c;
        Iterator it = list.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            c2925c = this.f67809c;
            if (!zHasNext) {
                break;
            }
            C21333d c21333d = (C21333d) it.next();
            ?? r6 = c21333d.f67767c;
            if (!(r6 instanceof InterfaceC19693i ? AbstractC16529F.m18082f(2, r6) : false)) {
                r6 = 0;
            }
            if (r6 != 0 && c21333d.f67766b.get() != null) {
                AbstractC0575H.m1156D(c2925c, c21333d.f67769e, null, new C21339j(r6, interfaceC21331b, null), 2);
            }
        }
        Object objMo1272P = AbstractC0575H.m1156D(c2925c, this.f67810d, null, new C21335f(this, null), 2).mo1272P(abstractC19687c);
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        C17296C c17296c = C17296C.f55119a;
        if (objMo1272P != enumC19250a) {
            objMo1272P = c17296c;
        }
        return objMo1272P == enumC19250a ? objMo1272P : c17296c;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: d */
    public final Object m21742d(InterfaceC21331b state, AbstractC19687c abstractC19687c) throws Throwable {
        C21340k c21340k;
        C21346q c21346q;
        if (abstractC19687c instanceof C21340k) {
            c21340k = (C21340k) abstractC19687c;
            int i10 = c21340k.f67788Z;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c21340k.f67788Z = i10 - Integer.MIN_VALUE;
            } else {
                c21340k = new C21340k(this, abstractC19687c);
            }
        } else {
            c21340k = new C21340k(this, abstractC19687c);
        }
        Object objM21743e = c21340k.f67787Y;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c21340k.f67788Z;
        C17296C c17296c = C17296C.f55119a;
        if (i11 != 0) {
            if (i11 == 1) {
                state = c21340k.f67791q0;
                c21346q = c21340k.f67790p0;
                AbstractC9233X.m9807c(objM21743e);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(objM21743e);
            }
        }
        AbstractC9233X.m9807c(objM21743e);
        InterfaceC3756d interfaceC3756dMo5693b = AbstractC16526C.f51263a.mo5693b(state.getClass());
        c21340k.f67790p0 = this;
        c21340k.f67791q0 = state;
        c21340k.f67788Z = 1;
        objM21743e = m21743e(interfaceC3756dMo5693b, c21340k);
        if (objM21743e == enumC19250a) {
            return enumC19250a;
        }
        c21346q = this;
        if (!((List) objM21743e).isEmpty()) {
            return c17296c;
        }
        AbstractC16544l.m18094g(state, "state");
        C21332c c21332c = new C21332c();
        c21332c.f67763a = state;
        C0564B0 c0564b0M1156D = AbstractC0575H.m1156D(c21346q.f67809c, c21346q.f67811e, null, new C21341l(c21346q, c21332c, null), 2);
        c21340k.f67790p0 = null;
        c21340k.f67791q0 = null;
        c21340k.f67788Z = 2;
        return c0564b0M1156D.mo1272P(c21340k) == enumC19250a ? enumC19250a : c17296c;
    }

    /* JADX INFO: renamed from: e */
    public final Object m21743e(InterfaceC3756d interfaceC3756d, AbstractC19687c abstractC19687c) throws Throwable {
        C21342m c21342m = new C21342m(this, interfaceC3756d, null);
        Object objM1309u = AbstractC0575H.m1177f(this.f67809c, this.f67811e, c21342m, 2).m1309u(abstractC19687c);
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        return objM1309u;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x009a  */
    /* JADX WARN: Code duplicated, block: B:30:0x00aa A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: f */
    public final Object m21744f(InterfaceC21347r interfaceC21347r, InterfaceC3756d interfaceC3756d, boolean z6, AbstractC0563B abstractC0563B, InterfaceC1439n interfaceC1439n, AbstractC19687c abstractC19687c) {
        C21343n c21343n;
        boolean z10;
        C21333d c21333d;
        InterfaceC3756d interfaceC3756d2;
        C21346q c21346q;
        InterfaceC21331b interfaceC21331b;
        List listM9974d;
        if (abstractC19687c instanceof C21343n) {
            c21343n = (C21343n) abstractC19687c;
            int i10 = c21343n.f67797Z;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c21343n.f67797Z = i10 - Integer.MIN_VALUE;
            } else {
                c21343n = new C21343n(this, abstractC19687c);
            }
        } else {
            c21343n = new C21343n(this, abstractC19687c);
        }
        Object objM21739a = c21343n.f67796Y;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c21343n.f67797Z;
        if (i11 != 0) {
            if (i11 == 1) {
                boolean z11 = c21343n.f67802s0;
                c21333d = c21343n.f67801r0;
                InterfaceC3756d interfaceC3756d3 = (InterfaceC3756d) c21343n.f67800q0;
                C21346q c21346q2 = (C21346q) c21343n.f67799p0;
                AbstractC9233X.m9807c(objM21739a);
                interfaceC3756d2 = interfaceC3756d3;
                c21346q = c21346q2;
                z10 = z11;
            } else if (i11 == 2) {
                c21333d = (C21333d) c21343n.f67800q0;
                c21346q = (C21346q) c21343n.f67799p0;
                AbstractC9233X.m9807c(objM21739a);
                interfaceC21331b = (InterfaceC21331b) objM21739a;
                if (interfaceC21331b != null) {
                    listM9974d = AbstractC9393x3.m9974d(c21333d);
                    c21343n.f67799p0 = c21333d;
                    c21343n.f67800q0 = null;
                    c21343n.f67797Z = 3;
                    if (c21346q.m21741c(listM9974d, interfaceC21331b, c21343n) == enumC19250a) {
                        return enumC19250a;
                    }
                }
            } else {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c21333d = (C21333d) c21343n.f67799p0;
                AbstractC9233X.m9807c(objM21739a);
            }
            return new Integer(c21333d.f67765a);
        }
        AbstractC9233X.m9807c(objM21739a);
        C21333d c21333d2 = new C21333d(interfaceC21347r, interfaceC1439n, interfaceC3756d, abstractC0563B);
        C21344o c21344o = new C21344o(this, c21333d2, null);
        C0564B0 c0564b0M1156D = AbstractC0575H.m1156D(this.f67809c, this.f67810d, null, c21344o, 2);
        c21343n.f67799p0 = this;
        c21343n.f67800q0 = interfaceC3756d;
        c21343n.f67801r0 = c21333d2;
        c21343n.f67802s0 = z6;
        c21343n.f67797Z = 1;
        if (c0564b0M1156D.mo1272P(c21343n) == enumC19250a) {
            return enumC19250a;
        }
        z10 = z6;
        c21333d = c21333d2;
        interfaceC3756d2 = interfaceC3756d;
        c21346q = this;
        if (z10) {
            c21343n.f67799p0 = c21346q;
            c21343n.f67800q0 = c21333d;
            c21343n.f67801r0 = null;
            c21343n.f67797Z = 2;
            objM21739a = c21346q.m21739a(interfaceC3756d2, c21343n);
            if (objM21739a == enumC19250a) {
                return enumC19250a;
            }
            interfaceC21331b = (InterfaceC21331b) objM21739a;
            if (interfaceC21331b != null) {
                listM9974d = AbstractC9393x3.m9974d(c21333d);
                c21343n.f67799p0 = c21333d;
                c21343n.f67800q0 = null;
                c21343n.f67797Z = 3;
                if (c21346q.m21741c(listM9974d, interfaceC21331b, c21343n) == enumC19250a) {
                    return enumC19250a;
                }
            }
        }
        return new Integer(c21333d.f67765a);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00d0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:41:0x00e3 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m21740b(InterfaceC21330a interfaceC21330a, InterfaceC3756d interfaceC3756d, AbstractC19687c abstractC19687c) throws Throwable {
        C21337h c21337h;
        C21346q c21346q;
        InterfaceC3756d interfaceC3756d2;
        C21346q c21346q2;
        C16525B c16525b;
        InterfaceC21331b interfaceC21331b;
        if (abstractC19687c instanceof C21337h) {
            c21337h = (C21337h) abstractC19687c;
            int i10 = c21337h.f67776Z;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c21337h.f67776Z = i10 - Integer.MIN_VALUE;
            } else {
                c21337h = new C21337h(this, abstractC19687c);
            }
        } else {
            c21337h = new C21337h(this, abstractC19687c);
        }
        Object objM21743e = c21337h.f67775Y;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c21337h.f67776Z;
        C17296C c17296c = C17296C.f55119a;
        if (i11 != 0) {
            if (i11 == 1) {
                interfaceC3756d = (InterfaceC3756d) c21337h.f67780r0;
                interfaceC21330a = (InterfaceC21330a) c21337h.f67779q0;
                c21346q = c21337h.f67778p0;
                AbstractC9233X.m9807c(objM21743e);
            } else if (i11 == 2) {
                c16525b = (C16525B) c21337h.f67780r0;
                InterfaceC3756d interfaceC3756d3 = (InterfaceC3756d) c21337h.f67779q0;
                C21346q c21346q3 = c21337h.f67778p0;
                AbstractC9233X.m9807c(objM21743e);
                interfaceC3756d2 = interfaceC3756d3;
                c21346q2 = c21346q3;
                c21337h.f67778p0 = c21346q2;
                c21337h.f67779q0 = c16525b;
                c21337h.f67780r0 = null;
                c21337h.f67776Z = 3;
                objM21743e = AbstractC0575H.m1177f(c21346q2.f67809c, c21346q2.f67810d, new C21345p(c21346q2, interfaceC3756d2, null), 2).m1309u(c21337h);
                if (objM21743e == enumC19250a) {
                    return enumC19250a;
                }
                interfaceC21331b = (InterfaceC21331b) c16525b.f51262Y;
                c21337h.f67778p0 = null;
                c21337h.f67779q0 = null;
                c21337h.f67776Z = 4;
                if (c21346q2.m21741c((List) objM21743e, interfaceC21331b, c21337h) == enumC19250a) {
                    return enumC19250a;
                }
            } else if (i11 == 3) {
                c16525b = (C16525B) c21337h.f67779q0;
                c21346q2 = c21337h.f67778p0;
                AbstractC9233X.m9807c(objM21743e);
                interfaceC21331b = (InterfaceC21331b) c16525b.f51262Y;
                c21337h.f67778p0 = null;
                c21337h.f67779q0 = null;
                c21337h.f67776Z = 4;
                if (c21346q2.m21741c((List) objM21743e, interfaceC21331b, c21337h) == enumC19250a) {
                    return enumC19250a;
                }
            } else {
                if (i11 != 4) {
                    throw new IllegalStateException(CxcULo.lQIGoxpJiMZLRt);
                }
                AbstractC9233X.m9807c(objM21743e);
            }
            return c17296c;
        }
        AbstractC9233X.m9807c(objM21743e);
        c21337h.f67778p0 = this;
        c21337h.f67779q0 = interfaceC21330a;
        c21337h.f67780r0 = interfaceC3756d;
        c21337h.f67776Z = 1;
        objM21743e = m21743e(interfaceC3756d, c21337h);
        if (objM21743e == enumC19250a) {
            return enumC19250a;
        }
        c21346q = this;
        C21332c c21332c = (C21332c) AbstractC17680n.m19343S((List) objM21743e);
        C16525B c16525b2 = new C16525B();
        InterfaceC21331b interfaceC21331b2 = c21332c != null ? c21332c.f67763a : null;
        if (!(interfaceC21331b2 instanceof InterfaceC21331b)) {
            interfaceC21331b2 = null;
        }
        if (interfaceC21331b2 != null) {
            c16525b2.f51262Y = interfaceC21331b2;
            C0564B0 c0564b0M1156D = AbstractC0575H.m1156D(c21346q.f67809c, c21346q.f67811e, null, new C21338i(c16525b2, interfaceC21330a, c21332c, null), 2);
            c21337h.f67778p0 = c21346q;
            c21337h.f67779q0 = interfaceC3756d;
            c21337h.f67780r0 = c16525b2;
            c21337h.f67776Z = 2;
            if (c0564b0M1156D.mo1272P(c21337h) == enumC19250a) {
                return enumC19250a;
            }
            interfaceC3756d2 = interfaceC3756d;
            c21346q2 = c21346q;
            c16525b = c16525b2;
            c21337h.f67778p0 = c21346q2;
            c21337h.f67779q0 = c16525b;
            c21337h.f67780r0 = null;
            c21337h.f67776Z = 3;
            objM21743e = AbstractC0575H.m1177f(c21346q2.f67809c, c21346q2.f67810d, new C21345p(c21346q2, interfaceC3756d2, null), 2).m1309u(c21337h);
            if (objM21743e == enumC19250a) {
                return enumC19250a;
            }
            interfaceC21331b = (InterfaceC21331b) c16525b.f51262Y;
            c21337h.f67778p0 = null;
            c21337h.f67779q0 = null;
            c21337h.f67776Z = 4;
            if (c21346q2.m21741c((List) objM21743e, interfaceC21331b, c21337h) == enumC19250a) {
                return enumC19250a;
            }
        }
        return c17296c;
    }
}
