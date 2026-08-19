package p571X9;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p001A.AbstractC0010F;
import p003A1.AbstractC0233b1;
import p049Bm.InterfaceC1436k;
import p124Ei.C2446D;
import p214Ib.C3676s;
import p214Ib.C3677t;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p402Qc.C6593i;
import p478Tc.AbstractC7308l;
import p893n.AbstractActivityC17375g;
import p919o8.AbstractC17962d;
import p919o8.C17983k;
import p919o8.C17986l;

/* JADX INFO: renamed from: X9.Y3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9243Y3 {
    /* JADX INFO: renamed from: a */
    public static final void m9817a(int i10, C6021p c6021p) {
        c6021p.m6526U(-98947069);
        if (i10 == 0 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            if (((Boolean) c6021p.m6548k(AbstractC0233b1.f873a)).booleanValue()) {
                C6018n0 c6018n0M6555r = c6021p.m6555r();
                if (c6018n0M6555r != null) {
                    c6018n0M6555r.f19536d = new C2446D(i10, 11);
                    return;
                }
                return;
            }
            AbstractActivityC17375g abstractActivityC17375g = (AbstractActivityC17375g) c6021p.m6548k(AbstractC7308l.f23151a);
            C17296C c17296c = C17296C.f55119a;
            c6021p.m6524S(-185286801);
            boolean zM6545h = c6021p.m6545h(abstractActivityC17375g);
            Object objM6514H = c6021p.m6514H();
            if (zM6545h || objM6514H == C6013l.f19514a) {
                objM6514H = new C6593i(abstractActivityC17375g, 10);
                c6021p.m6537c0(objM6514H);
            }
            c6021p.m6553p(false);
            C5997d.m6444c(c17296c, (InterfaceC1436k) objM6514H, c6021p);
        }
        C6018n0 c6018n0M6555r2 = c6021p.m6555r();
        if (c6018n0M6555r2 != null) {
            c6018n0M6555r2.f19536d = new C2446D(i10, 12);
        }
    }

    /* JADX INFO: renamed from: b */
    public static C17983k m9818b(C3676s c3676s) {
        try {
            C17986l c17986lM9824a = AbstractC9249Z3.m9824a(c3676s.m4395w("view").m4390m());
            String strMo4384r = c3676s.m4395w("source").mo4384r();
            AbstractC16544l.m18093f(strMo4384r, "jsonObject.get(\"source\").asString");
            for (int i10 : AbstractC0010F.m27k(8)) {
                if (AbstractC17962d.m19636a(i10).equals(strMo4384r)) {
                    return new C17983k(c17986lM9824a, i10);
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
