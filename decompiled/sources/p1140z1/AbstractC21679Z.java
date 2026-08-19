package p1140z1;

import androidx.compose.p650ui.focus.C10863b;
import p1014t1.C19742s;
import p1052v1.C20418a;
import p1095x1.InterfaceC21063Q;
import p1095x1.InterfaceC21066U;
import p1095x1.InterfaceC21102w;
import p1117y1.InterfaceC21363c;
import p1117y1.InterfaceC21365e;
import p1117y1.InterfaceC21366f;
import p156G1.InterfaceC2964k;
import p392Q0.C6546d;
import p523V9.AbstractC8111i5;
import p635a1.AbstractC10458p;
import p635a1.InterfaceC10457o;
import p692d0.AbstractC12955H;
import p692d0.C12948A;
import p715e1.InterfaceC13259e;
import p737f1.C13513e;
import p737f1.C13526r;
import p737f1.InterfaceC13511c;
import p737f1.InterfaceC13520l;
import p978r1.InterfaceC18858d;

/* JADX INFO: renamed from: z1.Z */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC21679Z {

    /* JADX INFO: renamed from: a */
    public static final C12948A f68822a;

    static {
        C12948A c12948a = AbstractC12955H.f41148a;
        f68822a = new C12948A();
    }

    /* JADX INFO: renamed from: a */
    public static final void m22184a(AbstractC10458p abstractC10458p) {
        if (abstractC10458p.f30972y0) {
            m22185b(abstractC10458p, -1, 1);
        } else {
            AbstractC8111i5.m8592c("autoInvalidateInsertedNode called on unattached node");
            throw null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m22185b(AbstractC10458p abstractC10458p, int i10, int i11) {
        if (!(abstractC10458p instanceof AbstractC21706n)) {
            m22186c(abstractC10458p, i10 & abstractC10458p.f30962o0, i11);
            return;
        }
        AbstractC21706n abstractC21706n = (AbstractC21706n) abstractC10458p;
        m22186c(abstractC10458p, abstractC21706n.f68882z0 & i10, i11);
        int i12 = (~abstractC21706n.f68882z0) & i10;
        for (AbstractC10458p abstractC10458p2 = abstractC21706n.f68881A0; abstractC10458p2 != null; abstractC10458p2 = abstractC10458p2.f30965r0) {
            m22185b(abstractC10458p2, i12, i11);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: c */
    public static final void m22186c(AbstractC10458p abstractC10458p, int i10, int i11) {
        if (i11 != 0 || abstractC10458p.mo4774z0()) {
            if ((i10 & 2) != 0 && (abstractC10458p instanceof InterfaceC21718w)) {
                AbstractC21690f.m22210o((InterfaceC21718w) abstractC10458p);
                if (i11 == 2) {
                    AbstractC21678Y abstractC21678YM22215t = AbstractC21690f.m22215t(abstractC10458p, 2);
                    abstractC21678YM22215t.f68802A0 = true;
                    abstractC21678YM22215t.f68815N0.invoke();
                    if (abstractC21678YM22215t.f68817P0 != null) {
                        if (abstractC21678YM22215t.f68818Q0 != null) {
                            abstractC21678YM22215t.f68818Q0 = null;
                        }
                        abstractC21678YM22215t.m22179e1(null, false);
                        abstractC21678YM22215t.f68819x0.m22058r0(false);
                    }
                }
            }
            if ((i10 & 128) != 0 && (abstractC10458p instanceof InterfaceC21717v) && i11 != 2) {
                AbstractC21690f.m22217v(abstractC10458p).m22019Q();
            }
            if ((i10 & 256) != 0 && (abstractC10458p instanceof InterfaceC21710p) && i11 != 2) {
                AbstractC21690f.m22217v(abstractC10458p).m22020R();
            }
            if ((i10 & 4) != 0 && (abstractC10458p instanceof InterfaceC21708o)) {
                AbstractC21690f.m22209n((InterfaceC21708o) abstractC10458p);
            }
            if ((i10 & 8) != 0 && (abstractC10458p instanceof InterfaceC21701k0)) {
                AbstractC21690f.m22211p((InterfaceC21701k0) abstractC10458p);
            }
            if ((i10 & 64) != 0 && (abstractC10458p instanceof InterfaceC21693g0)) {
                AbstractC21690f.m22217v((InterfaceC21693g0) abstractC10458p).m22021S();
            }
            if ((i10 & 1024) != 0 && (abstractC10458p instanceof C13526r) && i11 != 2) {
                C13526r c13526r = (C13526r) abstractC10458p;
                C13513e c13513e = ((C10863b) AbstractC21690f.m22218w(c13526r).getFocusOwner()).f32699g;
                c13513e.m15067b(c13513e.f42778c, c13526r);
            }
            if ((i10 & 2048) != 0 && (abstractC10458p instanceof InterfaceC13520l)) {
                InterfaceC13520l interfaceC13520l = (InterfaceC13520l) abstractC10458p;
                C21692g.f68856b = null;
                interfaceC13520l.mo9604g0(C21692g.f68855a);
                if (C21692g.f68856b != null) {
                    if (i11 == 2) {
                        AbstractC10458p abstractC10458p2 = ((AbstractC10458p) interfaceC13520l).f30960Y;
                        if (!abstractC10458p2.f30972y0) {
                            throw new IllegalStateException("visitChildren called on an unattached node");
                        }
                        C6546d c6546d = new C6546d(new AbstractC10458p[16]);
                        AbstractC10458p abstractC10458p3 = abstractC10458p2.f30965r0;
                        if (abstractC10458p3 == null) {
                            AbstractC21690f.m22197b(c6546d, abstractC10458p2);
                        } else {
                            c6546d.m7099c(abstractC10458p3);
                        }
                        while (c6546d.m7109n()) {
                            AbstractC10458p abstractC10458pM22201f = (AbstractC10458p) c6546d.m7111p(c6546d.f21184o0 - 1);
                            if ((abstractC10458pM22201f.f30963p0 & 1024) == 0) {
                                AbstractC21690f.m22197b(c6546d, abstractC10458pM22201f);
                            } else {
                                while (abstractC10458pM22201f != null) {
                                    if ((abstractC10458pM22201f.f30962o0 & 1024) != 0) {
                                        C6546d c6546d2 = null;
                                        while (abstractC10458pM22201f != null) {
                                            if (abstractC10458pM22201f instanceof C13526r) {
                                                C13526r c13526r2 = (C13526r) abstractC10458pM22201f;
                                                C13513e c13513e2 = ((C10863b) AbstractC21690f.m22218w(c13526r2).getFocusOwner()).f32699g;
                                                c13513e2.m15067b(c13513e2.f42778c, c13526r2);
                                            } else if ((abstractC10458pM22201f.f30962o0 & 1024) != 0 && (abstractC10458pM22201f instanceof AbstractC21706n)) {
                                                int i12 = 0;
                                                for (AbstractC10458p abstractC10458p4 = ((AbstractC21706n) abstractC10458pM22201f).f68881A0; abstractC10458p4 != null; abstractC10458p4 = abstractC10458p4.f30965r0) {
                                                    if ((abstractC10458p4.f30962o0 & 1024) != 0) {
                                                        i12++;
                                                        if (i12 == 1) {
                                                            abstractC10458pM22201f = abstractC10458p4;
                                                        } else {
                                                            if (c6546d2 == null) {
                                                                c6546d2 = new C6546d(new AbstractC10458p[16]);
                                                            }
                                                            if (abstractC10458pM22201f != null) {
                                                                c6546d2.m7099c(abstractC10458pM22201f);
                                                                abstractC10458pM22201f = null;
                                                            }
                                                            c6546d2.m7099c(abstractC10458p4);
                                                        }
                                                    }
                                                }
                                                if (i12 == 1) {
                                                }
                                            }
                                            abstractC10458pM22201f = AbstractC21690f.m22201f(c6546d2);
                                        }
                                        break;
                                    }
                                    abstractC10458pM22201f = abstractC10458pM22201f.f30965r0;
                                }
                            }
                        }
                    } else {
                        C13513e c13513e3 = ((C10863b) AbstractC21690f.m22218w(interfaceC13520l).getFocusOwner()).f32699g;
                        c13513e3.m15067b(c13513e3.f42780e, interfaceC13520l);
                    }
                }
            }
            if ((i10 & 4096) == 0 || !(abstractC10458p instanceof InterfaceC13511c)) {
                return;
            }
            InterfaceC13511c interfaceC13511c = (InterfaceC13511c) abstractC10458p;
            C13513e c13513e4 = ((C10863b) AbstractC21690f.m22218w(interfaceC13511c).getFocusOwner()).f32699g;
            c13513e4.m15067b(c13513e4.f42779d, interfaceC13511c);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m22187d(AbstractC10458p abstractC10458p) {
        if (abstractC10458p.f30972y0) {
            m22185b(abstractC10458p, -1, 0);
        } else {
            AbstractC8111i5.m8592c("autoInvalidateUpdatedNode called on unattached node");
            throw null;
        }
    }

    /* JADX INFO: renamed from: e */
    public static final int m22188e(InterfaceC10457o interfaceC10457o) {
        int i10 = interfaceC10457o instanceof InterfaceC21102w ? 3 : 1;
        if (interfaceC10457o instanceof InterfaceC13259e) {
            i10 |= 4;
        }
        if (interfaceC10457o instanceof InterfaceC2964k) {
            i10 |= 8;
        }
        if (interfaceC10457o instanceof C19742s) {
            i10 |= 16;
        }
        if ((interfaceC10457o instanceof InterfaceC21363c) || (interfaceC10457o instanceof InterfaceC21366f)) {
            i10 |= 32;
        }
        if (interfaceC10457o instanceof InterfaceC21063Q) {
            i10 |= 256;
        }
        return interfaceC10457o instanceof InterfaceC21066U ? i10 | 64 : i10;
    }

    /* JADX INFO: renamed from: f */
    public static final int m22189f(AbstractC10458p abstractC10458p) {
        int i10 = abstractC10458p.f30962o0;
        if (i10 != 0) {
            return i10;
        }
        Class<?> cls = abstractC10458p.getClass();
        C12948A c12948a = f68822a;
        int iM14603c = c12948a.m14603c(cls);
        if (iM14603c >= 0) {
            return c12948a.f41111c[iM14603c];
        }
        int i11 = abstractC10458p instanceof InterfaceC21718w ? 3 : 1;
        if (abstractC10458p instanceof InterfaceC21708o) {
            i11 |= 4;
        }
        if (abstractC10458p instanceof InterfaceC21701k0) {
            i11 |= 8;
        }
        if (abstractC10458p instanceof InterfaceC21697i0) {
            i11 |= 16;
        }
        if (abstractC10458p instanceof InterfaceC21365e) {
            i11 |= 32;
        }
        if (abstractC10458p instanceof InterfaceC21693g0) {
            i11 |= 64;
        }
        if (abstractC10458p instanceof InterfaceC21717v) {
            i11 |= 128;
        }
        if (abstractC10458p instanceof InterfaceC21710p) {
            i11 |= 256;
        }
        if (abstractC10458p instanceof C13526r) {
            i11 |= 1024;
        }
        if (abstractC10458p instanceof InterfaceC13520l) {
            i11 |= 2048;
        }
        if (abstractC10458p instanceof InterfaceC13511c) {
            i11 |= 4096;
        }
        if (abstractC10458p instanceof InterfaceC18858d) {
            i11 |= 8192;
        }
        if (abstractC10458p instanceof C20418a) {
            i11 |= 16384;
        }
        if (abstractC10458p instanceof InterfaceC21702l) {
            i11 |= 32768;
        }
        int i12 = abstractC10458p instanceof InterfaceC21707n0 ? 262144 | i11 : i11;
        c12948a.m14606f(i12, cls);
        return i12;
    }

    /* JADX INFO: renamed from: g */
    public static final int m22190g(AbstractC10458p abstractC10458p) {
        if (!(abstractC10458p instanceof AbstractC21706n)) {
            return m22189f(abstractC10458p);
        }
        AbstractC21706n abstractC21706n = (AbstractC21706n) abstractC10458p;
        int iM22190g = abstractC21706n.f68882z0;
        for (AbstractC10458p abstractC10458p2 = abstractC21706n.f68881A0; abstractC10458p2 != null; abstractC10458p2 = abstractC10458p2.f30965r0) {
            iM22190g |= m22190g(abstractC10458p2);
        }
        return iM22190g;
    }

    /* JADX INFO: renamed from: h */
    public static final boolean m22191h(int i10) {
        return (i10 & 128) != 0;
    }
}
