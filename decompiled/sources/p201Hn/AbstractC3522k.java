package p201Hn;

import java.util.concurrent.TimeUnit;
import p153Fn.AbstractC2923a;
import p153Fn.AbstractC2943u;

/* JADX INFO: renamed from: Hn.k */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3522k {

    /* JADX INFO: renamed from: a */
    public static final String f10641a;

    /* JADX INFO: renamed from: b */
    public static final long f10642b;

    /* JADX INFO: renamed from: c */
    public static final int f10643c;

    /* JADX INFO: renamed from: d */
    public static final int f10644d;

    /* JADX INFO: renamed from: e */
    public static final long f10645e;

    /* JADX INFO: renamed from: f */
    public static final C3518g f10646f;

    static {
        String property;
        int i10 = AbstractC2943u.f8808a;
        try {
            property = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            property = "DefaultDispatcher";
        }
        f10641a = property;
        f10642b = AbstractC2923a.m3739m("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
        int i11 = AbstractC2943u.f8808a;
        if (i11 < 2) {
            i11 = 2;
        }
        f10643c = AbstractC2923a.m3740n("kotlinx.coroutines.scheduler.core.pool.size", i11, 1, 0, 8);
        f10644d = AbstractC2923a.m3740n("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 0, 2097150, 4);
        f10645e = TimeUnit.SECONDS.toNanos(AbstractC2923a.m3739m("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        f10646f = C3518g.f10636a;
    }
}
