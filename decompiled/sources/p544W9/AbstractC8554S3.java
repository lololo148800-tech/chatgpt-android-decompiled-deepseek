package p544W9;

import android.content.Context;
import android.os.Build;
import p328N1.C5586b;
import p328N1.C5587c;
import p328N1.C5600p;
import p328N1.C5610z;

/* JADX INFO: renamed from: W9.S3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8554S3 {
    /* JADX INFO: renamed from: a */
    public static final C5600p m9213a(Context context) {
        return new C5600p(new C5586b(context, 0), new C5587c(Build.VERSION.SDK_INT >= 31 ? C5610z.f18161a.m5997a(context) : 0));
    }
}
