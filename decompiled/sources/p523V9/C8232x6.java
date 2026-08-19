package p523V9;

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
import p746fa.C13606o;

/* JADX INFO: renamed from: V9.x6 */
/* JADX INFO: loaded from: classes.dex */
public final class C8232x6 {

    /* JADX INFO: renamed from: k */
    public static C7896H f25698k;

    /* JADX INFO: renamed from: l */
    public static final C7936M f25699l;

    /* JADX INFO: renamed from: a */
    public final String f25700a;

    /* JADX INFO: renamed from: b */
    public final String f25701b;

    /* JADX INFO: renamed from: c */
    public final C8216v6 f25702c;

    /* JADX INFO: renamed from: d */
    public final C7607i f25703d;

    /* JADX INFO: renamed from: e */
    public final C13606o f25704e;

    /* JADX INFO: renamed from: f */
    public final C13606o f25705f;

    /* JADX INFO: renamed from: g */
    public final String f25706g;

    /* JADX INFO: renamed from: h */
    public final int f25707h;

    /* JADX INFO: renamed from: i */
    public final HashMap f25708i = new HashMap();

    /* JADX INFO: renamed from: j */
    public final HashMap f25709j = new HashMap();

    static {
        Object[] objArr = {"optional-module-barcode", "com.google.android.gms.vision.barcode"};
        objArr[0].getClass();
        objArr[1].getClass();
        f25699l = new C7936M(0, objArr);
    }

    public C8232x6(Context context, C7607i c7607i, C8216v6 c8216v6, String str) {
        this.f25700a = context.getPackageName();
        this.f25701b = AbstractC7601c.m7947a(context);
        this.f25703d = c7607i;
        this.f25702c = c8216v6;
        C7863C6.m8140b();
        this.f25706g = str;
        C7603e c7603eM7948a = C7603e.m7948a();
        CallableC4829b callableC4829b = new CallableC4829b(this, 2);
        c7603eM7948a.getClass();
        this.f25704e = C7603e.m7949b(callableC4829b);
        C7603e c7603eM7948a2 = C7603e.m7948a();
        c7607i.getClass();
        CallableC7586p callableC7586p = new CallableC7586p(c7607i, 1);
        c7603eM7948a2.getClass();
        this.f25705f = C7603e.m7949b(callableC7586p);
        C7936M c7936m = f25699l;
        this.f25707h = c7936m.containsKey(str) ? C3020f.m3867d(context, (String) c7936m.get(str), false) : -1;
    }

    /* JADX INFO: renamed from: a */
    public static long m8869a(ArrayList arrayList, double d10) {
        return ((Long) arrayList.get(Math.max(((int) Math.ceil((d10 / 100.0d) * ((double) arrayList.size()))) - 1, 0))).longValue();
    }

    /* JADX INFO: renamed from: b */
    public final void m8870b(InterfaceC8224w6 interfaceC8224w6, EnumC7909I4 enumC7909I4) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (m8872d(enumC7909I4, jElapsedRealtime)) {
            this.f25708i.put(enumC7909I4, Long.valueOf(jElapsedRealtime));
            EnumC7610l.f24056Y.execute(new RunnableC0758g0(this, interfaceC8224w6.mo2498a(), enumC7909I4, m8871c(), 1));
        }
    }

    /* JADX INFO: renamed from: c */
    public final String m8871c() {
        C13606o c13606o = this.f25704e;
        return c13606o.m15132k() ? (String) c13606o.m15130i() : C20489g.f65055c.m21137a(this.f25706g);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m8872d(EnumC7909I4 enumC7909I4, long j10) {
        HashMap map = this.f25708i;
        return map.get(enumC7909I4) == null || j10 - ((Long) map.get(enumC7909I4)).longValue() > TimeUnit.SECONDS.toMillis(30L);
    }
}
