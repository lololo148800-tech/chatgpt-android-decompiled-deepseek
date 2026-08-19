package p1118y2;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.window.SplashScreenView;
import com.openai.chatgpt.MainActivity;
import kotlin.jvm.internal.AbstractC16544l;
import p670c1.AbstractC11557a;
import p843k1.AbstractC16312f;

/* JADX INFO: renamed from: y2.a */
/* JADX INFO: loaded from: classes.dex */
public final class ViewGroupOnHierarchyChangeListenerC21370a implements ViewGroup.OnHierarchyChangeListener {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C21371b f67845Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ MainActivity f67846Z;

    public ViewGroupOnHierarchyChangeListenerC21370a(C21371b c21371b, MainActivity mainActivity) {
        this.f67845Y = c21371b;
        this.f67846Z = mainActivity;
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewAdded(View view, View view2) {
        if (AbstractC11557a.m12951p(view2)) {
            SplashScreenView child = AbstractC11557a.m12942g(view2);
            this.f67845Y.getClass();
            AbstractC16544l.m18094g(child, "child");
            WindowInsets windowInsetsBuild = AbstractC16312f.m17888h().build();
            AbstractC16544l.m18093f(windowInsetsBuild, "Builder().build()");
            Rect rect = new Rect(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
            if (windowInsetsBuild == child.getRootView().computeSystemWindowInsets(windowInsetsBuild, rect)) {
                rect.isEmpty();
            }
            ((ViewGroup) this.f67846Z.getWindow().getDecorView()).setOnHierarchyChangeListener(null);
        }
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewRemoved(View view, View view2) {
    }
}
