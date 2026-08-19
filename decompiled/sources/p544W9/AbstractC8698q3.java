package p544W9;

import android.content.Context;
import android.os.Process;
import p049Bm.InterfaceC1436k;
import p296Lk.C5108e;
import p296Lk.C5116m;
import p296Lk.C5117n;
import p537W0.C8410b;

/* JADX INFO: renamed from: W9.q3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8698q3 {
    /* JADX INFO: renamed from: a */
    public static boolean m9399a(Context context, String str) {
        AbstractC8483G3.m9133c(context, "The application context is required.");
        return context.checkPermission(str, Process.myPid(), Process.myUid()) == 0;
    }

    /* JADX INFO: renamed from: b */
    public static void m9400b(C5117n c5117n, int i10, InterfaceC1436k interfaceC1436k, C8410b c8410b) {
        C5116m c5116m = C5116m.f16716Z;
        c5117n.getClass();
        c5117n.f16719a.m1047b(i10, new C5108e(interfaceC1436k, null, c5116m, c8410b));
    }
}
