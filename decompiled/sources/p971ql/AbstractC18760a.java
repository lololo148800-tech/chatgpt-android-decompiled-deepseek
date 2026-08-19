package p971ql;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceConfigurationError;
import kotlin.jvm.internal.AbstractC16544l;
import p1091wn.AbstractC21031l;
import p995rl.C19243c;

/* JADX INFO: renamed from: ql.a */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC18760a {

    /* JADX INFO: renamed from: a */
    public static final List f59650a;

    static {
        try {
            Iterator it = Arrays.asList(new C19243c()).iterator();
            AbstractC16544l.m18093f(it, "iterator(...)");
            f59650a = AbstractC21031l.m21499w(AbstractC21031l.m21483g(it));
        } catch (Throwable th2) {
            throw new ServiceConfigurationError(th2.getMessage(), th2);
        }
    }
}
