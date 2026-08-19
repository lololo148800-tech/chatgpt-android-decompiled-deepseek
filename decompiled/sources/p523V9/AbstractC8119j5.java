package p523V9;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import p001A.AbstractC0091u0;
import p677c8.C11691c;
import p895n1.C17425e;

/* JADX INFO: renamed from: V9.j5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8119j5 {

    /* JADX INFO: renamed from: a */
    public static C17425e f25454a;

    /* JADX INFO: renamed from: b */
    public static Object m8621b(Bundle bundle, String str, Class cls) {
        if (Build.VERSION.SDK_INT >= 34) {
            return AbstractC0091u0.m323a(bundle, str, cls);
        }
        Parcelable parcelable = bundle.getParcelable(str);
        if (cls.isInstance(parcelable)) {
            return parcelable;
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public abstract C11691c mo8622a();
}
