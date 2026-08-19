package p1014t1;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p001A.C0093v0;
import p1030u1.C20095b;
import p1095x1.InterfaceC21098s;
import p1140z1.AbstractC21678Y;
import p1140z1.AbstractC21690f;
import p1140z1.AbstractC21706n;
import p1140z1.InterfaceC21697i0;
import p392Q0.C6546d;
import p604Yk.C10077b;
import p635a1.AbstractC10458p;
import p692d0.C12949B;
import p692d0.C12977p;
import p759g1.C13800b;
import p909nm.C17689w;

/* JADX INFO: renamed from: t1.e */
/* JADX INFO: loaded from: classes.dex */
public final class C19728e extends C10077b {

    /* JADX INFO: renamed from: o0 */
    public final AbstractC10458p f62452o0;

    /* JADX INFO: renamed from: p0 */
    public final C20095b f62453p0;

    /* JADX INFO: renamed from: q0 */
    public final C12977p f62454q0;

    /* JADX INFO: renamed from: r0 */
    public AbstractC21678Y f62455r0;

    /* JADX INFO: renamed from: s0 */
    public C19729f f62456s0;

    /* JADX INFO: renamed from: t0 */
    public boolean f62457t0;

    /* JADX INFO: renamed from: u0 */
    public boolean f62458u0;

    /* JADX INFO: renamed from: v0 */
    public boolean f62459v0;

    public C19728e(AbstractC10458p abstractC10458p) {
        super(20);
        this.f62452o0 = abstractC10458p;
        C20095b c20095b = new C20095b();
        c20095b.f63625b = new long[2];
        this.f62453p0 = c20095b;
        this.f62454q0 = new C12977p(2);
        this.f62458u0 = true;
        this.f62459v0 = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [a1.p] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v2, types: [a1.p] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [a1.p] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [Q0.d] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [Q0.d] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX INFO: renamed from: O */
    public final void m20672O() {
        C6546d c6546d = (C6546d) this.f29833Z;
        int i10 = c6546d.f21184o0;
        if (i10 > 0) {
            Object[] objArr = c6546d.f21182Y;
            int i11 = 0;
            do {
                ((C19728e) objArr[i11]).m20672O();
                i11++;
            } while (i11 < i10);
        }
        ?? M22201f = this.f62452o0;
        ?? c6546d2 = 0;
        while (M22201f != 0) {
            if (M22201f instanceof InterfaceC21697i0) {
                ((InterfaceC21697i0) M22201f).mo15561D();
            } else if ((M22201f.f30962o0 & 16) != 0 && (M22201f instanceof AbstractC21706n)) {
                AbstractC10458p abstractC10458p = ((AbstractC21706n) M22201f).f68881A0;
                int i12 = 0;
                while (abstractC10458p != null) {
                    if ((abstractC10458p.f30962o0 & 16) != 0) {
                        i12++;
                        if (i12 == 1) {
                            M22201f = M22201f;
                            c6546d2 = c6546d2;
                            c6546d2 = c6546d2;
                            M22201f = abstractC10458p;
                        } else {
                            if (c6546d2 == 0) {
                                c6546d2 = new C6546d(new AbstractC10458p[16]);
                            }
                            if (M22201f != 0) {
                                c6546d2.m7099c(M22201f);
                                M22201f = 0;
                            }
                            c6546d2.m7099c(abstractC10458p);
                        }
                    } else {
                        M22201f = M22201f;
                        c6546d2 = c6546d2;
                    }
                    abstractC10458p = abstractC10458p.f30965r0;
                    M22201f = M22201f;
                    c6546d2 = c6546d2;
                }
                if (i12 == 1) {
                    M22201f = M22201f;
                    c6546d2 = c6546d2;
                } else {
                    M22201f = M22201f;
                    c6546d2 = c6546d2;
                }
            }
            M22201f = AbstractC21690f.m22201f(c6546d2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [a1.p] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [a1.p] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [Q0.d] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6, types: [Q0.d] */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    /* JADX INFO: renamed from: P */
    public final boolean m20673P(C0093v0 c0093v0) {
        C6546d c6546d;
        int i10;
        C12977p c12977p = this.f62454q0;
        boolean z6 = false;
        int i11 = 0;
        z6 = false;
        if (!(c12977p.m14670j() == 0)) {
            AbstractC10458p abstractC10458p = this.f62452o0;
            if (abstractC10458p.f30972y0) {
                C19729f c19729f = this.f62456s0;
                AbstractC16544l.m18091d(c19729f);
                AbstractC21678Y abstractC21678Y = this.f62455r0;
                AbstractC16544l.m18091d(abstractC21678Y);
                long j10 = abstractC21678Y.f66983o0;
                ?? M22201f = abstractC10458p;
                ?? c6546d2 = 0;
                while (M22201f != 0) {
                    if (M22201f instanceof InterfaceC21697i0) {
                        ((InterfaceC21697i0) M22201f).mo15560C(c19729f, EnumC19730g.f62467o0, j10);
                    } else if ((M22201f.f30962o0 & 16) != 0 && (M22201f instanceof AbstractC21706n)) {
                        AbstractC10458p abstractC10458p2 = ((AbstractC21706n) M22201f).f68881A0;
                        int i12 = 0;
                        while (abstractC10458p2 != null) {
                            if ((abstractC10458p2.f30962o0 & 16) != 0) {
                                i12++;
                                if (i12 == 1) {
                                    M22201f = M22201f;
                                    c6546d2 = c6546d2;
                                    c6546d2 = c6546d2;
                                    M22201f = abstractC10458p2;
                                } else {
                                    if (c6546d2 == 0) {
                                        c6546d2 = new C6546d(new AbstractC10458p[16]);
                                    }
                                    if (M22201f != 0) {
                                        c6546d2.m7099c(M22201f);
                                        M22201f = 0;
                                    }
                                    c6546d2.m7099c(abstractC10458p2);
                                }
                            } else {
                                M22201f = M22201f;
                                c6546d2 = c6546d2;
                            }
                            abstractC10458p2 = abstractC10458p2.f30965r0;
                            M22201f = M22201f;
                            c6546d2 = c6546d2;
                        }
                        if (i12 == 1) {
                            M22201f = M22201f;
                            c6546d2 = c6546d2;
                        } else {
                            M22201f = M22201f;
                            c6546d2 = c6546d2;
                        }
                    }
                    M22201f = AbstractC21690f.m22201f(c6546d2);
                }
                if (abstractC10458p.f30972y0 && (i10 = (c6546d = (C6546d) this.f29833Z).f21184o0) > 0) {
                    Object[] objArr = c6546d.f21182Y;
                    do {
                        ((C19728e) objArr[i11]).m20673P(c0093v0);
                        i11++;
                    } while (i11 < i10);
                }
                z6 = true;
            }
        }
        mo10674y(c0093v0);
        c12977p.m14662b();
        this.f62455r0 = null;
        return z6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v4, types: [a1.p] */
    /* JADX WARN: Type inference failed for: r0v5, types: [a1.p] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8, types: [a1.p] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5, types: [Q0.d] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8, types: [Q0.d] */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [a1.p] */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12, types: [a1.p] */
    /* JADX WARN: Type inference failed for: r7v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10, types: [Q0.d] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7, types: [Q0.d] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX INFO: renamed from: Q */
    public final boolean m20674Q(C0093v0 c0093v0, boolean z6) {
        C6546d c6546d;
        int i10;
        if (this.f62454q0.m14670j() == 0) {
            return false;
        }
        ?? M22201f = this.f62452o0;
        if (!M22201f.f30972y0) {
            return false;
        }
        C19729f c19729f = this.f62456s0;
        AbstractC16544l.m18091d(c19729f);
        AbstractC21678Y abstractC21678Y = this.f62455r0;
        AbstractC16544l.m18091d(abstractC21678Y);
        long j10 = abstractC21678Y.f66983o0;
        ?? M22201f2 = M22201f;
        ?? c6546d2 = 0;
        while (M22201f2 != 0) {
            if (M22201f2 instanceof InterfaceC21697i0) {
                ((InterfaceC21697i0) M22201f2).mo15560C(c19729f, EnumC19730g.f62465Y, j10);
            } else if ((M22201f2.f30962o0 & 16) != 0 && (M22201f2 instanceof AbstractC21706n)) {
                AbstractC10458p abstractC10458p = ((AbstractC21706n) M22201f2).f68881A0;
                int i11 = 0;
                while (abstractC10458p != null) {
                    if ((abstractC10458p.f30962o0 & 16) != 0) {
                        i11++;
                        if (i11 == 1) {
                            M22201f2 = M22201f2;
                            c6546d2 = c6546d2;
                            c6546d2 = c6546d2;
                            M22201f2 = abstractC10458p;
                        } else {
                            if (c6546d2 == 0) {
                                c6546d2 = new C6546d(new AbstractC10458p[16]);
                            }
                            if (M22201f2 != 0) {
                                c6546d2.m7099c(M22201f2);
                                M22201f2 = 0;
                            }
                            c6546d2.m7099c(abstractC10458p);
                        }
                    } else {
                        M22201f2 = M22201f2;
                        c6546d2 = c6546d2;
                    }
                    abstractC10458p = abstractC10458p.f30965r0;
                    M22201f2 = M22201f2;
                    c6546d2 = c6546d2;
                }
                if (i11 == 1) {
                    M22201f2 = M22201f2;
                    c6546d2 = c6546d2;
                } else {
                    M22201f2 = M22201f2;
                    c6546d2 = c6546d2;
                }
            }
            M22201f2 = AbstractC21690f.m22201f(c6546d2);
        }
        if (M22201f.f30972y0 && (i10 = (c6546d = (C6546d) this.f29833Z).f21184o0) > 0) {
            Object[] objArr = c6546d.f21182Y;
            int i12 = 0;
            do {
                C19728e c19728e = (C19728e) objArr[i12];
                AbstractC16544l.m18091d(this.f62455r0);
                c19728e.m20674Q(c0093v0, z6);
                i12++;
            } while (i12 < i10);
        }
        if (M22201f.f30972y0) {
            ?? c6546d3 = 0;
            while (M22201f != 0) {
                if (M22201f instanceof InterfaceC21697i0) {
                    ((InterfaceC21697i0) M22201f).mo15560C(c19729f, EnumC19730g.f62466Z, j10);
                } else if ((M22201f.f30962o0 & 16) != 0 && (M22201f instanceof AbstractC21706n)) {
                    AbstractC10458p abstractC10458p2 = ((AbstractC21706n) M22201f).f68881A0;
                    int i13 = 0;
                    while (abstractC10458p2 != null) {
                        if ((abstractC10458p2.f30962o0 & 16) != 0) {
                            i13++;
                            if (i13 == 1) {
                                M22201f = M22201f;
                                c6546d3 = c6546d3;
                                c6546d3 = c6546d3;
                                M22201f = abstractC10458p2;
                            } else {
                                if (c6546d3 == 0) {
                                    c6546d3 = new C6546d(new AbstractC10458p[16]);
                                }
                                if (M22201f != 0) {
                                    c6546d3.m7099c(M22201f);
                                    M22201f = 0;
                                }
                                c6546d3.m7099c(abstractC10458p2);
                            }
                        } else {
                            M22201f = M22201f;
                            c6546d3 = c6546d3;
                        }
                        abstractC10458p2 = abstractC10458p2.f30965r0;
                        M22201f = M22201f;
                        c6546d3 = c6546d3;
                    }
                    if (i13 == 1) {
                        M22201f = M22201f;
                        c6546d3 = c6546d3;
                    } else {
                        M22201f = M22201f;
                        c6546d3 = c6546d3;
                    }
                }
                M22201f = AbstractC21690f.m22201f(c6546d3);
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: R */
    public final void m20675R(long j10, C12949B c12949b) {
        C20095b c20095b = this.f62453p0;
        int i10 = 0;
        if (c20095b.m20923c(j10) && c12949b.m14608b(this) < 0) {
            int i11 = c20095b.f63624a;
            for (int i12 = 0; i12 < i11; i12++) {
                if (j10 == c20095b.f63625b[i12]) {
                    c20095b.m20925e(i12);
                    break;
                }
            }
            this.f62454q0.m14669i(j10);
        }
        C6546d c6546d = (C6546d) this.f29833Z;
        int i13 = c6546d.f21184o0;
        if (i13 > 0) {
            Object[] objArr = c6546d.f21182Y;
            do {
                ((C19728e) objArr[i10]).m20675R(j10, c12949b);
                i10++;
            } while (i10 < i13);
        }
    }

    public final String toString() {
        return "Node(pointerInputFilter=" + this.f62452o0 + ", children=" + ((C6546d) this.f29833Z) + ", pointerIds=" + this.f62453p0 + ')';
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0211  */
    /* JADX WARN: Code duplicated, block: B:103:0x0219  */
    /* JADX WARN: Code duplicated, block: B:108:0x0224  */
    /* JADX WARN: Code duplicated, block: B:110:0x022c  */
    /* JADX WARN: Code duplicated, block: B:130:0x0277  */
    /* JADX WARN: Code duplicated, block: B:53:0x0148  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v0, types: [a1.p] */
    /* JADX WARN: Type inference failed for: r5v1, types: [a1.p] */
    /* JADX WARN: Type inference failed for: r5v48 */
    /* JADX WARN: Type inference failed for: r5v49, types: [a1.p] */
    /* JADX WARN: Type inference failed for: r5v50, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v51 */
    /* JADX WARN: Type inference failed for: r5v52 */
    /* JADX WARN: Type inference failed for: r5v53 */
    /* JADX WARN: Type inference failed for: r5v54 */
    /* JADX WARN: Type inference failed for: r5v55 */
    /* JADX WARN: Type inference failed for: r5v56 */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [int] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16, types: [Q0.d] */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19, types: [Q0.d] */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p604Yk.C10077b
    /* JADX INFO: renamed from: x */
    public final boolean mo10673x(C12977p c12977p, InterfaceC21098s interfaceC21098s, C0093v0 c0093v0, boolean z6) {
        C12977p c12977p2;
        C20095b c20095b;
        Object obj;
        boolean z10;
        boolean z11;
        boolean z12;
        C19729f c19729f;
        int i10;
        boolean zMo10673x = super.mo10673x(c12977p, interfaceC21098s, c0093v0, z6);
        ?? M22201f = this.f62452o0;
        if (!M22201f.f30972y0) {
            return true;
        }
        ?? c6546d = 0;
        while (M22201f != 0) {
            if (M22201f instanceof InterfaceC21697i0) {
                this.f62455r0 = AbstractC21690f.m22215t((InterfaceC21697i0) M22201f, 16);
            } else if ((M22201f.f30962o0 & 16) != 0 && (M22201f instanceof AbstractC21706n)) {
                AbstractC10458p abstractC10458p = ((AbstractC21706n) M22201f).f68881A0;
                int i11 = 0;
                while (abstractC10458p != null) {
                    if ((abstractC10458p.f30962o0 & 16) != 0) {
                        i11++;
                        if (i11 == 1) {
                            M22201f = M22201f;
                            c6546d = c6546d;
                            c6546d = c6546d;
                            M22201f = abstractC10458p;
                        } else {
                            if (c6546d == 0) {
                                c6546d = new C6546d(new AbstractC10458p[16]);
                            }
                            if (M22201f != 0) {
                                c6546d.m7099c(M22201f);
                                M22201f = 0;
                            }
                            c6546d.m7099c(abstractC10458p);
                        }
                    } else {
                        M22201f = M22201f;
                        c6546d = c6546d;
                    }
                    abstractC10458p = abstractC10458p.f30965r0;
                    M22201f = M22201f;
                    c6546d = c6546d;
                }
                if (i11 == 1) {
                    M22201f = M22201f;
                    c6546d = c6546d;
                } else {
                    M22201f = M22201f;
                    c6546d = c6546d;
                }
            }
            M22201f = AbstractC21690f.m22201f(c6546d);
        }
        int iM14670j = c12977p.m14670j();
        int i12 = 0;
        while (true) {
            c12977p2 = this.f62454q0;
            c20095b = this.f62453p0;
            if (i12 >= iM14670j) {
                break;
            }
            long jM14667g = c12977p.m14667g(i12);
            C19738o c19738o = (C19738o) c12977p.m14671k(i12);
            if (c20095b.m20923c(jM14667g)) {
                long j10 = c19738o.f62484g;
                if (C13800b.m15309j(j10)) {
                    long j11 = c19738o.f62480c;
                    if (C13800b.m15309j(j11)) {
                        List list = c19738o.f62488k;
                        C17689w c17689w = C17689w.f56480Y;
                        if (list == null) {
                            list = c17689w;
                        }
                        ArrayList arrayList = new ArrayList(list.size());
                        List list2 = c19738o.f62488k;
                        if (list2 == null) {
                            list2 = c17689w;
                        }
                        int size = list2.size();
                        int i13 = 0;
                        while (i13 < size) {
                            int i14 = size;
                            C19726c c19726c = (C19726c) list2.get(i13);
                            long j12 = jM14667g;
                            long j13 = c19726c.f62449b;
                            if (C13800b.m15309j(j13)) {
                                AbstractC21678Y abstractC21678Y = this.f62455r0;
                                AbstractC16544l.m18091d(abstractC21678Y);
                                arrayList.add(new C19726c(c19726c.f62448a, abstractC21678Y.m22167R0(interfaceC21098s, j13), c19726c.f62450c));
                            }
                            i13++;
                            i12 = i12;
                            list2 = list2;
                            size = i14;
                            j11 = j11;
                            jM14667g = j12;
                        }
                        i10 = i12;
                        AbstractC21678Y abstractC21678Y2 = this.f62455r0;
                        AbstractC16544l.m18091d(abstractC21678Y2);
                        long jM22167R0 = abstractC21678Y2.m22167R0(interfaceC21098s, j10);
                        AbstractC21678Y abstractC21678Y3 = this.f62455r0;
                        AbstractC16544l.m18091d(abstractC21678Y3);
                        C19738o c19738o2 = new C19738o(c19738o.f62478a, c19738o.f62479b, abstractC21678Y3.m22167R0(interfaceC21098s, j11), c19738o.f62481d, c19738o.f62482e, c19738o.f62483f, jM22167R0, c19738o.f62485h, c19738o.f62486i, arrayList, c19738o.f62487j, c19738o.f62489l);
                        c19738o2.f62490m = c19738o.f62490m;
                        c12977p2.m14668h(jM14667g, c19738o2);
                    } else {
                        i10 = i12;
                    }
                } else {
                    i10 = i12;
                }
            } else {
                i10 = i12;
            }
            i12 = i10 + 1;
            iM14670j = iM14670j;
            zMo10673x = zMo10673x;
        }
        boolean z13 = zMo10673x;
        if (c12977p2.m14670j() == 0) {
            c20095b.f63624a = 0;
            ((C6546d) this.f29833Z).m7104i();
            return true;
        }
        for (int i15 = c20095b.f63624a - 1; -1 < i15; i15--) {
            if (c12977p.m14666f(c20095b.f63625b[i15]) < 0) {
                c20095b.m20925e(i15);
            }
        }
        ArrayList arrayList2 = new ArrayList(c12977p2.m14670j());
        int iM14670j2 = c12977p2.m14670j();
        for (int i16 = 0; i16 < iM14670j2; i16++) {
            arrayList2.add(c12977p2.m14671k(i16));
        }
        C19729f c19729f2 = new C19729f(arrayList2, c0093v0);
        int size2 = arrayList2.size();
        int i17 = 0;
        while (true) {
            if (i17 >= size2) {
                obj = null;
                break;
            }
            obj = arrayList2.get(i17);
            if (c0093v0.m340c(((C19738o) obj).f62478a)) {
                break;
            }
            i17++;
        }
        C19738o c19738o3 = (C19738o) obj;
        if (c19738o3 != null) {
            boolean z14 = c19738o3.f62481d;
            if (z6) {
                z10 = false;
                if (!this.f62458u0 && (z14 || c19738o3.f62485h)) {
                    AbstractC21678Y abstractC21678Y4 = this.f62455r0;
                    AbstractC16544l.m18091d(abstractC21678Y4);
                    boolean zM20684f = AbstractC19736m.m20684f(c19738o3, abstractC21678Y4.f66983o0);
                    z11 = true;
                    this.f62458u0 = !zM20684f;
                }
                if (this.f62458u0 == this.f62457t0 && (AbstractC19736m.m20682d(c19729f2.f62464e, 3) || AbstractC19736m.m20682d(c19729f2.f62464e, 4) || AbstractC19736m.m20682d(c19729f2.f62464e, 5))) {
                    c19729f2.f62464e = this.f62458u0 ? 4 : 5;
                } else if (!AbstractC19736m.m20682d(c19729f2.f62464e, 4) && this.f62457t0 && !this.f62459v0) {
                    c19729f2.f62464e = 3;
                } else if (AbstractC19736m.m20682d(c19729f2.f62464e, 5) && this.f62458u0 && z14) {
                    c19729f2.f62464e = 3;
                }
            } else {
                z10 = false;
                this.f62458u0 = false;
            }
            z11 = true;
            if (this.f62458u0 == this.f62457t0) {
                if (!AbstractC19736m.m20682d(c19729f2.f62464e, 4)) {
                    if (AbstractC19736m.m20682d(c19729f2.f62464e, 5)) {
                        c19729f2.f62464e = 3;
                    }
                } else if (AbstractC19736m.m20682d(c19729f2.f62464e, 5)) {
                    c19729f2.f62464e = 3;
                }
            } else if (!AbstractC19736m.m20682d(c19729f2.f62464e, 4)) {
                if (AbstractC19736m.m20682d(c19729f2.f62464e, 5)) {
                    c19729f2.f62464e = 3;
                }
            } else if (AbstractC19736m.m20682d(c19729f2.f62464e, 5)) {
                c19729f2.f62464e = 3;
            }
        } else {
            z10 = false;
            z11 = true;
        }
        if (!z13 && AbstractC19736m.m20682d(c19729f2.f62464e, 3) && (c19729f = this.f62456s0) != null) {
            ?? r6 = c19729f.f62460a;
            int size3 = r6.size();
            ?? r10 = c19729f2.f62460a;
            if (size3 != r10.size()) {
                z12 = z11;
                break;
            }
            int size4 = r10.size();
            ?? r11 = z10;
            while (true) {
                if (r11 >= size4) {
                    z12 = z10;
                    break;
                }
                if (!C13800b.m15303d(((C19738o) r6.get(r11)).f62480c, ((C19738o) r10.get(r11)).f62480c)) {
                    z12 = z11;
                    break;
                }
                r11++;
            }
        } else {
            z12 = z11;
            break;
        }
        this.f62456s0 = c19729f2;
        return z12;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    @Override // p604Yk.C10077b
    /* JADX INFO: renamed from: y */
    public final void mo10674y(C0093v0 c0093v0) {
        super.mo10674y(c0093v0);
        C19729f c19729f = this.f62456s0;
        if (c19729f == null) {
            return;
        }
        this.f62457t0 = this.f62458u0;
        ?? r6 = c19729f.f62460a;
        int size = r6.size();
        for (int i10 = 0; i10 < size; i10++) {
            C19738o c19738o = (C19738o) r6.get(i10);
            boolean z6 = c19738o.f62481d;
            long j10 = c19738o.f62478a;
            boolean zM340c = c0093v0.m340c(j10);
            boolean z10 = this.f62458u0;
            if ((!z6 && !zM340c) || (!z6 && !z10)) {
                C20095b c20095b = this.f62453p0;
                int i11 = c20095b.f63624a;
                for (int i12 = 0; i12 < i11; i12++) {
                    if (j10 == c20095b.f63625b[i12]) {
                        c20095b.m20925e(i12);
                        break;
                    }
                }
            }
        }
        this.f62458u0 = false;
        this.f62459v0 = AbstractC19736m.m20682d(c19729f.f62464e, 5);
    }
}
