package p1140z1;

import kotlin.jvm.internal.AbstractC16544l;
import p045Bj.C1313k;
import p523V9.AbstractC8111i5;
import p635a1.AbstractC10458p;
import p692d0.C12948A;

/* JADX INFO: renamed from: z1.n */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC21706n extends AbstractC10458p {

    /* JADX INFO: renamed from: A0 */
    public AbstractC10458p f68881A0;

    /* JADX INFO: renamed from: z0 */
    public final int f68882z0 = AbstractC21679Z.m22189f(this);

    @Override // p635a1.AbstractC10458p
    /* JADX INFO: renamed from: A0 */
    public final void mo10927A0() {
        super.mo10927A0();
        for (AbstractC10458p abstractC10458p = this.f68881A0; abstractC10458p != null; abstractC10458p = abstractC10458p.f30965r0) {
            abstractC10458p.mo10934J0(this.f30967t0);
            if (!abstractC10458p.f30972y0) {
                abstractC10458p.mo10927A0();
            }
        }
    }

    @Override // p635a1.AbstractC10458p
    /* JADX INFO: renamed from: B0 */
    public final void mo10928B0() {
        for (AbstractC10458p abstractC10458p = this.f68881A0; abstractC10458p != null; abstractC10458p = abstractC10458p.f30965r0) {
            abstractC10458p.mo10928B0();
        }
        super.mo10928B0();
    }

    @Override // p635a1.AbstractC10458p
    /* JADX INFO: renamed from: F0 */
    public final void mo10930F0() {
        super.mo10930F0();
        for (AbstractC10458p abstractC10458p = this.f68881A0; abstractC10458p != null; abstractC10458p = abstractC10458p.f30965r0) {
            abstractC10458p.mo10930F0();
        }
    }

    @Override // p635a1.AbstractC10458p
    /* JADX INFO: renamed from: G0 */
    public final void mo10931G0() {
        for (AbstractC10458p abstractC10458p = this.f68881A0; abstractC10458p != null; abstractC10458p = abstractC10458p.f30965r0) {
            abstractC10458p.mo10931G0();
        }
        super.mo10931G0();
    }

    @Override // p635a1.AbstractC10458p
    /* JADX INFO: renamed from: H0 */
    public final void mo10932H0() {
        super.mo10932H0();
        for (AbstractC10458p abstractC10458p = this.f68881A0; abstractC10458p != null; abstractC10458p = abstractC10458p.f30965r0) {
            abstractC10458p.mo10932H0();
        }
    }

    @Override // p635a1.AbstractC10458p
    /* JADX INFO: renamed from: I0 */
    public final void mo10933I0(AbstractC10458p abstractC10458p) {
        this.f30960Y = abstractC10458p;
        for (AbstractC10458p abstractC10458p2 = this.f68881A0; abstractC10458p2 != null; abstractC10458p2 = abstractC10458p2.f30965r0) {
            abstractC10458p2.mo10933I0(abstractC10458p);
        }
    }

    @Override // p635a1.AbstractC10458p
    /* JADX INFO: renamed from: J0 */
    public final void mo10934J0(AbstractC21678Y abstractC21678Y) {
        this.f30967t0 = abstractC21678Y;
        for (AbstractC10458p abstractC10458p = this.f68881A0; abstractC10458p != null; abstractC10458p = abstractC10458p.f30965r0) {
            abstractC10458p.mo10934J0(abstractC21678Y);
        }
    }

    /* JADX INFO: renamed from: K0 */
    public final void m22223K0(InterfaceC21704m interfaceC21704m) {
        AbstractC10458p abstractC10458p = ((AbstractC10458p) interfaceC21704m).f30960Y;
        if (abstractC10458p != interfaceC21704m) {
            AbstractC10458p abstractC10458p2 = interfaceC21704m instanceof AbstractC10458p ? (AbstractC10458p) interfaceC21704m : null;
            AbstractC10458p abstractC10458p3 = abstractC10458p2 != null ? abstractC10458p2.f30964q0 : null;
            if (abstractC10458p != this.f30960Y || !AbstractC16544l.m18089b(abstractC10458p3, this)) {
                throw new IllegalStateException("Cannot delegate to an already delegated node");
            }
            return;
        }
        if (abstractC10458p.f30972y0) {
            AbstractC8111i5.m8592c("Cannot delegate to an already attached node");
            throw null;
        }
        abstractC10458p.mo10933I0(this.f30960Y);
        int i10 = this.f30962o0;
        int iM22190g = AbstractC21679Z.m22190g(abstractC10458p);
        abstractC10458p.f30962o0 = iM22190g;
        int i11 = this.f30962o0;
        int i12 = iM22190g & 2;
        if (i12 != 0 && (i11 & 2) != 0 && !(this instanceof InterfaceC21718w)) {
            AbstractC8111i5.m8592c("Delegating to multiple LayoutModifierNodes without the delegating node implementing LayoutModifierNode itself is not allowed.\nDelegating Node: " + this + "\nDelegate Node: " + abstractC10458p);
            throw null;
        }
        abstractC10458p.f30965r0 = this.f68881A0;
        this.f68881A0 = abstractC10458p;
        abstractC10458p.f30964q0 = this;
        m22225M0(iM22190g | i11, false);
        if (this.f30972y0) {
            if (i12 == 0 || (i10 & 2) != 0) {
                mo10934J0(this.f30967t0);
            } else {
                C1313k c1313k = AbstractC21690f.m22217v(this).f68638I0;
                this.f30960Y.mo10934J0(null);
                c1313k.m2025l();
            }
            abstractC10458p.mo10927A0();
            abstractC10458p.mo10931G0();
            AbstractC21679Z.m22184a(abstractC10458p);
        }
    }

    /* JADX INFO: renamed from: L0 */
    public final void m22224L0(InterfaceC21704m interfaceC21704m) {
        AbstractC10458p abstractC10458p = null;
        for (AbstractC10458p abstractC10458p2 = this.f68881A0; abstractC10458p2 != null; abstractC10458p2 = abstractC10458p2.f30965r0) {
            if (abstractC10458p2 == interfaceC21704m) {
                boolean z6 = abstractC10458p2.f30972y0;
                if (z6) {
                    C12948A c12948a = AbstractC21679Z.f68822a;
                    if (!z6) {
                        AbstractC8111i5.m8592c("autoInvalidateRemovedNode called on unattached node");
                        throw null;
                    }
                    AbstractC21679Z.m22185b(abstractC10458p2, -1, 2);
                    abstractC10458p2.mo10932H0();
                    abstractC10458p2.mo10928B0();
                }
                abstractC10458p2.mo10933I0(abstractC10458p2);
                abstractC10458p2.f30963p0 = 0;
                if (abstractC10458p == null) {
                    this.f68881A0 = abstractC10458p2.f30965r0;
                } else {
                    abstractC10458p.f30965r0 = abstractC10458p2.f30965r0;
                }
                abstractC10458p2.f30965r0 = null;
                abstractC10458p2.f30964q0 = null;
                int i10 = this.f30962o0;
                int iM22190g = AbstractC21679Z.m22190g(this);
                m22225M0(iM22190g, true);
                if (this.f30972y0 && (i10 & 2) != 0 && (iM22190g & 2) == 0) {
                    C1313k c1313k = AbstractC21690f.m22217v(this).f68638I0;
                    this.f30960Y.mo10934J0(null);
                    c1313k.m2025l();
                    return;
                }
                return;
            }
            abstractC10458p = abstractC10458p2;
        }
        throw new IllegalStateException(("Could not find delegate: " + interfaceC21704m).toString());
    }

    /* JADX INFO: renamed from: M0 */
    public final void m22225M0(int i10, boolean z6) {
        AbstractC10458p abstractC10458p;
        int i11 = this.f30962o0;
        this.f30962o0 = i10;
        if (i11 != i10) {
            AbstractC10458p abstractC10458p2 = this.f30960Y;
            if (abstractC10458p2 == this) {
                this.f30963p0 = i10;
            }
            if (this.f30972y0) {
                AbstractC10458p abstractC10458p3 = this;
                while (abstractC10458p3 != null) {
                    i10 |= abstractC10458p3.f30962o0;
                    abstractC10458p3.f30962o0 = i10;
                    if (abstractC10458p3 == abstractC10458p2) {
                        break;
                    } else {
                        abstractC10458p3 = abstractC10458p3.f30964q0;
                    }
                }
                if (z6 && abstractC10458p3 == abstractC10458p2) {
                    i10 = AbstractC21679Z.m22190g(abstractC10458p2);
                    abstractC10458p2.f30962o0 = i10;
                }
                int i12 = i10 | ((abstractC10458p3 == null || (abstractC10458p = abstractC10458p3.f30965r0) == null) ? 0 : abstractC10458p.f30963p0);
                while (abstractC10458p3 != null) {
                    i12 |= abstractC10458p3.f30962o0;
                    abstractC10458p3.f30963p0 = i12;
                    abstractC10458p3 = abstractC10458p3.f30964q0;
                }
            }
        }
    }
}
