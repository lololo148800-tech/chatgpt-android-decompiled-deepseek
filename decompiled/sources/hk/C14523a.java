package hk;

import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import p396Q4.InterfaceC6571a;

/* JADX INFO: renamed from: hk.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C14523a implements InterfaceC6571a {

    /* JADX INFO: renamed from: a */
    public final CoordinatorLayout f45766a;

    /* JADX INFO: renamed from: b */
    public final ConstraintLayout f45767b;

    /* JADX INFO: renamed from: c */
    public final FrameLayout f45768c;

    /* JADX INFO: renamed from: d */
    public final NestedScrollView f45769d;

    /* JADX INFO: renamed from: e */
    public final View f45770e;

    public C14523a(CoordinatorLayout coordinatorLayout, ConstraintLayout constraintLayout, FrameLayout frameLayout, NestedScrollView nestedScrollView, View view) {
        this.f45766a = coordinatorLayout;
        this.f45767b = constraintLayout;
        this.f45768c = frameLayout;
        this.f45769d = nestedScrollView;
        this.f45770e = view;
    }

    @Override // p396Q4.InterfaceC6571a
    public final View getRoot() {
        return this.f45766a;
    }
}
