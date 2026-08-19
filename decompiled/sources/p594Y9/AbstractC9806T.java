package p594Y9;

import androidx.compose.p650ui.graphics.AbstractC10864a;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p003A1.AbstractC0168G;
import p003A1.C0184L0;
import p049Bm.InterfaceC1439n;
import p214Ib.AbstractC3673p;
import p214Ib.C3676s;
import p214Ib.C3677t;
import p229J0.AbstractC3878A1;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p502Uc.C7620d;
import p635a1.InterfaceC10459q;
import p758g0.AbstractC13758e;
import p758g0.C13756d;
import p774h1.C14365u;
import p882m1.AbstractC17140a;
import p919o8.C17975h0;

/* JADX INFO: renamed from: Y9.T */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9806T {
    /* JADX INFO: renamed from: a */
    public static final void m10431a(AbstractC17140a painter, String str, InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10) {
        int i11;
        AbstractC16544l.m18094g(painter, "painter");
        c6021p.m6526U(207021644);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6545h(painter) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6542f(str) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6542f(interfaceC10459q) ? 256 : 128;
        }
        if ((i11 & 147) == 146 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            c6021p.m6524S(1460561700);
            Object objM6514H = c6021p.m6514H();
            Object obj = C6013l.f19514a;
            if (objM6514H == obj) {
                objM6514H = AbstractC13758e.m15236a(-30.0f);
                c6021p.m6537c0(objM6514H);
            }
            C13756d c13756d = (C13756d) objM6514H;
            Object objM530s = AbstractC0168G.m530s(1460563300, c6021p, false);
            if (objM530s == obj) {
                objM530s = AbstractC13758e.m15236a(-50.0f);
                c6021p.m6537c0(objM530s);
            }
            C13756d c13756d2 = (C13756d) objM530s;
            Object objM530s2 = AbstractC0168G.m530s(1460564898, c6021p, false);
            if (objM530s2 == obj) {
                objM530s2 = AbstractC13758e.m15236a(0.0f);
                c6021p.m6537c0(objM530s2);
            }
            C13756d c13756d3 = (C13756d) objM530s2;
            c6021p.m6553p(false);
            C17296C c17296c = C17296C.f55119a;
            c6021p.m6524S(1460567326);
            boolean zM6545h = c6021p.m6545h(c13756d) | c6021p.m6545h(c13756d2) | c6021p.m6545h(c13756d3);
            Object objM6514H2 = c6021p.m6514H();
            if (zM6545h || objM6514H2 == obj) {
                objM6514H2 = new C7620d(c13756d, c13756d2, c13756d3, null);
                c6021p.m6537c0(objM6514H2);
            }
            c6021p.m6553p(false);
            C5997d.m6450f((InterfaceC1439n) objM6514H2, c6021p, c17296c);
            AbstractC3878A1.m4596a(painter, str, AbstractC10864a.m11306b(interfaceC10459q, 0.0f, 0.0f, 0.0f, 0.0f, ((Number) c13756d.m15224e()).floatValue(), ((Number) c13756d2.m15224e()).floatValue(), ((Number) c13756d3.m15224e()).floatValue(), null, false, 0, 130623), C14365u.f45060j, c6021p, (i11 & 14) | 3072 | (i11 & 112), 0);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C0184L0(painter, str, interfaceC10459q, i10, 28);
        }
    }

    /* JADX INFO: renamed from: b */
    public static C17975h0 m10432b(C3676s c3676s) {
        try {
            String name = c3676s.m4395w(DiagnosticsEntry.NAME_KEY).mo4384r();
            boolean zMo4380f = c3676s.m4395w("crashed").mo4380f();
            String stack = c3676s.m4395w("stack").mo4384r();
            AbstractC3673p abstractC3673pM4395w = c3676s.m4395w("state");
            String strMo4384r = abstractC3673pM4395w != null ? abstractC3673pM4395w.mo4384r() : null;
            AbstractC16544l.m18093f(name, "name");
            AbstractC16544l.m18093f(stack, "stack");
            return new C17975h0(name, stack, zMo4380f, strMo4384r);
        } catch (IllegalStateException e10) {
            throw new C3677t("Unable to parse json into type Thread", e10);
        } catch (NullPointerException e11) {
            throw new C3677t("Unable to parse json into type Thread", e11);
        } catch (NumberFormatException e12) {
            throw new C3677t("Unable to parse json into type Thread", e12);
        }
    }
}
