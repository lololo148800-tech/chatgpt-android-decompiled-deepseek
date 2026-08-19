package p099Dj;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.withpersona.sdk2.inquiry.shared.p687ui.Pi2NavigationBar;
import p396Q4.InterfaceC6571a;

/* JADX INFO: renamed from: Dj.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C2068f implements InterfaceC6571a {

    /* JADX INFO: renamed from: a */
    public final CoordinatorLayout f6342a;

    /* JADX INFO: renamed from: b */
    public final ConstraintLayout f6343b;

    /* JADX INFO: renamed from: c */
    public final ImageView f6344c;

    /* JADX INFO: renamed from: d */
    public final View f6345d;

    /* JADX INFO: renamed from: e */
    public final Pi2NavigationBar f6346e;

    /* JADX INFO: renamed from: f */
    public final RecyclerView f6347f;

    /* JADX INFO: renamed from: g */
    public final TextView f6348g;

    /* JADX INFO: renamed from: h */
    public final TextView f6349h;

    /* JADX INFO: renamed from: i */
    public final TextView f6350i;

    /* JADX INFO: renamed from: j */
    public final TextView f6351j;

    public C2068f(CoordinatorLayout coordinatorLayout, ConstraintLayout constraintLayout, ImageView imageView, View view, Pi2NavigationBar pi2NavigationBar, RecyclerView recyclerView, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.f6342a = coordinatorLayout;
        this.f6343b = constraintLayout;
        this.f6344c = imageView;
        this.f6345d = view;
        this.f6346e = pi2NavigationBar;
        this.f6347f = recyclerView;
        this.f6348g = textView;
        this.f6349h = textView2;
        this.f6350i = textView3;
        this.f6351j = textView4;
    }

    @Override // p396Q4.InterfaceC6571a
    public final View getRoot() {
        return this.f6342a;
    }
}
