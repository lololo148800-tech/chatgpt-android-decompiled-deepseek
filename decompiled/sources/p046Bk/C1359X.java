package p046Bk;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import com.google.android.material.divider.MaterialDivider;
import com.openai.chatgpt.R;
import com.withpersona.sdk2.inquiry.shared.p687ui.Pi2NavigationBar;
import com.withpersona.sdk2.inquiry.steps.p688ui.view.ShadowedNestedScrollView;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p003A1.C0295v;
import p049Bm.InterfaceC1441p;
import p074Ck.C1716a;
import p544W9.AbstractC8718u;
import p571X9.AbstractC9123E2;
import p769gj.C14183y;

/* JADX INFO: renamed from: Bk.X */
/* JADX INFO: loaded from: classes3.dex */
public final class C1359X extends AbstractC16546n implements InterfaceC1441p {

    /* JADX INFO: renamed from: Y */
    public static final C1359X f3598Y = new C1359X(4);

    @Override // p049Bm.InterfaceC1441p
    /* JADX INFO: renamed from: d */
    public final Object mo985d(Object obj, Object obj2, Object obj3, Object obj4) {
        C1407s0 initialRendering = (C1407s0) obj;
        C14183y initialViewEnvironment = (C14183y) obj2;
        Context context = (Context) obj3;
        ViewGroup viewGroup = (ViewGroup) obj4;
        AbstractC16544l.m18094g(initialRendering, "initialRendering");
        AbstractC16544l.m18094g(initialViewEnvironment, "initialViewEnvironment");
        AbstractC16544l.m18094g(context, "context");
        Context context2 = viewGroup != null ? viewGroup.getContext() : null;
        if (context2 == null) {
            context2 = context;
        }
        View viewInflate = LayoutInflater.from(context2).cloneInContext(context).inflate(R.layout.pi2_inquiry_ui, (ViewGroup) null, false);
        int i10 = R.id.container;
        ConstraintLayout constraintLayout = (ConstraintLayout) AbstractC9123E2.m9654b(viewInflate, R.id.container);
        if (constraintLayout != null) {
            i10 = R.id.footer_container;
            FrameLayout frameLayout = (FrameLayout) AbstractC9123E2.m9654b(viewInflate, R.id.footer_container);
            if (frameLayout != null) {
                i10 = R.id.footer_divider;
                MaterialDivider materialDivider = (MaterialDivider) AbstractC9123E2.m9654b(viewInflate, R.id.footer_divider);
                if (materialDivider != null) {
                    i10 = R.id.footer_sheet;
                    LinearLayout linearLayout = (LinearLayout) AbstractC9123E2.m9654b(viewInflate, R.id.footer_sheet);
                    if (linearLayout != null) {
                        i10 = R.id.footer_sheet_coordinator_layout;
                        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) AbstractC9123E2.m9654b(viewInflate, R.id.footer_sheet_coordinator_layout);
                        if (coordinatorLayout != null) {
                            i10 = R.id.footer_sheet_grabber;
                            View viewM9654b = AbstractC9123E2.m9654b(viewInflate, R.id.footer_sheet_grabber);
                            if (viewM9654b != null) {
                                i10 = R.id.footer_sheet_scroll_view;
                                NestedScrollView nestedScrollView = (NestedScrollView) AbstractC9123E2.m9654b(viewInflate, R.id.footer_sheet_scroll_view);
                                if (nestedScrollView != null) {
                                    i10 = R.id.navigation_bar;
                                    Pi2NavigationBar pi2NavigationBar = (Pi2NavigationBar) AbstractC9123E2.m9654b(viewInflate, R.id.navigation_bar);
                                    if (pi2NavigationBar != null) {
                                        i10 = R.id.nestedScroll;
                                        ShadowedNestedScrollView shadowedNestedScrollView = (ShadowedNestedScrollView) AbstractC9123E2.m9654b(viewInflate, R.id.nestedScroll);
                                        if (shadowedNestedScrollView != null) {
                                            i10 = R.id.root_layout;
                                            ConstraintLayout constraintLayout2 = (ConstraintLayout) AbstractC9123E2.m9654b(viewInflate, R.id.root_layout);
                                            if (constraintLayout2 != null) {
                                                i10 = R.id.ui_step_container;
                                                FrameLayout frameLayout2 = (FrameLayout) AbstractC9123E2.m9654b(viewInflate, R.id.ui_step_container);
                                                if (frameLayout2 != null) {
                                                    CoordinatorLayout coordinatorLayout2 = (CoordinatorLayout) viewInflate;
                                                    C1716a c1716a = new C1716a(coordinatorLayout2, constraintLayout, frameLayout, materialDivider, linearLayout, coordinatorLayout, viewM9654b, nestedScrollView, pi2NavigationBar, shadowedNestedScrollView, constraintLayout2, frameLayout2);
                                                    AbstractC16544l.m18093f(coordinatorLayout2, "getRoot(...)");
                                                    AbstractC8718u.m9432a(coordinatorLayout2, initialRendering, initialViewEnvironment, new C0295v(2, new C1375d0(c1716a, initialRendering), C1375d0.class, "showRendering", "showRendering(Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Screen$EntryScreen;Lcom/squareup/workflow1/ui/ViewEnvironment;)V", 0, 1));
                                                    return coordinatorLayout2;
                                                }
                                            }
                                        }
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
