package p737f1;

import p049Bm.InterfaceC1436k;
import p1140z1.AbstractC21690f;
import p1140z1.AbstractC21706n;
import p392Q0.C6546d;
import p635a1.AbstractC10458p;

/* JADX INFO: renamed from: f1.n */
/* JADX INFO: loaded from: classes.dex */
public final class C13522n {

    /* JADX INFO: renamed from: b */
    public static final C13522n f42803b = new C13522n();

    /* JADX INFO: renamed from: c */
    public static final C13522n f42804c = new C13522n();

    /* JADX INFO: renamed from: a */
    public final C6546d f42805a = new C6546d(new InterfaceC13523o[16]);

    /* JADX INFO: renamed from: a */
    public final boolean m15072a(InterfaceC1436k interfaceC1436k) {
        if (this == f42803b) {
            throw new IllegalStateException("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
        }
        if (this == f42804c) {
            throw new IllegalStateException("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
        }
        C6546d c6546d = this.f42805a;
        if (!c6546d.m7109n()) {
            throw new IllegalStateException("\n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
        }
        int i10 = c6546d.f21184o0;
        if (i10 <= 0) {
            return false;
        }
        Object[] objArr = c6546d.f21182Y;
        int i11 = 0;
        boolean z6 = false;
        do {
            AbstractC10458p abstractC10458p = ((AbstractC10458p) ((InterfaceC13523o) objArr[i11])).f30960Y;
            if (!abstractC10458p.f30972y0) {
                throw new IllegalStateException("visitChildren called on an unattached node");
            }
            C6546d c6546d2 = new C6546d(new AbstractC10458p[16]);
            AbstractC10458p abstractC10458p2 = abstractC10458p.f30965r0;
            if (abstractC10458p2 == null) {
                AbstractC21690f.m22197b(c6546d2, abstractC10458p);
            } else {
                c6546d2.m7099c(abstractC10458p2);
            }
            while (c6546d2.m7109n()) {
                AbstractC10458p abstractC10458pM22201f = (AbstractC10458p) c6546d2.m7111p(c6546d2.f21184o0 - 1);
                if ((abstractC10458pM22201f.f30963p0 & 1024) == 0) {
                    AbstractC21690f.m22197b(c6546d2, abstractC10458pM22201f);
                } else {
                    while (abstractC10458pM22201f != null) {
                        if ((abstractC10458pM22201f.f30962o0 & 1024) != 0) {
                            C6546d c6546d3 = null;
                            while (abstractC10458pM22201f != null) {
                                if (abstractC10458pM22201f instanceof C13526r) {
                                    C13526r c13526r = (C13526r) abstractC10458pM22201f;
                                    if (c13526r.m15077K0().f42791a ? ((Boolean) interfaceC1436k.invoke(c13526r)).booleanValue() : AbstractC13512d.m15048i(c13526r, 7, interfaceC1436k)) {
                                        z6 = true;
                                        break;
                                    }
                                } else if (((abstractC10458pM22201f.f30962o0 & 1024) != 0) && (abstractC10458pM22201f instanceof AbstractC21706n)) {
                                    int i12 = 0;
                                    for (AbstractC10458p abstractC10458p3 = ((AbstractC21706n) abstractC10458pM22201f).f68881A0; abstractC10458p3 != null; abstractC10458p3 = abstractC10458p3.f30965r0) {
                                        if ((abstractC10458p3.f30962o0 & 1024) != 0) {
                                            i12++;
                                            if (i12 == 1) {
                                                abstractC10458pM22201f = abstractC10458p3;
                                            } else {
                                                if (c6546d3 == null) {
                                                    c6546d3 = new C6546d(new AbstractC10458p[16]);
                                                }
                                                if (abstractC10458pM22201f != null) {
                                                    c6546d3.m7099c(abstractC10458pM22201f);
                                                    abstractC10458pM22201f = null;
                                                }
                                                c6546d3.m7099c(abstractC10458p3);
                                            }
                                        }
                                    }
                                    if (i12 == 1) {
                                    }
                                }
                                abstractC10458pM22201f = AbstractC21690f.m22201f(c6546d3);
                            }
                            break;
                        }
                        abstractC10458pM22201f = abstractC10458pM22201f.f30965r0;
                    }
                }
            }
            i11++;
        } while (i11 < i10);
        return z6;
    }

    /* JADX INFO: renamed from: b */
    public final void m15073b() {
        m15072a(C13516h.f42788q0);
    }
}
