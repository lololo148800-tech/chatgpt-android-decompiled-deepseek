package p1044uj;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import com.openai.chatgpt.R;
import com.withpersona.sdk2.inquiry.shared.p687ui.Pi2NavigationBar;
import hk.C14524b;
import kotlin.jvm.internal.AbstractC16541i;
import kotlin.jvm.internal.AbstractC16544l;
import p049Bm.InterfaceC1440o;
import p571X9.AbstractC9123E2;

/* JADX INFO: renamed from: uj.k */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C20344k extends AbstractC16541i implements InterfaceC1440o {

    /* JADX INFO: renamed from: Y */
    public static final C20344k f64332Y = new C20344k(3, C14524b.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/withpersona/sdk2/inquiry/shared/databinding/Pi2GenericUiStepScreenBinding;", 0);

    @Override // p049Bm.InterfaceC1440o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LayoutInflater p10 = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        AbstractC16544l.m18094g(p10, "p0");
        View viewInflate = p10.inflate(R.layout.pi2_generic_ui_step_screen, viewGroup, false);
        if (zBooleanValue) {
            viewGroup.addView(viewInflate);
        }
        int i10 = R.id.content_container;
        FrameLayout frameLayout = (FrameLayout) AbstractC9123E2.m9654b(viewInflate, R.id.content_container);
        if (frameLayout != null) {
            i10 = R.id.content_scroll_view;
            NestedScrollView nestedScrollView = (NestedScrollView) AbstractC9123E2.m9654b(viewInflate, R.id.content_scroll_view);
            if (nestedScrollView != null) {
                i10 = R.id.footer_container;
                FrameLayout frameLayout2 = (FrameLayout) AbstractC9123E2.m9654b(viewInflate, R.id.footer_container);
                if (frameLayout2 != null) {
                    i10 = R.id.navigation_bar;
                    Pi2NavigationBar pi2NavigationBar = (Pi2NavigationBar) AbstractC9123E2.m9654b(viewInflate, R.id.navigation_bar);
                    if (pi2NavigationBar != null) {
                        return new C14524b((ConstraintLayout) viewInflate, frameLayout, nestedScrollView, frameLayout2, pi2NavigationBar);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i10)));
    }
}
