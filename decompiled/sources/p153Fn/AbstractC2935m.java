package p153Fn;

import android.os.Looper;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import p050Bn.AbstractC1454h;
import p050Bn.C1447a;
import p050Bn.C1451e;
import p1091wn.AbstractC21031l;

/* JADX INFO: renamed from: Fn.m */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2935m {

    /* JADX INFO: renamed from: a */
    public static final C1451e f8797a;

    static {
        String property;
        int i10 = AbstractC2943u.f8808a;
        Object next = null;
        try {
            property = System.getProperty("kotlinx.coroutines.fast.service.loader");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property != null) {
            Boolean.parseBoolean(property);
        }
        try {
            Iterator it = AbstractC21031l.m21499w(AbstractC21031l.m21483g(Arrays.asList(new C1447a()).iterator())).iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    int iM2053a = ((C1447a) next).m2053a();
                    do {
                        Object next2 = it.next();
                        int iM2053a2 = ((C1447a) next2).m2053a();
                        if (iM2053a < iM2053a2) {
                            next = next2;
                            iM2053a = iM2053a2;
                        }
                    } while (it.hasNext());
                }
            }
            C1447a c1447a = (C1447a) next;
            if (c1447a == null) {
                throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
            }
            try {
                c1447a.getClass();
                Looper mainLooper = Looper.getMainLooper();
                if (mainLooper == null) {
                    throw new IllegalStateException("The main looper is not available");
                }
                f8797a = new C1451e(AbstractC1454h.m2056b(mainLooper));
            } catch (Throwable th2) {
                c1447a.getClass();
                throw th2;
            }
        } catch (Throwable th3) {
            throw new ServiceConfigurationError(th3.getMessage(), th3);
        }
    }
}
