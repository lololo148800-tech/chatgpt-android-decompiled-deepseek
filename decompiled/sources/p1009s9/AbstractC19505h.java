package p1009s9;

import android.content.Context;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: s9.h */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC19505h {

    /* JADX INFO: renamed from: b */
    public static boolean f61954b = false;

    /* JADX INFO: renamed from: c */
    public static boolean f61955c = false;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ int f61957e = 0;

    /* JADX INFO: renamed from: a */
    public static final AtomicBoolean f61953a = new AtomicBoolean();

    /* JADX INFO: renamed from: d */
    public static final AtomicBoolean f61956d = new AtomicBoolean();

    /* JADX INFO: renamed from: a */
    public static boolean m20603a(Context context) {
        try {
            Iterator<PackageInstaller.SessionInfo> it = context.getPackageManager().getPackageInstaller().getAllSessions().iterator();
            while (it.hasNext()) {
                if ("com.google.android.gms".equals(it.next().getAppPackageName())) {
                    return true;
                }
            }
            return context.getPackageManager().getApplicationInfo("com.google.android.gms", 8192).enabled;
        } catch (PackageManager.NameNotFoundException | Exception unused) {
            return false;
        }
    }
}
