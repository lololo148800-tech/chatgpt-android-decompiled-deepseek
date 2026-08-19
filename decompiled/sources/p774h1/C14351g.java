package p774h1;

import android.graphics.Bitmap;
import android.os.Build;

/* JADX INFO: renamed from: h1.g */
/* JADX INFO: loaded from: classes.dex */
public final class C14351g {

    /* JADX INFO: renamed from: a */
    public final Bitmap f45036a;

    public C14351g(Bitmap bitmap) {
        this.f45036a = bitmap;
    }

    /* JADX INFO: renamed from: a */
    public final int m15728a() {
        Bitmap.Config config = this.f45036a.getConfig();
        if (config == Bitmap.Config.ALPHA_8) {
            return 1;
        }
        if (config == Bitmap.Config.RGB_565) {
            return 2;
        }
        if (config != Bitmap.Config.ARGB_4444) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 26 && config == Bitmap.Config.RGBA_F16) {
                return 3;
            }
            if (i10 >= 26 && config == Bitmap.Config.HARDWARE) {
                return 4;
            }
        }
        return 0;
    }
}
