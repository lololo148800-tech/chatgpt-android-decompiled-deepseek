package p647ak;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.openai.chatgpt.R;
import com.withpersona.sdk2.inquiry.shared.p687ui.ThemeableLottieAnimationView;
import kotlin.jvm.internal.AbstractC16541i;
import kotlin.jvm.internal.AbstractC16544l;
import p049Bm.InterfaceC1440o;
import p571X9.AbstractC9123E2;
import p665bk.C11484e;

/* JADX INFO: renamed from: ak.l0 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C10714l0 extends AbstractC16541i implements InterfaceC1440o {

    /* JADX INFO: renamed from: Y */
    public static final C10714l0 f31841Y = new C10714l0(3, C11484e.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/withpersona/sdk2/inquiry/selfie/databinding/Pi2SelfieSubmittingScreenBinding;", 0);

    @Override // p049Bm.InterfaceC1440o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LayoutInflater p10 = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        AbstractC16544l.m18094g(p10, "p0");
        View viewInflate = p10.inflate(R.layout.pi2_selfie_submitting_screen, viewGroup, false);
        if (zBooleanValue) {
            viewGroup.addView(viewInflate);
        }
        int i10 = R.id.pending_animation;
        ThemeableLottieAnimationView themeableLottieAnimationView = (ThemeableLottieAnimationView) AbstractC9123E2.m9654b(viewInflate, R.id.pending_animation);
        if (themeableLottieAnimationView != null) {
            i10 = R.id.pending_animation_container;
            ConstraintLayout constraintLayout = (ConstraintLayout) AbstractC9123E2.m9654b(viewInflate, R.id.pending_animation_container);
            if (constraintLayout != null) {
                i10 = R.id.textview_selfie_submitting_body;
                TextView textView = (TextView) AbstractC9123E2.m9654b(viewInflate, R.id.textview_selfie_submitting_body);
                if (textView != null) {
                    i10 = R.id.textview_selfie_submitting_title;
                    TextView textView2 = (TextView) AbstractC9123E2.m9654b(viewInflate, R.id.textview_selfie_submitting_title);
                    if (textView2 != null) {
                        return new C11484e(textView, textView2, (ConstraintLayout) viewInflate, constraintLayout, themeableLottieAnimationView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i10)));
    }
}
