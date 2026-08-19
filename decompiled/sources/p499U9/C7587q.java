package p499U9;

import android.content.Context;
import java.util.HashMap;
import p165G9.C3020f;
import p277L.CallableC4829b;
import p501Ub.AbstractC7601c;
import p501Ub.C7603e;
import p501Ub.C7607i;

/* JADX INFO: renamed from: U9.q */
/* JADX INFO: loaded from: classes.dex */
public final class C7587q {

    /* JADX INFO: renamed from: b */
    public static final C7582l f24008b = C7582l.m7925a(1, new Object[]{"optional-module-barcode", "com.google.android.gms.vision.barcode"}, null);

    /* JADX INFO: renamed from: a */
    public final String f24009a;

    public C7587q(Context context, C7607i c7607i) {
        new HashMap();
        new HashMap();
        context.getPackageName();
        AbstractC7601c.m7947a(context);
        synchronized (C7591u.class) {
            if (C7591u.f24013Z == null) {
                C7591u.f24013Z = new C7591u(0);
            }
        }
        this.f24009a = "common";
        C7603e c7603eM7948a = C7603e.m7948a();
        CallableC4829b callableC4829b = new CallableC4829b(this, 1);
        c7603eM7948a.getClass();
        C7603e.m7949b(callableC4829b);
        C7603e c7603eM7948a2 = C7603e.m7948a();
        c7607i.getClass();
        CallableC7586p callableC7586p = new CallableC7586p(c7607i, 0);
        c7603eM7948a2.getClass();
        C7603e.m7949b(callableC7586p);
        C7582l c7582l = f24008b;
        if (c7582l.containsKey("common")) {
            C3020f.m3867d(context, (String) c7582l.get("common"), false);
        }
    }
}
