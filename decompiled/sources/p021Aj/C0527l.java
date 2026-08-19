package p021Aj;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.openai.chatgpt.R;
import com.withpersona.sdk2.inquiry.shared.p687ui.Pi2NavigationBar;
import com.withpersona.sdk2.inquiry.shared.p687ui.ThemeableLottieAnimationView;
import kotlin.jvm.internal.AbstractC16541i;
import kotlin.jvm.internal.AbstractC16544l;
import p049Bm.InterfaceC1440o;
import p099Dj.C2063a;
import p571X9.AbstractC9123E2;

/* JADX INFO: renamed from: Aj.l */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0527l extends AbstractC16541i implements InterfaceC1440o {

    /* JADX INFO: renamed from: Y */
    public static final C0527l f1687Y = new C0527l(3, C2063a.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/withpersona/sdk2/inquiry/governmentid/databinding/Pi2ErrorBinding;", 0);

    @Override // p049Bm.InterfaceC1440o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LayoutInflater p10 = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        AbstractC16544l.m18094g(p10, "p0");
        View viewInflate = p10.inflate(R.layout.pi2_error, viewGroup, false);
        if (zBooleanValue) {
            viewGroup.addView(viewInflate);
        }
        int i10 = R.id.content_view;
        if (((LinearLayout) AbstractC9123E2.m9654b(viewInflate, R.id.content_view)) != null) {
            i10 = R.id.continue_button;
            Button button = (Button) AbstractC9123E2.m9654b(viewInflate, R.id.continue_button);
            if (button != null) {
                i10 = R.id.illustration;
                ThemeableLottieAnimationView themeableLottieAnimationView = (ThemeableLottieAnimationView) AbstractC9123E2.m9654b(viewInflate, R.id.illustration);
                if (themeableLottieAnimationView != null) {
                    i10 = R.id.navigation_bar;
                    Pi2NavigationBar pi2NavigationBar = (Pi2NavigationBar) AbstractC9123E2.m9654b(viewInflate, R.id.navigation_bar);
                    if (pi2NavigationBar != null) {
                        i10 = R.id.title;
                        TextView textView = (TextView) AbstractC9123E2.m9654b(viewInflate, R.id.title);
                        if (textView != null) {
                            return new C2063a((CoordinatorLayout) viewInflate, button, themeableLottieAnimationView, pi2NavigationBar, textView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i10)));
    }
}
