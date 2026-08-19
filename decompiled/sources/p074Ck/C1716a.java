package p074Ck;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import com.google.android.material.divider.MaterialDivider;
import com.withpersona.sdk2.inquiry.shared.p687ui.Pi2NavigationBar;
import com.withpersona.sdk2.inquiry.steps.p688ui.view.ShadowedNestedScrollView;
import p396Q4.InterfaceC6571a;

/* JADX INFO: renamed from: Ck.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C1716a implements InterfaceC6571a {

    /* JADX INFO: renamed from: a */
    public final CoordinatorLayout f4906a;

    /* JADX INFO: renamed from: b */
    public final ConstraintLayout f4907b;

    /* JADX INFO: renamed from: c */
    public final FrameLayout f4908c;

    /* JADX INFO: renamed from: d */
    public final MaterialDivider f4909d;

    /* JADX INFO: renamed from: e */
    public final LinearLayout f4910e;

    /* JADX INFO: renamed from: f */
    public final CoordinatorLayout f4911f;

    /* JADX INFO: renamed from: g */
    public final View f4912g;

    /* JADX INFO: renamed from: h */
    public final NestedScrollView f4913h;

    /* JADX INFO: renamed from: i */
    public final Pi2NavigationBar f4914i;

    /* JADX INFO: renamed from: j */
    public final ShadowedNestedScrollView f4915j;

    /* JADX INFO: renamed from: k */
    public final ConstraintLayout f4916k;

    /* JADX INFO: renamed from: l */
    public final FrameLayout f4917l;

    public C1716a(CoordinatorLayout coordinatorLayout, ConstraintLayout constraintLayout, FrameLayout frameLayout, MaterialDivider materialDivider, LinearLayout linearLayout, CoordinatorLayout coordinatorLayout2, View view, NestedScrollView nestedScrollView, Pi2NavigationBar pi2NavigationBar, ShadowedNestedScrollView shadowedNestedScrollView, ConstraintLayout constraintLayout2, FrameLayout frameLayout2) {
        this.f4906a = coordinatorLayout;
        this.f4907b = constraintLayout;
        this.f4908c = frameLayout;
        this.f4909d = materialDivider;
        this.f4910e = linearLayout;
        this.f4911f = coordinatorLayout2;
        this.f4912g = view;
        this.f4913h = nestedScrollView;
        this.f4914i = pi2NavigationBar;
        this.f4915j = shadowedNestedScrollView;
        this.f4916k = constraintLayout2;
        this.f4917l = frameLayout2;
    }

    @Override // p396Q4.InterfaceC6571a
    public final View getRoot() {
        return this.f4906a;
    }
}
