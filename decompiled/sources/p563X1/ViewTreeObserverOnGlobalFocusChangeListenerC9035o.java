package p563X1;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.compose.p650ui.focus.C10863b;
import androidx.compose.p650ui.node.Owner;
import p001A.C0093v0;
import p025An.C0644w;
import p1140z1.AbstractC21690f;
import p1140z1.AbstractC21706n;
import p392Q0.C6546d;
import p482Tg.C7445b0;
import p523V9.AbstractC8111i5;
import p635a1.AbstractC10458p;
import p737f1.AbstractC13512d;
import p737f1.C13526r;
import p737f1.InterfaceC13515g;
import p737f1.InterfaceC13517i;
import p737f1.InterfaceC13520l;

/* JADX INFO: renamed from: X1.o */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnGlobalFocusChangeListenerC9035o extends AbstractC10458p implements InterfaceC13520l, ViewTreeObserver.OnGlobalFocusChangeListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: z0 */
    public View f27588z0;

    @Override // p635a1.AbstractC10458p
    /* JADX INFO: renamed from: C0 */
    public final void mo438C0() {
        AbstractC9031k.m9601c(this).addOnAttachStateChangeListener(this);
    }

    @Override // p635a1.AbstractC10458p
    /* JADX INFO: renamed from: D0 */
    public final void mo4226D0() {
        AbstractC9031k.m9601c(this).removeOnAttachStateChangeListener(this);
        this.f27588z0 = null;
    }

    /* JADX INFO: renamed from: K0 */
    public final C13526r m9603K0() {
        AbstractC10458p abstractC10458p = this.f30960Y;
        if (!abstractC10458p.f30972y0) {
            AbstractC8111i5.m8592c("visitLocalDescendants called on an unattached node");
            throw null;
        }
        if ((abstractC10458p.f30963p0 & 1024) != 0) {
            boolean z6 = false;
            for (AbstractC10458p abstractC10458p2 = abstractC10458p.f30965r0; abstractC10458p2 != null; abstractC10458p2 = abstractC10458p2.f30965r0) {
                if ((abstractC10458p2.f30962o0 & 1024) != 0) {
                    AbstractC10458p abstractC10458pM22201f = abstractC10458p2;
                    C6546d c6546d = null;
                    while (abstractC10458pM22201f != null) {
                        if (abstractC10458pM22201f instanceof C13526r) {
                            C13526r c13526r = (C13526r) abstractC10458pM22201f;
                            if (z6) {
                                return c13526r;
                            }
                            z6 = true;
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
            }
        }
        throw new IllegalStateException("Could not find focus target of embedded view wrapper");
    }

    @Override // p737f1.InterfaceC13520l
    /* JADX INFO: renamed from: g0 */
    public final void mo9604g0(InterfaceC13517i interfaceC13517i) {
        interfaceC13517i.mo15070c(false);
        interfaceC13517i.mo15069b(new C7445b0(1, this, ViewTreeObserverOnGlobalFocusChangeListenerC9035o.class, "onEnter", "onEnter-3ESFkO8(I)Landroidx/compose/ui/focus/FocusRequester;", 0, 4));
        interfaceC13517i.mo15071d(new C7445b0(1, this, ViewTreeObserverOnGlobalFocusChangeListenerC9035o.class, "onExit", "onExit-3ESFkO8(I)Landroidx/compose/ui/focus/FocusRequester;", 0, 5));
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public final void onGlobalFocusChanged(View view, View view2) {
        if (AbstractC21690f.m22217v(this).f68658u0 == null) {
            return;
        }
        View viewM9601c = AbstractC9031k.m9601c(this);
        InterfaceC13515g focusOwner = AbstractC21690f.m22218w(this).getFocusOwner();
        Owner ownerM22218w = AbstractC21690f.m22218w(this);
        boolean z6 = (view == null || view.equals(ownerM22218w) || !AbstractC9031k.m9599a(viewM9601c, view)) ? false : true;
        boolean z10 = (view2 == null || view2.equals(ownerM22218w) || !AbstractC9031k.m9599a(viewM9601c, view2)) ? false : true;
        if (z6 && z10) {
            this.f27588z0 = view2;
            return;
        }
        if (!z10) {
            if (!z6) {
                this.f27588z0 = null;
                return;
            }
            this.f27588z0 = null;
            if (m9603K0().m15078L0().m15074a()) {
                ((C10863b) focusOwner).m11301a(8, false, false);
                return;
            }
            return;
        }
        this.f27588z0 = view2;
        C13526r c13526rM9603K0 = m9603K0();
        int iOrdinal = c13526rM9603K0.m15078L0().ordinal();
        if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2) {
            return;
        }
        if (iOrdinal != 3) {
            throw new C0644w();
        }
        C0093v0 c0093v0 = ((C10863b) focusOwner).f32700h;
        try {
            if (c0093v0.f403Z) {
                C0093v0.m329a(c0093v0);
            }
            c0093v0.f403Z = true;
            AbstractC13512d.m15062w(c13526rM9603K0);
        } finally {
            C0093v0.m330b(c0093v0);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.getViewTreeObserver().addOnGlobalFocusChangeListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        view.getViewTreeObserver().removeOnGlobalFocusChangeListener(this);
    }
}
