package p1156zj;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.openai.chatgpt.R;
import com.withpersona.sdk2.inquiry.governmentid.view.SpotlightView;
import com.withpersona.sdk2.inquiry.shared.p687ui.Pi2NavigationBar;
import com.withpersona.sdk2.inquiry.shared.p687ui.ThemeableLottieAnimationView;
import kotlin.jvm.internal.AbstractC16541i;
import kotlin.jvm.internal.AbstractC16544l;
import p049Bm.InterfaceC1440o;
import p099Dj.C2069g;
import p571X9.AbstractC9123E2;

/* JADX INFO: renamed from: zj.U */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C22125U extends AbstractC16541i implements InterfaceC1440o {

    /* JADX INFO: renamed from: Y */
    public static final C22125U f69940Y = new C22125U(3, C2069g.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/withpersona/sdk2/inquiry/governmentid/databinding/Pi2GovernmentidReviewBinding;", 0);

    @Override // p049Bm.InterfaceC1440o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LayoutInflater p10 = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        AbstractC16544l.m18094g(p10, "p0");
        View viewInflate = p10.inflate(R.layout.pi2_governmentid_review, viewGroup, false);
        if (zBooleanValue) {
            viewGroup.addView(viewInflate);
        }
        int i10 = R.id.accept_button;
        Button button = (Button) AbstractC9123E2.m9654b(viewInflate, R.id.accept_button);
        if (button != null) {
            i10 = R.id.animations_played;
            CheckBox checkBox = (CheckBox) AbstractC9123E2.m9654b(viewInflate, R.id.animations_played);
            if (checkBox != null) {
                i10 = R.id.camera_screen_content;
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) AbstractC9123E2.m9654b(viewInflate, R.id.camera_screen_content);
                if (coordinatorLayout != null) {
                    i10 = R.id.camera_view;
                    ConstraintLayout constraintLayout = (ConstraintLayout) AbstractC9123E2.m9654b(viewInflate, R.id.camera_view);
                    if (constraintLayout != null) {
                        i10 = R.id.disclaimer;
                        TextView textView = (TextView) AbstractC9123E2.m9654b(viewInflate, R.id.disclaimer);
                        if (textView != null) {
                            i10 = R.id.disclaimer_icon;
                            ImageView imageView = (ImageView) AbstractC9123E2.m9654b(viewInflate, R.id.disclaimer_icon);
                            if (imageView != null) {
                                i10 = R.id.disclaimer_view;
                                LinearLayout linearLayout = (LinearLayout) AbstractC9123E2.m9654b(viewInflate, R.id.disclaimer_view);
                                if (linearLayout != null) {
                                    i10 = R.id.flash_screen;
                                    View viewM9654b = AbstractC9123E2.m9654b(viewInflate, R.id.flash_screen);
                                    if (viewM9654b != null) {
                                        i10 = R.id.flow_layout;
                                        Flow flow = (Flow) AbstractC9123E2.m9654b(viewInflate, R.id.flow_layout);
                                        if (flow != null) {
                                            i10 = R.id.navigation_bar;
                                            Pi2NavigationBar pi2NavigationBar = (Pi2NavigationBar) AbstractC9123E2.m9654b(viewInflate, R.id.navigation_bar);
                                            if (pi2NavigationBar != null) {
                                                i10 = R.id.overlay;
                                                View viewM9654b2 = AbstractC9123E2.m9654b(viewInflate, R.id.overlay);
                                                if (viewM9654b2 != null) {
                                                    i10 = R.id.overlay_guide;
                                                    ImageView imageView2 = (ImageView) AbstractC9123E2.m9654b(viewInflate, R.id.overlay_guide);
                                                    if (imageView2 != null) {
                                                        i10 = R.id.overlay_hint;
                                                        ConstraintLayout constraintLayout2 = (ConstraintLayout) AbstractC9123E2.m9654b(viewInflate, R.id.overlay_hint);
                                                        if (constraintLayout2 != null) {
                                                            i10 = R.id.overlay_icon;
                                                            ThemeableLottieAnimationView themeableLottieAnimationView = (ThemeableLottieAnimationView) AbstractC9123E2.m9654b(viewInflate, R.id.overlay_icon);
                                                            if (themeableLottieAnimationView != null) {
                                                                i10 = R.id.overlay_icon_container;
                                                                ConstraintLayout constraintLayout3 = (ConstraintLayout) AbstractC9123E2.m9654b(viewInflate, R.id.overlay_icon_container);
                                                                if (constraintLayout3 != null) {
                                                                    i10 = R.id.overlay_text;
                                                                    TextView textView2 = (TextView) AbstractC9123E2.m9654b(viewInflate, R.id.overlay_text);
                                                                    if (textView2 != null) {
                                                                        i10 = R.id.processing;
                                                                        FrameLayout frameLayout = (FrameLayout) AbstractC9123E2.m9654b(viewInflate, R.id.processing);
                                                                        if (frameLayout != null) {
                                                                            i10 = R.id.progress_bar;
                                                                            ProgressBar progressBar = (ProgressBar) AbstractC9123E2.m9654b(viewInflate, R.id.progress_bar);
                                                                            if (progressBar != null) {
                                                                                i10 = R.id.retry_button;
                                                                                Button button2 = (Button) AbstractC9123E2.m9654b(viewInflate, R.id.retry_button);
                                                                                if (button2 != null) {
                                                                                    i10 = R.id.review_image;
                                                                                    ImageView imageView3 = (ImageView) AbstractC9123E2.m9654b(viewInflate, R.id.review_image);
                                                                                    if (imageView3 != null) {
                                                                                        i10 = R.id.spotlight_view;
                                                                                        SpotlightView spotlightView = (SpotlightView) AbstractC9123E2.m9654b(viewInflate, R.id.spotlight_view);
                                                                                        if (spotlightView != null) {
                                                                                            i10 = R.id.spotlight_view2;
                                                                                            if (((SpotlightView) AbstractC9123E2.m9654b(viewInflate, R.id.spotlight_view2)) != null) {
                                                                                                i10 = R.id.title;
                                                                                                TextView textView3 = (TextView) AbstractC9123E2.m9654b(viewInflate, R.id.title);
                                                                                                if (textView3 != null) {
                                                                                                    return new C2069g((FrameLayout) viewInflate, button, checkBox, coordinatorLayout, constraintLayout, textView, imageView, linearLayout, viewM9654b, flow, pi2NavigationBar, viewM9654b2, imageView2, constraintLayout2, themeableLottieAnimationView, constraintLayout3, textView2, frameLayout, progressBar, button2, imageView3, spotlightView, textView3);
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
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i10)));
    }
}
