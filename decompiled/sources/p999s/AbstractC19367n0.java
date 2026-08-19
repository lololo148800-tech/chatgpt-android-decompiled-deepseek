package p999s;

import android.widget.AbsListView;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: s.n0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC19367n0 {

    /* JADX INFO: renamed from: a */
    public static final Field f61331a;

    static {
        Field declaredField = null;
        try {
            declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e10) {
            e10.printStackTrace();
        }
        f61331a = declaredField;
    }
}
