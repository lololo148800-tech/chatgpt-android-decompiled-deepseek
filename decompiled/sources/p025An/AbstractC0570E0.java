package p025An;

/* JADX INFO: renamed from: An.E0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0570E0 {

    /* JADX INFO: renamed from: a */
    public static final ThreadLocal f1786a = new ThreadLocal();

    /* JADX INFO: renamed from: a */
    public static AbstractC0607d0 m1147a() {
        ThreadLocal threadLocal = f1786a;
        AbstractC0607d0 abstractC0607d0 = (AbstractC0607d0) threadLocal.get();
        if (abstractC0607d0 != null) {
            return abstractC0607d0;
        }
        C0614h c0614h = new C0614h(Thread.currentThread());
        threadLocal.set(c0614h);
        return c0614h;
    }
}
