package p544W9;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import com.google.protobuf.AbstractC12107L1;
import fo.C13711h;
import kotlin.jvm.internal.AbstractC16544l;
import p204I1.C3578I;
import p204I1.C3580K;
import p204I1.C3582M;
import p204I1.C3590f;
import p204I1.C3599o;
import p571X9.AbstractC9160K3;
import p571X9.AbstractC9388w4;
import p604Yk.C10077b;
import p759g1.C13800b;
import p759g1.C13803e;
import p821j1.InterfaceC16039d;
import p895n1.C17425e;

/* JADX INFO: renamed from: W9.m */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8670m {

    /* JADX INFO: renamed from: a */
    public static C17425e f26604a;

    /* JADX INFO: renamed from: a */
    public static void m9362a(InterfaceC16039d interfaceC16039d, C3580K c3580k, String str, long j10, C3582M c3582m) {
        C3578I c3578iM4264a = C3580K.m4264a(c3580k, new C3590f(6, str, null), c3582m, 1, true, Integer.MAX_VALUE, AbstractC9388w4.m9958a(0, Math.round((float) Math.ceil(C13803e.m15333e(interfaceC16039d.mo17602i()) - C13800b.m15306g(j10))), 0, Math.round((float) Math.ceil(C13803e.m15331c(interfaceC16039d.mo17602i()) - C13800b.m15307h(j10)))), interfaceC16039d.getLayoutDirection(), interfaceC16039d, null, false, 1568);
        C13711h c13711hMo17601f0 = interfaceC16039d.mo17601f0();
        long jM15202x = c13711hMo17601f0.m15202x();
        c13711hMo17601f0.m15196m().mo15706e();
        try {
            C10077b c10077b = (C10077b) c13711hMo17601f0.f43259Z;
            c10077b.m10665M(C13800b.m15306g(j10), C13800b.m15307h(j10));
            if (c3578iM4264a.m4254d() && !AbstractC9160K3.m9708a(c3578iM4264a.f10892a.f10887f, 3)) {
                long j11 = c3578iM4264a.f10894c;
                c10077b.m10675z(0.0f, 0.0f, (int) (j11 >> 32), (int) (j11 & 4294967295L), 1);
            }
            C3599o.m4307g(c3578iM4264a.f10893b, interfaceC16039d.mo17601f0().m15196m(), 0L, null, null, null, 3, 30);
        } finally {
            AbstractC12107L1.m13830u(c13711hMo17601f0, jM15202x);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final String m9363b(Context context) {
        ActivityInfo activityInfo;
        AbstractC16544l.m18094g(context, "<this>");
        ResolveInfo resolveInfoResolveActivity = context.getPackageManager().resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com")), 65536);
        if (resolveInfoResolveActivity == null || (activityInfo = resolveInfoResolveActivity.activityInfo) == null) {
            return null;
        }
        return activityInfo.packageName;
    }
}
