package p647ak;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.openai.chatgpt.R;
import com.withpersona.sdk2.inquiry.shared.p687ui.Pi2NavigationBar;
import com.withpersona.sdk2.inquiry.shared.p687ui.ThemeableLottieAnimationView;
import kotlin.jvm.internal.AbstractC16541i;
import kotlin.jvm.internal.AbstractC16544l;
import p049Bm.InterfaceC1440o;
import p571X9.AbstractC9123E2;
import p665bk.C11482c;

/* JADX INFO: renamed from: ak.K */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C10651K extends AbstractC16541i implements InterfaceC1440o {

    /* JADX INFO: renamed from: Y */
    public static final C10651K f31610Y = new C10651K(3, C11482c.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/withpersona/sdk2/inquiry/selfie/databinding/Pi2SelfieInstructionsBinding;", 0);

    @Override // p049Bm.InterfaceC1440o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LayoutInflater p10 = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        AbstractC16544l.m18094g(p10, "p0");
        View viewInflate = p10.inflate(R.layout.pi2_selfie_instructions, viewGroup, false);
        if (zBooleanValue) {
            viewGroup.addView(viewInflate);
        }
        int i10 = R.id.bottom_guideline;
        if (((Guideline) AbstractC9123E2.m9654b(viewInflate, R.id.bottom_guideline)) != null) {
            i10 = R.id.content_view;
            if (((ConstraintLayout) AbstractC9123E2.m9654b(viewInflate, R.id.content_view)) != null) {
                i10 = R.id.imageview_selfie_header_image;
                ImageView imageView = (ImageView) AbstractC9123E2.m9654b(viewInflate, R.id.imageview_selfie_header_image);
                if (imageView != null) {
                    i10 = R.id.instruction_animation;
                    ThemeableLottieAnimationView themeableLottieAnimationView = (ThemeableLottieAnimationView) AbstractC9123E2.m9654b(viewInflate, R.id.instruction_animation);
                    if (themeableLottieAnimationView != null) {
                        i10 = R.id.left_guideline;
                        if (((Guideline) AbstractC9123E2.m9654b(viewInflate, R.id.left_guideline)) != null) {
                            i10 = R.id.navigation_bar;
                            Pi2NavigationBar pi2NavigationBar = (Pi2NavigationBar) AbstractC9123E2.m9654b(viewInflate, R.id.navigation_bar);
                            if (pi2NavigationBar != null) {
                                i10 = R.id.nested_ui_container;
                                ConstraintLayout constraintLayout = (ConstraintLayout) AbstractC9123E2.m9654b(viewInflate, R.id.nested_ui_container);
                                if (constraintLayout != null) {
                                    i10 = R.id.right_guideline;
                                    if (((Guideline) AbstractC9123E2.m9654b(viewInflate, R.id.right_guideline)) != null) {
                                        i10 = R.id.start_button;
                                        Button button = (Button) AbstractC9123E2.m9654b(viewInflate, R.id.start_button);
                                        if (button != null) {
                                            i10 = R.id.textview_selfie_disclosure;
                                            TextView textView = (TextView) AbstractC9123E2.m9654b(viewInflate, R.id.textview_selfie_disclosure);
                                            if (textView != null) {
                                                i10 = R.id.textview_selfie_start_body;
                                                TextView textView2 = (TextView) AbstractC9123E2.m9654b(viewInflate, R.id.textview_selfie_start_body);
                                                if (textView2 != null) {
                                                    i10 = R.id.textview_selfie_start_title;
                                                    TextView textView3 = (TextView) AbstractC9123E2.m9654b(viewInflate, R.id.textview_selfie_start_title);
                                                    if (textView3 != null) {
                                                        return new C11482c((ScrollView) viewInflate, imageView, themeableLottieAnimationView, pi2NavigationBar, constraintLayout, button, textView, textView2, textView3);
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
