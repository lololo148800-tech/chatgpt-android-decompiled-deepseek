package p408Qj;

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
import p433Rj.C6908a;
import p571X9.AbstractC9123E2;

/* JADX INFO: renamed from: Qj.d */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C6738d extends AbstractC16541i implements InterfaceC1440o {

    /* JADX INFO: renamed from: Y */
    public static final C6738d f21632Y = new C6738d(3, C6908a.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/withpersona/sdk2/inquiry/modal/databinding/Pi2CancelModalBinding;", 0);

    @Override // p049Bm.InterfaceC1440o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LayoutInflater p10 = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        AbstractC16544l.m18094g(p10, "p0");
        View viewInflate = p10.inflate(R.layout.pi2_cancel_modal, viewGroup, false);
        if (zBooleanValue) {
            viewGroup.addView(viewInflate);
        }
        int i10 = R.id.bottom_sheet;
        FrameLayout frameLayout = (FrameLayout) AbstractC9123E2.m9654b(viewInflate, R.id.bottom_sheet);
        if (frameLayout != null) {
            i10 = R.id.bottom_sheet_content;
            ConstraintLayout constraintLayout = (ConstraintLayout) AbstractC9123E2.m9654b(viewInflate, R.id.bottom_sheet_content);
            if (constraintLayout != null) {
                i10 = R.id.close_button;
                Button button = (Button) AbstractC9123E2.m9654b(viewInflate, R.id.close_button);
                if (button != null) {
                    i10 = R.id.flow_layout;
                    Flow flow = (Flow) AbstractC9123E2.m9654b(viewInflate, R.id.flow_layout);
                    if (flow != null) {
                        i10 = R.id.hintMessage;
                        TextView textView = (TextView) AbstractC9123E2.m9654b(viewInflate, R.id.hintMessage);
                        if (textView != null) {
                            i10 = R.id.hintTitle;
                            TextView textView2 = (TextView) AbstractC9123E2.m9654b(viewInflate, R.id.hintTitle);
                            if (textView2 != null) {
                                i10 = R.id.retry_button;
                                Button button2 = (Button) AbstractC9123E2.m9654b(viewInflate, R.id.retry_button);
                                if (button2 != null) {
                                    i10 = R.id.tint_screen;
                                    View viewM9654b = AbstractC9123E2.m9654b(viewInflate, R.id.tint_screen);
                                    if (viewM9654b != null) {
                                        return new C6908a(viewM9654b, button, button2, frameLayout, textView, textView2, flow, constraintLayout, (CoordinatorLayout) viewInflate);
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
