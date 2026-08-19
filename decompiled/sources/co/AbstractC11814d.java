package co;

import kotlin.jvm.internal.AbstractC16544l;
import mm.C17311n;
import p1113xn.AbstractC21329w;
import p571X9.AbstractC9233X;

/* JADX INFO: renamed from: co.d */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC11814d {

    /* JADX INFO: renamed from: a */
    public static final int f35817a;

    static {
        Object objM9806b;
        try {
            String property = System.getProperty("kotlinx.serialization.json.pool.size");
            AbstractC16544l.m18093f(property, "getProperty(...)");
            objM9806b = AbstractC21329w.m21736w(property);
        } catch (Throwable th2) {
            objM9806b = AbstractC9233X.m9806b(th2);
        }
        if (objM9806b instanceof C17311n) {
            objM9806b = null;
        }
        Integer num = (Integer) objM9806b;
        f35817a = num != null ? num.intValue() : 2097152;
    }
}
