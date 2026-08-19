package p594Y9;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC16544l;
import p001A.AbstractC0010F;
import p017Af.C0492w;
import p039Bc.C0885s;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1439n;
import p214Ib.C3676s;
import p214Ib.C3677t;
import p229J0.AbstractC4152w2;
import p229J0.C3880A3;
import p349O0.C6018n0;
import p349O0.C6021p;
import p537W0.AbstractC8411c;
import p537W0.C8410b;
import p635a1.InterfaceC10459q;
import p919o8.AbstractC17976h1;
import p919o8.C18015u1;
import p919o8.C18018v1;

/* JADX INFO: renamed from: Y9.L3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9763L3 {
    /* JADX INFO: renamed from: a */
    public static final void m10366a(InterfaceC1426a onDismissRequest, InterfaceC10459q interfaceC10459q, C3880A3 c3880a3, InterfaceC1439n interfaceC1439n, C8410b c8410b, C6021p c6021p, int i10) {
        int i11;
        int i12;
        C3880A3 c3880a3M4785f;
        C3880A3 c3880a4;
        AbstractC16544l.m18094g(onDismissRequest, "onDismissRequest");
        c6021p.m6526U(116196547);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6545h(onDismissRequest) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6542f(interfaceC10459q) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c6021p.m6545h(interfaceC1439n) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= c6021p.m6545h(c8410b) ? 16384 : 8192;
        }
        if ((i11 & 9363) == 9362 && c6021p.m6562y()) {
            c6021p.m6517L();
            c3880a4 = c3880a3;
        } else {
            c6021p.m6519N();
            if ((i10 & 1) == 0 || c6021p.m6561x()) {
                i12 = i11 & (-897);
                c3880a3M4785f = AbstractC4152w2.m4785f(0, 3, c6021p, false);
            } else {
                c6021p.m6517L();
                i12 = i11 & (-897);
                c3880a3M4785f = c3880a3;
            }
            c6021p.m6554q();
            AbstractC4152w2.m4780a(onDismissRequest, interfaceC10459q, c3880a3M4785f, 0.0f, null, 0L, 0L, 0.0f, 0L, null, null, null, AbstractC8411c.m8969c(-1656685434, c6021p, new C0885s(interfaceC1439n, 16, c8410b)), c6021p, i12 & 1022, 384, 4088);
            c3880a4 = c3880a3M4785f;
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C0492w(onDismissRequest, interfaceC10459q, c3880a4, interfaceC1439n, c8410b, i10);
        }
    }

    /* JADX INFO: renamed from: b */
    public static C18015u1 m10367b(C3676s c3676s) {
        try {
            C18018v1 c18018v1M10375b = AbstractC9769M3.m10375b(c3676s.m4395w("view").m4390m());
            String strMo4384r = c3676s.m4395w("source").mo4384r();
            AbstractC16544l.m18093f(strMo4384r, "jsonObject.get(\"source\").asString");
            for (int i10 : AbstractC0010F.m27k(8)) {
                if (AbstractC17976h1.m19671f(i10).equals(strMo4384r)) {
                    return new C18015u1(c18018v1M10375b, i10);
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        } catch (IllegalStateException e10) {
            throw new C3677t("Unable to parse json into type Container", e10);
        } catch (NullPointerException e11) {
            throw new C3677t("Unable to parse json into type Container", e11);
        } catch (NumberFormatException e12) {
            throw new C3677t("Unable to parse json into type Container", e12);
        }
    }
}
