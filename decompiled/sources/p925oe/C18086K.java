package p925oe;

import gd.InterfaceC13849E;
import mm.C17296C;
import mm.C17314q;
import p016Ae.C0452n;
import p086D6.C1970n;
import p094De.C2021d;
import p094De.C2029l;
import p1155zi.AbstractC21933K1;
import p1155zi.AbstractC21955Q1;
import p1155zi.C21952P1;
import p275Kn.AbstractC4817d;
import p275Kn.C4816c;
import p275Kn.InterfaceC4814a;
import p324Mn.C5551u;
import p571X9.AbstractC9227W;
import p571X9.AbstractC9233X;
import p625Zh.C10396b;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: oe.K */
/* JADX INFO: loaded from: classes3.dex */
public final class C18086K {

    /* JADX INFO: renamed from: a */
    public final C0452n f57695a;

    /* JADX INFO: renamed from: b */
    public final C2029l f57696b;

    /* JADX INFO: renamed from: c */
    public final C10396b f57697c;

    /* JADX INFO: renamed from: d */
    public final C18127p f57698d;

    /* JADX INFO: renamed from: e */
    public final C17314q f57699e;

    /* JADX INFO: renamed from: f */
    public final C1970n f57700f;

    /* JADX INFO: renamed from: g */
    public final C4816c f57701g = AbstractC4817d.m5451a();

    /* JADX INFO: renamed from: h */
    public C18078C f57702h = C18078C.f57659c;

    public C18086K(C0452n c0452n, C2029l c2029l, C10396b c10396b, C18127p c18127p, InterfaceC13849E interfaceC13849E) {
        this.f57695a = c0452n;
        this.f57696b = c2029l;
        this.f57697c = c10396b;
        this.f57698d = c18127p;
        this.f57699e = AbstractC9227W.m9800c(new C2021d(interfaceC13849E, 1));
        this.f57700f = new C1970n(c2029l.f6232e, 24, this);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0073  */
    /* JADX WARN: Code duplicated, block: B:33:0x0076  */
    /* JADX WARN: Code duplicated, block: B:35:0x0084 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:36:0x0085  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m19705a(AbstractC19687c abstractC19687c) throws Throwable {
        C18079D c18079d;
        C18086K c18086k;
        AbstractC21955Q1 abstractC21955Q1;
        C4816c c4816c;
        InterfaceC4814a interfaceC4814a;
        C18086K c18086k2;
        if (abstractC19687c instanceof C18079D) {
            c18079d = (C18079D) abstractC19687c;
            int i10 = c18079d.f57666q0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c18079d.f57666q0 = i10 - Integer.MIN_VALUE;
            } else {
                c18079d = new C18079D(this, abstractC19687c);
            }
        } else {
            c18079d = new C18079D(this, abstractC19687c);
        }
        Object objM1094b = c18079d.f57664o0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c18079d.f57666q0;
        if (i11 != 0) {
            if (i11 == 1) {
                c18086k = c18079d.f57662Y;
                AbstractC9233X.m9807c(objM1094b);
            } else if (i11 == 2) {
                c18086k = c18079d.f57662Y;
                AbstractC9233X.m9807c(objM1094b);
                abstractC21955Q1 = (AbstractC21955Q1) objM1094b;
                if (abstractC21955Q1 instanceof AbstractC21933K1) {
                    return (AbstractC21933K1) abstractC21955Q1;
                }
                c4816c = c18086k.f57701g;
                c18079d.f57662Y = c18086k;
                c18079d.f57663Z = c4816c;
                c18079d.f57666q0 = 3;
                if (c4816c.m5448e(null, c18079d) == enumC19250a) {
                    return enumC19250a;
                }
                interfaceC4814a = c4816c;
                c18086k2 = c18086k;
            } else {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC4814a = c18079d.f57663Z;
                c18086k2 = c18079d.f57662Y;
                AbstractC9233X.m9807c(objM1094b);
            }
            try {
                c18086k2.f57702h = C18078C.f57659c;
                return new C21952P1(C17296C.f55119a);
            } finally {
                ((C4816c) interfaceC4814a).m5450g(null);
            }
        }
        AbstractC9233X.m9807c(objM1094b);
        c18079d.f57662Y = this;
        c18079d.f57666q0 = 1;
        objM1094b = this.f57695a.m1094b(c18079d);
        if (objM1094b == enumC19250a) {
            return enumC19250a;
        }
        c18086k = this;
        AbstractC21955Q1 abstractC21955Q2 = (AbstractC21955Q1) objM1094b;
        if (abstractC21955Q2 instanceof AbstractC21933K1) {
            return (AbstractC21933K1) abstractC21955Q2;
        }
        C2029l c2029l = c18086k.f57696b;
        c18079d.f57662Y = c18086k;
        c18079d.f57666q0 = 2;
        objM1094b = c2029l.m3174c(c18079d);
        if (objM1094b == enumC19250a) {
            return enumC19250a;
        }
        abstractC21955Q1 = (AbstractC21955Q1) objM1094b;
        if (abstractC21955Q1 instanceof AbstractC21933K1) {
            return (AbstractC21933K1) abstractC21955Q1;
        }
        c4816c = c18086k.f57701g;
        c18079d.f57662Y = c18086k;
        c18079d.f57663Z = c4816c;
        c18079d.f57666q0 = 3;
        if (c4816c.m5448e(null, c18079d) == enumC19250a) {
            return enumC19250a;
        }
        interfaceC4814a = c4816c;
        c18086k2 = c18086k;
        c18086k2.f57702h = C18078C.f57659c;
        return new C21952P1(C17296C.f55119a);
    }

    /* JADX WARN: Failed to calculate best type for var: r15v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r15v1 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r15v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r15v2 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r15v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r15v3 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:102:0x0226 -> B:104:0x0229). Please report as a decompilation issue!!! */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r16v2 ??, new type: boolean
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException
        */
    /* JADX INFO: renamed from: b */
    public final java.lang.Object m19706b(sm.AbstractC19687c r18) {
        /*
            Method dump skipped, instruction units count: 607
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p925oe.C18086K.m19706b(sm.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public final Object m19707c(AbstractC19687c abstractC19687c) throws Throwable {
        C18082G c18082g;
        C4816c c4816c;
        C18086K c18086k;
        InterfaceC4814a interfaceC4814a;
        Throwable th2;
        if (abstractC19687c instanceof C18082G) {
            c18082g = (C18082G) abstractC19687c;
            int i10 = c18082g.f57681q0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c18082g.f57681q0 = i10 - Integer.MIN_VALUE;
            } else {
                c18082g = new C18082G(this, abstractC19687c);
            }
        } else {
            c18082g = new C18082G(this, abstractC19687c);
        }
        Object obj = c18082g.f57679o0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c18082g.f57681q0;
        try {
            if (i11 == 0) {
                AbstractC9233X.m9807c(obj);
                c18082g.f57677Y = this;
                c4816c = this.f57701g;
                c18082g.f57678Z = c4816c;
                c18082g.f57681q0 = 1;
                if (c4816c.m5448e(null, c18082g) == enumC19250a) {
                    return enumC19250a;
                }
                c18086k = this;
            } else {
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    interfaceC4814a = (InterfaceC4814a) c18082g.f57677Y;
                    try {
                        AbstractC9233X.m9807c(obj);
                        AbstractC21955Q1 abstractC21955Q1 = (AbstractC21955Q1) obj;
                        ((C4816c) interfaceC4814a).m5450g(null);
                        return abstractC21955Q1;
                    } catch (Throwable th3) {
                        th2 = th3;
                        ((C4816c) interfaceC4814a).m5450g(null);
                        throw th2;
                    }
                }
                C4816c c4816c2 = c18082g.f57678Z;
                c18086k = (C18086K) c18082g.f57677Y;
                AbstractC9233X.m9807c(obj);
                c4816c = c4816c2;
            }
            c18086k.f57702h = C18078C.f57659c;
            c18082g.f57677Y = c4816c;
            c18082g.f57678Z = null;
            c18082g.f57681q0 = 2;
            Object objM19706b = c18086k.m19706b(c18082g);
            if (objM19706b == enumC19250a) {
                return enumC19250a;
            }
            interfaceC4814a = c4816c;
            obj = objM19706b;
            AbstractC21955Q1 abstractC21955Q2 = (AbstractC21955Q1) obj;
            ((C4816c) interfaceC4814a).m5450g(null);
            return abstractC21955Q2;
        } catch (Throwable th4) {
            interfaceC4814a = c4816c;
            th2 = th4;
            ((C4816c) interfaceC4814a).m5450g(null);
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0073  */
    /* JADX WARN: Code duplicated, block: B:33:0x0076  */
    /* JADX WARN: Code duplicated, block: B:35:0x0084 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:36:0x0085  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: d */
    public final Object m19708d(AbstractC19687c abstractC19687c) throws Throwable {
        C18083H c18083h;
        C18086K c18086k;
        AbstractC21955Q1 abstractC21955Q1;
        C4816c c4816c;
        InterfaceC4814a interfaceC4814a;
        C18086K c18086k2;
        if (abstractC19687c instanceof C18083H) {
            c18083h = (C18083H) abstractC19687c;
            int i10 = c18083h.f57686q0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c18083h.f57686q0 = i10 - Integer.MIN_VALUE;
            } else {
                c18083h = new C18083H(this, abstractC19687c);
            }
        } else {
            c18083h = new C18083H(this, abstractC19687c);
        }
        Object objM1097e = c18083h.f57684o0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c18083h.f57686q0;
        if (i11 != 0) {
            if (i11 == 1) {
                c18086k = c18083h.f57682Y;
                AbstractC9233X.m9807c(objM1097e);
            } else if (i11 == 2) {
                c18086k = c18083h.f57682Y;
                AbstractC9233X.m9807c(objM1097e);
                abstractC21955Q1 = (AbstractC21955Q1) objM1097e;
                if (abstractC21955Q1 instanceof AbstractC21933K1) {
                    return (AbstractC21933K1) abstractC21955Q1;
                }
                c4816c = c18086k.f57701g;
                c18083h.f57682Y = c18086k;
                c18083h.f57683Z = c4816c;
                c18083h.f57686q0 = 3;
                if (c4816c.m5448e(null, c18083h) == enumC19250a) {
                    return enumC19250a;
                }
                interfaceC4814a = c4816c;
                c18086k2 = c18086k;
            } else {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC4814a = c18083h.f57683Z;
                c18086k2 = c18083h.f57682Y;
                AbstractC9233X.m9807c(objM1097e);
            }
            try {
                c18086k2.f57702h = C18078C.f57659c;
                return new C21952P1(C17296C.f55119a);
            } finally {
                ((C4816c) interfaceC4814a).m5450g(null);
            }
        }
        AbstractC9233X.m9807c(objM1097e);
        c18083h.f57682Y = this;
        c18083h.f57686q0 = 1;
        objM1097e = this.f57695a.m1097e(c18083h);
        if (objM1097e == enumC19250a) {
            return enumC19250a;
        }
        c18086k = this;
        AbstractC21955Q1 abstractC21955Q2 = (AbstractC21955Q1) objM1097e;
        if (abstractC21955Q2 instanceof AbstractC21933K1) {
            return (AbstractC21933K1) abstractC21955Q2;
        }
        C2029l c2029l = c18086k.f57696b;
        c18083h.f57682Y = c18086k;
        c18083h.f57686q0 = 2;
        objM1097e = c2029l.m3174c(c18083h);
        if (objM1097e == enumC19250a) {
            return enumC19250a;
        }
        abstractC21955Q1 = (AbstractC21955Q1) objM1097e;
        if (abstractC21955Q1 instanceof AbstractC21933K1) {
            return (AbstractC21933K1) abstractC21955Q1;
        }
        c4816c = c18086k.f57701g;
        c18083h.f57682Y = c18086k;
        c18083h.f57683Z = c4816c;
        c18083h.f57686q0 = 3;
        if (c4816c.m5448e(null, c18083h) == enumC19250a) {
            return enumC19250a;
        }
        interfaceC4814a = c4816c;
        c18086k2 = c18086k;
        c18086k2.f57702h = C18078C.f57659c;
        return new C21952P1(C17296C.f55119a);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [Mn.u] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX INFO: renamed from: e */
    public final Object m19709e(C5551u c5551u, AbstractC19687c abstractC19687c) {
        C18085J c18085j;
        C18086K c18086k;
        C4816c c4816c;
        if (abstractC19687c instanceof C18085J) {
            c18085j = (C18085J) abstractC19687c;
            int i10 = c18085j.f57694q0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c18085j.f57694q0 = i10 - Integer.MIN_VALUE;
            } else {
                c18085j = new C18085J(this, abstractC19687c);
            }
        } else {
            c18085j = new C18085J(this, abstractC19687c);
        }
        Object objM19706b = c18085j.f57692o0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c18085j.f57694q0;
        try {
            if (i11 != 0) {
                if (i11 == 1) {
                    C4816c c4816c2 = c18085j.f57691Z;
                    c18086k = (C18086K) c18085j.f57690Y;
                    AbstractC9233X.m9807c(objM19706b);
                    c4816c = c4816c2;
                } else {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    InterfaceC4814a interfaceC4814a = (InterfaceC4814a) c18085j.f57690Y;
                    AbstractC9233X.m9807c(objM19706b);
                    c5551u = interfaceC4814a;
                }
                AbstractC21955Q1 abstractC21955Q1 = (AbstractC21955Q1) objM19706b;
                ((C4816c) c5551u).m5450g(null);
                return abstractC21955Q1;
            }
            AbstractC9233X.m9807c(objM19706b);
            if (c5551u != 0 && c5551u.compareTo(this.f57702h.f57661b) > 0) {
                return new C21952P1(Boolean.TRUE);
            }
            c18085j.f57690Y = this;
            C4816c c4816c3 = this.f57701g;
            c18085j.f57691Z = c4816c3;
            c18085j.f57694q0 = 1;
            if (c4816c3.m5448e(null, c18085j) == enumC19250a) {
                return enumC19250a;
            }
            c18086k = this;
            c4816c = c4816c3;
            c18085j.f57690Y = c4816c;
            c18085j.f57691Z = null;
            c18085j.f57694q0 = 2;
            objM19706b = c18086k.m19706b(c18085j);
            c5551u = c4816c;
            if (objM19706b == enumC19250a) {
                return enumC19250a;
            }
            AbstractC21955Q1 abstractC21955Q2 = (AbstractC21955Q1) objM19706b;
            ((C4816c) c5551u).m5450g(null);
            return abstractC21955Q2;
        } catch (Throwable th2) {
            ((C4816c) c5551u).m5450g(null);
            throw th2;
        }
    }
}
