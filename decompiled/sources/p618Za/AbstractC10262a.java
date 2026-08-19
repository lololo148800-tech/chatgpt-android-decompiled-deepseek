package p618Za;

import android.content.pm.PackageManager;
import android.os.Build;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: Za.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC10262a {

    /* JADX INFO: renamed from: a */
    public static final List f30478a = Arrays.asList("com.google.android.apps.chrome", "org.chromium.chrome", "com.chrome.canary", "com.chrome.dev", "com.chrome.beta", "com.android.chrome");

    /* JADX INFO: renamed from: b */
    public static final List f30479b = Arrays.asList("com.chrome.beta", "com.android.chrome");

    /* JADX INFO: renamed from: c */
    public static final List f30480c = Arrays.asList("com.google.android.apps.chrome", "org.chromium.chrome");

    /* JADX INFO: renamed from: a */
    public static boolean m10860a(PackageManager packageManager, String str, int i10) {
        int longVersionCode;
        if (f30480c.contains(str)) {
            return true;
        }
        try {
            longVersionCode = Build.VERSION.SDK_INT >= 28 ? (int) packageManager.getPackageInfo(str, 0).getLongVersionCode() : packageManager.getPackageInfo(str, 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            longVersionCode = 0;
        }
        return longVersionCode >= i10;
    }
}
