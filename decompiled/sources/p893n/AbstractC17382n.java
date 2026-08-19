package p893n;

import android.os.PowerManager;
import java.util.Locale;

/* JADX INFO: renamed from: n.n */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC17382n {
    /* JADX INFO: renamed from: a */
    public static boolean m19073a(PowerManager powerManager) {
        return powerManager.isPowerSaveMode();
    }

    /* JADX INFO: renamed from: b */
    public static String m19074b(Locale locale) {
        return locale.toLanguageTag();
    }
}
