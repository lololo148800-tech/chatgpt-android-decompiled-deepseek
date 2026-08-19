package p594Y9;

import android.text.TextUtils;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16544l;
import p523V9.AbstractC7944N;

/* JADX INFO: renamed from: Y9.D4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9716D4 {
    /* JADX INFO: renamed from: a */
    public static final void m10309a(TextInputLayout textInputLayout) {
        AbstractC16544l.m18094g(textInputLayout, "<this>");
        try {
            Field declaredField = textInputLayout.getClass().getDeclaredField("placeholderTextView");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(textInputLayout);
            TextView textView = obj instanceof TextView ? (TextView) obj : null;
            if (textView != null) {
                textView.setSingleLine(true);
                textView.setMaxLines(1);
                textView.setEllipsize(TextUtils.TruncateAt.END);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m10310b(AbstractC7944N abstractC7944N, Collection collection) {
        collection.getClass();
        if (collection instanceof InterfaceC9992x) {
            collection = ((InterfaceC9992x) collection).m10635a();
        }
        boolean zRemove = false;
        if (!(collection instanceof Set) || collection.size() <= abstractC7944N.size()) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                zRemove |= abstractC7944N.remove(it.next());
            }
            return zRemove;
        }
        Iterator<E> it2 = abstractC7944N.iterator();
        collection.getClass();
        while (it2.hasNext()) {
            if (collection.contains(it2.next())) {
                it2.remove();
                zRemove = true;
            }
        }
        return zRemove;
    }
}
