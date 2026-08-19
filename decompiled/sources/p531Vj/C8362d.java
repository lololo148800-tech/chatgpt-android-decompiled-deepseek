package p531Vj;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.openai.chatgpt.R;
import kotlin.jvm.internal.AbstractC16541i;
import kotlin.jvm.internal.AbstractC16544l;
import p049Bm.InterfaceC1440o;
import p555Wj.C8886b;
import p571X9.AbstractC9123E2;

/* JADX INFO: renamed from: Vj.d */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C8362d extends AbstractC16541i implements InterfaceC1440o {

    /* JADX INFO: renamed from: Y */
    public static final C8362d f26045Y = new C8362d(3, C8886b.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/withpersona/sdk2/inquiry/permissions/databinding/Pi2RequestPermissionRationaleBinding;", 0);

    @Override // p049Bm.InterfaceC1440o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LayoutInflater p10 = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        AbstractC16544l.m18094g(p10, "p0");
        View viewInflate = p10.inflate(R.layout.pi2_request_permission_rationale, viewGroup, false);
        if (zBooleanValue) {
            viewGroup.addView(viewInflate);
        }
        int i10 = R.id.bottom_sheet;
        FrameLayout frameLayout = (FrameLayout) AbstractC9123E2.m9654b(viewInflate, R.id.bottom_sheet);
        if (frameLayout != null) {
            i10 = R.id.bottom_sheet_content;
            ConstraintLayout constraintLayout = (ConstraintLayout) AbstractC9123E2.m9654b(viewInflate, R.id.bottom_sheet_content);
            if (constraintLayout != null) {
                i10 = R.id.flow_layout;
                Flow flow = (Flow) AbstractC9123E2.m9654b(viewInflate, R.id.flow_layout);
                if (flow != null) {
                    i10 = R.id.message;
                    TextView textView = (TextView) AbstractC9123E2.m9654b(viewInflate, R.id.message);
                    if (textView != null) {
                        i10 = R.id.negative_button;
                        Button button = (Button) AbstractC9123E2.m9654b(viewInflate, R.id.negative_button);
                        if (button != null) {
                            i10 = R.id.positive_button;
                            Button button2 = (Button) AbstractC9123E2.m9654b(viewInflate, R.id.positive_button);
                            if (button2 != null) {
                                i10 = R.id.tint_screen;
                                View viewM9654b = AbstractC9123E2.m9654b(viewInflate, R.id.tint_screen);
                                if (viewM9654b != null) {
                                    i10 = R.id.title;
                                    TextView textView2 = (TextView) AbstractC9123E2.m9654b(viewInflate, R.id.title);
                                    if (textView2 != null) {
                                        return new C8886b(viewM9654b, button, button2, frameLayout, textView, textView2, flow, constraintLayout, (CoordinatorLayout) viewInflate);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i10)));
    }
}
