package p867l8;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AbstractC16544l;
import p084D4.AbstractC1933p0;
import p084D4.C1901Z;
import p523V9.AbstractC7966P5;

/* JADX INFO: renamed from: l8.a */
/* JADX INFO: loaded from: classes.dex */
public final class C16829a {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static void m18565a(View view, LinkedHashMap linkedHashMap) {
        String strConcat;
        RecyclerView recyclerView;
        for (ViewParent parent = view.getParent(); parent != 0; parent = parent.getParent()) {
            if ((parent instanceof RecyclerView) && view != null && (view.getLayoutParams() instanceof C1901Z)) {
                AbstractC1933p0 abstractC1933p0M12244L = RecyclerView.m12244L(view);
                int iM12261I = -1;
                if (abstractC1933p0M12244L != null && (recyclerView = abstractC1933p0M12244L.f5697r) != null) {
                    iM12261I = recyclerView.m12261I(abstractC1933p0M12244L);
                }
                linkedHashMap.put("action.target.parent.index", Integer.valueOf(iM12261I));
                linkedHashMap.put("action.target.parent.classname", parent.getClass().getCanonicalName());
                View view2 = (View) parent;
                try {
                    strConcat = view2.getResources().getResourceEntryName(view2.getId());
                    if (strConcat == null) {
                        int id2 = view2.getId();
                        AbstractC7966P5.m8254b(16);
                        String string = Integer.toString(id2, 16);
                        AbstractC16544l.m18093f(string, "toString(...)");
                        strConcat = "0x".concat(string);
                    }
                } catch (Resources.NotFoundException unused) {
                    int id3 = view2.getId();
                    AbstractC7966P5.m8254b(16);
                    String string2 = Integer.toString(id3, 16);
                    AbstractC16544l.m18093f(string2, "toString(...)");
                    strConcat = "0x".concat(string2);
                }
                linkedHashMap.put("action.target.parent.resource_id", strConcat);
                return;
            }
            view = parent instanceof View ? (View) parent : null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return C16829a.class.equals(obj != null ? obj.getClass() : null);
    }

    public final int hashCode() {
        return C16829a.class.hashCode();
    }
}
