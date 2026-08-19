package p1156zj;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.button.MaterialButton;
import com.openai.chatgpt.R;
import com.withpersona.sdk2.inquiry.shared.p687ui.Pi2NavigationBar;
import com.withpersona.sdk2.inquiry.shared.p687ui.ThemeableLottieAnimationView;
import kotlin.jvm.internal.AbstractC16541i;
import kotlin.jvm.internal.AbstractC16544l;
import p049Bm.InterfaceC1440o;
import p099Dj.C2066d;
import p571X9.AbstractC9123E2;

/* JADX INFO: renamed from: zj.p */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C22182p extends AbstractC16541i implements InterfaceC1440o {

    /* JADX INFO: renamed from: Y */
    public static final C22182p f70248Y = new C22182p(3, C2066d.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/withpersona/sdk2/inquiry/governmentid/databinding/Pi2GovernmentidChooseCaptureMethodBinding;", 0);

    @Override // p049Bm.InterfaceC1440o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LayoutInflater p10 = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        AbstractC16544l.m18094g(p10, "p0");
        View viewInflate = p10.inflate(R.layout.pi2_governmentid_choose_capture_method, viewGroup, false);
        if (zBooleanValue) {
            viewGroup.addView(viewInflate);
        }
        int i10 = R.id.body;
        TextView textView = (TextView) AbstractC9123E2.m9654b(viewInflate, R.id.body);
        if (textView != null) {
            i10 = R.id.camera_button;
            MaterialButton materialButton = (MaterialButton) AbstractC9123E2.m9654b(viewInflate, R.id.camera_button);
            if (materialButton != null) {
                i10 = R.id.id_image;
                ThemeableLottieAnimationView themeableLottieAnimationView = (ThemeableLottieAnimationView) AbstractC9123E2.m9654b(viewInflate, R.id.id_image);
                if (themeableLottieAnimationView != null) {
                    i10 = R.id.id_image_container;
                    View viewM9654b = AbstractC9123E2.m9654b(viewInflate, R.id.id_image_container);
                    if (viewM9654b != null) {
                        i10 = R.id.image_view_container;
                        ConstraintLayout constraintLayout = (ConstraintLayout) AbstractC9123E2.m9654b(viewInflate, R.id.image_view_container);
                        if (constraintLayout != null) {
                            i10 = R.id.local_image;
                            CardView cardView = (CardView) AbstractC9123E2.m9654b(viewInflate, R.id.local_image);
                            if (cardView != null) {
                                i10 = R.id.navigation_bar;
                                Pi2NavigationBar pi2NavigationBar = (Pi2NavigationBar) AbstractC9123E2.m9654b(viewInflate, R.id.navigation_bar);
                                if (pi2NavigationBar != null) {
                                    i10 = R.id.title;
                                    TextView textView2 = (TextView) AbstractC9123E2.m9654b(viewInflate, R.id.title);
                                    if (textView2 != null) {
                                        i10 = R.id.upload_button;
                                        Button button = (Button) AbstractC9123E2.m9654b(viewInflate, R.id.upload_button);
                                        if (button != null) {
                                            return new C2066d((CoordinatorLayout) viewInflate, textView, materialButton, themeableLottieAnimationView, viewM9654b, constraintLayout, cardView, pi2NavigationBar, textView2, button);
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
