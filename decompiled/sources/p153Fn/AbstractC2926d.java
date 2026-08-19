package p153Fn;

import java.util.Arrays;
import java.util.Collection;
import java.util.ServiceConfigurationError;
import p050Bn.C1448b;
import p1091wn.AbstractC21031l;

/* JADX INFO: renamed from: Fn.d */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2926d {

    /* JADX INFO: renamed from: a */
    public static final Collection f8770a;

    static {
        try {
            f8770a = AbstractC21031l.m21499w(AbstractC21031l.m21483g(Arrays.asList(new C1448b()).iterator()));
        } catch (Throwable th2) {
            throw new ServiceConfigurationError(th2.getMessage(), th2);
        }
    }
}
