package p603Yj;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.openai.chatgpt.R;
import com.squareup.workflow1.p685ui.WorkflowViewStub;
import kotlin.jvm.internal.AbstractC16541i;
import kotlin.jvm.internal.AbstractC16544l;
import p049Bm.InterfaceC1440o;
import p571X9.AbstractC9123E2;
import p627Zj.C10401a;

/* JADX INFO: renamed from: Yj.f */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C10073f extends AbstractC16541i implements InterfaceC1440o {

    /* JADX INFO: renamed from: Y */
    public static final C10073f f29825Y = new C10073f(3, C10401a.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/withpersona/sdk2/inquiry/sandbox/databinding/Pi2SandboxOverlayBinding;", 0);

    @Override // p049Bm.InterfaceC1440o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LayoutInflater p10 = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        AbstractC16544l.m18094g(p10, "p0");
        View viewInflate = p10.inflate(R.layout.pi2_sandbox_overlay, viewGroup, false);
        if (zBooleanValue) {
            viewGroup.addView(viewInflate);
        }
        int i10 = R.id.child_stub;
        WorkflowViewStub workflowViewStub = (WorkflowViewStub) AbstractC9123E2.m9654b(viewInflate, R.id.child_stub);
        if (workflowViewStub != null) {
            i10 = R.id.floating_action_button;
            FloatingActionButton floatingActionButton = (FloatingActionButton) AbstractC9123E2.m9654b(viewInflate, R.id.floating_action_button);
            if (floatingActionButton != null) {
                return new C10401a((CoordinatorLayout) viewInflate, workflowViewStub, floatingActionButton);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i10)));
    }
}
