package p830ja;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.datepicker.C12049n;
import java.util.WeakHashMap;
import p030B2.AbstractC0738T;
import p862l2.AbstractC16803b;

/* JADX INFO: renamed from: ja.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC16180a extends AbstractC16803b {

    /* JADX INFO: renamed from: a */
    public C12049n f50222a;

    @Override // p862l2.AbstractC16803b
    /* JADX INFO: renamed from: g */
    public boolean mo13567g(CoordinatorLayout coordinatorLayout, View view, int i10) {
        mo13580r(coordinatorLayout, view, i10);
        if (this.f50222a == null) {
            this.f50222a = new C12049n(view);
        }
        C12049n c12049n = this.f50222a;
        View view2 = c12049n.f36588Y;
        c12049n.f36589Z = view2.getTop();
        c12049n.f36590o0 = view2.getLeft();
        C12049n c12049n2 = this.f50222a;
        View view3 = c12049n2.f36588Y;
        int top = 0 - (view3.getTop() - c12049n2.f36589Z);
        WeakHashMap weakHashMap = AbstractC0738T.f2096a;
        view3.offsetTopAndBottom(top);
        view3.offsetLeftAndRight(0 - (view3.getLeft() - c12049n2.f36590o0));
        return true;
    }

    /* JADX INFO: renamed from: r */
    public void mo13580r(CoordinatorLayout coordinatorLayout, View view, int i10) {
        coordinatorLayout.m11378q(view, i10);
    }
}
