package p737f1;

import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.p650ui.focus.C10863b;
import androidx.compose.p650ui.platform.AndroidComposeView;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16525B;
import p001A.AbstractC0010F;
import p001A.C0093v0;
import p025An.C0644w;
import p045Bj.C1313k;
import p049Bm.InterfaceC1436k;
import p1071w0.AbstractC20734X;
import p1095x1.AbstractC21075b0;
import p1095x1.AbstractC21082f;
import p1117y1.C21368h;
import p1140z1.AbstractC21678Y;
import p1140z1.AbstractC21690f;
import p1140z1.AbstractC21706n;
import p1140z1.C21658D;
import p1140z1.C21703l0;
import p200Hm.C3508g;
import p229J0.C4041e;
import p392Q0.C6546d;
import p482Tg.C7448e;
import p635a1.AbstractC10458p;
import p759g1.C13801c;
import p784hb.C14438g;
import p953q0.C18593n;
import p953q0.C18595p;
import p953q0.C18596q;
import p953q0.InterfaceC18597r;

/* JADX INFO: renamed from: f1.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC13512d {

    /* JADX INFO: renamed from: a */
    public static final int[] f42775a = new int[2];

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: A */
    public static final boolean m15028A(InterfaceC13523o interfaceC13523o) {
        AbstractC10458p abstractC10458p = (AbstractC10458p) interfaceC13523o;
        AbstractC10458p abstractC10458pM22201f = abstractC10458p.f30960Y;
        C6546d c6546d = null;
        while (true) {
            C13516h c13516h = C13516h.f42789r0;
            int i10 = 0;
            if (abstractC10458pM22201f == null) {
                AbstractC10458p abstractC10458p2 = abstractC10458p.f30960Y;
                if (!abstractC10458p2.f30972y0) {
                    throw new IllegalStateException("visitChildren called on an unattached node");
                }
                C6546d c6546d2 = new C6546d(new AbstractC10458p[16]);
                AbstractC10458p abstractC10458p3 = abstractC10458p2.f30965r0;
                if (abstractC10458p3 == null) {
                    AbstractC21690f.m22197b(c6546d2, abstractC10458p2);
                } else {
                    c6546d2.m7099c(abstractC10458p3);
                }
                while (c6546d2.m7109n()) {
                    AbstractC10458p abstractC10458pM22201f2 = (AbstractC10458p) c6546d2.m7111p(c6546d2.f21184o0 - 1);
                    if ((abstractC10458pM22201f2.f30963p0 & 1024) == 0) {
                        AbstractC21690f.m22197b(c6546d2, abstractC10458pM22201f2);
                    } else {
                        while (abstractC10458pM22201f2 != null) {
                            if ((abstractC10458pM22201f2.f30962o0 & 1024) != 0) {
                                C6546d c6546d3 = null;
                                while (abstractC10458pM22201f2 != null) {
                                    if (abstractC10458pM22201f2 instanceof C13526r) {
                                        C13526r c13526r = (C13526r) abstractC10458pM22201f2;
                                        return c13526r.m15077K0().f42791a ? m15029B(c13526r) : m15048i(c13526r, 7, c13516h);
                                    }
                                    if ((abstractC10458pM22201f2.f30962o0 & 1024) != 0 && (abstractC10458pM22201f2 instanceof AbstractC21706n)) {
                                        int i11 = 0;
                                        for (AbstractC10458p abstractC10458p4 = ((AbstractC21706n) abstractC10458pM22201f2).f68881A0; abstractC10458p4 != null; abstractC10458p4 = abstractC10458p4.f30965r0) {
                                            if ((abstractC10458p4.f30962o0 & 1024) != 0) {
                                                i11++;
                                                if (i11 == 1) {
                                                    abstractC10458pM22201f2 = abstractC10458p4;
                                                } else {
                                                    if (c6546d3 == null) {
                                                        c6546d3 = new C6546d(new AbstractC10458p[16]);
                                                    }
                                                    if (abstractC10458pM22201f2 != null) {
                                                        c6546d3.m7099c(abstractC10458pM22201f2);
                                                        abstractC10458pM22201f2 = null;
                                                    }
                                                    c6546d3.m7099c(abstractC10458p4);
                                                }
                                            }
                                        }
                                        if (i11 == 1) {
                                        }
                                    }
                                    abstractC10458pM22201f2 = AbstractC21690f.m22201f(c6546d3);
                                }
                                break;
                            }
                            abstractC10458pM22201f2 = abstractC10458pM22201f2.f30965r0;
                        }
                    }
                }
                return false;
            }
            if (abstractC10458pM22201f instanceof C13526r) {
                C13526r c13526r2 = (C13526r) abstractC10458pM22201f;
                return c13526r2.m15077K0().f42791a ? m15029B(c13526r2) : m15048i(c13526r2, 7, c13516h);
            }
            if ((abstractC10458pM22201f.f30962o0 & 1024) != 0 && (abstractC10458pM22201f instanceof AbstractC21706n)) {
                for (AbstractC10458p abstractC10458p5 = ((AbstractC21706n) abstractC10458pM22201f).f68881A0; abstractC10458p5 != null; abstractC10458p5 = abstractC10458p5.f30965r0) {
                    if ((abstractC10458p5.f30962o0 & 1024) != 0) {
                        i10++;
                        if (i10 == 1) {
                            abstractC10458pM22201f = abstractC10458p5;
                        } else {
                            if (c6546d == null) {
                                c6546d = new C6546d(new AbstractC10458p[16]);
                            }
                            if (abstractC10458pM22201f != null) {
                                c6546d.m7099c(abstractC10458pM22201f);
                                abstractC10458pM22201f = null;
                            }
                            c6546d.m7099c(abstractC10458p5);
                        }
                    }
                }
                if (i10 == 1) {
                }
            }
            abstractC10458pM22201f = AbstractC21690f.m22201f(c6546d);
        }
    }

    /* JADX INFO: renamed from: B */
    public static final boolean m15029B(C13526r c13526r) {
        Boolean boolM15030C = m15030C(c13526r, 7);
        if (boolM15030C != null) {
            return boolM15030C.booleanValue();
        }
        return false;
    }

    /* JADX INFO: renamed from: C */
    public static final Boolean m15030C(C13526r c13526r, int i10) {
        Boolean boolValueOf;
        C0093v0 c0093v0M15033F = m15033F(c13526r);
        C13527s c13527s = new C13527s(c13526r, 1);
        try {
            if (c0093v0M15033F.f403Z) {
                C0093v0.m329a(c0093v0M15033F);
            }
            c0093v0M15033F.f403Z = true;
            ((C6546d) c0093v0M15033F.f405p0).m7099c(c13527s);
            int iM24h = AbstractC0010F.m24h(m15061v(c13526r, i10));
            if (iM24h == 0) {
                boolValueOf = Boolean.valueOf(m15062w(c13526r));
            } else if (iM24h == 1) {
                boolValueOf = null;
            } else if (iM24h == 2) {
                boolValueOf = Boolean.TRUE;
            } else {
                if (iM24h != 3) {
                    throw new C0644w();
                }
                boolValueOf = null;
            }
            C0093v0.m330b(c0093v0M15033F);
            return boolValueOf;
        } catch (Throwable th2) {
            C0093v0.m330b(c0093v0M15033F);
            throw th2;
        }
    }

    /* JADX INFO: renamed from: D */
    public static final boolean m15031D(C13526r c13526r, C13526r c13526r2) {
        AbstractC10458p abstractC10458pM22201f;
        AbstractC10458p abstractC10458pM22201f2;
        C1313k c1313k;
        C1313k c1313k2;
        AbstractC10458p abstractC10458p = c13526r2.f30960Y;
        if (!abstractC10458p.f30972y0) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        AbstractC10458p abstractC10458p2 = abstractC10458p.f30964q0;
        C21658D c21658dM22217v = AbstractC21690f.m22217v(c13526r2);
        loop0: while (true) {
            if (c21658dM22217v == null) {
                abstractC10458pM22201f = null;
                break;
            }
            if ((((AbstractC10458p) c21658dM22217v.f68638I0.f3471f).f30963p0 & 1024) != 0) {
                while (abstractC10458p2 != null) {
                    if ((abstractC10458p2.f30962o0 & 1024) != 0) {
                        abstractC10458pM22201f = abstractC10458p2;
                        C6546d c6546d = null;
                        while (abstractC10458pM22201f != null) {
                            if (abstractC10458pM22201f instanceof C13526r) {
                                break loop0;
                            }
                            if ((abstractC10458pM22201f.f30962o0 & 1024) != 0 && (abstractC10458pM22201f instanceof AbstractC21706n)) {
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
            abstractC10458p2 = (c21658dM22217v == null || (c1313k2 = c21658dM22217v.f68638I0) == null) ? null : (C21703l0) c1313k2.f3470e;
        }
        if (!AbstractC16544l.m18089b(abstractC10458pM22201f, c13526r)) {
            throw new IllegalStateException("Non child node cannot request focus.");
        }
        int iOrdinal = c13526r.m15078L0().ordinal();
        EnumC13525q enumC13525q = EnumC13525q.f42808Z;
        if (iOrdinal == 0) {
            m15055p(c13526r2);
            c13526r.m15080P0(enumC13525q);
        } else if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                return false;
            }
            if (iOrdinal != 3) {
                throw new C0644w();
            }
            AbstractC10458p abstractC10458p4 = c13526r.f30960Y;
            if (!abstractC10458p4.f30972y0) {
                throw new IllegalStateException("visitAncestors called on an unattached node");
            }
            AbstractC10458p abstractC10458p5 = abstractC10458p4.f30964q0;
            C21658D c21658dM22217v2 = AbstractC21690f.m22217v(c13526r);
            loop4: while (true) {
                if (c21658dM22217v2 == null) {
                    abstractC10458pM22201f2 = null;
                    break;
                }
                if ((((AbstractC10458p) c21658dM22217v2.f68638I0.f3471f).f30963p0 & 1024) != 0) {
                    while (abstractC10458p5 != null) {
                        if ((abstractC10458p5.f30962o0 & 1024) != 0) {
                            abstractC10458pM22201f2 = abstractC10458p5;
                            C6546d c6546d2 = null;
                            while (abstractC10458pM22201f2 != null) {
                                if (abstractC10458pM22201f2 instanceof C13526r) {
                                    break loop4;
                                }
                                if ((abstractC10458pM22201f2.f30962o0 & 1024) != 0 && (abstractC10458pM22201f2 instanceof AbstractC21706n)) {
                                    int i11 = 0;
                                    for (AbstractC10458p abstractC10458p6 = ((AbstractC21706n) abstractC10458pM22201f2).f68881A0; abstractC10458p6 != null; abstractC10458p6 = abstractC10458p6.f30965r0) {
                                        if ((abstractC10458p6.f30962o0 & 1024) != 0) {
                                            i11++;
                                            if (i11 == 1) {
                                                abstractC10458pM22201f2 = abstractC10458p6;
                                            } else {
                                                if (c6546d2 == null) {
                                                    c6546d2 = new C6546d(new AbstractC10458p[16]);
                                                }
                                                if (abstractC10458pM22201f2 != null) {
                                                    c6546d2.m7099c(abstractC10458pM22201f2);
                                                    abstractC10458pM22201f2 = null;
                                                }
                                                c6546d2.m7099c(abstractC10458p6);
                                            }
                                        }
                                    }
                                    if (i11 == 1) {
                                    }
                                }
                                abstractC10458pM22201f2 = AbstractC21690f.m22201f(c6546d2);
                            }
                        }
                        abstractC10458p5 = abstractC10458p5.f30964q0;
                    }
                }
                c21658dM22217v2 = c21658dM22217v2.m22009G();
                abstractC10458p5 = (c21658dM22217v2 == null || (c1313k = c21658dM22217v2.f68638I0) == null) ? null : (C21703l0) c1313k.f3470e;
            }
            C13526r c13526r3 = (C13526r) abstractC10458pM22201f2;
            if (c13526r3 != null || !((Boolean) ((C10863b) AbstractC21690f.m22218w(c13526r).getFocusOwner()).f32693a.invoke(null, null)).booleanValue()) {
                if (c13526r3 == null || !m15031D(c13526r3, c13526r)) {
                    return false;
                }
                boolean zM15031D = m15031D(c13526r, c13526r2);
                if (c13526r.m15078L0() != enumC13525q) {
                    throw new IllegalStateException("Deactivated node is focused");
                }
                if (!zM15031D) {
                    return zM15031D;
                }
                m15065z(c13526r3);
                return zM15031D;
            }
            m15055p(c13526r2);
            c13526r.m15080P0(enumC13525q);
        } else {
            if (m15053n(c13526r) == null) {
                throw new IllegalArgumentException("ActiveParent with no focused child");
            }
            C13526r c13526rM15053n = m15053n(c13526r);
            if (!(c13526rM15053n != null ? m15044e(c13526rM15053n, false, true) : true)) {
                return false;
            }
            m15055p(c13526r2);
        }
        return true;
    }

    /* JADX INFO: renamed from: E */
    public static final boolean m15032E(View view, Integer num, Rect rect) {
        if (num == null) {
            return view.requestFocus();
        }
        if (!(view instanceof ViewGroup)) {
            return view.requestFocus(num.intValue(), rect);
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (viewGroup.isFocused()) {
            return true;
        }
        if (viewGroup.isFocusable() && !view.hasFocus()) {
            return view.requestFocus(num.intValue(), rect);
        }
        if (view instanceof AndroidComposeView) {
            return view.requestFocus(num.intValue(), rect);
        }
        if (rect != null) {
            View viewFindNextFocusFromRect = FocusFinder.getInstance().findNextFocusFromRect(viewGroup, rect, num.intValue());
            return viewFindNextFocusFromRect != null ? viewFindNextFocusFromRect.requestFocus(num.intValue(), rect) : view.requestFocus(num.intValue(), rect);
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(viewGroup, view.hasFocus() ? view.findFocus() : null, num.intValue());
        return viewFindNextFocus != null ? viewFindNextFocus.requestFocus(num.intValue()) : view.requestFocus(num.intValue());
    }

    /* JADX INFO: renamed from: F */
    public static final C0093v0 m15033F(C13526r c13526r) {
        return ((C10863b) AbstractC21690f.m22218w(c13526r).getFocusOwner()).f32700h;
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00a9 A[PHI: r0
      0x00a9: PHI (r0v17 int) = (r0v4 int), (r0v5 int), (r0v6 int), (r0v7 int) binds: [B:53:0x00a7, B:56:0x00b0, B:59:0x00b8, B:62:0x00c0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: G */
    public static final Object m15034G(C13526r c13526r, int i10, InterfaceC1436k interfaceC1436k) {
        int i11;
        Object objInvoke;
        AbstractC10458p abstractC10458pM22201f;
        C1313k c1313k;
        AbstractC10458p abstractC10458p = c13526r.f30960Y;
        if (!abstractC10458p.f30972y0) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        AbstractC10458p abstractC10458p2 = abstractC10458p.f30964q0;
        C21658D c21658dM22217v = AbstractC21690f.m22217v(c13526r);
        loop0: while (true) {
            i11 = 1;
            objInvoke = null;
            if (c21658dM22217v == null) {
                abstractC10458pM22201f = null;
                break;
            }
            if ((((AbstractC10458p) c21658dM22217v.f68638I0.f3471f).f30963p0 & 1024) != 0) {
                while (abstractC10458p2 != null) {
                    if ((abstractC10458p2.f30962o0 & 1024) != 0) {
                        abstractC10458pM22201f = abstractC10458p2;
                        C6546d c6546d = null;
                        while (abstractC10458pM22201f != null) {
                            if (abstractC10458pM22201f instanceof C13526r) {
                                break loop0;
                            }
                            if ((abstractC10458pM22201f.f30962o0 & 1024) != 0 && (abstractC10458pM22201f instanceof AbstractC21706n)) {
                                int i12 = 0;
                                for (AbstractC10458p abstractC10458p3 = ((AbstractC21706n) abstractC10458pM22201f).f68881A0; abstractC10458p3 != null; abstractC10458p3 = abstractC10458p3.f30965r0) {
                                    if ((abstractC10458p3.f30962o0 & 1024) != 0) {
                                        i12++;
                                        if (i12 == 1) {
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
                                if (i12 == 1) {
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
        C13526r c13526r2 = (C13526r) abstractC10458pM22201f;
        if (c13526r2 != null) {
            C21368h c21368h = AbstractC21082f.f67006a;
            if (AbstractC16544l.m18089b((C18596q) AbstractC20734X.m21230a(c13526r2, c21368h), (C18596q) AbstractC20734X.m21230a(c13526r, c21368h))) {
                return null;
            }
        }
        C18596q c18596q = (C18596q) AbstractC20734X.m21230a(c13526r, AbstractC21082f.f67006a);
        if (c18596q == null) {
            return null;
        }
        int i13 = 5;
        if (C13510b.m15026a(i10, 5)) {
            i11 = i13;
        } else {
            i13 = 6;
            if (C13510b.m15026a(i10, 6)) {
                i11 = i13;
            } else {
                i13 = 3;
                if (C13510b.m15026a(i10, 3)) {
                    i11 = i13;
                } else {
                    i13 = 4;
                    if (C13510b.m15026a(i10, 4)) {
                        i11 = i13;
                    } else if (C13510b.m15026a(i10, 1)) {
                        i11 = 2;
                    } else if (!C13510b.m15026a(i10, 2)) {
                        throw new IllegalStateException("Unsupported direction for beyond bounds layout");
                    }
                }
            }
        }
        InterfaceC18597r interfaceC18597r = c18596q.f59239Y;
        if (interfaceC18597r.mo19797b() <= 0 || !interfaceC18597r.mo19799d()) {
            return interfaceC1436k.invoke(C18596q.f59238r0);
        }
        int iMo19796a = c18596q.m19954i(i11) ? interfaceC18597r.mo19796a() : interfaceC18597r.mo19800e();
        C16525B c16525b = new C16525B();
        C14438g c14438g = c18596q.f59240Z;
        c14438g.getClass();
        C18593n c18593n = new C18593n(iMo19796a, iMo19796a);
        C6546d c6546d2 = (C6546d) c14438g.f45414Y;
        c6546d2.m7099c(c18593n);
        c16525b.f51262Y = c18593n;
        while (objInvoke == null && c18596q.m19953a((C18593n) c16525b.f51262Y, i11)) {
            C18593n c18593n2 = (C18593n) c16525b.f51262Y;
            int i14 = c18593n2.f59233a;
            boolean zM19954i = c18596q.m19954i(i11);
            int i15 = c18593n2.f59234b;
            if (zM19954i) {
                i15++;
            } else {
                i14--;
            }
            C18593n c18593n3 = new C18593n(i14, i15);
            c6546d2.m7099c(c18593n3);
            c6546d2.m7110o((C18593n) c16525b.f51262Y);
            c16525b.f51262Y = c18593n3;
            interfaceC18597r.mo19798c();
            objInvoke = interfaceC1436k.invoke(new C18595p(c18596q, c16525b, i11));
        }
        c6546d2.m7110o((C18593n) c16525b.f51262Y);
        interfaceC18597r.mo19798c();
        return objInvoke;
    }

    /* JADX INFO: renamed from: H */
    public static final boolean m15035H(int i10, C7448e c7448e, C13526r c13526r, C13801c c13801c) {
        C13526r c13526rM15047h;
        C6546d c6546d = new C6546d(new C13526r[16]);
        AbstractC10458p abstractC10458p = c13526r.f30960Y;
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
                                C13526r c13526r2 = (C13526r) abstractC10458pM22201f;
                                if (c13526r2.f30972y0) {
                                    c6546d.m7099c(c13526r2);
                                }
                            } else if ((abstractC10458pM22201f.f30962o0 & 1024) != 0 && (abstractC10458pM22201f instanceof AbstractC21706n)) {
                                int i11 = 0;
                                for (AbstractC10458p abstractC10458p3 = ((AbstractC21706n) abstractC10458pM22201f).f68881A0; abstractC10458p3 != null; abstractC10458p3 = abstractC10458p3.f30965r0) {
                                    if ((abstractC10458p3.f30962o0 & 1024) != 0) {
                                        i11++;
                                        if (i11 == 1) {
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
                                if (i11 == 1) {
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
        while (c6546d.m7109n() && (c13526rM15047h = m15047h(c6546d, c13801c, i10)) != null) {
            if (c13526rM15047h.m15077K0().f42791a) {
                return ((Boolean) c7448e.invoke(c13526rM15047h)).booleanValue();
            }
            if (m15051l(i10, c7448e, c13526rM15047h, c13801c)) {
                return true;
            }
            c6546d.m7110o(c13526rM15047h);
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:128:0x01ad  */
    /* JADX INFO: renamed from: I */
    public static final boolean m15036I(C13526r c13526r, C13526r c13526r2, int i10, C7448e c7448e) {
        AbstractC10458p abstractC10458p;
        C1313k c1313k;
        if (c13526r.m15078L0() != EnumC13525q.f42808Z) {
            throw new IllegalStateException("This function should only be used within a parent that has focus.");
        }
        Object[] objArrCopyOf = new C13526r[16];
        AbstractC10458p abstractC10458p2 = c13526r.f30960Y;
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
        int i11 = 0;
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
                                C13526r c13526r3 = (C13526r) abstractC10458pM22201f;
                                int i12 = i11 + 1;
                                if (objArrCopyOf.length < i12) {
                                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, Math.max(i12, objArrCopyOf.length * 2));
                                    AbstractC16544l.m18093f(objArrCopyOf, "copyOf(this, newSize)");
                                }
                                objArrCopyOf[i11] = c13526r3;
                                i11 = i12;
                            } else if ((abstractC10458pM22201f.f30962o0 & 1024) != 0 && (abstractC10458pM22201f instanceof AbstractC21706n)) {
                                int i13 = 0;
                                for (AbstractC10458p abstractC10458p4 = ((AbstractC21706n) abstractC10458pM22201f).f68881A0; abstractC10458p4 != null; abstractC10458p4 = abstractC10458p4.f30965r0) {
                                    if ((abstractC10458p4.f30962o0 & 1024) != 0) {
                                        i13++;
                                        if (i13 == 1) {
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
                                if (i13 == 1) {
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
        C13528t c13528t = C13528t.f42816Y;
        AbstractC16544l.m18094g(objArrCopyOf, "<this>");
        Arrays.sort(objArrCopyOf, 0, i11, c13528t);
        if (C13510b.m15026a(i10, 1)) {
            int i14 = new C3508g(0, i11 - 1, 1).f10592Z;
            if (i14 >= 0) {
                boolean z6 = false;
                int i15 = 0;
                while (true) {
                    if (z6) {
                        C13526r c13526r4 = (C13526r) objArrCopyOf[i15];
                        if (m15058s(c13526r4) && m15050k(c13526r4, c7448e)) {
                            return true;
                        }
                    }
                    if (AbstractC16544l.m18089b(objArrCopyOf[i15], c13526r2)) {
                        z6 = true;
                    }
                    if (i15 == i14) {
                        break;
                    }
                    i15++;
                }
            }
        } else {
            if (!C13510b.m15026a(i10, 2)) {
                throw new IllegalStateException("This function should only be used for 1-D focus search");
            }
            int i16 = new C3508g(0, i11 - 1, 1).f10592Z;
            if (i16 >= 0) {
                boolean z10 = false;
                while (true) {
                    if (z10) {
                        C13526r c13526r5 = (C13526r) objArrCopyOf[i16];
                        if (m15058s(c13526r5) && m15040a(c13526r5, c7448e)) {
                            return true;
                        }
                    }
                    if (AbstractC16544l.m18089b(objArrCopyOf[i16], c13526r2)) {
                        z10 = true;
                    }
                    if (i16 == 0) {
                        break;
                    }
                    i16--;
                }
            }
        }
        if (!C13510b.m15026a(i10, 1) && c13526r.m15077K0().f42791a) {
            AbstractC10458p abstractC10458p5 = c13526r.f30960Y;
            if (!abstractC10458p5.f30972y0) {
                throw new IllegalStateException("visitAncestors called on an unattached node");
            }
            AbstractC10458p abstractC10458p6 = abstractC10458p5.f30964q0;
            C21658D c21658dM22217v = AbstractC21690f.m22217v(c13526r);
            while (c21658dM22217v != null) {
                if ((((AbstractC10458p) c21658dM22217v.f68638I0.f3471f).f30963p0 & 1024) != 0) {
                    while (abstractC10458p6 != null) {
                        if ((abstractC10458p6.f30962o0 & 1024) != 0) {
                            AbstractC10458p abstractC10458pM22201f2 = abstractC10458p6;
                            C6546d c6546d3 = null;
                            while (abstractC10458pM22201f2 != null) {
                                if (abstractC10458pM22201f2 instanceof C13526r) {
                                    abstractC10458p = abstractC10458pM22201f2;
                                    if (abstractC10458p != null) {
                                        return ((Boolean) c7448e.invoke(c13526r)).booleanValue();
                                    }
                                } else {
                                    if ((abstractC10458pM22201f2.f30962o0 & 1024) != 0 && (abstractC10458pM22201f2 instanceof AbstractC21706n)) {
                                        int i17 = 0;
                                        for (AbstractC10458p abstractC10458p7 = ((AbstractC21706n) abstractC10458pM22201f2).f68881A0; abstractC10458p7 != null; abstractC10458p7 = abstractC10458p7.f30965r0) {
                                            if ((abstractC10458p7.f30962o0 & 1024) != 0) {
                                                i17++;
                                                if (i17 == 1) {
                                                    abstractC10458pM22201f2 = abstractC10458p7;
                                                } else {
                                                    if (c6546d3 == null) {
                                                        c6546d3 = new C6546d(new AbstractC10458p[16]);
                                                    }
                                                    if (abstractC10458pM22201f2 != null) {
                                                        c6546d3.m7099c(abstractC10458pM22201f2);
                                                        abstractC10458pM22201f2 = null;
                                                    }
                                                    c6546d3.m7099c(abstractC10458p7);
                                                }
                                            }
                                        }
                                        if (i17 == 1) {
                                        }
                                    }
                                    abstractC10458pM22201f2 = AbstractC21690f.m22201f(c6546d3);
                                }
                            }
                        }
                        abstractC10458p6 = abstractC10458p6.f30964q0;
                    }
                }
                c21658dM22217v = c21658dM22217v.m22009G();
                abstractC10458p6 = (c21658dM22217v == null || (c1313k = c21658dM22217v.f68638I0) == null) ? null : (C21703l0) c1313k.f3470e;
            }
            abstractC10458p = null;
            if (abstractC10458p != null) {
                return ((Boolean) c7448e.invoke(c13526r)).booleanValue();
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: J */
    public static final Integer m15037J(int i10) {
        if (C13510b.m15026a(i10, 5)) {
            return 33;
        }
        if (C13510b.m15026a(i10, 6)) {
            return 130;
        }
        if (C13510b.m15026a(i10, 3)) {
            return 17;
        }
        if (C13510b.m15026a(i10, 4)) {
            return 66;
        }
        if (C13510b.m15026a(i10, 1)) {
            return 2;
        }
        return C13510b.m15026a(i10, 2) ? 1 : null;
    }

    /* JADX INFO: renamed from: K */
    public static final C13510b m15038K(int i10) {
        if (i10 == 1) {
            return new C13510b(2);
        }
        if (i10 == 2) {
            return new C13510b(1);
        }
        if (i10 == 17) {
            return new C13510b(3);
        }
        if (i10 == 33) {
            return new C13510b(5);
        }
        if (i10 == 66) {
            return new C13510b(4);
        }
        if (i10 != 130) {
            return null;
        }
        return new C13510b(6);
    }

    /* JADX INFO: renamed from: L */
    public static final Boolean m15039L(int i10, C7448e c7448e, C13526r c13526r, C13801c c13801c) {
        int iOrdinal = c13526r.m15078L0().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                C13526r c13526rM15053n = m15053n(c13526r);
                if (c13526rM15053n == null) {
                    throw new IllegalStateException("ActiveParent must have a focusedChild");
                }
                int iOrdinal2 = c13526rM15053n.m15078L0().ordinal();
                if (iOrdinal2 != 0) {
                    if (iOrdinal2 == 1) {
                        Boolean boolM15039L = m15039L(i10, c7448e, c13526rM15053n, c13801c);
                        if (!AbstractC16544l.m18089b(boolM15039L, Boolean.FALSE)) {
                            return boolM15039L;
                        }
                        if (c13801c == null) {
                            if (c13526rM15053n.m15078L0() != EnumC13525q.f42808Z) {
                                throw new IllegalStateException("Searching for active node in inactive hierarchy");
                            }
                            C13526r c13526rM15046g = m15046g(c13526rM15053n);
                            if (c13526rM15046g == null) {
                                throw new IllegalStateException("ActiveParent must have a focusedChild");
                            }
                            c13801c = m15049j(c13526rM15046g);
                        }
                        return Boolean.valueOf(m15051l(i10, c7448e, c13526r, c13801c));
                    }
                    if (iOrdinal2 != 2) {
                        if (iOrdinal2 != 3) {
                            throw new C0644w();
                        }
                        throw new IllegalStateException("ActiveParent must have a focusedChild");
                    }
                }
                if (c13801c == null) {
                    c13801c = m15049j(c13526rM15053n);
                }
                return Boolean.valueOf(m15051l(i10, c7448e, c13526r, c13801c));
            }
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    throw new C0644w();
                }
                if (c13526r.m15077K0().f42791a) {
                    return (Boolean) c7448e.invoke(c13526r);
                }
                return c13801c == null ? Boolean.valueOf(m15048i(c13526r, i10, c7448e)) : Boolean.valueOf(m15035H(i10, c7448e, c13526r, c13801c));
            }
        }
        return Boolean.valueOf(m15048i(c13526r, i10, c7448e));
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m15040a(C13526r c13526r, C7448e c7448e) {
        int iOrdinal = c13526r.m15078L0().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                C13526r c13526rM15053n = m15053n(c13526r);
                if (c13526rM15053n == null) {
                    throw new IllegalStateException("ActiveParent must have a focusedChild");
                }
                int iOrdinal2 = c13526rM15053n.m15078L0().ordinal();
                if (iOrdinal2 != 0) {
                    if (iOrdinal2 != 1) {
                        if (iOrdinal2 != 2) {
                            if (iOrdinal2 != 3) {
                                throw new C0644w();
                            }
                            throw new IllegalStateException("ActiveParent must have a focusedChild");
                        }
                    } else if (!m15040a(c13526rM15053n, c7448e) && !m15052m(c13526r, c13526rM15053n, 2, c7448e) && (!c13526rM15053n.m15077K0().f42791a || !((Boolean) c7448e.invoke(c13526rM15053n)).booleanValue())) {
                        return false;
                    }
                }
                return m15052m(c13526r, c13526rM15053n, 2, c7448e);
            }
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    throw new C0644w();
                }
                if (!m15063x(c13526r, c7448e)) {
                    if (!(c13526r.m15077K0().f42791a ? ((Boolean) c7448e.invoke(c13526r)).booleanValue() : false)) {
                        return false;
                    }
                }
            }
            return true;
        }
        return m15063x(c13526r, c7448e);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0057  */
    /* JADX WARN: Code duplicated, block: B:28:0x005d  */
    /* JADX WARN: Code duplicated, block: B:33:0x006a  */
    /* JADX WARN: Code duplicated, block: B:34:0x006f  */
    /* JADX WARN: Code duplicated, block: B:36:0x0075  */
    /* JADX WARN: Code duplicated, block: B:37:0x0079  */
    /* JADX WARN: Code duplicated, block: B:39:0x007f  */
    /* JADX WARN: Code duplicated, block: B:40:0x0084  */
    /* JADX WARN: Code duplicated, block: B:42:0x008a  */
    /* JADX WARN: Code duplicated, block: B:45:0x0098  */
    /* JADX WARN: Code duplicated, block: B:46:0x009a  */
    /* JADX WARN: Code duplicated, block: B:48:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:54:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:59:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:61:0x00c8  */
    /* JADX INFO: renamed from: b */
    public static final boolean m15041b(C13801c c13801c, C13801c c13801c2, C13801c c13801c3, int i10) {
        float f10;
        float fMax;
        float f11;
        if (!m15042c(i10, c13801c3, c13801c) && m15042c(i10, c13801c2, c13801c)) {
            boolean zM15026a = C13510b.m15026a(i10, 3);
            float f12 = c13801c3.f43587b;
            float f13 = c13801c3.f43589d;
            float f14 = c13801c3.f43586a;
            float f15 = c13801c3.f43588c;
            float f16 = c13801c.f43589d;
            float f17 = c13801c.f43587b;
            float f18 = c13801c.f43588c;
            float f19 = c13801c.f43586a;
            if (zM15026a) {
                if (f19 >= f15) {
                    if (!C13510b.m15026a(i10, 3) && !C13510b.m15026a(i10, 4)) {
                        if (C13510b.m15026a(i10, 3)) {
                            f10 = f19 - c13801c2.f43588c;
                        } else if (C13510b.m15026a(i10, 4)) {
                            f10 = c13801c2.f43586a - f18;
                        } else if (C13510b.m15026a(i10, 5)) {
                            f10 = f17 - c13801c2.f43589d;
                        } else {
                            if (C13510b.m15026a(i10, 6)) {
                                throw new IllegalStateException("This function should only be used for 2-D focus search");
                            }
                            f10 = c13801c2.f43587b - f16;
                        }
                        fMax = Math.max(0.0f, f10);
                        if (C13510b.m15026a(i10, 3)) {
                            f11 = f19 - f14;
                        } else if (C13510b.m15026a(i10, 4)) {
                            f11 = f15 - f18;
                        } else if (C13510b.m15026a(i10, 5)) {
                            f11 = f17 - f12;
                        } else {
                            if (C13510b.m15026a(i10, 6)) {
                                throw new IllegalStateException("This function should only be used for 2-D focus search");
                            }
                            f11 = f13 - f16;
                        }
                        if (fMax < Math.max(1.0f, f11)) {
                        }
                    }
                }
            } else if (C13510b.m15026a(i10, 4)) {
                if (f18 <= f14) {
                    if (!C13510b.m15026a(i10, 3)) {
                        if (C13510b.m15026a(i10, 3)) {
                            f10 = f19 - c13801c2.f43588c;
                        } else if (C13510b.m15026a(i10, 4)) {
                            f10 = c13801c2.f43586a - f18;
                        } else if (C13510b.m15026a(i10, 5)) {
                            f10 = f17 - c13801c2.f43589d;
                        } else {
                            if (C13510b.m15026a(i10, 6)) {
                                throw new IllegalStateException("This function should only be used for 2-D focus search");
                            }
                            f10 = c13801c2.f43587b - f16;
                        }
                        fMax = Math.max(0.0f, f10);
                        if (C13510b.m15026a(i10, 3)) {
                            f11 = f19 - f14;
                        } else if (C13510b.m15026a(i10, 4)) {
                            f11 = f15 - f18;
                        } else if (C13510b.m15026a(i10, 5)) {
                            f11 = f17 - f12;
                        } else {
                            if (C13510b.m15026a(i10, 6)) {
                                throw new IllegalStateException("This function should only be used for 2-D focus search");
                            }
                            f11 = f13 - f16;
                        }
                        if (fMax < Math.max(1.0f, f11)) {
                        }
                    }
                }
            } else if (C13510b.m15026a(i10, 5)) {
                if (f17 >= f13) {
                    if (!C13510b.m15026a(i10, 3)) {
                        if (C13510b.m15026a(i10, 3)) {
                            f10 = f19 - c13801c2.f43588c;
                        } else if (C13510b.m15026a(i10, 4)) {
                            f10 = c13801c2.f43586a - f18;
                        } else if (C13510b.m15026a(i10, 5)) {
                            f10 = f17 - c13801c2.f43589d;
                        } else {
                            if (C13510b.m15026a(i10, 6)) {
                                throw new IllegalStateException("This function should only be used for 2-D focus search");
                            }
                            f10 = c13801c2.f43587b - f16;
                        }
                        fMax = Math.max(0.0f, f10);
                        if (C13510b.m15026a(i10, 3)) {
                            f11 = f19 - f14;
                        } else if (C13510b.m15026a(i10, 4)) {
                            f11 = f15 - f18;
                        } else if (C13510b.m15026a(i10, 5)) {
                            f11 = f17 - f12;
                        } else {
                            if (C13510b.m15026a(i10, 6)) {
                                throw new IllegalStateException("This function should only be used for 2-D focus search");
                            }
                            f11 = f13 - f16;
                        }
                        if (fMax < Math.max(1.0f, f11)) {
                        }
                    }
                }
            } else {
                if (!C13510b.m15026a(i10, 6)) {
                    throw new IllegalStateException("This function should only be used for 2-D focus search");
                }
                if (f16 <= f12) {
                    if (!C13510b.m15026a(i10, 3)) {
                        if (C13510b.m15026a(i10, 3)) {
                            f10 = f19 - c13801c2.f43588c;
                        } else if (C13510b.m15026a(i10, 4)) {
                            f10 = c13801c2.f43586a - f18;
                        } else if (C13510b.m15026a(i10, 5)) {
                            f10 = f17 - c13801c2.f43589d;
                        } else {
                            if (C13510b.m15026a(i10, 6)) {
                                throw new IllegalStateException("This function should only be used for 2-D focus search");
                            }
                            f10 = c13801c2.f43587b - f16;
                        }
                        fMax = Math.max(0.0f, f10);
                        if (C13510b.m15026a(i10, 3)) {
                            f11 = f19 - f14;
                        } else if (C13510b.m15026a(i10, 4)) {
                            f11 = f15 - f18;
                        } else if (C13510b.m15026a(i10, 5)) {
                            f11 = f17 - f12;
                        } else {
                            if (C13510b.m15026a(i10, 6)) {
                                throw new IllegalStateException("This function should only be used for 2-D focus search");
                            }
                            f11 = f13 - f16;
                        }
                        if (fMax < Math.max(1.0f, f11)) {
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m15042c(int i10, C13801c c13801c, C13801c c13801c2) {
        if (C13510b.m15026a(i10, 3) ? true : C13510b.m15026a(i10, 4)) {
            if (c13801c.f43589d > c13801c2.f43587b && c13801c.f43587b < c13801c2.f43589d) {
                return true;
            }
        } else {
            if (!(C13510b.m15026a(i10, 5) ? true : C13510b.m15026a(i10, 6))) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            if (c13801c.f43588c > c13801c2.f43586a && c13801c.f43586a < c13801c2.f43588c) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public static final C13801c m15043d(View view) {
        int[] iArr = f42775a;
        view.getLocationInWindow(iArr);
        float f10 = iArr[0];
        return new C13801c(f10, iArr[1], view.getWidth() + f10, iArr[1] + view.getHeight());
    }

    /* JADX INFO: renamed from: e */
    public static final boolean m15044e(C13526r c13526r, boolean z6, boolean z10) {
        int iOrdinal = c13526r.m15078L0().ordinal();
        EnumC13525q enumC13525q = EnumC13525q.f42809o0;
        if (iOrdinal == 0) {
            c13526r.m15080P0(enumC13525q);
            if (z10) {
                m15065z(c13526r);
            }
        } else if (iOrdinal == 1) {
            C13526r c13526rM15053n = m15053n(c13526r);
            if (!(c13526rM15053n != null ? m15044e(c13526rM15053n, z6, z10) : true)) {
                return false;
            }
            c13526r.m15080P0(enumC13525q);
            if (z10) {
                m15065z(c13526r);
            }
        } else {
            if (iOrdinal == 2) {
                if (!z6) {
                    return z6;
                }
                c13526r.m15080P0(enumC13525q);
                if (!z10) {
                    return z6;
                }
                m15065z(c13526r);
                return z6;
            }
            if (iOrdinal != 3) {
                throw new C0644w();
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public static final void m15045f(C13526r c13526r, C6546d c6546d) {
        AbstractC10458p abstractC10458p = c13526r.f30960Y;
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
                                C13526r c13526r2 = (C13526r) abstractC10458pM22201f;
                                if (c13526r2.f30972y0 && !AbstractC21690f.m22217v(c13526r2).f68647R0) {
                                    if (c13526r2.m15077K0().f42791a) {
                                        c6546d.m7099c(c13526r2);
                                    } else {
                                        m15045f(c13526r2, c6546d);
                                    }
                                }
                            } else if ((abstractC10458pM22201f.f30962o0 & 1024) != 0 && (abstractC10458pM22201f instanceof AbstractC21706n)) {
                                int i10 = 0;
                                for (AbstractC10458p abstractC10458p3 = ((AbstractC21706n) abstractC10458pM22201f).f68881A0; abstractC10458p3 != null; abstractC10458p3 = abstractC10458p3.f30965r0) {
                                    if ((abstractC10458p3.f30962o0 & 1024) != 0) {
                                        i10++;
                                        if (i10 == 1) {
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
                                if (i10 == 1) {
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
    }

    /* JADX INFO: renamed from: g */
    public static final C13526r m15046g(C13526r c13526r) {
        int iOrdinal = c13526r.m15078L0().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                AbstractC10458p abstractC10458p = c13526r.f30960Y;
                if (!abstractC10458p.f30972y0) {
                    throw new IllegalStateException("visitChildren called on an unattached node");
                }
                C6546d c6546d = new C6546d(new AbstractC10458p[16]);
                AbstractC10458p abstractC10458p2 = abstractC10458p.f30965r0;
                if (abstractC10458p2 == null) {
                    AbstractC21690f.m22197b(c6546d, abstractC10458p);
                } else {
                    c6546d.m7099c(abstractC10458p2);
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
                                        C13526r c13526rM15046g = m15046g((C13526r) abstractC10458pM22201f);
                                        if (c13526rM15046g != null) {
                                            return c13526rM15046g;
                                        }
                                    } else if ((abstractC10458pM22201f.f30962o0 & 1024) != 0 && (abstractC10458pM22201f instanceof AbstractC21706n)) {
                                        int i10 = 0;
                                        for (AbstractC10458p abstractC10458p3 = ((AbstractC21706n) abstractC10458pM22201f).f68881A0; abstractC10458p3 != null; abstractC10458p3 = abstractC10458p3.f30965r0) {
                                            if ((abstractC10458p3.f30962o0 & 1024) != 0) {
                                                i10++;
                                                if (i10 == 1) {
                                                    abstractC10458pM22201f = abstractC10458p3;
                                                } else {
                                                    if (c6546d2 == null) {
                                                        c6546d2 = new C6546d(new AbstractC10458p[16]);
                                                    }
                                                    if (abstractC10458pM22201f != null) {
                                                        c6546d2.m7099c(abstractC10458pM22201f);
                                                        abstractC10458pM22201f = null;
                                                    }
                                                    c6546d2.m7099c(abstractC10458p3);
                                                }
                                            }
                                        }
                                        if (i10 == 1) {
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
                return null;
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return null;
                }
                throw new C0644w();
            }
        }
        return c13526r;
    }

    /* JADX INFO: renamed from: h */
    public static final C13526r m15047h(C6546d c6546d, C13801c c13801c, int i10) {
        C13801c c13801cM15325l;
        if (C13510b.m15026a(i10, 3)) {
            c13801cM15325l = c13801c.m15325l(c13801c.m15321h() + 1, 0.0f);
        } else if (C13510b.m15026a(i10, 4)) {
            c13801cM15325l = c13801c.m15325l(-(c13801c.m15321h() + 1), 0.0f);
        } else if (C13510b.m15026a(i10, 5)) {
            c13801cM15325l = c13801c.m15325l(0.0f, c13801c.m15318e() + 1);
        } else {
            if (!C13510b.m15026a(i10, 6)) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            c13801cM15325l = c13801c.m15325l(0.0f, -(c13801c.m15318e() + 1));
        }
        int i11 = c6546d.f21184o0;
        C13526r c13526r = null;
        if (i11 > 0) {
            Object[] objArr = c6546d.f21182Y;
            int i12 = 0;
            do {
                C13526r c13526r2 = (C13526r) objArr[i12];
                if (m15058s(c13526r2)) {
                    C13801c c13801cM15049j = m15049j(c13526r2);
                    if (m15056q(i10, c13801cM15049j, c13801c) && (!m15056q(i10, c13801cM15325l, c13801c) || m15041b(c13801c, c13801cM15049j, c13801cM15325l, i10) || (!m15041b(c13801c, c13801cM15325l, c13801cM15049j, i10) && m15057r(i10, c13801c, c13801cM15049j) < m15057r(i10, c13801c, c13801cM15325l)))) {
                        c13526r = c13526r2;
                        c13801cM15325l = c13801cM15049j;
                    }
                }
                i12++;
            } while (i12 < i11);
        }
        return c13526r;
    }

    /* JADX INFO: renamed from: i */
    public static final boolean m15048i(C13526r c13526r, int i10, InterfaceC1436k interfaceC1436k) {
        C13801c c13801c;
        C6546d c6546d = new C6546d(new C13526r[16]);
        m15045f(c13526r, c6546d);
        if (c6546d.f21184o0 <= 1) {
            C13526r c13526r2 = (C13526r) (c6546d.m7108m() ? null : c6546d.f21182Y[0]);
            if (c13526r2 != null) {
                return ((Boolean) interfaceC1436k.invoke(c13526r2)).booleanValue();
            }
            return false;
        }
        if (C13510b.m15026a(i10, 7)) {
            i10 = 4;
        }
        if (C13510b.m15026a(i10, 4) ? true : C13510b.m15026a(i10, 6)) {
            C13801c c13801cM15049j = m15049j(c13526r);
            float f10 = c13801cM15049j.f43587b;
            float f11 = c13801cM15049j.f43586a;
            c13801c = new C13801c(f11, f10, f11, f10);
        } else {
            if (!(C13510b.m15026a(i10, 3) ? true : C13510b.m15026a(i10, 5))) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            C13801c c13801cM15049j2 = m15049j(c13526r);
            float f12 = c13801cM15049j2.f43589d;
            float f13 = c13801cM15049j2.f43588c;
            c13801c = new C13801c(f13, f12, f13, f12);
        }
        C13526r c13526rM15047h = m15047h(c6546d, c13801c, i10);
        if (c13526rM15047h != null) {
            return ((Boolean) interfaceC1436k.invoke(c13526rM15047h)).booleanValue();
        }
        return false;
    }

    /* JADX INFO: renamed from: j */
    public static final C13801c m15049j(C13526r c13526r) {
        AbstractC21678Y abstractC21678Y = c13526r.f30967t0;
        return abstractC21678Y != null ? AbstractC21075b0.m21568i(abstractC21678Y).mo21528y(abstractC21678Y, false) : C13801c.f43585e;
    }

    /* JADX INFO: renamed from: k */
    public static final boolean m15050k(C13526r c13526r, C7448e c7448e) {
        int iOrdinal = c13526r.m15078L0().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                C13526r c13526rM15053n = m15053n(c13526r);
                if (c13526rM15053n != null) {
                    return m15050k(c13526rM15053n, c7448e) || m15052m(c13526r, c13526rM15053n, 1, c7448e);
                }
                throw new IllegalStateException("ActiveParent must have a focusedChild");
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return c13526r.m15077K0().f42791a ? ((Boolean) c7448e.invoke(c13526r)).booleanValue() : m15064y(c13526r, c7448e);
                }
                throw new C0644w();
            }
        }
        return m15064y(c13526r, c7448e);
    }

    /* JADX INFO: renamed from: l */
    public static final boolean m15051l(int i10, C7448e c7448e, C13526r c13526r, C13801c c13801c) {
        if (m15035H(i10, c7448e, c13526r, c13801c)) {
            return true;
        }
        Boolean bool = (Boolean) m15034G(c13526r, i10, new C4041e(c13526r, c13801c, i10, c7448e, 4));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* JADX INFO: renamed from: m */
    public static final boolean m15052m(C13526r c13526r, C13526r c13526r2, int i10, C7448e c7448e) {
        if (m15036I(c13526r, c13526r2, i10, c7448e)) {
            return true;
        }
        Boolean bool = (Boolean) m15034G(c13526r, i10, new C4041e(c13526r, c13526r2, i10, c7448e, 3));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* JADX INFO: renamed from: n */
    public static final C13526r m15053n(C13526r c13526r) {
        int iOrdinal;
        AbstractC10458p abstractC10458p = c13526r.f30960Y;
        boolean z6 = abstractC10458p.f30972y0;
        if (!z6) {
            return null;
        }
        if (!z6) {
            throw new IllegalStateException("visitChildren called on an unattached node");
        }
        C6546d c6546d = new C6546d(new AbstractC10458p[16]);
        AbstractC10458p abstractC10458p2 = abstractC10458p.f30965r0;
        if (abstractC10458p2 == null) {
            AbstractC21690f.m22197b(c6546d, abstractC10458p);
        } else {
            c6546d.m7099c(abstractC10458p2);
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
                                if (c13526r2.f30960Y.f30972y0 && ((iOrdinal = c13526r2.m15078L0().ordinal()) == 0 || iOrdinal == 1 || iOrdinal == 2)) {
                                    return c13526r2;
                                }
                            } else if ((abstractC10458pM22201f.f30962o0 & 1024) != 0 && (abstractC10458pM22201f instanceof AbstractC21706n)) {
                                int i10 = 0;
                                for (AbstractC10458p abstractC10458p3 = ((AbstractC21706n) abstractC10458pM22201f).f68881A0; abstractC10458p3 != null; abstractC10458p3 = abstractC10458p3.f30965r0) {
                                    if ((abstractC10458p3.f30962o0 & 1024) != 0) {
                                        i10++;
                                        if (i10 == 1) {
                                            abstractC10458pM22201f = abstractC10458p3;
                                        } else {
                                            if (c6546d2 == null) {
                                                c6546d2 = new C6546d(new AbstractC10458p[16]);
                                            }
                                            if (abstractC10458pM22201f != null) {
                                                c6546d2.m7099c(abstractC10458pM22201f);
                                                abstractC10458pM22201f = null;
                                            }
                                            c6546d2.m7099c(abstractC10458p3);
                                        }
                                    }
                                }
                                if (i10 == 1) {
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
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: o */
    public static final EnumC13525q m15054o(InterfaceC13511c interfaceC13511c) {
        AbstractC10458p abstractC10458p = (AbstractC10458p) interfaceC13511c;
        AbstractC10458p abstractC10458pM22201f = abstractC10458p.f30960Y;
        C6546d c6546d = null;
        while (true) {
            int i10 = 0;
            if (abstractC10458pM22201f == null) {
                AbstractC10458p abstractC10458p2 = abstractC10458p.f30960Y;
                if (!abstractC10458p2.f30972y0) {
                    throw new IllegalStateException("visitChildren called on an unattached node");
                }
                C6546d c6546d2 = new C6546d(new AbstractC10458p[16]);
                AbstractC10458p abstractC10458p3 = abstractC10458p2.f30965r0;
                if (abstractC10458p3 == null) {
                    AbstractC21690f.m22197b(c6546d2, abstractC10458p2);
                } else {
                    c6546d2.m7099c(abstractC10458p3);
                }
                while (c6546d2.m7109n()) {
                    AbstractC10458p abstractC10458pM22201f2 = (AbstractC10458p) c6546d2.m7111p(c6546d2.f21184o0 - 1);
                    if ((abstractC10458pM22201f2.f30963p0 & 1024) == 0) {
                        AbstractC21690f.m22197b(c6546d2, abstractC10458pM22201f2);
                    } else {
                        while (abstractC10458pM22201f2 != null) {
                            if ((abstractC10458pM22201f2.f30962o0 & 1024) != 0) {
                                C6546d c6546d3 = null;
                                while (abstractC10458pM22201f2 != null) {
                                    if (abstractC10458pM22201f2 instanceof C13526r) {
                                        EnumC13525q enumC13525qM15078L0 = ((C13526r) abstractC10458pM22201f2).m15078L0();
                                        int iOrdinal = enumC13525qM15078L0.ordinal();
                                        if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2) {
                                            return enumC13525qM15078L0;
                                        }
                                    } else if ((abstractC10458pM22201f2.f30962o0 & 1024) != 0 && (abstractC10458pM22201f2 instanceof AbstractC21706n)) {
                                        int i11 = 0;
                                        for (AbstractC10458p abstractC10458p4 = ((AbstractC21706n) abstractC10458pM22201f2).f68881A0; abstractC10458p4 != null; abstractC10458p4 = abstractC10458p4.f30965r0) {
                                            if ((abstractC10458p4.f30962o0 & 1024) != 0) {
                                                i11++;
                                                if (i11 == 1) {
                                                    abstractC10458pM22201f2 = abstractC10458p4;
                                                } else {
                                                    if (c6546d3 == null) {
                                                        c6546d3 = new C6546d(new AbstractC10458p[16]);
                                                    }
                                                    if (abstractC10458pM22201f2 != null) {
                                                        c6546d3.m7099c(abstractC10458pM22201f2);
                                                        abstractC10458pM22201f2 = null;
                                                    }
                                                    c6546d3.m7099c(abstractC10458p4);
                                                }
                                            }
                                        }
                                        if (i11 == 1) {
                                        }
                                    }
                                    abstractC10458pM22201f2 = AbstractC21690f.m22201f(c6546d3);
                                }
                                break;
                            }
                            abstractC10458pM22201f2 = abstractC10458pM22201f2.f30965r0;
                        }
                    }
                }
                return EnumC13525q.f42809o0;
            }
            if (abstractC10458pM22201f instanceof C13526r) {
                EnumC13525q enumC13525qM15078L1 = ((C13526r) abstractC10458pM22201f).m15078L0();
                int iOrdinal2 = enumC13525qM15078L1.ordinal();
                if (iOrdinal2 == 0 || iOrdinal2 == 1 || iOrdinal2 == 2) {
                    return enumC13525qM15078L1;
                }
            } else if ((abstractC10458pM22201f.f30962o0 & 1024) != 0 && (abstractC10458pM22201f instanceof AbstractC21706n)) {
                for (AbstractC10458p abstractC10458p5 = ((AbstractC21706n) abstractC10458pM22201f).f68881A0; abstractC10458p5 != null; abstractC10458p5 = abstractC10458p5.f30965r0) {
                    if ((abstractC10458p5.f30962o0 & 1024) != 0) {
                        i10++;
                        if (i10 == 1) {
                            abstractC10458pM22201f = abstractC10458p5;
                        } else {
                            if (c6546d == null) {
                                c6546d = new C6546d(new AbstractC10458p[16]);
                            }
                            if (abstractC10458pM22201f != null) {
                                c6546d.m7099c(abstractC10458pM22201f);
                                abstractC10458pM22201f = null;
                            }
                            c6546d.m7099c(abstractC10458p5);
                        }
                    }
                }
                if (i10 == 1) {
                }
            }
            abstractC10458pM22201f = AbstractC21690f.m22201f(c6546d);
        }
    }

    /* JADX INFO: renamed from: p */
    public static final void m15055p(C13526r c13526r) {
        AbstractC21690f.m22214s(c13526r, new C13527s(c13526r, 0));
        int iOrdinal = c13526r.m15078L0().ordinal();
        if (iOrdinal == 1 || iOrdinal == 3) {
            c13526r.m15080P0(EnumC13525q.f42807Y);
        }
    }

    /* JADX INFO: renamed from: q */
    public static final boolean m15056q(int i10, C13801c c13801c, C13801c c13801c2) {
        boolean zM15026a = C13510b.m15026a(i10, 3);
        float f10 = c13801c.f43586a;
        float f11 = c13801c.f43588c;
        if (zM15026a) {
            float f12 = c13801c2.f43588c;
            float f13 = c13801c2.f43586a;
            if ((f12 <= f11 && f13 < f11) || f13 <= f10) {
                return false;
            }
        } else if (C13510b.m15026a(i10, 4)) {
            float f14 = c13801c2.f43586a;
            float f15 = c13801c2.f43588c;
            if ((f14 >= f10 && f15 > f10) || f15 >= f11) {
                return false;
            }
        } else {
            boolean zM15026a2 = C13510b.m15026a(i10, 5);
            float f16 = c13801c.f43587b;
            float f17 = c13801c.f43589d;
            if (zM15026a2) {
                float f18 = c13801c2.f43589d;
                float f19 = c13801c2.f43587b;
                if ((f18 <= f17 && f19 < f17) || f19 <= f16) {
                    return false;
                }
            } else {
                if (!C13510b.m15026a(i10, 6)) {
                    throw new IllegalStateException("This function should only be used for 2-D focus search");
                }
                float f20 = c13801c2.f43587b;
                float f21 = c13801c2.f43589d;
                if ((f20 >= f16 && f21 > f16) || f21 >= f17) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0047  */
    /* JADX WARN: Code duplicated, block: B:18:0x0049  */
    /* JADX WARN: Code duplicated, block: B:21:0x0050  */
    /* JADX WARN: Code duplicated, block: B:23:0x0061  */
    /* JADX WARN: Code duplicated, block: B:26:0x0068  */
    /* JADX WARN: Code duplicated, block: B:28:0x006e  */
    /* JADX WARN: Code duplicated, block: B:31:0x008b  */
    /* JADX INFO: renamed from: r */
    public static final long m15057r(int i10, C13801c c13801c, C13801c c13801c2) {
        float f10;
        float f11;
        float f12;
        boolean zM15026a;
        float fM15321h;
        float fM15321h2;
        boolean zM15026a2 = C13510b.m15026a(i10, 3);
        float f13 = c13801c2.f43587b;
        float f14 = c13801c2.f43586a;
        if (!zM15026a2) {
            if (C13510b.m15026a(i10, 4)) {
                f10 = f14 - c13801c.f43588c;
            } else if (C13510b.m15026a(i10, 5)) {
                f11 = c13801c.f43587b;
                f12 = c13801c2.f43589d;
            } else {
                if (!C13510b.m15026a(i10, 6)) {
                    throw new IllegalStateException("This function should only be used for 2-D focus search");
                }
                f10 = f13 - c13801c.f43589d;
            }
            long jAbs = (long) Math.abs(Math.max(0.0f, f10));
            if (C13510b.m15026a(i10, 3)) {
                zM15026a = true;
            } else {
                zM15026a = C13510b.m15026a(i10, 4);
            }
            if (zM15026a) {
                float f15 = 2;
                fM15321h = (c13801c.m15318e() / f15) + c13801c.f43587b;
                fM15321h2 = (c13801c2.m15318e() / f15) + f13;
            } else {
                if (C13510b.m15026a(i10, 5) ? true : C13510b.m15026a(i10, 6)) {
                    throw new IllegalStateException("This function should only be used for 2-D focus search");
                }
                float f16 = 2;
                fM15321h = (c13801c.m15321h() / f16) + c13801c.f43586a;
                fM15321h2 = (c13801c2.m15321h() / f16) + f14;
            }
            long jAbs2 = (long) Math.abs(fM15321h - fM15321h2);
            return (jAbs2 * jAbs2) + (((long) 13) * jAbs * jAbs);
        }
        f11 = c13801c.f43586a;
        f12 = c13801c2.f43588c;
        f10 = f11 - f12;
        long jAbs3 = (long) Math.abs(Math.max(0.0f, f10));
        if (C13510b.m15026a(i10, 3)) {
            zM15026a = true;
        } else {
            zM15026a = C13510b.m15026a(i10, 4);
        }
        if (zM15026a) {
            float f17 = 2;
            fM15321h = (c13801c.m15318e() / f17) + c13801c.f43587b;
            fM15321h2 = (c13801c2.m15318e() / f17) + f13;
        } else {
            if (C13510b.m15026a(i10, 5) ? true : C13510b.m15026a(i10, 6)) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            float f18 = 2;
            fM15321h = (c13801c.m15321h() / f18) + c13801c.f43586a;
            fM15321h2 = (c13801c2.m15321h() / f18) + f14;
        }
        long jAbs4 = (long) Math.abs(fM15321h - fM15321h2);
        return (jAbs4 * jAbs4) + (((long) 13) * jAbs3 * jAbs3);
    }

    /* JADX INFO: renamed from: s */
    public static final boolean m15058s(C13526r c13526r) {
        C21658D c21658d;
        AbstractC21678Y abstractC21678Y;
        C21658D c21658d2;
        AbstractC21678Y abstractC21678Y2 = c13526r.f30967t0;
        return (abstractC21678Y2 == null || (c21658d = abstractC21678Y2.f68819x0) == null || !c21658d.m22025W() || (abstractC21678Y = c13526r.f30967t0) == null || (c21658d2 = abstractC21678Y.f68819x0) == null || !c21658d2.m22024V()) ? false : true;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [Bm.k, java.lang.Object] */
    /* JADX INFO: renamed from: t */
    public static final int m15059t(C13526r c13526r, int i10) {
        int iOrdinal = c13526r.m15078L0().ordinal();
        int i11 = 1;
        if (iOrdinal == 0) {
            return 1;
        }
        if (iOrdinal == 1) {
            C13526r c13526rM15053n = m15053n(c13526r);
            if (c13526rM15053n == null) {
                throw new IllegalArgumentException("ActiveParent with no focused child");
            }
            int iM15059t = m15059t(c13526rM15053n, i10);
            if (iM15059t == 1) {
                iM15059t = 0;
            }
            if (iM15059t != 0) {
                return iM15059t;
            }
            if (c13526r.f42813z0) {
                return 1;
            }
            c13526r.f42813z0 = true;
            try {
                C13522n c13522n = (C13522n) c13526r.m15077K0().f42801k.invoke(new C13510b(i10));
                if (c13522n != C13522n.f42803b) {
                    if (c13522n != C13522n.f42804c) {
                        i11 = c13522n.m15072a(C13516h.f42788q0) ? 3 : 4;
                    }
                }
                return i11;
            } finally {
                c13526r.f42813z0 = false;
            }
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return 1;
            }
            throw new C0644w();
        }
        return 2;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [Bm.k, java.lang.Object] */
    /* JADX INFO: renamed from: u */
    public static final int m15060u(C13526r c13526r, int i10) {
        if (!c13526r.f42811A0) {
            c13526r.f42811A0 = true;
            try {
                C13522n c13522n = (C13522n) c13526r.m15077K0().f42800j.invoke(new C13510b(i10));
                if (c13522n != C13522n.f42803b) {
                    if (c13522n == C13522n.f42804c) {
                        return 2;
                    }
                    return c13522n.m15072a(C13516h.f42788q0) ? 3 : 4;
                }
            } finally {
                c13526r.f42811A0 = false;
            }
        }
        return 1;
    }

    /* JADX INFO: renamed from: v */
    public static final int m15061v(C13526r c13526r, int i10) {
        AbstractC10458p abstractC10458p;
        C1313k c1313k;
        int iOrdinal = c13526r.m15078L0().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                C13526r c13526rM15053n = m15053n(c13526r);
                if (c13526rM15053n != null) {
                    return m15059t(c13526rM15053n, i10);
                }
                throw new IllegalArgumentException("ActiveParent with no focused child");
            }
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    throw new C0644w();
                }
                AbstractC10458p abstractC10458p2 = c13526r.f30960Y;
                if (!abstractC10458p2.f30972y0) {
                    throw new IllegalStateException("visitAncestors called on an unattached node");
                }
                AbstractC10458p abstractC10458p3 = abstractC10458p2.f30964q0;
                C21658D c21658dM22217v = AbstractC21690f.m22217v(c13526r);
                loop0: while (true) {
                    abstractC10458p = null;
                    if (c21658dM22217v == null) {
                        break;
                    }
                    if ((((AbstractC10458p) c21658dM22217v.f68638I0.f3471f).f30963p0 & 1024) != 0) {
                        while (abstractC10458p3 != null) {
                            if ((abstractC10458p3.f30962o0 & 1024) != 0) {
                                AbstractC10458p abstractC10458pM22201f = abstractC10458p3;
                                C6546d c6546d = null;
                                while (abstractC10458pM22201f != null) {
                                    if (abstractC10458pM22201f instanceof C13526r) {
                                        abstractC10458p = abstractC10458pM22201f;
                                        break loop0;
                                    }
                                    if ((abstractC10458pM22201f.f30962o0 & 1024) != 0 && (abstractC10458pM22201f instanceof AbstractC21706n)) {
                                        int i11 = 0;
                                        for (AbstractC10458p abstractC10458p4 = ((AbstractC21706n) abstractC10458pM22201f).f68881A0; abstractC10458p4 != null; abstractC10458p4 = abstractC10458p4.f30965r0) {
                                            if ((abstractC10458p4.f30962o0 & 1024) != 0) {
                                                i11++;
                                                if (i11 == 1) {
                                                    abstractC10458pM22201f = abstractC10458p4;
                                                } else {
                                                    if (c6546d == null) {
                                                        c6546d = new C6546d(new AbstractC10458p[16]);
                                                    }
                                                    if (abstractC10458pM22201f != null) {
                                                        c6546d.m7099c(abstractC10458pM22201f);
                                                        abstractC10458pM22201f = null;
                                                    }
                                                    c6546d.m7099c(abstractC10458p4);
                                                }
                                            }
                                        }
                                        if (i11 == 1) {
                                        }
                                    }
                                    abstractC10458pM22201f = AbstractC21690f.m22201f(c6546d);
                                }
                            }
                            abstractC10458p3 = abstractC10458p3.f30964q0;
                        }
                    }
                    c21658dM22217v = c21658dM22217v.m22009G();
                    abstractC10458p3 = (c21658dM22217v == null || (c1313k = c21658dM22217v.f68638I0) == null) ? null : (C21703l0) c1313k.f3470e;
                }
                C13526r c13526r2 = (C13526r) abstractC10458p;
                if (c13526r2 == null) {
                    return 1;
                }
                int iOrdinal2 = c13526r2.m15078L0().ordinal();
                if (iOrdinal2 == 0) {
                    return m15060u(c13526r2, i10);
                }
                if (iOrdinal2 == 1) {
                    return m15061v(c13526r2, i10);
                }
                if (iOrdinal2 == 2) {
                    return 2;
                }
                if (iOrdinal2 != 3) {
                    throw new C0644w();
                }
                int iM15061v = m15061v(c13526r2, i10);
                int i12 = iM15061v == 1 ? 0 : iM15061v;
                return i12 == 0 ? m15060u(c13526r2, i10) : i12;
            }
        }
        return 1;
    }

    /* JADX WARN: Code duplicated, block: B:63:0x00c6  */
    /* JADX INFO: renamed from: w */
    public static final boolean m15062w(C13526r c13526r) {
        AbstractC10458p abstractC10458pM22201f;
        C1313k c1313k;
        int iOrdinal = c13526r.m15078L0().ordinal();
        boolean zM15031D = true;
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                C13526r c13526rM15053n = m15053n(c13526r);
                if (c13526rM15053n != null ? m15044e(c13526rM15053n, false, true) : true) {
                    m15055p(c13526r);
                } else {
                    zM15031D = false;
                }
            } else if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    throw new C0644w();
                }
                AbstractC10458p abstractC10458p = c13526r.f30960Y;
                if (!abstractC10458p.f30972y0) {
                    throw new IllegalStateException("visitAncestors called on an unattached node");
                }
                AbstractC10458p abstractC10458p2 = abstractC10458p.f30964q0;
                C21658D c21658dM22217v = AbstractC21690f.m22217v(c13526r);
                loop0: while (true) {
                    if (c21658dM22217v == null) {
                        abstractC10458pM22201f = null;
                        break;
                    }
                    if ((((AbstractC10458p) c21658dM22217v.f68638I0.f3471f).f30963p0 & 1024) != 0) {
                        while (abstractC10458p2 != null) {
                            if ((abstractC10458p2.f30962o0 & 1024) != 0) {
                                abstractC10458pM22201f = abstractC10458p2;
                                C6546d c6546d = null;
                                while (abstractC10458pM22201f != null) {
                                    if (abstractC10458pM22201f instanceof C13526r) {
                                        break loop0;
                                    }
                                    if ((abstractC10458pM22201f.f30962o0 & 1024) != 0 && (abstractC10458pM22201f instanceof AbstractC21706n)) {
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
                C13526r c13526r2 = (C13526r) abstractC10458pM22201f;
                if (c13526r2 != null) {
                    EnumC13525q enumC13525qM15078L0 = c13526r2.m15078L0();
                    zM15031D = m15031D(c13526r2, c13526r);
                    if (zM15031D && enumC13525qM15078L0 != c13526r2.m15078L0()) {
                        m15065z(c13526r2);
                    }
                } else if (((Boolean) ((C10863b) AbstractC21690f.m22218w(c13526r).getFocusOwner()).f32693a.invoke(null, null)).booleanValue()) {
                    m15055p(c13526r);
                } else {
                    zM15031D = false;
                }
            }
        }
        if (zM15031D) {
            m15065z(c13526r);
        }
        return zM15031D;
    }

    /* JADX INFO: renamed from: x */
    public static final boolean m15063x(C13526r c13526r, C7448e c7448e) {
        Object[] objArrCopyOf = new C13526r[16];
        AbstractC10458p abstractC10458p = c13526r.f30960Y;
        if (!abstractC10458p.f30972y0) {
            throw new IllegalStateException("visitChildren called on an unattached node");
        }
        C6546d c6546d = new C6546d(new AbstractC10458p[16]);
        AbstractC10458p abstractC10458p2 = abstractC10458p.f30965r0;
        if (abstractC10458p2 == null) {
            AbstractC21690f.m22197b(c6546d, abstractC10458p);
        } else {
            c6546d.m7099c(abstractC10458p2);
        }
        int i10 = 0;
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
                                int i11 = i10 + 1;
                                if (objArrCopyOf.length < i11) {
                                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, Math.max(i11, objArrCopyOf.length * 2));
                                    AbstractC16544l.m18093f(objArrCopyOf, "copyOf(this, newSize)");
                                }
                                objArrCopyOf[i10] = c13526r2;
                                i10 = i11;
                            } else if ((abstractC10458pM22201f.f30962o0 & 1024) != 0 && (abstractC10458pM22201f instanceof AbstractC21706n)) {
                                int i12 = 0;
                                for (AbstractC10458p abstractC10458p3 = ((AbstractC21706n) abstractC10458pM22201f).f68881A0; abstractC10458p3 != null; abstractC10458p3 = abstractC10458p3.f30965r0) {
                                    if ((abstractC10458p3.f30962o0 & 1024) != 0) {
                                        i12++;
                                        if (i12 == 1) {
                                            abstractC10458pM22201f = abstractC10458p3;
                                        } else {
                                            if (c6546d2 == null) {
                                                c6546d2 = new C6546d(new AbstractC10458p[16]);
                                            }
                                            if (abstractC10458pM22201f != null) {
                                                c6546d2.m7099c(abstractC10458pM22201f);
                                                abstractC10458pM22201f = null;
                                            }
                                            c6546d2.m7099c(abstractC10458p3);
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
        C13528t c13528t = C13528t.f42816Y;
        AbstractC16544l.m18094g(objArrCopyOf, "<this>");
        Arrays.sort(objArrCopyOf, 0, i10, c13528t);
        if (i10 > 0) {
            int i13 = i10 - 1;
            do {
                C13526r c13526r3 = (C13526r) objArrCopyOf[i13];
                if (m15058s(c13526r3) && m15040a(c13526r3, c7448e)) {
                    return true;
                }
                i13--;
            } while (i13 >= 0);
        }
        return false;
    }

    /* JADX INFO: renamed from: y */
    public static final boolean m15064y(C13526r c13526r, C7448e c7448e) {
        Object[] objArrCopyOf = new C13526r[16];
        AbstractC10458p abstractC10458p = c13526r.f30960Y;
        if (!abstractC10458p.f30972y0) {
            throw new IllegalStateException("visitChildren called on an unattached node");
        }
        C6546d c6546d = new C6546d(new AbstractC10458p[16]);
        AbstractC10458p abstractC10458p2 = abstractC10458p.f30965r0;
        if (abstractC10458p2 == null) {
            AbstractC21690f.m22197b(c6546d, abstractC10458p);
        } else {
            c6546d.m7099c(abstractC10458p2);
        }
        int i10 = 0;
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
                                int i11 = i10 + 1;
                                if (objArrCopyOf.length < i11) {
                                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, Math.max(i11, objArrCopyOf.length * 2));
                                    AbstractC16544l.m18093f(objArrCopyOf, "copyOf(this, newSize)");
                                }
                                objArrCopyOf[i10] = c13526r2;
                                i10 = i11;
                            } else if ((abstractC10458pM22201f.f30962o0 & 1024) != 0 && (abstractC10458pM22201f instanceof AbstractC21706n)) {
                                int i12 = 0;
                                for (AbstractC10458p abstractC10458p3 = ((AbstractC21706n) abstractC10458pM22201f).f68881A0; abstractC10458p3 != null; abstractC10458p3 = abstractC10458p3.f30965r0) {
                                    if ((abstractC10458p3.f30962o0 & 1024) != 0) {
                                        i12++;
                                        if (i12 == 1) {
                                            abstractC10458pM22201f = abstractC10458p3;
                                        } else {
                                            if (c6546d2 == null) {
                                                c6546d2 = new C6546d(new AbstractC10458p[16]);
                                            }
                                            if (abstractC10458pM22201f != null) {
                                                c6546d2.m7099c(abstractC10458pM22201f);
                                                abstractC10458pM22201f = null;
                                            }
                                            c6546d2.m7099c(abstractC10458p3);
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
        C13528t c13528t = C13528t.f42816Y;
        AbstractC16544l.m18094g(objArrCopyOf, "<this>");
        Arrays.sort(objArrCopyOf, 0, i10, c13528t);
        if (i10 <= 0) {
            return false;
        }
        int i13 = 0;
        do {
            C13526r c13526r3 = (C13526r) objArrCopyOf[i13];
            if (m15058s(c13526r3) && m15050k(c13526r3, c7448e)) {
                return true;
            }
            i13++;
        } while (i13 < i10);
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11, types: [a1.p] */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [a1.p] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [Q0.d] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [Q0.d] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX INFO: renamed from: z */
    public static final void m15065z(C13526r c13526r) {
        C1313k c1313k;
        AbstractC10458p abstractC10458p = c13526r.f30960Y;
        if (!abstractC10458p.f30972y0) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        C21658D c21658dM22217v = AbstractC21690f.m22217v(c13526r);
        AbstractC10458p abstractC10458p2 = abstractC10458p;
        while (c21658dM22217v != null) {
            if ((((AbstractC10458p) c21658dM22217v.f68638I0.f3471f).f30963p0 & 5120) != 0) {
                while (abstractC10458p2 != null) {
                    int i10 = abstractC10458p2.f30962o0;
                    if ((i10 & 5120) != 0) {
                        if (abstractC10458p2 != abstractC10458p && (i10 & 1024) != 0) {
                            return;
                        }
                        if ((i10 & 4096) != 0) {
                            ?? M22201f = abstractC10458p2;
                            ?? c6546d = 0;
                            while (M22201f != 0) {
                                if (M22201f instanceof InterfaceC13511c) {
                                    InterfaceC13511c interfaceC13511c = (InterfaceC13511c) M22201f;
                                    interfaceC13511c.mo15025y(m15054o(interfaceC13511c));
                                } else if ((M22201f.f30962o0 & 4096) != 0 && (M22201f instanceof AbstractC21706n)) {
                                    AbstractC10458p abstractC10458p3 = ((AbstractC21706n) M22201f).f68881A0;
                                    int i11 = 0;
                                    M22201f = M22201f;
                                    c6546d = c6546d;
                                    while (abstractC10458p3 != null) {
                                        if ((abstractC10458p3.f30962o0 & 4096) != 0) {
                                            i11++;
                                            if (i11 == 1) {
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
                                        }
                                        abstractC10458p3 = abstractC10458p3.f30965r0;
                                        M22201f = M22201f;
                                        c6546d = c6546d;
                                    }
                                    if (i11 == 1) {
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
    }
}
