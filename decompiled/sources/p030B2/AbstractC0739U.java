package p030B2;

import android.R;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import p009A7.FlM.nkFZpTrMPpn;

/* JADX INFO: renamed from: B2.U */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0739U {

    /* JADX INFO: renamed from: a */
    public static final Method f2102a;

    /* JADX INFO: renamed from: a */
    public static float m1587a(ViewConfiguration viewConfiguration, Context context) {
        Method method;
        if (Build.VERSION.SDK_INT >= 25 && (method = f2102a) != null) {
            try {
                return ((Integer) method.invoke(viewConfiguration, null)).intValue();
            } catch (Exception unused) {
                Log.i("ViewConfigCompat", "Could not find method getScaledScrollFactor() on ViewConfiguration");
            }
        }
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
            return typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return 0.0f;
    }

    static {
        if (Build.VERSION.SDK_INT == 25) {
            try {
                f2102a = ViewConfiguration.class.getDeclaredMethod(nkFZpTrMPpn.RKisDyO, null);
            } catch (Exception unused) {
                Log.i("ViewConfigCompat", "Could not find method getScaledScrollFactor() on ViewConfiguration");
            }
        }
    }
}
