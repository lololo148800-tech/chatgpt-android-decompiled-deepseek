package p627Zj;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.squareup.workflow1.p685ui.WorkflowViewStub;
import p396Q4.InterfaceC6571a;

/* JADX INFO: renamed from: Zj.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C10401a implements InterfaceC6571a {

    /* JADX INFO: renamed from: a */
    public final CoordinatorLayout f30822a;

    /* JADX INFO: renamed from: b */
    public final WorkflowViewStub f30823b;

    /* JADX INFO: renamed from: c */
    public final FloatingActionButton f30824c;

    public C10401a(CoordinatorLayout coordinatorLayout, WorkflowViewStub workflowViewStub, FloatingActionButton floatingActionButton) {
        this.f30822a = coordinatorLayout;
        this.f30823b = workflowViewStub;
        this.f30824c = floatingActionButton;
    }

    @Override // p396Q4.InterfaceC6571a
    public final View getRoot() {
        return this.f30822a;
    }
}
