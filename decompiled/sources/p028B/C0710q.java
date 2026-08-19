package p028B;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.util.ArrayMap;
import p658b5.C11234e;
import p813ij.C15026j;

/* JADX INFO: renamed from: B.q */
/* JADX INFO: loaded from: classes.dex */
public final class C0710q {

    /* JADX INFO: renamed from: a */
    public final C15026j f2058a;

    /* JADX INFO: renamed from: b */
    public final ArrayMap f2059b = new ArrayMap(4);

    public C0710q(C15026j c15026j) {
        this.f2058a = c15026j;
    }

    /* JADX INFO: renamed from: a */
    public static C0710q m1480a(Context context, Handler handler) {
        C15026j c0711r;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            c0711r = new C0713t(context, null);
        } else if (i10 >= 29) {
            c0711r = new C0712s(context, null);
        } else {
            c0711r = i10 >= 28 ? new C0711r(context, null) : new C15026j(context, new C11234e(handler));
        }
        return new C0710q(c0711r);
    }

    /* JADX INFO: renamed from: b */
    public final C0703j m1481b(String str) {
        C0703j c0703j;
        synchronized (this.f2059b) {
            c0703j = (C0703j) this.f2059b.get(str);
            if (c0703j == null) {
                try {
                    C0703j c0703j2 = new C0703j(this.f2058a.mo1483g(str), str);
                    this.f2059b.put(str, c0703j2);
                    c0703j = c0703j2;
                } catch (AssertionError e10) {
                    throw new C0694a(e10.getMessage(), e10);
                }
            }
        }
        return c0703j;
    }
}
