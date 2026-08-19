package hk;

import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import com.withpersona.sdk2.inquiry.shared.p687ui.Pi2NavigationBar;
import p396Q4.InterfaceC6571a;

/* JADX INFO: renamed from: hk.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C14524b implements InterfaceC6571a {

    /* JADX INFO: renamed from: a */
    public final ConstraintLayout f45771a;

    /* JADX INFO: renamed from: b */
    public final FrameLayout f45772b;

    /* JADX INFO: renamed from: c */
    public final NestedScrollView f45773c;

    /* JADX INFO: renamed from: d */
    public final FrameLayout f45774d;

    /* JADX INFO: renamed from: e */
    public final Pi2NavigationBar f45775e;

    public C14524b(ConstraintLayout constraintLayout, FrameLayout frameLayout, NestedScrollView nestedScrollView, FrameLayout frameLayout2, Pi2NavigationBar pi2NavigationBar) {
        this.f45771a = constraintLayout;
        this.f45772b = frameLayout;
        this.f45773c = nestedScrollView;
        this.f45774d = frameLayout2;
        this.f45775e = pi2NavigationBar;
    }

    @Override // p396Q4.InterfaceC6571a
    public final View getRoot() {
        return this.f45771a;
    }
}
