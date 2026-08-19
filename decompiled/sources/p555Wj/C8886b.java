package p555Wj;

import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import p396Q4.InterfaceC6571a;

/* JADX INFO: renamed from: Wj.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C8886b implements InterfaceC6571a {

    /* JADX INFO: renamed from: a */
    public final CoordinatorLayout f27195a;

    /* JADX INFO: renamed from: b */
    public final FrameLayout f27196b;

    /* JADX INFO: renamed from: c */
    public final ConstraintLayout f27197c;

    /* JADX INFO: renamed from: d */
    public final Flow f27198d;

    /* JADX INFO: renamed from: e */
    public final TextView f27199e;

    /* JADX INFO: renamed from: f */
    public final Button f27200f;

    /* JADX INFO: renamed from: g */
    public final Button f27201g;

    /* JADX INFO: renamed from: h */
    public final View f27202h;

    /* JADX INFO: renamed from: i */
    public final TextView f27203i;

    public C8886b(View view, Button button, Button button2, FrameLayout frameLayout, TextView textView, TextView textView2, Flow flow, ConstraintLayout constraintLayout, CoordinatorLayout coordinatorLayout) {
        this.f27195a = coordinatorLayout;
        this.f27196b = frameLayout;
        this.f27197c = constraintLayout;
        this.f27198d = flow;
        this.f27199e = textView;
        this.f27200f = button;
        this.f27201g = button2;
        this.f27202h = view;
        this.f27203i = textView2;
    }

    @Override // p396Q4.InterfaceC6571a
    public final View getRoot() {
        return this.f27195a;
    }
}
