package p594Y9;

import android.content.Context;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import p030B2.RunnableC0758g0;
import p1060v9.C20489g;
import p165G9.C3020f;
import p277L.CallableC4829b;
import p499U9.CallableC7586p;
import p501Ub.AbstractC7601c;
import p501Ub.C7603e;
import p501Ub.C7607i;
import p501Ub.EnumC7610l;
import p523V9.C7936M;
import p746fa.C13606o;

/* JADX INFO: renamed from: Y9.P4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9788P4 {

    /* JADX INFO: renamed from: k */
    public static C9998y f29299k;

    /* JADX INFO: renamed from: l */
    public static final C7936M f29300l;

    /* JADX INFO: renamed from: a */
    public final String f29301a;

    /* JADX INFO: renamed from: b */
    public final String f29302b;

    /* JADX INFO: renamed from: c */
    public final C9770M4 f29303c;

    /* JADX INFO: renamed from: d */
    public final C7607i f29304d;

    /* JADX INFO: renamed from: e */
    public final C13606o f29305e;

    /* JADX INFO: renamed from: f */
    public final C13606o f29306f;

    /* JADX INFO: renamed from: g */
    public final String f29307g;

    /* JADX INFO: renamed from: h */
    public final int f29308h;

    /* JADX INFO: renamed from: i */
    public final HashMap f29309i = new HashMap();

    /* JADX INFO: renamed from: j */
    public final HashMap f29310j = new HashMap();

    static {
        Object[] objArr = {"optional-module-barcode", "com.google.android.gms.vision.barcode"};
        objArr[0].getClass();
        objArr[1].getClass();
        f29300l = new C7936M(3, objArr);
    }

    public C9788P4(Context context, C7607i c7607i, C9770M4 c9770m4, String str) {
        this.f29301a = context.getPackageName();
        this.f29302b = AbstractC7601c.m7947a(context);
        this.f29304d = c7607i;
        this.f29303c = c9770m4;
        C9805S4.m10429b();
        this.f29307g = str;
        C7603e c7603eM7948a = C7603e.m7948a();
        CallableC4829b callableC4829b = new CallableC4829b(this, 5);
        c7603eM7948a.getClass();
        this.f29305e = C7603e.m7949b(callableC4829b);
        C7603e c7603eM7948a2 = C7603e.m7948a();
        c7607i.getClass();
        CallableC7586p callableC7586p = new CallableC7586p(c7607i, 4);
        c7603eM7948a2.getClass();
        this.f29306f = C7603e.m7949b(callableC7586p);
        C7936M c7936m = f29300l;
        this.f29308h = c7936m.containsKey(str) ? C3020f.m3867d(context, (String) c7936m.get(str), false) : -1;
    }

    /* JADX INFO: renamed from: a */
    public static long m10403a(ArrayList arrayList, double d10) {
        return ((Long) arrayList.get(Math.max(((int) Math.ceil((d10 / 100.0d) * ((double) arrayList.size()))) - 1, 0))).longValue();
    }

    /* JADX INFO: renamed from: b */
    public final void m10404b(InterfaceC9776N4 interfaceC9776N4, EnumC9972t3 enumC9972t3) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (m10406d(enumC9972t3, jElapsedRealtime)) {
            this.f29309i.put(enumC9972t3, Long.valueOf(jElapsedRealtime));
            EnumC7610l.f24056Y.execute(new RunnableC0758g0(this, interfaceC9776N4.mo364a(), enumC9972t3, m10405c(), 4));
        }
    }

    /* JADX INFO: renamed from: c */
    public final String m10405c() {
        C13606o c13606o = this.f29305e;
        return c13606o.m15132k() ? (String) c13606o.m15130i() : C20489g.f65055c.m21137a(this.f29307g);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m10406d(EnumC9972t3 enumC9972t3, long j10) {
        HashMap map = this.f29309i;
        return map.get(enumC9972t3) == null || j10 - ((Long) map.get(enumC9972t3)).longValue() > TimeUnit.SECONDS.toMillis(30L);
    }
}
