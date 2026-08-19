package p773h0;

import android.view.ViewGroup;
import android.view.ViewParent;
import kotlin.jvm.internal.C16556x;
import mm.C17296C;
import p025An.AbstractC0575H;
import p025An.InterfaceC0571F;
import p045Bj.C1313k;
import p049Bm.InterfaceC1439n;
import p080D0.C1786U;
import p1140z1.AbstractC21690f;
import p1140z1.AbstractC21706n;
import p1140z1.C21658D;
import p1140z1.C21703l0;
import p1140z1.InterfaceC21707n0;
import p392Q0.C6546d;
import p571X9.AbstractC9233X;
import p635a1.AbstractC10458p;
import p860l0.C16697N0;
import p860l0.C16785v;
import p894n0.C17409o;
import p894n0.InterfaceC17406l;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: h0.c */
/* JADX INFO: loaded from: classes.dex */
public final class C14275c extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public C17409o f44779Y;

    /* JADX INFO: renamed from: Z */
    public int f44780Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ AbstractC14289j f44781o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ long f44782p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ InterfaceC17406l f44783q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14275c(AbstractC14289j abstractC14289j, long j10, InterfaceC17406l interfaceC17406l, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f44781o0 = abstractC14289j;
        this.f44782p0 = j10;
        this.f44783q0 = interfaceC17406l;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C14275c(this.f44781o0, this.f44782p0, this.f44783q0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C14275c) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Code duplicated, block: B:76:0x00fe  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16, types: [a1.p] */
    /* JADX WARN: Type inference failed for: r11v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v21 */
    /* JADX WARN: Type inference failed for: r11v22 */
    /* JADX WARN: Type inference failed for: r11v23 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8, types: [a1.p] */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3, types: [Q0.d] */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v6, types: [Q0.d] */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r15v8 */
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        boolean z6;
        boolean z10;
        C1313k c1313k;
        C17409o c17409o;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f44780Z;
        AbstractC14289j abstractC14289j = this.f44781o0;
        if (i10 != 0) {
            if (i10 == 1) {
                AbstractC9233X.m9807c(obj);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c17409o = this.f44779Y;
                AbstractC9233X.m9807c(obj);
            }
            abstractC14289j.f44850L0 = c17409o;
            return C17296C.f55119a;
        }
        AbstractC9233X.m9807c(obj);
        abstractC14289j.getClass();
        C16556x c16556x = new C16556x();
        C16785v c16785v = C16697N0.f53505A0;
        C1786U c1786u = new C1786U(c16556x, 2);
        AbstractC10458p abstractC10458p = abstractC14289j.f30960Y;
        if (!abstractC10458p.f30972y0) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        AbstractC10458p abstractC10458p2 = abstractC10458p.f30964q0;
        C21658D c21658dM22217v = AbstractC21690f.m22217v(abstractC14289j);
        loop0: while (c21658dM22217v != null) {
            if ((((AbstractC10458p) c21658dM22217v.f68638I0.f3471f).f30963p0 & 262144) != 0) {
                while (abstractC10458p2 != null) {
                    if ((abstractC10458p2.f30962o0 & 262144) != 0) {
                        ?? M22201f = abstractC10458p2;
                        ?? c6546d = 0;
                        while (M22201f != 0) {
                            if (M22201f instanceof InterfaceC21707n0) {
                                InterfaceC21707n0 interfaceC21707n0 = (InterfaceC21707n0) M22201f;
                                if (!(c16785v.equals(interfaceC21707n0.mo14727o()) ? ((Boolean) c1786u.invoke(interfaceC21707n0)).booleanValue() : true)) {
                                    break loop0;
                                }
                            } else {
                                if (((M22201f.f30962o0 & 262144) != 0) && (M22201f instanceof AbstractC21706n)) {
                                    AbstractC10458p abstractC10458p3 = ((AbstractC21706n) M22201f).f68881A0;
                                    int i11 = 0;
                                    while (abstractC10458p3 != null) {
                                        if ((abstractC10458p3.f30962o0 & 262144) != 0) {
                                            M22201f = M22201f;
                                            c6546d = c6546d;
                                            i11++;
                                            if (i11 == 1) {
                                                M22201f = M22201f;
                                                c6546d = c6546d;
                                                c6546d = c6546d;
                                                M22201f = abstractC10458p3;
                                            } else {
                                                if (c6546d == 0) {
                                                    c6546d = new C6546d(new AbstractC10458p[16]);
                                                }
                                                if (M22201f != 0) {
                                                    c6546d.m7099c(M22201f);
                                                    M22201f = 0;
                                                }
                                                c6546d.m7099c(abstractC10458p3);
                                            }
                                        } else {
                                            M22201f = M22201f;
                                            c6546d = c6546d;
                                            M22201f = M22201f;
                                            c6546d = c6546d;
                                        }
                                        abstractC10458p3 = abstractC10458p3.f30965r0;
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
                            }
                            M22201f = AbstractC21690f.m22201f(c6546d);
                        }
                    }
                    abstractC10458p2 = abstractC10458p2.f30964q0;
                }
            }
            c21658dM22217v = c21658dM22217v.m22009G();
            abstractC10458p2 = (c21658dM22217v == null || (c1313k = c21658dM22217v.f68638I0) == null) ? null : (C21703l0) c1313k.f3470e;
        }
        if (c16556x.f51285Y) {
            z6 = true;
        } else {
            int i12 = AbstractC14317x.f44941b;
            ViewParent parent = AbstractC21690f.m22219x(abstractC14289j).getParent();
            while (true) {
                if (parent == null || !(parent instanceof ViewGroup)) {
                    z10 = false;
                    break;
                }
                ViewGroup viewGroup = (ViewGroup) parent;
                if (viewGroup.shouldDelayChildPressedState()) {
                    z10 = true;
                    break;
                }
                parent = viewGroup.getParent();
            }
            if (z10) {
                z6 = true;
            } else {
                z6 = false;
            }
        }
        if (z6) {
            long j10 = AbstractC14317x.f44940a;
            this.f44780Z = 1;
            if (AbstractC0575H.m1184m(j10, this) == enumC19250a) {
                return enumC19250a;
            }
        }
        C17409o c17409o2 = new C17409o(this.f44782p0);
        this.f44779Y = c17409o2;
        this.f44780Z = 2;
        if (this.f44783q0.mo7769c(c17409o2, this) == enumC19250a) {
            return enumC19250a;
        }
        c17409o = c17409o2;
        abstractC14289j.f44850L0 = c17409o;
        return C17296C.f55119a;
    }
}
