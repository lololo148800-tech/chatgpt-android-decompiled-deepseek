package p025An;

import p050Bn.C1451e;
import p153Fn.AbstractC2935m;
import p153Fn.AbstractC2943u;
import p201Hn.C3516e;

/* JADX INFO: renamed from: An.J */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0579J {

    /* JADX INFO: renamed from: a */
    public static final InterfaceC0585M f1812a;

    static {
        String property;
        C1451e c1451e;
        int i10 = AbstractC2943u.f8808a;
        try {
            property = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property != null ? Boolean.parseBoolean(property) : false) {
            C3516e c3516e = AbstractC0593T.f1824a;
            C1451e c1451e2 = AbstractC2935m.f8797a;
            C1451e c1451e3 = c1451e2.f3819q0;
            c1451e = !(c1451e2 instanceof InterfaceC0585M) ? RunnableC0577I.f1807u0 : c1451e2;
        } else {
            c1451e = RunnableC0577I.f1807u0;
        }
        f1812a = c1451e;
    }
}
