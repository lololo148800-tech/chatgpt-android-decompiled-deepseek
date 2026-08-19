package pk;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import com.openai.chatgpt.R;
import hk.C14523a;
import kotlin.jvm.internal.AbstractC16541i;
import kotlin.jvm.internal.AbstractC16544l;
import p049Bm.InterfaceC1440o;
import p571X9.AbstractC9123E2;

/* JADX INFO: renamed from: pk.f */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C18501f extends AbstractC16541i implements InterfaceC1440o {

    /* JADX INFO: renamed from: Y */
    public static final C18501f f58962Y = new C18501f(3, C14523a.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/withpersona/sdk2/inquiry/shared/databinding/Pi2GenericUiStepBottomSheetBinding;", 0);

    @Override // p049Bm.InterfaceC1440o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LayoutInflater p10 = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        AbstractC16544l.m18094g(p10, "p0");
        View viewInflate = p10.inflate(R.layout.pi2_generic_ui_step_bottom_sheet, viewGroup, false);
        if (zBooleanValue) {
            viewGroup.addView(viewInflate);
        }
        int i10 = R.id.bottom_sheet;
        ConstraintLayout constraintLayout = (ConstraintLayout) AbstractC9123E2.m9654b(viewInflate, R.id.bottom_sheet);
        if (constraintLayout != null) {
            i10 = R.id.content_container;
            FrameLayout frameLayout = (FrameLayout) AbstractC9123E2.m9654b(viewInflate, R.id.content_container);
            if (frameLayout != null) {
                i10 = R.id.content_scroll_view;
                NestedScrollView nestedScrollView = (NestedScrollView) AbstractC9123E2.m9654b(viewInflate, R.id.content_scroll_view);
                if (nestedScrollView != null) {
                    i10 = R.id.tint_screen;
                    View viewM9654b = AbstractC9123E2.m9654b(viewInflate, R.id.tint_screen);
                    if (viewM9654b != null) {
                        return new C14523a((CoordinatorLayout) viewInflate, constraintLayout, frameLayout, nestedScrollView, viewM9654b);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i10)));
    }
}
