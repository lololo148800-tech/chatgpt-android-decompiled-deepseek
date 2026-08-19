package p571X9;

import androidx.compose.foundation.AbstractC10833a;
import kotlin.jvm.internal.AbstractC16544l;
import p049Bm.InterfaceC1426a;
import p1155zi.C21901C1;
import p1155zi.EnumC21905D1;
import p124Ei.C2535p;
import p214Ib.C3676s;
import p214Ib.C3677t;
import p229J0.AbstractC3914G1;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p482Tg.AbstractC7460q;
import p482Tg.C7440Y;
import p482Tg.C7441Z;
import p537W0.AbstractC8411c;
import p537W0.C8410b;
import p635a1.C10456n;
import p919o8.C17882B;

/* JADX INFO: renamed from: X9.n4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9334n4 {
    /* JADX INFO: renamed from: a */
    public static final void m9932a(EnumC21905D1 enumC21905D1, InterfaceC1426a onClick, C6021p c6021p, int i10) {
        int i11;
        int i12 = 18;
        int i13 = 0;
        AbstractC16544l.m18094g(onClick, "onClick");
        c6021p.m6526U(1222788242);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6542f(enumC21905D1) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6545h(onClick) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else if (enumC21905D1 == EnumC21905D1.PLUS || enumC21905D1 == EnumC21905D1.PRO || enumC21905D1 == EnumC21905D1.TEAM || enumC21905D1 == EnumC21905D1.ENTERPRISE || enumC21905D1 == EnumC21905D1.EDU) {
            C8410b c8410b = AbstractC7460q.f23703b;
            C10456n c10456n = C10456n.f30959Y;
            c6021p.m6524S(-1722271642);
            boolean z6 = (i11 & 112) == 32;
            Object objM6514H = c6021p.m6514H();
            if (z6 || objM6514H == C6013l.f19514a) {
                objM6514H = new C2535p(i12, onClick);
                c6021p.m6537c0(objM6514H);
            }
            c6021p.m6553p(false);
            AbstractC3914G1.m4611a(c8410b, AbstractC10833a.m11209d(c10456n, false, null, (InterfaceC1426a) objM6514H, 7), null, AbstractC8411c.m8969c(734437337, c6021p, new C7440Y(enumC21905D1, i13)), AbstractC7460q.f23704c, null, null, 0.0f, 0.0f, c6021p, 27654, 484);
        } else {
            C21901C1 c21901c1 = EnumC21905D1.Companion;
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C7441Z(enumC21905D1, onClick, i10, i13);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m9933b(EnumC21905D1 enumC21905D1, InterfaceC1426a onClick, C6021p c6021p, int i10) {
        int i11;
        AbstractC16544l.m18094g(onClick, "onClick");
        c6021p.m6526U(1211232602);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6542f(enumC21905D1) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6545h(onClick) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else if (enumC21905D1 == EnumC21905D1.FREE || enumC21905D1 == EnumC21905D1.PLUS) {
            C8410b c8410bM8969c = AbstractC8411c.m8969c(1638691393, c6021p, new C7440Y(enumC21905D1, 1));
            C10456n c10456n = C10456n.f30959Y;
            c6021p.m6524S(-1150143026);
            boolean z6 = (i11 & 112) == 32;
            Object objM6514H = c6021p.m6514H();
            if (z6 || objM6514H == C6013l.f19514a) {
                objM6514H = new C2535p(19, onClick);
                c6021p.m6537c0(objM6514H);
            }
            c6021p.m6553p(false);
            AbstractC3914G1.m4611a(c8410bM8969c, AbstractC10833a.m11209d(c10456n, false, null, (InterfaceC1426a) objM6514H, 7), null, null, AbstractC7460q.f23702a, null, null, 0.0f, 0.0f, c6021p, 24582, 492);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C7441Z(enumC21905D1, onClick, i10, 1);
        }
    }

    /* JADX INFO: renamed from: c */
    public static C17882B m9934c(C3676s c3676s) {
        try {
            return new C17882B(c3676s.m4395w("count").mo4382p());
        } catch (IllegalStateException e10) {
            throw new C3677t("Unable to parse json into type Resource", e10);
        } catch (NullPointerException e11) {
            throw new C3677t("Unable to parse json into type Resource", e11);
        } catch (NumberFormatException e12) {
            throw new C3677t("Unable to parse json into type Resource", e12);
        }
    }
}
