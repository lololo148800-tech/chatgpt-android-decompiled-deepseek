package p1156zj;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.openai.chatgpt.R;
import com.withpersona.sdk2.inquiry.shared.p687ui.ButtonWithLoadingIndicator;
import com.withpersona.sdk2.inquiry.shared.p687ui.Pi2NavigationBar;
import kotlin.jvm.internal.AbstractC16541i;
import kotlin.jvm.internal.AbstractC16544l;
import p049Bm.InterfaceC1440o;
import p099Dj.C2070h;
import p571X9.AbstractC9123E2;

/* JADX INFO: renamed from: zj.e1 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C22151e1 extends AbstractC16541i implements InterfaceC1440o {

    /* JADX INFO: renamed from: Y */
    public static final C22151e1 f70032Y = new C22151e1(3, C2070h.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/withpersona/sdk2/inquiry/governmentid/databinding/Pi2GovernmentidReviewSelectedImageBinding;", 0);

    @Override // p049Bm.InterfaceC1440o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LayoutInflater p10 = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        AbstractC16544l.m18094g(p10, "p0");
        View viewInflate = p10.inflate(R.layout.pi2_governmentid_review_selected_image, viewGroup, false);
        if (zBooleanValue) {
            viewGroup.addView(viewInflate);
        }
        int i10 = R.id.body;
        TextView textView = (TextView) AbstractC9123E2.m9654b(viewInflate, R.id.body);
        if (textView != null) {
            i10 = R.id.choose_new_photo_button;
            Button button = (Button) AbstractC9123E2.m9654b(viewInflate, R.id.choose_new_photo_button);
            if (button != null) {
                i10 = R.id.file_icon;
                ImageView imageView = (ImageView) AbstractC9123E2.m9654b(viewInflate, R.id.file_icon);
                if (imageView != null) {
                    i10 = R.id.file_name_textview;
                    TextView textView2 = (TextView) AbstractC9123E2.m9654b(viewInflate, R.id.file_name_textview);
                    if (textView2 != null) {
                        i10 = R.id.image_view;
                        ImageView imageView2 = (ImageView) AbstractC9123E2.m9654b(viewInflate, R.id.image_view);
                        if (imageView2 != null) {
                            i10 = R.id.image_view_container;
                            if (((CardView) AbstractC9123E2.m9654b(viewInflate, R.id.image_view_container)) != null) {
                                i10 = R.id.navigation_bar;
                                Pi2NavigationBar pi2NavigationBar = (Pi2NavigationBar) AbstractC9123E2.m9654b(viewInflate, R.id.navigation_bar);
                                if (pi2NavigationBar != null) {
                                    i10 = R.id.title;
                                    TextView textView3 = (TextView) AbstractC9123E2.m9654b(viewInflate, R.id.title);
                                    if (textView3 != null) {
                                        i10 = R.id.use_photo_button;
                                        ButtonWithLoadingIndicator buttonWithLoadingIndicator = (ButtonWithLoadingIndicator) AbstractC9123E2.m9654b(viewInflate, R.id.use_photo_button);
                                        if (buttonWithLoadingIndicator != null) {
                                            return new C2070h((ScrollView) viewInflate, textView, button, imageView, textView2, imageView2, pi2NavigationBar, textView3, buttonWithLoadingIndicator);
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
