package p330N4;

import android.os.Build;

/* JADX INFO: renamed from: N4.E */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5639E {

    /* JADX INFO: renamed from: a */
    public static final boolean f18317a;

    /* JADX INFO: renamed from: b */
    public static final boolean f18318b;

    /* JADX INFO: renamed from: c */
    public static final boolean f18319c;

    static {
        int i10 = Build.VERSION.SDK_INT;
        f18317a = true;
        f18318b = true;
        f18319c = i10 >= 28;
    }
}
