package p571X9;

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

/* JADX INFO: renamed from: X9.M4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9173M4 {

    /* JADX INFO: renamed from: k */
    public static C9377v f27951k;

    /* JADX INFO: renamed from: l */
    public static final C7936M f27952l;

    /* JADX INFO: renamed from: a */
    public final String f27953a;

    /* JADX INFO: renamed from: b */
    public final String f27954b;

    /* JADX INFO: renamed from: c */
    public final C9155J4 f27955c;

    /* JADX INFO: renamed from: d */
    public final C7607i f27956d;

    /* JADX INFO: renamed from: e */
    public final C13606o f27957e;

    /* JADX INFO: renamed from: f */
    public final C13606o f27958f;

    /* JADX INFO: renamed from: g */
    public final String f27959g;

    /* JADX INFO: renamed from: h */
    public final int f27960h;

    /* JADX INFO: renamed from: i */
    public final HashMap f27961i = new HashMap();

    /* JADX INFO: renamed from: j */
    public final HashMap f27962j = new HashMap();

    static {
        Object[] objArr = {"optional-module-barcode", "com.google.android.gms.vision.barcode"};
        objArr[0].getClass();
        objArr[1].getClass();
        f27952l = new C7936M(2, objArr);
    }

    public C9173M4(Context context, C7607i c7607i, C9155J4 c9155j4, String str) {
        this.f27953a = context.getPackageName();
        this.f27954b = AbstractC7601c.m7947a(context);
        this.f27956d = c7607i;
        this.f27955c = c9155j4;
        C9191P4.m9753b();
        this.f27959g = str;
        C7603e c7603eM7948a = C7603e.m7948a();
        CallableC4829b callableC4829b = new CallableC4829b(this, 4);
        c7603eM7948a.getClass();
        this.f27957e = C7603e.m7949b(callableC4829b);
        C7603e c7603eM7948a2 = C7603e.m7948a();
        c7607i.getClass();
        CallableC7586p callableC7586p = new CallableC7586p(c7607i, 3);
        c7603eM7948a2.getClass();
        this.f27958f = C7603e.m7949b(callableC7586p);
        C7936M c7936m = f27952l;
        this.f27960h = c7936m.containsKey(str) ? C3020f.m3867d(context, (String) c7936m.get(str), false) : -1;
    }

    /* JADX INFO: renamed from: a */
    public static long m9725a(ArrayList arrayList, double d10) {
        return ((Long) arrayList.get(Math.max(((int) Math.ceil((d10 / 100.0d) * ((double) arrayList.size()))) - 1, 0))).longValue();
    }

    /* JADX INFO: renamed from: b */
    public final void m9726b(InterfaceC9161K4 interfaceC9161K4, EnumC9369t3 enumC9369t3) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (m9728d(enumC9369t3, jElapsedRealtime)) {
            this.f27961i.put(enumC9369t3, Long.valueOf(jElapsedRealtime));
            EnumC7610l.f24056Y.execute(new RunnableC0758g0(this, interfaceC9161K4.mo365b(), enumC9369t3, m9727c(), 3));
        }
    }

    /* JADX INFO: renamed from: c */
    public final String m9727c() {
        C13606o c13606o = this.f27957e;
        return c13606o.m15132k() ? (String) c13606o.m15130i() : C20489g.f65055c.m21137a(this.f27959g);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m9728d(EnumC9369t3 enumC9369t3, long j10) {
        HashMap map = this.f27961i;
        return map.get(enumC9369t3) == null || j10 - ((Long) map.get(enumC9369t3)).longValue() > TimeUnit.SECONDS.toMillis(30L);
    }
}
