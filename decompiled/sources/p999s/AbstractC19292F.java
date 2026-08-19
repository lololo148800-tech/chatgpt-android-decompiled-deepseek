package p999s;

import android.content.res.Resources;
import android.widget.ThemedSpinnerAdapter;
import p817j$.util.Objects;

/* JADX INFO: renamed from: s.F */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC19292F {
    /* JADX INFO: renamed from: a */
    public static void m20363a(ThemedSpinnerAdapter themedSpinnerAdapter, Resources.Theme theme) {
        if (Objects.equals(themedSpinnerAdapter.getDropDownViewTheme(), theme)) {
            return;
        }
        themedSpinnerAdapter.setDropDownViewTheme(theme);
    }
}
