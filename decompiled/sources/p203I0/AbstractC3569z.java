package p203I0;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.protobuf.AbstractC12107L1;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: I0.z */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3569z {

    /* JADX INFO: renamed from: a */
    public static final boolean f10811a = AbstractC16544l.m18089b(Build.DEVICE, "layoutlib");

    /* JADX INFO: renamed from: a */
    public static final C3561r m4241a(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if (childAt instanceof C3561r) {
                return (C3561r) childAt;
            }
        }
        C3561r c3561r = new C3561r(viewGroup.getContext());
        viewGroup.addView(c3561r);
        return c3561r;
    }

    /* JADX INFO: renamed from: b */
    public static final ViewGroup m4242b(View view) {
        Object obj = view;
        while (!(obj instanceof ViewGroup)) {
            ViewParent parent = ((View) obj).getParent();
            if (!(parent instanceof View)) {
                throw new IllegalArgumentException(AbstractC12107L1.m13824o(obj, "Couldn't find a valid parent for ", ". Are you overriding LocalView and providing a View that is not attached to the view hierarchy?").toString());
            }
            obj = parent;
        }
        return (ViewGroup) obj;
    }
}
