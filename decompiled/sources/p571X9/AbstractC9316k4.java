package p571X9;

import androidx.compose.foundation.AbstractC10833a;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.C0184L0;
import p003A1.C0227a;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p072Ci.EnumC1696a;
import p214Ib.C3676s;
import p214Ib.C3677t;
import p229J0.AbstractC3914G1;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p349O0.InterfaceC5985X;
import p363Og.C6207k;
import p482Tg.AbstractC7455l;
import p482Tg.C7449f;
import p482Tg.C7458o;
import p537W0.AbstractC8411c;
import p537W0.C8410b;
import p594Y9.AbstractC9769M3;
import p594Y9.AbstractC9834X3;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p919o8.C18022x;
import tm.C20007b;

/* JADX INFO: renamed from: X9.k4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9316k4 {
    /* JADX INFO: renamed from: a */
    public static final void m9909a(EnumC1696a enumC1696a, InterfaceC1436k onChangeValue, InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10) {
        int i11;
        InterfaceC10459q interfaceC10459q2;
        AbstractC16544l.m18094g(onChangeValue, "onChangeValue");
        c6021p.m6526U(197888658);
        if ((i10 & 6) == 0) {
            i11 = i10 | (c6021p.m6542f(enumC1696a) ? 4 : 2);
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6545h(onChangeValue) ? 32 : 16;
        }
        int i12 = i11 | 384;
        if ((i12 & 147) == 146 && c6021p.m6562y()) {
            c6021p.m6517L();
            interfaceC10459q2 = interfaceC10459q;
        } else {
            C10456n c10456n = C10456n.f30959Y;
            InterfaceC5985X interfaceC5985X = (InterfaceC5985X) AbstractC9834X3.m10481d(new Object[0], null, null, C7449f.f23577p0, c6021p, 3072, 6);
            c6021p.m6524S(-111525087);
            boolean zBooleanValue = ((Boolean) interfaceC5985X.getValue()).booleanValue();
            Object obj = C6013l.f19514a;
            if (zBooleanValue) {
                C20007b c20007b = EnumC1696a.f4823p0;
                C7458o c7458o = C7458o.f23677r0;
                c6021p.m6524S(-111516183);
                boolean zM6542f = c6021p.m6542f(interfaceC5985X);
                Object objM6514H = c6021p.m6514H();
                if (zM6542f || objM6514H == obj) {
                    objM6514H = new C6207k(interfaceC5985X, 8);
                    c6021p.m6537c0(objM6514H);
                }
                c6021p.m6553p(false);
                AbstractC9769M3.m10374a(c20007b, c7458o, enumC1696a, (InterfaceC1426a) objM6514H, onChangeValue, null, AbstractC7455l.f23637a, c6021p, ((i12 << 6) & 896) | 1572864 | ((i12 << 9) & 57344), 32);
            }
            c6021p.m6553p(false);
            C8410b c8410b = AbstractC7455l.f23638b;
            c6021p.m6524S(-111509272);
            boolean zM6542f2 = c6021p.m6542f(interfaceC5985X);
            Object objM6514H2 = c6021p.m6514H();
            if (zM6542f2 || objM6514H2 == obj) {
                objM6514H2 = new C6207k(interfaceC5985X, 9);
                c6021p.m6537c0(objM6514H2);
            }
            c6021p.m6553p(false);
            AbstractC3914G1.m4611a(c8410b, AbstractC10833a.m11209d(c10456n, false, null, (InterfaceC1426a) objM6514H2, 7), null, AbstractC8411c.m8969c(-351001421, c6021p, new C0227a(enumC1696a, 29)), AbstractC7455l.f23639c, null, null, 0.0f, 0.0f, c6021p, 27654, 484);
            interfaceC10459q2 = c10456n;
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C0184L0(enumC1696a, onChangeValue, interfaceC10459q2, i10, 27);
        }
    }

    /* JADX INFO: renamed from: b */
    public static C18022x m9910b(C3676s c3676s) {
        try {
            return new C18022x(c3676s.m4395w("count").mo4382p());
        } catch (IllegalStateException e10) {
            throw new C3677t("Unable to parse json into type LongTask", e10);
        } catch (NullPointerException e11) {
            throw new C3677t("Unable to parse json into type LongTask", e11);
        } catch (NumberFormatException e12) {
            throw new C3677t("Unable to parse json into type LongTask", e12);
        }
    }
}
