package p953q0;

import android.os.Build;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: q0.k0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC18589k0 {

    /* JADX INFO: renamed from: a */
    public static final C18555M f59228a;

    static {
        String lowerCase = Build.FINGERPRINT.toLowerCase(Locale.ROOT);
        AbstractC16544l.m18093f(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        f59228a = lowerCase.equals("robolectric") ? new C18555M() : null;
    }
}
