package p1065vj;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.withpersona.sdk2.inquiry.shared.p687ui.Pi2NavigationBar;
import p396Q4.InterfaceC6571a;

/* JADX INFO: renamed from: vj.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C20631c implements InterfaceC6571a {

    /* JADX INFO: renamed from: a */
    public final CoordinatorLayout f65478a;

    /* JADX INFO: renamed from: b */
    public final TextView f65479b;

    /* JADX INFO: renamed from: c */
    public final TextView f65480c;

    /* JADX INFO: renamed from: d */
    public final Pi2NavigationBar f65481d;

    /* JADX INFO: renamed from: e */
    public final RecyclerView f65482e;

    /* JADX INFO: renamed from: f */
    public final Button f65483f;

    /* JADX INFO: renamed from: g */
    public final TextView f65484g;

    public C20631c(CoordinatorLayout coordinatorLayout, TextView textView, TextView textView2, Pi2NavigationBar pi2NavigationBar, RecyclerView recyclerView, Button button, TextView textView3) {
        this.f65478a = coordinatorLayout;
        this.f65479b = textView;
        this.f65480c = textView2;
        this.f65481d = pi2NavigationBar;
        this.f65482e = recyclerView;
        this.f65483f = button;
        this.f65484g = textView3;
    }

    @Override // p396Q4.InterfaceC6571a
    public final View getRoot() {
        return this.f65478a;
    }
}
