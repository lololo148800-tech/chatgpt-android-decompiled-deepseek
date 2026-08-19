package p330N4;

import android.widget.ImageView;

/* JADX INFO: renamed from: N4.i */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC5658i {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f18376a;

    static {
        int[] iArr = new int[ImageView.ScaleType.values().length];
        f18376a = iArr;
        try {
            iArr[ImageView.ScaleType.FIT_XY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f18376a[ImageView.ScaleType.CENTER_CROP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}
