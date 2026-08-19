package p571X9;

import androidx.compose.foundation.AbstractC10833a;
import androidx.fragment.app.OwC.wNrQXvwLiB;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC16544l;
import mh.EnumC17264l;
import p003A1.C0184L0;
import p003A1.C0227a;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p214Ib.AbstractC3673p;
import p214Ib.C3676s;
import p214Ib.C3677t;
import p229J0.AbstractC3914G1;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p349O0.InterfaceC5985X;
import p363Og.C6207k;
import p482Tg.AbstractC7454k;
import p482Tg.C7449f;
import p482Tg.C7458o;
import p537W0.AbstractC8411c;
import p537W0.C8410b;
import p594Y9.AbstractC9769M3;
import p594Y9.AbstractC9834X3;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p919o8.C18016v;
import p919o8.EnumC17888D;
import tm.C20007b;

/* JADX INFO: renamed from: X9.j4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9310j4 {
    /* JADX INFO: renamed from: a */
    public static final void m9906a(EnumC17264l value, InterfaceC1436k onChangeValue, InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10) {
        int i11;
        InterfaceC10459q interfaceC10459q2;
        AbstractC16544l.m18094g(value, "value");
        AbstractC16544l.m18094g(onChangeValue, "onChangeValue");
        c6021p.m6526U(1757360273);
        if ((i10 & 6) == 0) {
            i11 = i10 | (c6021p.m6542f(value) ? 4 : 2);
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
            InterfaceC5985X interfaceC5985X = (InterfaceC5985X) AbstractC9834X3.m10481d(new Object[0], null, null, C7449f.f23576o0, c6021p, 3072, 6);
            c6021p.m6524S(1460843348);
            boolean zBooleanValue = ((Boolean) interfaceC5985X.getValue()).booleanValue();
            Object obj = C6013l.f19514a;
            if (zBooleanValue) {
                C20007b c20007b = EnumC17264l.f55063t0;
                C7458o c7458o = C7458o.f23676q0;
                c6021p.m6524S(1460850064);
                boolean zM6542f = c6021p.m6542f(interfaceC5985X);
                Object objM6514H = c6021p.m6514H();
                if (zM6542f || objM6514H == obj) {
                    objM6514H = new C6207k(interfaceC5985X, 6);
                    c6021p.m6537c0(objM6514H);
                }
                c6021p.m6553p(false);
                AbstractC9769M3.m10374a(c20007b, c7458o, value, (InterfaceC1426a) objM6514H, onChangeValue, null, AbstractC7454k.f23634a, c6021p, ((i12 << 6) & 896) | 1572864 | ((i12 << 9) & 57344), 32);
            }
            c6021p.m6553p(false);
            C8410b c8410b = AbstractC7454k.f23635b;
            c6021p.m6524S(1460859823);
            boolean zM6542f2 = c6021p.m6542f(interfaceC5985X);
            Object objM6514H2 = c6021p.m6514H();
            if (zM6542f2 || objM6514H2 == obj) {
                objM6514H2 = new C6207k(interfaceC5985X, 7);
                c6021p.m6537c0(objM6514H2);
            }
            c6021p.m6553p(false);
            AbstractC3914G1.m4611a(c8410b, AbstractC10833a.m11209d(c10456n, false, null, (InterfaceC1426a) objM6514H2, 7), null, AbstractC8411c.m8969c(2101017842, c6021p, new C0227a(value, 28)), AbstractC7454k.f23636c, null, null, 0.0f, 0.0f, c6021p, 27654, 484);
            interfaceC10459q2 = c10456n;
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C0184L0(value, onChangeValue, interfaceC10459q2, i10, 26);
        }
    }

    /* JADX INFO: renamed from: b */
    public static C18016v m9907b(C3676s c3676s) {
        EnumC17888D enumC17888D;
        try {
            ArrayList arrayList = c3676s.m4395w(wNrQXvwLiB.AbTltvEidntOIYu).m4389j().f11172Y;
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String strMo4384r = ((AbstractC3673p) it.next()).mo4384r();
                AbstractC16544l.m18093f(strMo4384r, "it.asString");
                EnumC17888D[] enumC17888DArrValues = EnumC17888D.values();
                int length = enumC17888DArrValues.length;
                int i10 = 0;
                while (true) {
                    if (i10 >= length) {
                        throw new NoSuchElementException("Array contains no element matching the predicate.");
                    }
                    enumC17888D = enumC17888DArrValues[i10];
                    if (enumC17888D.f57011Y.equals(strMo4384r)) {
                        break;
                    }
                    i10++;
                }
                arrayList2.add(enumC17888D);
            }
            return new C18016v(arrayList2);
        } catch (IllegalStateException e10) {
            throw new C3677t("Unable to parse json into type Frustration", e10);
        } catch (NullPointerException e11) {
            throw new C3677t("Unable to parse json into type Frustration", e11);
        } catch (NumberFormatException e12) {
            throw new C3677t("Unable to parse json into type Frustration", e12);
        }
    }
}
