package p544W9;

import android.content.Context;
import java.util.HashMap;
import p165G9.C3020f;
import p277L.CallableC4829b;
import p499U9.CallableC7586p;
import p501Ub.AbstractC7601c;
import p501Ub.C7603e;
import p501Ub.C7607i;
import p523V9.C7936M;
import p746fa.C13606o;

/* JADX INFO: renamed from: W9.M4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8520M4 {

    /* JADX INFO: renamed from: j */
    public static C8573V4 f26337j;

    /* JADX INFO: renamed from: k */
    public static final C7936M f26338k;

    /* JADX INFO: renamed from: a */
    public final String f26339a;

    /* JADX INFO: renamed from: b */
    public final String f26340b;

    /* JADX INFO: renamed from: c */
    public final C8514L4 f26341c;

    /* JADX INFO: renamed from: d */
    public final C7607i f26342d;

    /* JADX INFO: renamed from: e */
    public final C13606o f26343e;

    /* JADX INFO: renamed from: f */
    public final C13606o f26344f;

    /* JADX INFO: renamed from: g */
    public final String f26345g;

    /* JADX INFO: renamed from: h */
    public final int f26346h;

    /* JADX INFO: renamed from: i */
    public final HashMap f26347i = new HashMap();

    static {
        Object[] objArr = {"optional-module-barcode", "com.google.android.gms.vision.barcode"};
        objArr[0].getClass();
        objArr[1].getClass();
        f26338k = new C7936M(1, objArr);
    }

    public C8520M4(Context context, C7607i c7607i, C8514L4 c8514l4) {
        new HashMap();
        this.f26339a = context.getPackageName();
        this.f26340b = AbstractC7601c.m7947a(context);
        this.f26342d = c7607i;
        this.f26341c = c8514l4;
        C8544Q4.m9205b();
        this.f26345g = "vision-common";
        C7603e c7603eM7948a = C7603e.m7948a();
        CallableC4829b callableC4829b = new CallableC4829b(this, 3);
        c7603eM7948a.getClass();
        this.f26343e = C7603e.m7949b(callableC4829b);
        C7603e c7603eM7948a2 = C7603e.m7948a();
        c7607i.getClass();
        CallableC7586p callableC7586p = new CallableC7586p(c7607i, 2);
        c7603eM7948a2.getClass();
        this.f26344f = C7603e.m7949b(callableC7586p);
        C7936M c7936m = f26338k;
        this.f26346h = c7936m.containsKey("vision-common") ? C3020f.m3867d(context, (String) c7936m.get("vision-common"), false) : -1;
    }
}
