package p433Rj;

import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import p396Q4.InterfaceC6571a;

/* JADX INFO: renamed from: Rj.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C6908a implements InterfaceC6571a {

    /* JADX INFO: renamed from: a */
    public final CoordinatorLayout f22146a;

    /* JADX INFO: renamed from: b */
    public final FrameLayout f22147b;

    /* JADX INFO: renamed from: c */
    public final ConstraintLayout f22148c;

    /* JADX INFO: renamed from: d */
    public final Button f22149d;

    /* JADX INFO: renamed from: e */
    public final Flow f22150e;

    /* JADX INFO: renamed from: f */
    public final TextView f22151f;

    /* JADX INFO: renamed from: g */
    public final TextView f22152g;

    /* JADX INFO: renamed from: h */
    public final Button f22153h;

    /* JADX INFO: renamed from: i */
    public final View f22154i;

    public C6908a(View view, Button button, Button button2, FrameLayout frameLayout, TextView textView, TextView textView2, Flow flow, ConstraintLayout constraintLayout, CoordinatorLayout coordinatorLayout) {
        this.f22146a = coordinatorLayout;
        this.f22147b = frameLayout;
        this.f22148c = constraintLayout;
        this.f22149d = button;
        this.f22150e = flow;
        this.f22151f = textView;
        this.f22152g = textView2;
        this.f22153h = button2;
        this.f22154i = view;
    }

    @Override // p396Q4.InterfaceC6571a
    public final View getRoot() {
        return this.f22146a;
    }
}
