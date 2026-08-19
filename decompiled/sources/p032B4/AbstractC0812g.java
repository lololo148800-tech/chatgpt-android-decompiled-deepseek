package p032B4;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

/* JADX INFO: renamed from: B4.g */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0812g {
    /* JADX INFO: renamed from: a */
    public static PackageInfo m1870a(PackageManager packageManager, Context context) {
        return packageManager.getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
    }
}
