package p814ik;

import android.os.Build;
import java.io.File;
import p046Bk.C1342O;
import p1113xn.AbstractC21322p;
import p1113xn.AbstractC21329w;

/* JADX INFO: renamed from: ik.d */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC15032d {

    /* JADX INFO: renamed from: a */
    public static final C1342O f46729a = new C1342O(28);

    /* JADX INFO: renamed from: a */
    public static final boolean m16160a() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7 = Build.BRAND;
        if (str7 == null || (str = Build.DEVICE) == null || (str2 = Build.FINGERPRINT) == null || (str3 = Build.HARDWARE) == null || (str4 = Build.MODEL) == null || (str5 = Build.MANUFACTURER) == null || (str6 = Build.PRODUCT) == null) {
            return true;
        }
        return (AbstractC21329w.m21734u(str7, "generic", false) && AbstractC21329w.m21734u(str, "generic", false)) || AbstractC21329w.m21734u(str2, "generic", false) || AbstractC21329w.m21734u(str2, "unknown", false) || AbstractC21322p.m21667A(str3, "goldfish", false) || AbstractC21322p.m21667A(str3, "ranchu", false) || AbstractC21322p.m21667A(str4, "google_sdk", false) || AbstractC21322p.m21667A(str4, "Emulator", false) || AbstractC21322p.m21667A(str4, "Android SDK built for x86", false) || AbstractC21322p.m21667A(str5, "Genymotion", false) || AbstractC21322p.m21667A(str6, "sdk_google", false) || AbstractC21322p.m21667A(str6, "google_sdk", false) || AbstractC21322p.m21667A(str6, "sdk", false) || AbstractC21322p.m21667A(str6, "sdk_x86", false) || AbstractC21322p.m21667A(str6, "sdk_gphone64_arm64", false) || AbstractC21322p.m21667A(str6, "vbox86p", false) || AbstractC21322p.m21667A(str6, "emulator", false) || AbstractC21322p.m21667A(str6, "simulator", false) || (new File("/storage/emulated/0/Android/data/com.android.ld.appstore/files").exists() || new File("/storage/emulated/0/Android/data/com.android.ld.appstore/cache").exists());
    }
}
