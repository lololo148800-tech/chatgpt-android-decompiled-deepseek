package p595Ya;

import android.graphics.Bitmap;

/* JADX INFO: renamed from: Ya.a */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC10010a {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f29696a;

    static {
        int[] iArr = new int[Bitmap.Config.values().length];
        try {
            iArr[Bitmap.Config.ARGB_8888.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Bitmap.Config.ALPHA_8.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f29696a = iArr;
    }
}
