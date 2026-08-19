package p737f1;

import androidx.compose.p650ui.focus.C10863b;
import androidx.compose.p650ui.platform.AndroidComposeView;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16525B;
import p001A.C0093v0;
import p025An.C0644w;
import p045Bj.C1313k;
import p1071w0.AbstractC20734X;
import p1117y1.C21362b;
import p1117y1.C21368h;
import p1117y1.InterfaceC21365e;
import p1140z1.AbstractC21678Y;
import p1140z1.AbstractC21690f;
import p1140z1.AbstractC21706n;
import p1140z1.C21658D;
import p1140z1.C21703l0;
import p1140z1.InterfaceC21681a0;
import p1140z1.InterfaceC21702l;
import p392Q0.C6546d;
import p523V9.AbstractC8005U5;
import p523V9.AbstractC8111i5;
import p547Wc.C8816z;
import p635a1.AbstractC10458p;
import p692d0.C12951D;

/* JADX INFO: renamed from: f1.r */
/* JADX INFO: loaded from: classes.dex */
public final class C13526r extends AbstractC10458p implements InterfaceC21702l, InterfaceC21681a0, InterfaceC21365e {

    /* JADX INFO: renamed from: A0 */
    public boolean f42811A0;

    /* JADX INFO: renamed from: B0 */
    public EnumC13525q f42812B0;

    /* JADX INFO: renamed from: z0 */
    public boolean f42813z0;

    /* JADX INFO: renamed from: M0 */
    public static final boolean m15075M0(C13526r c13526r) {
        AbstractC10458p abstractC10458p = c13526r.f30960Y;
        if (!abstractC10458p.f30972y0) {
            AbstractC8111i5.m8592c("visitSubtreeIf called on an unattached node");
            throw null;
        }
        C6546d c6546d = new C6546d(new AbstractC10458p[16]);
        AbstractC10458p abstractC10458p2 = abstractC10458p.f30965r0;
        if (abstractC10458p2 == null) {
            AbstractC21690f.m22197b(c6546d, abstractC10458p);
        } else {
            c6546d.m7099c(abstractC10458p2);
        }
        while (c6546d.m7109n()) {
            AbstractC10458p abstractC10458p3 = (AbstractC10458p) c6546d.m7111p(c6546d.f21184o0 - 1);
            if ((abstractC10458p3.f30963p0 & 1024) != 0) {
                for (AbstractC10458p abstractC10458p4 = abstractC10458p3; abstractC10458p4 != null; abstractC10458p4 = abstractC10458p4.f30965r0) {
                    if ((abstractC10458p4.f30962o0 & 1024) != 0) {
                        C6546d c6546d2 = null;
                        AbstractC10458p abstractC10458pM22201f = abstractC10458p4;
                        while (abstractC10458pM22201f != null) {
                            if (abstractC10458pM22201f instanceof C13526r) {
                                C13526r c13526r2 = (C13526r) abstractC10458pM22201f;
                                if (c13526r2.f42812B0 != null) {
                                    int iOrdinal = c13526r2.m15078L0().ordinal();
                                    if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2) {
                                        return true;
                                    }
                                    if (iOrdinal == 3) {
                                        return false;
                                    }
                                    throw new C0644w();
                                }
                            } else if ((abstractC10458pM22201f.f30962o0 & 1024) != 0 && (abstractC10458pM22201f instanceof AbstractC21706n)) {
                                int i10 = 0;
                                for (AbstractC10458p abstractC10458p5 = ((AbstractC21706n) abstractC10458pM22201f).f68881A0; abstractC10458p5 != null; abstractC10458p5 = abstractC10458p5.f30965r0) {
                                    if ((abstractC10458p5.f30962o0 & 1024) != 0) {
                                        i10++;
                                        if (i10 == 1) {
                                            abstractC10458pM22201f = abstractC10458p5;
                                        } else {
                                            if (c6546d2 == null) {
                                                c6546d2 = new C6546d(new AbstractC10458p[16]);
                                            }
                                            if (abstractC10458pM22201f != null) {
                                                c6546d2.m7099c(abstractC10458pM22201f);
                                                abstractC10458pM22201f = null;
                                            }
                                            c6546d2.m7099c(abstractC10458p5);
                                        }
                                    }
                                }
                                if (i10 == 1) {
                                }
                            }
                            abstractC10458pM22201f = AbstractC21690f.m22201f(c6546d2);
                        }
                    }
                }
            }
            AbstractC21690f.m22197b(c6546d, abstractC10458p3);
        }
        return false;
    }

    /* JADX INFO: renamed from: N0 */
    public static final boolean m15076N0(C13526r c13526r) {
        C1313k c1313k;
        AbstractC10458p abstractC10458p = c13526r.f30960Y;
        if (!abstractC10458p.f30972y0) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        AbstractC10458p abstractC10458p2 = abstractC10458p.f30964q0;
        C21658D c21658dM22217v = AbstractC21690f.m22217v(c13526r);
        while (c21658dM22217v != null) {
            if ((((AbstractC10458p) c21658dM22217v.f68638I0.f3471f).f30963p0 & 1024) != 0) {
                while (abstractC10458p2 != null) {
                    if ((abstractC10458p2.f30962o0 & 1024) != 0) {
                        AbstractC10458p abstractC10458pM22201f = abstractC10458p2;
                        C6546d c6546d = null;
                        while (abstractC10458pM22201f != null) {
                            if (abstractC10458pM22201f instanceof C13526r) {
                                C13526r c13526r2 = (C13526r) abstractC10458pM22201f;
                                if (c13526r2.f42812B0 != null) {
                                    int iOrdinal = c13526r2.m15078L0().ordinal();
                                    if (iOrdinal == 0) {
                                        return false;
                                    }
                                    if (iOrdinal == 1) {
                                        return true;
                                    }
                                    if (iOrdinal == 2 || iOrdinal == 3) {
                                        return false;
                                    }
                                    throw new C0644w();
                                }
                            } else if ((abstractC10458pM22201f.f30962o0 & 1024) != 0 && (abstractC10458pM22201f instanceof AbstractC21706n)) {
                                int i10 = 0;
                                for (AbstractC10458p abstractC10458p3 = ((AbstractC21706n) abstractC10458pM22201f).f68881A0; abstractC10458p3 != null; abstractC10458p3 = abstractC10458p3.f30965r0) {
                                    if ((abstractC10458p3.f30962o0 & 1024) != 0) {
                                        i10++;
                                        if (i10 == 1) {
                                            abstractC10458pM22201f = abstractC10458p3;
                                        } else {
                                            if (c6546d == null) {
                                                c6546d = new C6546d(new AbstractC10458p[16]);
                                            }
                                            if (abstractC10458pM22201f != null) {
                                                c6546d.m7099c(abstractC10458pM22201f);
                                                abstractC10458pM22201f = null;
                                            }
                                            c6546d.m7099c(abstractC10458p3);
                                        }
                                    }
                                }
                                if (i10 == 1) {
                                }
                            }
                            abstractC10458pM22201f = AbstractC21690f.m22201f(c6546d);
                        }
                    }
                    abstractC10458p2 = abstractC10458p2.f30964q0;
                }
            }
            c21658dM22217v = c21658dM22217v.m22009G();
            abstractC10458p2 = (c21658dM22217v == null || (c1313k = c21658dM22217v.f68638I0) == null) ? null : (C21703l0) c1313k.f3470e;
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x002e  */
    @Override // p635a1.AbstractC10458p
    /* JADX INFO: renamed from: D0 */
    public final void mo4226D0() {
        int iOrdinal = m15078L0().ordinal();
        if (iOrdinal == 0) {
            ((C10863b) AbstractC21690f.m22218w(this).getFocusOwner()).m11301a(8, true, false);
            C13513e c13513e = ((C10863b) AbstractC21690f.m22218w(this).getFocusOwner()).f32699g;
            c13513e.m15067b(c13513e.f42778c, this);
        } else if (iOrdinal == 1) {
            C0093v0 c0093v0M15033F = AbstractC13512d.m15033F(this);
            try {
                if (c0093v0M15033F.f403Z) {
                    C0093v0.m329a(c0093v0M15033F);
                }
                c0093v0M15033F.f403Z = true;
                m15080P0(EnumC13525q.f42809o0);
                C0093v0.m330b(c0093v0M15033F);
            } catch (Throwable th2) {
                C0093v0.m330b(c0093v0M15033F);
                throw th2;
            }
        } else if (iOrdinal == 2) {
            ((C10863b) AbstractC21690f.m22218w(this).getFocusOwner()).m11301a(8, true, false);
            C13513e c13513e2 = ((C10863b) AbstractC21690f.m22218w(this).getFocusOwner()).f32699g;
            c13513e2.m15067b(c13513e2.f42778c, this);
        }
        this.f42812B0 = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11, types: [a1.p] */
    /* JADX WARN: Type inference failed for: r5v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [a1.p] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [Q0.d] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [Q0.d] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX INFO: renamed from: K0 */
    public final C13518j m15077K0() {
        C1313k c1313k;
        C13518j c13518j = new C13518j();
        c13518j.f42791a = true;
        C13522n c13522n = C13522n.f42803b;
        c13518j.f42792b = c13522n;
        c13518j.f42793c = c13522n;
        c13518j.f42794d = c13522n;
        c13518j.f42795e = c13522n;
        c13518j.f42796f = c13522n;
        c13518j.f42797g = c13522n;
        c13518j.f42798h = c13522n;
        c13518j.f42799i = c13522n;
        c13518j.f42800j = C13516h.f42786o0;
        c13518j.f42801k = C13516h.f42787p0;
        AbstractC10458p abstractC10458p = this.f30960Y;
        if (!abstractC10458p.f30972y0) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        C21658D c21658dM22217v = AbstractC21690f.m22217v(this);
        AbstractC10458p abstractC10458p2 = abstractC10458p;
        loop0: while (c21658dM22217v != null) {
            if ((((AbstractC10458p) c21658dM22217v.f68638I0.f3471f).f30963p0 & 3072) != 0) {
                while (abstractC10458p2 != null) {
                    int i10 = abstractC10458p2.f30962o0;
                    if ((i10 & 3072) != 0) {
                        if (abstractC10458p2 != abstractC10458p && (i10 & 1024) != 0) {
                            break loop0;
                        }
                        if ((i10 & 2048) != 0) {
                            ?? M22201f = abstractC10458p2;
                            ?? c6546d = 0;
                            while (M22201f != 0) {
                                if (M22201f instanceof InterfaceC13520l) {
                                    ((InterfaceC13520l) M22201f).mo9604g0(c13518j);
                                } else if ((M22201f.f30962o0 & 2048) != 0 && (M22201f instanceof AbstractC21706n)) {
                                    AbstractC10458p abstractC10458p3 = ((AbstractC21706n) M22201f).f68881A0;
                                    int i11 = 0;
                                    while (abstractC10458p3 != null) {
                                        if ((abstractC10458p3.f30962o0 & 2048) != 0) {
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
                                M22201f = AbstractC21690f.m22201f(c6546d);
                            }
                        }
                    }
                    abstractC10458p2 = abstractC10458p2.f30964q0;
                }
            }
            c21658dM22217v = c21658dM22217v.m22009G();
            abstractC10458p2 = (c21658dM22217v == null || (c1313k = c21658dM22217v.f68638I0) == null) ? null : (C21703l0) c1313k.f3470e;
        }
        return c13518j;
    }

    /* JADX INFO: renamed from: L0 */
    public final EnumC13525q m15078L0() {
        EnumC13525q enumC13525q;
        C21658D c21658d;
        AndroidComposeView androidComposeView;
        InterfaceC13515g focusOwner;
        AbstractC21678Y abstractC21678Y = this.f30960Y.f30967t0;
        C0093v0 c0093v0 = (abstractC21678Y == null || (c21658d = abstractC21678Y.f68819x0) == null || (androidComposeView = c21658d.f68658u0) == null || (focusOwner = androidComposeView.getFocusOwner()) == null) ? null : ((C10863b) focusOwner).f32700h;
        if (c0093v0 != null && (enumC13525q = (EnumC13525q) ((C12951D) c0093v0.f404o0).m14619e(this)) != null) {
            return enumC13525q;
        }
        EnumC13525q enumC13525q2 = this.f42812B0;
        return enumC13525q2 == null ? EnumC13525q.f42809o0 : enumC13525q2;
    }

    /* JADX INFO: renamed from: O0 */
    public final void m15079O0() {
        EnumC13525q enumC13525q = this.f42812B0;
        if (enumC13525q == null) {
            if (enumC13525q != null) {
                throw new IllegalStateException("Re-initializing focus target node.");
            }
            C0093v0 c0093v0M15033F = AbstractC13512d.m15033F(this);
            try {
                if (c0093v0M15033F.f403Z) {
                    C0093v0.m329a(c0093v0M15033F);
                }
                c0093v0M15033F.f403Z = true;
                m15080P0((m15076N0(this) && m15075M0(this)) ? EnumC13525q.f42808Z : EnumC13525q.f42809o0);
                C0093v0.m330b(c0093v0M15033F);
            } catch (Throwable th2) {
                C0093v0.m330b(c0093v0M15033F);
                throw th2;
            }
        }
        int iOrdinal = m15078L0().ordinal();
        if (iOrdinal == 0 || iOrdinal == 2) {
            C16525B c16525b = new C16525B();
            AbstractC21690f.m22214s(this, new C8816z(c16525b, 18, this));
            Object obj = c16525b.f51262Y;
            if (obj == null) {
                AbstractC16544l.m18103p("focusProperties");
                throw null;
            }
            if (((InterfaceC13517i) obj).mo15068a()) {
                return;
            }
            ((C10863b) AbstractC21690f.m22218w(this).getFocusOwner()).m11301a(8, true, true);
        }
    }

    /* JADX INFO: renamed from: P0 */
    public final void m15080P0(EnumC13525q enumC13525q) {
        ((C12951D) AbstractC13512d.m15033F(this).f404o0).m14623i(this, enumC13525q);
    }

    @Override // p1117y1.InterfaceC21365e
    /* JADX INFO: renamed from: S */
    public final /* synthetic */ AbstractC8005U5 mo15081S() {
        return C21362b.f67835b;
    }

    @Override // p1117y1.InterfaceC21365e, p1117y1.InterfaceC21367g
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object mo15082a(C21368h c21368h) {
        return AbstractC20734X.m21230a(this, c21368h);
    }

    @Override // p1140z1.InterfaceC21681a0
    /* JADX INFO: renamed from: j0 */
    public final void mo2488j0() {
        EnumC13525q enumC13525qM15078L0 = m15078L0();
        m15079O0();
        if (enumC13525qM15078L0 != m15078L0()) {
            AbstractC13512d.m15065z(this);
        }
    }

    @Override // p635a1.AbstractC10458p
    /* JADX INFO: renamed from: z0 */
    public final boolean mo4774z0() {
        return false;
    }
}
