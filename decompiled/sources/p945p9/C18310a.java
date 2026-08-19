package p945p9;

import android.content.Context;
import p1009s9.C19502e;
import p1022t9.AbstractC19821f;
import p165G9.C3020f;

/* JADX INFO: renamed from: p9.a */
/* JADX INFO: loaded from: classes.dex */
public final class C18310a extends AbstractC19821f {

    /* JADX INFO: renamed from: k */
    public static int f58440k = 1;

    /* JADX INFO: renamed from: c */
    public final synchronized int m19841c() {
        int i10;
        try {
            i10 = f58440k;
            if (i10 == 1) {
                Context context = this.f62874a;
                C19502e c19502e = C19502e.f61950d;
                int iM20602c = c19502e.m20602c(context, 12451000);
                if (iM20602c == 0) {
                    i10 = 4;
                    f58440k = 4;
                } else if (c19502e.m20601b(iM20602c, context, null) != null || C3020f.m3865a(context, "com.google.android.gms.auth.api.fallback") == 0) {
                    i10 = 2;
                    f58440k = 2;
                } else {
                    i10 = 3;
                    f58440k = 3;
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return i10;
    }
}
