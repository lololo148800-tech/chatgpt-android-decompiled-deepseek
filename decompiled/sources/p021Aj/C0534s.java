package p021Aj;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.textfield.TextInputLayout;
import com.openai.chatgpt.R;
import com.withpersona.sdk2.inquiry.shared.p687ui.Pi2NavigationBar;
import kotlin.jvm.internal.AbstractC16541i;
import kotlin.jvm.internal.AbstractC16544l;
import p049Bm.InterfaceC1440o;
import p099Dj.C2071i;
import p1053v3.p1054lN.IGDwkYw;
import p571X9.AbstractC9123E2;

/* JADX INFO: renamed from: Aj.s */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0534s extends AbstractC16541i implements InterfaceC1440o {

    /* JADX INFO: renamed from: Y */
    public static final C0534s f1707Y = new C0534s(3, C2071i.class, IGDwkYw.OhFfoQUUCDl, "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/withpersona/sdk2/inquiry/governmentid/databinding/Pi2GovernmentidSelectCountryAndIdClassBinding;", 0);

    @Override // p049Bm.InterfaceC1440o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LayoutInflater p10 = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        AbstractC16544l.m18094g(p10, "p0");
        View viewInflate = p10.inflate(R.layout.pi2_governmentid_select_country_and_id_class, viewGroup, false);
        if (zBooleanValue) {
            viewGroup.addView(viewInflate);
        }
        int i10 = R.id.content_view;
        LinearLayout linearLayout = (LinearLayout) AbstractC9123E2.m9654b(viewInflate, R.id.content_view);
        if (linearLayout != null) {
            i10 = R.id.continue_button;
            Button button = (Button) AbstractC9123E2.m9654b(viewInflate, R.id.continue_button);
            if (button != null) {
                i10 = R.id.country_selector;
                TextInputLayout textInputLayout = (TextInputLayout) AbstractC9123E2.m9654b(viewInflate, R.id.country_selector);
                if (textInputLayout != null) {
                    i10 = R.id.country_selector_text;
                    TextView textView = (TextView) AbstractC9123E2.m9654b(viewInflate, R.id.country_selector_text);
                    if (textView != null) {
                        i10 = R.id.id_class_selector;
                        TextInputLayout textInputLayout2 = (TextInputLayout) AbstractC9123E2.m9654b(viewInflate, R.id.id_class_selector);
                        if (textInputLayout2 != null) {
                            i10 = R.id.id_class_selector_text;
                            TextView textView2 = (TextView) AbstractC9123E2.m9654b(viewInflate, R.id.id_class_selector_text);
                            if (textView2 != null) {
                                i10 = R.id.navigation_bar;
                                Pi2NavigationBar pi2NavigationBar = (Pi2NavigationBar) AbstractC9123E2.m9654b(viewInflate, R.id.navigation_bar);
                                if (pi2NavigationBar != null) {
                                    i10 = R.id.title;
                                    TextView textView3 = (TextView) AbstractC9123E2.m9654b(viewInflate, R.id.title);
                                    if (textView3 != null) {
                                        return new C2071i((CoordinatorLayout) viewInflate, linearLayout, button, textInputLayout, textView, textInputLayout2, textView2, pi2NavigationBar, textView3);
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
